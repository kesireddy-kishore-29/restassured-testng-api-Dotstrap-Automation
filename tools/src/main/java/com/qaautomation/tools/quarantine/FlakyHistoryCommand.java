package com.qaautomation.tools.quarantine;

import com.fasterxml.jackson.databind.JsonNode;
import com.qaautomation.tools.Command;
import com.qaautomation.tools.shared.Args;
import com.qaautomation.tools.shared.Json;
import com.qaautomation.tools.shared.RunDirs;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * {@code qa-tools flaky-history [--run <dir>] [--propose]}: appends the run's flaky tests to
 * flaky-history.json; with {@code --propose}, a test flaky 3+ times in 14 days and not yet
 * quarantined is added to quarantine.json (owner, 14-day expiry) and tagged in its source, ready
 * for a pull request. The owner is {@code --owner} or, in GitHub Actions, the repository owner.
 */
public final class FlakyHistoryCommand implements Command {

  static final int THRESHOLD = 3;
  static final int WINDOW_DAYS = 14;

  @Override
  public String name() {
    return "flaky-history";
  }

  @Override
  public String summary() {
    return "record flaky tests; --propose quarantines those flaky 3+ times in 14 days";
  }

  @Override
  public int run(String[] argv, PrintStream out) {
    Args args = Args.parse(argv);
    LocalDate today = args.get("today").map(LocalDate::parse).orElse(LocalDate.now());
    Path historyFile = Path.of(args.get("history", "flaky-history.json"));
    FlakyHistory history = FlakyHistory.read(historyFile);
    if (!args.flag("propose-only")) {
      Path runDir = RunDirs.resolve(args);
      JsonNode report = Json.read(runDir.resolve("flaky-report.json"));
      List<FlakyHistory.Occurrence> added = new ArrayList<>();
      for (JsonNode f : report.path("flaky")) {
        added.add(
            new FlakyHistory.Occurrence(
                today.toString(),
                report.path("runId").asText(),
                f.path("testId").asText(),
                f.path("title").asText()));
      }
      history = history.record(added, today);
      Json.write(historyFile, history);
      out.println("Recorded " + added.size() + " flaky test(s) from " + runDir.getFileName());
    }
    if (!args.flag("propose") && !args.flag("propose-only")) {
      return 0;
    }
    Path quarantineFile = Path.of(args.get("quarantine", "quarantine.json"));
    QuarantineFile quarantine = QuarantineFile.read(quarantineFile);
    Path sources = Path.of(args.get("sources", "tests/src/test/java"));
    List<QuarantineEntry> proposals = new ArrayList<>();
    for (Map.Entry<String, Integer> e : history.countsSince(today, WINDOW_DAYS).entrySet()) {
      String testId = e.getKey();
      boolean already =
          quarantine.entriesOrEmpty().stream().anyMatch(q -> testId.equals(q.testId()));
      if (e.getValue() >= THRESHOLD && !already) {
        Optional<String> owner =
            owner(args.get("owner"), Optional.ofNullable(System.getenv("GITHUB_REPOSITORY_OWNER")));
        if (owner.isEmpty()) {
          out.println(
              "flaky-history: --owner is required to propose a quarantine"
                  + " (in GitHub Actions it defaults to the repository owner)");
          return 2;
        }
        tagInSource(sources, testId);
        proposals.add(
            new QuarantineEntry(
                testId,
                testId.substring(testId.indexOf('#') + 1),
                owner.get(),
                "Flaky " + e.getValue() + " times in " + WINDOW_DAYS + " days (auto-proposed)",
                today.plusDays(WINDOW_DAYS).toString(),
                ""));
      }
    }
    if (!proposals.isEmpty()) {
      Json.write(quarantineFile, quarantine.plus(proposals));
    }
    out.println("Quarantine proposals: " + proposals.size());
    proposals.forEach(p -> out.println("  + " + p.testId() + " (" + p.reason() + ")"));
    return 0;
  }

  /**
   * The owner of a proposed quarantine: {@code --owner}, else the repository owner GitHub Actions
   * provides ({@code GITHUB_REPOSITORY_OWNER}), else none. No person is ever assumed.
   */
  static Optional<String> owner(Optional<String> explicit, Optional<String> repositoryOwner) {
    if (explicit.filter(o -> !o.isBlank()).isPresent()) {
      return explicit;
    }
    return repositoryOwner.filter(o -> !o.isBlank()).map(o -> o.startsWith("@") ? o : "@" + o);
  }

  private static void tagInSource(Path sources, String testId) {
    String className = testId.substring(0, testId.indexOf('#'));
    String method = testId.substring(testId.indexOf('#') + 1).replaceAll("\\[.*$", "");
    Path file = sources.resolve(className.replace('.', '/') + ".java");
    if (!Files.exists(file)) {
      try (Stream<Path> all = Files.walk(sources)) {
        file =
            all.filter(
                    p ->
                        p.getFileName()
                            .toString()
                            .equals(className.substring(className.lastIndexOf('.') + 1) + ".java"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("No source for " + className));
      } catch (IOException e) {
        throw new UncheckedIOException(e);
      }
    }
    try {
      String source = Files.readString(file, StandardCharsets.UTF_8);
      Files.writeString(
          file, QuarantineProposer.addQuarantineGroup(source, method), StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
