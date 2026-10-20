package com.kishore.qa.sut.domain;

import java.time.Instant;

/**
 * One movement on an account's credit ledger. The invariant the tests check: the sum of {@code
 * amount} over all entries equals the current balance, and every {@code balanceAfter} is the
 * running total.
 */
public record LedgerEntry(
    String id, Type type, int amount, int balanceAfter, String reference, Instant createdAt) {

  public enum Type {
    GRANT,
    PURCHASE,
    SPEND
  }
}
