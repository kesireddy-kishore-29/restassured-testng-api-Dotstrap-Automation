package com.qaautomation.framework.clients;

import com.qaautomation.framework.clients.model.SendMessage;
import com.qaautomation.framework.clients.model.StartConversation;
import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Optional;
import java.util.function.Supplier;

/** Conversations between two accounts, seen by the account whose token this client carries. */
public final class ConversationsClient extends ApiClient {

  public ConversationsClient(Endpoint endpoint, Optional<Supplier<String>> bearerToken) {
    super(endpoint.baseUri(), endpoint.specs(), bearerToken, endpoint.retryPolicy());
  }

  public ApiResponse start(String recipientHandle, String subject, String firstMessage) {
    return start(new StartConversation(recipientHandle, subject, firstMessage));
  }

  public ApiResponse start(StartConversation request) {
    return post("/v1/conversations", request, CallOptions.none());
  }

  public ApiResponse list() {
    return get("/v1/conversations", CallOptions.none());
  }

  public ApiResponse get(String conversationId) {
    return get("/v1/conversations/{id}", CallOptions.none(), conversationId);
  }

  public ApiResponse messages(String conversationId) {
    return get("/v1/conversations/{id}/messages", CallOptions.none(), conversationId);
  }

  public ApiResponse send(String conversationId, String body) {
    return post(
        "/v1/conversations/{id}/messages",
        new SendMessage(body),
        CallOptions.none(),
        conversationId);
  }

  public ApiResponse markRead(String conversationId) {
    return post("/v1/conversations/{id}/read", null, CallOptions.none(), conversationId);
  }

  public ApiResponse close(String conversationId) {
    return post("/v1/conversations/{id}/close", null, CallOptions.none(), conversationId);
  }
}
