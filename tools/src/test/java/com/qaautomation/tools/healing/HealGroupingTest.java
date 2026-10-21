package com.qaautomation.tools.healing;

import static org.assertj.core.api.Assertions.assertThat;

import com.qaautomation.tools.triage.Category;
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

  @Test
  public void theCommitMessageKeepsEveryLineWithinTheCommitRules() {
    String message =
        HealCommand.commitMessage(
            Category.CONTRACT_DRIFT,
            "a-very-long-test-slug-".repeat(6),
            "The response no longer matches its contract: " + "x".repeat(150),
            7,
            "contract",
            RuleBasedHealer.NAME);

    List<String> lines = message.lines().toList();
    assertThat(lines.getFirst()).startsWith("fix(heal): contract drift in ").hasSizeLessThan(101);
    assertThat(lines).allSatisfy(l -> assertThat(l.length()).isLessThanOrEqualTo(100));
    assertThat(message).contains("The same fix explains 7 other failing test(s).");
    assertThat(lines.getLast()).isEqualTo("Healed-By: rule-based");
  }

  @Test
  public void wrapsWordsAndCutsAWordLongerThanTheWidth() {
    assertThat(HealCommand.wrap("aa bb cc", 5)).containsExactly("aa bb", "cc");
    assertThat(HealCommand.wrap("abcdefgh", 3)).containsExactly("abc", "def", "gh");
  }
}
