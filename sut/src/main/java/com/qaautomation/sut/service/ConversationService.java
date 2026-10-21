package com.qaautomation.sut.service;

import com.qaautomation.sut.api.ProblemException.FieldError;
import com.qaautomation.sut.api.Problems;
import com.qaautomation.sut.domain.Account;
import com.qaautomation.sut.domain.Conversation;
import com.qaautomation.sut.domain.Conversation.Participant;
import com.qaautomation.sut.domain.Message;
import com.qaautomation.sut.domain.Region;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Two-person conversations. A conversation is stored in the RECIPIENT's home region: the person
 * being contacted owns the record. Every message costs the sender one credit.
 */
public final class ConversationService {

  private final DataPlane plane;
  private final CreditService credits;
  private final Clock clock;

  public ConversationService(DataPlane plane, CreditService credits, Clock clock) {
    this.plane = plane;
    this.credits = credits;
    this.clock = clock;
  }

  public Conversation start(
      Account starter, String recipientHandle, String subject, String firstMessage) {
    List<FieldError> errors = new ArrayList<>();
    Optional<Account> recipient =
        Optional.ofNullable(recipientHandle).flatMap(plane::accountByHandle);
    if (recipient.isEmpty()) {
      errors.add(new FieldError("recipientHandle", "no account with this handle"));
    } else if (recipient.get().id().equals(starter.id())) {
      errors.add(
          new FieldError("recipientHandle", "you cannot start a conversation with yourself"));
    }
    if (subject == null || subject.isBlank() || subject.length() > 120) {
      errors.add(new FieldError("subject", "1-120 characters, not blank"));
    }
    validateBody("message", firstMessage, errors);
    if (!errors.isEmpty()) {
      throw Problems.validation(errors);
    }
    Account to = recipient.orElseThrow();
    String id = "cnv_" + UUID.randomUUID();
    credits.spendOne(starter, id);
    Conversation conversation =
        new Conversation(
            id,
            subject,
            to.region(),
            new Participant(starter.id(), starter.handle()),
            new Participant(to.id(), to.handle()),
            clock.instant());
    conversation.append(
        "msg_" + UUID.randomUUID(), starter.id(), starter.handle(), firstMessage, clock.instant());
    plane.putConversation(conversation);
    return conversation;
  }

  /** A conversation the caller takes part in: 404 when unknown, 403 when not a participant. */
  public Conversation get(Account caller, String conversationId) {
    Conversation conversation =
        plane
            .conversation(conversationId)
            .orElseThrow(() -> Problems.notFound("No conversation '" + conversationId + "'."));
    if (!conversation.hasParticipant(caller.id())) {
      throw Problems.forbidden("You are not a participant in this conversation.");
    }
    return conversation;
  }

  public List<Conversation> listFor(Account caller) {
    List<Conversation> mine = new ArrayList<>();
    for (Region region : Region.values()) {
      plane.store(region).conversations().values().stream()
          .filter(c -> c.hasParticipant(caller.id()))
          .forEach(mine::add);
    }
    mine.sort(Comparator.comparing(Conversation::createdAt).reversed());
    return mine;
  }

  public Message send(Account sender, String conversationId, String body) {
    Conversation conversation = get(sender, conversationId);
    List<FieldError> errors = new ArrayList<>();
    validateBody("body", body, errors);
    if (!errors.isEmpty()) {
      throw Problems.validation(errors);
    }
    if (conversation.status() == Conversation.Status.CLOSED) {
      throw Problems.conversationClosed();
    }
    String messageId = "msg_" + UUID.randomUUID();
    credits.spendOne(sender, messageId);
    return conversation.append(messageId, sender.id(), sender.handle(), body, clock.instant());
  }

  public Conversation close(Account caller, String conversationId) {
    Conversation conversation = get(caller, conversationId);
    conversation.close(clock.instant());
    return conversation;
  }

  public Conversation markRead(Account caller, String conversationId) {
    Conversation conversation = get(caller, conversationId);
    conversation.markRead(caller.id());
    return conversation;
  }

  void deleteAllFor(Account account) {
    listFor(account).forEach(plane::removeConversation);
  }

  private static void validateBody(String field, String body, List<FieldError> errors) {
    if (body == null || body.isBlank() || body.length() > 2000) {
      errors.add(new FieldError(field, "1-2000 characters, not blank"));
    }
  }
}
