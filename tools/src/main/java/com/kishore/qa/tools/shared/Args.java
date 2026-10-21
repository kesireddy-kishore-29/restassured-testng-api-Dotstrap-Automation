package com.kishore.qa.tools.shared;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/** Minimal {@code --name value} / {@code --flag} argument parsing for the CLI commands. */
public final class Args {

  private final Map<String, String> values = new LinkedHashMap<>();

  private Args() {}

  public static Args parse(String[] args) {
    Args parsed = new Args();
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      if (!arg.startsWith("--")) {
        throw new IllegalArgumentException("Unexpected argument '" + arg + "'");
      }
      String name = arg.substring(2);
      boolean hasValue = i + 1 < args.length && !args[i + 1].startsWith("--");
      parsed.values.put(name, hasValue ? args[++i] : "true");
    }
    return parsed;
  }

  public Optional<String> get(String name) {
    return Optional.ofNullable(values.get(name));
  }

  public String get(String name, String fallback) {
    return values.getOrDefault(name, fallback);
  }

  public boolean flag(String name) {
    return "true".equals(values.get(name));
  }
}
