package com.kishore.qa.tests.negative;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Conversation;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import com.kishore.qa.framework.data.TestData;
import org.testng.annotations.Test;

public class CreditsNegativeTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression"},
      description = "With no credits left, a message is a 402 and nothing is charged")
  @Feature({"FEAT-LEDGER-02", "FEAT-ERR-01"})
  public void sendingWithNoCreditsIsA402() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started =
          sut.conversations(ava).start(ben.handle(), "Many messages", "1").as(Conversation.class);
      for (int i = 2; i <= 5; i++) {
        assertThatResponse(sut.conversations(ava).send(started.id(), Integer.toString(i)))
            .hasStatus(201);
      }

      assertThat(sut.credits(ava).currentBalance()).as("five free credits spent").isZero();
      assertThatResponse(sut.conversations(ava).send(started.id(), "6"))
          .isProblem(402, "insufficient-credits");
      assertThat(sut.credits(ava).currentLedger().items())
          .as("no entry for the refused message")
          .hasSize(6);
    }
  }

  @Test(
      groups = {"regression"},
      description = "A purchase without an Idempotency-Key is refused with 400")
  @Feature({"FEAT-IDEMP-03", "FEAT-ERR-01"})
  public void purchaseWithoutIdempotencyKeyIsA400() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      assertThatResponse(sut.credits(ava).purchase("pack-10", CallOptions.none()))
          .isProblem(400, "idempotency-key-required");
      assertThat(sut.credits(ava).currentBalance()).isEqualTo(5);
    }
  }

  @Test(
      groups = {"regression"},
      description = "An unknown credit pack is a 422 on packId")
  @Feature("FEAT-ERR-01")
  public void unknownPackIsA422() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      assertThatResponse(
              sut.credits(ava)
                  .purchase("pack-9000", CallOptions.idempotencyKey(TestData.idempotencyKey())))
          .hasFieldError("packId");
    }
  }
}
