package com.kishore.qa.tools.quarantine;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** One quarantined test: who owns the fix, why, and until when the exemption holds. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record QuarantineEntry(
    String testId, String title, String owner, String reason, String expires, String issue) {}
