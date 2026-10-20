package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** What anyone may see about an account. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PublicProfile(String handle, String displayName, String region) {}
