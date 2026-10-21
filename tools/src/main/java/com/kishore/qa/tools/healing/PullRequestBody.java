package com.kishore.qa.tools.healing;

import java.util.List;

/** The standard self-healed PR description (same sections in every repository of the family). */
public final class PullRequestBody {

  private PullRequestBody() {}

  public static String render(
      Patch patch,
      String rootCause,
      String evidence,
      List<GuardrailViolation> violations,
      List<Verifier.Step> steps,
      boolean needsHumanDecision,
      List<String> alsoExplains) {
    StringBuilder md = new StringBuilder();
    md.append("## Self-healed: ").append(patch.category()).append("\n\n");
    md.append("> Proposed by `")
        .append(patch.provider())
        .append("`. **Never auto-merged**: a person reviews, ");
    md.append("then merges or closes.")
        .append(
            needsHumanDecision
                ? " **Contract change: decide whether the provider is wrong before merging.**"
                : "")
        .append("\n\n");
    md.append("| | |\n|---|---|\n");
    md.append("| Failure category | `").append(patch.category()).append("` |\n");
    md.append("| Test | `").append(patch.testId()).append("` |\n");
    md.append("| Evidence | ").append(evidence).append(" |\n");
    if (!alsoExplains.isEmpty()) {
      md.append("| Also explains | ")
          .append(alsoExplains.size())
          .append(" other failing test(s) with the same cause (below) |\n");
    }
    md.append("\n");
    md.append("### Root cause\n\n").append(rootCause).append("\n\n");
    if (!alsoExplains.isEmpty()) {
      md.append("### Other failures with the same cause\n\n");
      alsoExplains.forEach(t -> md.append("- `").append(t).append("`\n"));
      md.append("\nThe verification below reruns each of them on this branch.\n\n");
    }
    md.append("### Why this diff\n\n").append(patch.rationale()).append("\n\n");
    md.append("### Files changed (allowed paths only)\n\n");
    patch.changes().forEach(c -> md.append("- `").append(c.path()).append("`\n"));
    md.append("\n### Guardrails\n\n");
    md.append(
        violations.isEmpty()
            ? "All passed: allowed paths, no forbidden constructs, no loosened checks.\n"
            : "FAILED: " + violations + "\n");
    md.append("\n### Verification (before → after)\n\n");
    md.append("Before: the test failed in the triaged run.\n\n| Step | Result |\n|---|---|\n");
    steps.forEach(
        s ->
            md.append("| ")
                .append(s.name())
                .append(" | ")
                .append(s.passed() ? "passed" : "**failed**")
                .append(" |\n"));
    md.append("\n---\nLabels: `self-healed`")
        .append(needsHumanDecision ? ", `needs-contract-decision`" : "")
        .append("\n");
    return md.toString();
  }
}
