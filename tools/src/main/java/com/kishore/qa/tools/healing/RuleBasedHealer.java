package com.kishore.qa.tools.healing;

import com.kishore.qa.tools.triage.Category;
import com.kishore.qa.tools.triage.SchemaDiff;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Deterministic healing for the one API case that has a mechanical fix: a field rename. When a
 * response lost exactly one required field and gained exactly one new field, propose renaming it in
 * the consumer schema and in the client model's {@code @JsonProperty}. Never touches a test. It is
 * still flagged for a human decision: a rename may be a provider bug, not an agreed change.
 */
public final class RuleBasedHealer {

  public static final String NAME = "rule-based";

  private final Path repoRoot;

  public RuleBasedHealer(Path repoRoot) {
    this.repoRoot = repoRoot;
  }

  public Optional<Patch> propose(Category category, String testId, SchemaDiff diff) {
    // Only the contract the violation names: another schema may use the same field name
    // legitimately
    // (the ledger still has its own balance), so an unnamed schema gets no mechanical fix.
    if (category != Category.CONTRACT_DRIFT
        || diff == null
        || diff.schema() == null
        || !diff.looksLikeRename()) {
      return Optional.empty();
    }
    String from = diff.missing().get(0);
    String to = diff.unexpected().get(0);
    List<FileChange> changes = new ArrayList<>();
    changes.addAll(schemaChanges(diff.schema(), from, to));
    changes.addAll(modelChanges(diff.schema(), from, to));
    if (changes.isEmpty()) {
      return Optional.empty();
    }
    String rationale =
        "The response of "
            + (diff.operation() == null ? "the failing call" : diff.operation())
            + " no longer has the required field `"
            + from
            + "` and now has `"
            + to
            + "` instead. "
            + "This patch renames the field in the `"
            + diff.schema()
            + "` consumer contract and in its client model's wire name only; other contracts "
            + "and the tests are unchanged, and the tests keep asserting the same values.";
    return Optional.of(new Patch(category, testId, NAME, rationale, changes));
  }

  private List<FileChange> schemaChanges(String schema, String from, String to) {
    Pattern key = Pattern.compile("\\\"" + Pattern.quote(from) + "\\\"(\\s*):");
    Pattern required =
        Pattern.compile("(\\\"required\\\"\\s*:\\s*\\[[^\\]]*)\\\"" + Pattern.quote(from) + "\\\"");
    List<FileChange> changes = new ArrayList<>();
    for (Path file : files("framework/src/main/resources/schemas", ".schema.json")) {
      if (!file.getFileName().toString().equals(schema + ".schema.json")) {
        continue;
      }
      String before = read(file);
      if (!key.matcher(before).find()) {
        continue;
      }
      String after =
          key.matcher(before).replaceAll(Matcher.quoteReplacement("\"" + to + "\"") + "$1:");
      after = required.matcher(after).replaceAll("$1" + Matcher.quoteReplacement("\"" + to + "\""));
      changes.add(new FileChange(relative(file), before, after));
    }
    return changes;
  }

  private List<FileChange> modelChanges(String schema, String from, String to) {
    String annotation = "@JsonProperty(\"" + from + "\")";
    String modelFile = modelName(schema) + ".java";
    List<FileChange> changes = new ArrayList<>();
    for (Path file : files("framework/src/main/java", ".java")) {
      if (!file.toString().replace('\\', '/').contains("/clients/model/")
          || !file.getFileName().toString().equals(modelFile)) {
        continue;
      }
      String before = read(file);
      if (before.contains(annotation)) {
        changes.add(
            new FileChange(
                relative(file),
                before,
                before.replace(annotation, "@JsonProperty(\"" + to + "\")")));
      }
    }
    return changes;
  }

  private List<Path> files(String dir, String suffix) {
    Path base = repoRoot.resolve(dir);
    if (!Files.isDirectory(base)) {
      return List.of();
    }
    try (Stream<Path> all = Files.walk(base)) {
      return all.filter(p -> p.toString().endsWith(suffix)).sorted().toList();
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  private String relative(Path file) {
    return repoRoot.relativize(file).toString().replace('\\', '/');
  }

  private static String read(Path file) {
    try {
      return Files.readString(file, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  /**
   * The client model for a schema: {@code balance} -> {@code Balance}, {@code ledger-entry} ->
   * {@code LedgerEntry}.
   */
  static String modelName(String schema) {
    StringBuilder name = new StringBuilder();
    for (String part : schema.split("[-_]")) {
      if (!part.isEmpty()) {
        name.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));
      }
    }
    return name.toString();
  }
}
