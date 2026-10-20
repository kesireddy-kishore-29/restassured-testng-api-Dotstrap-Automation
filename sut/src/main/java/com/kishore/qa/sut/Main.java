package com.kishore.qa.sut;

import io.javalin.Javalin;
import java.util.Map;

/** Entry point of the reference service. Port comes from {@code SUT_PORT} (default 7070). */
public final class Main {

  private Main() {}

  public static void main(String[] args) {
    int port = Integer.parseInt(System.getenv().getOrDefault("SUT_PORT", "7070"));
    Javalin app = Javalin.create(config -> config.showJavalinBanner = false);
    app.get("/health", ctx -> ctx.json(Map.of("status", "UP", "version", "1.0.0")));
    app.start(port);
  }
}
