package com.qaautomation.framework.clients;

import com.qaautomation.framework.clients.model.BookerCredentials;
import com.qaautomation.framework.clients.model.Booking;
import com.qaautomation.framework.core.ApiClient;
import com.qaautomation.framework.core.ApiResponse;
import com.qaautomation.framework.core.CallOptions;
import com.qaautomation.framework.core.Endpoint;
import java.util.Map;
import java.util.Optional;

/**
 * Restful-Booker, a public practice API. Writes authenticate with a {@code Cookie: token=...}
 * header; the token comes from {@code POST /auth}. The token is an explicit argument so negative
 * tests can send a missing or wrong one on purpose.
 */
public final class BookerClient extends ApiClient {

  public BookerClient(Endpoint endpoint) {
    super(endpoint.baseUri(), endpoint.specs(), Optional.empty(), endpoint.retryPolicy());
  }

  public ApiResponse auth(BookerCredentials credentials) {
    return post("/auth", credentials, CallOptions.none());
  }

  public ApiResponse create(Booking booking) {
    return post("/booking", booking, CallOptions.none());
  }

  public ApiResponse get(int bookingId) {
    return get("/booking/{id}", CallOptions.none(), bookingId);
  }

  public ApiResponse update(int bookingId, Booking booking, Optional<String> token) {
    return put("/booking/{id}", booking, withToken(token), bookingId);
  }

  public ApiResponse partialUpdate(
      int bookingId, Map<String, Object> fields, Optional<String> token) {
    return patch("/booking/{id}", fields, withToken(token), bookingId);
  }

  public ApiResponse delete(int bookingId, Optional<String> token) {
    return delete("/booking/{id}", withToken(token), bookingId);
  }

  private static CallOptions withToken(Optional<String> token) {
    return token
        .map(t -> CallOptions.none().withHeader("Cookie", "token=" + t))
        .orElse(CallOptions.none());
  }
}
