package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/** The full credit history and the balance it sums to. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Ledger(List<LedgerEntry> items, int total, int balance) {}
