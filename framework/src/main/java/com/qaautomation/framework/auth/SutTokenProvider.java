package com.qaautomation.framework.auth;

import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.AuthClient;
import com.qaautomation.framework.clients.model.Token;
import java.time.Clock;

/**
 * Bearer tokens for one reference-service account, cached per thread and refreshed shortly before
 * they expire. Per-thread caching keeps parallel tests independent without a lock.
 */
public final class SutTokenProvider implements TokenProvider {

  private final AuthClient auth;
  private final String handle;
  private final String password;
  private final Clock clock;
  private final ThreadLocal<CachedToken> cache = new ThreadLocal<>();

  public SutTokenProvider(AuthClient auth, String handle, String password, Clock clock) {
    this.auth = auth;
    this.handle = handle;
    this.password = password;
    this.clock = clock;
  }

  @Override
  public String token() {
    CachedToken cached = cache.get();
    if (cached == null || !cached.isUsable(clock)) {
      Token issued = Contracts.read(auth.token(handle, password), 200, "token", Token.class);
      cached =
          new CachedToken(
              issued.accessToken(),
              clock.instant().plusSeconds(issued.expiresIn()).minus(CachedToken.MARGIN));
      cache.set(cached);
    }
    return cached.value();
  }
}
