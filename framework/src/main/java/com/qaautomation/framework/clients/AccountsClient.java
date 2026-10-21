package com.qaautomation.framework.clients;

import com.qaautomation.framework.clients.model.DisplayNameChange;
import com.qaautomation.framework.clients.model.NewAccount;
import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Optional;
import java.util.function.Supplier;

/** Accounts: create (anonymous), the caller's own account, and public profiles. */
public final class AccountsClient extends ApiClient {

  public AccountsClient(Endpoint endpoint, Optional<Supplier<String>> bearerToken) {
    super(endpoint.baseUri(), endpoint.specs(), bearerToken, endpoint.retryPolicy());
  }

  public ApiResponse create(NewAccount account) {
    return post("/v1/accounts", account, CallOptions.none());
  }

  /** Sends the body verbatim, for malformed-JSON and wrong-content-type checks. */
  public ApiResponse createRaw(String body, String contentType) {
    return postRaw("/v1/accounts", body, contentType, CallOptions.none());
  }

  public ApiResponse me() {
    return me(CallOptions.none());
  }

  public ApiResponse me(CallOptions options) {
    return get("/v1/accounts/me", options);
  }

  public ApiResponse changeDisplayName(String displayName) {
    return patch("/v1/accounts/me", new DisplayNameChange(displayName), CallOptions.none());
  }

  public ApiResponse deleteMe() {
    return delete("/v1/accounts/me", CallOptions.none());
  }

  public ApiResponse publicProfile(String handle) {
    return get("/v1/accounts/{handle}", CallOptions.none(), handle);
  }
}
