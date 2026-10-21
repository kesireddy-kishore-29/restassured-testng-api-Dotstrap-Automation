package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** A Restful-Booker booking. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Booking(
    String firstname,
    String lastname,
    int totalprice,
    boolean depositpaid,
    BookingDates bookingdates,
    String additionalneeds) {}
