package com.kishore.qa.framework.core;

import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;
import java.net.URI;
import java.util.Objects;

/**
 * Base of every typed client. Owns the base URI and hands subclasses a request already carrying the
 * shared specification (timeouts, JSON, correlation ID, transcript capture). Subclasses expose one
 * method per operation; nothing outside the framework builds a request by hand.
 */
public abstract class ApiClient {

  private final URI baseUri;
  private final RequestSpecs specs;

  protected ApiClient(URI baseUri, RequestSpecs specs) {
    this.baseUri = Objects.requireNonNull(baseUri, "baseUri");
    this.specs = Objects.requireNonNull(specs, "specs");
  }

  protected URI baseUri() {
    return baseUri;
  }

  /** A fresh request for this client's base URI. */
  protected RequestSpecification request() {
    return given().spec(specs.forBase(baseUri));
  }

  protected ApiResponse get(String path, RequestSpecification spec) {
    return new ApiResponse("GET", path, spec.get(path));
  }

  protected ApiResponse post(String path, RequestSpecification spec) {
    return new ApiResponse("POST", path, spec.post(path));
  }

  protected ApiResponse put(String path, RequestSpecification spec) {
    return new ApiResponse("PUT", path, spec.put(path));
  }

  protected ApiResponse patch(String path, RequestSpecification spec) {
    return new ApiResponse("PATCH", path, spec.patch(path));
  }

  protected ApiResponse delete(String path, RequestSpecification spec) {
    return new ApiResponse("DELETE", path, spec.delete(path));
  }

  protected ApiResponse options(String path, RequestSpecification spec) {
    return new ApiResponse("OPTIONS", path, spec.options(path));
  }
}
