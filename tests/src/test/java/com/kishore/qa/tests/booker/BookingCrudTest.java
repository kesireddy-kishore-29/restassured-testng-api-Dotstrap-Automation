package com.kishore.qa.tests.booker;

import static com.kishore.qa.framework.assertions.ApiAssertions.assertThatResponse;
import static com.kishore.qa.framework.data.BookingBuilder.aBooking;
import static org.assertj.core.api.Assertions.assertThat;

import com.kishore.qa.framework.annotations.Feature;
import com.kishore.qa.framework.assertions.Contracts;
import com.kishore.qa.framework.clients.Booker;
import com.kishore.qa.framework.clients.model.Booking;
import com.kishore.qa.framework.data.ManagedBooking;
import java.util.Map;
import java.util.Optional;
import org.testng.annotations.Test;

/** Restful-Booker (public practice API): create, read, update, partially update, delete. */
public class BookingCrudTest {

  private final Booker booker = Booker.connect();

  @Test(
      groups = {"booker", "regression"},
      description = "Valid credentials receive a token")
  @Feature("FEAT-AUTH-01")
  public void validCredentialsReceiveAToken() {
    assertThat(booker.token()).isNotBlank();
  }

  @Test(
      groups = {"booker", "regression"},
      description = "A created booking reads back exactly as sent")
  @Feature({"FEAT-BOOK-01", "FEAT-BOOK-02"})
  public void createdBookingReadsBackAsSent() {
    Booking sent =
        aBooking().firstname("Ada").totalprice(240).additionalneeds("Late check-in").build();
    try (ManagedBooking booking = booker.newBooking(sent)) {
      Booking readBack =
          Contracts.read(booker.client().get(booking.id()), 200, "booker-booking", Booking.class);

      assertThat(readBack).usingRecursiveComparison().isEqualTo(sent);
    }
  }

  @Test(
      groups = {"booker", "regression"},
      description = "A full update with a token replaces the booking")
  @Feature("FEAT-BOOK-03")
  public void fullUpdateWithATokenReplacesTheBooking() {
    try (ManagedBooking booking = booker.newBooking(aBooking().build())) {
      Booking changed = aBooking().firstname("Grace").totalprice(99).depositpaid(false).build();

      Booking updated =
          Contracts.read(
              booker.client().update(booking.id(), changed, Optional.of(booker.token())),
              200,
              "booker-booking",
              Booking.class);

      assertThat(updated).usingRecursiveComparison().isEqualTo(changed);
    }
  }

  @Test(
      groups = {"booker", "regression"},
      description = "A partial update changes only the named fields")
  @Feature("FEAT-BOOK-03")
  public void partialUpdateChangesOnlyNamedFields() {
    Booking original = aBooking().firstname("Linus").totalprice(150).build();
    try (ManagedBooking booking = booker.newBooking(original)) {
      Booking patched =
          Contracts.read(
              booker
                  .client()
                  .partialUpdate(
                      booking.id(), Map.of("totalprice", 175), Optional.of(booker.token())),
              200,
              "booker-booking",
              Booking.class);

      assertThat(patched.totalprice()).isEqualTo(175);
      assertThat(patched)
          .usingRecursiveComparison()
          .ignoringFields("totalprice")
          .isEqualTo(original);
    }
  }

  @Test(
      groups = {"booker", "regression"},
      description = "A deleted booking is gone (404 on read)")
  @Feature("FEAT-BOOK-04")
  public void deletedBookingIsGone() {
    ManagedBooking booking = booker.newBooking(aBooking().build());

    booking.close();

    assertThatResponse(booker.client().get(booking.id())).hasStatus(404);
  }
}
