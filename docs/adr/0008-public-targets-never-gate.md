# 8. Targets we do not control never gate a merge

- Status: accepted
- Date: 2026-10-21

## Context

The regression includes Restful-Booker, a public practice API. When it is slow or down, a gate
that includes it fails for a reason the author of the pull request cannot fix, and people learn to
re-run red builds until they turn green.

## Decision

- The pull-request gate is the `pr-gate` suite: every layer, the reference service only (51 tests).
- The nightly runs the whole regression, both targets, with retries, sharded by suite, and reports
  without blocking anything.
- A 5xx from a public target is classified `ENVIRONMENT` by triage.

## Consequences

- A red gate always means something in this repository changed.
- Findings against the public API (it answers 201 to DELETE, 403 instead of 401 without a token,
  and 200 with "Bad credentials" to a wrong password) are documented in known issues and asserted
  as its actual behaviour, not hidden.
