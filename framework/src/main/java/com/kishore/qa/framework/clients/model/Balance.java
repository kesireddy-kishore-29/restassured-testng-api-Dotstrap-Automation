package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The caller's credit balance. The wire name is declared explicitly: if the service renames the
 * field, the fix is this annotation (and the schema), never the tests that read {@link #balance()}.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Balance(
    @JsonProperty("balance") int balance,
    @JsonProperty("currency") String currency,
    @JsonProperty("accountId") String accountId) {}
