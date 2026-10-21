package com.qaautomation.framework.clients;

import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Optional;

/** {@code GET /health} on the reference service. */
public final class HealthClient extends ApiClient {

  public HealthClient(Endpoint endpoint) {
    super(endpoint.baseUri(), endpoint.specs(), Optional.empty(), endpoint.retryPolicy());
  }

  public ApiResponse health() {
    return get("/health", CallOptions.none());
  }
}
