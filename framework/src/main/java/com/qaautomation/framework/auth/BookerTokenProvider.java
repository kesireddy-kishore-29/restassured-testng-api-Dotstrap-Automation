package com.qaautomation.framework.auth;

import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.BookerClient;
import com.qaautomation.framework.clients.model.BookerCredentials;
import com.qaautomation.framework.clients.model.BookerToken;
import com.qaautomation.framework.config.Credentials;
import java.time.Clock;
import java.time.Duration;

/**
 * Restful-Booker admin tokens, cached per thread. The service does not say when a token expires, so
 * tokens are refreshed after a conservative five minutes.
 */
public final class BookerTokenProvider implements TokenProvider {

  private static final Duration LIFETIME = Duration.ofMinutes(5);

  private final BookerClient client;
  private final Credentials credentials;
  private final Clock clock;
  private final ThreadLocal<CachedToken> cache = new ThreadLocal<>();

  public BookerTokenProvider(BookerClient client, Credentials credentials, Clock clock) {
    this.client = client;
    this.credentials = credentials;
    this.clock = clock;
  }

  @Override
  public String token() {
    CachedToken cached = cache.get();
    if (cached == null || !cached.isUsable(clock)) {
      BookerToken issued =
          Contracts.read(
              client.auth(new BookerCredentials(credentials.username(), credentials.password())),
              200,
              "booker-token",
              BookerToken.class);
      cached = new CachedToken(issued.token(), clock.instant().plus(LIFETIME));
      cache.set(cached);
    }
    return cached.value();
  }
}
