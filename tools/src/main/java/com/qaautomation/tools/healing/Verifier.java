package com.qaautomation.tools.healing;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Proves a heal on its branch: format/lint/compile, then the failing test three times in a row,
 * then the suite it belongs to. Any red step rejects the patch.
 */
public final class Verifier {

  /** One step's outcome, as listed in the PR body. */
  public record Step(String name, boolean passed, String detail) {}

  private final ProcessRunner runner;
  private final String maven;

  public Verifier(ProcessRunner runner, String maven) {
    this.runner = runner;
    this.maven = maven;
  }

  public static String defaultMaven() {
    return System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("win")
        ? "mvn.cmd"
        : "./mvnw";
  }

  /** One run of another failing test that the same fix claims to explain. */
  public Step rerun(String testId) {
    String className = testId.substring(0, testId.indexOf('#'));
    String method = testId.substring(testId.indexOf('#') + 1).replaceAll("\\[.*$", "");
    ProcessRunner.Result single =
        runner.run(
            List.of(
                maven,
                "-B",
                "-o",
                "verify",
                "-pl",
                "tests",
                "-Dtest=" + className + "#" + method,
                "-Dsurefire.failIfNoSpecifiedTests=false",
                "-Dtest.retries=0"),
            Duration.ofMinutes(10));
    return new Step(
        "also explained: " + className.substring(className.lastIndexOf('.') + 1) + "#" + method,
        single.ok(),
        single.ok() ? "passed" : single.tail());
  }

  public List<Step> verify(String testId, String suite) {
    List<Step> steps = new ArrayList<>();
    String className = testId.substring(0, testId.indexOf('#'));
    String method = testId.substring(testId.indexOf('#') + 1).replaceAll("\\[.*$", "");
    ProcessRunner.Result build =
        runner.run(
            List.of(maven, "-B", "-q", "-o", "install", "-DskipTests", "-pl", "framework", "-am"),
            Duration.ofMinutes(10));
    steps.add(
        new Step("format, lint, compile (-Werror)", build.ok(), build.ok() ? "ok" : build.tail()));
    if (!build.ok()) {
      return steps;
    }
    for (int run = 1; run <= 3; run++) {
      ProcessRunner.Result single =
          runner.run(
              List.of(
                  maven,
                  "-B",
                  "-o",
                  "verify",
                  "-pl",
                  "tests",
                  "-Dtest=" + className + "#" + method,
                  "-Dsurefire.failIfNoSpecifiedTests=false",
                  "-Dtest.retries=0"),
              Duration.ofMinutes(10));
      steps.add(
          new Step(
              "failing test, run " + run + " of 3",
              single.ok(),
              single.ok() ? "passed" : single.tail()));
      if (!single.ok()) {
        return steps;
      }
    }
    ProcessRunner.Result suiteRun =
        runner.run(
            List.of(
                maven,
                "-B",
                "-o",
                "verify",
                "-pl",
                "tests",
                "-Dsuite=" + suite,
                "-Dtest.retries=0"),
            Duration.ofMinutes(15));
    steps.add(
        new Step(
            "surrounding suite '" + suite + "'",
            suiteRun.ok(),
            suiteRun.ok() ? "passed" : suiteRun.tail()));
    return steps;
  }
}
