package com.kishore.qa.framework.data;

import com.kishore.qa.framework.clients.model.Booking;
import com.kishore.qa.framework.clients.model.BookingDates;
import java.time.LocalDate;
import java.util.UUID;

/** Builds Restful-Booker bookings with unique, recognisable names. */
public final class BookingBuilder {

  private String firstname = "QA";
  private String lastname = "Guest-" + UUID.randomUUID().toString().substring(0, 8);
  private int totalprice = 120;
  private boolean depositpaid = true;
  private LocalDate checkin = LocalDate.now().plusDays(30);
  private int nights = 3;
  private String additionalneeds = "Breakfast";

  public static BookingBuilder aBooking() {
    return new BookingBuilder();
  }

  public BookingBuilder firstname(String value) {
    this.firstname = value;
    return this;
  }

  public BookingBuilder lastname(String value) {
    this.lastname = value;
    return this;
  }

  public BookingBuilder totalprice(int value) {
    this.totalprice = value;
    return this;
  }

  public BookingBuilder depositpaid(boolean value) {
    this.depositpaid = value;
    return this;
  }

  public BookingBuilder checkin(LocalDate value) {
    this.checkin = value;
    return this;
  }

  public BookingBuilder nights(int value) {
    this.nights = value;
    return this;
  }

  public BookingBuilder additionalneeds(String value) {
    this.additionalneeds = value;
    return this;
  }

  public Booking build() {
    return new Booking(
        firstname,
        lastname,
        totalprice,
        depositpaid,
        new BookingDates(checkin.toString(), checkin.plusDays(nights).toString()),
        additionalneeds);
  }
}
