package com.kishore.qa.framework.core;

import com.kishore.qa.framework.config.FrameworkConfig;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import java.net.URI;
import java.util.List;

/**
 * Builds the shared request specification: connect and read timeouts from configuration, JSON in
 * and out, and the filter chain. Every external call made by the framework has a timeout.
 */
public final class RequestSpecs {

  private final RestAssuredConfig restAssuredConfig;
  private final List<Filter> filters;

  public RequestSpecs(FrameworkConfig config, List<Filter> filters) {
    int connectMs = Math.toIntExact(config.connectTimeout().toMillis());
    int readMs = Math.toIntExact(config.readTimeout().toMillis());
    this.restAssuredConfig =
        RestAssuredConfig.config()
            .httpClient(
                HttpClientConfig.httpClientConfig()
                    .setParam("http.connection.timeout", connectMs)
                    .setParam("http.socket.timeout", readMs)
                    .setParam("http.connection-manager.timeout", (long) connectMs));
    this.filters = List.copyOf(filters);
  }

  public RequestSpecification forBase(URI baseUri) {
    return new RequestSpecBuilder()
        .setBaseUri(baseUri.toString())
        .setConfig(restAssuredConfig)
        .setContentType(ContentType.JSON)
        .setAccept(ContentType.JSON)
        .addFilters(filters)
        .build();
  }
}
