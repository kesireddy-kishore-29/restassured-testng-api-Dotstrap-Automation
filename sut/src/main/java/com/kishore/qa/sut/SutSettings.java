package com.kishore.qa.sut;

import com.kishore.qa.sut.domain.Region;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Service settings, read from environment variables with safe defaults. {@code SUT_CHAOS} exists
 * only for the self-healing demo: it changes the service's behaviour on purpose.
 */
public record SutSettings(
    int port,
    Region defaultRegion,
    int rateLimitPerWindow,
    int anonymousRateLimitPerWindow,
    Duration rateLimitWindow,
    Duration defaultTokenTtl,
    boolean faultsEnabled,
    Chaos chaos,
    List<String> allowedOrigins,
    String adminPassword,
    String version) {

  /** Deliberate defects for the chaos demo. NONE in every normal run. */
  public enum Chaos {
    NONE,
    /**
     * {@code GET /v1/credits/balance} returns {@code availableBalance} instead of {@code balance},
     * and the served OpenAPI document says so: an agreed provider change that consumers have not
     * caught up with yet.
     */
    RENAME_BALANCE_FIELD,
    /** Every ledger read is delayed by 3 seconds. */
    SLOW_LEDGER;

    static Chaos parse(String raw) {
      return Chaos.valueOf(raw.trim().toUpperCase(Locale.ROOT).replace('-', '_'));
    }
  }

  public static SutSettings fromEnvironment(Map<String, String> env) {
    return new SutSettings(
        Integer.parseInt(env.getOrDefault("SUT_PORT", "7070")),
        Region.fromCode(env.getOrDefault("SUT_REGION", "eu")).orElse(Region.EU),
        Integer.parseInt(env.getOrDefault("SUT_RATE_LIMIT", "60")),
        Integer.parseInt(env.getOrDefault("SUT_ANON_RATE_LIMIT", "600")),
        Duration.ofSeconds(Long.parseLong(env.getOrDefault("SUT_RATE_WINDOW_SECONDS", "10"))),
        Duration.ofSeconds(Long.parseLong(env.getOrDefault("SUT_TOKEN_TTL_SECONDS", "900"))),
        Boolean.parseBoolean(env.getOrDefault("SUT_FAULTS_ENABLED", "true")),
        Chaos.parse(env.getOrDefault("SUT_CHAOS", "none")),
        Arrays.stream(
                env.getOrDefault("SUT_ALLOWED_ORIGINS", "https://app.example.test").split(","))
            .map(String::trim)
            .filter(s -> !s.isEmpty())
            .toList(),
        env.getOrDefault("SUT_ADMIN_PASSWORD", "admin-demo-password"),
        "1.0.0");
  }
}
