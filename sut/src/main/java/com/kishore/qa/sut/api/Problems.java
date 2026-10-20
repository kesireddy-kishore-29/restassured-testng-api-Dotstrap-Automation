package com.kishore.qa.sut.api;

import com.kishore.qa.sut.api.ProblemException.FieldError;
import java.util.List;

/** The catalogue of problems the service can return. One method per problem type. */
public final class Problems {

  private Problems() {}

  public static ProblemException malformedJson(String detail) {
    return ProblemException.of(400, "malformed-json", "Malformed JSON body", detail);
  }

  public static ProblemException idempotencyKeyRequired() {
    return ProblemException.of(
        400,
        "idempotency-key-required",
        "Idempotency-Key header required",
        "A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].");
  }

  public static ProblemException unauthenticated() {
    return ProblemException.of(
            401,
            "unauthenticated",
            "Authentication required",
            "Send Authorization: Bearer <token>.")
        .withHeader("WWW-Authenticate", "Bearer");
  }

  public static ProblemException invalidToken() {
    return ProblemException.of(
            401, "invalid-token", "Invalid token", "The token is not recognised.")
        .withHeader("WWW-Authenticate", "Bearer error=\"invalid_token\"");
  }

  public static ProblemException tokenExpired() {
    return ProblemException.of(401, "token-expired", "Token expired", "Request a new token.")
        .withHeader("WWW-Authenticate", "Bearer error=\"invalid_token\"");
  }

  public static ProblemException invalidCredentials() {
    return ProblemException.of(
        401, "invalid-credentials", "Invalid credentials", "Handle or password is wrong.");
  }

  public static ProblemException insufficientCredits(int balance) {
    return ProblemException.of(
        402,
        "insufficient-credits",
        "Insufficient credits",
        "Sending a message costs 1 credit; the balance is " + balance + ".");
  }

  public static ProblemException forbidden(String detail) {
    return ProblemException.of(403, "forbidden", "Forbidden", detail);
  }

  public static ProblemException originDenied(String origin) {
    return ProblemException.of(
        403, "cors-origin-denied", "Origin not allowed", "Origin '" + origin + "' is not allowed.");
  }

  public static ProblemException notFound(String detail) {
    return ProblemException.of(404, "not-found", "Not found", detail);
  }

  public static ProblemException methodNotAllowed(String method) {
    return ProblemException.of(
        405, "method-not-allowed", "Method not allowed", method + " is not supported here.");
  }

  public static ProblemException handleTaken(String handle) {
    return ProblemException.of(
        409, "handle-taken", "Handle already taken", "The handle '" + handle + "' is in use.");
  }

  public static ProblemException conversationClosed() {
    return ProblemException.of(
        409,
        "conversation-closed",
        "Conversation closed",
        "The conversation has been closed and accepts no more messages.");
  }

  public static ProblemException idempotencyKeyReused() {
    return ProblemException.of(
        409,
        "idempotency-key-reused",
        "Idempotency-Key reused with a different request",
        "This key already completed a different purchase. Use a new key for a new purchase.");
  }

  public static ProblemException unsupportedMediaType() {
    return ProblemException.of(
        415,
        "unsupported-media-type",
        "Unsupported media type",
        "Send the body as application/json.");
  }

  public static ProblemException validation(List<FieldError> errors) {
    return ProblemException.of(
            422, "validation-failed", "Validation failed", "One or more fields are invalid.")
        .withErrors(errors);
  }

  public static ProblemException rateLimited(long retryAfterSeconds) {
    return ProblemException.of(
            429,
            "rate-limited",
            "Too many requests",
            "Slow down; retry after " + retryAfterSeconds + " second(s).")
        .withHeader("Retry-After", Long.toString(retryAfterSeconds));
  }

  public static ProblemException internal() {
    return ProblemException.of(
        500, "internal-error", "Internal error", "Something went wrong. It has been logged.");
  }

  public static ProblemException faultInjected(String detail) {
    return ProblemException.of(503, "fault-injected", "Service unavailable (injected)", detail)
        .withHeader("Retry-After", "1");
  }
}
