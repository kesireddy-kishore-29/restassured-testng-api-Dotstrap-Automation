package com.kishore.qa.tests.resilience;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Ledger;
import com.kishore.qa.framework.clients.model.LedgerEntry;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.ApiTimeoutException;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.core.Fault;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import com.kishore.qa.framework.data.TestData;
import com.kishore.qa.framework.evidence.CallLog;
import com.kishore.qa.framework.evidence.Exchange;
import java.time.Duration;
import java.util.List;
import org.testng.annotations.Test;

/**
 * The client's timeout, retry and idempotency behaviour, driven by the reference service's fault
 * injection instead of a flaky network.
 */
public class RetryAndTimeoutTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "resilience"},
      description = "A lost response is retried with the same key and the purchase is charged once")
  @Feature({"FEAT-RES-01", "FEAT-IDEMP-01"})
  public void lostResponseIsRetriedWithoutDoubleCharging() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      CallOptions options =
          CallOptions.idempotencyKey(TestData.idempotencyKey()).withFault(Fault.dropResponse());

      ApiResponse result = sut.credits(ava).purchase("pack-10", options);

      List<Exchange> attempts = CallLog.callsTo("POST", "/v1/credits/purchases");
      assertThat(attempts).extracting(Exchange::status).containsExactly(503, 200);
      assertThatResponse(result).hasStatus(200).hasHeader("Idempotent-Replayed", "true");
      Ledger ledger = sut.credits(ava).currentLedger();
      assertThat(ledger.items()).filteredOn(e -> "purchase".equals(e.type())).hasSize(1);
      assertThat(ledger.balance()).isEqualTo(15);
      assertThat(ledger.items()).extracting(LedgerEntry::type).containsExactly("grant", "purchase");
    }
  }

  @Test(
      groups = {"regression", "resilience"},
      description = "A slow server cannot hang the client")
  @Feature("FEAT-RES-02")
  public void clientTimeoutIsEnforcedWithinItsBudget() {
    Sut impatient = sut.withClientLimits(Duration.ofMillis(800), 1);
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      long started = System.nanoTime();

      assertThatThrownBy(
              () ->
                  impatient
                      .accounts(ava)
                      .me(CallOptions.none().withFault(Fault.latency(Duration.ofSeconds(4)))))
          .isInstanceOf(ApiTimeoutException.class)
          .hasMessageContaining("2 attempt(s) of 800 ms");

      Duration elapsed = Duration.ofNanos(System.nanoTime() - started);
      assertThat(elapsed)
          .as("two 800 ms attempts, not two 4 s waits")
          .isLessThan(Duration.ofMillis(3_500));
    }
  }

  @Test(
      groups = {"regression", "resilience"},
      description = "A 503 with Retry-After is retried after the wait")
  @Feature("FEAT-RES-03")
  public void unavailableIsRetriedAfterRetryAfter() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      ApiResponse result =
          sut.accounts(ava).me(CallOptions.none().withFault(Fault.unavailableOnce()));

      assertThatResponse(result).hasStatus(200);
      List<Exchange> attempts = CallLog.callsTo("GET", "/v1/accounts/me");
      assertThat(attempts).extracting(Exchange::status).containsExactly(503, 200);
      assertThat(attempts.get(0).responseHeaders()).containsEntry("Retry-After", "1");
      Duration gap = Duration.between(attempts.get(0).startedAt(), attempts.get(1).startedAt());
      assertThat(gap).as("waited for Retry-After").isGreaterThanOrEqualTo(Duration.ofSeconds(1));
    }
  }
}
