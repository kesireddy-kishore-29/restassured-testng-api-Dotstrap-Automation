package com.kishore.qa.framework.data;

import java.io.Serial;

/** Cleanup ran but could not be verified: the data a test created may still exist. */
public final class CleanupFailedException extends RuntimeException {

  @Serial private static final long serialVersionUID = 1L;

  public CleanupFailedException(String message) {
    super(message);
  }
}
