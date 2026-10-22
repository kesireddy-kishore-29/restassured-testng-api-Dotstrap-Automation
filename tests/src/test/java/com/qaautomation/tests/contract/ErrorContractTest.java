package com.qaautomation.tests.contract;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.clients.ContractProbe;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.Conversation;
import com.qaautomation.framework.clients.model.DisplayNameChange;
import com.qaautomation.framework.clients.model.NewAccount;
import com.qaautomation.framework.clients.model.PurchaseRequest;
import com.qaautomation.framework.clients.model.SendMessage;
import com.qaautomation.framework.clients.model.StartConversation;
import com.qaautomation.framework.clients.model.TokenRequest;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Fault;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import com.qaautomation.framework.data.TestData;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Every error the OpenAPI document promises, provoked on every operation that documents it. The
 * client's conformance filter checks each answer against its documented schema, so a test here
 * passes only when the status, the problem type and the body all match the document. Together with
 * the other suites this exercises every documented response code (the contract coverage in the
 * nightly report).
 */
public class ErrorContractTest {

  private static final String MALFORMED_JSON = "{\"broken\": ";
  private static final String NOT_JSON = "plain=text";

  private final Sut sut = Sut.connect();

  /** One call of an operation: its OpenAPI name, a valid body (or none) and options. */
  private record Call(String operation, Object body, CallOptions options, Object... params) {
    ApiResponse send(ContractProbe probe) {
      return probe.call(operation, body, options, params);
    }
  }

  /** The operations that need a token, called with valid input for this caller. */
  private static List<Call> protectedCalls(String otherHandle, String conversationId) {
    return List.of(
        new Call("GET /v1/accounts/me", null, CallOptions.none()),
        new Call("PATCH /v1/accounts/me", new DisplayNameChange("Probe"), CallOptions.none()),
        new Call("DELETE /v1/accounts/me", null, CallOptions.none()),
        new Call("GET /v1/accounts/{handle}", null, CallOptions.none(), otherHandle),
        new Call(
            "POST /v1/conversations",
            new StartConversation(otherHandle, "Probe", "Hi"),
            CallOptions.none()),
        new Call("GET /v1/conversations", null, CallOptions.none()),
        new Call("GET /v1/conversations/{id}", null, CallOptions.none(), conversationId),
        new Call("GET /v1/conversations/{id}/messages", null, CallOptions.none(), conversationId),
        new Call(
            "POST /v1/conversations/{id}/messages",
            new SendMessage("Hi"),
            CallOptions.none(),
            conversationId),
        new Call("POST /v1/conversations/{id}/read", null, CallOptions.none(), conversationId),
        new Call("POST /v1/conversations/{id}/close", null, CallOptions.none(), conversationId),
        new Call("GET /v1/credits/balance", null, CallOptions.none()),
        new Call("GET /v1/credits/ledger", null, CallOptions.none()),
        new Call(
            "POST /v1/credits/purchases",
            new PurchaseRequest("pack-10"),
            CallOptions.idempotencyKey(TestData.idempotencyKey())),
        new Call("GET /v1/admin/stats", null, CallOptions.none()));
  }

  /** Every /v1 operation: the protected ones and the two anonymous ones. */
  private static List<Call> allV1Calls(String handle, String password, String conversationId) {
    List<Call> anonymous =
        List.of(
            new Call(
                "POST /v1/auth/token",
                new TokenRequest(handle, password, null),
                CallOptions.none()),
            new Call("POST /v1/accounts", TestData.newAccount(Region.EU), CallOptions.none()));
    return Stream.concat(anonymous.stream(), protectedCalls(handle, conversationId).stream())
        .toList();
  }

  private static Object[][] rows(List<Call> calls) {
    return calls.stream().map(c -> new Object[] {c.operation()}).toArray(Object[][]::new);
  }

  private static Call find(List<Call> calls, String operation) {
    return calls.stream()
        .filter(c -> c.operation().equals(operation))
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("No call for " + operation));
  }

  private Conversation startConversation(TestAccount from, TestAccount to) {
    return sut.conversations(from)
        .start(to.handle(), "Error contract", "Hi")
        .as(Conversation.class);
  }

  // ---- 401 --------------------------------------------------------------------------------

  @DataProvider(name = "protectedOperations", parallel = true)
  public Object[][] protectedOperations() {
    return rows(protectedCalls("qa-anyone", "cnv_any"));
  }

  @Test(
      groups = {"contract", "regression"},
      dataProvider = "protectedOperations",
      description = "Every protected operation answers a missing token with a 401 problem")
  @Feature({"FEAT-AUTHZ-01", "FEAT-ERR-01", "FEAT-CONTRACT-02"})
  @Severity(SeverityLevel.CRITICAL)
  public void missingTokenIsA401(String operation) {
    Call call = find(protectedCalls("qa-anyone", "cnv_any"), operation);

    assertThatResponse(call.send(sut.probe())).isProblem(401, "unauthenticated");
  }

  // ---- 503 --------------------------------------------------------------------------------

  @DataProvider(name = "v1Operations", parallel = true)
  public Object[][] v1Operations() {
    return rows(allV1Calls("qa-anyone", "unused", "cnv_any"));
  }

  @Test(
      groups = {"contract", "regression", "resilience"},
      dataProvider = "v1Operations",
      description = "Every operation answers an outage with a 503 problem and Retry-After")
  @Feature({"FEAT-RES-03", "FEAT-ERR-01", "FEAT-CONTRACT-02"})
  public void outageIsA503WithRetryAfter(String operation) {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started = startConversation(ava, ben);
      Call valid = find(allV1Calls(ava.handle(), ava.password(), started.id()), operation);
      Call outage =
          new Call(
              valid.operation(),
              valid.body(),
              valid.options().withFault(Fault.unavailableOnce()),
              valid.params());

      assertThatResponse(outage.send(sut.probe(ava)))
          .isProblem(503, "fault-injected")
          .hasHeader("Retry-After", "1");
    }
  }

  // ---- 429 --------------------------------------------------------------------------------

  @Test(
      groups = {"contract", "regression", "security"},
      description = "Past its rate limit, a token gets a 429 problem from every operation")
  @Feature({"FEAT-RATE-01", "FEAT-ERR-01", "FEAT-CONTRACT-02"})
  public void pastTheLimitEveryOperationIsA429() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started = startConversation(ava, ben);
      ContractProbe probe = sut.probe(ava);
      List<Call> calls = allV1Calls(ava.handle(), ava.password(), started.id());

      ApiResponse limited = exhaustTheWindow(probe);
      for (Call call : calls) {
        assertThatResponse(call.send(probe))
            .as(call.operation())
            .isProblem(429, "rate-limited")
            .hasHeader("Retry-After");
      }

      long retryAfter = Long.parseLong(limited.header("Retry-After").orElseThrow());
      // Poll on this thread: tokens are cached per thread, and a new token would be a new window.
      await("rate limit window resets")
          .pollInSameThread()
          .atMost(Duration.ofSeconds(retryAfter + 5))
          .pollInterval(Duration.ofMillis(500))
          .until(() -> probe.call("GET /v1/accounts/me", null, CallOptions.none()).status() == 200);
    }
  }

  /**
   * Uses up this token's window with cheap calls and returns the first 429. When fewer than three
   * seconds of the window are left, it waits for the next one first, so the calls that follow all
   * land in a window that is used up.
   */
  private static ApiResponse exhaustTheWindow(ContractProbe probe) {
    ApiResponse first = probe.call("GET /v1/accounts/me", null, CallOptions.none());
    long reset = Long.parseLong(first.header("RateLimit-Reset").orElseThrow());
    if (reset < 3) {
      await("a fresh rate limit window")
          .pollInSameThread()
          .atMost(Duration.ofSeconds(reset + 5))
          .pollInterval(Duration.ofMillis(250))
          .until(
              () -> {
                ApiResponse r = probe.call("GET /v1/accounts/me", null, CallOptions.none());
                return Long.parseLong(r.header("RateLimit-Reset").orElseThrow()) >= 3;
              });
    }
    int limit = Integer.parseInt(first.header("RateLimit-Limit").orElseThrow());
    ApiResponse last = first;
    for (int i = 0; i <= limit && last.status() != 429; i++) {
      last = probe.call("GET /v1/accounts/me", null, CallOptions.none());
    }
    assertThatResponse(last).isProblem(429, "rate-limited").hasHeader("RateLimit-Remaining", "0");
    return last;
  }

  // ---- 400, 415, 422 ----------------------------------------------------------------------

  @DataProvider(name = "badBodies", parallel = true)
  public Object[][] badBodies() {
    String[] operations = {
      "POST /v1/auth/token",
      "POST /v1/accounts",
      "PATCH /v1/accounts/me",
      "POST /v1/conversations",
      "POST /v1/conversations/{id}/messages",
      "POST /v1/credits/purchases",
    };
    return Arrays.stream(operations)
        .flatMap(
            op -> Stream.of(new Object[] {op, 400}, new Object[] {op, 415}, new Object[] {op, 422}))
        .toArray(Object[][]::new);
  }

  @Test(
      groups = {"contract", "regression"},
      dataProvider = "badBodies",
      description = "Every operation with a body answers bad JSON 400, not JSON 415, invalid 422")
  @Feature({"FEAT-ERR-01", "FEAT-CONTRACT-02"})
  public void aBadBodyIsAProblem(String operation, int status) {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started = startConversation(ava, ben);
      boolean anonymous =
          operation.startsWith("POST /v1/auth") || operation.equals("POST /v1/accounts");
      ContractProbe probe = anonymous ? sut.probe() : sut.probe(ava);
      CallOptions options =
          operation.equals("POST /v1/credits/purchases")
              ? CallOptions.idempotencyKey(TestData.idempotencyKey())
              : CallOptions.none();
      Object[] params = operation.contains("{id}") ? new Object[] {started.id()} : new Object[] {};

      switch (status) {
        case 400 ->
            assertThatResponse(
                    probe.callRaw(operation, MALFORMED_JSON, "application/json", options, params))
                .isProblem(400, "malformed-json");
        case 415 ->
            assertThatResponse(probe.callRaw(operation, NOT_JSON, "text/plain", options, params))
                .isProblem(415, "unsupported-media-type");
        default -> {
          Invalid invalid = invalidBody(operation, ava, ben);
          assertThatResponse(probe.call(operation, invalid.body(), options, params))
              .hasFieldError(invalid.field());
        }
      }
    }
  }

  private record Invalid(Object body, String field) {}

  private static Invalid invalidBody(String operation, TestAccount ava, TestAccount ben) {
    return switch (operation) {
      case "POST /v1/auth/token" ->
          new Invalid(new TokenRequest(ava.handle(), ava.password(), 0), "ttlSeconds");
      case "POST /v1/accounts" ->
          new Invalid(new NewAccount("ab", "Name", TestData.password(), "eu"), "handle");
      case "PATCH /v1/accounts/me" -> new Invalid(new DisplayNameChange("   "), "displayName");
      case "POST /v1/conversations" ->
          new Invalid(new StartConversation(ben.handle(), " ", "Hi"), "subject");
      case "POST /v1/conversations/{id}/messages" -> new Invalid(new SendMessage(" "), "body");
      case "POST /v1/credits/purchases" -> new Invalid(new PurchaseRequest("pack-0"), "packId");
      default -> throw new IllegalArgumentException("No invalid body for " + operation);
    };
  }

  // ---- 404, 403 ---------------------------------------------------------------------------

  @DataProvider(name = "conversationOperations", parallel = true)
  public Object[][] conversationOperations() {
    return new Object[][] {
      {"GET /v1/conversations/{id}"},
      {"GET /v1/conversations/{id}/messages"},
      {"POST /v1/conversations/{id}/messages"},
      {"POST /v1/conversations/{id}/read"},
      {"POST /v1/conversations/{id}/close"},
    };
  }

  @Test(
      groups = {"contract", "regression"},
      dataProvider = "conversationOperations",
      description = "Every conversation operation answers an unknown id with a 404 problem")
  @Feature({"FEAT-ERR-01", "FEAT-CONTRACT-02"})
  public void unknownConversationIsA404(String operation) {
    try (TestAccount ava = sut.newAccount(Region.EU)) {
      Call call = find(protectedCalls("qa-anyone", "cnv_does-not-exist"), operation);

      assertThatResponse(call.send(sut.probe(ava))).isProblem(404, "not-found");
    }
  }

  @Test(
      groups = {"contract", "regression", "security"},
      dataProvider = "conversationOperations",
      description = "Every conversation operation answers an outsider with a 403 problem")
  @Feature({"FEAT-AUTHZ-01", "FEAT-ERR-01", "FEAT-CONTRACT-02"})
  public void outsiderIsA403(String operation) {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU);
        TestAccount eve = sut.newAccount(Region.EU)) {
      Conversation started = startConversation(ava, ben);
      Call call = find(protectedCalls(ben.handle(), started.id()), operation);

      assertThatResponse(call.send(sut.probe(eve))).isProblem(403, "forbidden");
    }
  }

  // ---- 402, the administrator's 200, the document itself ----------------------------------

  @Test(
      groups = {"contract", "regression"},
      description = "With no credits left, starting a conversation is a 402 and nothing is charged")
  @Feature({"FEAT-LEDGER-02", "FEAT-ERR-01", "FEAT-CONTRACT-02"})
  public void startingAConversationWithNoCreditsIsA402() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      Conversation started = startConversation(ava, ben);
      for (int i = 2; i <= 5; i++) {
        assertThatResponse(sut.conversations(ava).send(started.id(), Integer.toString(i)))
            .hasStatus(201);
      }
      assertThat(sut.credits(ava).currentBalance()).as("five free credits spent").isZero();

      assertThatResponse(sut.conversations(ava).start(ben.handle(), "One more", "Hi"))
          .isProblem(402, "insufficient-credits");
      assertThat(sut.credits(ava).currentLedger().items())
          .as("no entry for the refused conversation")
          .hasSize(6);
    }
  }

  @Test(
      groups = {"contract", "regression", "security"},
      description = "The administrator gets the service statistics")
  @Feature({"FEAT-AUTHZ-01", "FEAT-CONTRACT-02"})
  public void theAdministratorGetsTheStatistics() {
    try (TestAccount ava = sut.newAccount(Region.EU);
        TestAccount ben = sut.newAccount(Region.EU)) {
      startConversation(ava, ben);

      ApiResponse stats = sut.administrator().stats();

      assertThatResponse(stats).hasStatus(200);
      assertThat(stats.json().getInt("accounts"))
          .as("ava, ben and the admin at least")
          .isGreaterThanOrEqualTo(3);
      assertThat(stats.json().getInt("conversations")).isPositive();
    }
  }

  @Test(
      groups = {"contract", "regression"},
      description = "The OpenAPI document is served and names every operation")
  @Feature("FEAT-CONTRACT-02")
  public void theOpenApiDocumentIsServed() {
    ApiResponse document = sut.probe().call("GET /openapi.yaml", null, CallOptions.none());

    assertThatResponse(document).hasStatus(200);
    assertThat(document.contentType()).startsWith("application/yaml");
    assertThat(document.body())
        .startsWith("openapi: 3.")
        .contains("/v1/conversations/{id}/messages:", "/v1/credits/purchases:");
  }
}
