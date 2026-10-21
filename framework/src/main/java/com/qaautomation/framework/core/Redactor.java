package com.qaautomation.framework.core;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Masks secrets before anything is written to a transcript, report or attachment: credential
 * headers, token- and password-like JSON fields, and token query parameters. Every evidence writer
 * goes through this class; it has its own unit tests.
 */
public final class Redactor {

  public static final String MASK = "****";

  private static final Set<String> SECRET_HEADERS =
      Set.of("authorization", "proxy-authorization", "cookie", "set-cookie", "x-api-key");
  private static final Set<String> SECRET_FIELDS =
      Set.of(
          "password",
          "token",
          "accesstoken",
          "refreshtoken",
          "idtoken",
          "secret",
          "clientsecret",
          "apikey",
          "authorization");
  private static final Pattern SECRET_QUERY =
      Pattern.compile("(?i)([?&](?:token|access_token|api_key|apikey|password)=)[^&#]*");
  private static final Pattern SECRET_JSON_TEXT =
      Pattern.compile(
          "(?i)(\"(?:password|token|accessToken|refreshToken|secret|apiKey)\"\\s*:\\s*\")[^\"]*(\")");

  private Redactor() {}

  public static Map<String, String> headers(Map<String, String> headers) {
    Map<String, String> safe = new LinkedHashMap<>();
    headers.forEach((name, value) -> safe.put(name, header(name, value)));
    return safe;
  }

  public static String header(String name, String value) {
    if (!SECRET_HEADERS.contains(name.toLowerCase(Locale.ROOT))) {
      return value;
    }
    int space = value.indexOf(' ');
    if (space > 0 && "authorization".equalsIgnoreCase(name)) {
      return value.substring(0, space) + " " + MASK;
    }
    return MASK;
  }

  public static String url(String url) {
    return url == null ? null : SECRET_QUERY.matcher(url).replaceAll("$1" + MASK);
  }

  /** Masks secret fields in a JSON body; falls back to a text pattern when it is not JSON. */
  public static String body(String body) {
    if (body == null || body.isEmpty()) {
      return body;
    }
    return Json.tryParse(body)
        .map(
            node -> {
              mask(node);
              return node.toString();
            })
        .orElseGet(() -> SECRET_JSON_TEXT.matcher(body).replaceAll("$1" + MASK + "$2"));
  }

  private static void mask(JsonNode node) {
    if (node instanceof ObjectNode object) {
      List<String> names = new ArrayList<>();
      object.fieldNames().forEachRemaining(names::add);
      for (String name : names) {
        JsonNode child = object.get(name);
        if (SECRET_FIELDS.contains(name.toLowerCase(Locale.ROOT)) && child.isValueNode()) {
          object.put(name, MASK);
        } else {
          mask(child);
        }
      }
    } else if (node instanceof ArrayNode array) {
      array.forEach(Redactor::mask);
    }
  }
}
