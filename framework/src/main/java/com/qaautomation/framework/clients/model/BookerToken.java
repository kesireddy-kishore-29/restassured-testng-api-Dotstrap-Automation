package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** Restful-Booker /auth response. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record BookerToken(String token) {}
