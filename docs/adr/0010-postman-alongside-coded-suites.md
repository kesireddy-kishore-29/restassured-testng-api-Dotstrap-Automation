# 10. A Postman collection alongside the coded suites

- Status: accepted
- Date: 2026-10-20

## Context

Many teams explore and share APIs in Postman, and job descriptions expect it next to REST Assured.
A Postman collection is also what a developer or a product person will actually open. But a
collection is a poor home for contracts, multi-actor workflows, concurrency, verified cleanup or
retries.

## Decision

- `postman/` holds a maintained collection with environments and test scripts that mirrors the
  smoke and functional scenarios (28 requests, 32 assertions).
- Newman runs it in the pull-request gate and in the nightly, with an HTML report
  (`newman-reporter-htmlextra`) published next to the Allure report.
- The coded REST Assured suites are the regression, the contracts and the workflows. The split is
  explained in the [test strategy](../test-strategy.md#postman-or-code).

## Consequences

- Two places describe the same smoke scenarios; a change to an endpoint touches both. The
  collection is kept small on purpose.
- Anyone can import the collection and see the API working without a JDK.
