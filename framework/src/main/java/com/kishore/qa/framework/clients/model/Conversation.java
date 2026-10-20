package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;
import java.util.List;

/** A conversation as seen by one participant (unreadCount is theirs). */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Conversation(
    String id,
    String subject,
    String status,
    String region,
    List<String> participants,
    int messageCount,
    int unreadCount,
    Instant createdAt,
    Instant closedAt) {}
