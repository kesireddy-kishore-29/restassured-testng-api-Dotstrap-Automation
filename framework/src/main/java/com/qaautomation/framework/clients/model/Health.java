package com.qaautomation.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/** Reference service health. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Health(
    String status, String version, String region, List<String> regions, boolean faultsEnabled) {}
