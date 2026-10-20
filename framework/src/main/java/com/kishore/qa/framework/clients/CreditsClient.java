package com.kishore.qa.framework.clients;

import com.kishore.qa.framework.assertions.Contracts;
import com.kishore.qa.framework.clients.model.Balance;
import com.kishore.qa.framework.clients.model.Ledger;
import com.kishore.qa.framework.clients.model.PurchaseRequest;
import com.kishore.qa.framework.core.ApiClient;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.core.Endpoint;
import java.util.Optional;
import java.util.function.Supplier;

/** Credits: balance, ledger and idempotent purchases. */
public final class CreditsClient extends ApiClient {

  public CreditsClient(Endpoint endpoint, Optional<Supplier<String>> bearerToken) {
    super(endpoint.baseUri(), endpoint.specs(), bearerToken, endpoint.retryPolicy());
  }

  public ApiResponse balance() {
    return balance(CallOptions.none());
  }

  public ApiResponse balance(CallOptions options) {
    return get("/v1/credits/balance", options);
  }

  /** The balance, after checking the response is a 200 that honours the balance contract. */
  public int currentBalance() {
    return Contracts.read(balance(), 200, "balance", Balance.class).balance();
  }

  public ApiResponse ledger() {
    return get("/v1/credits/ledger", CallOptions.none());
  }

  /** The ledger, after checking the response is a 200 that honours the ledger contract. */
  public Ledger currentLedger() {
    return Contracts.read(ledger(), 200, "ledger", Ledger.class);
  }

  /** A purchase; pass {@code CallOptions.idempotencyKey(key)} for a real one. */
  public ApiResponse purchase(String packId, CallOptions options) {
    return post("/v1/credits/purchases", new PurchaseRequest(packId), options);
  }
}
