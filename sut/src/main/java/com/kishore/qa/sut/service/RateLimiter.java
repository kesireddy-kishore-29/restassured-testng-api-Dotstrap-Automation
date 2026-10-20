package com.kishore.qa.sut.service;

import java.time.Clock;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/** Fixed-window rate limiter keyed by caller (token, or client address when anonymous). */
public final class RateLimiter {

  /** The verdict for one request, with the values for the RateLimit-* response headers. */
  public record Decision(boolean allowed, int limit, int remaining, long resetSeconds) {}

  private static final class Window {
    private long startMillis;
    private int count;
  }

  private final int limit;
  private final Duration window;
  private final Clock clock;
  private final ConcurrentMap<String, Window> windows = new ConcurrentHashMap<>();

  public RateLimiter(int limit, Duration window, Clock clock) {
    this.limit = limit;
    this.window = window;
    this.clock = clock;
  }

  public Decision check(String key) {
    long now = clock.millis();
    Window w = windows.computeIfAbsent(key, k -> new Window());
    synchronized (w) {
      if (now - w.startMillis >= window.toMillis()) {
        w.startMillis = now;
        w.count = 0;
      }
      long resetMillis = w.startMillis + window.toMillis() - now;
      long resetSeconds = Math.max(1, (resetMillis + 999) / 1000);
      if (w.count >= limit) {
        return new Decision(false, limit, 0, resetSeconds);
      }
      w.count++;
      return new Decision(true, limit, limit - w.count, resetSeconds);
    }
  }
}
