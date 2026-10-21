package com.kishore.qa.tools.ai;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.kishore.qa.tools.shared.Json;
import java.io.IOException;
import java.util.Map;
import org.testng.annotations.Test;

/** No network: the request shape and the response handling, against canned JSON. */
public class AnthropicProviderTest {

  private static JsonNode json(String text) throws IOException {
    return Json.mapper().readTree(text);
  }

  @Test
  public void withoutAKeyThereIsNoProviderAndTheToolsUseRulesOnly() {
    assertThat(AnthropicProvider.fromEnvironment(Map.of())).isEmpty();
    assertThat(AnthropicProvider.fromEnvironment(Map.of("ANTHROPIC_API_KEY", " "))).isEmpty();
  }

  @Test
  public void requestsStructuredJsonWithExplicitEffortAndAServerSideFallback() {
    ObjectNode schema = Json.mapper().createObjectNode().put("type", "object");

    ObjectNode body = AnthropicProvider.requestBody("system text", "user text", schema);

    assertThat(body.path("model").asText()).isEqualTo("claude-opus-5-5");
    assertThat(body.path("output_config").path("effort").asText()).isEqualTo("medium");
    assertThat(body.path("output_config").path("format").path("type").asText())
        .isEqualTo("json_schema");
    assertThat(body.path("output_config").path("format").path("schema")).isEqualTo(schema);
    assertThat(body.path("fallbacks").asText()).isEqualTo("default");
    assertThat(body.has("thinking"))
        .as("thinking cannot be disabled on this model; omit it")
        .isFalse();
    assertThat(body.path("messages").get(0).path("role").asText()).isEqualTo("user");
  }

  @Test
  public void readsTheTextBlockAndSkipsThinkingBlocks() throws IOException {
    JsonNode response =
        json(
            "{\"stop_reason\":\"end_turn\",\"content\":[{\"type\":\"thinking\",\"thinking\":\"\"},"
                + "{\"type\":\"text\",\"text\":\"{\\\"category\\\":\\\"TIMING\\\"}\"}]}");

    AiResult result = AnthropicProvider.parseResponse(response);

    assertThat(result.status()).isEqualTo("ok");
    assertThat(result.json())
        .hasValueSatisfying(j -> assertThat(j.path("category").asText()).isEqualTo("TIMING"));
  }

  @Test
  public void aRefusalOrATruncationIsNeverReadAsAnAnswer() throws IOException {
    assertThat(
            AnthropicProvider.parseResponse(json("{\"stop_reason\":\"refusal\",\"content\":[]}"))
                .json())
        .isEmpty();
    assertThat(
            AnthropicProvider.parseResponse(
                    json(
                        "{\"stop_reason\":\"max_tokens\",\"content\":[{\"type\":\"text\",\"text\":\"{\"}]}"))
                .json())
        .isEmpty();
  }
}
