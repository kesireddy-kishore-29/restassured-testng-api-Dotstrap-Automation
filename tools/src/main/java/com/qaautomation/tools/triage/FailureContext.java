package com.qaautomation.tools.triage;

import com.fasterxml.jackson.databind.JsonNode;
import com.qaautomation.tools.model.TestResult;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Everything triage knows about one failed test: the result, the calls it made (from
 * transcript.json) and the contract violations reported on those calls.
 */
public record FailureContext(TestResult test, List<JsonNode> calls) {

  private static final Pattern OPERATION_IN_MESSAGE =
      Pattern.compile(
          "\\b(GET|POST|PUT|PATCH|DELETE) (/\\S+?)(?=:| ->| timed out| to answer|\\s|$)");

  /**
   * The call that failed: the operation the error message names, else the last call with a contract
   * violation, an error or a 5xx, else the last call before the test's cleanup.
   */
  public Optional<JsonNode> failingCall() {
    Matcher named = OPERATION_IN_MESSAGE.matcher(test.errorMessage());
    if (named.find()) {
      String method = named.group(1);
      String path = named.group(2);
      for (int i = calls.size() - 1; i >= 0; i--) {
        JsonNode call = calls.get(i);
        if (method.equals(call.path("method").asText())
            && path.equals(call.path("pathTemplate").asText())) {
          return Optional.of(call);
        }
      }
    }
    for (int i = calls.size() - 1; i >= 0; i--) {
      JsonNode call = calls.get(i);
      JsonNode violations = call.path("contractViolations");
      boolean violated = violations.isArray() && !violations.isEmpty();
      if (violated || call.hasNonNull("error") || call.path("status").asInt(0) >= 500) {
        return Optional.of(call);
      }
    }
    int last = calls.size() - 1;
    while (last >= 0 && isCleanup(calls.get(last))) {
      last--;
    }
    return last >= 0 ? Optional.of(calls.get(last)) : Optional.empty();
  }

  /** The verified-cleanup tail every test ends with: delete, then prove sign-in now fails. */
  private static boolean isCleanup(JsonNode call) {
    String op = call.path("method").asText() + " " + call.path("pathTemplate").asText();
    return op.equals("DELETE /v1/accounts/me")
        || (op.equals("POST /v1/auth/token") && call.path("status").asInt() == 401)
        || op.startsWith("DELETE /booking/");
  }

  public boolean anyCallHasStatusAtLeast(int status) {
    return calls.stream().anyMatch(c -> c.path("status").asInt(0) >= status);
  }
}
