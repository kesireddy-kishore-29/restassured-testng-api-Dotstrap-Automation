package com.kishore.qa.framework.evidence;

import java.util.List;

/**
 * Read access to the calls the current test has made, for tests whose requirement IS the call
 * pattern (retries, idempotent replays). Most tests never need it.
 */
public final class CallLog {

  private CallLog() {}

  /** Calls to this operation, e.g. {@code callsTo("POST", "/v1/credits/purchases")}. */
  public static List<Exchange> callsTo(String method, String pathTemplate) {
    return TestContext.current().map(t -> t.transcript().exchanges()).orElse(List.of()).stream()
        .filter(e -> e.method().equals(method) && e.pathTemplate().equals(pathTemplate))
        .toList();
  }
}
