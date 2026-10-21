package com.qaautomation.framework.clients;

import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Optional;
import java.util.function.Supplier;

/** Administrator-only operations. */
public final class AdminClient extends ApiClient {

  public AdminClient(Endpoint endpoint, Optional<Supplier<String>> bearerToken) {
    super(endpoint.baseUri(), endpoint.specs(), bearerToken, endpoint.retryPolicy());
  }

  public ApiResponse stats() {
    return get("/v1/admin/stats", CallOptions.none());
  }
}
