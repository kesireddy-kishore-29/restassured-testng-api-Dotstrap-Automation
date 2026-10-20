package com.kishore.qa.framework.core;

import com.kishore.qa.framework.config.FrameworkConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * The shared request specification: connect and read timeouts from configuration, JSON in and out,
 * and the filter chain. Every external call made by the framework has a timeout. Immutable and safe
 * to share between parallel tests.
 *
 * <p>Filter order matters and is fixed here: contract check (outermost, so it sees the final
 * response), then correlation ID, then transcript (innermost, so it records exactly what went on
 * the wire, even when the contract check later fails the call).
 */
public final class RequestSpecs {

  private final RestAssuredConfig restAssuredConfig;
  private final List<Filter> filters;
  private final Duration readTimeout;

  private RequestSpecs(Duration connectTimeout, Duration readTimeout, List<Filter> filters) {
    int connectMs = Math.toIntExact(connectTimeout.toMillis());
    int readMs = Math.toIntExact(readTimeout.toMillis());
    this.readTimeout = readTimeout;
    this.restAssuredConfig =
        RestAssuredConfig.config()
            .objectMapperConfig(
                ObjectMapperConfig.objectMapperConfig()
                    .jackson2ObjectMapperFactory((type, charset) -> Json.mapper()))
            .httpClient(
                HttpClientConfig.httpClientConfig()
                    .setParam("http.connection.timeout", connectMs)
                    .setParam("http.socket.timeout", readMs)
                    .setParam("http.connection-manager.timeout", (long) connectMs));
    this.filters = List.copyOf(filters);
  }

  /** Reference service: OpenAPI conformance on every response, plus correlation and transcript. */
  public static RequestSpecs forReferenceService(FrameworkConfig config, String openApiUrl) {
    return new RequestSpecs(
        config.connectTimeout(),
        config.readTimeout(),
        List.of(
            new ContractConformanceFilter(openApiUrl),
            new CorrelationIdFilter(),
            new TranscriptFilter()));
  }

  /** A public target with no published contract: correlation and transcript only. */
  public static RequestSpecs forPublicTarget(FrameworkConfig config) {
    return new RequestSpecs(
        config.connectTimeout(),
        config.readTimeout(),
        List.of(new CorrelationIdFilter(), new TranscriptFilter()));
  }

  /** The same filters with a different read timeout (resilience tests). */
  public RequestSpecs withReadTimeout(Duration connectTimeout, Duration newReadTimeout) {
    return new RequestSpecs(connectTimeout, newReadTimeout, filters);
  }

  /** The same timeouts without the OpenAPI check (CORS preflight probes are not API operations). */
  public RequestSpecs withoutContractCheck(Duration connectTimeout) {
    List<Filter> kept = new ArrayList<>(filters);
    kept.removeIf(ContractConformanceFilter.class::isInstance);
    return new RequestSpecs(connectTimeout, readTimeout, kept);
  }

  public Duration readTimeout() {
    return readTimeout;
  }

  public RequestSpecification forBase(URI baseUri) {
    return new RequestSpecBuilder()
        .setBaseUri(baseUri.toString())
        .setConfig(restAssuredConfig)
        .setContentType(ContentType.JSON)
        // Exactly application/json: some APIs (Restful-Booker) answer 418 to REST Assured's
        // default multi-type JSON Accept header.
        .setAccept("application/json")
        .addFilters(filters)
        .build();
  }
}
