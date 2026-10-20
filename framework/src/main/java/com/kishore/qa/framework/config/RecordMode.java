package com.kishore.qa.framework.config;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

/** How much evidence a run keeps. Same three values in every repo of the family. */
public enum RecordMode {
  /** Keep evidence only for failed or retried tests. Default for pull requests. */
  FAILURES,
  /** Keep evidence for every test. Default for nightly runs and local analysis. */
  ALL,
  /** Keep nothing beyond the native report. Fastest. */
  OFF;

  public static RecordMode parse(String raw) {
    String value = raw.trim().toUpperCase(Locale.ROOT);
    for (RecordMode mode : values()) {
      if (mode.name().equals(value)) {
        return mode;
      }
    }
    throw new IllegalArgumentException(
        "'"
            + raw
            + "' is not one of "
            + Arrays.stream(values())
                .map(m -> m.name().toLowerCase(Locale.ROOT))
                .collect(Collectors.joining(", ")));
  }

  public boolean keepsPassingEvidence() {
    return this == ALL;
  }

  public boolean keepsFailureEvidence() {
    return this != OFF;
  }
}
