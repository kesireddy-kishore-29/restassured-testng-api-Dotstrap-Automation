package com.kishore.qa.tests.functional;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.assertions.Contracts;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Account;
import com.kishore.qa.framework.clients.model.PublicProfile;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import org.testng.annotations.Test;

public class AccountsTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression"},
      description = "The owner reads back exactly what was created")
  @Feature("FEAT-ACCT-01")
  public void ownerReadsBackTheAccountAsCreated() {
    try (TestAccount ava = sut.newAccount(Region.IN)) {
      Account me = Contracts.read(sut.accounts(ava).me(), 200, "account", Account.class);

      assertThat(me.id()).isEqualTo(ava.id());
      assertThat(me.handle()).isEqualTo(ava.handle());
      assertThat(me.region()).isEqualTo("in");
      assertThat(me.role()).isEqualTo("user");
    }
  }

  @Test(
      groups = {"regression"},
      description = "A new display name is stored and returned")
  @Feature("FEAT-ACCT-02")
  public void displayNameChangeIsPersisted() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      Account updated =
          Contracts.read(
              sut.accounts(ava).changeDisplayName("Ava Lindqvist"), 200, "account", Account.class);
      Account readBack = Contracts.read(sut.accounts(ava).me(), 200, "account", Account.class);

      assertThat(updated.displayName()).isEqualTo("Ava Lindqvist");
      assertThat(readBack.displayName()).isEqualTo("Ava Lindqvist");
    }
  }

  @Test(
      groups = {"regression"},
      description = "Anyone signed in sees a public profile with no private fields")
  @Feature("FEAT-ACCT-03")
  public void publicProfileExposesNoPrivateFields() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.US)) {
      PublicProfile profile =
          Contracts.read(
              sut.accounts(ava).publicProfile(ben.handle()),
              200,
              "public-profile",
              PublicProfile.class);

      assertThat(profile.handle()).isEqualTo(ben.handle());
      assertThat(profile.region()).isEqualTo("us");
      assertThatResponse(sut.accounts(ava).publicProfile(ben.handle())).hasStatus(200);
      assertThat(sut.accounts(ava).publicProfile(ben.handle()).body())
          .doesNotContain(ben.id(), "\"role\"", "createdAt");
    }
  }
}
