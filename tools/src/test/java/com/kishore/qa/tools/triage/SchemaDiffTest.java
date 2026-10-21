package com.kishore.qa.tools.triage;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class SchemaDiffTest {

  @Test
  public void readsAnOpenApiViolationAsARename() {
    String message =
        "OpenAPI contract violation on GET /v1/credits/balance:\n"
            + "  - validation.response.body.schema.required: Object has missing required properties ([\"balance\"])\n"
            + "  - validation.response.body.schema.additionalProperties: Object instance has properties which are not"
            + " allowed by the schema: [\"availableBalance\"]";

    SchemaDiff diff = SchemaDiff.parse(message);

    assertThat(diff.operation()).isEqualTo("GET /v1/credits/balance");
    assertThat(diff.missing()).containsExactly("balance");
    assertThat(diff.unexpected()).containsExactly("availableBalance");
    assertThat(diff.looksLikeRename()).isTrue();
    assertThat(diff.raw()).hasSize(2);
  }

  @Test
  public void readsAJsonSchemaViolation() {
    String message =
        "JSON Schema 'balance' violated by GET /v1/credits/balance -> 200:\n"
            + "  - $: required property 'balance' not found";

    SchemaDiff diff = SchemaDiff.parse(message);

    assertThat(diff.schema()).isEqualTo("balance");
    assertThat(diff.missing()).containsExactly("balance");
    assertThat(diff.unexpected()).isEmpty();
    assertThat(diff.looksLikeRename()).isFalse();
  }

  @Test
  public void aToleratedNewFieldInTheResponseCompletesTheRename() throws Exception {
    SchemaDiff diff =
        SchemaDiff.parse(
            "JSON Schema 'balance' violated by GET /v1/credits/balance -> 200:\n"
                + "  - $: required property 'balance' not found");
    com.fasterxml.jackson.databind.JsonNode body =
        com.kishore.qa.tools.shared.Json.mapper()
            .readTree("{\"availableBalance\":5,\"currency\":\"credits\",\"accountId\":\"acc_1\"}");

    SchemaDiff completed =
        diff.withUndeclared(body, java.util.Set.of("balance", "currency", "accountId"));

    org.assertj.core.api.Assertions.assertThat(completed.unexpected())
        .containsExactly("availableBalance");
    org.assertj.core.api.Assertions.assertThat(completed.looksLikeRename()).isTrue();
  }
}
