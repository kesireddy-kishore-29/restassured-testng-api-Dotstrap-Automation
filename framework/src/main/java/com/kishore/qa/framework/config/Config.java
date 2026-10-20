package com.kishore.qa.framework.config;

/**
 * Process-wide access to the validated configuration. The value is immutable and loaded once, on
 * first use, so an invalid configuration fails the run before the first request is sent.
 */
public final class Config {

  private Config() {}

  public static FrameworkConfig get() {
    return Holder.INSTANCE;
  }

  private static final class Holder {
    private static final FrameworkConfig INSTANCE = ConfigLoader.load();
  }
}
