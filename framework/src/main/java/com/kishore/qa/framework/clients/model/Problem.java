package com.kishore.qa.framework.clients.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/** RFC 7807 problem details. */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Problem(
    String type,
    String title,
    int status,
    String detail,
    String instance,
    String correlationId,
    List<FieldError> errors) {}
