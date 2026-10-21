package com.qaautomation.tools.healing;

import com.qaautomation.tools.triage.Category;
import java.util.List;

/** A proposed fix: which failure, which provider proposed it, why, and the file changes. */
public record Patch(
    Category category,
    String testId,
    String provider,
    String rationale,
    List<FileChange> changes) {}
