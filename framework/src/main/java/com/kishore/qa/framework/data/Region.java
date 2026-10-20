package com.kishore.qa.framework.data;

import java.util.Locale;

/** The reference service's home regions. */
public enum Region {
  IN,
  EU,
  US;

  public String code() {
    return name().toLowerCase(Locale.ROOT);
  }
}
