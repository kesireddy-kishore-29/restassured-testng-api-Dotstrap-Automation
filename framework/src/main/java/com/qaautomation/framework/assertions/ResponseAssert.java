package com.qaautomation.framework.assertions;

import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.schemas.SchemaValidator;
import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.assertj.core.api.AbstractAssert;

/**
 * Fluent assertions on an {@link ApiResponse}. Failure messages always name the call and include
 * the body, so a red test explains itself without opening the transcript.
 */
public final class ResponseAssert extends AbstractAssert<ResponseAssert, ApiResponse> {

  private static final String PROBLEM_TYPE_BASE = "https://reference-service.example/problems/";

  ResponseAssert(ApiResponse actual) {
    super(actual, ResponseAssert.class);
  }

  public ResponseAssert hasStatus(int expected) {
    isNotNull();
    if (actual.status() != expected) {
      failWithMessage(
          "Expected %s to answer %d but it answered %d.%nBody: %s",
          actual, expected, actual.status(), abbreviate(actual.body()));
    }
    return this;
  }

  /** The body matches {@code schemas/<schemaName>.schema.json}. */
  public ResponseAssert matchesContract(String schemaName) {
    isNotNull();
    List<String> violations = SchemaValidator.validate(schemaName, actual.body());
    if (!violations.isEmpty()) {
      throw new ContractViolation(
          "JSON Schema '" + schemaName + "' violated by " + actual, violations);
    }
    return this;
  }

  /** An RFC 7807 problem: problem+json content type and a body matching the problem schema. */
  public ResponseAssert isProblemJson() {
    isNotNull();
    String contentType = Optional.ofNullable(actual.contentType()).orElse("");
    if (!contentType.toLowerCase(Locale.ROOT).startsWith("application/problem+json")) {
      failWithMessage(
          "Expected %s to answer application/problem+json but the content type was '%s'",
          actual, contentType);
    }
    matchesContract("problem");
    if (actual.json().getInt("status") != actual.status()) {
      failWithMessage(
          "Problem body status %d does not match HTTP status %d",
          actual.json().getInt("status"), actual.status());
    }
    return this;
  }

  /** A problem of this HTTP status whose {@code type} ends in this slug. */
  public ResponseAssert isProblem(int status, String typeSlug) {
    hasStatus(status);
    isProblemJson();
    String type = actual.json().getString("type");
    if (!(PROBLEM_TYPE_BASE + typeSlug).equals(type)) {
      failWithMessage("Expected problem type '%s' from %s but got '%s'", typeSlug, actual, type);
    }
    return this;
  }

  /** A 422 problem that names this field among its errors. */
  public ResponseAssert hasFieldError(String field) {
    isProblem(422, "validation-failed");
    List<String> fields = actual.json().getList("errors.field", String.class);
    if (fields == null || !fields.contains(field)) {
      failWithMessage("Expected a validation error on '%s' but errors were on %s", field, fields);
    }
    return this;
  }

  public ResponseAssert hasHeader(String name) {
    isNotNull();
    if (actual.header(name).isEmpty()) {
      failWithMessage("Expected header '%s' on %s but it was absent", name, actual);
    }
    return this;
  }

  public ResponseAssert hasHeader(String name, String expected) {
    hasHeader(name);
    String value = actual.header(name).orElseThrow();
    if (!value.equals(expected)) {
      failWithMessage(
          "Expected header '%s: %s' on %s but it was '%s'", name, expected, actual, value);
    }
    return this;
  }

  public ResponseAssert doesNotHaveHeader(String name) {
    isNotNull();
    actual
        .header(name)
        .ifPresent(
            v -> failWithMessage("Expected no '%s' header on %s but found '%s'", name, actual, v));
    return this;
  }

  public ResponseAssert respondedWithin(Duration limit) {
    isNotNull();
    if (actual.elapsed().compareTo(limit) > 0) {
      failWithMessage(
          "%s took %d ms; the limit is %d ms",
          actual, actual.elapsed().toMillis(), limit.toMillis());
    }
    return this;
  }

  private static String abbreviate(String body) {
    if (body == null) {
      return "(none)";
    }
    return body.length() > 600 ? body.substring(0, 600) + "…" : body;
  }
}
