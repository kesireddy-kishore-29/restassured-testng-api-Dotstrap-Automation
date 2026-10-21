package com.kishore.qa.tools.triage;

import com.fasterxml.jackson.databind.JsonNode;
import com.kishore.qa.tools.Command;
import com.kishore.qa.tools.ai.AnthropicProvider;
import com.kishore.qa.tools.model.RunSummary;
import com.kishore.qa.tools.model.TestResult;
import com.kishore.qa.tools.shared.Args;
import com.kishore.qa.tools.shared.Json;
import com.kishore.qa.tools.shared.RunDirs;
import com.kishore.qa.tools.shared.Zip;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/**
 * {@code qa-tools triage [--run <dir>]}: classifies every failed test of a run, writes
 * triage/&lt;slug&gt;.json and triage-summary.json, and adds triage.json + failure-report.md to
 * each failure bundle (re-zipped).
 */
public final class TriageCommand implements Command {

  private final RuleBasedClassifier rules = new RuleBasedClassifier();

  @Override
  public String name() {
    return "triage";
  }

  @Override
  public String summary() {
    return "classify the failures of a run (rules first, optional LLM for UNKNOWN)";
  }

  @Override
  public int run(String[] argv, PrintStream out) {
    Args args = Args.parse(argv);
    Path runDir = RunDirs.resolve(args);
    RunSummary summary = RunSummary.read(runDir);
    AiTriage ai = new AiTriage(AnthropicProvider.fromEnvironment(System.getenv()));
    String gitDiff = gitDiffStat();
    Path schemas = Path.of(args.get("schemas", "framework/src/main/resources/schemas"));
    Map<Category, Integer> counts = new EnumMap<>(Category.class);
    List<TriageRecord> records = new ArrayList<>();
    for (TestResult test : summary.failed()) {
      TriageRecord record = triage(runDir, summary, test, ai, gitDiff, schemas);
      records.add(record);
      counts.merge(record.category(), 1, Integer::sum);
      Json.write(runDir.resolve("triage").resolve(test.slug() + ".json"), record);
      Path bundle = runDir.resolve("failure-bundles").resolve(test.slug());
      if (Files.isDirectory(bundle)) {
        Json.write(bundle.resolve("triage.json"), record);
        writeText(bundle.resolve("failure-report.md"), FailureReport.render(record));
        Zip.folder(bundle, bundle.resolveSibling(test.slug() + ".zip"));
      }
      out.printf("%-15s %s%n", record.category(), test.id());
    }
    Map<String, Object> totals = new LinkedHashMap<>();
    totals.put("schemaVersion", 1);
    totals.put("repo", summary.repo());
    totals.put("runId", summary.runId());
    totals.put("failed", records.size());
    Map<String, Integer> byCategory = new LinkedHashMap<>();
    for (Category c : Category.values()) {
      byCategory.put(c.name(), counts.getOrDefault(c, 0));
    }
    totals.put("byCategory", byCategory);
    totals.put("aiStep", ai.status());
    Json.write(runDir.resolve("triage-summary.json"), totals);
    out.println(
        "Triaged " + records.size() + " failure(s) in " + runDir + "; AI step: " + ai.status());
    return 0;
  }

  TriageRecord triage(
      Path runDir, RunSummary summary, TestResult test, AiTriage ai, String gitDiff, Path schemas) {
    List<JsonNode> calls = transcript(runDir, test);
    FailureContext context = new FailureContext(test, calls);
    Classification classification = ai.refine(rules.classify(context), context);
    SchemaDiff diff =
        classification.category() == Category.CONTRACT_DRIFT
            ? withUndeclared(SchemaDiff.parse(test.errorMessage()), context, schemas)
            : null;
    Map<String, Object> failingRequest = new LinkedHashMap<>();
    context
        .failingCall()
        .ifPresent(
            call -> {
              failingRequest.put("method", call.path("method").asText());
              failingRequest.put("operation", call.path("pathTemplate").asText());
              failingRequest.put("url", call.path("url").asText());
              failingRequest.put(
                  "status",
                  call.path("status").isMissingNode() ? "none" : call.path("status").asText());
              failingRequest.put("correlationId", call.path("correlationId").asText());
            });
    Map<String, String> evidence = new LinkedHashMap<>();
    if (test.evidence() != null) {
      evidence.put("attemptDir", test.evidence().dir());
      evidence.put("transcript", test.evidence().transcript());
      evidence.put("timeline", test.evidence().timeline());
    }
    evidence.put("bundle", "failure-bundles/" + test.slug() + "/");
    evidence.put("bundleZip", "failure-bundles/" + test.slug() + ".zip");
    Map<String, String> error = new LinkedHashMap<>();
    error.put("type", test.errorType());
    error.put("message", test.errorMessage());
    return new TriageRecord(
        1,
        summary.repo(),
        summary.runId(),
        test.id(),
        test.title(),
        test.suite(),
        test.featureIdsOrEmpty(),
        classification.category(),
        classification.confidence(),
        classification.classifiedBy(),
        classification.rule(),
        classification.reason(),
        classification.category().healable(),
        classification.category().needsHumanDecision(),
        classification.category().nextAction(),
        error,
        failingRequest,
        diff,
        evidence,
        gitDiff,
        retryHistory(runDir, test),
        ai.status());
  }

  private static List<JsonNode> transcript(Path runDir, TestResult test) {
    if (test.evidence() == null || test.evidence().dir() == null) {
      return List.of();
    }
    Path file = runDir.resolve(test.evidence().dir()).resolve("transcript.json");
    if (!Files.exists(file)) {
      return List.of();
    }
    List<JsonNode> calls = new ArrayList<>();
    Json.read(file).forEach(calls::add);
    return calls;
  }

  private static List<Map<String, Object>> retryHistory(Path runDir, TestResult test) {
    List<Map<String, Object>> history = new ArrayList<>();
    if (test.evidence() == null || test.evidence().dir() == null) {
      return history;
    }
    Path testDir = runDir.resolve(test.evidence().dir()).getParent();
    try (Stream<Path> attempts = Files.list(testDir)) {
      for (Path attempt : attempts.sorted().toList()) {
        Path meta = attempt.resolve("meta.json");
        if (Files.exists(meta)) {
          Map<String, Object> entry = new LinkedHashMap<>();
          entry.put("attempt", Integer.parseInt(attempt.getFileName().toString()));
          entry.put("status", Json.read(meta).path("test").path("status").asText());
          history.add(entry);
        }
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
    return history;
  }

  private static String gitDiffStat() {
    try {
      Process git = new ProcessBuilder("git", "log", "-1", "--stat", "--format=%h %s").start();
      if (!git.waitFor(10, TimeUnit.SECONDS)) {
        git.destroyForcibly();
        return "(git timed out)";
      }
      return new String(git.getInputStream().readAllBytes(), StandardCharsets.UTF_8).strip();
    } catch (IOException e) {
      return "(git unavailable)";
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return "(interrupted)";
    }
  }

  private static void writeText(Path file, String text) {
    try {
      Files.writeString(file, text, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  /** The consumer schema's declared properties, compared with the failing call's response. */
  static SchemaDiff withUndeclared(SchemaDiff diff, FailureContext context, Path schemas) {
    if (diff.schema() == null) {
      return diff;
    }
    Path schemaFile = schemas.resolve(diff.schema() + ".schema.json");
    if (!Files.exists(schemaFile)) {
      return diff;
    }
    Set<String> declared = new java.util.HashSet<>();
    Json.read(schemaFile).path("properties").fieldNames().forEachRemaining(declared::add);
    return context
        .failingCall()
        .map(call -> call.path("responseBody").asText(""))
        .filter(body -> body.startsWith("{"))
        .map(
            body -> {
              try {
                return diff.withUndeclared(Json.mapper().readTree(body), declared);
              } catch (java.io.IOException e) {
                return diff;
              }
            })
        .orElse(diff);
  }
}
