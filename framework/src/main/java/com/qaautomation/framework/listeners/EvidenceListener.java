package com.qaautomation.framework.listeners;

import com.qaautomation.framework.config.Config;
import com.qaautomation.framework.config.FrameworkConfig;
import com.qaautomation.framework.config.RecordMode;
import com.qaautomation.framework.evidence.EvidenceWriter;
import com.qaautomation.framework.evidence.FailureBundles;
import com.qaautomation.framework.evidence.RunInfo;
import com.qaautomation.framework.evidence.RunRecorder;
import com.qaautomation.framework.evidence.TestContext;
import com.qaautomation.framework.evidence.TestIdentity;
import com.qaautomation.framework.evidence.TestRecord;
import com.qaautomation.framework.evidence.TranscriptRenderer;
import io.qameta.allure.Allure;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Turns every test attempt into evidence according to RECORD_MODE, enforces verified cleanup (a
 * resource left open fails the test after being closed by this safety net), and writes the run
 * documents at the end: run-summary.json, flaky-report.json and one failure bundle per red test.
 */
public final class EvidenceListener
    implements ITestListener, ISuiteListener, IInvokedMethodListener {

  private static final Logger LOG = LoggerFactory.getLogger(EvidenceListener.class);

  private final Map<String, Integer> attempts = new ConcurrentHashMap<>();
  private final Map<String, List<Path>> attemptDirs = new ConcurrentHashMap<>();
  private FrameworkConfig config;
  private RunInfo run;
  private RunRecorder recorder;
  private EvidenceWriter writer;

  @Override
  public synchronized void onStart(ISuite suite) {
    if (recorder == null) {
      config = Config.get();
      run = RunInfo.of(config);
      recorder = new RunRecorder(run);
      writer = new EvidenceWriter(run);
      LOG.info(
          "Run {} — evidence in {} (RECORD_MODE={})", run.runId(), run.runDir(), run.recordMode());
    }
  }

  @Override
  public void onTestStart(ITestResult result) {
    TestIdentity identity = TestIdentity.of(result);
    int attempt = attempts.merge(identity.testId(), 1, Integer::sum);
    TestContext.begin(identity, attempt);
  }

  /** Runs before Allure closes the test case, so the attachments land inside it. */
  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult result) {
    if (!method.isTestMethod()) {
      return;
    }
    // An explicit @Severity on the test wins; otherwise the groups decide.
    if (result
            .getMethod()
            .getConstructorOrMethod()
            .getMethod()
            .getAnnotation(io.qameta.allure.Severity.class)
        == null) {
      Allure.label("severity", Severity.of(result.getMethod().getGroups()));
    }
    TestContext.current()
        .ifPresent(
            context -> {
              closeLeakedResources(context, result);
              if (!context.transcript().isEmpty()) {
                String status = result.isSuccess() ? "passed" : "failed";
                Allure.addAttachment(
                    "Transcript",
                    "text/markdown",
                    TranscriptRenderer.markdown(
                        context.identity(),
                        context.attempt(),
                        status,
                        context.transcript().exchanges()),
                    ".md");
                Allure.addAttachment(
                    "Timeline",
                    "text/html",
                    TranscriptRenderer.timeline(
                        context.identity(),
                        status,
                        context.startedAt(),
                        context.transcript().exchanges()),
                    ".html");
              }
            });
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    finish(result, "passed");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    finish(result, "failed");
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    finish(result, result.wasRetried() ? "retried" : "skipped");
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    finish(result, "failed");
  }

  @Override
  public synchronized void onFinish(ISuite suite) {
    if (recorder == null) {
      return;
    }
    Map<String, Object> environment = environment();
    recorder.write(environment);
    writeAllureEnvironment(environment);
    if (config.recordMode().keepsFailureEvidence()) {
      for (TestRecord test : recorder.finalResults()) {
        if ("failed".equals(test.status()) && test.evidence() != null) {
          FailureBundles.build(run, test, attemptDirs.getOrDefault(test.id(), List.of()));
        }
      }
    }
    LOG.info("Run summary: {}", run.runDir().resolve("run-summary.json"));
  }

  private void finish(ITestResult result, String status) {
    TestContext context =
        TestContext.current().orElseGet(() -> TestContext.begin(TestIdentity.of(result), 1));
    try {
      TestIdentity id = context.identity();
      Instant started = Instant.ofEpochMilli(result.getStartMillis());
      Instant finished = Instant.ofEpochMilli(result.getEndMillis());
      Throwable error = result.getThrowable();
      boolean quarantined = id.groups().contains("quarantine");
      TestRecord record =
          new TestRecord(
              id.testId(),
              id.title(),
              id.suite(),
              id.featureIds(),
              id.groups(),
              status,
              Duration.between(started, finished).toMillis(),
              context.attempt(),
              quarantined,
              started,
              finished,
              error == null ? null : errorInfo(error),
              null);
      boolean keep =
          config.recordMode().keepsPassingEvidence()
              || (config.recordMode().keepsFailureEvidence() && !"passed".equals(status));
      if (keep && !"skipped".equals(status)) {
        TestRecord.EvidenceInfo evidence = writer.write(context, record, environment());
        record = withEvidence(record, evidence);
        attemptDirs
            .computeIfAbsent(id.testId(), k -> new CopyOnWriteArrayList<>())
            .add(writer.attemptDir(id, context.attempt()));
      }
      recorder.add(record);
      recorder.addCalls(
          context.transcript().exchanges().stream()
              .map(
                  e ->
                      new RunRecorder.CallMetric(
                          id.testId(),
                          context.attempt(),
                          e.method(),
                          e.pathTemplate(),
                          java.net.URI.create(e.url()).getHost(),
                          e.status(),
                          e.durationMs()))
              .toList());
    } finally {
      TestContext.end();
    }
  }

  /** Safety net for verified cleanup: close what the test left open, then fail the test. */
  private static void closeLeakedResources(TestContext context, ITestResult result) {
    List<AutoCloseable> leaked = context.leaked();
    if (leaked.isEmpty()) {
      return;
    }
    List<String> problems = new ArrayList<>();
    for (AutoCloseable resource : leaked) {
      try {
        resource.close();
        problems.add(resource + " was not closed by the test (closed by the safety net)");
      } catch (Exception e) {
        problems.add(resource + " was not closed and cleanup FAILED: " + e.getMessage());
      }
    }
    LOG.warn("Leaked test data in {}: {}", context.identity().testId(), problems);
    if (result.isSuccess()) {
      result.setStatus(ITestResult.FAILURE);
      result.setThrowable(
          new IllegalStateException(
              "Test data must be cleaned up by the test itself (try-with-resources): " + problems));
    }
  }

  private Map<String, Object> environment() {
    Map<String, Object> env = new LinkedHashMap<>();
    env.put("testEnv", config.environment());
    env.put("sutBaseUrl", config.sutBaseUrl().toString());
    env.put("bookerBaseUrl", config.bookerBaseUrl().toString());
    env.put("java", System.getProperty("java.version"));
    env.put("os", System.getProperty("os.name") + " " + System.getProperty("os.version"));
    env.put("recordMode", run.recordMode());
    return env;
  }

  /**
   * Fills the Allure report's Environment panel with the same (non-secret) facts as the summary.
   */
  private void writeAllureEnvironment(Map<String, Object> environment) {
    String dir = System.getProperty("allure.results.directory");
    if (dir == null || dir.isBlank()) {
      return;
    }
    Properties properties = new Properties();
    properties.setProperty("runId", run.runId());
    properties.setProperty("gitSha", run.gitSha());
    environment.forEach((key, value) -> properties.setProperty(key, String.valueOf(value)));
    try {
      Path results = Files.createDirectories(Path.of(dir));
      try (Writer out =
          Files.newBufferedWriter(
              results.resolve("environment.properties"), StandardCharsets.UTF_8)) {
        properties.store(out, null);
      }
    } catch (IOException e) {
      LOG.warn("Could not write the Allure environment file: {}", e.getMessage());
    }
  }

  private static TestRecord.ErrorInfo errorInfo(Throwable error) {
    StringWriter stack = new StringWriter();
    error.printStackTrace(new PrintWriter(stack));
    String text = stack.toString();
    return new TestRecord.ErrorInfo(
        error.getClass().getName(),
        String.valueOf(error.getMessage()),
        text.length() > 6000 ? text.substring(0, 6000) : text);
  }

  private static TestRecord withEvidence(TestRecord r, TestRecord.EvidenceInfo evidence) {
    return new TestRecord(
        r.id(),
        r.title(),
        r.suite(),
        r.featureIds(),
        r.tags(),
        r.status(),
        r.durationMs(),
        r.attempt(),
        r.quarantined(),
        r.startedAt(),
        r.finishedAt(),
        r.error(),
        evidence);
  }

  /** For tests of the listener itself. */
  RecordMode recordMode() {
    return config.recordMode();
  }
}
