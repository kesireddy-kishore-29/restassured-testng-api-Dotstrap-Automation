package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;

/** One message. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Message(
    String id, String conversationId, String sender, String body, Instant createdAt) {}
