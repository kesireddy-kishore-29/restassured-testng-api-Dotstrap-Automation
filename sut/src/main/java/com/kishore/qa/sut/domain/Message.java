package com.kishore.qa.sut.domain;

import java.time.Instant;

/** One message in a conversation. {@code sequence} orders messages and drives unread counts. */
public record Message(
    String id,
    String conversationId,
    long sequence,
    String senderId,
    String senderHandle,
    String body,
    Instant createdAt) {}
