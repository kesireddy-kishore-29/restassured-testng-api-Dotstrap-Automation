package com.qaautomation.framework.auth;

/** Supplies a bearer token for one identity, fetching and caching it as needed. */
@FunctionalInterface
public interface TokenProvider {

  String token();
}
