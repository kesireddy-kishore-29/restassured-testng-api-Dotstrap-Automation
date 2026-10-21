package com.kishore.qa.tools.reporting;

import java.util.List;

/** Nearest-rank percentiles, the definition a reader can check by hand. */
public final class Percentiles {

  private Percentiles() {}

  public static long of(List<Long> values, double percentile) {
    if (values.isEmpty()) {
      return 0;
    }
    List<Long> sorted = values.stream().sorted().toList();
    int rank = (int) Math.ceil(percentile / 100.0 * sorted.size());
    return sorted.get(Math.max(0, Math.min(sorted.size() - 1, rank - 1)));
  }
}
