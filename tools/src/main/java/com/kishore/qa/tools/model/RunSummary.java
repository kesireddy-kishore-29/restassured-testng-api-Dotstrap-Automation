package com.kishore.qa.tools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kishore.qa.tools.shared.Json;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

/** run-summary.json: the normalised result every report and tool reads. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RunSummary(
    String repo,
    String runId,
    String gitSha,
    String startedAt,
    String finishedAt,
    long durationMs,
    Map<String, Integer> totals,
    List<TestResult> tests) {

  public static RunSummary read(Path runDir) {
    return Json.read(runDir.resolve("run-summary.json"), RunSummary.class);
  }

  public List<TestResult> failed() {
    return tests.stream().filter(t -> "failed".equals(t.status())).toList();
  }
}
