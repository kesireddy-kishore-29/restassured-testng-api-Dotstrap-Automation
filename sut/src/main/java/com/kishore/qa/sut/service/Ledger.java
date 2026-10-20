package com.kishore.qa.sut.service;

import com.kishore.qa.sut.domain.LedgerEntry;
import com.kishore.qa.sut.domain.Purchase;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * One account's credits. Balance and entries change together under the instance lock, so the
 * running total can never disagree with the history. Purchases are remembered by idempotency key.
 */
public final class Ledger {

  private final List<LedgerEntry> entries = new ArrayList<>();
  private int balance;
  private final ConcurrentMap<String, CompletableFuture<Purchase>> purchasesByKey =
      new ConcurrentHashMap<>();

  /** Applies a movement and returns the entry. Negative amounts must not overdraw. */
  public synchronized LedgerEntry post(
      LedgerEntry.Type type, int amount, String reference, Instant at) {
    if (balance + amount < 0) {
      throw new IllegalStateException("overdraw");
    }
    balance += amount;
    LedgerEntry entry =
        new LedgerEntry("led_" + UUID.randomUUID(), type, amount, balance, reference, at);
    entries.add(entry);
    return entry;
  }

  public synchronized int balance() {
    return balance;
  }

  public synchronized List<LedgerEntry> entries() {
    return List.copyOf(entries);
  }

  ConcurrentMap<String, CompletableFuture<Purchase>> purchasesByKey() {
    return purchasesByKey;
  }

  public int purchaseCount() {
    return (int)
        purchasesByKey.values().stream()
            .filter(f -> f.isDone() && !f.isCompletedExceptionally())
            .count();
  }
}
