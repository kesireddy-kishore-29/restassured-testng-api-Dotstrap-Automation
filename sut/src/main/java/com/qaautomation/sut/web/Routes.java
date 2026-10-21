package com.qaautomation.sut.web;

import io.javalin.Javalin;
import io.javalin.http.Handler;
import io.javalin.http.HandlerType;
import java.util.LinkedHashSet;
import java.util.Set;

/** Registers routes and remembers their paths, so CORS preflight covers exactly those paths. */
final class Routes {

  private final Javalin app;
  private final Set<String> paths = new LinkedHashSet<>();

  Routes(Javalin app) {
    this.app = app;
  }

  void add(HandlerType method, String path, Handler handler) {
    app.addHttpHandler(method, path, handler);
    paths.add(path);
  }

  void addPreflight(Handler preflight) {
    paths.forEach(path -> app.options(path, preflight));
  }
}
