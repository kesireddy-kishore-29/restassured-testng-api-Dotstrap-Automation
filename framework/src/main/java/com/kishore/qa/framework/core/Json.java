package com.kishore.qa.framework.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.util.Optional;

/** The framework's one Jackson configuration: request bodies, typed responses, evidence files. */
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

  /** Indented JSON, for evidence and report files a person will open. */
  public static String pretty(Object value) {
    try {
      return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(value);
    } catch (JsonProcessingException e) {
      throw new IllegalStateException("Cannot serialise " + value.getClass().getSimpleName(), e);
    }
  }

  /** Parses text as JSON; empty when it is not JSON. */
  public static Optional<JsonNode> tryParse(String text) {
    if (text == null || text.isBlank()) {
      return Optional.empty();
    }
    try {
      return Optional.of(MAPPER.readTree(text));
    } catch (JsonProcessingException e) {
      return Optional.empty();
    }
  }
}
