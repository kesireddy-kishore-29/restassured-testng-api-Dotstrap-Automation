package com.kishore.qa.sut.service;

import com.kishore.qa.sut.api.Api.CreateAccountRequest;
import com.kishore.qa.sut.api.ProblemException.FieldError;
import com.kishore.qa.sut.api.Problems;
import com.kishore.qa.sut.domain.Account;
import com.kishore.qa.sut.domain.Account.Role;
import com.kishore.qa.sut.domain.LedgerEntry;
import com.kishore.qa.sut.domain.Region;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/** Account lifecycle: create (with a once-only credit grant), authenticate, update, delete. */
public final class AccountService {

  public static final int FREE_CREDITS = 5;
  private static final Pattern HANDLE = Pattern.compile("[a-z0-9][a-z0-9-]{2,29}");
  private static final int PBKDF2_ITERATIONS = 10_000;

  private final DataPlane plane;
  private final TokenService tokens;
  private final Clock clock;
  private final SecureRandom random = new SecureRandom();

  public AccountService(DataPlane plane, TokenService tokens, Clock clock) {
    this.plane = plane;
    this.tokens = tokens;
    this.clock = clock;
  }

  public Account create(CreateAccountRequest request) {
    List<FieldError> errors = new ArrayList<>();
    String handle = request.handle();
    if (handle == null || !HANDLE.matcher(handle).matches()) {
      errors.add(
          new FieldError("handle", "3-30 characters: a-z, 0-9 and '-', not starting with '-'"));
    }
    validateDisplayName(request.displayName(), errors);
    String password = request.password();
    if (password == null || password.length() < 8 || password.length() > 72) {
      errors.add(new FieldError("password", "8-72 characters"));
    }
    Optional<Region> region = Region.fromCode(request.region());
    if (region.isEmpty()) {
      errors.add(new FieldError("region", "one of: in, eu, us"));
    }
    if (!errors.isEmpty()) {
      throw Problems.validation(errors);
    }
    return register(handle, request.displayName(), password, region.orElseThrow(), Role.USER);
  }

  /** Seeds the admin account at start-up. */
  public Account createAdmin(String handle, String password, Region region) {
    return register(handle, "Administrator", password, region, Role.ADMIN);
  }

  private Account register(
      String handle, String displayName, String password, Region region, Role role) {
    String id = "acc_" + UUID.randomUUID();
    if (!plane.reserveHandle(handle, id)) {
      throw Problems.handleTaken(handle);
    }
    String salt = newSalt();
    Account account =
        new Account(
            id, handle, displayName, region, role, salt, hash(password, salt), clock.instant());
    plane.register(account);
    Ledger ledger = new Ledger();
    plane.store(region).ledgers().put(id, ledger);
    if (role == Role.USER) {
      ledger.post(LedgerEntry.Type.GRANT, FREE_CREDITS, "welcome-grant", clock.instant());
    }
    return account;
  }

  public Account authenticate(String handle, String password) {
    if (handle == null || password == null) {
      throw Problems.invalidCredentials();
    }
    Account account = plane.accountByHandle(handle).orElseThrow(Problems::invalidCredentials);
    byte[] expected = account.passwordHash().getBytes(StandardCharsets.UTF_8);
    byte[] actual = hash(password, account.passwordSalt()).getBytes(StandardCharsets.UTF_8);
    if (!MessageDigest.isEqual(expected, actual)) {
      throw Problems.invalidCredentials();
    }
    return account;
  }

  public Account updateDisplayName(Account account, String displayName) {
    List<FieldError> errors = new ArrayList<>();
    validateDisplayName(displayName, errors);
    if (!errors.isEmpty()) {
      throw Problems.validation(errors);
    }
    Account updated = account.withDisplayName(displayName);
    plane.register(updated);
    return updated;
  }

  /** Deletes the account, every conversation it takes part in, its ledger and its tokens. */
  public void delete(Account account, ConversationService conversations) {
    conversations.deleteAllFor(account);
    tokens.revokeAll(account.id());
    plane.unregister(account);
  }

  private static void validateDisplayName(String displayName, List<FieldError> errors) {
    if (displayName == null || displayName.isBlank() || displayName.length() > 60) {
      errors.add(new FieldError("displayName", "1-60 characters, not blank"));
    }
  }

  private String newSalt() {
    byte[] salt = new byte[16];
    random.nextBytes(salt);
    return Base64.getEncoder().encodeToString(salt);
  }

  private static String hash(String password, String salt) {
    try {
      PBEKeySpec spec =
          new PBEKeySpec(
              password.toCharArray(), Base64.getDecoder().decode(salt), PBKDF2_ITERATIONS, 256);
      byte[] derived =
          SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec).getEncoded();
      return Base64.getEncoder().encodeToString(derived);
    } catch (GeneralSecurityException e) {
      throw new IllegalStateException("PBKDF2 unavailable", e);
    }
  }
}
