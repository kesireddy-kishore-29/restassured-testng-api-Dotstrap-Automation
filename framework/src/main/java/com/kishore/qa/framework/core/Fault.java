package com.kishore.qa.framework.core;

import java.time.Duration;
import java.util.UUID;

/**
 * A fault the reference service injects on request ({@code X-Fault}), keyed so it fires once and a
 * retry with the same key gets through. Test-only; the public targets ignore these headers.
 */
public record Fault(String header, String key) {

  /** The service does the work and then answers 503, as if the response was lost. */
  public static Fault dropResponse() {
    return new Fault("drop-response", UUID.randomUUID().toString());
  }

  /** The service answers 503 + Retry-After: 1 once, then normally. */
  public static Fault unavailableOnce() {
    return new Fault("unavailable-once", UUID.randomUUID().toString());
  }

  /** The service waits this long before answering. */
  public static Fault latency(Duration delay) {
    return new Fault("latency=" + delay.toMillis(), UUID.randomUUID().toString());
  }
}
