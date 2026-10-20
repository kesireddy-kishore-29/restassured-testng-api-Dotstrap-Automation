package com.kishore.qa.tools;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.testng.annotations.Test;

public class CliTest {

  private static final class Echo implements Command {
    @Override
    public String name() {
      return "echo";
    }

    @Override
    public String summary() {
      return "prints its arguments";
    }

    @Override
    public int run(String[] args, PrintStream out) {
      out.print(String.join(" ", args));
      return 0;
    }
  }

  private static String capture(Cli cli, String... args) {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    try (PrintStream out = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
      cli.run(args, out);
    }
    return buffer.toString(StandardCharsets.UTF_8);
  }

  @Test
  public void dispatchesToTheNamedCommand() {
    assertThat(capture(new Cli(List.of(new Echo())), "echo", "a", "b")).isEqualTo("a b");
  }

  @Test
  public void unknownCommandIsAUsageErrorAndPrintsHelp() {
    Cli cli = new Cli(List.of(new Echo()));
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    int code;
    try (PrintStream out = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
      code = cli.run(new String[] {"nope"}, out);
    }
    assertThat(code).isEqualTo(2);
    assertThat(buffer.toString(StandardCharsets.UTF_8)).contains("Unknown command 'nope'", "echo");
  }
}
