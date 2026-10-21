package com.kishore.qa.tools.healing;

import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.tools.triage.Category;
import com.kishore.qa.tools.triage.SchemaDiff;
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
    return root;
  }

  private static SchemaDiff rename(String from, String to) {
    return new SchemaDiff(null, "GET /v1/credits/balance", List.of(from), List.of(to), List.of());
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
  public void proposesNothingWhenItIsNotARename() throws IOException {
    RuleBasedHealer healer = new RuleBasedHealer(repoWithBalanceContract());
    SchemaDiff onlyMissing = new SchemaDiff(null, null, List.of("balance"), List.of(), List.of());

    assertThat(healer.propose(Category.CONTRACT_DRIFT, "t#m", onlyMissing)).isEmpty();
    assertThat(healer.propose(Category.TIMING, "t#m", rename("balance", "availableBalance")))
        .isEmpty();
  }
}
