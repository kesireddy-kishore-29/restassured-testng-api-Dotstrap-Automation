package com.kishore.qa.sut.service;

import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.domain.Conversation;
import com.kishore.qa.sut.domain.Region;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * The three regional stores plus a global directory that only says WHERE a record lives (handle and
 * id to region). The directory holds no personal data; the records stay in their region.
 */
public final class DataPlane {

  private final Map<Region, RegionalStore> stores = new EnumMap<>(Region.class);
  private final ConcurrentMap<String, String> handleToAccountId = new ConcurrentHashMap<>();
  private final ConcurrentMap<String, Region> accountRegion = new ConcurrentHashMap<>();
  private final ConcurrentMap<String, Region> conversationRegion = new ConcurrentHashMap<>();

  public DataPlane() {
    for (Region region : Region.values()) {
      stores.put(region, new RegionalStore(region));
    }
  }

  public RegionalStore store(Region region) {
    return stores.get(region);
  }

  /** Reserves the handle; false when it is already taken. */
  boolean reserveHandle(String handle, String accountId) {
    return handleToAccountId.putIfAbsent(handle, accountId) == null;
  }

  void register(Account account) {
    accountRegion.put(account.id(), account.region());
    store(account.region()).accounts().put(account.id(), account);
  }

  void unregister(Account account) {
    store(account.region()).accounts().remove(account.id());
    store(account.region()).ledgers().remove(account.id());
    accountRegion.remove(account.id());
    handleToAccountId.remove(account.handle(), account.id());
  }

  public Optional<Account> account(String accountId) {
    return Optional.ofNullable(accountRegion.get(accountId))
        .map(region -> store(region).accounts().get(accountId));
  }

  public Optional<Account> accountByHandle(String handle) {
    return Optional.ofNullable(handleToAccountId.get(handle)).flatMap(this::account);
  }

  void putConversation(Conversation conversation) {
    conversationRegion.put(conversation.id(), conversation.region());
    store(conversation.region()).conversations().put(conversation.id(), conversation);
  }

  void removeConversation(Conversation conversation) {
    store(conversation.region()).conversations().remove(conversation.id());
    conversationRegion.remove(conversation.id());
  }

  public Optional<Conversation> conversation(String conversationId) {
    return Optional.ofNullable(conversationRegion.get(conversationId))
        .map(region -> store(region).conversations().get(conversationId));
  }

  public int accountCount() {
    return accountRegion.size();
  }

  public int conversationCount() {
    return conversationRegion.size();
  }
}
