package com.qaautomation.framework.assertions;

import com.qaautomation.framework.core.ApiResponse;

/** Entry point: {@code assertThatResponse(response).hasStatus(201).matchesContract("account")}. */
public final class ApiAssertions {

  private ApiAssertions() {}

  public static ResponseAssert assertThatResponse(ApiResponse response) {
    return new ResponseAssert(response);
  }
}
