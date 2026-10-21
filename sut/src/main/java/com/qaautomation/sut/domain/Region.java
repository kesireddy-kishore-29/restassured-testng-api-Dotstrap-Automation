package com.qaautomation.sut.domain;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

/** Home regions. An account's data lives only in its home region's store. */
public enum Region {
  IN,
  EU,
  US;

  public String code() {
    return name().toLowerCase(Locale.ROOT);
  }

  public static Optional<Region> fromCode(String code) {
    if (code == null) {
      return Optional.empty();
    }
    return Arrays.stream(values()).filter(r -> r.code().equals(code)).findFirst();
  }
}
