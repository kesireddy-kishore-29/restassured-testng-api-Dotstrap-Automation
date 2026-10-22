package com.qaautomation.framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * Loads {@code config/<env>.properties} from the classpath and overlays environment variables and
 * system properties (system property wins, then environment variable, then file). Every value is
 * validated, and all problems are reported together so a broken CI configuration costs one run.
 */
public final class ConfigLoader {

  private static final Pattern RUN_ID = Pattern.compile("[A-Za-z0-9._-]{1,80}");
  private static final DateTimeFormatter RUN_ID_TIME =
      DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss", Locale.ROOT);
  private static final URI INVALID = URI.create("http://invalid");

  private final String environment;
  private final Properties file;
  private final Map<String, String> env;
  private final Properties system;
  private final List<String> problems = new ArrayList<>();

  private ConfigLoader(
      String environment, Properties file, Map<String, String> env, Properties system) {
    this.environment = environment;
    this.file = file;
    this.env = env;
    this.system = system;
  }

  /** Loads configuration for the environment named by {@code test.env} (default {@code local}). */
  public static FrameworkConfig load() {
    Properties system = System.getProperties();
    Map<String, String> env = System.getenv();
    String environment =
        Optional.ofNullable(system.getProperty("test.env"))
            .or(() -> Optional.ofNullable(env.get("TEST_ENV")))
            .orElse("local");
    return load(environment, readProfile(environment), env, system);
  }

  /** Test seam: every input is explicit. */
  public static FrameworkConfig load(
      String environment, Properties file, Map<String, String> env, Properties system) {
    return new ConfigLoader(environment, file, env, system).build();
  }

  static Properties readProfile(String environment) {
    String resource = "config/" + environment + ".properties";
    Properties properties = new Properties();
    try (InputStream in = ConfigLoader.class.getClassLoader().getResourceAsStream(resource)) {
      if (in == null) {
        throw new ConfigException(
            environment, List.of("no profile '" + resource + "' on the classpath"));
      }
      properties.load(in);
    } catch (IOException e) {
      throw new ConfigException(environment, List.of("cannot read " + resource + ": " + e));
    }
    return properties;
  }

  /** Maps a property key to its environment variable: {@code sut.baseUrl -> SUT_BASE_URL}. */
  public static String envName(String key) {
    return key.replaceAll("([a-z])([A-Z])", "$1_$2").replace('.', '_').toUpperCase(Locale.ROOT);
  }

  private FrameworkConfig build() {
    URI sut = url("sut.baseUrl");
    URI booker = url("booker.baseUrl");
    String bookerUser = required("booker.username");
    String bookerPassword = required("booker.password");
    String adminHandle = required("sut.adminHandle");
    String adminPassword = required("sut.adminPassword");
    Duration connect = millis("http.connectTimeoutMs", 100, 60_000);
    Duration read = millis("http.readTimeoutMs", 100, 120_000);
    int retries = integer("http.maxRetries", 0, 3);
    String origin = origin("cors.allowedOrigin");
    RecordMode recordMode = recordMode();
    Path evidenceRoot = Path.of(value("evidence.root").orElse("run-evidence")).toAbsolutePath();
    String runId = runId();

    if (!problems.isEmpty()) {
      throw new ConfigException(environment, problems);
    }
    return new FrameworkConfig(
        environment,
        sut,
        booker,
        new Credentials(bookerUser, bookerPassword),
        new Credentials(adminHandle, adminPassword),
        connect,
        read,
        retries,
        origin,
        recordMode,
        evidenceRoot,
        runId);
  }

  private Optional<String> value(String key) {
    return Optional.ofNullable(system.getProperty(key))
        .or(() -> Optional.ofNullable(env.get(envName(key))))
        .or(() -> Optional.ofNullable(file.getProperty(key)))
        .map(String::trim)
        .filter(v -> !v.isEmpty());
  }

  private String required(String key) {
    Optional<String> found = value(key);
    if (found.isEmpty()) {
      problems.add(key + " is required (or set " + envName(key) + ")");
      return "";
    }
    return found.get();
  }

  private URI url(String key) {
    String raw = required(key);
    if (raw.isEmpty()) {
      return INVALID;
    }
    try {
      URI uri = new URI(raw);
      String scheme = uri.getScheme();
      if (uri.getHost() == null || !("http".equals(scheme) || "https".equals(scheme))) {
        problems.add(key + " must be an absolute http(s) URL, was '" + raw + "'");
      }
      return uri;
    } catch (URISyntaxException e) {
      problems.add(key + " is not a valid URL: '" + raw + "'");
      return INVALID;
    }
  }

  private String origin(String key) {
    URI uri = url(key);
    String path = uri.getPath();
    if (path != null && !path.isEmpty()) {
      problems.add(key + " must be an origin (scheme://host[:port]) with no path");
    }
    return uri.toString();
  }

  private int integer(String key, int min, int max) {
    String raw = required(key);
    if (raw.isEmpty()) {
      return min;
    }
    try {
      int parsed = Integer.parseInt(raw);
      if (parsed < min || parsed > max) {
        problems.add(key + " must be between " + min + " and " + max + ", was " + parsed);
      }
      return parsed;
    } catch (NumberFormatException e) {
      problems.add(key + " must be an integer, was '" + raw + "'");
      return min;
    }
  }

  private Duration millis(String key, int min, int max) {
    return Duration.ofMillis(integer(key, min, max));
  }

  private RecordMode recordMode() {
    String raw = value("record.mode").orElse("failures");
    try {
      return RecordMode.parse(raw);
    } catch (IllegalArgumentException e) {
      problems.add("record.mode (RECORD_MODE) " + e.getMessage());
      return RecordMode.FAILURES;
    }
  }

  private String runId() {
    String id = value("run.id").orElseGet(() -> "local-" + LocalDateTime.now().format(RUN_ID_TIME));
    if (!RUN_ID.matcher(id).matches()) {
      problems.add("run.id (RUN_ID) may only contain letters, digits, '.', '_' and '-'");
    }
    return id;
  }
}
