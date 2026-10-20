package com.kishore.qa.sut.domain;

import java.util.Arrays;
import java.util.Optional;

/** The packs a person can buy. Prices are illustrative; the service never takes payment. */
public enum CreditPack {
  PACK_10("pack-10", 10),
  PACK_50("pack-50", 50);

  private final String id;
  private final int credits;

  CreditPack(String id, int credits) {
    this.id = id;
    this.credits = credits;
  }

  public String id() {
    return id;
  }

  public int credits() {
    return credits;
  }

  public static Optional<CreditPack> fromId(String id) {
    return Arrays.stream(values()).filter(p -> p.id.equals(id)).findFirst();
  }
}
