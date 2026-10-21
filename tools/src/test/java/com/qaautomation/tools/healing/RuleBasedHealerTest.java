package com.qaautomation.tools.healing;

import static org.assertj.core.api.Assertions.assertThat;

import com.qaautomation.tools.triage.Category;
import com.qaautomation.tools.triage.SchemaDiff;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.testng.annotations.Test;

public class RuleBasedHealerTest {

  private static Path repoWithBalanceContract() throws IOException {
    Path root = Files.createTempDirectory("heal");
    Path schema = root.resolve("framework/src/main/resources/schemas/balance.schema.json");
    Path model = root.resolve("framework/src/main/java/com/x/framework/clients/model/Balance.java");
    Files.createDirectories(schema.getParent());
    Files.createDirectories(model.getParent());
    Files.writeString(
        schema,
        "{\n  \"required\": [\n    \"balance\",\n    \"currency\"\n  ],\n"
            + "  \"properties\": {\n    \"balance\": {\"type\": \"integer\"},\n"
            + "    \"currency\": {\"const\": \"credits\"}\n  }\n}\n",
        StandardCharsets.UTF_8);
    Files.writeString(
        model,
        "record Balance(@JsonProperty(\"balance\") int balance) {}\n",
        StandardCharsets.UTF_8);
    // Another contract that legitimately keeps a field with the same name.
    Files.writeString(
        schema.resolveSibling("ledger.schema.json"),
        "{\n  \"required\": [\"items\", \"balance\"],\n"
            + "  \"properties\": {\"items\": {\"type\": \"array\"}, \"balance\": {\"type\": \"integer\"}}\n}\n",
        StandardCharsets.UTF_8);
    Files.writeString(
        model.resolveSibling("Ledger.java"),
        "record Ledger(@JsonProperty(\"balance\") int balance) {}\n",
        StandardCharsets.UTF_8);
    return root;
  }

  private static SchemaDiff rename(String from, String to) {
    return new SchemaDiff(
        "balance", "GET /v1/credits/balance", List.of(from), List.of(to), List.of());
  }

  @Test
  public void proposesTheRenameInSchemaAndModelOnly() throws IOException {
    RuleBasedHealer healer = new RuleBasedHealer(repoWithBalanceContract());

    Patch patch =
        healer
            .propose(Category.CONTRACT_DRIFT, "t#m", rename("balance", "availableBalance"))
            .orElseThrow();

    assertThat(patch.changes())
        .extracting(FileChange::path)
        .containsExactlyInAnyOrder(
            "framework/src/main/resources/schemas/balance.schema.json",
            "framework/src/main/java/com/x/framework/clients/model/Balance.java");
    assertThat(patch.changes())
        .allSatisfy(
            c -> assertThat(c.after()).contains("availableBalance").doesNotContain("\"balance\""));
    assertThat(new Guardrails().check(patch)).isEmpty();
  }

  @Test
  public void leavesOtherContractsWithTheSameFieldNameAlone() throws IOException {
    RuleBasedHealer healer = new RuleBasedHealer(repoWithBalanceContract());

    Patch patch =
        healer
            .propose(Category.CONTRACT_DRIFT, "t#m", rename("balance", "availableBalance"))
            .orElseThrow();

    assertThat(patch.changes())
        .extracting(FileChange::path)
        .noneMatch(p -> p.contains("ledger") || p.contains("Ledger"));
  }

  @Test
  public void proposesNothingWhenTheViolatedContractIsUnnamed() throws IOException {
    RuleBasedHealer healer = new RuleBasedHealer(repoWithBalanceContract());
    SchemaDiff unnamed =
        new SchemaDiff(
            null, "GET /v1/credits/balance", List.of("balance"), List.of("x"), List.of());

    assertThat(healer.propose(Category.CONTRACT_DRIFT, "t#m", unnamed)).isEmpty();
  }

  @Test
  public void mapsSchemaNamesToModelNames() {
    assertThat(RuleBasedHealer.modelName("balance")).isEqualTo("Balance");
    assertThat(RuleBasedHealer.modelName("ledger-entry")).isEqualTo("LedgerEntry");
  }

  @Test
  public void proposesNothingWhenItIsNotARename() throws IOException {
    RuleBasedHealer healer = new RuleBasedHealer(repoWithBalanceContract());
    SchemaDiff onlyMissing = new SchemaDiff(null, null, List.of("balance"), List.of(), List.of());

    assertThat(healer.propose(Category.CONTRACT_DRIFT, "t#m", onlyMissing)).isEmpty();
    assertThat(healer.propose(Category.TIMING, "t#m", rename("balance", "availableBalance")))
        .isEmpty();
  }
}
