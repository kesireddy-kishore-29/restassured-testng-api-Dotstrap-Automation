package com.kishore.qa.tests.workflows;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Conversation;
import com.kishore.qa.framework.clients.model.NewAccount;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import com.kishore.qa.framework.data.TestData;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/** Data residency: an account is served by its home region wherever the request arrives. */
public class MultiRegionTest {

  private final Sut sut = Sut.connect();

  @DataProvider(name = "homeAndEdge", parallel = true)
  public Object[][] homeAndEdge() {
    return new Object[][] {{Region.IN, "eu"}, {Region.EU, "us"}, {Region.US, "in"}};
  }

  @Test(
      groups = {"regression", "workflow"},
      dataProvider = "homeAndEdge",
      description = "Requests are served by the home region, whichever edge they arrive at")
  @Feature("FEAT-REGION-01")
  public void servedByTheHomeRegionFromAnyEdge(Region home, String edge) {
    try (TestAccount person = sut.newAccount(home)) {
      assertThatResponse(sut.accounts(person).me(CallOptions.none().withEdgeRegion(edge)))
          .hasStatus(200)
          .hasHeader("X-Edge-Region", edge)
          .hasHeader("X-Served-Region", home.code());
    }
  }

  @Test(
      groups = {"regression", "workflow"},
      description =
          "A cross-region conversation is stored in the recipient's region, for both sides")
  @Feature("FEAT-REGION-02")
  public void crossRegionConversationLivesInTheRecipientsRegion() {
    try (TestAccount sender = sut.newAccount(Region.IN);
        TestAccount recipient = sut.newAccount(Region.EU)) {
      var created =
          sut.conversations(sender).start(recipient.handle(), "Across regions", "Namaste");

      assertThatResponse(created).hasStatus(201).hasHeader("X-Data-Region", "eu");
      Conversation seenBySender =
          sut.conversations(sender).get(created.as(Conversation.class).id()).as(Conversation.class);
      Conversation seenByRecipient =
          sut.conversations(recipient)
              .get(created.as(Conversation.class).id())
              .as(Conversation.class);
      assertThat(seenBySender.region()).isEqualTo("eu");
      assertThat(seenByRecipient.region()).isEqualTo("eu");
    }
  }

  @Test(
      groups = {"regression", "workflow"},
      description = "An unknown home region is refused with 422")
  @Feature("FEAT-REGION-03")
  public void unknownRegionIsRefused() {
    NewAccount martian =
        new NewAccount(TestData.uniqueHandle(), "Mars", TestData.password(), "mars");

    assertThatResponse(sut.accounts().create(martian)).hasFieldError("region");
  }
}
