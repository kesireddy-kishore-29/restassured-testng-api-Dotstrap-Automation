package com.qaautomation.sut.web;

import com.qaautomation.sut.api.Problems;
import com.qaautomation.sut.service.RateLimiter;
import com.qaautomation.sut.service.RateLimiter.Decision;
import io.javalin.http.Context;
import io.javalin.http.HandlerType;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/** Cross-cutting behaviour applied to every request before the endpoint runs. */
final class Middleware {

  static final String EXPOSED_HEADERS =
      "Location, Retry-After, RateLimit-Limit, RateLimit-Remaining, RateLimit-Reset, "
          + "Idempotent-Replayed, X-Correlation-Id, X-Served-Region, X-Data-Region";
  static final String ALLOWED_METHODS = "GET, POST, PATCH, DELETE, OPTIONS";
  static final String ALLOWED_HEADERS =
      "Authorization, Content-Type, Idempotency-Key, X-Correlation-Id";
  private static final Pattern CORRELATION = Pattern.compile("[A-Za-z0-9._-]{1,64}");

  private final List<String> allowedOrigins;
  private final RateLimiter userLimiter;
  private final RateLimiter anonymousLimiter;

  Middleware(List<String> allowedOrigins, RateLimiter userLimiter, RateLimiter anonymousLimiter) {
    this.allowedOrigins = List.copyOf(allowedOrigins);
    this.userLimiter = userLimiter;
    this.anonymousLimiter = anonymousLimiter;
  }

  /** Correlation ID (echoed or generated) and the security headers on every response. */
  void correlationAndSecurityHeaders(Context ctx) {
    String incoming = ctx.header("X-Correlation-Id");
    String correlationId =
        incoming != null && CORRELATION.matcher(incoming).matches()
            ? incoming
            : UUID.randomUUID().toString();
    ctx.attribute(Http.ATTR_CORRELATION, correlationId);
    ctx.header("X-Correlation-Id", correlationId);
    ctx.header("X-Content-Type-Options", "nosniff");
    ctx.header("X-Frame-Options", "DENY");
    ctx.header("Content-Security-Policy", "default-src 'none'; frame-ancestors 'none'");
    ctx.header("Referrer-Policy", "no-referrer");
    ctx.header("Strict-Transport-Security", "max-age=31536000; includeSubDomains");
    ctx.header("Cache-Control", "no-store");
    String edge = ctx.header("X-Edge-Region");
    if (edge != null && !edge.isBlank()) {
      ctx.header("X-Edge-Region", edge);
    }
  }

  /** CORS for simple and actual requests: allow-listed origins only. */
  void cors(Context ctx) {
    String origin = ctx.header("Origin");
    ctx.header("Vary", "Origin");
    if (origin != null && allowedOrigins.contains(origin)) {
      ctx.header("Access-Control-Allow-Origin", origin);
      ctx.header("Access-Control-Expose-Headers", EXPOSED_HEADERS);
    }
  }

  /** CORS preflight: 204 with the allowed methods and headers, or 403 for an unknown origin. */
  void preflight(Context ctx) {
    String origin = ctx.header("Origin");
    if (origin == null || !allowedOrigins.contains(origin)) {
      throw Problems.originDenied(origin == null ? "(none)" : origin);
    }
    ctx.header("Access-Control-Allow-Methods", ALLOWED_METHODS);
    ctx.header("Access-Control-Allow-Headers", ALLOWED_HEADERS);
    ctx.header("Access-Control-Max-Age", "600");
    ctx.status(204);
  }

  /** Per-token (or per-address when anonymous) fixed-window limit on /v1 routes. */
  void rateLimit(Context ctx) {
    if (ctx.method() == HandlerType.OPTIONS) {
      return;
    }
    String authorization = ctx.header("Authorization");
    Decision decision =
        authorization != null && !authorization.isBlank()
            ? userLimiter.check("token:" + authorization)
            : anonymousLimiter.check("ip:" + ctx.ip());
    ctx.header("RateLimit-Limit", Integer.toString(decision.limit()));
    ctx.header("RateLimit-Remaining", Integer.toString(decision.remaining()));
    ctx.header("RateLimit-Reset", Long.toString(decision.resetSeconds()));
    if (!decision.allowed()) {
      throw Problems.rateLimited(decision.resetSeconds());
    }
  }
}
