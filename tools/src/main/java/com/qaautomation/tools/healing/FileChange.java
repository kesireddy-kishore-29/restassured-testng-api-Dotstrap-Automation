package com.qaautomation.tools.healing;

/** One file a patch rewrites: repository-relative path (forward slashes), old and new content. */
public record FileChange(String path, String before, String after) {}
