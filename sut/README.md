# sut/

The reference service the suites test: a Javalin app with accounts and tokens, conversations
between people, a credit ledger with idempotent purchases, rate limits, CORS, home regions, RFC 7807
errors and security headers, described by [`openapi/reference-service.yaml`](src/main/resources/openapi/reference-service.yaml)
(served at `/openapi.yaml`). In memory only; restart to reset.

`java -jar sut/target/reference-service.jar` starts it on port 7070. Settings are environment
variables (`SUT_PORT`, `SUT_REGION`, `SUT_RATE_LIMIT`, `SUT_TOKEN_TTL_SECONDS`, `SUT_ALLOWED_ORIGINS`
and others in `SutSettings`). Test-only faults come from the `X-Fault` request header (`latency=<ms>`,
`drop-response`, `unavailable-once`); `SUT_CHAOS=rename-balance-field` or `slow-ledger` ships a
deliberate defect for the self-healing demo.
