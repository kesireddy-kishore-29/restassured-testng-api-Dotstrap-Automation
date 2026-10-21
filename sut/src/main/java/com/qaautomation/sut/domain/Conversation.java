package com.qaautomation.sut.domain;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A two-person conversation, stored in the recipient's home region. Mutable state is guarded by the
 * instance lock; callers use the synchronized methods only.
 */
public final class Conversation {

  public enum Status {
    OPEN,
    CLOSED
  }

  private final String id;
  private final String subject;
  private final Region region;
  private final Participant starter;
  private final Participant recipient;
  private final Instant createdAt;
  private final List<Message> messages = new ArrayList<>();
  private final Map<String, Long> lastRead = new HashMap<>();
  private Status status = Status.OPEN;
  private Instant closedAt;

  /** A participant as seen by the conversation: enough to authorise and to display. */
  public record Participant(String accountId, String handle) {}

  public Conversation(
      String id,
      String subject,
      Region region,
      Participant starter,
      Participant recipient,
      Instant createdAt) {
    this.id = id;
    this.subject = subject;
    this.region = region;
    this.starter = starter;
    this.recipient = recipient;
    this.createdAt = createdAt;
  }

  public String id() {
    return id;
  }

  public String subject() {
    return subject;
  }

  public Region region() {
    return region;
  }

  public Participant starter() {
    return starter;
  }

  public Participant recipient() {
    return recipient;
  }

  public Instant createdAt() {
    return createdAt;
  }

  public boolean hasParticipant(String accountId) {
    return starter.accountId().equals(accountId) || recipient.accountId().equals(accountId);
  }

  public synchronized Status status() {
    return status;
  }

  public synchronized Optional<Instant> closedAt() {
    return Optional.ofNullable(closedAt);
  }

  public synchronized List<Message> messages() {
    return List.copyOf(messages);
  }

  public synchronized int messageCount() {
    return messages.size();
  }

  /** Appends a message; the caller has already checked the status and charged the sender. */
  public synchronized Message append(
      String messageId, String senderId, String senderHandle, String body, Instant at) {
    Message message =
        new Message(messageId, id, messages.size() + 1L, senderId, senderHandle, body, at);
    messages.add(message);
    lastRead.put(senderId, message.sequence());
    return message;
  }

  /** Closes the conversation. Closing an already closed conversation changes nothing. */
  public synchronized void close(Instant at) {
    if (status == Status.OPEN) {
      status = Status.CLOSED;
      closedAt = at;
    }
  }

  public synchronized int unreadFor(String accountId) {
    long seen = lastRead.getOrDefault(accountId, 0L);
    return (int)
        messages.stream()
            .filter(m -> m.sequence() > seen && !m.senderId().equals(accountId))
            .count();
  }

  public synchronized void markRead(String accountId) {
    lastRead.put(accountId, (long) messages.size());
  }
}
