package com.kishore.qa.framework.assertions;

import com.kishore.qa.framework.core.ApiResponse;

/** Entry point: {@code assertThatResponse(response).hasStatus(201).matchesContract("account")}. */
public final class ApiAssertions {

  private ApiAssertions() {}

  public static ResponseAssert assertThatResponse(ApiResponse response) {
    return new ResponseAssert(response);
  }
}
