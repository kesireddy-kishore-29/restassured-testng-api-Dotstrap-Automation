package com.qaautomation.tests.contract;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.ConversationsClient;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.Conversation;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import com.qaautomation.framework.data.TestData;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

/**
 * Consumer contracts (JSON Schema, asserted explicitly here) and provider conformance (OpenAPI,
 * checked automatically on every response by the client filter chain).
 */
public class ContractTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"contract", "smoke"},
      description = "Account, token and public profile match their schemas")
  @Feature({"FEAT-CONTRACT-01", "FEAT-ACCT-03"})
  @Severity(SeverityLevel.CRITICAL)
  public void accountResourcesMatchTheirContracts() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.US)) {
      assertThatResponse(sut.auth().token(ava.handle(), ava.password()))
          .hasStatus(200)
          .matchesContract("token");
      assertThatResponse(sut.accounts(ava).me()).hasStatus(200).matchesContract("account");
      assertThatResponse(sut.accounts(ava).publicProfile(ben.handle()))
          .hasStatus(200)
          .matchesContract("public-profile");
    }
  }

  @Test(
      groups = {"contract"},
      description = "Conversation, message, page and read-state match their schemas")
  @Feature("FEAT-CONTRACT-01")
  public void conversationResourcesMatchTheirContracts() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      ConversationsClient conversations = sut.conversations(ava);
      Conversation started =
          Contracts.read(
              conversations.start(ben.handle(), "Contract check", "Hello"),
              201,
              "conversation",
              Conversation.class);

      assertThatResponse(conversations.list()).hasStatus(200).matchesContract("conversation-page");
      assertThatResponse(conversations.get(started.id()))
          .hasStatus(200)
          .matchesContract("conversation");
      assertThatResponse(conversations.send(started.id(), "Second"))
          .hasStatus(201)
          .matchesContract("message");
      assertThatResponse(conversations.messages(started.id()))
          .hasStatus(200)
          .matchesContract("message-page");
      assertThatResponse(sut.conversations(ben).markRead(started.id()))
          .hasStatus(200)
          .matchesContract("read-state");
    }
  }

  @Test(
      groups = {"contract"},
      description = "Balance, ledger and purchase match their schemas")
  @Feature("FEAT-CONTRACT-01")
  public void creditResourcesMatchTheirContracts() {
    try (TestAccount ava = sut.newAccount(Region.IN)) {
      assertThatResponse(sut.credits(ava).balance()).hasStatus(200).matchesContract("balance");
      assertThatResponse(
              sut.credits(ava)
                  .purchase("pack-10", CallOptions.idempotencyKey(TestData.idempotencyKey())))
          .hasStatus(201)
          .matchesContract("purchase");
      assertThatResponse(sut.credits(ava).ledger()).hasStatus(200).matchesContract("ledger");
    }
  }

  @Test(
      groups = {"contract"},
      description =
          "Every operation in the OpenAPI document answers as documented (checked per response)")
  @Feature("FEAT-CONTRACT-02")
  @Severity(SeverityLevel.CRITICAL)
  public void everyOperationConformsToTheOpenApiDocument() {
    // The client filter validates each response below against /openapi.yaml and fails the test
    // with a ContractViolation on the first mismatch. This journey touches every operation.
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.US)) {
      assertThatResponse(sut.health().health()).hasStatus(200);
      assertThatResponse(sut.accounts(ava).me()).hasStatus(200);
      assertThatResponse(sut.accounts(ava).changeDisplayName("Ava Contract")).hasStatus(200);
      assertThatResponse(sut.accounts(ava).publicProfile(ben.handle())).hasStatus(200);
      Conversation started =
          sut.conversations(ava)
              .start(ben.handle(), "OpenAPI journey", "Hi")
              .as(Conversation.class);
      assertThatResponse(sut.conversations(ava).list()).hasStatus(200);
      assertThatResponse(sut.conversations(ben).get(started.id())).hasStatus(200);
      assertThatResponse(sut.conversations(ben).messages(started.id())).hasStatus(200);
      assertThatResponse(sut.conversations(ben).send(started.id(), "Reply")).hasStatus(201);
      assertThatResponse(sut.conversations(ava).markRead(started.id())).hasStatus(200);
      assertThatResponse(sut.conversations(ava).close(started.id())).hasStatus(200);
      assertThatResponse(sut.credits(ava).balance()).hasStatus(200);
      assertThatResponse(sut.credits(ava).ledger()).hasStatus(200);
      assertThatResponse(
              sut.credits(ava)
                  .purchase("pack-50", CallOptions.idempotencyKey(TestData.idempotencyKey())))
          .hasStatus(201);
      assertThatResponse(sut.admin(ava).stats()).hasStatus(403);
    }
  }
}
