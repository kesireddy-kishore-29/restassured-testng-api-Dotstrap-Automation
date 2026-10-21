package com.qaautomation.tools.healing;

import static org.assertj.core.api.Assertions.assertThat;

import com.qaautomation.tools.triage.Category;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/** Proves each guardrail refuses what it must, and that a legitimate patch passes. */
public class GuardrailsTest {

  private static final String CLIENT =
      "framework/src/main/java/com/qaautomation/framework/clients/CreditsClient.java";
  private static final String MODEL =
      "framework/src/main/java/com/qaautomation/framework/clients/model/Balance.java";
  private static final String SCHEMA = "framework/src/main/resources/schemas/balance.schema.json";

  private final Guardrails guardrails = new Guardrails();

  private static Patch patch(Category category, FileChange... changes) {
    return new Patch(category, "pkg.T#m", "test", "why", List.of(changes));
  }

  private static FileChange edit(String path, String before, String after) {
    return new FileChange(path, before, after);
  }

  private List<String> rules(Patch patch) {
    return guardrails.check(patch).stream().map(GuardrailViolation::rule).toList();
  }

  @Test
  public void aMinimalRenameInModelAndSchemaPasses() {
    Patch rename =
        patch(
            Category.CONTRACT_DRIFT,
            edit(
                MODEL,
                "@JsonProperty(\"balance\") int balance,",
                "@JsonProperty(\"availableBalance\") int balance,"),
            edit(
                SCHEMA,
                "{\n  \"required\": [\"balance\", \"currency\"],\n  \"balance\": {}\n}",
                "{\n  \"required\": [\"availableBalance\", \"currency\"],\n  \"availableBalance\": {}\n}"));

    assertThat(guardrails.check(rename)).isEmpty();
  }

  @DataProvider
  public Object[][] forbiddenPaths() {
    return new Object[][] {
      {"tests/src/test/java/com/qaautomation/tests/contract/ContractTest.java"},
      {"framework/src/main/java/com/qaautomation/framework/assertions/ResponseAssert.java"},
      {"pom.xml"},
      {"tests/pom.xml"},
      {"tests/src/test/resources/suites/regression.xml"},
      {".github/workflows/ci.yml"},
      {"sut/src/main/java/com/qaautomation/sut/Main.java"},
      {"postman/restassured-testng-api-Dotstrap-Automation.postman_collection.json"},
      {"docs/adr/0001-why-java.md"},
      {"tools/src/main/java/com/qaautomation/tools/healing/Guardrails.java"},
    };
  }

  @Test(dataProvider = "forbiddenPaths")
  public void refusesForbiddenPaths(String path) {
    assertThat(rules(patch(Category.LOCATOR_DRIFT, edit(path, "a\n", "b\n"))))
        .containsExactly("forbidden-path");
  }

  @Test
  public void refusesPathsOutsideTheAllowList() {
    assertThat(
            rules(
                patch(
                    Category.TIMING,
                    edit(
                        "framework/src/main/java/com/qaautomation/framework/core/RetryPolicy.java",
                        "a\n",
                        "b\n"))))
        .containsExactly("path-not-allowed");
  }

  @Test
  public void refusesSchemaChangesOutsideContractDrift() {
    assertThat(rules(patch(Category.TEST_DATA, edit(SCHEMA, "{}", "{ }"))))
        .containsExactly("forbidden-path");
  }

  @DataProvider
  public Object[][] forbiddenAdditions() {
    return new Object[][] {
      {"    Thread.sleep(2000);", "hard-wait"},
      {"    TimeUnit.SECONDS.sleep(1);", "hard-wait"},
      {"  @Test(enabled = false)", "disabled-test"},
      {"  @Ignore", "disabled-test"},
      {"  // CHECKSTYLE:OFF", "suppressed-check"},
      {"  private static final Duration READ = Duration.ofSeconds(90);", "timeout-above-ceiling"},
      {
        "  private static final Duration READ = Duration.ofMillis(45_000);", "timeout-above-ceiling"
      },
    };
  }

  @Test(dataProvider = "forbiddenAdditions")
  public void refusesForbiddenConstructs(String addedLine, String rule) {
    Patch p =
        patch(Category.TIMING, edit(CLIENT, "class A {\n}\n", "class A {\n" + addedLine + "\n}\n"));

    assertThat(rules(p)).contains(rule);
  }

  @Test
  public void refusesARaisedTimeoutInConfiguration() {
    Patch p =
        patch(
            Category.TIMING,
            edit(
                "framework/src/main/resources/config/ci.properties",
                "http.readTimeoutMs=20000\n",
                "http.readTimeoutMs=120000\n"));

    assertThat(rules(p)).containsExactly("timeout-above-ceiling");
  }

  @Test
  public void refusesSwallowedExceptions() {
    String before = "void f() {\n  call();\n}\n";
    String after = "void f() {\n  try {\n    call();\n  } catch (RuntimeException e) {\n  }\n}\n";

    assertThat(rules(patch(Category.TIMING, edit(CLIENT, before, after))))
        .contains("swallowed-exception");
  }

  @Test
  public void refusesAPatchThatRemovesACheck() {
    String before =
        "int currentBalance() {\n  return Contracts.read(balance(), 200, \"balance\", Balance.class).balance();\n}\n";
    String after = "int currentBalance() {\n  return balance().as(Balance.class).balance();\n}\n";

    assertThat(rules(patch(Category.CONTRACT_DRIFT, edit(CLIENT, before, after))))
        .contains("removed-check");
  }

  @Test
  public void refusesALoosenedSchema() {
    String before = "{\n  \"required\": [\"balance\", \"currency\"]\n}";
    String dropsRequired = "{\n  \"required\": [\"currency\"]\n}";
    String allowsAnything =
        "{\n  \"required\": [\"balance\", \"currency\"],\n  \"additionalProperties\": true\n}";

    assertThat(rules(patch(Category.CONTRACT_DRIFT, edit(SCHEMA, before, dropsRequired))))
        .contains("loosened-schema");
    assertThat(rules(patch(Category.CONTRACT_DRIFT, edit(SCHEMA, before, allowsAnything))))
        .contains("loosened-schema");
  }

  @Test
  public void neverHealsProductBugsEnvironmentOrUnknown() {
    for (Category category :
        List.of(Category.PRODUCT_BUG, Category.ENVIRONMENT, Category.UNKNOWN)) {
      assertThat(rules(patch(category, edit(CLIENT, "a\n", "b\n"))))
          .containsExactly("not-healable");
    }
  }
}
