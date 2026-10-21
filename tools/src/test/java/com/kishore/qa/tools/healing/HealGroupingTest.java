package com.kishore.qa.tools.healing;

import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.tools.triage.Category;
import java.util.List;
import org.testng.annotations.Test;

public class HealGroupingTest {

  private static Patch patch(String testId, String after) {
    return new Patch(
        Category.CONTRACT_DRIFT,
        testId,
        RuleBasedHealer.NAME,
        "rename",
        List.of(
            new FileChange("framework/src/main/resources/schemas/balance.json", "{}", after),
            new FileChange("framework/src/main/java/A.java", "a", "b")));
  }

  @Test
  public void failuresWithTheSameFixShareOneGroup() {
    assertThat(HealCommand.fingerprint(patch("A#one", "{\"x\":1}")))
        .isEqualTo(HealCommand.fingerprint(patch("B#two", "{\"x\":1}")));
  }

  @Test
  public void aDifferentFixIsADifferentGroup() {
    assertThat(HealCommand.fingerprint(patch("A#one", "{\"x\":1}")))
        .isNotEqualTo(HealCommand.fingerprint(patch("A#one", "{\"y\":1}")));
  }
}
