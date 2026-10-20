package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** The caller's unread count after marking a conversation read. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ReadState(String conversationId, int unreadCount) {}
