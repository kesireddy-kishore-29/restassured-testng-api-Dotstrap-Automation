package com.kishore.qa.framework.clients;

import com.kishore.qa.framework.core.ApiClient;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.core.Endpoint;
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
