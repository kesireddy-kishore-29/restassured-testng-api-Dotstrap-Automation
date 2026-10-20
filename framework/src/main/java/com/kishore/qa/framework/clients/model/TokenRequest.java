package com.kishore.qa.framework.clients.model;

/** Request body for a token; ttlSeconds is optional. */
public record TokenRequest(String handle, String password, Integer ttlSeconds) {}
