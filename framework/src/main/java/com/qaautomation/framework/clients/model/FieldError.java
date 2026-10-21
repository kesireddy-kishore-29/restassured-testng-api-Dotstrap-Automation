package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** One field's validation error inside a problem. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FieldError(String field, String message) {}
