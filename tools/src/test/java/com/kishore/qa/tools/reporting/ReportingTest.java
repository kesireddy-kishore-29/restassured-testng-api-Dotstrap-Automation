package com.kishore.qa.tools.reporting;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import org.testng.annotations.Test;

public class ReportingTest {

  @Test
  public void percentilesUseNearestRank() {
    List<Long> values = List.of(10L, 20L, 30L, 40L, 50L, 60L, 70L, 80L, 90L, 100L);

    assertThat(Percentiles.of(values, 50)).isEqualTo(50);
    assertThat(Percentiles.of(values, 95)).isEqualTo(100);
    assertThat(Percentiles.of(List.of(), 95)).isZero();
  }

  @Test
  public void historyKeepsTheNewestThirtyAndReplacesARerun() {
    History history = new History(1, List.of());
    for (int i = 0; i < 35; i++) {
      history = history.with(new History.Point("r" + i, "2026-10-21", 10, 10, 0, 0, 0, 1000, 1.0));
    }
    history = history.with(new History.Point("r34", "2026-10-21", 10, 9, 1, 0, 0, 1000, 0.9));

    assertThat(history.runs()).hasSize(30);
    assertThat(history.runs().get(0).runId()).isEqualTo("r5");
    assertThat(history.runs().get(29).passRate()).isEqualTo(0.9);
  }

  @Test
  public void injectedJsonCannotCloseTheScriptTag() {
    assertThat(Templates.safeJson(Map.of("title", "</script><script>alert(1)</script>")))
        .doesNotContain("</script>")
        .contains("<\\/script>");
  }

  @Test
  public void contractCoverageCountsDocumentedCodesSeenOnTheReferenceServiceOnly()
      throws IOException {
    Path spec = Files.createTempFile("openapi", ".yaml");
    Files.writeString(
        spec,
        String.join(
            "\n",
            "openapi: 3.0.3",
            "paths:",
            "  /v1/things/{id}:",
            "    get:",
            "      responses:",
            "        '200': {description: ok}",
            "        '404': {description: missing}",
            "    delete:",
            "      responses:",
            "        '204': {description: gone}"),
        StandardCharsets.UTF_8);
    List<Map<String, Object>> calls =
        List.of(
            Map.of(
                "method",
                "GET",
                "operation",
                "/v1/things/{id}",
                "host",
                "localhost",
                "status",
                200),
            Map.of(
                "method",
                "GET",
                "operation",
                "/v1/things/{id}",
                "host",
                "localhost",
                "status",
                500),
            Map.of(
                "method",
                "GET",
                "operation",
                "/v1/things/{id}",
                "host",
                "other.example",
                "status",
                404));

    ContractCoverage.Result result = ContractCoverage.measure(spec, calls, "localhost");

    assertThat(result.operations()).hasSize(2);
    assertThat(result.operationsCalled()).isEqualTo(1);
    assertThat(result.codesDocumented()).isEqualTo(3);
    assertThat(result.codesExercised())
        .as("500 is not documented; the other host does not count")
        .isEqualTo(1);
  }

  @Test
  public void latencyIsGroupedByOperation() {
    List<Map<String, Object>> calls =
        IntStream.rangeClosed(1, 20)
            .mapToObj(
                i ->
                    Map.<String, Object>of(
                        "method",
                        "GET",
                        "operation",
                        "/v1/x",
                        "host",
                        "localhost",
                        "status",
                        200,
                        "durationMs",
                        i * 10))
            .toList();

    List<Map<String, Object>> rows = ReportCommand.latency(calls, "localhost");

    assertThat(rows)
        .singleElement()
        .satisfies(
            r -> {
              assertThat(r)
                  .containsEntry("count", 20)
                  .containsEntry("p50", 100L)
                  .containsEntry("p95", 190L)
                  .containsEntry("max", 200L);
            });
  }
}
