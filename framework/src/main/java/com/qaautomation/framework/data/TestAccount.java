package com.qaautomation.framework.data;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;

import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.auth.SutTokenProvider;
import com.qaautomation.framework.auth.TokenProvider;
import com.qaautomation.framework.clients.Sut;
import com.qaautomation.framework.clients.model.Account;
import com.qaautomation.framework.clients.model.NewAccount;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.evidence.TestContext;
import java.time.Clock;
import java.util.Locale;
import java.util.function.Supplier;

/**
 * A reference-service account that exists for one test. Created through the API, closed through the
 * API, and the close is VERIFIED: after deletion the account must no longer be able to sign in. Use
 * it with try-with-resources; the evidence listener reports any account a test forgot to close.
 */
public final class TestAccount implements AutoCloseable {

  private final Sut sut;
  private final Account account;
  private final String password;
  private final TokenProvider tokens;
  private boolean closed;

  private TestAccount(Sut sut, Account account, String password) {
    this.sut = sut;
    this.account = account;
    this.password = password;
    this.tokens = new SutTokenProvider(sut.auth(), account.handle(), password, Clock.systemUTC());
  }

  /** Creates a new account in this region and registers it with the running test. */
  public static TestAccount create(Sut sut, Region region) {
    NewAccount request = TestData.newAccount(region);
    ApiResponse created = sut.accounts().create(request);
    Account account = Contracts.read(created, 201, "account", Account.class);
    TestAccount testAccount = new TestAccount(sut, account, request.password());
    TestContext.current().ifPresent(t -> t.opened(testAccount));
    return testAccount;
  }

  public String id() {
    return account.id();
  }

  public String handle() {
    return account.handle();
  }

  public String password() {
    return password;
  }

  public Region region() {
    return Region.valueOf(account.region().toUpperCase(Locale.ROOT));
  }

  public String token() {
    return tokens.token();
  }

  public Supplier<String> bearer() {
    return tokens::token;
  }

  @Override
  public void close() {
    if (closed) {
      return;
    }
    ApiResponse deleted = sut.accounts(this).deleteMe();
    assertThatResponse(deleted).hasStatus(204);
    ApiResponse signIn = sut.auth().token(handle(), password);
    if (signIn.status() != 401) {
      throw new CleanupFailedException(
          "Account " + handle() + " was deleted but can still sign in (" + signIn.status() + ")");
    }
    closed = true;
    TestContext.current().ifPresent(t -> t.closed(this));
  }

  @Override
  public String toString() {
    return "TestAccount[" + handle() + " in " + account.region() + "]";
  }
}
