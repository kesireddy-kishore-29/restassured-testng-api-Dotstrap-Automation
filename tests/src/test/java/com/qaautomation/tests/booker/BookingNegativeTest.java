package com.qaautomation.tests.booker;

import static com.qaautomation.framework.assertions.ApiAssertions.assertThatResponse;
import static com.qaautomation.framework.data.BookingBuilder.aBooking;
import static org.assertj.core.api.Assertions.assertThat;

import com.qaautomation.framework.annotations.Feature;
import com.qaautomation.framework.clients.Booker;
import com.qaautomation.framework.clients.model.BookerCredentials;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.data.ManagedBooking;
import java.util.Optional;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/** Restful-Booker refuses writes without a valid token and reports unknown bookings. */
public class BookingNegativeTest {

  private final Booker booker = Booker.connect();

  @DataProvider(name = "badTokens")
  public Object[][] badTokens() {
    return new Object[][] {{Optional.empty()}, {Optional.of("not-a-real-token")}};
  }

  @Test(
      groups = {"booker", "regression"},
      dataProvider = "badTokens",
      description = "An update without a valid token is refused and changes nothing")
  @Feature("FEAT-AUTH-02")
  public void updateWithoutAValidTokenIsRefused(Optional<String> token) {
    try (ManagedBooking booking = booker.newBooking(aBooking().firstname("Keep").build())) {
      ApiResponse refused =
          booker.client().update(booking.id(), aBooking().firstname("Changed").build(), token);

      // Restful-Booker answers 403 here; HTTP semantics would be 401 for a missing token.
      // Recorded in docs/known-issues.md as a finding against the public target.
      assertThatResponse(refused).hasStatus(403);
      assertThat(booker.client().get(booking.id()).json().getString("firstname")).isEqualTo("Keep");
    }
  }

  @Test(
      groups = {"booker", "regression"},
      description = "Wrong credentials do not receive a token")
  @Feature("FEAT-AUTH-02")
  public void wrongCredentialsDoNotReceiveAToken() {
    ApiResponse response = booker.client().auth(new BookerCredentials("admin", "wrong-password"));

    // Finding: Restful-Booker answers 200 with {"reason":"Bad credentials"} instead of 401.
    assertThat(response.json().getString("token")).isNull();
    assertThat(response.json().getString("reason")).isEqualTo("Bad credentials");
  }

  @Test(
      groups = {"booker", "regression"},
      description = "An unknown booking is a 404")
  @Feature("FEAT-NEG-01")
  public void unknownBookingIsA404() {
    assertThatResponse(booker.client().get(999_999_999)).hasStatus(404);
  }
}
