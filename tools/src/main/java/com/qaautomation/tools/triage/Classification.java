package com.qaautomation.tools.triage;

/** A category, how sure the classifier is, which rule decided, and why. */
public record Classification(
    Category category, double confidence, String classifiedBy, String rule, String reason) {

  public static Classification byRule(
      Category category, double confidence, String rule, String reason) {
    return new Classification(category, confidence, "rules", rule, reason);
  }
}
