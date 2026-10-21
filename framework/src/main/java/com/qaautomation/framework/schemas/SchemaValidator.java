package com.qaautomation.framework.schemas;

import com.networknt.schema.Error;
import com.networknt.schema.InputFormat;
import com.networknt.schema.Schema;
import com.networknt.schema.SchemaLocation;
import com.networknt.schema.SchemaRegistry;
import com.networknt.schema.SpecificationVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Validates JSON against the schemas in {@code src/main/resources/schemas/<name>.schema.json}. The
 * schema files are the single source of truth for what a consumer expects a response to look like;
 * each violation is reported with its JSON path, which triage uses as the schema diff.
 */
public final class SchemaValidator {

  /** Schema {@code $id}s live under this prefix; {@code $ref}s resolve from the classpath. */
  public static final String ID_PREFIX = "https://contracts.example/";

  private static final SchemaRegistry REGISTRY =
      SchemaRegistry.withDefaultDialect(
          SpecificationVersion.DRAFT_2020_12,
          builder ->
              builder.schemaIdResolvers(
                  resolvers -> resolvers.mapPrefix(ID_PREFIX, "classpath:schemas/")));
  private static final Map<String, Schema> CACHE = new ConcurrentHashMap<>();

  private SchemaValidator() {}

  /** Violations as {@code "<json path>: <message>"}; empty when the document matches. */
  public static List<String> validate(String schemaName, String json) {
    Schema schema = CACHE.computeIfAbsent(schemaName, SchemaValidator::load);
    List<Error> errors = schema.validate(json, InputFormat.JSON);
    return errors.stream().map(SchemaValidator::describe).toList();
  }

  /** "$.items[0].id: message", with the document root shown as "$". */
  private static String describe(Error error) {
    String location = String.valueOf(error.getInstanceLocation());
    return (location.isEmpty() ? "$" : location) + ": " + error.getMessage();
  }

  private static Schema load(String schemaName) {
    String resource = "/schemas/" + schemaName + ".schema.json";
    try (InputStream in = SchemaValidator.class.getResourceAsStream(resource)) {
      if (in == null) {
        throw new IllegalArgumentException("No schema " + resource + " on the classpath");
      }
      return REGISTRY.getSchema(
          SchemaLocation.of(ID_PREFIX + schemaName + ".schema.json"), in, InputFormat.JSON);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
