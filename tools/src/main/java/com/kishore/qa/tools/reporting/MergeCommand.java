package com.kishore.qa.tools.reporting;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.kishore.qa.tools.Command;
import com.kishore.qa.tools.shared.Args;
import com.kishore.qa.tools.shared.Json;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * {@code qa-tools merge --from <dir> --into <dir>}: combines the run folders of parallel shards
 * (one per suite in the nightly workflow) into one run, so triage, reports and history see a single
 * run. Evidence folders are copied as they are; the run documents are combined.
 */
public final class MergeCommand implements Command {

  /** Run documents that are combined rather than copied. */
  private static final Set<String> COMBINED =
      Set.of("run-summary.json", "flaky-report.json", "calls.json");

  @Override
  public String name() {
    return "merge";
  }

  @Override
  public String summary() {
    return "combine the run folders of parallel shards into one run";
  }

  @Override
  public int run(String[] argv, PrintStream out) {
    Args args = Args.parse(argv);
    Path from = Path.of(args.get("from", "shards"));
    Path into =
        Path.of(
            args.get("into")
                .orElseThrow(() -> new IllegalArgumentException("--into <run dir> is required")));
    List<Path> runs = findRuns(from);
    if (runs.isEmpty()) {
      out.println("No run-summary.json under " + from + "; nothing to merge.");
      return 1;
    }
    List<JsonNode> summaries = new ArrayList<>();
    ArrayNode flaky = Json.mapper().createArrayNode();
    ArrayNode calls = Json.mapper().createArrayNode();
    boolean anyCalls = false;
    for (Path run : runs) {
      copyEvidence(run, into);
      summaries.add(Json.read(run.resolve("run-summary.json")));
      Path flakyFile = run.resolve("flaky-report.json");
      if (Files.exists(flakyFile)) {
        flaky.addAll((ArrayNode) Json.read(flakyFile).path("flaky"));
      }
      Path callsFile = run.resolve("calls.json");
      if (Files.exists(callsFile)) {
        calls.addAll((ArrayNode) Json.read(callsFile));
        anyCalls = true;
      }
    }
    ObjectNode summary = merge(summaries);
    Json.write(into.resolve("run-summary.json"), summary);
    ObjectNode flakyReport = Json.mapper().createObjectNode();
    flakyReport.put("schemaVersion", 1);
    flakyReport.put("repo", summary.path("repo").asText());
    flakyReport.put("runId", summary.path("runId").asText());
    flakyReport.put("generatedAt", Instant.now().toString());
    flakyReport.set("flaky", flaky);
    Json.write(into.resolve("flaky-report.json"), flakyReport);
    if (anyCalls) {
      Json.write(into.resolve("calls.json"), calls);
    }
    out.println(
        "Merged "
            + runs.size()
            + " shard run(s), "
            + summary.path("tests").size()
            + " tests, into "
            + into);
    return 0;
  }

  /** When a test ran in several shards, its worst result counts. */
  private static final Map<String, Integer> SEVERITY =
      Map.of("failed", 0, "flaky", 1, "passed", 2, "skipped", 3);

  /**
   * One summary for all shards: each test listed once (a test that ran in several shards keeps its
   * worst result), totals counted from that list, and the wall-clock span from the first shard's
   * start to the last shard's finish.
   */
  static ObjectNode merge(List<JsonNode> summaries) {
    ObjectNode merged = summaries.getFirst().deepCopy();
    Map<String, JsonNode> byId = new TreeMap<>();
    Instant started = null;
    Instant finished = null;
    for (JsonNode s : summaries) {
      for (JsonNode test : s.path("tests")) {
        byId.merge(
            test.path("id").asText(),
            test,
            (seen, next) -> severity(next) < severity(seen) ? next : seen);
      }
      Instant start = Instant.parse(s.path("startedAt").asText());
      Instant finish = Instant.parse(s.path("finishedAt").asText());
      started = started == null || start.isBefore(started) ? start : started;
      finished = finished == null || finish.isAfter(finished) ? finish : finished;
    }
    List<JsonNode> tests = new ArrayList<>(byId.values());
    ObjectNode totals = Json.mapper().createObjectNode();
    totals.put("total", tests.size());
    for (String status : List.of("passed", "failed", "skipped", "flaky")) {
      totals.put(
          status, tests.stream().filter(t -> status.equals(t.path("status").asText())).count());
    }
    totals.put(
        "quarantined", tests.stream().filter(t -> t.path("quarantined").asBoolean()).count());
    merged.set("totals", totals);
    merged.set("tests", Json.mapper().createArrayNode().addAll(tests));
    merged.put("startedAt", String.valueOf(started));
    merged.put("finishedAt", String.valueOf(finished));
    merged.put("durationMs", Duration.between(started, finished).toMillis());
    merged.put("shards", summaries.size());
    return merged;
  }

  private static int severity(JsonNode test) {
    return SEVERITY.getOrDefault(test.path("status").asText(), 9);
  }

  static List<Path> findRuns(Path from) {
    if (!Files.isDirectory(from)) {
      return List.of();
    }
    try (Stream<Path> files = Files.walk(from, 6)) {
      return files
          .filter(f -> f.getFileName().toString().equals("run-summary.json"))
          .map(Path::getParent)
          .sorted()
          .toList();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  private static void copyEvidence(Path run, Path into) {
    try (Stream<Path> all = Files.walk(run)) {
      for (Path source : all.toList()) {
        Path relative = run.relativize(source);
        if (relative.getNameCount() == 1 && COMBINED.contains(relative.toString())) {
          continue;
        }
        Path target = into.resolve(relative.toString());
        if (Files.isDirectory(source)) {
          Files.createDirectories(target);
        } else {
          Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
      }
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
