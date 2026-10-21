package com.qaautomation.framework.config;

/** A username/password pair whose {@link #toString()} never prints the password. */
public record Credentials(String username, String password) {

  @Override
  public String toString() {
    return "Credentials[username=" + username + ", password=****]";
  }
}
