package com.kishore.qa.tools;

import com.kishore.qa.tools.healing.HealCommand;
import com.kishore.qa.tools.quarantine.FlakyHistoryCommand;
import com.kishore.qa.tools.quarantine.QuarantineCheckCommand;
import com.kishore.qa.tools.reporting.MergeCommand;
import com.kishore.qa.tools.reporting.ReportCommand;
import com.kishore.qa.tools.triage.TriageCommand;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Single entry point for the CI tooling: {@code java -jar tools/target/qa-tools.jar <command>}.
 * Each command is a small class; this class only dispatches.
 */
public final class Cli {

  private final Map<String, Command> commands = new LinkedHashMap<>();

  public Cli(List<Command> available) {
    available.forEach(c -> commands.put(c.name(), c));
  }

  public static List<Command> allCommands() {
    return List.of(
        new TriageCommand(),
        new HealCommand(),
        new ReportCommand(),
        new QuarantineCheckCommand(),
        new FlakyHistoryCommand(),
        new MergeCommand());
  }

  public static void main(String[] args) {
    int code = new Cli(allCommands()).run(args, System.out);
    System.exit(code);
  }

  /** Runs one command and returns its exit code. */
  public int run(String[] args, PrintStream out) {
    if (args.length == 0 || "--help".equals(args[0]) || "help".equals(args[0])) {
      printHelp(out);
      return 0;
    }
    Command command = commands.get(args[0]);
    if (command == null) {
      out.println("Unknown command '" + args[0] + "'.");
      printHelp(out);
      return 2;
    }
    return command.run(Arrays.copyOfRange(args, 1, args.length), out);
  }

  private void printHelp(PrintStream out) {
    out.println("usage: qa-tools <command> [options]");
    out.println();
    out.println("commands:");
    commands.values().forEach(c -> out.printf("  %-18s %s%n", c.name(), c.summary()));
  }
}
