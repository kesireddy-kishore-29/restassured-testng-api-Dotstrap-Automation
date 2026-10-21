package com.qaautomation.tools.triage;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Turns contract-violation messages (JSON Schema or OpenAPI) into a structured diff: the fields the
 * contract requires but the response lacks, the fields the response carries that the contract does
 * not allow, and the operation that answered.
 */
public record SchemaDiff(
    String schema,
    String operation,
    List<String> missing,
    List<String> unexpected,
    List<String> raw) {

  private static final Pattern SCHEMA_NAME = Pattern.compile("JSON Schema '([^']+)'");
  private static final Pattern OPERATION =
      Pattern.compile(
          "(?:violation on|violated by) (GET|POST|PUT|PATCH|DELETE) (\\S+?)(?::| ->|$)");
  private static final Pattern REQUIRED_ONE =
      Pattern.compile("required property '([^']+)' not found");
  private static final Pattern REQUIRED_MANY =
      Pattern.compile("missing required properties \\(\\[([^\\]]+)\\]\\)");
  private static final Pattern NOT_ALLOWED_ONE =
      Pattern.compile("property '([^']+)' is not defined in the schema");
  private static final Pattern NOT_ALLOWED_MANY =
      Pattern.compile("not allowed by the schema: \\[([^\\]]+)\\]");

  public static SchemaDiff parse(String message) {
    String schema = first(SCHEMA_NAME.matcher(message), 1);
    Matcher op = OPERATION.matcher(message);
    String operation = op.find() ? op.group(1) + " " + op.group(2) : null;
    List<String> missing = new ArrayList<>();
    List<String> unexpected = new ArrayList<>();
    List<String> raw = new ArrayList<>();
    for (String line : message.lines().map(String::strip).toList()) {
      if (line.startsWith("- ")) {
        raw.add(line.substring(2));
      }
    }
    addAll(REQUIRED_ONE.matcher(message), missing, false);
    addAll(REQUIRED_MANY.matcher(message), missing, true);
    addAll(NOT_ALLOWED_ONE.matcher(message), unexpected, false);
    addAll(NOT_ALLOWED_MANY.matcher(message), unexpected, true);
    return new SchemaDiff(schema, operation, missing, unexpected, raw);
  }

  /**
   * Adds the fields the recorded response carries but the consumer schema does not declare. A
   * tolerant consumer schema accepts extra fields, so the validator never names them; the response
   * in the transcript does. Without this, a rename shows only its missing half.
   */
  public SchemaDiff withUndeclared(JsonNode responseBody, Set<String> declared) {
    if (responseBody == null || !responseBody.isObject() || declared.isEmpty()) {
      return this;
    }
    List<String> all = new ArrayList<>(unexpected);
    for (Map.Entry<String, JsonNode> field : responseBody.properties()) {
      if (!declared.contains(field.getKey()) && !all.contains(field.getKey())) {
        all.add(field.getKey());
      }
    }
    return new SchemaDiff(schema, operation, missing, all, raw);
  }

  /** One field gone and one new field appeared: most likely a rename. */
  public boolean looksLikeRename() {
    return missing.size() == 1 && unexpected.size() == 1;
  }

  private static String first(Matcher matcher, int group) {
    return matcher.find() ? matcher.group(group) : null;
  }

  private static void addAll(Matcher matcher, List<String> into, boolean list) {
    while (matcher.find()) {
      List<String> names =
          list
              ? List.of(matcher.group(1).split(",")).stream()
                  .map(n -> n.strip().replace("\"", ""))
                  .toList()
              : List.of(matcher.group(1));
      for (String name : names) {
        if (!name.isEmpty() && !into.contains(name)) {
          into.add(name);
        }
      }
    }
  }
}
