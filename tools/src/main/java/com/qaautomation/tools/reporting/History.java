package com.qaautomation.tools.reporting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qaautomation.tools.model.RunSummary;
import com.qaautomation.tools.shared.Json;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** history.json: one point per run, newest last, at most 30 (the dashboard's trend window). */
@JsonIgnoreProperties(ignoreUnknown = true)
public record History(int schemaVersion, List<Point> runs) {

  public static final int KEEP = 30;

  /** One run's totals. */
  @JsonIgnoreProperties(ignoreUnknown = true)
  public record Point(
      String runId,
      String date,
      int total,
      int passed,
      int failed,
      int flaky,
      int skipped,
      long durationMs,
      double passRate) {}

  public static History read(Path file) {
    return Files.exists(file) ? Json.read(file, History.class) : new History(1, List.of());
  }

  public static Point pointOf(RunSummary run) {
    Map<String, Integer> t = run.totals();
    int passed = t.getOrDefault("passed", 0);
    int failed = t.getOrDefault("failed", 0);
    int flaky = t.getOrDefault("flaky", 0);
    int executed = passed + failed + flaky;
    double passRate = executed == 0 ? 0 : (double) (passed + flaky) / executed;
    String date =
        run.startedAt() == null
            ? ""
            : run.startedAt().substring(0, Math.min(10, run.startedAt().length()));
    return new Point(
        run.runId(),
        date,
        t.getOrDefault("total", 0),
        passed,
        failed,
        flaky,
        t.getOrDefault("skipped", 0),
        run.durationMs(),
        passRate);
  }

  /** Adds (or replaces) this run and keeps the newest {@link #KEEP}. */
  public History with(Point point) {
    List<Point> all = new ArrayList<>(runs == null ? List.of() : runs);
    all.removeIf(p -> p.runId().equals(point.runId()));
    all.add(point);
    return new History(1, all.subList(Math.max(0, all.size() - KEEP), all.size()));
  }
}
