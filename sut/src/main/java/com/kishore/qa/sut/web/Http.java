package com.kishore.qa.sut.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kishore.qa.sut.api.ProblemException;
import com.kishore.qa.sut.api.Problems;
import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.service.DataPlane;
import com.kishore.qa.sut.service.TokenService;
import com.kishore.qa.sut.service.TokenService.Resolution;
import io.javalin.http.Context;
import java.util.Locale;

/** Request/response plumbing shared by every handler: JSON, problems and authentication. */
public final class Http {

  public static final String PROBLEM_JSON = "application/problem+json";
  static final String ATTR_PROBLEM = "problem-written";
  static final String ATTR_CORRELATION = "correlation-id";

  private final ObjectMapper mapper;
  private final TokenService tokens;
  private final DataPlane plane;

  public Http(TokenService tokens, DataPlane plane) {
    this.tokens = tokens;
    this.plane = plane;
    this.mapper =
        new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDefaultPropertyInclusion(
                JsonInclude.Value.construct(
                    JsonInclude.Include.NON_NULL, JsonInclude.Include.NON_NULL));
  }

  public ObjectMapper mapper() {
    return mapper;
  }

  /** Parses the JSON body: 415 when it is not JSON, 400 when it does not parse. */
  public <T> T body(Context ctx, Class<T> type) {
    String contentType = ctx.contentType();
    if (contentType == null
        || !contentType.toLowerCase(Locale.ROOT).startsWith("application/json")) {
      throw Problems.unsupportedMediaType();
    }
    try {
      T parsed = mapper.readValue(ctx.body(), type);
      if (parsed == null) {
        throw Problems.malformedJson("The body is empty.");
      }
      return parsed;
    } catch (JsonProcessingException e) {
      throw Problems.malformedJson("The body is not valid JSON for this operation.");
    }
  }

  /** The signed-in caller. Sets {@code X-Served-Region} to the caller's home region. */
  public Account caller(Context ctx) {
    String header = ctx.header("Authorization");
    if (header == null || header.isBlank()) {
      throw Problems.unauthenticated();
    }
    if (!header.regionMatches(true, 0, "Bearer ", 0, 7)) {
      throw Problems.invalidToken();
    }
    Resolution resolution = tokens.resolve(header.substring(7).trim());
    Account account =
        switch (resolution) {
          case Resolution.Valid valid ->
              plane.account(valid.accountId()).orElseThrow(Problems::invalidToken);
          case Resolution.Expired expired -> throw Problems.tokenExpired();
          case Resolution.Unknown unknown -> throw Problems.invalidToken();
        };
    ctx.header("X-Served-Region", account.region().code());
    return account;
  }

  /** Writes an RFC 7807 body for the problem. */
  public void problem(Context ctx, ProblemException problem) {
    ObjectNode body = mapper.createObjectNode();
    body.put("type", problem.type());
    body.put("title", problem.title());
    body.put("status", problem.status());
    body.put("detail", problem.getMessage());
    body.put("instance", ctx.path());
    Object correlation = ctx.attribute(ATTR_CORRELATION);
    if (correlation != null) {
      body.put("correlationId", correlation.toString());
    }
    if (!problem.errors().isEmpty()) {
      body.set("errors", mapper.valueToTree(problem.errors()));
    }
    problem.headers().forEach(ctx::header);
    ctx.attribute(ATTR_PROBLEM, Boolean.TRUE);
    ctx.status(problem.status()).contentType(PROBLEM_JSON).result(body.toString());
  }

  public String json(Object value) {
    try {
      return mapper.writeValueAsString(value);
    } catch (JsonProcessingException e) {
      throw new IllegalStateException("Cannot serialise " + value.getClass().getSimpleName(), e);
    }
  }
}
