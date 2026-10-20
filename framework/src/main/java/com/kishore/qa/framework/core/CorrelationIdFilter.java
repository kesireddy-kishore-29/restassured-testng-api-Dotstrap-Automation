package com.kishore.qa.framework.core;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import java.util.UUID;

/**
 * Gives every request an {@code X-Correlation-Id} (unless the test set one), so a failing call can
 * be found in the service's logs and in the transcript by the same ID.
 */
public final class CorrelationIdFilter implements Filter {

  public static final String HEADER = "X-Correlation-Id";

  @Override
  public Response filter(
      FilterableRequestSpecification request,
      FilterableResponseSpecification response,
      FilterContext context) {
    if (!request.getHeaders().hasHeaderWithName(HEADER)) {
      request.header(HEADER, "qa-" + UUID.randomUUID());
    }
    return context.next(request, response);
  }
}
