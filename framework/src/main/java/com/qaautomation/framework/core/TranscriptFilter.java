package com.qaautomation.framework.core;

import com.qaautomation.framework.evidence.Exchange;
import com.qaautomation.framework.evidence.TestContext;
import com.qaautomation.framework.evidence.TranscriptRenderer;
import io.qameta.allure.Allure;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Records every call into the current test's transcript (redacted) and attaches it to the Allure
 * report as a readable request/response pair. Outside a test (e.g. a health probe in a listener) it
 * passes the call through untouched.
 */
public final class TranscriptFilter implements Filter {

  /** Name of the request attribute that carries the transcript sequence number. */
  public static final String SEQUENCE_HEADER = "X-QA-Sequence";

  @Override
  public Response filter(
      FilterableRequestSpecification request,
      FilterableResponseSpecification responseSpec,
      FilterContext context) {
    var current = TestContext.current();
    if (current.isEmpty()) {
      return context.next(request, responseSpec);
    }
    TestContext test = current.get();
    int sequence = test.transcript().nextSequence();
    context.setValue(SEQUENCE_HEADER, sequence);
    Instant started = Instant.now();
    long t0 = System.nanoTime();
    try {
      Response response = context.next(request, responseSpec);
      Exchange exchange =
          exchange(sequence, started, t0, request, response.getStatusCode(), response, null);
      test.transcript().add(exchange);
      attach(exchange);
      return response;
    } catch (Exception e) {
      // REST Assured (Groovy) throws checked exceptions such as SocketTimeoutException
      // undeclared; catch them too, so a call that never got an answer is still in the transcript.
      Exchange failed =
          exchange(
              sequence,
              started,
              t0,
              request,
              null,
              null,
              e.getClass().getSimpleName() + ": " + e.getMessage());
      test.transcript().add(failed);
      attach(failed);
      throw unchecked(e);
    }
  }

  /**
   * Rethrows unchanged when unchecked; wraps checked ones, keeping the cause for the retry policy.
   */
  private static RuntimeException unchecked(Exception e) {
    if (e instanceof RuntimeException runtime) {
      return runtime;
    }
    if (e instanceof IOException io) {
      return new UncheckedIOException(io);
    }
    return new IllegalStateException(e);
  }

  private static Exchange exchange(
      int sequence,
      Instant started,
      long t0,
      FilterableRequestSpecification request,
      Integer status,
      Response response,
      String error) {
    long durationMs = (System.nanoTime() - t0) / 1_000_000;
    Object body = request.getBody();
    return new Exchange(
        sequence,
        started,
        durationMs,
        request.getMethod(),
        request.getUserDefinedPath(),
        Redactor.url(request.getURI()),
        Redactor.headers(toMap(request.getHeaders())),
        body == null ? null : Redactor.body(String.valueOf(body)),
        status,
        response == null ? Map.of() : Redactor.headers(toMap(response.getHeaders())),
        response == null ? null : Redactor.body(response.asString()),
        request.getHeaders().getValue(CorrelationIdFilter.HEADER),
        error,
        List.of());
  }

  private static Map<String, String> toMap(Headers headers) {
    Map<String, String> map = new LinkedHashMap<>();
    for (Header header : headers) {
      map.merge(header.getName(), header.getValue(), (a, b) -> a + ", " + b);
    }
    return map;
  }

  private static void attach(Exchange e) {
    String title =
        e.method()
            + " "
            + e.pathTemplate()
            + " → "
            + (e.status() == null ? "no response" : e.status().toString());
    Allure.addAttachment(title, "text/plain", TranscriptRenderer.exchangeAsText(e), ".txt");
  }
}
