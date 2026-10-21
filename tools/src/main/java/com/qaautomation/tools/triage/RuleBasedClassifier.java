package com.qaautomation.tools.triage;

import com.qaautomation.tools.model.TestResult;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Deterministic triage: ordered rules over the exception type, the message and the calls the test
 * made. Rules come first and cover the common cases cheaply and repeatably; an LLM is only
 * consulted (optionally) for what lands in UNKNOWN.
 */
public final class RuleBasedClassifier {

  private static final Pattern NETWORK =
      Pattern.compile(
          "ConnectException|UnknownHostException|NoRouteToHost|SSLHandshake|Connection refused"
              + "|Connection reset|not reachable|ApiTimeoutException|SocketTimeoutException");
  private static final Pattern CONTRACT =
      Pattern.compile("OpenAPI contract violation|JSON Schema '[^']+' violated");
  private static final Pattern TEST_DATA =
      Pattern.compile(
          "CleanupFailedException|handle-taken|Test data must be cleaned up|was deleted but can still"
              + "|still readable after delete");

  public Classification classify(FailureContext context) {
    TestResult test = context.test();
    String type = test.errorType();
    String message = test.errorMessage();
    String both = type + " " + message;
    boolean publicTarget = "booker".equals(test.suite());

    if (NETWORK.matcher(both).find()) {
      return Classification.byRule(
          Category.ENVIRONMENT,
          0.9,
          "network-or-timeout",
          "The service did not answer: " + firstLine(message));
    }
    if (publicTarget && context.anyCallHasStatusAtLeast(500)) {
      return Classification.byRule(
          Category.ENVIRONMENT, 0.85, "public-target-5xx", "The public practice API answered 5xx.");
    }
    if (type.endsWith("ContractViolation") || CONTRACT.matcher(message).find()) {
      return Classification.byRule(
          Category.CONTRACT_DRIFT,
          0.95,
          "contract-violation",
          "The response no longer matches its contract: " + firstLine(message));
    }
    if (TEST_DATA.matcher(both).find()) {
      return Classification.byRule(
          Category.TEST_DATA, 0.85, "test-data", "Test data collided or was not cleaned up.");
    }
    if (type.endsWith("ConditionTimeoutException")) {
      return Classification.byRule(
          Category.TIMING, 0.8, "await-timeout", "A polled condition did not become true in time.");
    }
    if (isAssertion(type) && !message.isBlank()) {
      return Classification.byRule(
          Category.PRODUCT_BUG,
          0.75,
          "behaviour-assertion",
          "A business assertion failed on a valid response: " + firstLine(message));
    }
    return Classification.byRule(
        Category.UNKNOWN, 0.3, "no-rule-matched", "No rule matched " + simpleName(type) + ".");
  }

  private static boolean isAssertion(String type) {
    String lower = type.toLowerCase(Locale.ROOT);
    return lower.endsWith("assertionerror") || lower.endsWith("assertionfailederror");
  }

  static String firstLine(String text) {
    String line = text.strip().lines().findFirst().orElse("").replaceAll(":$", "");
    return line.length() > 200 ? line.substring(0, 200) + "…" : line;
  }

  private static String simpleName(String type) {
    return type.isEmpty() ? "(no exception type)" : type.substring(type.lastIndexOf('.') + 1);
  }
}
