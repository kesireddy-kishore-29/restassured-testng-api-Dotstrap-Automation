package com.kishore.qa.framework.clients;

import com.kishore.qa.framework.core.ApiClient;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.core.Endpoint;
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
