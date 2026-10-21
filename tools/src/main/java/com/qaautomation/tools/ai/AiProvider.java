package com.qaautomation.tools.ai;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * A language model behind an interface, so the provider can be swapped and the tools work (rules
 * only) when no provider is configured. Output is always constrained to a JSON schema.
 */
public interface AiProvider {

  String name();

  AiResult completeJson(String system, String user, JsonNode schema);
}
