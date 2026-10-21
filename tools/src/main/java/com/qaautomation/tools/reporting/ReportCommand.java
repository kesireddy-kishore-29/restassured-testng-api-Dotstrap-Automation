package com.qaautomation.tools.reporting;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.qaautomation.tools.Command;
import com.qaautomation.tools.model.RunSummary;
import com.qaautomation.tools.model.TestResult;
import com.qaautomation.tools.quarantine.FlakyHistory;
import com.qaautomation.tools.quarantine.QuarantineFile;
import com.qaautomation.tools.shared.Args;
import com.qaautomation.tools.shared.Json;
import com.qaautomation.tools.shared.RunDirs;
import com.qaautomation.tools.triage.Category;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * {@code qa-tools report --run <dir> --out <dir>}: the layered reports of one run. Writes the
 * health dashboard (index.html), the updated history.json, the run gallery, the step summary (also
 * the PR comment), and the API-specific contract-coverage and latency reports.
 */
public final class ReportCommand implements Command {

  @Override
  public String name() {
    return "report";
  }

  @Override
  public String summary() {
    return "dashboard, history, gallery, step summary, contract coverage and latency";
  }

  @Override
  public int run(String[] argv, PrintStream out) {
    Args args = Args.parse(argv);
    Path runDir = RunDirs.resolve(args);
    Path outDir = Path.of(args.get("out", "reports/site"));
    RunSummary run = RunSummary.read(runDir);
    Path historyFile = Path.of(args.get("history", outDir.resolve("data/history.json").toString()));
    History history = History.read(historyFile).with(History.pointOf(run));
    Json.write(historyFile, history);

    List<Map<String, Object>> calls = readCalls(runDir);
    String sutHost = args.get("sut-host", "localhost");
    ContractCoverage.Result coverage =
        ContractCoverage.measure(
            Path.of(args.get("openapi", "sut/src/main/resources/openapi/reference-service.yaml")),
            calls,
            sutHost);
    List<Map<String, Object>> latency = latency(calls, sutHost);
    Json.write(outDir.resolve("contract-coverage.json"), coverage);
    Json.write(outDir.resolve("latency.json"), latency);
    writeText(outDir.resolve("contract-coverage.md"), coverageMarkdown(coverage));
    writeText(outDir.resolve("latency.md"), latencyMarkdown(latency));

    Map<String, Object> data = dashboardData(args, run, history, coverage, latency, runDir);
    writeText(outDir.resolve("index.html"), Templates.render("dashboard.html", data));
    writeText(
        runDir.resolve("gallery.html"), Templates.render("gallery.html", galleryData(run, runDir)));
    String summary = stepSummary(run, runDir, coverage, args.get("report-url", ""));
    writeText(outDir.resolve("summary.md"), summary);
    String githubSummary = System.getenv("GITHUB_STEP_SUMMARY");
    if (githubSummary != null && !githubSummary.isBlank()) {
      appendText(Path.of(githubSummary), summary);
    }
    out.println("Dashboard: " + outDir.resolve("index.html"));
    out.println("Gallery:   " + runDir.resolve("gallery.html"));
    out.println("Summary:   " + outDir.resolve("summary.md"));
    return 0;
  }

  private static List<Map<String, Object>> readCalls(Path runDir) {
    Path file = runDir.resolve("calls.json");
    if (!Files.exists(file)) {
      return List.of();
    }
    return Json.mapper()
        .convertValue(Json.read(file), new TypeReference<List<Map<String, Object>>>() {});
  }

  static List<Map<String, Object>> latency(List<Map<String, Object>> calls, String host) {
    Map<String, List<Long>> byOp = new TreeMap<>();
    for (Map<String, Object> call : calls) {
      if (host.equals(call.get("host")) && call.get("status") != null) {
        byOp.computeIfAbsent(
                call.get("method") + " " + call.get("operation"), k -> new ArrayList<>())
            .add(((Number) call.get("durationMs")).longValue());
      }
    }
    List<Map<String, Object>> rows = new ArrayList<>();
    byOp.forEach(
        (op, values) -> {
          Map<String, Object> row = new LinkedHashMap<>();
          row.put("operation", op);
          row.put("count", values.size());
          row.put("p50", Percentiles.of(values, 50));
          row.put("p95", Percentiles.of(values, 95));
          row.put("max", values.stream().mapToLong(Long::longValue).max().orElse(0));
          rows.add(row);
        });
    return rows;
  }

  private Map<String, Object> dashboardData(
      Args args,
      RunSummary run,
      History history,
      ContractCoverage.Result coverage,
      List<Map<String, Object>> latency,
      Path runDir) {
    Map<String, Object> data = new LinkedHashMap<>();
    data.put("repo", run.repo());
    data.put("generatedAt", Instant.now().toString().substring(0, 16).replace('T', ' ') + " UTC");
    Map<String, Object> runInfo = new LinkedHashMap<>();
    runInfo.put("runId", run.runId());
    runInfo.put("gitSha", run.gitSha());
    runInfo.put("durationMs", run.durationMs());
    runInfo.put("totals", run.totals());
    data.put("run", runInfo);
    data.put("history", history.runs());
    data.put(
        "slowest",
        run.tests().stream()
            .sorted(Comparator.comparingLong(TestResult::durationMs).reversed())
            .limit(10)
            .map(t -> Map.of("title", t.title(), "suite", t.suite(), "durationMs", t.durationMs()))
            .toList());
    FlakyHistory flaky =
        FlakyHistory.read(Path.of(args.get("flaky-history", "flaky-history.json")));
    data.put(
        "flakiest",
        flaky.countsSince(LocalDate.now(), 30).entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(10)
            .map(
                e ->
                    Map.of(
                        "testId",
                        e.getKey(),
                        "title",
                        e.getKey().substring(e.getKey().indexOf('#') + 1),
                        "count",
                        e.getValue()))
            .toList());
    Path triageFile = runDir.resolve("triage-summary.json");
    Map<String, Object> triage = new LinkedHashMap<>();
    if (Files.exists(triageFile)) {
      JsonNode t = Json.read(triageFile);
      triage.put(
          "byCategory",
          Json.mapper()
              .convertValue(t.path("byCategory"), new TypeReference<Map<String, Integer>>() {}));
      triage.put("aiStep", t.path("aiStep").asText());
    } else {
      Map<String, Integer> zero = new LinkedHashMap<>();
      Arrays.stream(Category.values()).forEach(c -> zero.put(c.name(), 0));
      triage.put("byCategory", zero);
    }
    triage.put(
        "healable",
        Arrays.stream(Category.values()).filter(Category::healable).map(Category::name).toList());
    data.put("triage", triage);
    data.put("healing", healing(Path.of(args.get("healing-log", "healing-log.json"))));
    LocalDate today = LocalDate.now();
    data.put(
        "quarantine",
        QuarantineFile.read(Path.of(args.get("quarantine", "quarantine.json")))
            .entriesOrEmpty()
            .stream()
            .map(
                e -> {
                  Map<String, Object> row = new LinkedHashMap<>();
                  row.put("testId", e.testId());
                  row.put("owner", e.owner());
                  row.put("expires", e.expires());
                  row.put("reason", e.reason());
                  row.put("expired", LocalDate.parse(e.expires()).isBefore(today));
                  return row;
                })
            .toList());
    data.put(
        "coverage",
        featureCoverage(
            Path.of(args.get("features", "features.json")),
            Path.of(args.get("tests-src", "tests/src/test/java"))));
    data.put("links", links(args.get("links", "")));
    data.put("extras", List.of(contractExtra(coverage), latencyExtra(latency)));
    return data;
  }

  private static Map<String, Object> healing(Path logFile) {
    Map<String, Object> result = new LinkedHashMap<>();
    if (!Files.exists(logFile)) {
      result.put("entries", List.of());
      result.put("summary", Map.of());
      return result;
    }
    JsonNode entries = Json.read(logFile).path("entries");
    List<Map<String, Object>> list =
        Json.mapper().convertValue(entries, new TypeReference<List<Map<String, Object>>>() {});
    long proposed = list.stream().filter(e -> "proposed".equals(e.get("outcome"))).count();
    long merged = list.stream().filter(e -> "merged".equals(e.get("outcome"))).count();
    long refused = list.size() - proposed - merged;
    List<Long> minutes =
        list.stream()
            .map(e -> ((Number) e.getOrDefault("timeToFixMinutes", 0)).longValue())
            .toList();
    Map<String, Object> summary = new LinkedHashMap<>();
    summary.put("proposed", proposed);
    summary.put("merged", merged);
    summary.put("refused", refused);
    summary.put("medianMinutes", minutes.isEmpty() ? null : Percentiles.of(minutes, 50));
    result.put("entries", list);
    result.put("summary", summary);
    return result;
  }

  /**
   * The traceability matrix, counted from the test sources (every {@code @Feature} on a test
   * method), so a feature covered only by a suite that did not run here still shows as covered.
   */
  private static List<Map<String, Object>> featureCoverage(Path catalog, Path testSources) {
    if (!Files.exists(catalog)) {
      return List.of();
    }
    Map<String, Long> counts = FeatureScan.count(testSources);
    List<Map<String, Object>> rows = new ArrayList<>();
    for (JsonNode f : Json.read(catalog).path("features")) {
      String id = f.path("id").asText();
      rows.add(
          Map.of(
              "id",
              id,
              "requirement",
              f.path("requirement").asText(),
              "tests",
              counts.getOrDefault(id, 0L)));
    }
    return rows;
  }

  private static List<Map<String, String>> links(String spec) {
    List<Map<String, String>> links = new ArrayList<>();
    for (String pair : spec.split(",")) {
      int eq = pair.indexOf('=');
      if (eq > 0) {
        links.add(
            Map.of("label", pair.substring(0, eq).strip(), "href", pair.substring(eq + 1).strip()));
      }
    }
    return links;
  }

  private static Map<String, Object> contractExtra(ContractCoverage.Result c) {
    Map<String, Object> extra = new LinkedHashMap<>();
    extra.put("title", "Contract coverage");
    extra.put("subtitle", "Documented OpenAPI operations and response codes exercised by this run");
    extra.put(
        "tiles",
        List.of(
            Map.of(
                "label",
                "Operations called",
                "value",
                c.operationsCalled() + " / " + c.operations().size()),
            Map.of(
                "label",
                "Response codes seen",
                "value",
                c.codesExercised() + " / " + c.codesDocumented(),
                "note",
                "429/503 are exercised by the rate-limit and resilience suites")));
    extra.put(
        "table",
        Map.of(
            "headers",
                List.of(
                    Map.of("label", "Operation"),
                    Map.of("label", "Documented"),
                    Map.of("label", "Exercised")),
            "rows",
                c.operations().stream()
                    .map(
                        o ->
                            List.of(
                                "<code>" + o.operation() + "</code>",
                                String.join(" ", o.documented()),
                                o.exercised().isEmpty() ? "–" : String.join(" ", o.exercised())))
                    .toList()));
    extra.put("wide", true);
    return extra;
  }

  private static Map<String, Object> latencyExtra(List<Map<String, Object>> latency) {
    Map<String, Object> extra = new LinkedHashMap<>();
    extra.put("title", "Latency per endpoint");
    extra.put("wide", true);
    extra.put("subtitle", "p95 per operation against the reference service in this run (ms)");
    extra.put(
        "bars",
        latency.stream()
            .sorted(Comparator.comparingLong(r -> -((Number) r.get("p95")).longValue()))
            .limit(10)
            .map(
                r ->
                    Map.of(
                        "label",
                        r.get("operation"),
                        "value",
                        r.get("p95"),
                        "extra",
                        "p50 " + r.get("p50") + " ms, n=" + r.get("count")))
            .toList());
    extra.put(
        "table",
        Map.of(
            "headers",
                List.of(
                    Map.of("label", "Operation"),
                    Map.of("label", "Calls", "num", true),
                    Map.of("label", "p50 ms", "num", true),
                    Map.of("label", "p95 ms", "num", true),
                    Map.of("label", "Max ms", "num", true)),
            "rows",
                latency.stream()
                    .map(
                        r ->
                            List.of(
                                "<code>" + r.get("operation") + "</code>",
                                r.get("count"),
                                r.get("p50"),
                                r.get("p95"),
                                r.get("max")))
                    .toList()));
    return extra;
  }

  private static Map<String, Object> galleryData(RunSummary run, Path runDir) {
    Map<String, Object> data = new LinkedHashMap<>();
    data.put("repo", run.repo());
    data.put("runId", run.runId());
    data.put(
        "recordMode", Json.read(runDir.resolve("run-summary.json")).path("recordMode").asText());
    data.put("base", "");
    List<Map<String, Object>> tests = new ArrayList<>();
    for (TestResult t : run.tests()) {
      Map<String, Object> row = new LinkedHashMap<>();
      row.put("title", t.title());
      row.put("suite", t.suite());
      row.put("status", t.status());
      row.put("durationMs", t.durationMs());
      row.put("featureIds", t.featureIdsOrEmpty());
      List<Map<String, Object>> attempts = new ArrayList<>();
      if (t.evidence() != null && t.evidence().dir() != null) {
        Path testDir = runDir.resolve(t.evidence().dir()).getParent();
        try (Stream<Path> dirs = Files.list(testDir)) {
          for (Path attempt : dirs.filter(Files::isDirectory).sorted().toList()) {
            try (Stream<Path> files = Files.list(attempt)) {
              Map<String, Object> a = new LinkedHashMap<>();
              a.put("attempt", Integer.parseInt(attempt.getFileName().toString()));
              a.put(
                  "status",
                  Json.read(attempt.resolve("meta.json")).path("test").path("status").asText());
              a.put("dir", runDir.relativize(attempt).toString().replace('\\', '/'));
              a.put("files", files.map(f -> f.getFileName().toString()).sorted().toList());
              attempts.add(a);
            }
          }
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }
      row.put("attempts", attempts);
      tests.add(row);
    }
    data.put("tests", tests);
    return data;
  }

  static String stepSummary(
      RunSummary run, Path runDir, ContractCoverage.Result coverage, String reportUrl) {
    Map<String, Integer> t = run.totals();
    StringBuilder md = new StringBuilder();
    md.append("## ").append(run.repo()).append(" · `").append(run.runId()).append("`\n\n");
    md.append(
        "| Total | Passed | Failed | Flaky | Skipped | Quarantined | Duration |\n|---|---|---|---|---|---|---|\n");
    md.append("| ")
        .append(t.getOrDefault("total", 0))
        .append(" | ")
        .append(t.getOrDefault("passed", 0))
        .append(" | ")
        .append(t.getOrDefault("failed", 0))
        .append(" | ")
        .append(t.getOrDefault("flaky", 0))
        .append(" | ")
        .append(t.getOrDefault("skipped", 0))
        .append(" | ")
        .append(t.getOrDefault("quarantined", 0))
        .append(" | ")
        .append(String.format(Locale.ROOT, "%.1f s", run.durationMs() / 1000.0))
        .append(" |\n\n");
    Path triage = runDir.resolve("triage-summary.json");
    if (Files.exists(triage)) {
      JsonNode byCategory = Json.read(triage).path("byCategory");
      String cats =
          Arrays.stream(Category.values())
              .filter(c -> byCategory.path(c.name()).asInt() > 0)
              .map(c -> c.name() + " " + byCategory.path(c.name()).asInt())
              .collect(Collectors.joining(" · "));
      md.append("**Failures by category:** ").append(cats.isEmpty() ? "none" : cats).append("\n\n");
    }
    List<TestResult> failed = run.failed();
    if (!failed.isEmpty()) {
      md.append("<details><summary>").append(failed.size()).append(" failed test(s)</summary>\n\n");
      failed.forEach(
          f ->
              md.append("- `")
                  .append(f.id())
                  .append("`: ")
                  .append(firstLine(f.errorMessage()))
                  .append("\n"));
      md.append("\n</details>\n\n");
    }
    md.append("**Contract coverage:** ")
        .append(coverage.operationsCalled())
        .append("/")
        .append(coverage.operations().size())
        .append(" operations, ")
        .append(coverage.codesExercised())
        .append("/")
        .append(coverage.codesDocumented())
        .append(" response codes\n\n");
    if (!reportUrl.isBlank()) {
      md.append("[Dashboard](")
          .append(reportUrl)
          .append(") · [Allure](")
          .append(reportUrl)
          .append("allure/)\n");
    }
    return md.toString();
  }

  static String coverageMarkdown(ContractCoverage.Result c) {
    StringBuilder md =
        new StringBuilder(
            "# Contract coverage\n\n| Operation | Documented | Exercised |\n|---|---|---|\n");
    c.operations()
        .forEach(
            o ->
                md.append("| `")
                    .append(o.operation())
                    .append("` | ")
                    .append(String.join(" ", o.documented()))
                    .append(" | ")
                    .append(o.exercised().isEmpty() ? "–" : String.join(" ", o.exercised()))
                    .append(" |\n"));
    md.append("\nOperations called: ")
        .append(c.operationsCalled())
        .append("/")
        .append(c.operations().size())
        .append(" · response codes exercised: ")
        .append(c.codesExercised())
        .append("/")
        .append(c.codesDocumented())
        .append("\n");
    return md.toString();
  }

  static String latencyMarkdown(List<Map<String, Object>> rows) {
    StringBuilder md =
        new StringBuilder(
            "# Latency per endpoint (ms)\n\n| Operation | Calls | p50 | p95 | Max |\n|---|---|---|---|---|\n");
    rows.forEach(
        r ->
            md.append("| `")
                .append(r.get("operation"))
                .append("` | ")
                .append(r.get("count"))
                .append(" | ")
                .append(r.get("p50"))
                .append(" | ")
                .append(r.get("p95"))
                .append(" | ")
                .append(r.get("max"))
                .append(" |\n"));
    return md.toString();
  }

  private static String firstLine(String text) {
    String line = text.strip().lines().findFirst().orElse("");
    return line.length() > 160 ? line.substring(0, 160) + "…" : line;
  }

  private static void writeText(Path file, String text) {
    try {
      Files.createDirectories(file.toAbsolutePath().getParent());
      Files.writeString(file, text, StandardCharsets.UTF_8);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  private static void appendText(Path file, String text) {
    try {
      Files.writeString(
          file,
          text,
          StandardCharsets.UTF_8,
          java.nio.file.StandardOpenOption.CREATE,
          java.nio.file.StandardOpenOption.APPEND);
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }
}
