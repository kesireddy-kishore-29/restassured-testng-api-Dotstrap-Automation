package com.qaautomation.sut.api;

import java.io.Serial;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * An error the service reports as RFC 7807 {@code application/problem+json}. Every non-2xx response
 * the service sends is built from one of these.
 */
public final class ProblemException extends RuntimeException {

  @Serial private static final long serialVersionUID = 1L;

  /** Base of every problem {@code type} URI. */
  public static final String TYPE_BASE = "https://reference-service.example/problems/";

  /** A validation failure on one field. */
  public record FieldError(String field, String message) {}

  private final int status;
  private final String slug;
  private final String title;
  private final transient List<FieldError> errors;
  private final transient Map<String, String> headers;

  private ProblemException(
      int status,
      String slug,
      String title,
      String detail,
      List<FieldError> errors,
      Map<String, String> headers) {
    super(detail);
    this.status = status;
    this.slug = slug;
    this.title = title;
    this.errors = List.copyOf(errors);
    this.headers = Map.copyOf(headers);
  }

  public static ProblemException of(int status, String slug, String title, String detail) {
    return new ProblemException(status, slug, title, detail, List.of(), Map.of());
  }

  public ProblemException withErrors(List<FieldError> fieldErrors) {
    return new ProblemException(status, slug, title, getMessage(), fieldErrors, headers);
  }

  public ProblemException withHeader(String name, String value) {
    Map<String, String> copy = new LinkedHashMap<>(headers);
    copy.put(name, value);
    return new ProblemException(status, slug, title, getMessage(), errors, copy);
  }

  public int status() {
    return status;
  }

  public String type() {
    return TYPE_BASE + slug;
  }

  public String title() {
    return title;
  }

  public List<FieldError> errors() {
    return errors;
  }

  public Map<String, String> headers() {
    return headers;
  }
}
