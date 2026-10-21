package com.qaautomation.tools.shared;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

/** Locates run directories: {@code <evidenceRoot>/<repo>/<runId>/run-summary.json}. */
public final class RunDirs {

  public static final String REPO = "api-automation-framework";

  private RunDirs() {}

  /** The given run, or the most recently written run under the evidence root. */
  public static Path resolve(Args args) {
    return args.get("run")
        .map(Path::of)
        .orElseGet(() -> latest(Path.of(args.get("evidence-root", "run-evidence")).resolve(REPO)));
  }

  public static Path latest(Path repoDir) {
    try (Stream<Path> runs = Files.list(repoDir)) {
      return runs.filter(p -> Files.exists(p.resolve("run-summary.json")))
          .max(Comparator.comparing(p -> p.resolve("run-summary.json").toFile().lastModified()))
          .orElseThrow(
              () -> new IllegalStateException("No run with a run-summary.json in " + repoDir));
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot list " + repoDir, e);
    }
  }
}
