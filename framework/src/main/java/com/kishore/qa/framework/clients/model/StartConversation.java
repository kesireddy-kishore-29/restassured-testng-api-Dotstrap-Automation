package com.kishore.qa.framework.clients.model;

/** Request body to start a conversation with its first message. */
public record StartConversation(String recipientHandle, String subject, String message) {}
