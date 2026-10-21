package com.qaautomation.framework.evidence;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * One folder (and one zip) per failed test holding every attempt's evidence and a README that says
 * what each file is and how to open it. Triage later adds triage.json and failure-report.md and
 * re-zips. Lives at {@code <run>/failure-bundles/<test-slug>/}.
 */
public final class FailureBundles {

  private FailureBundles() {}

  public static Path build(RunInfo run, TestRecord finalAttempt, List<Path> attemptDirs) {
    String slug = Path.of(finalAttempt.evidence().dir()).getParent().getFileName().toString();
    Path bundle = run.runDir().resolve("failure-bundles").resolve(slug);
    try {
      Files.createDirectories(bundle);
      for (Path attempt : attemptDirs) {
        Path target = bundle.resolve("attempt-" + attempt.getFileName());
        copyTree(attempt, target);
      }
      EvidenceWriter.write(
          bundle.resolve("README.md"), readme(run, finalAttempt, attemptDirs.size()));
      zip(bundle, bundle.resolveSibling(slug + ".zip"));
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot build failure bundle " + bundle, e);
    }
    return bundle;
  }

  static String readme(RunInfo run, TestRecord test, int attempts) {
    return """
        # Failure bundle: %s

        | | |
        |---|---|
        | Test | `%s` |
        | Features | %s |
        | Run | `%s` (git `%s`) |
        | Attempts | %d |
        | Error | `%s` |

        ## What is in here

        | File | What it is | How to open |
        |---|---|---|
        | `attempt-N/transcript.md` | Every HTTP call of that attempt: method, URL, headers, bodies, \
        status, timing, correlation ID. Secrets are masked. | Any Markdown viewer |
        | `attempt-N/transcript.json` | The same calls as data | Any JSON viewer |
        | `attempt-N/timeline.html` | The calls on a time axis, coloured by status | A browser |
        | `attempt-N/error.txt` | The assertion or exception, with stack trace | A text editor |
        | `attempt-N/meta.json` | Test identity, features, timings, environment, git SHA | A JSON viewer |
        | `triage.json` | Failure category and suggested next action (added by triage) | A JSON viewer |
        | `failure-report.md` | One-page summary for a person (added by triage) | A Markdown viewer |

        API tests have no video by design: the transcript replays the whole interaction.
        """
        .formatted(
            test.title(),
            test.id(),
            String.join(", ", test.featureIds()),
            run.runId(),
            run.gitSha(),
            attempts,
            test.error() == null ? "" : test.error().type());
  }

  public static void zip(Path source, Path zipFile) throws IOException {
    try (OutputStream out = Files.newOutputStream(zipFile);
        ZipOutputStream zip = new ZipOutputStream(out);
        Stream<Path> files = Files.walk(source)) {
      for (Path file : files.filter(Files::isRegularFile).toList()) {
        zip.putNextEntry(new ZipEntry(source.relativize(file).toString().replace('\\', '/')));
        Files.copy(file, zip);
        zip.closeEntry();
      }
    }
  }

  private static void copyTree(Path from, Path to) throws IOException {
    try (Stream<Path> files = Files.walk(from)) {
      for (Path file : files.toList()) {
        Path target = to.resolve(from.relativize(file).toString());
        if (Files.isDirectory(file)) {
          Files.createDirectories(target);
        } else {
          Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);
        }
      }
    }
  }
}
