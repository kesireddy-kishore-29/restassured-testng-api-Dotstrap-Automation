package com.qaautomation.sut.service;

import com.qaautomation.sut.domain.Account;
import com.qaautomation.sut.domain.Conversation;
import com.qaautomation.sut.domain.Region;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/** Everything stored in one region. Data never moves between regional stores. */
public final class RegionalStore {

  private final Region region;
  private final ConcurrentMap<String, Account> accounts = new ConcurrentHashMap<>();
  private final ConcurrentMap<String, Conversation> conversations = new ConcurrentHashMap<>();
  private final ConcurrentMap<String, Ledger> ledgers = new ConcurrentHashMap<>();

  public RegionalStore(Region region) {
    this.region = region;
  }

  public Region region() {
    return region;
  }

  public ConcurrentMap<String, Account> accounts() {
    return accounts;
  }

  public ConcurrentMap<String, Conversation> conversations() {
    return conversations;
  }

  public ConcurrentMap<String, Ledger> ledgers() {
    return ledgers;
  }
}
