package com.kishore.qa.framework.listeners;

import static org.awaitility.Awaitility.await;

import com.kishore.qa.framework.config.Config;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import org.awaitility.core.ConditionTimeoutException;
import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Waits (up to 30 s, polling) for the reference service before a suite that needs it, and stops the
 * run with instructions when it never comes up. A suite that only targets public APIs sets {@code
 * <parameter name="requires.sut" value="false"/>}.
 */
public final class SutAvailabilityListener implements ISuiteListener {

  private static final Duration WAIT = Duration.ofSeconds(30);

  @Override
  public void onStart(ISuite suite) {
    if ("false".equals(suite.getParameter("requires.sut"))) {
      return;
    }
    URI health = Config.get().sutBaseUrl().resolve("/health");
    HttpClient http = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(2)).build();
    try {
      await("reference service at " + health)
          .atMost(WAIT)
          .pollInterval(Duration.ofMillis(500))
          .ignoreExceptions()
          .until(() -> isUp(http, health));
    } catch (ConditionTimeoutException e) {
      throw new IllegalStateException(
          "The reference service is not reachable at "
              + health
              + " after "
              + WAIT.toSeconds()
              + " s. Start it with: java -jar sut/target/reference-service.jar"
              + " (build it with ./mvnw -pl sut -am package -DskipTests)",
          e);
    }
  }

  private static boolean isUp(HttpClient http, URI health)
      throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder(health).timeout(Duration.ofSeconds(2)).build();
    return http.send(request, HttpResponse.BodyHandlers.discarding()).statusCode() == 200;
  }
}
