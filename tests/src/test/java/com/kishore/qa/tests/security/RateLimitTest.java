package com.kishore.qa.tests.security;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.AccountsClient;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import java.time.Duration;
import org.testng.annotations.Test;

/** Limits are per token, announced in headers, enforced with 429 + Retry-After, then lifted. */
public class RateLimitTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "security"},
      description = "Past the limit: 429 with Retry-After, then recovery")
  @Feature("FEAT-RATE-01")
  public void exceedingTheLimitIs429ThenRecovers() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      AccountsClient accounts = sut.accounts(ava);
      ApiResponse first = accounts.me();
      int limit = Integer.parseInt(first.header("RateLimit-Limit").orElseThrow());

      ApiResponse last = first;
      for (int i = 1; i <= limit && last.status() != 429; i++) {
        last = accounts.me();
      }

      assertThatResponse(last).isProblem(429, "rate-limited").hasHeader("RateLimit-Remaining", "0");
      long retryAfter = Long.parseLong(last.header("Retry-After").orElseThrow());
      assertThat(retryAfter).isBetween(1L, 10L);

      // Poll on this thread: tokens are cached per thread, and a new token would be a new window.
      await("rate limit window resets")
          .pollInSameThread()
          .atMost(Duration.ofSeconds(retryAfter + 5))
          .pollInterval(Duration.ofMillis(500))
          .until(() -> accounts.me().status() == 200);
    }
  }
}
