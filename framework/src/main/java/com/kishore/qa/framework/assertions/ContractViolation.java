package com.kishore.qa.framework.assertions;

import java.io.Serial;
import java.util.List;

/**
 * A response that does not match its contract (JSON Schema or OpenAPI). A distinct type so triage
 * classifies it as {@code CONTRACT_DRIFT} from the exception alone, before reading any message.
 */
public final class ContractViolation extends AssertionError {

  @Serial private static final long serialVersionUID = 1L;

  private final transient List<String> violations;

  public ContractViolation(String summary, List<String> violations) {
    super(summary + ":\n  - " + String.join("\n  - ", violations));
    this.violations = List.copyOf(violations);
  }

  public List<String> violations() {
    return violations;
  }
}
