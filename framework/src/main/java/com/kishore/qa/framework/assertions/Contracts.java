package com.kishore.qa.framework.assertions;

import com.kishore.qa.framework.core.ApiResponse;

/**
 * Reads a typed body only after checking status and contract, so a drifted response fails as a
 * {@link ContractViolation} instead of quietly becoming a model full of defaults.
 */
public final class Contracts {

  private Contracts() {}

  public static <T> T read(ApiResponse response, int expectedStatus, String schema, Class<T> type) {
    ApiAssertions.assertThatResponse(response).hasStatus(expectedStatus).matchesContract(schema);
    return response.as(type);
  }
}
