package com.kishore.qa.tools.shared;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/** Jackson configuration for the tools: reading run documents, writing reports. */
public final class Json {

  private static final ObjectMapper MAPPER =
      new ObjectMapper()
          .registerModule(new JavaTimeModule())
          .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
          .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
          .setDefaultPropertyInclusion(
              JsonInclude.Value.construct(
                  JsonInclude.Include.NON_NULL, JsonInclude.Include.NON_NULL));

  private Json() {}

  public static ObjectMapper mapper() {
    return MAPPER;
  }

  public static JsonNode read(Path file) {
    try {
      return MAPPER.readTree(file.toFile());
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot read " + file, e);
    }
  }

  public static <T> T read(Path file, Class<T> type) {
    try {
      return MAPPER.readValue(file.toFile(), type);
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot read " + file, e);
    }
  }

  public static void write(Path file, Object value) {
    try {
      Files.createDirectories(file.toAbsolutePath().getParent());
      Files.writeString(
          file,
          MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(value) + "\n",
          StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot write " + file, e);
    }
  }

  public static String toJson(Object value) {
    try {
      return MAPPER.writeValueAsString(value);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
