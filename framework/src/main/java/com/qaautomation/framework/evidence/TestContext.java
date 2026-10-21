package com.qaautomation.framework.evidence;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Per-test state: identity, attempt number, the transcript of calls and the resources the test
 * created. Held in an inheritable thread-local, so threads a test starts itself (the concurrency
 * tests) record into the same transcript. Never shared between tests.
 */
public final class TestContext {

  private static final InheritableThreadLocal<TestContext> CURRENT = new InheritableThreadLocal<>();

  private final TestIdentity identity;
  private final int attempt;
  private final Instant startedAt = Instant.now();
  private final Transcript transcript = new Transcript();
  private final Deque<AutoCloseable> openResources = new ConcurrentLinkedDeque<>();

  private TestContext(TestIdentity identity, int attempt) {
    this.identity = identity;
    this.attempt = attempt;
  }

  public static TestContext begin(TestIdentity identity, int attempt) {
    TestContext context = new TestContext(identity, attempt);
    CURRENT.set(context);
    return context;
  }

  public static Optional<TestContext> current() {
    return Optional.ofNullable(CURRENT.get());
  }

  public static void end() {
    CURRENT.remove();
  }

  public TestIdentity identity() {
    return identity;
  }

  public int attempt() {
    return attempt;
  }

  public Instant startedAt() {
    return startedAt;
  }

  public Transcript transcript() {
    return transcript;
  }

  /** Called by a test-scoped resource when it is created. */
  public void opened(AutoCloseable resource) {
    openResources.push(resource);
  }

  /** Called by a test-scoped resource when it has been closed and its cleanup verified. */
  public void closed(AutoCloseable resource) {
    openResources.remove(resource);
  }

  /** Resources the test created but did not close, newest first. */
  public List<AutoCloseable> leaked() {
    return new ArrayList<>(openResources);
  }
}
