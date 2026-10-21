package com.qaautomation.framework.core;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.restassured.response.Response;

/** Canned responses for unit tests of the retry policy. */
final class FakeResponses {

  private FakeResponses() {}

  static ApiResponse status(int status, String retryAfter) {
    Response raw = mock(Response.class);
    when(raw.statusCode()).thenReturn(status);
    when(raw.header("Retry-After")).thenReturn(retryAfter);
    return new ApiResponse("GET", "/x", raw);
  }
}
