package com.qaautomation.tests.workflows;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.Conversation;
import com.qaautomation.framework.clients.model.Message;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import java.util.List;
import org.testng.annotations.Test;

/**
 * Two signed-in people and an outsider, end to end, through the real HTTP surface: start, read,
 * reply, unread counts, charging, privacy, closing and the refusal after closing. Each Allure step
 * is one business event; about thirty checks in total.
 */
public class MultiActorConversationTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "workflow"},
      description =
          "Two people exchange messages; an outsider is kept out; closing stops the thread")
  @Feature({"FEAT-CONV-01", "FEAT-CONV-02", "FEAT-CONV-03", "FEAT-AUTHZ-01", "FEAT-REGION-02"})
  @Severity(SeverityLevel.BLOCKER)
  public void twoPeopleConverseAndTheOwnerEndsIt() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.US);
        TestAccount eve = sut.newAccount(Region.IN)) {

      Conversation started =
          Allure.step(
              "Ava starts a conversation with Ben",
              () -> {
                Conversation c =
                    Contracts.read(
                        sut.conversations(ava)
                            .start(ben.handle(), "Project kickoff", "Hi Ben, got a minute?"),
                        201,
                        "conversation",
                        Conversation.class);
                assertThat(c.status()).as("new conversation is open").isEqualTo("open");
                assertThat(c.participants())
                    .as("both participants listed")
                    .containsExactly(ava.handle(), ben.handle());
                assertThat(c.messageCount()).as("first message included").isEqualTo(1);
                assertThat(c.unreadCount()).as("nothing unread for the sender").isZero();
                assertThat(c.region()).as("stored in the recipient's region").isEqualTo("us");
                return c;
              });

      Allure.step(
          "Ben finds it in his list with one unread message",
          () -> {
            List<Conversation> bens =
                sut.conversations(ben).list().asList("items", Conversation.class);
            assertThat(bens)
                .as("Ben has exactly this conversation")
                .extracting(Conversation::id)
                .containsExactly(started.id());
            assertThat(bens.get(0).unreadCount()).as("one unread for Ben").isEqualTo(1);
          });

      Allure.step(
          "Ben reads the message and marks the conversation read",
          () -> {
            List<Message> thread =
                sut.conversations(ben).messages(started.id()).asList("items", Message.class);
            assertThat(thread).as("one message so far").hasSize(1);
            assertThat(thread.get(0).sender()).as("sent by Ava").isEqualTo(ava.handle());
            assertThat(thread.get(0).body()).as("text intact").isEqualTo("Hi Ben, got a minute?");
            assertThatResponse(sut.conversations(ben).markRead(started.id())).hasStatus(200);
            assertThat(
                    sut.conversations(ben).get(started.id()).as(Conversation.class).unreadCount())
                .as("read clears Ben's count")
                .isZero();
          });

      Allure.step(
          "Ben replies twice; Ava sees two unread, in order",
          () -> {
            assertThatResponse(sut.conversations(ben).send(started.id(), "Sure, now works"))
                .hasStatus(201);
            assertThatResponse(sut.conversations(ben).send(started.id(), "Calling you"))
                .hasStatus(201);
            Conversation forAva = sut.conversations(ava).get(started.id()).as(Conversation.class);
            assertThat(forAva.unreadCount()).as("two unread for Ava").isEqualTo(2);
            assertThat(forAva.messageCount()).as("three messages in total").isEqualTo(3);
            List<Message> thread =
                sut.conversations(ava).messages(started.id()).asList("items", Message.class);
            assertThat(thread)
                .extracting(Message::sender)
                .as("chronological senders")
                .containsExactly(ava.handle(), ben.handle(), ben.handle());
          });

      Allure.step(
          "Each sender paid one credit per message",
          () -> {
            assertThat(sut.credits(ava).currentBalance()).as("Ava: 5 - 1").isEqualTo(4);
            assertThat(sut.credits(ben).currentBalance()).as("Ben: 5 - 2").isEqualTo(3);
          });

      Allure.step(
          "Eve, an outsider, can neither read nor write nor see it listed",
          () -> {
            assertThatResponse(sut.conversations(eve).get(started.id()))
                .isProblem(403, "forbidden");
            assertThatResponse(sut.conversations(eve).messages(started.id()))
                .isProblem(403, "forbidden");
            assertThatResponse(sut.conversations(eve).send(started.id(), "Hello?"))
                .isProblem(403, "forbidden");
            assertThat(sut.conversations(eve).list().asList("items", Conversation.class))
                .as("not in Eve's list")
                .isEmpty();
            assertThat(sut.credits(eve).currentBalance())
                .as("refused writes cost Eve nothing")
                .isEqualTo(5);
          });

      Allure.step(
          "Ava closes the conversation; closing again changes nothing",
          () -> {
            Conversation closed = sut.conversations(ava).close(started.id()).as(Conversation.class);
            assertThat(closed.status()).as("closed").isEqualTo("closed");
            assertThat(closed.closedAt()).as("closing time recorded").isNotNull();
            Conversation again = sut.conversations(ava).close(started.id()).as(Conversation.class);
            assertThat(again.closedAt())
                .as("second close keeps the first time")
                .isEqualTo(closed.closedAt());
          });

      Allure.step(
          "Ben can still read but can no longer write, and is not charged",
          () -> {
            assertThat(sut.conversations(ben).messages(started.id()).asList("items", Message.class))
                .as("history kept")
                .hasSize(3);
            assertThatResponse(sut.conversations(ben).send(started.id(), "One more thing"))
                .isProblem(409, "conversation-closed");
            assertThat(sut.credits(ben).currentBalance())
                .as("refused message not charged")
                .isEqualTo(3);
          });
    }
  }
}
