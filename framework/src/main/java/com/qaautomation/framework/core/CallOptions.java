package com.qaautomation.framework.core;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Per-call extras a test may need to express: an idempotency key, an injected fault, an origin.
 * Kept as data so a test reads {@code credits.purchase("pack-10", CallOptions.idempotencyKey(key))}
 * rather than building headers by hand.
 */
public final class CallOptions {

  private static final CallOptions NONE = new CallOptions(Map.of());

  private final Map<String, String> headers;

  private CallOptions(Map<String, String> headers) {
    this.headers = Map.copyOf(headers);
  }

  public static CallOptions none() {
    return NONE;
  }

  public static CallOptions idempotencyKey(String key) {
    return NONE.withIdempotencyKey(key);
  }

  public CallOptions withIdempotencyKey(String key) {
    return withHeader("Idempotency-Key", key);
  }

  /** Server-side fault injection (reference service only). */
  public CallOptions withFault(Fault fault) {
    return withHeader("X-Fault", fault.header()).withHeader("X-Fault-Key", fault.key());
  }

  public CallOptions withOrigin(String origin) {
    return withHeader("Origin", origin);
  }

  public CallOptions withEdgeRegion(String region) {
    return withHeader("X-Edge-Region", region);
  }

  public CallOptions withHeader(String name, String value) {
    Map<String, String> copy = new LinkedHashMap<>(headers);
    copy.put(name, value);
    return new CallOptions(copy);
  }

  public Map<String, String> headers() {
    return headers;
  }

  public Optional<String> idempotencyKey() {
    return Optional.ofNullable(headers.get("Idempotency-Key"));
  }
}
