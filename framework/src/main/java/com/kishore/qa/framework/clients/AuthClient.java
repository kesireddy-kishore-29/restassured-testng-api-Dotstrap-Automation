package com.kishore.qa.framework.clients;

import com.kishore.qa.framework.clients.model.TokenRequest;
import com.kishore.qa.framework.core.ApiClient;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.core.Endpoint;
import java.util.Optional;

/** {@code POST /v1/auth/token}: handle + password for a bearer token. */
public final class AuthClient extends ApiClient {

  public AuthClient(Endpoint endpoint) {
    super(endpoint.baseUri(), endpoint.specs(), Optional.empty(), endpoint.retryPolicy());
  }

  public ApiResponse token(String handle, String password) {
    return token(new TokenRequest(handle, password, null));
  }

  public ApiResponse token(TokenRequest request) {
    return post("/v1/auth/token", request, CallOptions.none());
  }
}
