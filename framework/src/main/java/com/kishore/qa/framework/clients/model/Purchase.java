package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;

/** A completed credit purchase. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Purchase(
    String id, String packId, int credits, int balanceAfter, Instant createdAt) {}
