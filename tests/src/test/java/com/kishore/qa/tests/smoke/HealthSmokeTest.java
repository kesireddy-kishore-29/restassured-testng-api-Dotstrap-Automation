package com.kishore.qa.tests.smoke;

import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.clients.HealthClient;
import com.kishore.qa.framework.config.Config;
import com.kishore.qa.framework.core.ApiResponse;
import com.kishore.qa.framework.core.RequestSpecs;
import java.util.List;
import org.testng.annotations.Test;

public class HealthSmokeTest {

  @Test(
      groups = {"smoke"},
      description = "The reference service reports itself up")
  @Feature("FEAT-HEALTH-01")
  public void serviceReportsUp() {
    HealthClient health =
        new HealthClient(Config.get().sutBaseUrl(), new RequestSpecs(Config.get(), List.of()));

    ApiResponse response = health.health();

    assertThat(response.status()).isEqualTo(200);
    assertThat(response.json().getString("status")).isEqualTo("UP");
  }
}
