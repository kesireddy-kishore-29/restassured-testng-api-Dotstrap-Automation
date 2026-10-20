package com.kishore.qa.framework.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.net.SocketTimeoutException;
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Supplier;
import org.testng.annotations.Test;

public class RetryPolicyTest {

  /** Each test gets its own recorder: TestNG reuses one class instance for every method. */
  private static final class RecordingSleeper implements Sleeper {
    private final List<Duration> sleeps = new ArrayList<>();

    @Override
    public void sleep(Duration duration) {
      sleeps.add(duration);
    }
  }

  private static Supplier<ApiResponse> sequence(ApiResponse... responses) {
    Deque<ApiResponse> queue = new ArrayDeque<>(List.of(responses));
    return queue::removeFirst;
  }

  @Test
  public void retries503HonouringRetryAfterThenReturnsTheSuccess() {
    RecordingSleeper recorder = new RecordingSleeper();
    RetryPolicy policy = new RetryPolicy(2, Duration.ofSeconds(5), recorder);

    ApiResponse result =
        policy.execute(
            "GET /x",
            true,
            sequence(FakeResponses.status(503, "2"), FakeResponses.status(200, null)));

    assertThat(result.status()).isEqualTo(200);
    assertThat(recorder.sleeps).containsExactly(Duration.ofSeconds(2));
  }

  @Test
  public void capsTheBackOffAndDefaultsWhenRetryAfterIsMissing() {
    RecordingSleeper recorder = new RecordingSleeper();
    RetryPolicy policy = new RetryPolicy(2, Duration.ofSeconds(5), recorder);

    policy.execute(
        "GET /x",
        true,
        sequence(
            FakeResponses.status(503, "120"),
            FakeResponses.status(503, null),
            FakeResponses.status(200, null)));

    assertThat(recorder.sleeps)
        .containsExactly(RetryPolicy.MAX_BACKOFF, RetryPolicy.DEFAULT_BACKOFF);
  }

  @Test
  public void neverRetriesARequestThatIsNotSafeToRepeat() {
    RecordingSleeper recorder = new RecordingSleeper();
    RetryPolicy policy = new RetryPolicy(2, Duration.ofSeconds(5), recorder);

    ApiResponse result =
        policy.execute(
            "POST /x",
            false,
            sequence(FakeResponses.status(503, "1"), FakeResponses.status(200, null)));

    assertThat(result.status()).isEqualTo(503);
    assertThat(recorder.sleeps).isEmpty();
  }

  @Test
  public void neverRetries429SoRateLimitingStaysVisible() {
    RecordingSleeper recorder = new RecordingSleeper();
    RetryPolicy policy = new RetryPolicy(2, Duration.ofSeconds(5), recorder);

    ApiResponse result =
        policy.execute(
            "GET /x",
            true,
            sequence(FakeResponses.status(429, "1"), FakeResponses.status(200, null)));

    assertThat(result.status()).isEqualTo(429);
  }

  @Test
  public void givesUpOnTimeoutsAfterTheBudgetAndSaysHowManyAttempts() {
    RecordingSleeper recorder = new RecordingSleeper();
    RetryPolicy policy = new RetryPolicy(1, Duration.ofMillis(300), recorder);
    // Exactly what REST Assured does: a checked SocketTimeoutException, thrown undeclared.
    Supplier<ApiResponse> alwaysTimesOut =
        () -> {
          throw RetryPolicyTest.<RuntimeException>sneaky(
              new SocketTimeoutException("Read timed out"));
        };

    assertThatThrownBy(() -> policy.execute("GET /slow", true, alwaysTimesOut))
        .isInstanceOf(ApiTimeoutException.class)
        .hasMessageContaining("GET /slow timed out after 2 attempt(s) of 300 ms each");
  }

  @Test
  public void rejectsAnUnboundedBudget() {
    assertThatThrownBy(() -> new RetryPolicy(5, Duration.ofSeconds(1), new RecordingSleeper()))
        .isInstanceOf(IllegalArgumentException.class);
  }

  /** Throws a checked exception without declaring it, the way Groovy-compiled code does. */
  @SuppressWarnings("unchecked") // the cast is the point: it re-labels the checked exception
  private static <E extends Throwable> E sneaky(Throwable error) throws E {
    throw (E) error;
  }
}
