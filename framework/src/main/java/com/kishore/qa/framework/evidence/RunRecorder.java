package com.kishore.qa.framework.evidence;

import com.kishore.qa.framework.core.Json;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Collects every attempt of every test in a run and writes the shared run documents: {@code
 * run-summary.json} (the normalised result every report reads) and {@code flaky-report.json} (tests
 * that failed, then passed on retry).
 */
public final class RunRecorder {

  private final RunInfo run;
  private final Instant startedAt = Instant.now();
  private final List<TestRecord> attempts = new ArrayList<>();

  public RunRecorder(RunInfo run) {
    this.run = run;
  }

  public synchronized void add(TestRecord record) {
    attempts.add(record);
  }

  /** The last attempt of each test, with "flaky" when it passed after a retry. */
  public synchronized List<TestRecord> finalResults() {
    Map<String, TestRecord> last = new LinkedHashMap<>();
    Map<String, Integer> count = new LinkedHashMap<>();
    for (TestRecord r : attempts) {
      count.merge(r.id(), 1, Integer::sum);
      TestRecord previous = last.get(r.id());
      if (previous == null || r.attempt() >= previous.attempt()) {
        last.put(r.id(), r);
      }
    }
    List<TestRecord> results = new ArrayList<>();
    for (TestRecord r : last.values()) {
      boolean flaky = "passed".equals(r.status()) && count.get(r.id()) > 1;
      results.add(flaky ? withStatus(r, "flaky") : r);
    }
    results.sort(Comparator.comparing(TestRecord::suite).thenComparing(TestRecord::id));
    return results;
  }

  public synchronized List<TestRecord> attemptsOf(String testId) {
    return attempts.stream().filter(a -> a.id().equals(testId)).toList();
  }

  public void write(Map<String, Object> environment) {
    List<TestRecord> results = finalResults();
    Instant finishedAt = Instant.now();
    Map<String, Integer> totals = new LinkedHashMap<>();
    totals.put("total", results.size());
    totals.put("passed", count(results, "passed"));
    totals.put("failed", count(results, "failed"));
    totals.put("skipped", count(results, "skipped"));
    totals.put("flaky", count(results, "flaky"));
    totals.put("quarantined", (int) results.stream().filter(TestRecord::quarantined).count());

    Map<String, Object> summary = new LinkedHashMap<>();
    summary.put("schemaVersion", 1);
    summary.put("repo", run.repo());
    summary.put("runId", run.runId());
    summary.put("gitSha", run.gitSha());
    summary.put("recordMode", run.recordMode());
    summary.put("startedAt", startedAt);
    summary.put("finishedAt", finishedAt);
    summary.put("durationMs", Duration.between(startedAt, finishedAt).toMillis());
    summary.put("environment", environment);
    summary.put("totals", totals);
    summary.put("tests", results);

    List<Map<String, Object>> flaky = new ArrayList<>();
    for (TestRecord r : results) {
      if ("flaky".equals(r.status())) {
        Map<String, Object> entry = new LinkedHashMap<>();
        entry.put("testId", r.id());
        entry.put("title", r.title());
        entry.put("featureIds", r.featureIds());
        entry.put("attempts", r.attempt());
        entry.put(
            "firstError",
            attemptsOf(r.id()).stream()
                .filter(a -> a.error() != null)
                .map(a -> a.error().type() + ": " + a.error().message())
                .findFirst()
                .orElse(""));
        flaky.add(entry);
      }
    }
    Map<String, Object> flakyReport = new LinkedHashMap<>();
    flakyReport.put("schemaVersion", 1);
    flakyReport.put("repo", run.repo());
    flakyReport.put("runId", run.runId());
    flakyReport.put("generatedAt", finishedAt);
    flakyReport.put("flaky", flaky);

    try {
      Files.createDirectories(run.runDir());
      EvidenceWriter.write(run.runDir().resolve("run-summary.json"), Json.pretty(summary));
      EvidenceWriter.write(run.runDir().resolve("flaky-report.json"), Json.pretty(flakyReport));
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  private static int count(List<TestRecord> results, String status) {
    return (int) results.stream().filter(r -> status.equals(r.status())).count();
  }

  private static TestRecord withStatus(TestRecord r, String status) {
    return new TestRecord(
        r.id(),
        r.title(),
        r.suite(),
        r.featureIds(),
        r.tags(),
        status,
        r.durationMs(),
        r.attempt(),
        r.quarantined(),
        r.startedAt(),
        r.finishedAt(),
        r.error(),
        r.evidence());
  }
}
