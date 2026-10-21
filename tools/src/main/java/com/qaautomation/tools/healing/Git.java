package com.qaautomation.tools.healing;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/** The handful of git operations the healer needs. Never pushes, never merges. */
public final class Git {

  private static final Duration TIMEOUT = Duration.ofMinutes(5);

  private final ProcessRunner runner;

  public Git(ProcessRunner runner) {
    this.runner = runner;
  }

  public String currentBranch() {
    return require(List.of("git", "rev-parse", "--abbrev-ref", "HEAD")).tail().strip();
  }

  public boolean isClean() {
    return require(List.of("git", "status", "--porcelain")).tail().isBlank();
  }

  public void createBranch(String name) {
    require(List.of("git", "switch", "-c", name));
  }

  public void switchTo(String name) {
    require(List.of("git", "switch", name));
  }

  public void discardChanges() {
    require(List.of("git", "checkout", "--", "."));
  }

  /** Drops staged and unstaged changes; the healer calls it only on its own heal branch. */
  public void resetHard() {
    require(List.of("git", "reset", "-q", "--hard"));
  }

  public void deleteBranch(String name) {
    require(List.of("git", "branch", "-D", name));
  }

  public void commitAll(String message) {
    require(List.of("git", "add", "-A"));
    List<String> commit = new ArrayList<>(List.of("git", "commit", "-q", "-m", message));
    require(commit);
  }

  private ProcessRunner.Result require(List<String> command) {
    ProcessRunner.Result result = runner.run(command, TIMEOUT);
    if (!result.ok()) {
      throw new IllegalStateException(String.join(" ", command) + " failed:\n" + result.tail());
    }
    return result;
  }
}
