package com.qaautomation.tools.healing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.qaautomation.tools.ai.AiProvider;
import com.qaautomation.tools.ai.AiResult;
import com.qaautomation.tools.shared.Json;
import com.qaautomation.tools.triage.Category;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * The model proposes; the guardrails and the verification run decide. The model only ever sees
 * files from the allowed paths and must return whole-file replacements for files it was shown.
 */
public final class AiHealer {

  private static final String SYSTEM =
      "You fix a failing API test framework with the smallest possible change. You may edit only "
          + "the files you are shown (clients, data builders, auth, config, JSON schemas). Never add "
          + "sleeps, never disable or skip tests, never loosen a check, never raise a timeout above 30 s, "
          + "never swallow exceptions. Return each changed file in full. If no safe fix exists, return "
          + "an empty list and say why.";

  private final Optional<AiProvider> provider;
  private final Path repoRoot;

  public AiHealer(Optional<AiProvider> provider, Path repoRoot) {
    this.provider = provider;
    this.repoRoot = repoRoot;
  }

  public String status() {
    return provider.map(AiProvider::name).orElse("skipped (ANTHROPIC_API_KEY not set)");
  }

  public Optional<Patch> propose(
      Category category, String testId, JsonNode triage, List<String> candidateFiles) {
    if (provider.isEmpty() || candidateFiles.isEmpty()) {
      return Optional.empty();
    }
    StringBuilder user =
        new StringBuilder("Triage:\n").append(triage.toPrettyString()).append("\n\nFiles:\n");
    Map<String, String> originals = new java.util.LinkedHashMap<>();
    for (String path : candidateFiles) {
      String content = read(repoRoot.resolve(path));
      originals.put(path, content);
      user.append("\n--- ").append(path).append(" ---\n").append(content);
    }
    AiResult result = provider.get().completeJson(SYSTEM, user.toString(), schema());
    if (result.json().isEmpty()) {
      return Optional.empty();
    }
    JsonNode answer = result.json().get();
    List<FileChange> changes = new ArrayList<>();
    for (JsonNode file : answer.path("files")) {
      String path = file.path("path").asText();
      if (originals.containsKey(path)) {
        changes.add(new FileChange(path, originals.get(path), file.path("content").asText()));
      }
    }
    if (changes.isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(
        new Patch(
            category, testId, provider.get().name(), answer.path("rationale").asText(), changes));
  }

  static JsonNode schema() {
    ObjectNode schema =
        Json.mapper().createObjectNode().put("type", "object").put("additionalProperties", false);
    ObjectNode props = schema.putObject("properties");
    props.putObject("rationale").put("type", "string");
    ObjectNode file = props.putObject("files").put("type", "array").putObject("items");
    file.put("type", "object").put("additionalProperties", false);
    file.putObject("properties").putObject("path").put("type", "string");
    ((ObjectNode) file.get("properties")).putObject("content").put("type", "string");
    file.putArray("required").add("path").add("content");
    schema.putArray("required").add("rationale").add("files");
    return schema;
  }

  private static String read(Path file) {
    try {
      return Files.readString(file, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
