package com.qaautomation.tools.reporting;

import com.qaautomation.tools.shared.Json;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * The dashboard and gallery are one HTML template each, shared word for word with the UI flagship;
 * the data is injected as JSON in place of {@code /*__DATA__*\/null}.
 */
public final class Templates {

  private static final String PLACEHOLDER = "/*__DATA__*/null";

  private Templates() {}

  public static String render(String name, Object data) {
    String template = load(name);
    if (!template.contains(PLACEHOLDER)) {
      throw new IllegalStateException("Template " + name + " has no data placeholder");
    }
    return template.replace(PLACEHOLDER, safeJson(data));
  }

  /** JSON that cannot close the surrounding script element. */
  static String safeJson(Object data) {
    return Json.toJson(data).replace("</", "<\\/").replace("<!--", "<\\!--");
  }

  private static String load(String name) {
    try (InputStream in = Templates.class.getResourceAsStream("/templates/" + name)) {
      return new String(Objects.requireNonNull(in, name).readAllBytes(), StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
