package com.qaautomation.sut.domain;

import java.time.Instant;

/** A person (or an admin) with a home region. The password is stored only as a salted hash. */
public record Account(
    String id,
    String handle,
    String displayName,
    Region region,
    Role role,
    String passwordSalt,
    String passwordHash,
    Instant createdAt) {

  public enum Role {
    USER,
    ADMIN
  }

  public Account withDisplayName(String newDisplayName) {
    return new Account(
        id, handle, newDisplayName, region, role, passwordSalt, passwordHash, createdAt);
  }
}
