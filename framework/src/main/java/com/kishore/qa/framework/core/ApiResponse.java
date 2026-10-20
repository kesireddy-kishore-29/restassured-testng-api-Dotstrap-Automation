package com.kishore.qa.framework.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

/**
 * What a client hands back to a test: status, headers, typed body and timing. Tests never see a
 * REST Assured {@code RequestSpecification}; they see this, and assert on it through {@code
 * ApiAssertions.assertThatResponse(...)}.
 */
public final class ApiResponse {

  private final String method;
  private final String path;
  private final Response raw;

  public ApiResponse(String method, String path, Response raw) {
    this.method = method;
    this.path = path;
    this.raw = raw;
  }

  public String method() {
    return method;
  }

  public String path() {
    return path;
  }

  public int status() {
    return raw.statusCode();
  }

  public Optional<String> header(String name) {
    return Optional.ofNullable(raw.header(name));
  }

  public String contentType() {
    return raw.contentType();
  }

  public String body() {
    return raw.asString();
  }

  public JsonPath json() {
    return raw.jsonPath();
  }

  /**
   * The body mapped to a model. Prefer {@code Contracts.read(...)}, which checks the contract
   * first.
   */
  public <T> T as(Class<T> type) {
    try {
      return Json.mapper().readValue(raw.asString(), type);
    } catch (JsonProcessingException e) {
      throw new IllegalStateException("Body of " + this + " is not a " + type.getSimpleName(), e);
    }
  }

  /** A list field of the body, e.g. {@code asList("items", Message.class)}. */
  public <T> List<T> asList(String field, Class<T> type) {
    JsonNode node =
        Json.tryParse(raw.asString())
            .map(root -> root.get(field))
            .orElseThrow(() -> new IllegalStateException("No '" + field + "' in body of " + this));
    return Json.mapper()
        .convertValue(
            node, Json.mapper().getTypeFactory().constructCollectionType(List.class, type));
  }

  public Duration elapsed() {
    return Duration.ofMillis(raw.time());
  }

  @Override
  public String toString() {
    return method + " " + path + " -> " + status();
  }
}
