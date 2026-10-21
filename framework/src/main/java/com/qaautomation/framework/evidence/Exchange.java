package com.qaautomation.framework.evidence;

import java.time.Instant;
import java.util.List;
import java.util.Map;

/**
 * One HTTP call as recorded in a test's transcript, already redacted. {@code pathTemplate} keeps
 * the operation (e.g. {@code /v1/conversations/{id}}) so reports can group by endpoint.
 */
public record Exchange(
    int sequence,
    Instant startedAt,
    long durationMs,
    String method,
    String pathTemplate,
    String url,
    Map<String, String> requestHeaders,
    String requestBody,
    Integer status,
    Map<String, String> responseHeaders,
    String responseBody,
    String correlationId,
    String error,
    List<String> contractViolations) {

  public Exchange withContractViolations(List<String> violations) {
    return new Exchange(
        sequence,
        startedAt,
        durationMs,
        method,
        pathTemplate,
        url,
        requestHeaders,
        requestBody,
        status,
        responseHeaders,
        responseBody,
        correlationId,
        error,
        List.copyOf(violations));
  }
}
