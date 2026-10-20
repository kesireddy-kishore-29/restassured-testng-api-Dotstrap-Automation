package com.kishore.qa.sut.web;

import com.kishore.qa.sut.api.Api.AccountView;
import com.kishore.qa.sut.api.Api.ConversationView;
import com.kishore.qa.sut.api.Api.LedgerEntryView;
import com.kishore.qa.sut.api.Api.MessageView;
import com.kishore.qa.sut.api.Api.PublicProfileView;
import com.kishore.qa.sut.api.Api.PurchaseView;
import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.domain.Conversation;
import com.kishore.qa.sut.domain.LedgerEntry;
import com.kishore.qa.sut.domain.Message;
import com.kishore.qa.sut.domain.Purchase;
import java.util.List;
import java.util.Locale;

/** Domain to API mapping. The only place that decides which fields leave the service. */
final class Views {

  private Views() {}

  static AccountView account(Account a) {
    return new AccountView(
        a.id(),
        a.handle(),
        a.displayName(),
        a.region().code(),
        a.role().name().toLowerCase(Locale.ROOT),
        a.createdAt());
  }

  /** What anyone may see about an account: no id, no role, no timestamps. */
  static PublicProfileView publicProfile(Account a) {
    return new PublicProfileView(a.handle(), a.displayName(), a.region().code());
  }

  static ConversationView conversation(Conversation c, String viewerId) {
    return new ConversationView(
        c.id(),
        c.subject(),
        c.status().name().toLowerCase(Locale.ROOT),
        c.region().code(),
        List.of(c.starter().handle(), c.recipient().handle()),
        c.messageCount(),
        c.unreadFor(viewerId),
        c.createdAt(),
        c.closedAt().orElse(null));
  }

  static MessageView message(Message m) {
    return new MessageView(m.id(), m.conversationId(), m.senderHandle(), m.body(), m.createdAt());
  }

  static LedgerEntryView ledgerEntry(LedgerEntry e) {
    return new LedgerEntryView(
        e.id(),
        e.type().name().toLowerCase(Locale.ROOT),
        e.amount(),
        e.balanceAfter(),
        e.reference(),
        e.createdAt());
  }

  static PurchaseView purchase(Purchase p) {
    return new PurchaseView(
        p.id(), p.pack().id(), p.pack().credits(), p.balanceAfter(), p.createdAt());
  }
}
