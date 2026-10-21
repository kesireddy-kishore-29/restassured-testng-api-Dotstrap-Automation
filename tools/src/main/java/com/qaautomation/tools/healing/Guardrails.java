package com.qaautomation.tools.healing;

import com.github.difflib.DiffUtils;
import com.github.difflib.patch.AbstractDelta;
import com.qaautomation.tools.triage.Category;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * What a healing patch may and may not do, enforced in code. A patch that touches a forbidden path,
 * adds a forbidden construct or loosens a check is refused before any branch is created; the unit
 * tests prove each rule refuses what it should.
 */
public final class Guardrails {

  /** No healed timeout may exceed this; a bigger timeout hides slowness instead of fixing it. */
  public static final long TIMEOUT_CEILING_MS = 30_000;

  /** Paths a heal may never change: assertions, expectations, build, CI, the product, decisions. */
  private static final List<Pattern> FORBIDDEN_PATHS =
      List.of(
          Pattern.compile("^tests/"),
          Pattern.compile("/assertions/"),
          Pattern.compile("(^|/)pom\\.xml$"),
          Pattern.compile("(^|/)suites/.*\\.xml$"),
          Pattern.compile("^\\.github/"),
          Pattern.compile("^sut/"),
          Pattern.compile("^postman/"),
          Pattern.compile("^docs/adr/"),
          Pattern.compile("^tools/"),
          Pattern.compile("^config/checkstyle/"),
          Pattern.compile("(^|/)\\.mvn/"));

  private static final Pattern ALLOWED_CODE =
      Pattern.compile(
          "^framework/src/main/java/.+/(clients|data|auth|config)/[^/]+(/[^/]+)*\\.java$");
  private static final Pattern ALLOWED_CONFIG =
      Pattern.compile("^framework/src/main/resources/config/[^/]+\\.properties$");
  private static final Pattern SCHEMA_FILE =
      Pattern.compile("^framework/src/main/resources/schemas/[^/]+\\.schema\\.json$");

  private record Forbidden(String rule, Pattern pattern) {}

  private static final List<Forbidden> FORBIDDEN_ADDITIONS =
      List.of(
          new Forbidden(
              "hard-wait", Pattern.compile("Thread\\.sleep\\s*\\(|TimeUnit\\.\\w+\\.sleep\\s*\\(")),
          new Forbidden(
              "disabled-test", Pattern.compile("enabled\\s*=\\s*false|@Ignore\\b|@Disabled\\b")),
          new Forbidden(
              "suppressed-check",
              Pattern.compile("CHECKSTYLE:OFF|@SuppressWarnings\\(\\\"all\\\"\\)|NOPMD")),
          new Forbidden(
              "loosened-schema", Pattern.compile("\\\"additionalProperties\\\"\\s*:\\s*true")));

  private static final Pattern EMPTY_CATCH = Pattern.compile("catch\\s*\\([^)]*\\)\\s*\\{\\s*\\}");
  private static final Pattern DURATION =
      Pattern.compile("Duration\\.of(Millis|Seconds|Minutes)\\(\\s*([0-9_]+)L?\\s*\\)");
  private static final Pattern TIMEOUT_PROPERTY = Pattern.compile("TimeoutMs\\s*=\\s*([0-9]+)");
  private static final Pattern CHECK_CALL =
      Pattern.compile(
          "assertThat|assertThatResponse|Contracts\\.read|matchesContract|hasStatus|isProblem|isEqualTo|expect\\(");
  private static final Pattern REQUIRED_ARRAY =
      Pattern.compile("\\\"required\\\"\\s*:\\s*\\[([^\\]]*)\\]");

  public List<GuardrailViolation> check(Patch patch) {
    List<GuardrailViolation> violations = new ArrayList<>();
    if (!patch.category().healable()) {
      violations.add(
          new GuardrailViolation(
              "not-healable", "-", patch.category() + " is never healed automatically"));
      return violations;
    }
    if (patch.changes().isEmpty()) {
      violations.add(new GuardrailViolation("empty-patch", "-", "the patch changes nothing"));
    }
    for (FileChange change : patch.changes()) {
      checkPath(patch.category(), change.path(), violations);
      List<String> added = new ArrayList<>();
      List<String> removed = new ArrayList<>();
      diff(change, added, removed);
      for (String line : added) {
        for (Forbidden f : FORBIDDEN_ADDITIONS) {
          if (f.pattern().matcher(line).find()) {
            violations.add(new GuardrailViolation(f.rule(), change.path(), line.strip()));
          }
        }
        checkTimeouts(change.path(), line, violations);
      }
      if (count(EMPTY_CATCH, change.after()) > count(EMPTY_CATCH, change.before())) {
        violations.add(
            new GuardrailViolation(
                "swallowed-exception", change.path(), "adds an empty catch block"));
      }
      for (String line : removed) {
        if (CHECK_CALL.matcher(line).find()) {
          violations.add(new GuardrailViolation("removed-check", change.path(), line.strip()));
        }
      }
      if (SCHEMA_FILE.matcher(change.path()).matches()
          && requiredCount(change.after()) < requiredCount(change.before())) {
        violations.add(
            new GuardrailViolation(
                "loosened-schema", change.path(), "the schema requires fewer fields than before"));
      }
    }
    return violations;
  }

  private static void checkPath(
      Category category, String path, List<GuardrailViolation> violations) {
    for (Pattern forbidden : FORBIDDEN_PATHS) {
      if (forbidden.matcher(path).find()) {
        violations.add(
            new GuardrailViolation(
                "forbidden-path", path, "heals may never change " + forbidden.pattern()));
        return;
      }
    }
    boolean schemaChange = SCHEMA_FILE.matcher(path).matches();
    if (schemaChange && category != Category.CONTRACT_DRIFT) {
      violations.add(
          new GuardrailViolation("forbidden-path", path, "schemas change only for CONTRACT_DRIFT"));
      return;
    }
    if (!schemaChange
        && !ALLOWED_CODE.matcher(path).matches()
        && !ALLOWED_CONFIG.matcher(path).matches()) {
      violations.add(
          new GuardrailViolation(
              "path-not-allowed", path, "outside clients/, data/, auth/, config/"));
    }
  }

  private static void checkTimeouts(String path, String line, List<GuardrailViolation> violations) {
    Matcher duration = DURATION.matcher(line);
    while (duration.find()) {
      long amount = Long.parseLong(duration.group(2).replace("_", ""));
      long millis =
          switch (duration.group(1)) {
            case "Millis" -> amount;
            case "Seconds" -> amount * 1_000;
            default -> amount * 60_000;
          };
      if (millis > TIMEOUT_CEILING_MS) {
        violations.add(new GuardrailViolation("timeout-above-ceiling", path, line.strip()));
      }
    }
    Matcher property = TIMEOUT_PROPERTY.matcher(line);
    if (property.find() && Long.parseLong(property.group(1)) > TIMEOUT_CEILING_MS) {
      violations.add(new GuardrailViolation("timeout-above-ceiling", path, line.strip()));
    }
  }

  static void diff(FileChange change, List<String> added, List<String> removed) {
    List<String> before = change.before() == null ? List.of() : change.before().lines().toList();
    List<String> after = change.after() == null ? List.of() : change.after().lines().toList();
    for (AbstractDelta<String> delta : DiffUtils.diff(before, after).getDeltas()) {
      removed.addAll(delta.getSource().getLines());
      added.addAll(delta.getTarget().getLines());
    }
  }

  private static int count(Pattern pattern, String text) {
    if (text == null) {
      return 0;
    }
    int n = 0;
    Matcher m = pattern.matcher(text);
    while (m.find()) {
      n++;
    }
    return n;
  }

  private static int requiredCount(String schema) {
    if (schema == null) {
      return 0;
    }
    int total = 0;
    Matcher m = REQUIRED_ARRAY.matcher(schema);
    while (m.find()) {
      total += m.group(1).isBlank() ? 0 : m.group(1).split(",").length;
    }
    return total;
  }
}
