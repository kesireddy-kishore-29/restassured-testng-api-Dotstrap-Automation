package com.qaautomation.framework.clients;

import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Calls any documented operation by its OpenAPI name ({@code "POST /v1/conversations"}) with
 * exactly the token, body and headers given, and never retries. For the error-contract tests, which
 * must reach every documented error on every operation; the typed clients stay the way the other
 * suites talk to the service. Every response still goes through the conformance filter.
 */
public final class ContractProbe extends ApiClient {

  public ContractProbe(Endpoint endpoint, Optional<Supplier<String>> bearerToken) {
    super(endpoint.baseUri(), endpoint.specs(), bearerToken, endpoint.retryPolicy());
  }

  /** The operation with a JSON body (or none when {@code body} is null). */
  public ApiResponse call(String operation, Object body, CallOptions options, Object... params) {
    Op op = Op.parse(operation);
    return send(op.method(), op.path(), body, options, params);
  }

  /** The operation with its body sent verbatim with this content type. */
  public ApiResponse callRaw(
      String operation, String rawBody, String contentType, CallOptions options, Object... params) {
    Op op = Op.parse(operation);
    return sendRaw(op.method(), op.path(), rawBody, contentType, options, params);
  }

  private record Op(Method method, String path) {
    static Op parse(String operation) {
      String[] parts = operation.trim().split("\\s+", 2);
      if (parts.length != 2 || !parts[1].startsWith("/")) {
        throw new IllegalArgumentException("Not an operation: '" + operation + "'");
      }
      return new Op(Method.valueOf(parts[0].toUpperCase(Locale.ROOT)), parts[1]);
    }
  }
}
