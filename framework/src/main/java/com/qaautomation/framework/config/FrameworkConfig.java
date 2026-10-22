package com.qaautomation.framework.config;

import java.net.URI;
import java.nio.file.Path;
import java.time.Duration;

/**
 * Immutable, validated configuration. Built once by {@link ConfigLoader}; nothing in the framework
 * reads a URL, timeout or credential from anywhere else.
 */
public record FrameworkConfig(
    String environment,
    URI sutBaseUrl,
    URI bookerBaseUrl,
    Credentials bookerCredentials,
    Credentials sutAdmin,
    Duration connectTimeout,
    Duration readTimeout,
    int maxRetries,
    String allowedCorsOrigin,
    RecordMode recordMode,
    Path evidenceRoot,
    String runId) {}
