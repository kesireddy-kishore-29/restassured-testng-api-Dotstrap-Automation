package com.kishore.qa.sut.service;

import com.kishore.qa.sut.api.ProblemException.FieldError;
import com.kishore.qa.sut.api.Problems;
import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.domain.CreditPack;
import com.kishore.qa.sut.domain.LedgerEntry;
import com.kishore.qa.sut.domain.Purchase;
import com.kishore.qa.sut.domain.Region;
import java.time.Clock;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.regex.Pattern;

/**
 * Credits: balance, history, purchases and spending. A purchase is idempotent per account and
 * Idempotency-Key: the first request does the work, a concurrent or later request with the same key
 * and the same body gets the original result, and the same key with a different body is refused.
 */
public final class CreditService {

  private static final Pattern KEY = Pattern.compile("[A-Za-z0-9_-]{8,64}");

  /** A purchase and whether this response is a replay of an earlier one. */
  public record PurchaseOutcome(Purchase purchase, boolean replayed) {}

  private final DataPlane plane;
  private final Clock clock;

  public CreditService(DataPlane plane, Clock clock) {
    this.plane = plane;
    this.clock = clock;
  }

  public Ledger ledgerOf(Account account) {
    Ledger ledger = plane.store(account.region()).ledgers().get(account.id());
    if (ledger == null) {
      throw Problems.notFound("No ledger for this account.");
    }
    return ledger;
  }

  public PurchaseOutcome purchase(Account account, String idempotencyKey, String packId) {
    if (idempotencyKey == null || !KEY.matcher(idempotencyKey).matches()) {
      throw Problems.idempotencyKeyRequired();
    }
    CreditPack pack =
        CreditPack.fromId(packId)
            .orElseThrow(
                () ->
                    Problems.validation(
                        List.of(new FieldError("packId", "one of: pack-10, pack-50"))));
    String fingerprint = "packId=" + pack.id();
    Ledger ledger = ledgerOf(account);

    CompletableFuture<Purchase> mine = new CompletableFuture<>();
    CompletableFuture<Purchase> earlier = ledger.purchasesByKey().putIfAbsent(idempotencyKey, mine);
    if (earlier == null) {
      try {
        String purchaseId = "pur_" + UUID.randomUUID();
        LedgerEntry entry =
            ledger.post(LedgerEntry.Type.PURCHASE, pack.credits(), purchaseId, clock.instant());
        Purchase purchase =
            new Purchase(
                purchaseId,
                account.id(),
                pack,
                entry.balanceAfter(),
                idempotencyKey,
                fingerprint,
                entry.createdAt());
        mine.complete(purchase);
        return new PurchaseOutcome(purchase, false);
      } catch (RuntimeException e) {
        ledger.purchasesByKey().remove(idempotencyKey, mine);
        mine.completeExceptionally(e);
        throw e;
      }
    }
    Purchase original;
    try {
      original = earlier.join();
    } catch (CompletionException e) {
      throw e.getCause() instanceof RuntimeException runtime ? runtime : e;
    }
    if (!original.requestFingerprint().equals(fingerprint)) {
      throw Problems.idempotencyKeyReused();
    }
    return new PurchaseOutcome(original, true);
  }

  /** Charges one credit; a 402 problem when the balance is zero. */
  public void spendOne(Account account, String reference) {
    Ledger ledger = ledgerOf(account);
    synchronized (ledger) {
      if (ledger.balance() < 1) {
        throw Problems.insufficientCredits(ledger.balance());
      }
      ledger.post(LedgerEntry.Type.SPEND, -1, reference, clock.instant());
    }
  }

  public int purchaseCount() {
    int total = 0;
    for (Region region : Region.values()) {
      total +=
          plane.store(region).ledgers().values().stream().mapToInt(Ledger::purchaseCount).sum();
    }
    return total;
  }
}
