package com.kishore.qa.sut.web;

import com.kishore.qa.sut.api.Problems;
import io.javalin.http.Context;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Test-only fault injection, driven by the {@code X-Fault} request header and enabled by {@code
 * SUT_FAULTS_ENABLED} (default true). This is how the resilience suite proves the client's timeout,
 * retry and idempotency behaviour without a flaky network:
 *
 * <ul>
 *   <li>{@code latency=<ms>}: respond after a delay (capped at 10 s)
 *   <li>{@code drop-response}: do the work, then answer 503 as if the response was lost (only the
 *       first time an {@code X-Fault-Key} is seen, so a retry with the same key gets through)
 *   <li>{@code unavailable-once}: answer 503 + Retry-After the first time an {@code X-Fault-Key} is
 *       seen, then behave normally
 * </ul>
 */
final class Faults {

  static final String ATTR_DROP = "fault-drop-response";
  private static final long MAX_LATENCY_MS = 10_000;

  private final boolean enabled;
  private final Set<String> keysSeen = ConcurrentHashMap.newKeySet();

  Faults(boolean enabled) {
    this.enabled = enabled;
  }

  boolean enabled() {
    return enabled;
  }

  /** Runs before the endpoint. */
  void before(Context ctx) {
    String fault = ctx.header("X-Fault");
    if (!enabled || fault == null) {
      return;
    }
    if (fault.startsWith("latency=")) {
      pause(Math.min(MAX_LATENCY_MS, Long.parseLong(fault.substring("latency=".length()))));
    } else if ("drop-response".equals(fault)) {
      if (firstTime(ctx, "drop")) {
        ctx.attribute(ATTR_DROP, Boolean.TRUE);
      }
    } else if ("unavailable-once".equals(fault) && firstTime(ctx, "unavailable")) {
      throw Problems.faultInjected("Injected outage; retry after 1 second.");
    }
  }

  /** True the first time this fault meets this {@code X-Fault-Key}; always true without a key. */
  private boolean firstTime(Context ctx, String fault) {
    String key = ctx.header("X-Fault-Key");
    return key == null || keysSeen.add(fault + ":" + key);
  }

  /** Simulated server-side latency. Product behaviour, not a test waiting on a clock. */
  static void pause(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
