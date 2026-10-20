package com.kishore.qa.framework.evidence;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/** The ordered calls one test made. Thread-safe: a test may call from several threads. */
public final class Transcript {

  private final List<Exchange> exchanges = new ArrayList<>();
  private final AtomicInteger sequence = new AtomicInteger();

  public int nextSequence() {
    return sequence.incrementAndGet();
  }

  public synchronized void add(Exchange exchange) {
    exchanges.add(exchange);
  }

  /** Attaches contract violations to the exchange with this sequence number. */
  public synchronized void annotate(int sequenceNumber, List<String> violations) {
    for (int i = 0; i < exchanges.size(); i++) {
      if (exchanges.get(i).sequence() == sequenceNumber) {
        exchanges.set(i, exchanges.get(i).withContractViolations(violations));
        return;
      }
    }
  }

  public synchronized List<Exchange> exchanges() {
    return List.copyOf(exchanges);
  }

  public synchronized boolean isEmpty() {
    return exchanges.isEmpty();
  }
}
