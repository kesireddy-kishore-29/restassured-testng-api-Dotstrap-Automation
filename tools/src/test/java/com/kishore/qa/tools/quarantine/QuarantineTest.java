package com.kishore.qa.tools.quarantine;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import org.testng.annotations.Test;

public class QuarantineTest {

  private static final LocalDate TODAY = LocalDate.parse("2026-10-21");
  private static final String SOURCE =
      """
      package com.kishore.qa.tests.security;

      public class RateLimitTest {

        @Test(groups = {"quarantine", "security"}, description = "x")
        @Feature("FEAT-RATE-01")
        public void quarantined() {}

        @Test(groups = {"security"})
        @Feature("FEAT-RATE-01")
        public void normal() {}

        @Test
        @Feature("FEAT-RATE-01")
        public void bare() {}
      }
      """;

  private static QuarantineEntry entry(String testId, String owner, String expires) {
    return new QuarantineEntry(testId, "t", owner, "flaky", expires, "");
  }

  @Test
  public void findsTestsInTheQuarantineGroupBySource() {
    assertThat(QuarantinedTests.inSource(SOURCE))
        .containsExactly("com.kishore.qa.tests.security.RateLimitTest#quarantined");
  }

  @Test
  public void aValidOwnedUnexpiredEntryPasses() {
    String id = "com.kishore.qa.tests.security.RateLimitTest#quarantined";

    assertThat(
            QuarantineCheckCommand.check(
                List.of(entry(id, "@owner", "2026-11-01")), List.of(id), TODAY))
        .isEmpty();
  }

  @Test
  public void expiredOwnerlessAndUnmatchedEntriesFail() {
    List<String> problems =
        QuarantineCheckCommand.check(
            List.of(entry("a#expired", "@o", "2026-10-01"), entry("a#ownerless", "", "2026-12-01")),
            List.of("a#expired", "a#ownerless", "a#untracked"),
            TODAY);

    assertThat(problems)
        .anySatisfy(p -> assertThat(p).contains("a#expired: expired on 2026-10-01"))
        .anySatisfy(p -> assertThat(p).contains("a#ownerless: no owner"))
        .anySatisfy(
            p ->
                assertThat(p)
                    .contains(
                        "a#untracked: in the quarantine group but has no quarantine.json entry"));
  }

  @Test
  public void anEntryForATestOutsideTheGroupFails() {
    assertThat(
            QuarantineCheckCommand.check(
                List.of(entry("a#b", "@o", "2026-12-01")), List.of(), TODAY))
        .singleElement()
        .asString()
        .contains("not in the quarantine group");
  }

  @Test
  public void theProposerAddsTheGroupWhereverTheAnnotationAllows() {
    String withGroups = QuarantineProposer.addQuarantineGroup(SOURCE, "normal");
    String bare = QuarantineProposer.addQuarantineGroup(SOURCE, "bare");

    assertThat(withGroups).contains("@Test(groups = {\"quarantine\", \"security\"})");
    assertThat(bare)
        .contains(
            "@Test(groups = {\"quarantine\"})\n  @Feature(\"FEAT-RATE-01\")\n  public void bare()");
    assertThat(QuarantineProposer.addQuarantineGroup(SOURCE, "quarantined")).isEqualTo(SOURCE);
  }

  @Test
  public void flakyHistoryKeepsThirtyDaysAndCountsAWindow() {
    FlakyHistory history =
        new FlakyHistory(1, List.of())
            .record(
                List.of(
                    new FlakyHistory.Occurrence("2026-09-01", "r0", "t#old", "old"),
                    new FlakyHistory.Occurrence("2026-10-10", "r1", "t#a", "a"),
                    new FlakyHistory.Occurrence("2026-10-15", "r2", "t#a", "a"),
                    new FlakyHistory.Occurrence("2026-10-20", "r3", "t#a", "a"),
                    new FlakyHistory.Occurrence("2026-10-20", "r3", "t#a", "a")),
                TODAY)
            .record(List.of(), TODAY);

    assertThat(history.occurrences())
        .extracting(FlakyHistory.Occurrence::testId)
        .doesNotContain("t#old");
    assertThat(history.countsSince(TODAY, 14)).containsEntry("t#a", 3);
  }
}
