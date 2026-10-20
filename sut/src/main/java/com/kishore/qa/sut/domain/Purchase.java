package com.kishore.qa.sut.domain;

import java.time.Instant;

/** A completed credit purchase, remembered with the key and request fingerprint that made it. */
public record Purchase(
    String id,
    String accountId,
    CreditPack pack,
    int balanceAfter,
    String idempotencyKey,
    String requestFingerprint,
    Instant createdAt) {}
