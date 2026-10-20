package com.kishore.qa.sut.service;

import java.security.SecureRandom;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/** Opaque bearer tokens with an expiry. Tokens are random; nothing is derivable from them. */
public final class TokenService {

  /** What a presented token turned out to be. */
  public sealed interface Resolution {
    record Valid(String accountId) implements Resolution {}

    record Expired() implements Resolution {}

    record Unknown() implements Resolution {}
  }

  private record Issued(String accountId, Instant expiresAt) {}

  private final ConcurrentMap<String, Issued> issued = new ConcurrentHashMap<>();
  private final SecureRandom random = new SecureRandom();
  private final Clock clock;

  public TokenService(Clock clock) {
    this.clock = clock;
  }

  public String issue(String accountId, Duration ttl) {
    byte[] bytes = new byte[32];
    random.nextBytes(bytes);
    String token = Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    issued.put(token, new Issued(accountId, clock.instant().plus(ttl)));
    return token;
  }

  public Resolution resolve(String token) {
    Issued found = issued.get(token);
    if (found == null) {
      return new Resolution.Unknown();
    }
    if (!clock.instant().isBefore(found.expiresAt())) {
      return new Resolution.Expired();
    }
    return new Resolution.Valid(found.accountId());
  }

  public void revokeAll(String accountId) {
    issued.values().removeIf(i -> i.accountId().equals(accountId));
  }
}
