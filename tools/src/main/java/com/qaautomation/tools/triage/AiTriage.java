package com.qaautomation.tools.triage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.qaautomation.tools.ai.AiProvider;
import com.qaautomation.tools.ai.AiResult;
import com.qaautomation.tools.shared.Json;
import java.util.Arrays;
import java.util.Optional;

/**
 * Second opinion for failures the rules could not place. The model may only answer with one of the
 * seven categories; its answer is labelled {@code classifiedBy: llm} so a reader always knows which
 * decisions were deterministic.
 */
public final class AiTriage {

  private static final String SYSTEM =
      "You classify automated API test failures for a CI pipeline. Choose exactly one category. "
          + "PRODUCT_BUG means the service behaved wrongly; ENVIRONMENT means network or service "
          + "availability; CONTRACT_DRIFT means the response shape changed; TEST_DATA means data "
          + "collided or leaked; TIMING means a race or wait; LOCATOR_DRIFT applies to UI only. "
          + "If the evidence is insufficient, answer UNKNOWN. Keep the reason to one sentence.";

  private final Optional<AiProvider> provider;

  public AiTriage(Optional<AiProvider> provider) {
    this.provider = provider;
  }

  /** "skipped (...)" when no provider is configured; otherwise the provider's name. */
  public String status() {
    return provider.map(AiProvider::name).orElse("skipped (ANTHROPIC_API_KEY not set)");
  }

  public Classification refine(Classification byRules, FailureContext context) {
    if (byRules.category() != Category.UNKNOWN || provider.isEmpty()) {
      return byRules;
    }
    String evidence =
        "Test: "
            + context.test().id()
            + "\nException: "
            + context.test().errorType()
            + "\nMessage:\n"
            + truncate(context.test().errorMessage(), 4000)
            + "\nLast call: "
            + context
                .failingCall()
                .map(JsonNode::toString)
                .map(s -> truncate(s, 3000))
                .orElse("(none)");
    AiResult result = provider.get().completeJson(SYSTEM, evidence, schema());
    if (result.json().isEmpty()) {
      return byRules;
    }
    JsonNode answer = result.json().get();
    try {
      Category category = Category.valueOf(answer.path("category").asText());
      return new Classification(
          category, 0.6, "llm", "llm", answer.path("reason").asText("(no reason given)"));
    } catch (IllegalArgumentException e) {
      return byRules;
    }
  }

  static JsonNode schema() {
    ObjectNode schema = Json.mapper().createObjectNode();
    schema.put("type", "object");
    schema.put("additionalProperties", false);
    ObjectNode properties = schema.putObject("properties");
    ArrayNode values = properties.putObject("category").put("type", "string").putArray("enum");
    Arrays.stream(Category.values()).forEach(c -> values.add(c.name()));
    properties.putObject("reason").put("type", "string");
    schema.putArray("required").add("category").add("reason");
    return schema;
  }

  private static String truncate(String text, int max) {
    return text.length() > max ? text.substring(0, max) + "…" : text;
  }
}
