package com.kishore.qa.framework.core;

import java.net.URI;

/** Where a client talks to and how: base URI, shared request specification and retry policy. */
public record Endpoint(URI baseUri, RequestSpecs specs, RetryPolicy retryPolicy) {}
