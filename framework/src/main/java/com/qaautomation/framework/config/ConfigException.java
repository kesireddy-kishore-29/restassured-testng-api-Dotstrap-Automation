package com.qaautomation.framework.config;

import java.io.Serial;
import java.util.List;

/** Thrown at start-up when configuration is missing or invalid. Lists every problem at once. */
public final class ConfigException extends RuntimeException {

  @Serial private static final long serialVersionUID = 1L;

  public ConfigException(String environment, List<String> problems) {
    super(
        "Invalid test configuration for environment '"
            + environment
            + "':\n  - "
            + String.join("\n  - ", problems)
            + "\nFix the values in framework/src/main/resources/config/"
            + environment
            + ".properties or override them with environment variables.");
  }
}
