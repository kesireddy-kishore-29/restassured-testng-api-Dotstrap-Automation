package com.kishore.qa.framework.schemas;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.testng.annotations.Test;

public class SchemaValidatorTest {

  @Test
  public void acceptsAConformingBalance() {
    String json = "{\"balance\":5,\"currency\":\"credits\",\"accountId\":\"acc_1\"}";

    assertThat(SchemaValidator.validate("balance", json)).isEmpty();
  }

  @Test
  public void reportsARenamedFieldWithItsPath() {
    String drifted = "{\"availableBalance\":5,\"currency\":\"credits\",\"accountId\":\"acc_1\"}";

    List<String> violations = SchemaValidator.validate("balance", drifted);

    assertThat(violations).singleElement().asString().contains("balance");
  }

  @Test
  public void resolvesReferencesBetweenSchemaFilesFromTheClasspath() {
    String page = "{\"items\":[{\"id\":\"bad\"}],\"total\":1}";

    assertThat(SchemaValidator.validate("message-page", page)).isNotEmpty();
  }

  @Test
  public void publicProfileMustNotLeakPrivateFields() {
    String leaky = "{\"handle\":\"qa-x\",\"displayName\":\"X\",\"region\":\"eu\",\"id\":\"acc_1\"}";

    assertThat(SchemaValidator.validate("public-profile", leaky)).isNotEmpty();
  }
}
