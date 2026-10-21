package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;

/** One credit movement; amount is signed. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record LedgerEntry(
    String id, String type, int amount, int balanceAfter, String reference, Instant createdAt) {}
