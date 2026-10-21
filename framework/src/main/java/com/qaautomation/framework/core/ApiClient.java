package com.qaautomation.framework.core;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Base of every typed client. Owns the base URI, the optional bearer token and the retry policy,
 * and turns one operation into one call: {@code get("/v1/conversations/{id}", options, id)}.
 * Subclasses expose one method per operation; nothing outside the framework builds a request.
 */
public abstract class ApiClient {

  /** HTTP methods the clients use, with the property that decides retry safety. */
  protected enum Method {
    GET(true),
    POST(false),
    PUT(true),
    PATCH(false),
    DELETE(true),
    OPTIONS(true);

    private final boolean idempotent;

    Method(boolean idempotent) {
      this.idempotent = idempotent;
    }
  }

  private final URI baseUri;
  private final RequestSpecs specs;
  private final Optional<Supplier<String>> bearerToken;
  private final RetryPolicy retryPolicy;

  protected ApiClient(
      URI baseUri,
      RequestSpecs specs,
      Optional<Supplier<String>> bearerToken,
      RetryPolicy retryPolicy) {
    this.baseUri = Objects.requireNonNull(baseUri, "baseUri");
    this.specs = Objects.requireNonNull(specs, "specs");
    this.bearerToken = Objects.requireNonNull(bearerToken, "bearerToken");
    this.retryPolicy = Objects.requireNonNull(retryPolicy, "retryPolicy");
  }

  protected URI baseUri() {
    return baseUri;
  }

  protected RequestSpecs specs() {
    return specs;
  }

  protected Optional<Supplier<String>> bearerToken() {
    return bearerToken;
  }

  protected RetryPolicy retryPolicy() {
    return retryPolicy;
  }

  protected ApiResponse get(String path, CallOptions options, Object... pathParams) {
    return send(Method.GET, path, null, options, pathParams);
  }

  protected ApiResponse post(String path, Object body, CallOptions options, Object... pathParams) {
    return send(Method.POST, path, body, options, pathParams);
  }

  protected ApiResponse put(String path, Object body, CallOptions options, Object... pathParams) {
    return send(Method.PUT, path, body, options, pathParams);
  }

  protected ApiResponse patch(String path, Object body, CallOptions options, Object... pathParams) {
    return send(Method.PATCH, path, body, options, pathParams);
  }

  protected ApiResponse delete(String path, CallOptions options, Object... pathParams) {
    return send(Method.DELETE, path, null, options, pathParams);
  }

  protected ApiResponse options(String path, CallOptions options, Object... pathParams) {
    return send(Method.OPTIONS, path, null, options, pathParams);
  }

  /** A POST whose body is sent verbatim with this content type (negative tests: bad JSON, 415). */
  protected ApiResponse postRaw(
      String path, String rawBody, String contentType, CallOptions options, Object... pathParams) {
    return retryPolicy.execute(
        "POST " + path,
        false,
        () -> {
          RequestSpecification spec = given().spec(specs.forBase(baseUri));
          bearerToken.ifPresent(token -> spec.auth().oauth2(token.get()));
          spec.headers(options.headers()).contentType(contentType).body(rawBody);
          return new ApiResponse("POST", path, spec.request("POST", path, pathParams));
        });
  }

  private ApiResponse send(
      Method method, String path, Object body, CallOptions options, Object... pathParams) {
    boolean repeatable = method.idempotent || options.idempotencyKey().isPresent();
    return retryPolicy.execute(
        method + " " + path,
        repeatable,
        () -> {
          RequestSpecification spec = given().spec(specs.forBase(baseUri));
          bearerToken.ifPresent(token -> spec.auth().oauth2(token.get()));
          spec.headers(options.headers());
          if (body != null) {
            spec.body(body);
          }
          Response raw = spec.request(method.name(), path, pathParams);
          return new ApiResponse(method.name(), path, raw);
        });
  }
}
