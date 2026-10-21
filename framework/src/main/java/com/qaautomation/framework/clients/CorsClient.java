package com.qaautomation.framework.clients;

import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * What a browser does before and during a cross-origin call: an OPTIONS preflight and a request
 * carrying {@code Origin}. Preflights are not API operations, so this client's endpoint has no
 * OpenAPI check.
 */
public final class CorsClient extends ApiClient {

  public CorsClient(Endpoint endpoint, Optional<Supplier<String>> bearerToken) {
    super(endpoint.baseUri(), endpoint.specs(), bearerToken, endpoint.retryPolicy());
  }

  public ApiResponse preflight(String path, String origin, String method, String requestHeaders) {
    return options(
        path,
        CallOptions.none()
            .withOrigin(origin)
            .withHeader("Access-Control-Request-Method", method)
            .withHeader("Access-Control-Request-Headers", requestHeaders));
  }

  public ApiResponse getFrom(String path, String origin) {
    return get(path, CallOptions.none().withOrigin(origin));
  }
}
