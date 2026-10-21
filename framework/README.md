# framework/

The reusable part: typed clients (`clients/`), the request-spec filter chain with OpenAPI
conformance, correlation IDs, retries and a redacting transcript (`core/`), assertions and consumer
JSON Schemas (`assertions/`, `resources/schemas/`), token providers (`auth/`), test data with
verified cleanup (`data/`), configuration that validates at start-up (`config/`), and the evidence
writer and TestNG listeners (`evidence/`, `listeners/`). Tests use it; it never imports a test.
