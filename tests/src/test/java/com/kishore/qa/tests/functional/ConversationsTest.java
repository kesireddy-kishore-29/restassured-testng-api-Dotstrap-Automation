package com.kishore.qa.tests.functional;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.assertions.Contracts;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Conversation;
import com.kishore.qa.framework.clients.model.Message;
import com.kishore.qa.framework.clients.model.ReadState;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import java.util.List;
import org.testng.annotations.Test;

public class ConversationsTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "smoke"},
      description = "Two people start a conversation and exchange messages")
  @Feature("FEAT-CONV-01")
  public void twoPeopleExchangeMessages() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started =
          Contracts.read(
              sut.conversations(ava).start(ben.handle(), "Lunch?", "Free on Friday?"),
              201,
              "conversation",
              Conversation.class);
      assertThatResponse(sut.conversations(ben).send(started.id(), "Friday works")).hasStatus(201);

      List<Message> thread =
          sut.conversations(ava).messages(started.id()).asList("items", Message.class);

      assertThat(thread).extracting(Message::sender).containsExactly(ava.handle(), ben.handle());
      assertThat(thread)
          .extracting(Message::body)
          .containsExactly("Free on Friday?", "Friday works");
    }
  }

  @Test(
      groups = {"regression"},
      description = "A closed conversation refuses new messages with 409")
  @Feature("FEAT-CONV-02")
  public void closedConversationRefusesMessages() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started =
          sut.conversations(ava).start(ben.handle(), "Quick question", "Hi").as(Conversation.class);

      Conversation closed =
          Contracts.read(
              sut.conversations(ava).close(started.id()), 200, "conversation", Conversation.class);

      assertThat(closed.status()).isEqualTo("closed");
      assertThat(closed.closedAt()).isNotNull();
      assertThatResponse(sut.conversations(ben).send(started.id(), "One more thing"))
          .isProblem(409, "conversation-closed");
    }
  }

  @Test(
      groups = {"regression"},
      description = "Unread counts follow messages and reset when read")
  @Feature("FEAT-CONV-03")
  public void unreadCountFollowsMessagesAndResetsOnRead() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started =
          sut.conversations(ava).start(ben.handle(), "Updates", "First").as(Conversation.class);
      sut.conversations(ava).send(started.id(), "Second");

      Conversation forBen =
          Contracts.read(
              sut.conversations(ben).get(started.id()), 200, "conversation", Conversation.class);
      ReadState afterRead =
          Contracts.read(
              sut.conversations(ben).markRead(started.id()), 200, "read-state", ReadState.class);
      Conversation forAva = sut.conversations(ava).get(started.id()).as(Conversation.class);

      assertThat(forBen.unreadCount()).as("Ben has two unread messages").isEqualTo(2);
      assertThat(afterRead.unreadCount()).as("marking read clears Ben's count").isZero();
      assertThat(forAva.unreadCount()).as("Ava's own messages are never unread for her").isZero();
    }
  }
}
