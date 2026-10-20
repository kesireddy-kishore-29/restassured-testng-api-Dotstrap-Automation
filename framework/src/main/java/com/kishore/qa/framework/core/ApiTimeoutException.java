package com.kishore.qa.framework.core;

import java.io.Serial;
import java.time.Duration;

/** The server did not answer within the configured read timeout, after every allowed attempt. */
public final class ApiTimeoutException extends RuntimeException {

  @Serial private static final long serialVersionUID = 1L;

  private final int attempts;

  public ApiTimeoutException(String call, Duration timeout, int attempts, Throwable cause) {
    super(
        call + " timed out after " + attempts + " attempt(s) of " + timeout.toMillis() + " ms each",
        cause);
    this.attempts = attempts;
  }

  public int attempts() {
    return attempts;
  }
}
