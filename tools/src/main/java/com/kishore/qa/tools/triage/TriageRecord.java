package com.kishore.qa.tools.triage;

import java.util.List;
import java.util.Map;

/** triage/&lt;slug&gt;.json: the shared triage bundle format of the family. */
public record TriageRecord(
    int schemaVersion,
    String repo,
    String runId,
    String testId,
    String title,
    String suite,
    List<String> featureIds,
    Category category,
    double confidence,
    String classifiedBy,
    String rule,
    String reason,
    boolean healable,
    boolean needsHumanDecision,
    String nextAction,
    Map<String, String> error,
    Map<String, Object> failingRequest,
    SchemaDiff schemaDiff,
    Map<String, String> evidence,
    String gitDiff,
    List<Map<String, Object>> retryHistory,
    String aiStep) {}
