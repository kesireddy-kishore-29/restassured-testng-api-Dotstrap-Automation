package com.qaautomation.tools.quarantine;

import com.qaautomation.tools.Command;
import com.qaautomation.tools.shared.Args;
import java.io.PrintStream;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * {@code qa-tools quarantine-check}: fails (exit 1) when a quarantine entry has expired, lacks an
 * owner or reason, or does not match a test in the quarantine group, and when a quarantined test
 * has no entry. Quarantine is a time-boxed exemption with a name on it, never a parking lot.
 */
public final class QuarantineCheckCommand implements Command {

  @Override
  public String name() {
    return "quarantine-check";
  }

  @Override
  public String summary() {
    return "fail on expired, ownerless or unmatched quarantine entries";
  }

  @Override
  public int run(String[] argv, PrintStream out) {
    Args args = Args.parse(argv);
    QuarantineFile file = QuarantineFile.read(Path.of(args.get("file", "quarantine.json")));
    List<String> tagged = QuarantinedTests.in(Path.of(args.get("sources", "tests/src/test/java")));
    LocalDate today = args.get("today").map(LocalDate::parse).orElse(LocalDate.now());
    List<String> problems = check(file.entriesOrEmpty(), tagged, today);
    out.println(
        "Quarantine: "
            + file.entriesOrEmpty().size()
            + " entr(y/ies), "
            + tagged.size()
            + " tagged test(s)");
    problems.forEach(p -> out.println("  - " + p));
    out.println(problems.isEmpty() ? "OK" : "FAILED");
    return problems.isEmpty() ? 0 : 1;
  }

  public static List<String> check(
      List<QuarantineEntry> entries, List<String> tagged, LocalDate today) {
    List<String> problems = new ArrayList<>();
    for (QuarantineEntry entry : entries) {
      String id = entry.testId();
      if (entry.owner() == null || entry.owner().isBlank()) {
        problems.add(id + ": no owner");
      }
      if (entry.reason() == null || entry.reason().isBlank()) {
        problems.add(id + ": no reason");
      }
      try {
        LocalDate expires = LocalDate.parse(entry.expires());
        if (expires.isBefore(today)) {
          problems.add(id + ": expired on " + expires + " (fix the test or renew with a reason)");
        }
      } catch (DateTimeParseException | NullPointerException e) {
        problems.add(id + ": expires must be YYYY-MM-DD, was '" + entry.expires() + "'");
      }
      if (!tagged.contains(id)) {
        problems.add(
            id + ": listed in quarantine.json but the test is not in the quarantine group");
      }
    }
    for (String id : tagged) {
      if (entries.stream().noneMatch(e -> id.equals(e.testId()))) {
        problems.add(id + ": in the quarantine group but has no quarantine.json entry");
      }
    }
    return problems;
  }
}
