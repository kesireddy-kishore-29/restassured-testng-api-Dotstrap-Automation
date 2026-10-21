package com.qaautomation.framework.core;

import com.atlassian.oai.validator.OpenApiInteractionValidator;
import com.atlassian.oai.validator.report.LevelResolver;
import com.atlassian.oai.validator.report.ValidationReport;
import com.atlassian.oai.validator.restassured.OpenApiValidationFilter;
import com.qaautomation.framework.assertions.ContractViolation;
import com.qaautomation.framework.evidence.TestContext;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import java.util.List;

/**
 * Checks every response from the reference service against its published OpenAPI document. Only
 * responses are judged: negative tests send invalid requests on purpose, so request-side findings
 * are ignored. A violation fails the test as a {@link ContractViolation} and is written into the
 * transcript next to the call that caused it.
 */
public final class ContractConformanceFilter implements Filter {

  private final OpenApiValidationFilter delegate;

  public ContractConformanceFilter(String specificationUrl) {
    OpenApiInteractionValidator validator =
        OpenApiInteractionValidator.createForSpecificationUrl(specificationUrl)
            .withLevelResolver(
                LevelResolver.create()
                    .withLevel("validation.request", ValidationReport.Level.IGNORE)
                    .build())
            .build();
    this.delegate = new OpenApiValidationFilter(validator);
  }

  @Override
  public Response filter(
      FilterableRequestSpecification request,
      FilterableResponseSpecification response,
      FilterContext context) {
    try {
      return delegate.filter(request, response, context);
    } catch (OpenApiValidationFilter.OpenApiValidationException e) {
      List<String> violations =
          e.getValidationReport().getMessages().stream()
              .filter(m -> m.getLevel() == ValidationReport.Level.ERROR)
              .map(m -> m.getKey() + ": " + m.getMessage())
              .toList();
      Object sequence = context.getValue(TranscriptFilter.SEQUENCE_HEADER);
      if (sequence instanceof Integer number) {
        TestContext.current().ifPresent(t -> t.transcript().annotate(number, violations));
      }
      throw new ContractViolation(
          "OpenAPI contract violation on "
              + request.getMethod()
              + " "
              + request.getUserDefinedPath(),
          violations);
    }
  }
}
