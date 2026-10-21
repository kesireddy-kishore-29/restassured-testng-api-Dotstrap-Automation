package com.qaautomation.framework.core;

import java.time.Duration;

/**
 * The one place the framework waits on a clock: the back-off a server asks for with Retry-After. It
 * is bounded by {@link RetryPolicy}, injectable (unit tests pass a recording fake) and never used
 * to wait for application state; that is what Awaitility conditions are for.
 */
@FunctionalInterface
public interface Sleeper {

  void sleep(Duration duration) throws InterruptedException;

  static Sleeper system() {
    return duration -> Thread.sleep(duration.toMillis());
  }
}
