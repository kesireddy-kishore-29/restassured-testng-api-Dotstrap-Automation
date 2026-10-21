package com.qaautomation.tools.reporting;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.qaautomation.tools.shared.Json;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

public class MergeCommandTest {

  private static void shard(
      Path dir, String testId, String status, String started, String finished, boolean flaky)
      throws IOException {
    Files.createDirectories(dir.resolve("functional/" + testId + "/1"));
    Files.writeString(dir.resolve("functional/" + testId + "/1/meta.json"), "{}");
    Json.write(
        dir.resolve("run-summary.json"),
        Map.of(
            "schemaVersion",
            1,
            "repo",
            "api-automation-framework",
            "runId",
            "nightly-1",
            "startedAt",
            started,
            "finishedAt",
            finished,
            "durationMs",
            1,
            "totals",
            Map.of(
                "total", 1,
                "passed", "passed".equals(status) ? 1 : 0,
                "failed", "failed".equals(status) ? 1 : 0),
            "tests",
            List.of(Map.of("id", testId, "status", status))));
    Json.write(
        dir.resolve("flaky-report.json"),
        Map.of("flaky", flaky ? List.of(Map.of("testId", testId)) : List.of()));
  }

  @Test
  public void combinesShardsIntoOneRun() throws IOException {
    Path root = Files.createTempDirectory("merge");
    shard(
        root.resolve("shards/evidence-security/api-automation-framework/nightly-1"),
        "b-test",
        "failed",
        "2026-10-21T02:00:00Z",
        "2026-10-21T02:00:30Z",
        false);
    shard(
        root.resolve("shards/evidence-booker/api-automation-framework/nightly-1"),
        "a-test",
        "passed",
        "2026-10-21T02:00:05Z",
        "2026-10-21T02:01:00Z",
        true);
    Path into = root.resolve("merged");
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    int code;
    try (PrintStream out = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
      code =
          new MergeCommand()
              .run(
                  new String[] {
                    "--from", root.resolve("shards").toString(), "--into", into.toString()
                  },
                  out);
    }

    assertThat(code).isZero();
    JsonNode summary = Json.read(into.resolve("run-summary.json"));
    assertThat(summary.path("totals").path("total").asInt()).isEqualTo(2);
    assertThat(summary.path("totals").path("failed").asInt()).isEqualTo(1);
    assertThat(summary.path("tests").findValuesAsText("id")).containsExactly("a-test", "b-test");
    assertThat(summary.path("durationMs").asLong()).isEqualTo(60_000);
    assertThat(summary.path("shards").asInt()).isEqualTo(2);
    assertThat(Json.read(into.resolve("flaky-report.json")).path("flaky").size()).isEqualTo(1);
    assertThat(into.resolve("functional/a-test/1/meta.json")).exists();
    assertThat(into.resolve("functional/b-test/1/meta.json")).exists();
  }

  @Test
  public void aTestThatRanInSeveralShardsCountsOnceWithItsWorstResult() {
    ObjectNode passed = summary("passed");
    ObjectNode failed = summary("failed");

    ObjectNode merged = MergeCommand.merge(List.of(passed, failed, passed));

    assertThat(merged.path("tests").size()).isEqualTo(1);
    assertThat(merged.path("tests").get(0).path("status").asText()).isEqualTo("failed");
    assertThat(merged.path("totals").path("total").asInt()).isEqualTo(1);
    assertThat(merged.path("totals").path("failed").asInt()).isEqualTo(1);
    assertThat(merged.path("totals").path("passed").asInt()).isZero();
  }

  private static ObjectNode summary(String status) {
    ObjectNode s = Json.mapper().createObjectNode();
    s.put("startedAt", "2026-10-21T02:00:00Z");
    s.put("finishedAt", "2026-10-21T02:00:10Z");
    s.putArray("tests")
        .addObject()
        .put("id", "com.example.SetupTest#prepare")
        .put("status", status);
    return s;
  }

  @Test
  public void nothingToMergeIsAnError() throws IOException {
    Path empty = Files.createTempDirectory("merge-empty");
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    try (PrintStream out = new PrintStream(buffer, true, StandardCharsets.UTF_8)) {
      assertThat(
              new MergeCommand()
                  .run(new String[] {"--from", empty.toString(), "--into", empty + "/x"}, out))
          .isEqualTo(1);
    }
  }
}
