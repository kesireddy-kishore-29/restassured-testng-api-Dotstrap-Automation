package com.qaautomation.tools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/** One test in run-summary.json (the format shared by every repository of the family). */
@JsonIgnoreProperties(ignoreUnknown = true)
public record TestResult(
    String id,
    String title,
    String suite,
    List<String> featureIds,
    List<String> tags,
    String status,
    long durationMs,
    int attempt,
    boolean quarantined,
    ErrorInfo error,
    EvidenceInfo evidence) {

  /** The failure, if any. */
  @JsonIgnoreProperties(ignoreUnknown = true)
  public record ErrorInfo(String type, String message, String stack) {}

  /** Where the attempt's evidence lives, relative to the run directory. */
  @JsonIgnoreProperties(ignoreUnknown = true)
  public record EvidenceInfo(String dir, String transcript, String timeline) {}

  public List<String> featureIdsOrEmpty() {
    return featureIds == null ? List.of() : featureIds;
  }

  public List<String> tagsOrEmpty() {
    return tags == null ? List.of() : tags;
  }

  public String errorType() {
    return error == null || error.type() == null ? "" : error.type();
  }

  public String errorMessage() {
    return error == null || error.message() == null ? "" : error.message();
  }

  /** The folder name a failure bundle uses for this test. */
  public String slug() {
    if (evidence != null && evidence.dir() != null) {
      String[] parts = evidence.dir().split("/");
      if (parts.length >= 2) {
        return parts[parts.length - 2];
      }
    }
    return id.replaceAll("[^A-Za-z0-9]+", "-").toLowerCase(java.util.Locale.ROOT);
  }
}
