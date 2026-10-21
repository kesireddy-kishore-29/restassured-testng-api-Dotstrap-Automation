package com.qaautomation.tools.healing;

import com.fasterxml.jackson.databind.JsonNode;
import com.qaautomation.tools.Command;
import com.qaautomation.tools.ai.AnthropicProvider;
import com.qaautomation.tools.shared.Args;
import com.qaautomation.tools.shared.Json;
import com.qaautomation.tools.shared.RunDirs;
import com.qaautomation.tools.triage.Category;
import com.qaautomation.tools.triage.SchemaDiff;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * {@code qa-tools heal [--run <dir>] [--max-prs 3] [--open-prs]}: for each healable failure,
 * propose a patch (rules first, optional model second), refuse it if a guardrail objects, otherwise
 * apply it on {@code heal/<category>/<test>-<date>}, verify it (lint + compile, the failing test 3
 * times, the suite), commit, write the PR body and record it in healing-log.json. Failures whose
 * fixes are identical share one branch, and the fix must turn each of them green. Never merges,
 * never pushes on its own; {@code --open-prs} asks {@code gh} to open the PR.
 */
public final class HealCommand implements Command {

  static final int MAX_ATTEMPTS_PER_FAILURE = 2;

  @Override
  public String name() {
    return "heal";
  }

  @Override
  public String summary() {
    return "propose guarded, verified fixes on heal/* branches (never auto-merged)";
  }

  /** A healable failure with the fix proposed for it. */
  private record Candidate(Path triageFile, JsonNode triage, Patch patch, Instant started) {
    String testId() {
      return triage.path("testId").asText();
    }

    String slug() {
      return triageFile.getFileName().toString().replace(".json", "");
    }
  }

  /** Failures whose proposed fixes are identical share one branch and one pull request. */
  static String fingerprint(Patch patch) {
    StringBuilder key = new StringBuilder(patch.category().name());
    patch.changes().stream()
        .sorted(java.util.Comparator.comparing(FileChange::path))
        .forEach(c -> key.append('\n').append(c.path()).append('\n').append(c.after()));
    return key.toString();
  }

  @Override
  public int run(String[] argv, PrintStream out) {
    Args args = Args.parse(argv);
    Path repoRoot = Path.of(args.get("repo", ".")).toAbsolutePath().normalize();
    Path runDir = RunDirs.resolve(args).toAbsolutePath();
    int maxPrs = Integer.parseInt(args.get("max-prs", "3"));
    ProcessRunner runner = new ProcessRunner(repoRoot);
    Git git = new Git(runner);
    Guardrails guardrails = new Guardrails();
    RuleBasedHealer rules = new RuleBasedHealer(repoRoot);
    AiHealer ai = new AiHealer(AnthropicProvider.fromEnvironment(System.getenv()), repoRoot);
    Verifier verifier = new Verifier(runner, args.get("maven", Verifier.defaultMaven()));
    Path logFile = repoRoot.resolve("healing-log.json");
    String today = LocalDate.now().toString();
    String startBranch = git.currentBranch();
    if (!git.isClean()) {
      out.println("Working tree is not clean; refusing to create heal branches.");
      return 2;
    }
    List<Map<String, Object>> summary = new ArrayList<>();

    // 1. Propose a fix for every healable failure (rules first, the model second).
    Map<String, List<Candidate>> groups = new LinkedHashMap<>();
    for (Path triageFile : triageFiles(runDir)) {
      JsonNode triage = Json.read(triageFile);
      Category category = Category.valueOf(triage.path("category").asText());
      String testId = triage.path("testId").asText();
      if (!category.healable()) {
        continue;
      }
      if (HealingLog.read(logFile).attemptsToday(testId, today) >= MAX_ATTEMPTS_PER_FAILURE) {
        out.println("Attempt budget used for " + testId);
        continue;
      }
      Instant started = Instant.now();
      SchemaDiff diff =
          triage.hasNonNull("schemaDiff")
              ? Json.mapper().convertValue(triage.get("schemaDiff"), SchemaDiff.class)
              : null;
      Optional<Patch> patch = rules.propose(category, testId, diff);
      if (patch.isEmpty()) {
        patch = ai.propose(category, testId, triage, candidateFiles(repoRoot));
      }
      if (patch.isEmpty()) {
        out.println("No proposal for " + testId + " (rules: none; AI: " + ai.status() + ")");
        summary.add(Map.of("testId", testId, "outcome", "no-proposal", "aiStep", ai.status()));
        continue;
      }
      groups
          .computeIfAbsent(fingerprint(patch.get()), k -> new ArrayList<>())
          .add(new Candidate(triageFile, triage, patch.get(), started));
    }

    // 2. One guarded, verified branch per distinct fix.
    int opened = 0;
    for (List<Candidate> group : groups.values()) {
      Candidate lead = group.getFirst();
      List<Candidate> others = group.subList(1, group.size());
      if (opened >= maxPrs) {
        out.println("PR budget (" + maxPrs + ") reached; stopping.");
        break;
      }
      Patch patch = lead.patch();
      Category category = patch.category();
      Path healDir = runDir.resolve("healing").resolve(lead.slug());
      List<GuardrailViolation> violations = guardrails.check(patch);
      Map<String, String> guardResult = guardrailSummary(violations);
      if (!violations.isEmpty()) {
        out.println("Guardrails refused the patch for " + lead.testId() + ": " + violations);
        record(
            logFile,
            runDir,
            entry(
                today,
                lead.triage(),
                "",
                "",
                patch,
                "rejected-by-guardrails",
                lead.started(),
                guardResult,
                Map.of()));
        continue;
      }
      String branch =
          "heal/"
              + category.name().toLowerCase(Locale.ROOT).replace('_', '-')
              + "/"
              + lead.slug()
              + "-"
              + LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
      git.createBranch(branch);
      // Whatever happens below, the repository ends on the branch it started on.
      try {
        write(repoRoot, patch);
        String suite = lead.triage().path("suite").asText("regression");
        List<Verifier.Step> steps = new ArrayList<>(verifier.verify(lead.testId(), suite));
        // The same fix must also turn every other failure it claims to explain green.
        for (Candidate other : others) {
          if (steps.stream().allMatch(Verifier.Step::passed)) {
            steps.add(verifier.rerun(other.testId()));
          }
        }
        boolean verified = steps.stream().allMatch(Verifier.Step::passed);
        Map<String, Object> verification = new LinkedHashMap<>();
        verification.put("runs", 3);
        verification.put(
            "passed",
            steps.stream().filter(s -> s.passed() && s.name().startsWith("failing test")).count());
        verification.put(
            "suite",
            steps.stream().anyMatch(s -> s.passed() && s.name().startsWith("surrounding")));
        verification.put(
            "alsoExplained",
            steps.stream()
                .filter(s -> s.passed() && s.name().startsWith("also explained"))
                .count());
        String rootCause = lead.triage().path("reason").asText();
        List<String> alsoExplains = others.stream().map(Candidate::testId).toList();
        String body =
            PullRequestBody.render(
                patch,
                rootCause,
                "`"
                    + lead.triage().path("evidence").path("bundleZip").asText()
                    + "` (run `"
                    + lead.triage().path("runId").asText()
                    + "`)",
                violations,
                steps,
                category.needsHumanDecision(),
                alsoExplains);
        writeText(healDir.resolve("PR.md"), body);
        Json.write(healDir.resolve("patch.json"), patch);
        writeText(healDir.resolve("patch.diff"), unifiedDiff(patch));
        if (!verified) {
          git.discardChanges();
          git.switchTo(startBranch);
          git.deleteBranch(branch);
          out.println("Verification failed for " + lead.testId() + "; branch discarded");
          record(
              logFile,
              runDir,
              entry(
                  today,
                  lead.triage(),
                  branch,
                  "",
                  patch,
                  "failed-verification",
                  lead.started(),
                  guardResult,
                  verification));
          continue;
        }
        HealingLog.Entry entry =
            entry(
                today,
                lead.triage(),
                branch,
                "(local branch; PR body at "
                    + runDir.relativize(healDir.resolve("PR.md")).toString().replace('\\', '/')
                    + ")",
                patch,
                "proposed",
                lead.started(),
                guardResult,
                verification);
        Json.write(logFile, HealingLog.read(logFile).plus(entry));
        git.commitAll(
            commitMessage(
                category, lead.slug(), rootCause, others.size(), suite, patch.provider()));
        String prUrl = args.flag("open-prs") ? openPullRequest(runner, branch, body, category) : "";
        git.switchTo(startBranch);
        Json.write(
            runDir.resolve("healing").resolve("healing-log.json"),
            HealingLog.read(logFile).plus(entry));
        opened++;
        out.println(
            "Proposed "
                + branch
                + (others.isEmpty() ? "" : " (also explains " + others.size() + " other failures)")
                + (prUrl.isEmpty() ? "" : " -> " + prUrl));
        summary.add(Map.of("testId", lead.testId(), "outcome", "proposed", "branch", branch));
        others.forEach(
            o ->
                summary.add(
                    Map.of("testId", o.testId(), "outcome", "same-fix-as", "branch", branch)));
      } catch (RuntimeException e) {
        abandon(git, startBranch, branch);
        out.println("Heal of " + lead.testId() + " stopped by an error; branch discarded: " + e);
        summary.add(Map.of("testId", lead.testId(), "outcome", "error"));
      }
    }
    Json.write(
        runDir.resolve("healing").resolve("healing-summary.json"),
        Map.of("aiStep", ai.status(), "results", summary));
    return 0;
  }

  /** The heal commit message, within the commit rules: header and every line at most 100. */
  static String commitMessage(
      Category category, String slug, String reason, int others, String suite, String provider) {
    String header =
        "fix(heal): " + category.name().toLowerCase(Locale.ROOT).replace('_', ' ') + " in " + slug;
    List<String> lines = new ArrayList<>();
    lines.add(header.substring(0, Math.min(100, header.length())));
    lines.add("");
    lines.addAll(wrap(reason, 72));
    if (others > 0) {
      lines.add("");
      lines.addAll(wrap("The same fix explains " + others + " other failing test(s).", 72));
    }
    lines.add("");
    lines.addAll(
        wrap(
            "Proposed by "
                + provider
                + "; guardrails passed; failing test passed 3/3 and suite '"
                + suite
                + "' passed. Needs human review; never auto-merged.",
            72));
    lines.add("");
    lines.add("Healed-By: " + provider);
    return String.join("\n", lines);
  }

  /** Words joined into lines of at most {@code width} characters; a longer word is cut. */
  static List<String> wrap(String text, int width) {
    List<String> lines = new ArrayList<>();
    StringBuilder line = new StringBuilder();
    for (String word : text.strip().split("\\s+")) {
      for (String piece = word;
          !piece.isEmpty();
          piece = piece.substring(Math.min(width, piece.length()))) {
        String chunk = piece.substring(0, Math.min(width, piece.length()));
        if (!line.isEmpty() && line.length() + 1 + chunk.length() > width) {
          lines.add(line.toString());
          line = new StringBuilder(chunk);
        } else {
          line.append(line.isEmpty() ? "" : " ").append(chunk);
        }
      }
    }
    if (!line.isEmpty()) {
      lines.add(line.toString());
    }
    return lines;
  }

  /** Best effort: each step runs even if the one before it failed. */
  private static void abandon(Git git, String startBranch, String branch) {
    // Safe: the heal starts only from a clean tree, so nothing but the patch is discarded.
    List<Runnable> steps =
        List.of(git::resetHard, () -> git.switchTo(startBranch), () -> git.deleteBranch(branch));
    for (Runnable step : steps) {
      try {
        step.run();
      } catch (RuntimeException ignored) {
        // Keep going: the next step may still restore the start branch.
      }
    }
  }

  private static HealingLog.Entry entry(
      String today,
      JsonNode triage,
      String branch,
      String pr,
      Patch patch,
      String outcome,
      Instant started,
      Map<String, String> guardrails,
      Map<String, Object> verification) {
    return new HealingLog.Entry(
        today,
        triage.path("runId").asText(),
        triage.path("testId").asText(),
        triage.path("category").asText(),
        triage.path("reason").asText(),
        branch,
        pr,
        patch.provider(),
        outcome,
        Math.max(1, Duration.between(started, Instant.now()).toMinutes()),
        guardrails,
        verification);
  }

  private static void record(Path logFile, Path runDir, HealingLog.Entry entry) {
    Json.write(
        runDir
            .resolve("healing")
            .resolve("rejected-" + Math.abs(entry.testId().hashCode()) + ".json"),
        entry);
  }

  private static Map<String, String> guardrailSummary(List<GuardrailViolation> violations) {
    Map<String, String> result = new LinkedHashMap<>();
    result.put(
        "paths", violations.stream().anyMatch(v -> v.rule().contains("path")) ? "fail" : "pass");
    result.put(
        "patterns",
        violations.stream()
                .anyMatch(
                    v ->
                        !v.rule().contains("path")
                            && !v.rule().contains("removed")
                            && !v.rule().contains("loosened"))
            ? "fail"
            : "pass");
    result.put(
        "loosening",
        violations.stream()
                .anyMatch(v -> v.rule().contains("removed") || v.rule().contains("loosened"))
            ? "fail"
            : "pass");
    return result;
  }

  private static List<Path> triageFiles(Path runDir) {
    Path dir = runDir.resolve("triage");
    if (!Files.isDirectory(dir)) {
      return List.of();
    }
    try (Stream<Path> files = Files.list(dir)) {
      return files.filter(f -> f.toString().endsWith(".json")).sorted().toList();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  /** Files the model may see and change: the allowed paths only. */
  private static List<String> candidateFiles(Path repoRoot) {
    List<String> files = new ArrayList<>();
    for (String dir : List.of("framework/src/main/java", "framework/src/main/resources/schemas")) {
      try (Stream<Path> all = Files.walk(repoRoot.resolve(dir))) {
        all.filter(Files::isRegularFile)
            .map(p -> repoRoot.relativize(p).toString().replace('\\', '/'))
            .filter(
                p ->
                    p.matches(".*/(clients|data|auth|config)/.*\\.java$")
                        || p.endsWith(".schema.json"))
            .forEach(files::add);
      } catch (IOException e) {
        throw new UncheckedIOException(e);
      }
    }
    return files;
  }

  private static void write(Path repoRoot, Patch patch) {
    for (FileChange change : patch.changes()) {
      writeText(repoRoot.resolve(change.path()), change.after());
    }
  }

  static String unifiedDiff(Patch patch) {
    StringBuilder out = new StringBuilder();
    for (FileChange change : patch.changes()) {
      List<String> before = change.before().lines().toList();
      List<String> after = change.after().lines().toList();
      com.github.difflib.patch.Patch<String> diff =
          com.github.difflib.DiffUtils.diff(before, after);
      com.github.difflib.UnifiedDiffUtils.generateUnifiedDiff(
              "a/" + change.path(), "b/" + change.path(), before, diff, 2)
          .forEach(line -> out.append(line).append('\n'));
    }
    return out.toString();
  }

  private static String openPullRequest(
      ProcessRunner runner, String branch, String body, Category category) {
    ProcessRunner.Result push =
        runner.run(List.of("git", "push", "-u", "origin", branch), Duration.ofMinutes(2));
    if (!push.ok()) {
      return "(push failed: " + push.tail() + ")";
    }
    List<String> command =
        new ArrayList<>(
            List.of(
                "gh",
                "pr",
                "create",
                "--head",
                branch,
                "--title",
                "Self-healed: " + category + " (" + branch + ")",
                "--body",
                body,
                "--label",
                "self-healed"));
    if (category.needsHumanDecision()) {
      command.addAll(List.of("--label", "needs-contract-decision"));
    }
    ProcessRunner.Result pr = runner.run(command, Duration.ofMinutes(2));
    return pr.ok() ? pr.tail().strip() : "(gh pr create failed: " + pr.tail() + ")";
  }

  private static void writeText(Path file, String text) {
    try {
      Files.createDirectories(file.getParent());
      Files.writeString(file, text, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
