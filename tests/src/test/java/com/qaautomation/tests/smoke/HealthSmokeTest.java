package com.qaautomation.tests.smoke;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.Account;
import com.qaautomation.framework.clients.model.Health;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import org.testng.annotations.Test;

public class HealthSmokeTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"smoke"},
      description = "The reference service reports itself up, with its version and regions")
  @Feature("FEAT-HEALTH-01")
  public void serviceReportsUp() {
    Health health = Contracts.read(sut.health().health(), 200, "health", Health.class);

    assertThat(health.status()).isEqualTo("UP");
    assertThat(health.regions()).containsExactlyInAnyOrder("in", "eu", "us");
  }

  @Test(
      groups = {"smoke"},
      description = "A new account can sign in and read itself back")
  @Feature("FEAT-ACCT-01")
  public void newAccountCanSignInAndReadItself() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      Account me = Contracts.read(sut.accounts(ava).me(), 200, "account", Account.class);

      assertThat(me.handle()).isEqualTo(ava.handle());
      assertThatResponse(sut.accounts(ava).me()).hasHeader("X-Served-Region", "eu");
    }
  }
}
