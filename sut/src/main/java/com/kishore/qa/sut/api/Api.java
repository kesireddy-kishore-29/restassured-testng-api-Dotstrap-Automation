package com.kishore.qa.sut.api;

import java.time.Instant;
import java.util.List;

/** Request and response bodies. Field names here ARE the public contract (see openapi.yaml). */
public final class Api {

  private Api() {}

  // ---- requests -----------------------------------------------------------------------------

  public record CreateAccountRequest(
      String handle, String displayName, String password, String region) {}

  public record UpdateAccountRequest(String displayName) {}

  public record TokenRequest(String handle, String password, Integer ttlSeconds) {}

  public record StartConversationRequest(String recipientHandle, String subject, String message) {}

  public record SendMessageRequest(String body) {}

  public record PurchaseRequest(String packId) {}

  // ---- responses ----------------------------------------------------------------------------

  public record HealthView(
      String status, String version, String region, List<String> regions, boolean faultsEnabled) {}

  public record AccountView(
      String id,
      String handle,
      String displayName,
      String region,
      String role,
      Instant createdAt) {}

  public record PublicProfileView(String handle, String displayName, String region) {}

  public record TokenView(String accessToken, String tokenType, long expiresIn, String accountId) {}

  public record ConversationView(
      String id,
      String subject,
      String status,
      String region,
      List<String> participants,
      int messageCount,
      int unreadCount,
      Instant createdAt,
      Instant closedAt) {}

  public record MessageView(
      String id, String conversationId, String sender, String body, Instant createdAt) {}

  public record ReadView(String conversationId, int unreadCount) {}

  public record BalanceView(int balance, String currency, String accountId) {}

  /** The same balance with the field renamed: served only in chaos mode "rename-balance-field". */
  public record DriftedBalanceView(int availableBalance, String currency, String accountId) {}

  public record LedgerEntryView(
      String id, String type, int amount, int balanceAfter, String reference, Instant createdAt) {}

  public record LedgerView(List<LedgerEntryView> items, int total, int balance) {}

  public record PurchaseView(
      String id, String packId, int credits, int balanceAfter, Instant createdAt) {}

  public record StatsView(int accounts, int conversations, int purchases) {}

  public record PageView<T>(List<T> items, int total) {}
}
