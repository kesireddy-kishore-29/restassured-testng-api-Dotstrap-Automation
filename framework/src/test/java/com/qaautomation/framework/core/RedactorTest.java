package com.qaautomation.framework.core;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedHashMap;
import java.util.Map;
import org.testng.annotations.Test;

public class RedactorTest {

  @Test
  public void masksCredentialHeadersButKeepsTheScheme() {
    Map<String, String> headers = new LinkedHashMap<>();
    headers.put("Authorization", "Bearer abc.def.ghi");
    headers.put("Cookie", "token=s3cr3t");
    headers.put("Content-Type", "application/json");

    Map<String, String> safe = Redactor.headers(headers);

    assertThat(safe)
        .containsEntry("Authorization", "Bearer ****")
        .containsEntry("Cookie", "****")
        .containsEntry("Content-Type", "application/json");
  }

  @Test
  public void masksSecretJsonFieldsAtAnyDepthAndLeavesTheRest() {
    String body =
        "{\"handle\":\"qa-1\",\"password\":\"pw-123456\","
            + "\"nested\":{\"accessToken\":\"xyz\",\"items\":[{\"token\":\"t\"}]}}";

    String safe = Redactor.body(body);

    assertThat(safe)
        .contains("\"handle\":\"qa-1\"")
        .doesNotContain("pw-123456", "xyz", "\"t\"")
        .contains("\"password\":\"****\"", "\"accessToken\":\"****\"", "\"token\":\"****\"");
  }

  @Test
  public void masksSecretsInTextThatIsNotJson() {
    assertThat(Redactor.body("broken {\"password\": \"hunter2\" ..."))
        .doesNotContain("hunter2")
        .contains("****");
  }

  @Test
  public void masksTokenQueryParameters() {
    assertThat(Redactor.url("https://x.test/a?token=abc&page=2"))
        .isEqualTo("https://x.test/a?token=****&page=2");
  }
}
