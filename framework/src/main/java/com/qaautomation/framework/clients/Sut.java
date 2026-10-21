package com.qaautomation.framework.clients;

import com.qaautomation.framework.config.Config;
import com.qaautomation.framework.config.FrameworkConfig;
import com.qaautomation.framework.core.Endpoint;
import com.qaautomation.framework.core.RequestSpecs;
import com.qaautomation.framework.core.RetryPolicy;
import com.qaautomation.framework.core.Sleeper;
import com.qaautomation.framework.data.Region;
import com.qaautomation.framework.data.TestAccount;
import java.time.Duration;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * The reference service, as tests see it: typed clients per resource and per account, and
 * test-scoped accounts. Immutable; one instance is shared by parallel tests.
 *
 * <pre>{@code
 * try (TestAccount alice = sut.newAccount(Region.EU)) {
 *   assertThatResponse(sut.credits(alice).balance()).hasStatus(200).matchesContract("balance");
 * }
 * }</pre>
 */
public final class Sut {

  private final FrameworkConfig config;
  private final Endpoint endpoint;
  private final Endpoint preflightEndpoint;

  private Sut(FrameworkConfig config, Endpoint endpoint, Endpoint preflightEndpoint) {
    this.config = config;
    this.endpoint = endpoint;
    this.preflightEndpoint = preflightEndpoint;
  }

  /** The shared instance for the configured environment. */
  public static Sut connect() {
    return Holder.DEFAULT;
  }

  public static Sut create(FrameworkConfig config) {
    String openApi = config.sutBaseUrl().resolve("/openapi.yaml").toString();
    RequestSpecs specs = RequestSpecs.forReferenceService(config, openApi);
    RetryPolicy retry =
        new RetryPolicy(config.maxRetries(), config.readTimeout(), Sleeper.system());
    Endpoint main = new Endpoint(config.sutBaseUrl(), specs, retry);
    Endpoint preflight =
        new Endpoint(
            config.sutBaseUrl(),
            specs.withoutContractCheck(config.connectTimeout()),
            RetryPolicy.none(config.readTimeout()));
    return new Sut(config, main, preflight);
  }

  /** The same service with a different client read timeout and retry budget (resilience tests). */
  public Sut withClientLimits(Duration readTimeout, int maxRetries) {
    RequestSpecs specs = endpoint.specs().withReadTimeout(config.connectTimeout(), readTimeout);
    RetryPolicy retry = new RetryPolicy(maxRetries, readTimeout, Sleeper.system());
    return new Sut(config, new Endpoint(endpoint.baseUri(), specs, retry), preflightEndpoint);
  }

  public FrameworkConfig config() {
    return config;
  }

  public TestAccount newAccount(Region region) {
    return TestAccount.create(this, region);
  }

  public HealthClient health() {
    return new HealthClient(endpoint);
  }

  public AuthClient auth() {
    return new AuthClient(endpoint);
  }

  /** Anonymous: create accounts, or show what an unauthenticated caller gets. */
  public AccountsClient accounts() {
    return new AccountsClient(endpoint, Optional.empty());
  }

  public AccountsClient accounts(TestAccount as) {
    return new AccountsClient(endpoint, Optional.of(as.bearer()));
  }

  /** Presents exactly this string as the bearer token (invalid and expired token tests). */
  public AccountsClient accountsWithToken(String rawToken) {
    Supplier<String> fixed = () -> rawToken;
    return new AccountsClient(endpoint, Optional.of(fixed));
  }

  public ConversationsClient conversations(TestAccount as) {
    return new ConversationsClient(endpoint, Optional.of(as.bearer()));
  }

  public CreditsClient credits(TestAccount as) {
    return new CreditsClient(endpoint, Optional.of(as.bearer()));
  }

  public AdminClient admin(TestAccount as) {
    return new AdminClient(endpoint, Optional.of(as.bearer()));
  }

  public CorsClient cors() {
    return new CorsClient(preflightEndpoint, Optional.empty());
  }

  private static final class Holder {
    private static final Sut DEFAULT = create(Config.get());
  }
}
