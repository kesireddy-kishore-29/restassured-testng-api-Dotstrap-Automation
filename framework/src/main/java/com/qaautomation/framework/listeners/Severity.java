package com.qaautomation.framework.listeners;

import java.util.List;

/**
 * The default Allure severity, from what a test is for, read from its TestNG groups: smoke blocks a
 * release, contracts and security are critical, the public practice API is minor, the demo fails on
 * purpose. A test's own {@code @Severity} annotation wins.
 */
final class Severity {

  private Severity() {}

  static String of(String... groups) {
    List<String> g = List.of(groups);
    if (g.contains("demo-failure")) {
      return "trivial";
    }
    if (g.contains("smoke")) {
      return "blocker";
    }
    if (g.contains("contract") || g.contains("security")) {
      return "critical";
    }
    if (g.contains("booker")) {
      return "minor";
    }
    return "normal";
  }
}
