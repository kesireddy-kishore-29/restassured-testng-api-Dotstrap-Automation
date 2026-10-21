# 1. A self-hosted reference service is the main target

- Status: accepted
- Date: 2026-10-20

## Context

Public practice APIs are useful but thin: no per-user data, no idempotency, no rate limits worth
testing, no way to inject a fault or change a contract on purpose. They also go down, and then
every pull request turns red for a reason nobody can fix.

## Decision

Build a small reference service in the same repository (`sut/`, Javalin) with the behaviours worth
testing: accounts and tokens, conversations between two people, a credit ledger with idempotent
purchases, rate limits, CORS, regions, RFC 7807 errors, security headers, injectable faults and
chaos switches. It publishes its own OpenAPI document. A public practice API (Restful-Booker) stays
in the regression as the "third party we do not control".

## Alternatives considered

- **Public APIs only**: not enough behaviour; outages block merges.
- **WireMock stubs**: fast, but a stub only returns what the test told it to, so contract and state
  bugs cannot appear.
- **A container image of an open-source app**: realistic, but heavy, and Docker is not available
  on the development machine (see known issues).

## Consequences

- The pull-request gate is deterministic and runs in about 20 seconds.
- The service is code to maintain; it is kept small and has its own OpenAPI document as the source
  of truth.
- Chaos switches (`SUT_CHAOS`) make the self-healing demo reproducible.
