package com.kishore.qa.tests.security;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.core.ApiResponse;
import org.testng.annotations.Test;

/**
 * What a browser sees. A service with no CORS headers passes every server-side test and is still
 * unusable from a web app; these checks exist because that has happened in production elsewhere.
 */
public class CorsTest {

  private static final String DENIED_ORIGIN = "https://evil.example";

  private final Sut sut = Sut.connect();
  private final String allowed = sut.config().allowedCorsOrigin();

  @Test(
      groups = {"regression", "security"},
      description = "An allowed origin passes preflight for an idempotent purchase")
  @Feature("FEAT-CORS-01")
  public void allowedOriginPassesPreflight() {
    ApiResponse preflight =
        sut.cors()
            .preflight(
                "/v1/credits/purchases",
                allowed,
                "POST",
                "Authorization, Idempotency-Key, Content-Type");

    assertThatResponse(preflight)
        .hasStatus(204)
        .hasHeader("Access-Control-Allow-Origin", allowed)
        .hasHeader("Access-Control-Max-Age", "600");
    assertThat(preflight.header("Access-Control-Allow-Methods"))
        .hasValueSatisfying(m -> assertThat(m).contains("POST"));
    assertThat(preflight.header("Access-Control-Allow-Headers"))
        .hasValueSatisfying(h -> assertThat(h).contains("Authorization", "Idempotency-Key"));
    assertThat(preflight.header("Vary")).hasValueSatisfying(v -> assertThat(v).contains("Origin"));
  }

  @Test(
      groups = {"regression", "security"},
      description = "An allowed origin can read the headers the app needs")
  @Feature("FEAT-CORS-01")
  public void allowedOriginCanReadTheHeadersTheAppNeeds() {
    ApiResponse response = sut.cors().getFrom("/health", allowed);

    assertThatResponse(response).hasStatus(200).hasHeader("Access-Control-Allow-Origin", allowed);
    assertThat(response.header("Access-Control-Expose-Headers"))
        .hasValueSatisfying(
            h -> assertThat(h).contains("Retry-After", "Idempotent-Replayed", "X-Correlation-Id"));
  }

  @Test(
      groups = {"regression", "security"},
      description = "Any other origin is refused")
  @Feature("FEAT-CORS-02")
  public void otherOriginsAreRefused() {
    assertThatResponse(
            sut.cors().preflight("/v1/accounts/me", DENIED_ORIGIN, "GET", "Authorization"))
        .isProblem(403, "cors-origin-denied")
        .doesNotHaveHeader("Access-Control-Allow-Origin");
    assertThatResponse(sut.cors().getFrom("/health", DENIED_ORIGIN))
        .hasStatus(200)
        .doesNotHaveHeader("Access-Control-Allow-Origin");
  }
}
