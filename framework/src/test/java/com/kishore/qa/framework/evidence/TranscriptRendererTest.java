package com.kishore.qa.framework.evidence;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

public class TranscriptRendererTest {

  private static final TestIdentity ID =
      new TestIdentity(
          "pkg.SomeTest#works",
          "Some <test>",
          "contract",
          "some-test-works",
          List.of("FEAT-X-01"),
          List.of());

  private static Exchange call(int seq, Integer status) {
    return new Exchange(
        seq,
        Instant.parse("2026-10-20T10:00:00Z").plusMillis(seq * 100L),
        40,
        "GET",
        "/v1/things/{id}",
        "http://localhost/v1/things/1",
        Map.of("Authorization", "Bearer ****"),
        null,
        status,
        Map.of(),
        "{}",
        "qa-1",
        null,
        List.of());
  }

  @Test
  public void markdownListsEveryCallInOrder() {
    String md = TranscriptRenderer.markdown(ID, 1, "passed", List.of(call(1, 200), call(2, 404)));

    assertThat(md)
        .contains("| 1 | `GET /v1/things/{id}` | 200 |", "| 2 | `GET /v1/things/{id}` | 404 |");
  }

  @Test
  public void timelineIsSelfContainedAndEscapesTitles() {
    String html =
        TranscriptRenderer.timeline(
            ID, "failed", Instant.parse("2026-10-20T10:00:00Z"), List.of(call(1, 503)));

    assertThat(html)
        .startsWith("<!doctype html>")
        .contains("Some &lt;test&gt;")
        .contains("class=\"s bad\"");
  }

  @Test
  public void slugsAreFilesystemSafe() {
    assertThat(TestIdentity.slugify("IdempotencyTest-replaysPurchase-[1a2b]"))
        .isEqualTo("idempotency-test-replays-purchase-1a2b");
  }
}
