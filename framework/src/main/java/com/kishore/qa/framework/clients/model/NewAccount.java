package com.kishore.qa.framework.clients.model;

/** Request body to create an account. */
public record NewAccount(String handle, String displayName, String password, String region) {}
