package com.qaautomation.framework.config;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Duration;
import java.util.Map;
import java.util.Properties;
import org.testng.annotations.Test;

public class ConfigLoaderTest {

  private static Properties validFile() {
    Properties p = new Properties();
    p.setProperty("sut.baseUrl", "http://localhost:7070");
    p.setProperty("booker.baseUrl", "https://restful-booker.herokuapp.com");
    p.setProperty("booker.username", "admin");
    p.setProperty("booker.password", "password123");
    p.setProperty("sut.adminHandle", "admin");
    p.setProperty("sut.adminPassword", "admin-demo-password");
    p.setProperty("http.connectTimeoutMs", "5000");
    p.setProperty("http.readTimeoutMs", "15000");
    p.setProperty("http.maxRetries", "2");
    p.setProperty("cors.allowedOrigin", "https://app.example.test");
    return p;
  }

  @Test
  public void loadsAValidProfile() {
    FrameworkConfig config = ConfigLoader.load("local", validFile(), Map.of(), new Properties());

    assertThat(config.sutBaseUrl()).hasToString("http://localhost:7070");
    assertThat(config.readTimeout()).isEqualTo(Duration.ofSeconds(15));
    assertThat(config.recordMode()).isEqualTo(RecordMode.FAILURES);
    assertThat(config.runId()).startsWith("local-");
  }

  @Test
  public void environmentVariableOverridesFileAndSystemPropertyOverridesBoth() {
    Properties system = new Properties();
    system.setProperty("http.maxRetries", "1");
    Map<String, String> env =
        Map.of("SUT_BASE_URL", "http://sut:7070", "HTTP_MAX_RETRIES", "3", "RECORD_MODE", "all");

    FrameworkConfig config = ConfigLoader.load("ci", validFile(), env, system);

    assertThat(config.sutBaseUrl()).hasToString("http://sut:7070");
    assertThat(config.maxRetries()).isEqualTo(1);
    assertThat(config.recordMode()).isEqualTo(RecordMode.ALL);
  }

  @Test
  public void reportsEveryProblemAtOnce() {
    Properties broken = validFile();
    broken.setProperty("sut.baseUrl", "localhost:7070");
    broken.setProperty("http.maxRetries", "9");
    broken.remove("booker.password");
    Map<String, String> env = Map.of("RECORD_MODE", "sometimes");

    assertThatThrownBy(() -> ConfigLoader.load("local", broken, env, new Properties()))
        .isInstanceOf(ConfigException.class)
        .hasMessageContaining("sut.baseUrl must be an absolute http(s) URL")
        .hasMessageContaining("http.maxRetries must be between 0 and 3")
        .hasMessageContaining("booker.password is required (or set BOOKER_PASSWORD)")
        .hasMessageContaining("record.mode (RECORD_MODE)");
  }

  @Test
  public void credentialsNeverPrintThePassword() {
    assertThat(new Credentials("admin", "password123").toString())
        .doesNotContain("password123")
        .contains("****");
  }

  @Test
  public void mapsKeysToEnvironmentVariableNames() {
    assertThat(ConfigLoader.envName("sut.baseUrl")).isEqualTo("SUT_BASE_URL");
    assertThat(ConfigLoader.envName("http.readTimeoutMs")).isEqualTo("HTTP_READ_TIMEOUT_MS");
  }
}
