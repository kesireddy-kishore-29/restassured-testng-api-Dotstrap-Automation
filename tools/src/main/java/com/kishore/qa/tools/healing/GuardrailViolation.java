package com.kishore.qa.tools.healing;

/** One reason a patch is refused. {@code rule} is stable; tests and the PR body refer to it. */
public record GuardrailViolation(String rule, String path, String detail) {

  @Override
  public String toString() {
    return rule + " in " + path + ": " + detail;
  }
}
