package com.kishore.qa.framework.clients;

import com.kishore.qa.framework.core.ApiClient;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.RequestSpecs;
import java.net.URI;

/** {@code GET /health} on the reference service. */
public final class HealthClient extends ApiClient {

  public HealthClient(URI baseUri, RequestSpecs specs) {
    super(baseUri, specs);
  }

  public ApiResponse health() {
    return get("/health", request());
  }
}
