package com.kishore.qa.tests.resilience;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.assertions.Contracts;
import com.kishore.qa.framework.clients.CreditsClient;
import com.kishore.qa.framework.clients.Sut;
import com.kishore.qa.framework.clients.model.Purchase;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.CallOptions;
import com.kishore.qa.framework.data.Region;
import com.kishore.qa.framework.data.TestAccount;
import com.kishore.qa.framework.data.TestData;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;
import org.testng.annotations.Test;

/** A retried purchase must reuse the original result and never charge twice. */
public class IdempotencyTest {

  private final Sut sut = Sut.connect();

  @Test(
      groups = {"regression", "resilience"},
      description = "Same key + same body replays the original purchase")
  @Feature("FEAT-IDEMP-01")
  @Severity(SeverityLevel.CRITICAL)
  public void replayReturnsTheOriginalAndChargesOnce() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      CreditsClient credits = sut.credits(ava);
      CallOptions key = CallOptions.idempotencyKey(TestData.idempotencyKey());

      Purchase first =
          Contracts.read(credits.purchase("pack-10", key), 201, "purchase", Purchase.class);
      ApiResponse replay = credits.purchase("pack-10", key);

      assertThatResponse(replay)
          .hasStatus(200)
          .hasHeader("Idempotent-Replayed", "true")
          .matchesContract("purchase");
      assertThat(replay.as(Purchase.class)).isEqualTo(first);
      assertThat(credits.currentBalance()).as("charged once").isEqualTo(15);
    }
  }

  @Test(
      groups = {"regression", "resilience"},
      description = "Same key + different body is a 409 and charges nothing")
  @Feature("FEAT-IDEMP-02")
  public void reusingAKeyForADifferentPurchaseIsRefused() {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      CreditsClient credits = sut.credits(ava);
      CallOptions key = CallOptions.idempotencyKey(TestData.idempotencyKey());
      assertThatResponse(credits.purchase("pack-10", key)).hasStatus(201);

      assertThatResponse(credits.purchase("pack-50", key)).isProblem(409, "idempotency-key-reused");
      assertThat(credits.currentBalance()).as("only the first purchase counted").isEqualTo(15);
    }
  }

  @Test(
      groups = {"regression", "resilience"},
      description = "Six concurrent duplicates: one purchase, five replays, one charge")
  @Feature("FEAT-IDEMP-01")
  public void concurrentDuplicatesProduceOnePurchase() throws Exception {
    try (TestAccount ava = sut.newAccount(Region.EU);
        ExecutorService pool = Executors.newFixedThreadPool(6)) {
      CallOptions key = CallOptions.idempotencyKey(TestData.idempotencyKey());
      List<Callable<ApiResponse>> duplicates =
          IntStream.range(0, 6)
              .<Callable<ApiResponse>>mapToObj(i -> () -> sut.credits(ava).purchase("pack-10", key))
              .toList();

      List<Future<ApiResponse>> results = pool.invokeAll(duplicates);

      List<Integer> statuses = results.stream().map(IdempotencyTest::status).toList();
      List<String> ids = results.stream().map(f -> body(f).id()).distinct().toList();
      assertThat(statuses).containsOnlyOnce(201).containsOnly(201, 200);
      assertThat(ids).as("every response names the same purchase").hasSize(1);
      assertThat(sut.credits(ava).currentBalance()).as("charged once").isEqualTo(15);
    }
  }

  @Test(
      groups = {"regression", "resilience"},
      description = "Keys are scoped per account")
  @Feature("FEAT-IDEMP-01")
  public void theSameKeyFromTwoAccountsMakesTwoPurchases() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.US)) {
      CallOptions key = CallOptions.idempotencyKey(TestData.idempotencyKey());

      Purchase avas =
          Contracts.read(
              sut.credits(ava).purchase("pack-10", key), 201, "purchase", Purchase.class);
      Purchase bens =
          Contracts.read(
              sut.credits(ben).purchase("pack-10", key), 201, "purchase", Purchase.class);

      assertThat(avas.id()).isNotEqualTo(bens.id());
    }
  }

  private static int status(Future<ApiResponse> future) {
    return getUnchecked(future).status();
  }

  private static Purchase body(Future<ApiResponse> future) {
    return getUnchecked(future).as(Purchase.class);
  }

  private static ApiResponse getUnchecked(Future<ApiResponse> future) {
    try {
      return future.get();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new IllegalStateException(e);
    } catch (ExecutionException e) {
      throw new IllegalStateException(e.getCause());
    }
  }
}
