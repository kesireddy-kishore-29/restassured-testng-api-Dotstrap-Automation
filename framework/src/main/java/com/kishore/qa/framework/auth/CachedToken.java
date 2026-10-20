package com.kishore.qa.framework.auth;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

/** A token and when to stop using it (a safety margin before the real expiry). */
record CachedToken(String value, Instant refreshAfter) {

  static final Duration MARGIN = Duration.ofSeconds(30);

  boolean isUsable(Clock clock) {
    return clock.instant().isBefore(refreshAfter);
  }
}
