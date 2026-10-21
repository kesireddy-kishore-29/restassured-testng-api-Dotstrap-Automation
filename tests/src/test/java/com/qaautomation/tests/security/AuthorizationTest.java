package com.qaautomation.tests.security;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;
import static org.awaitility.Awaitility.await;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.AccountsClient;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.Token;
import com.qaautomation.framework.clients.model.TokenRequest;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import java.time.Duration;
import org.testng.annotations.Test;

public class AuthorizationTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "security"},
      description = "A normal account cannot use the admin endpoint")
  @Feature("FEAT-SEC-02")
  public void adminEndpointIsForbiddenToANormalAccount() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      assertThatResponse(sut.admin(ava).stats()).isProblem(403, "forbidden");
    }
  }

  @Test(
      groups = {"regression", "security"},
      description = "A token stops working when it expires")
  @Feature("FEAT-SEC-03")
  public void expiredTokenIsRefused() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      Token shortLived =
          Contracts.read(
              sut.auth().token(new TokenRequest(ava.handle(), ava.password(), 1)),
              200,
              "token",
              Token.class);
      AccountsClient withShortToken = sut.accountsWithToken(shortLived.accessToken());

      // Poll for the condition (expiry), never sleep for a guessed duration.
      await("one-second token expires")
          .pollInSameThread()
          .atMost(Duration.ofSeconds(5))
          .pollInterval(Duration.ofMillis(250))
          .until(() -> withShortToken.me().status() == 401);

      assertThatResponse(withShortToken.me()).isProblem(401, "token-expired");
    }
  }
}
