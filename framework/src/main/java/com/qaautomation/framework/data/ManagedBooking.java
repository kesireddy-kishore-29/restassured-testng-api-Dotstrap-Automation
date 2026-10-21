package com.qaautomation.framework.data;

import com.qaautomation.framework.assertions.Contracts;
import com.qaautomation.framework.clients.Booker;
import com.qaautomation.framework.clients.model.Booking;
import com.qaautomation.framework.clients.model.CreatedBooking;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.evidence.TestContext;
import java.util.Optional;

/**
 * A Restful-Booker booking that exists for one test. Deleted on close, and the deletion is VERIFIED
 * by reading it back and expecting 404. Restful-Booker answers a successful DELETE with 201; that
 * quirk is documented in docs/known-issues.md and accepted here as success.
 */
public final class ManagedBooking implements AutoCloseable {

  private final Booker booker;
  private final int id;
  private final Booking booking;
  private boolean closed;

  private ManagedBooking(Booker booker, int id, Booking booking) {
    this.booker = booker;
    this.id = id;
    this.booking = booking;
  }

  public static ManagedBooking create(Booker booker, Booking booking) {
    ApiResponse created = booker.client().create(booking);
    CreatedBooking result =
        Contracts.read(created, 200, "booker-booking-created", CreatedBooking.class);
    ManagedBooking managed = new ManagedBooking(booker, result.bookingid(), result.booking());
    TestContext.current().ifPresent(t -> t.opened(managed));
    return managed;
  }

  public int id() {
    return id;
  }

  public Booking booking() {
    return booking;
  }

  @Override
  public void close() {
    if (closed) {
      return;
    }
    ApiResponse deleted = booker.client().delete(id, Optional.of(booker.token()));
    if (deleted.status() != 201 && deleted.status() != 200) {
      throw new CleanupFailedException("DELETE /booking/" + id + " answered " + deleted.status());
    }
    ApiResponse readBack = booker.client().get(id);
    if (readBack.status() != 404) {
      throw new CleanupFailedException(
          "Booking " + id + " still readable after delete (" + readBack.status() + ")");
    }
    closed = true;
    TestContext.current().ifPresent(t -> t.closed(this));
  }

  @Override
  public String toString() {
    return "ManagedBooking[" + id + "]";
  }
}
