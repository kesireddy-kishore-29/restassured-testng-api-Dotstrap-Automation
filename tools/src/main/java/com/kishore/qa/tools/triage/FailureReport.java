package com.kishore.qa.tools.triage;

import java.util.Map;

/** failure-report.md: one page a person can act on without opening anything else first. */
public final class FailureReport {

  private FailureReport() {}

  public static String render(TriageRecord t) {
    StringBuilder md = new StringBuilder();
    md.append("# Failure: ").append(t.title()).append("\n\n");
    md.append("| | |\n|---|---|\n");
    md.append("| Category | **")
        .append(t.category())
        .append("** (")
        .append(t.classifiedBy())
        .append(", rule `")
        .append(t.rule())
        .append("`, confidence ")
        .append(String.format(java.util.Locale.ROOT, "%.2f", t.confidence()))
        .append(") |\n");
    md.append("| Next action | ").append(t.nextAction()).append(" |\n");
    md.append("| Healable | ")
        .append(t.healable() ? "yes" : "no")
        .append(t.needsHumanDecision() ? " (needs a human decision)" : "")
        .append(" |\n");
    md.append("| Test | `").append(t.testId()).append("` |\n");
    md.append("| Features | ").append(String.join(", ", t.featureIds())).append(" |\n");
    md.append("| Run | `").append(t.runId()).append("` |\n\n");
    md.append("## Why\n\n").append(t.reason()).append("\n\n");
    if (t.failingRequest() != null && !t.failingRequest().isEmpty()) {
      md.append("## Failing call\n\n| | |\n|---|---|\n");
      for (Map.Entry<String, Object> e : t.failingRequest().entrySet()) {
        md.append("| ").append(e.getKey()).append(" | `").append(e.getValue()).append("` |\n");
      }
      md.append("\n");
    }
    if (t.schemaDiff() != null
        && !(t.schemaDiff().missing().isEmpty() && t.schemaDiff().unexpected().isEmpty())) {
      md.append("## Contract diff\n\n");
      md.append("- Missing (required by the contract): ")
          .append(t.schemaDiff().missing())
          .append("\n");
      md.append("- Unexpected (not in the contract): ")
          .append(t.schemaDiff().unexpected())
          .append("\n");
      if (t.schemaDiff().looksLikeRename()) {
        md.append("- Looks like a rename: `")
            .append(t.schemaDiff().missing().get(0))
            .append("` → `")
            .append(t.schemaDiff().unexpected().get(0))
            .append("`\n");
      }
      md.append("\n");
    }
    md.append("## Error\n\n```text\n")
        .append(t.error().getOrDefault("message", ""))
        .append("\n```\n\n");
    md.append("## Evidence\n\n");
    t.evidence().forEach((k, v) -> md.append("- ").append(k).append(": `").append(v).append("`\n"));
    md.append("\nAI step: ").append(t.aiStep()).append("\n");
    return md.toString();
  }
}
