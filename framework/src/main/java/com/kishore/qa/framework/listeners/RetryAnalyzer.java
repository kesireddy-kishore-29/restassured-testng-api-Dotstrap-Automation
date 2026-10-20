package com.kishore.qa.framework.listeners;

import java.util.Arrays;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Retries a failed test at most twice (once for the deliberate-failure demo). A test that passes on
 * a retry is reported as FLAKY in flaky-report.json; a retry never turns a failure into a pass
 * silently. {@code TEST_RETRIES} (0-2) lowers the cap, e.g. to 0 for a strict local run.
 */
public final class RetryAnalyzer implements IRetryAnalyzer {

  static final int MAX_RETRIES = 2;

  private int retries;

  @Override
  public boolean retry(ITestResult result) {
    if (retries >= limit(result)) {
      return false;
    }
    retries++;
    return true;
  }

  static int limit(ITestResult result) {
    int configured = configuredRetries();
    boolean demo = Arrays.asList(result.getMethod().getGroups()).contains("demo-failure");
    return demo ? Math.min(1, configured) : configured;
  }

  static int configuredRetries() {
    String raw = System.getProperty("test.retries", System.getenv("TEST_RETRIES"));
    if (raw == null || raw.isBlank()) {
      return MAX_RETRIES;
    }
    try {
      return Math.max(0, Math.min(MAX_RETRIES, Integer.parseInt(raw.trim())));
    } catch (NumberFormatException e) {
      return MAX_RETRIES;
    }
  }
}
