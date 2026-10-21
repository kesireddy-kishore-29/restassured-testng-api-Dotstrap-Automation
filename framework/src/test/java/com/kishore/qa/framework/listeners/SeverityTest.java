package com.kishore.qa.framework.listeners;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class SeverityTest {

  @Test
  public void followsWhatTheTestIsFor() {
    assertThat(Severity.of("regression", "smoke")).isEqualTo("blocker");
    assertThat(Severity.of("contract")).isEqualTo("critical");
    assertThat(Severity.of("regression", "security")).isEqualTo("critical");
    assertThat(Severity.of("booker", "regression")).isEqualTo("minor");
    assertThat(Severity.of("demo-failure")).isEqualTo("trivial");
    assertThat(Severity.of("regression")).isEqualTo("normal");
  }
}
