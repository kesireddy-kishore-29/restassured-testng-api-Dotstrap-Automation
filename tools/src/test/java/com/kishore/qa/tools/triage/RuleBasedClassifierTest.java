package com.kishore.qa.tools.triage;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.kishore.qa.tools.model.TestResult;
import com.kishore.qa.tools.shared.Json;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RuleBasedClassifierTest {

  private final RuleBasedClassifier classifier = new RuleBasedClassifier();

  private static FailureContext failure(
      String suite, String type, String message, List<JsonNode> calls) {
    TestResult test =
        new TestResult(
            "pkg.SomeTest#works",
            "works",
            suite,
            List.of("FEAT-X-01"),
            List.of(),
            "failed",
            10,
            1,
            false,
            new TestResult.ErrorInfo(type, message, ""),
            null);
    return new FailureContext(test, calls);
  }

  private static JsonNode call(int status) {
    return Json.mapper()
        .createObjectNode()
        .put("method", "GET")
        .put("pathTemplate", "/booking/{id}")
        .put("status", status);
  }

  @DataProvider
  public Object[][] cases() {
    return new Object[][] {
      {
        "functional",
        "java.net.ConnectException",
        "Connection refused",
        Category.ENVIRONMENT,
        "network-or-timeout"
      },
      {
        "resilience",
        "com.kishore.qa.framework.core.ApiTimeoutException",
        "GET /x timed out",
        Category.ENVIRONMENT,
        "network-or-timeout"
      },
      {
        "contract",
        "com.kishore.qa.framework.assertions.ContractViolation",
        "OpenAPI contract violation on GET /v1/credits/balance:\n  - validation.response.body.schema.required: missing",
        Category.CONTRACT_DRIFT,
        "contract-violation"
      },
      {
        "functional",
        "java.lang.AssertionError",
        "JSON Schema 'balance' violated by GET /v1/credits/balance -> 200:\n"
            + "  - $: required property 'balance' not found",
        Category.CONTRACT_DRIFT,
        "contract-violation"
      },
      {
        "functional",
        "com.kishore.qa.framework.data.CleanupFailedException",
        "Account qa-1 was deleted but can still sign in",
        Category.TEST_DATA,
        "test-data"
      },
      {
        "security",
        "org.awaitility.core.ConditionTimeoutException",
        "Condition was not fulfilled within 5 seconds",
        Category.TIMING,
        "await-timeout"
      },
      {
        "functional",
        "java.lang.AssertionError",
        "Expected GET /v1/accounts/me -> 500 to answer 200 but it answered 500.",
        Category.PRODUCT_BUG,
        "behaviour-assertion"
      },
      {
        "functional",
        "java.lang.NullPointerException",
        "Cannot invoke \"String.length()\"",
        Category.UNKNOWN,
        "no-rule-matched"
      },
    };
  }

  @Test(dataProvider = "cases")
  public void classifiesByTheFirstMatchingRule(
      String suite, String type, String message, Category expected, String rule) {
    Classification result = classifier.classify(failure(suite, type, message, List.of()));

    assertThat(result.category()).isEqualTo(expected);
    assertThat(result.rule()).isEqualTo(rule);
    assertThat(result.classifiedBy()).isEqualTo("rules");
  }

  @Test
  public void aPublicTargetAnswering5xxIsEnvironmentNotAProductBug() {
    FailureContext context =
        failure(
            "booker",
            "java.lang.AssertionError",
            "Expected POST /booking -> 503 to answer 200",
            List.of(call(503)));

    assertThat(classifier.classify(context).category()).isEqualTo(Category.ENVIRONMENT);
  }

  @Test
  public void onlyHealableCategoriesMayReachTheHealer() {
    assertThat(Category.PRODUCT_BUG.healable()).isFalse();
    assertThat(Category.ENVIRONMENT.healable()).isFalse();
    assertThat(Category.UNKNOWN.healable()).isFalse();
    assertThat(Category.CONTRACT_DRIFT.needsHumanDecision()).isTrue();
  }
}
