package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** A bearer token for the reference service. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Token(String accessToken, String tokenType, long expiresIn, String accountId) {}
