package com.kishore.qa.tests.negative;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Conversation;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AuthBoundaryTest {

  private final Sut sut = Sut.connect();

  @DataProvider(name = "badTokens", parallel = true)
  public Object[][] badTokens() {
    return new Object[][] {
      {"not-a-real-token-at-all", "invalid-token"},
      {"eyJhbGciOiJub25lIn0.eyJzdWIiOiJhZG1pbiJ9.", "invalid-token"},
    };
  }

  @Test(
      groups = {"regression", "security"},
      description = "No token: 401 unauthenticated with a Bearer challenge")
  @Feature({"FEAT-AUTHZ-01", "FEAT-ERR-01"})
  public void missingTokenIsUnauthenticated() {
    assertThatResponse(sut.accounts().me())
        .isProblem(401, "unauthenticated")
        .hasHeader("WWW-Authenticate", "Bearer");
  }

  @Test(
      groups = {"regression", "security"},
      dataProvider = "badTokens",
      description = "A token the service never issued is refused")
  @Feature({"FEAT-AUTHZ-01", "FEAT-ERR-01"})
  public void unknownTokenIsRefused(String token, String problemType) {
    assertThatResponse(sut.accountsWithToken(token).me()).isProblem(401, problemType);
  }

  @Test(
      groups = {"regression", "security"},
      description = "Someone outside a conversation gets 403, not its content")
  @Feature("FEAT-AUTHZ-01")
  public void outsiderCannotReadOrWriteAConversation() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU);
        TestAccount eve = sut.newAccount(Region.EU)) {
      Conversation started =
          sut.conversations(ava).start(ben.handle(), "Private", "Just us").as(Conversation.class);

      assertThatResponse(sut.conversations(eve).get(started.id())).isProblem(403, "forbidden");
      assertThatResponse(sut.conversations(eve).messages(started.id())).isProblem(403, "forbidden");
      assertThatResponse(sut.conversations(eve).send(started.id(), "Let me in"))
          .isProblem(403, "forbidden");
    }
  }
}
