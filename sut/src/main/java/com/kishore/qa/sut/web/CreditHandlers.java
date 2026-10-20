package com.kishore.qa.sut.web;

import com.kishore.qa.sut.SutSettings.Chaos;
import com.kishore.qa.sut.api.Api.BalanceView;
import com.kishore.qa.sut.api.Api.DriftedBalanceView;
import com.kishore.qa.sut.api.Api.LedgerEntryView;
import com.kishore.qa.sut.api.Api.LedgerView;
import com.kishore.qa.sut.api.Api.PurchaseRequest;
import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.service.CreditService;
import com.kishore.qa.sut.service.CreditService.PurchaseOutcome;
import com.kishore.qa.sut.service.Ledger;
import io.javalin.http.Context;
import java.util.List;

/** Balance, history and idempotent purchases. */
final class CreditHandlers {

  private static final String CURRENCY = "credits";

  private final Http http;
  private final CreditService credits;
  private final Chaos chaos;

  CreditHandlers(Http http, CreditService credits, Chaos chaos) {
    this.http = http;
    this.credits = credits;
    this.chaos = chaos;
  }

  void balance(Context ctx) {
    Account caller = http.caller(ctx);
    int balance = credits.ledgerOf(caller).balance();
    if (chaos == Chaos.RENAME_BALANCE_FIELD) {
      ctx.json(new DriftedBalanceView(balance, CURRENCY, caller.id()));
      return;
    }
    ctx.json(new BalanceView(balance, CURRENCY, caller.id()));
  }

  void ledger(Context ctx) {
    Account caller = http.caller(ctx);
    if (chaos == Chaos.SLOW_LEDGER) {
      Faults.pause(3_000);
    }
    Ledger ledger = credits.ledgerOf(caller);
    List<LedgerEntryView> items = ledger.entries().stream().map(Views::ledgerEntry).toList();
    ctx.json(new LedgerView(items, items.size(), ledger.balance()));
  }

  void purchase(Context ctx) {
    Account caller = http.caller(ctx);
    PurchaseRequest request = http.body(ctx, PurchaseRequest.class);
    PurchaseOutcome outcome =
        credits.purchase(caller, ctx.header("Idempotency-Key"), request.packId());
    ctx.header("Location", "/v1/credits/purchases/" + outcome.purchase().id());
    if (outcome.replayed()) {
      ctx.header("Idempotent-Replayed", "true");
      ctx.status(200);
    } else {
      ctx.status(201);
    }
    ctx.json(Views.purchase(outcome.purchase()));
  }
}
