package com.qaautomation.sut.web;

import com.qaautomation.sut.api.Api.CreateAccountRequest;
import com.qaautomation.sut.api.Api.TokenRequest;
import com.qaautomation.sut.api.Api.TokenView;
import com.qaautomation.sut.api.Api.UpdateAccountRequest;
import com.qaautomation.sut.api.ProblemException.FieldError;
import com.qaautomation.sut.api.Problems;
import com.qaautomation.sut.domain.Account;
import com.qaautomation.sut.service.AccountService;
import com.qaautomation.sut.service.ConversationService;
import com.qaautomation.sut.service.DataPlane;
import com.qaautomation.sut.service.TokenService;
import io.javalin.http.Context;
import java.time.Duration;
import java.util.List;

/** Accounts and tokens. */
final class AccountHandlers {

  private final Http http;
  private final AccountService accounts;
  private final ConversationService conversations;
  private final TokenService tokens;
  private final DataPlane plane;
  private final Duration defaultTtl;

  AccountHandlers(
      Http http,
      AccountService accounts,
      ConversationService conversations,
      TokenService tokens,
      DataPlane plane,
      Duration defaultTtl) {
    this.http = http;
    this.accounts = accounts;
    this.conversations = conversations;
    this.tokens = tokens;
    this.plane = plane;
    this.defaultTtl = defaultTtl;
  }

  void create(Context ctx) {
    Account account = accounts.create(http.body(ctx, CreateAccountRequest.class));
    ctx.header("Location", "/v1/accounts/" + account.handle());
    ctx.header("X-Served-Region", account.region().code());
    ctx.status(201).json(Views.account(account));
  }

  void token(Context ctx) {
    TokenRequest request = http.body(ctx, TokenRequest.class);
    Duration ttl = defaultTtl;
    if (request.ttlSeconds() != null) {
      int seconds = request.ttlSeconds();
      if (seconds < 1 || seconds > 3600) {
        throw Problems.validation(List.of(new FieldError("ttlSeconds", "1-3600")));
      }
      ttl = Duration.ofSeconds(seconds);
    }
    Account account = accounts.authenticate(request.handle(), request.password());
    String token = tokens.issue(account.id(), ttl);
    ctx.header("Cache-Control", "no-store");
    ctx.json(new TokenView(token, "Bearer", ttl.toSeconds(), account.id()));
  }

  void me(Context ctx) {
    ctx.json(Views.account(http.caller(ctx)));
  }

  void update(Context ctx) {
    Account caller = http.caller(ctx);
    UpdateAccountRequest request = http.body(ctx, UpdateAccountRequest.class);
    ctx.json(Views.account(accounts.updateDisplayName(caller, request.displayName())));
  }

  void delete(Context ctx) {
    accounts.delete(http.caller(ctx), conversations);
    ctx.status(204);
  }

  void publicProfile(Context ctx) {
    http.caller(ctx);
    String handle = ctx.pathParam("handle");
    Account account =
        plane
            .accountByHandle(handle)
            .orElseThrow(() -> Problems.notFound("No account with handle '" + handle + "'."));
    ctx.json(Views.publicProfile(account));
  }
}
