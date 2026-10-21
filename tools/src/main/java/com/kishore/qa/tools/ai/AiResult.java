package com.kishore.qa.tools.ai;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Optional;

/** What the model returned (structured JSON), or why there is nothing to use. */
public record AiResult(Optional<JsonNode> json, String status) {

  public static AiResult ok(JsonNode json) {
    return new AiResult(Optional.of(json), "ok");
  }

  public static AiResult unavailable(String why) {
    return new AiResult(Optional.empty(), why);
  }
}
