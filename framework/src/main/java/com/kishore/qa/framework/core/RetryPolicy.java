package com.kishore.qa.framework.core;

import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Bounded retries for the two transient outcomes a client should absorb: a 503 (honouring
 * Retry-After, capped) and a read timeout. A request is retried only when it is safe to repeat: an
 * idempotent method, or a POST carrying an Idempotency-Key. A 429 is never retried here; a test
 * must be able to see rate limiting, and hammering a limited endpoint is the wrong reflex.
 */
public final class RetryPolicy {

  static final Duration MAX_BACKOFF = Duration.ofSeconds(5);
  static final Duration DEFAULT_BACKOFF = Duration.ofSeconds(1);

  private final int maxRetries;
  private final Duration readTimeout;
  private final Sleeper sleeper;

  public RetryPolicy(int maxRetries, Duration readTimeout, Sleeper sleeper) {
    if (maxRetries < 0 || maxRetries > 3) {
      throw new IllegalArgumentException("maxRetries must be 0..3, was " + maxRetries);
    }
    this.maxRetries = maxRetries;
    this.readTimeout = readTimeout;
    this.sleeper = sleeper;
  }

  public static RetryPolicy none(Duration readTimeout) {
    return new RetryPolicy(0, readTimeout, Sleeper.system());
  }

  public int maxRetries() {
    return maxRetries;
  }

  public ApiResponse execute(String call, boolean repeatable, Supplier<ApiResponse> attempt) {
    int attempts = 0;
    while (true) {
      attempts++;
      boolean mayRetry = repeatable && attempts <= maxRetries;
      ApiResponse response;
      try {
        response = attempt.get();
      } catch (RuntimeException e) {
        if (!isTimeout(e)) {
          throw e;
        }
        if (mayRetry) {
          continue;
        }
        throw new ApiTimeoutException(call, readTimeout, attempts, e);
      }
      if (response.status() == 503 && mayRetry) {
        pause(backoff(response));
        continue;
      }
      return response;
    }
  }

  static Duration backoff(ApiResponse response) {
    return response
        .header("Retry-After")
        .flatMap(RetryPolicy::seconds)
        .map(d -> d.compareTo(MAX_BACKOFF) > 0 ? MAX_BACKOFF : d)
        .orElse(DEFAULT_BACKOFF);
  }

  private static Optional<Duration> seconds(String value) {
    try {
      long parsed = Long.parseLong(value.trim());
      return parsed < 0 ? Optional.empty() : Optional.of(Duration.ofSeconds(parsed));
    } catch (NumberFormatException e) {
      return Optional.empty();
    }
  }

  private void pause(Duration duration) {
    try {
      sleeper.sleep(duration);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new IllegalStateException("Interrupted while honouring Retry-After", e);
    }
  }

  static boolean isTimeout(Throwable error) {
    for (Throwable t = error; t != null; t = t.getCause()) {
      if (t instanceof InterruptedIOException) {
        return true;
      }
    }
    return false;
  }
}
