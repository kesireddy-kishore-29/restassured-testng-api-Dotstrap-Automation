package com.kishore.qa.tests.security;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.core.ApiResponse;
import java.util.function.Supplier;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Security headers on success AND error responses (errors are where they are usually forgotten).
 */
public class SecurityHeadersTest {

  private final Sut sut = Sut.connect();

  @DataProvider(name = "responses", parallel = true)
  public Object[][] responses() {
    Supplier<ApiResponse> health = () -> sut.health().health();
    Supplier<ApiResponse> unauthenticated = () -> sut.accounts().me();
    return new Object[][] {{"200 health", health}, {"401 problem", unauthenticated}};
  }

  @Test(
      groups = {"regression", "security", "smoke"},
      dataProvider = "responses",
      description = "Every response carries the security headers and no server banner")
  @Feature("FEAT-SEC-01")
  public void securityHeadersOnEveryResponse(String which, Supplier<ApiResponse> call) {
    ApiResponse response = call.get();

    assertThatResponse(response)
        .hasHeader("X-Content-Type-Options", "nosniff")
        .hasHeader("X-Frame-Options", "DENY")
        .hasHeader("Referrer-Policy", "no-referrer")
        .hasHeader("Cache-Control", "no-store")
        .hasHeader("X-Correlation-Id")
        .doesNotHaveHeader("Server");
    assertThat(response.header("Content-Security-Policy"))
        .hasValueSatisfying(csp -> assertThat(csp).contains("default-src 'none'"));
    assertThat(response.header("Strict-Transport-Security"))
        .hasValueSatisfying(hsts -> assertThat(hsts).startsWith("max-age="));
  }
}
