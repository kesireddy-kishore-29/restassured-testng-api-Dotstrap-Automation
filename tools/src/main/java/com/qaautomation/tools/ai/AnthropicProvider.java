package com.qaautomation.tools.ai;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.qaautomation.tools.shared.Json;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;

/**
 * Claude via the Messages API over plain {@code java.net.http} (one dependency fewer than the SDK
 * for a CI tool that makes at most a handful of calls). JSON comes back through structured outputs
 * ({@code output_config.format}), never by parsing free text. A refused or truncated answer is
 * reported as unavailable, and the caller falls back to the rules.
 */
public final class AnthropicProvider implements AiProvider {

  static final URI ENDPOINT = URI.create("https://api.anthropic.com/v1/messages");
  static final String MODEL = "claude-opus-5-5";
  static final String FALLBACK_BETA = "server-side-fallback-2026-07-01";
  private static final Duration TIMEOUT = Duration.ofSeconds(120);

  private final HttpClient http;
  private final String apiKey;

  AnthropicProvider(HttpClient http, String apiKey) {
    this.http = http;
    this.apiKey = apiKey;
  }

  /** Configured from {@code ANTHROPIC_API_KEY}; empty (rules only) when it is not set. */
  public static Optional<AiProvider> fromEnvironment(Map<String, String> env) {
    String key = env.get("ANTHROPIC_API_KEY");
    if (key == null || key.isBlank()) {
      return Optional.empty();
    }
    HttpClient http = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
    return Optional.of(new AnthropicProvider(http, key));
  }

  @Override
  public String name() {
    return "anthropic:" + MODEL;
  }

  /** The request body. Package-private so the unit test can check its shape without a network. */
  static ObjectNode requestBody(String system, String user, JsonNode schema) {
    ObjectNode body = Json.mapper().createObjectNode();
    body.put("model", MODEL);
    body.put("max_tokens", 16_000);
    body.put("system", system);
    ArrayNode messages = body.putArray("messages");
    messages.addObject().put("role", "user").put("content", user);
    ObjectNode outputConfig = body.putObject("output_config");
    outputConfig.put("effort", "medium");
    ObjectNode format = outputConfig.putObject("format");
    format.put("type", "json_schema");
    format.set("schema", schema);
    // On a safety decline, let the API re-run the request on its recommended fallback model.
    body.put("fallbacks", "default");
    return body;
  }

  /** Reads the structured answer out of a Messages API response. */
  static AiResult parseResponse(JsonNode response) {
    String stopReason = response.path("stop_reason").asText("");
    if ("refusal".equals(stopReason)) {
      return AiResult.unavailable("model declined (stop_reason=refusal)");
    }
    if ("max_tokens".equals(stopReason)) {
      return AiResult.unavailable("answer truncated (stop_reason=max_tokens)");
    }
    for (JsonNode block : response.path("content")) {
      if ("text".equals(block.path("type").asText())) {
        try {
          return AiResult.ok(Json.mapper().readTree(block.path("text").asText()));
        } catch (IOException e) {
          return AiResult.unavailable("answer was not valid JSON");
        }
      }
    }
    return AiResult.unavailable("no text block in the answer");
  }

  @Override
  public AiResult completeJson(String system, String user, JsonNode schema) {
    HttpRequest request =
        HttpRequest.newBuilder(ENDPOINT)
            .timeout(TIMEOUT)
            .header("content-type", "application/json")
            .header("x-api-key", apiKey)
            .header("anthropic-version", "2023-06-01")
            .header("anthropic-beta", FALLBACK_BETA)
            .POST(
                HttpRequest.BodyPublishers.ofString(Json.toJson(requestBody(system, user, schema))))
            .build();
    try {
      HttpResponse<String> response = http.send(request, HttpResponse.BodyHandlers.ofString());
      int status = response.statusCode();
      if (status == 429 || status == 529 || status >= 500) {
        return AiResult.unavailable("provider busy or failing (HTTP " + status + "); rules used");
      }
      if (status != 200) {
        return AiResult.unavailable("request rejected (HTTP " + status + ")");
      }
      return parseResponse(Json.mapper().readTree(response.body()));
    } catch (IOException e) {
      return AiResult.unavailable("provider unreachable: " + e.getClass().getSimpleName());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return AiResult.unavailable("interrupted");
    }
  }
}
