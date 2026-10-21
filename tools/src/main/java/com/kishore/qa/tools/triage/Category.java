package com.kishore.qa.tools.triage;

/**
 * Exactly one category per failure. The same seven categories, with the same meaning, in every
 * repository of the family. Only the first four may ever reach the healing agent.
 */
public enum Category {
  LOCATOR_DRIFT(true, false, "Propose a locator fix (page object only) and verify it 3 times."),
  TIMING(true, false, "Propose a wait-on-condition fix; never a hard wait or a longer timeout."),
  TEST_DATA(true, false, "Fix the data fixture: unique data, verified cleanup, no shared state."),
  CONTRACT_DRIFT(
      true,
      true,
      "Decide: provider bug (file an issue) or agreed change (update schema + client model)."),
  ENVIRONMENT(
      false, false, "Not a code problem. Retry later or check the service/network; notify."),
  PRODUCT_BUG(false, false, "Never auto-fix. File an issue with the evidence bundle attached."),
  UNKNOWN(false, false, "Human triage: read the failure bundle and classify by hand.");

  private final boolean healable;
  private final boolean needsHumanDecision;
  private final String nextAction;

  Category(boolean healable, boolean needsHumanDecision, String nextAction) {
    this.healable = healable;
    this.needsHumanDecision = needsHumanDecision;
    this.nextAction = nextAction;
  }

  public boolean healable() {
    return healable;
  }

  public boolean needsHumanDecision() {
    return needsHumanDecision;
  }

  public String nextAction() {
    return nextAction;
  }
}
