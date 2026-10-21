package com.qaautomation.tools.triage;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.qaautomation.tools.ai.AiProvider;
import com.qaautomation.tools.ai.AiResult;
import com.qaautomation.tools.model.TestResult;
import com.qaautomation.tools.shared.Json;
import java.util.List;
import java.util.Optional;
import org.testng.annotations.Test;

public class AiTriageTest {

  private static final FailureContext CONTEXT =
      new FailureContext(
          new TestResult(
              "pkg.T#m",
              "m",
              "functional",
              List.of("FEAT-X-01"),
              List.of(),
              "failed",
              1,
              1,
              false,
              new TestResult.ErrorInfo("java.lang.IllegalStateException", "odd", ""),
              null),
          List.of());
  private static final Classification UNKNOWN =
      Classification.byRule(Category.UNKNOWN, 0.3, "no-rule-matched", "?");

  private static AiProvider answering(String category) {
    return new AiProvider() {
      @Override
      public String name() {
        return "fake";
      }

      @Override
      public AiResult completeJson(String system, String user, JsonNode schema) {
        return AiResult.ok(
            Json.mapper().createObjectNode().put("category", category).put("reason", "because"));
      }
    };
  }

  @Test
  public void withoutAProviderTheRulesDecideAndTheStepIsMarkedSkipped() {
    AiTriage ai = new AiTriage(Optional.empty());

    assertThat(ai.refine(UNKNOWN, CONTEXT)).isSameAs(UNKNOWN);
    assertThat(ai.status()).startsWith("skipped");
  }

  @Test
  public void theModelIsAskedOnlyAboutUnknownsAndIsLabelledAsSuch() {
    AiTriage ai = new AiTriage(Optional.of(answering("TIMING")));
    Classification decided =
        Classification.byRule(Category.PRODUCT_BUG, 0.75, "behaviour-assertion", "x");

    assertThat(ai.refine(decided, CONTEXT)).isSameAs(decided);
    Classification refined = ai.refine(UNKNOWN, CONTEXT);
    assertThat(refined.category()).isEqualTo(Category.TIMING);
    assertThat(refined.classifiedBy()).isEqualTo("llm");
  }

  @Test
  public void anAnswerOutsideTheCategoriesIsIgnored() {
    assertThat(new AiTriage(Optional.of(answering("FIX_EVERYTHING"))).refine(UNKNOWN, CONTEXT))
        .isSameAs(UNKNOWN);
  }
}
