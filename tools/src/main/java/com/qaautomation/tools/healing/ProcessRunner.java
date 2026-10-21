package com.qaautomation.tools.healing;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

/** Runs a command with a hard timeout and returns its exit code and the tail of its output. */
public final class ProcessRunner {

  /** Exit code and the last lines of combined output. */
  public record Result(int exitCode, String tail) {
    public boolean ok() {
      return exitCode == 0;
    }
  }

  private final Path workingDir;

  public ProcessRunner(Path workingDir) {
    this.workingDir = workingDir;
  }

  public Result run(List<String> command, Duration timeout) {
    try {
      Process process =
          new ProcessBuilder(command)
              .directory(workingDir.toFile())
              .redirectErrorStream(true)
              .start();
      byte[] output = process.getInputStream().readAllBytes();
      if (!process.waitFor(timeout.toMillis(), TimeUnit.MILLISECONDS)) {
        process.destroyForcibly();
        return new Result(
            124, "timed out after " + timeout.toSeconds() + " s: " + String.join(" ", command));
      }
      String text = new String(output, StandardCharsets.UTF_8);
      List<String> lines = text.lines().toList();
      String tail = String.join("\n", lines.subList(Math.max(0, lines.size() - 25), lines.size()));
      return new Result(process.exitValue(), tail);
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot run " + command, e);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      return new Result(130, "interrupted");
    }
  }
}
