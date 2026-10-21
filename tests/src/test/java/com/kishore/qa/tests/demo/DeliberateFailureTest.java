package com.kishore.qa.tests.demo;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Account;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.core.Fault;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import java.time.Duration;
import org.testng.annotations.Test;

/**
 * FAILS ON PURPOSE. Proves the failure-evidence pipeline: each test breaks in a different way so
 * the transcripts, failure bundles and triage categories can be inspected. Runs only through the
 * demo-failure suite; never part of a gating run.
 */
public class DeliberateFailureTest {

  private final Sut sut = Sut.connect();

  @Test(groups = "demo-failure", description = "DEMO: a wrong business expectation")
  @Feature("FEAT-DEMO-01")
  public void wrongExpectationFails() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      Account updated = sut.accounts(ava).changeDisplayName("Ava Lindqvist").as(Account.class);

      assertThat(updated.displayName())
          .as("deliberately wrong expectation")
          .isEqualTo("Somebody Else");
    }
  }

  @Test(
      groups = "demo-failure",
      description = "DEMO: a response checked against the wrong contract")
  @Feature("FEAT-DEMO-01")
  public void contractMismatchFails() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      assertThatResponse(sut.credits(ava).balance()).hasStatus(200).matchesContract("purchase");
    }
  }

  @Test(groups = "demo-failure", description = "DEMO: the client gives up on a slow service")
  @Feature("FEAT-DEMO-01")
  public void timeoutFails() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      sut.withClientLimits(Duration.ofMillis(300), 0)
          .accounts(ava)
          .me(CallOptions.none().withFault(Fault.latency(Duration.ofSeconds(2))));
    }
  }

  @Test(groups = "demo-failure", description = "DEMO: a polled condition that never becomes true")
  @Feature("FEAT-DEMO-01")
  public void conditionNeverMetFails() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      await("balance reaches 99 (it never will)")
          .pollInSameThread()
          .atMost(Duration.ofSeconds(2))
          .pollInterval(Duration.ofMillis(500))
          .until(() -> sut.credits(ava).currentBalance() == 99);
    }
  }
}
