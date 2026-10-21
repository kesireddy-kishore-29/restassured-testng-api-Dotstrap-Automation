package com.qaautomation.tools.quarantine;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.qaautomation.tools.shared.Json;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** flaky-history.json: one row per (date, run, flaky test), kept for 30 days. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FlakyHistory(int schemaVersion, List<Occurrence> occurrences) {

  /** A test that failed then passed on retry in one run. */
  @JsonIgnoreProperties(ignoreUnknown = true)
  public record Occurrence(String date, String runId, String testId, String title) {}

  public static final int KEEP_DAYS = 30;

  public static FlakyHistory read(Path file) {
    return Files.exists(file)
        ? Json.read(file, FlakyHistory.class)
        : new FlakyHistory(1, List.of());
  }

  public FlakyHistory record(List<Occurrence> added, LocalDate today) {
    List<Occurrence> all = new ArrayList<>();
    for (Occurrence o : occurrences == null ? List.<Occurrence>of() : occurrences) {
      if (!LocalDate.parse(o.date()).isBefore(today.minusDays(KEEP_DAYS))) {
        all.add(o);
      }
    }
    for (Occurrence o : added) {
      boolean duplicate =
          all.stream().anyMatch(e -> e.runId().equals(o.runId()) && e.testId().equals(o.testId()));
      if (!duplicate) {
        all.add(o);
      }
    }
    return new FlakyHistory(1, all);
  }

  /** testId -> number of flaky runs in the last {@code days} days. */
  public Map<String, Integer> countsSince(LocalDate today, int days) {
    Map<String, Integer> counts = new LinkedHashMap<>();
    for (Occurrence o : occurrences == null ? List.<Occurrence>of() : occurrences) {
      if (!LocalDate.parse(o.date()).isBefore(today.minusDays(days))) {
        counts.merge(o.testId(), 1, Integer::sum);
      }
    }
    return counts;
  }
}
