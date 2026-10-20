package com.kishore.qa.framework.evidence;

import java.time.Instant;
import java.util.List;

/** One finished attempt of one test, as written to meta.json and run-summary.json. */
public record TestRecord(
    String id,
    String title,
    String suite,
    List<String> featureIds,
    List<String> tags,
    String status,
    long durationMs,
    int attempt,
    boolean quarantined,
    Instant startedAt,
    Instant finishedAt,
    ErrorInfo error,
    EvidenceInfo evidence) {

  /** The failure, if any. */
  public record ErrorInfo(String type, String message, String stack) {}

  /** Where this attempt's evidence lives, relative to the run directory. */
  public record EvidenceInfo(String dir, String transcript, String timeline) {}
}
