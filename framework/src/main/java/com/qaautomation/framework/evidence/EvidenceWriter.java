package com.qaautomation.framework.evidence;

import com.qaautomation.framework.core.Json;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Writes one attempt's evidence: {@code <run>/<suite>/<test-slug>/<attempt>/} containing meta.json,
 * transcript.json, transcript.md, timeline.html and (on failure) error.txt.
 */
public final class EvidenceWriter {

  private final RunInfo run;

  public EvidenceWriter(RunInfo run) {
    this.run = run;
  }

  public Path attemptDir(TestIdentity id, int attempt) {
    return run.runDir().resolve(id.suite()).resolve(id.slug()).resolve(Integer.toString(attempt));
  }

  /** Writes the files and returns their location relative to the run directory. */
  public TestRecord.EvidenceInfo write(
      TestContext context, TestRecord record, Map<String, Object> environment) {
    Path dir = attemptDir(context.identity(), context.attempt());
    List<Exchange> calls = context.transcript().exchanges();
    try {
      Files.createDirectories(dir);
      Map<String, Object> meta = new LinkedHashMap<>();
      meta.put("schemaVersion", 1);
      meta.put("repo", run.repo());
      meta.put("runId", run.runId());
      meta.put("gitSha", run.gitSha());
      meta.put("recordMode", run.recordMode());
      meta.put("test", record);
      meta.put("environment", environment);
      write(dir.resolve("meta.json"), Json.pretty(meta));
      write(dir.resolve("transcript.json"), Json.pretty(calls));
      write(
          dir.resolve("transcript.md"),
          TranscriptRenderer.markdown(
              context.identity(), context.attempt(), record.status(), calls));
      write(
          dir.resolve("timeline.html"),
          TranscriptRenderer.timeline(
              context.identity(), record.status(), context.startedAt(), calls));
      if (record.error() != null) {
        write(
            dir.resolve("error.txt"),
            record.error().type()
                + ": "
                + record.error().message()
                + "\n\n"
                + record.error().stack());
      }
    } catch (IOException e) {
      throw new UncheckedIOException("Cannot write evidence to " + dir, e);
    }
    Path relative = run.runDir().relativize(dir);
    String base = relative.toString().replace('\\', '/');
    return new TestRecord.EvidenceInfo(base, base + "/transcript.md", base + "/timeline.html");
  }

  static void write(Path file, String content) throws IOException {
    Files.writeString(file, content, StandardCharsets.UTF_8);
  }
}
