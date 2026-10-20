package com.kishore.qa.sut.web;

import com.kishore.qa.sut.SutSettings;
import com.kishore.qa.sut.api.Api.HealthView;
import com.kishore.qa.sut.api.Api.StatsView;
import com.kishore.qa.sut.api.ProblemException;
import com.kishore.qa.sut.api.Problems;
import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.domain.Region;
import com.kishore.qa.sut.service.AccountService;
import com.kishore.qa.sut.service.ConversationService;
import com.kishore.qa.sut.service.CreditService;
import com.kishore.qa.sut.service.DataPlane;
import com.kishore.qa.sut.service.RateLimiter;
import com.kishore.qa.sut.service.TokenService;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.HandlerType;
import io.javalin.json.JavalinJackson;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.util.Arrays;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Wires services, middleware and routes into a Javalin application. */
public final class ReferenceService {

  private static final Logger LOG = LoggerFactory.getLogger(ReferenceService.class);

  private final SutSettings settings;
  private final Http http;
  private final AccountService accounts;
  private final CreditService credits;
  private final DataPlane plane;
  private final Middleware middleware;
  private final Faults faults;
  private final AccountHandlers accountHandlers;
  private final ConversationHandlers conversationHandlers;
  private final CreditHandlers creditHandlers;
  private final String openApiDocument;

  public ReferenceService(SutSettings settings, Clock clock) {
    this.settings = settings;
    this.plane = new DataPlane();
    TokenService tokens = new TokenService(clock);
    this.credits = new CreditService(plane, clock);
    ConversationService conversations = new ConversationService(plane, credits, clock);
    this.accounts = new AccountService(plane, tokens, clock);
    this.http = new Http(tokens, plane);
    this.middleware =
        new Middleware(
            settings.allowedOrigins(),
            new RateLimiter(settings.rateLimitPerWindow(), settings.rateLimitWindow(), clock),
            new RateLimiter(
                settings.anonymousRateLimitPerWindow(), settings.rateLimitWindow(), clock));
    this.faults = new Faults(settings.faultsEnabled());
    this.accountHandlers =
        new AccountHandlers(
            http, accounts, conversations, tokens, plane, settings.defaultTokenTtl());
    this.conversationHandlers = new ConversationHandlers(http, conversations);
    this.creditHandlers = new CreditHandlers(http, credits, settings.chaos());
    this.openApiDocument = readOpenApi();
    accounts.createAdmin("admin", settings.adminPassword(), settings.defaultRegion());
  }

  public Javalin create() {
    Javalin app =
        Javalin.create(
            config -> {
              config.showJavalinBanner = false;
              config.jsonMapper(new JavalinJackson(http.mapper(), false));
              config.http.prefer405over404 = true;
              config.router.ignoreTrailingSlashes = true;
            });

    app.before(middleware::correlationAndSecurityHeaders);
    app.before(middleware::cors);
    app.before(faults::before);
    app.before("/v1/*", middleware::rateLimit);
    app.after(this::dropResponseIfInjected);

    app.get("/health", this::health);
    app.get("/openapi.yaml", this::openApi);

    Routes routes = new Routes(app);
    routes.add(HandlerType.POST, "/v1/auth/token", accountHandlers::token);
    routes.add(HandlerType.POST, "/v1/accounts", accountHandlers::create);
    routes.add(HandlerType.GET, "/v1/accounts/me", accountHandlers::me);
    routes.add(HandlerType.PATCH, "/v1/accounts/me", accountHandlers::update);
    routes.add(HandlerType.DELETE, "/v1/accounts/me", accountHandlers::delete);
    routes.add(HandlerType.GET, "/v1/accounts/{handle}", accountHandlers::publicProfile);

    routes.add(HandlerType.POST, "/v1/conversations", conversationHandlers::start);
    routes.add(HandlerType.GET, "/v1/conversations", conversationHandlers::list);
    routes.add(HandlerType.GET, "/v1/conversations/{id}", conversationHandlers::get);
    routes.add(HandlerType.GET, "/v1/conversations/{id}/messages", conversationHandlers::messages);
    routes.add(HandlerType.POST, "/v1/conversations/{id}/messages", conversationHandlers::send);
    routes.add(HandlerType.POST, "/v1/conversations/{id}/read", conversationHandlers::read);
    routes.add(HandlerType.POST, "/v1/conversations/{id}/close", conversationHandlers::close);

    routes.add(HandlerType.GET, "/v1/credits/balance", creditHandlers::balance);
    routes.add(HandlerType.GET, "/v1/credits/ledger", creditHandlers::ledger);
    routes.add(HandlerType.POST, "/v1/credits/purchases", creditHandlers::purchase);

    routes.add(HandlerType.GET, "/v1/admin/stats", this::adminStats);

    // CORS preflight on every declared path only, so an unknown path stays a 404.
    routes.addPreflight(middleware::preflight);

    app.exception(ProblemException.class, (e, ctx) -> http.problem(ctx, e));
    app.exception(
        Exception.class,
        (e, ctx) -> {
          LOG.error("Unhandled error on {} {}", ctx.method(), ctx.path(), e);
          http.problem(ctx, Problems.internal());
        });
    app.error(404, ctx -> problemIfMissing(ctx, Problems.notFound("No route for " + ctx.path())));
    app.error(405, ctx -> problemIfMissing(ctx, Problems.methodNotAllowed(ctx.method().name())));
    return app;
  }

  private void health(Context ctx) {
    ctx.json(
        new HealthView(
            "UP",
            settings.version(),
            settings.defaultRegion().code(),
            Arrays.stream(Region.values()).map(Region::code).toList(),
            settings.faultsEnabled()));
  }

  private void openApi(Context ctx) {
    ctx.contentType("application/yaml").result(openApiDocument);
  }

  private void adminStats(Context ctx) {
    Account caller = http.caller(ctx);
    if (caller.role() != Account.Role.ADMIN) {
      throw Problems.forbidden("Administrators only.");
    }
    ctx.json(
        new StatsView(plane.accountCount(), plane.conversationCount(), credits.purchaseCount()));
  }

  /** {@code X-Fault: drop-response}: the work is done, but the caller is told 503. */
  private void dropResponseIfInjected(Context ctx) {
    boolean drop = Boolean.TRUE.equals(ctx.attribute(Faults.ATTR_DROP));
    int status = ctx.statusCode();
    if (drop && status >= 200 && status < 300) {
      http.problem(
          ctx,
          Problems.faultInjected("Injected: the request completed but the response was lost."));
    }
  }

  private void problemIfMissing(Context ctx, ProblemException problem) {
    if (!Boolean.TRUE.equals(ctx.attribute(Http.ATTR_PROBLEM))) {
      http.problem(ctx, problem);
    }
  }

  private static String readOpenApi() {
    try (InputStream in =
        ReferenceService.class.getResourceAsStream("/openapi/reference-service.yaml")) {
      return new String(
          Objects.requireNonNull(in, "openapi document").readAllBytes(), StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
