package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.Instant;

/** The signed-in owner's view of an account. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Account(
    String id, String handle, String displayName, String region, String role, Instant createdAt) {}
