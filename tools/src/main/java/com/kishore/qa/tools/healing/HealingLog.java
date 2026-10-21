package com.kishore.qa.tools.healing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kishore.qa.tools.shared.Json;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** healing-log.json: every heal attempt, with its evidence, outcome and time to fix. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record HealingLog(int schemaVersion, List<Entry> entries) {

  /**
   * One heal attempt. {@code outcome}: proposed | rejected-by-guardrails | failed-verification |
   * merged | rejected.
   */
  @JsonIgnoreProperties(ignoreUnknown = true)
  public record Entry(
      String date,
      String runId,
      String testId,
      String category,
      String rootCause,
      String branch,
      String pr,
      String provider,
      String outcome,
      long timeToFixMinutes,
      Map<String, String> guardrails,
      Map<String, Object> verification) {}

  public static HealingLog read(Path file) {
    return Files.exists(file) ? Json.read(file, HealingLog.class) : new HealingLog(1, List.of());
  }

  public HealingLog plus(Entry entry) {
    List<Entry> all = new ArrayList<>(entries == null ? List.of() : entries);
    all.add(entry);
    return new HealingLog(1, all);
  }

  /** Attempts already made today for this test (the budget is two). */
  public long attemptsToday(String testId, String date) {
    return (entries == null ? List.<Entry>of() : entries)
        .stream().filter(e -> e.testId().equals(testId) && e.date().equals(date)).count();
  }
}
