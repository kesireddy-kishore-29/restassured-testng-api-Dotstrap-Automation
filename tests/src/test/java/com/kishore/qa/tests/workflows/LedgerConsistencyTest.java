package com.kishore.qa.tests.workflows;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Ledger;
import com.kishore.qa.framework.clients.model.LedgerEntry;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import com.kishore.qa.framework.data.TestData;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import org.testng.annotations.Test;

/** The ledger's invariant: the history sums to the balance, and every running total is right. */
public class LedgerConsistencyTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "workflow"},
      description = "Grants, purchases and spends sum to the balance")
  @Feature("FEAT-LEDGER-01")
  public void historySumsToTheBalance() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      assertThatResponse(
              sut.credits(ava)
                  .purchase("pack-10", CallOptions.idempotencyKey(TestData.idempotencyKey())))
          .hasStatus(201);
      assertThatResponse(
              sut.credits(ava)
                  .purchase("pack-50", CallOptions.idempotencyKey(TestData.idempotencyKey())))
          .hasStatus(201);
      assertThatResponse(sut.conversations(ava).start(ben.handle(), "Paid message", "Hi"))
          .hasStatus(201);

      Ledger ledger = sut.credits(ava).currentLedger();

      assertThat(ledger.items())
          .extracting(LedgerEntry::type)
          .containsExactly("grant", "purchase", "purchase", "spend");
      assertThat(ledger.items()).extracting(LedgerEntry::amount).containsExactly(5, 10, 50, -1);
      assertThat(ledger.balance()).isEqualTo(64).isEqualTo(sut.credits(ava).currentBalance());
      assertRunningTotals(ledger.items());
    }
  }

  @Test(
      groups = {"regression", "workflow"},
      description = "Ten concurrent purchases are all counted, exactly once")
  @Feature("FEAT-LEDGER-03")
  public void concurrentPurchasesSumCorrectly() throws Exception {
    try (TestAccount ava = sut.newAccount(Region.US);
        ExecutorService pool = Executors.newFixedThreadPool(10)) {
      List<Callable<ApiResponse>> purchases =
          IntStream.range(0, 10)
              .<Callable<ApiResponse>>mapToObj(
                  i ->
                      () ->
                          sut.credits(ava)
                              .purchase(
                                  "pack-10", CallOptions.idempotencyKey(TestData.idempotencyKey())))
              .toList();

      List<Future<ApiResponse>> results = pool.invokeAll(purchases);

      for (Future<ApiResponse> result : results) {
        assertThatResponse(result.get()).hasStatus(201);
      }
      Ledger ledger = sut.credits(ava).currentLedger();
      assertThat(ledger.balance()).isEqualTo(5 + 10 * 10);
      assertThat(ledger.items()).hasSize(11);
      assertRunningTotals(ledger.items());
    }
  }

  /** Every entry's balanceAfter is the previous balance plus its amount. */
  private static void assertRunningTotals(List<LedgerEntry> entries) {
    int running = 0;
    for (LedgerEntry entry : entries) {
      running += entry.amount();
      assertThat(entry.balanceAfter()).as("running total after %s", entry.id()).isEqualTo(running);
    }
  }
}
