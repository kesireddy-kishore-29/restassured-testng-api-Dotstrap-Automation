package com.qaautomation.framework.data;

import com.qaautomation.framework.clients.model.NewAccount;
import java.util.UUID;

/**
 * Unique, recognisable test data. Every handle starts with {@code qa-} so anything a crashed run
 * leaves behind can be found and swept; nothing is shared between tests.
 */
public final class TestData {

  public static final String PREFIX = "qa-";

  private TestData() {}

  public static String uniqueHandle() {
    return PREFIX + UUID.randomUUID().toString().replace("-", "").substring(0, 12);
  }

  public static String password() {
    return "pw-" + UUID.randomUUID();
  }

  public static NewAccount newAccount(Region region) {
    String handle = uniqueHandle();
    return new NewAccount(
        handle, "QA " + handle.substring(PREFIX.length()), password(), region.code());
  }

  /** A fresh key per logical operation: 35 characters from [a-z0-9-]. */
  public static String idempotencyKey() {
    return PREFIX + UUID.randomUUID().toString().replace("-", "");
  }
}
