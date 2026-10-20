package com.kishore.qa.sut;

import com.kishore.qa.sut.web.ReferenceService;
import java.time.Clock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Starts the reference service. Configuration is environment variables only (see {@link
 * SutSettings}); {@code java -jar sut/target/reference-service.jar} is the whole start command.
 */
public final class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  private Main() {}

  public static void main(String[] args) {
    SutSettings settings = SutSettings.fromEnvironment(System.getenv());
    new ReferenceService(settings, Clock.systemUTC()).create().start(settings.port());
    LOG.info(
        "Reference service {} listening on :{} (default region {}, faults {}, chaos {})",
        settings.version(),
        settings.port(),
        settings.defaultRegion().code(),
        settings.faultsEnabled() ? "enabled" : "disabled",
        settings.chaos());
  }
}
