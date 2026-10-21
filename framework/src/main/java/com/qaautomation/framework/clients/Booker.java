package com.qaautomation.framework.clients;

import com.qaautomation.framework.auth.BookerTokenProvider;
import com.qaautomation.framework.clients.model.Booking;
import com.qaautomation.framework.config.Config;
import com.qaautomation.framework.config.FrameworkConfig;
import com.qaautomation.framework.core.Endpoint;
import com.qaautomation.framework.core.RequestSpecs;
import com.qaautomation.framework.core.RetryPolicy;
import com.qaautomation.framework.core.Sleeper;
import com.qaautomation.framework.data.ManagedBooking;
import java.time.Clock;

/** Restful-Booker as tests see it: the client, an admin token and test-scoped bookings. */
public final class Booker {

  private final BookerClient client;
  private final BookerTokenProvider tokens;

  private Booker(BookerClient client, BookerTokenProvider tokens) {
    this.client = client;
    this.tokens = tokens;
  }

  public static Booker connect() {
    return Holder.DEFAULT;
  }

  public static Booker create(FrameworkConfig config) {
    RequestSpecs specs = RequestSpecs.forPublicTarget(config);
    RetryPolicy retry =
        new RetryPolicy(config.maxRetries(), config.readTimeout(), Sleeper.system());
    BookerClient client = new BookerClient(new Endpoint(config.bookerBaseUrl(), specs, retry));
    return new Booker(
        client, new BookerTokenProvider(client, config.bookerCredentials(), Clock.systemUTC()));
  }

  public BookerClient client() {
    return client;
  }

  public String token() {
    return tokens.token();
  }

  public ManagedBooking newBooking(Booking booking) {
    return ManagedBooking.create(this, booking);
  }

  private static final class Holder {
    private static final Booker DEFAULT = create(Config.get());
  }
}
