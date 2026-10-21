package com.qaautomation.sut.web;

import com.qaautomation.sut.api.Api.ConversationView;
import com.qaautomation.sut.api.Api.MessageView;
import com.qaautomation.sut.api.Api.PageView;
import com.qaautomation.sut.api.Api.ReadView;
import com.qaautomation.sut.api.Api.SendMessageRequest;
import com.qaautomation.sut.api.Api.StartConversationRequest;
import com.qaautomation.sut.domain.Account;
import com.qaautomation.sut.domain.Conversation;
import com.qaautomation.sut.domain.Message;
import com.qaautomation.sut.service.ConversationService;
import io.javalin.http.Context;
import java.util.List;

/** Conversations and messages. */
final class ConversationHandlers {

  private final Http http;
  private final ConversationService conversations;

  ConversationHandlers(Http http, ConversationService conversations) {
    this.http = http;
    this.conversations = conversations;
  }

  void start(Context ctx) {
    Account caller = http.caller(ctx);
    StartConversationRequest request = http.body(ctx, StartConversationRequest.class);
    Conversation conversation =
        conversations.start(
            caller, request.recipientHandle(), request.subject(), request.message());
    ctx.header("Location", "/v1/conversations/" + conversation.id());
    ctx.header("X-Data-Region", conversation.region().code());
    ctx.status(201).json(Views.conversation(conversation, caller.id()));
  }

  void list(Context ctx) {
    Account caller = http.caller(ctx);
    List<ConversationView> items =
        conversations.listFor(caller).stream()
            .map(c -> Views.conversation(c, caller.id()))
            .toList();
    ctx.json(new PageView<>(items, items.size()));
  }

  void get(Context ctx) {
    Account caller = http.caller(ctx);
    Conversation conversation = conversations.get(caller, ctx.pathParam("id"));
    ctx.header("X-Data-Region", conversation.region().code());
    ctx.json(Views.conversation(conversation, caller.id()));
  }

  void messages(Context ctx) {
    Account caller = http.caller(ctx);
    List<MessageView> items =
        conversations.get(caller, ctx.pathParam("id")).messages().stream()
            .map(Views::message)
            .toList();
    ctx.json(new PageView<>(items, items.size()));
  }

  void send(Context ctx) {
    Account caller = http.caller(ctx);
    SendMessageRequest request = http.body(ctx, SendMessageRequest.class);
    Message message = conversations.send(caller, ctx.pathParam("id"), request.body());
    ctx.status(201).json(Views.message(message));
  }

  void read(Context ctx) {
    Account caller = http.caller(ctx);
    Conversation conversation = conversations.markRead(caller, ctx.pathParam("id"));
    ctx.json(new ReadView(conversation.id(), conversation.unreadFor(caller.id())));
  }

  void close(Context ctx) {
    Account caller = http.caller(ctx);
    ctx.json(Views.conversation(conversations.close(caller, ctx.pathParam("id")), caller.id()));
  }
}
