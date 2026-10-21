# Test strategy

## What is under test

| Target | Why it is here | Gates merges? |
|---|---|---|
| **Reference service** (`sut/`, self-hosted) | A realistic API we fully control: accounts and tokens, conversations between two people, a credit ledger with idempotent purchases, rate limits, CORS, regions, injectable faults and chaos switches. Deterministic, so a red result means our code or the service changed. | Yes |
| **Restful-Booker** (public practice API) | A real API on the internet that we do not control: tokens, CRUD, and its own quirks. Shows how a suite copes with a third party. | No: nightly only |

The reference service publishes an OpenAPI 3.0 document at `/openapi.yaml`. That document is
the provider's contract; the framework's JSON Schemas are the consumer's contract.

## Risks and how each is covered

| Risk | Covered by |
|---|---|
| A response drifts from the contract | Every response from the reference service is checked against the OpenAPI document; key responses also against consumer JSON Schemas (`contract` suite plus every client call) |
| An error looks different per endpoint | `negative`: every error is RFC 7807 problem JSON with the documented status, data-driven over 16 cases |
| One person can read or change another person's data | `security` and `workflows`: two real actors, each boundary checked through HTTP |
| A retried purchase charges twice | `resilience`: replay with the same idempotency key, concurrent duplicates, a different body with a reused key |
| The client hangs on a slow service | `resilience`: client timeout enforced within budget; 503 with Retry-After honoured |
| Rate limits break clients | `security`: 429 with Retry-After, then recovery |
| The browser cannot use the API although every server test passes | `security`: CORS preflight and disallowed origins |
| Balance and history disagree | `workflows`: ledger history sums to the balance after purchases and spending |
| Data is served from the wrong region | `workflows`: requests are served by the account's home region; unknown regions are refused |
| Secrets leak into evidence | `Redactor` on every transcript, with unit tests; tokens, passwords and credential headers are masked |

## Layers (the pyramid)

| Layer | Where | Runs |
|---|---|---|
| Framework unit tests (config, retry policy, redaction, schemas, transcripts, test ids) | `framework/src/test` | Every build |
| Tool unit tests (triage, guardrails, healers, reports, merge) | `tools/src/test` | Every build |
| API suites against the reference service | `tests/` | Every pull request (`pr-gate`) |
| API suites against Restful-Booker | `tests/…/booker` | Nightly |
| Postman collection | `postman/` | Every pull request (Newman) |

There is no UI here; the UI flagship covers the browser.

## Postman or code?

| Use the Postman collection for | Use the REST Assured suites for |
|---|---|
| Exploring an endpoint, trying a payload by hand | The regression that gates merges |
| A quick check that a deployment answers | Contracts: OpenAPI and JSON Schema on every response |
| Sharing a working request with a developer or a product person | Workflows with two actors, ordering and state |
| Reproducing a bug report step by step | Concurrency, retries, idempotency, timeouts, rate limits |
| | Test data that is created per test and verifiably cleaned up |

The collection mirrors the smoke and functional scenarios and runs in CI with Newman, so it never
silently rots; it is kept small on purpose ([ADR 10](adr/0010-postman-alongside-coded-suites.md)).

## Environments

| Profile | Service under test | Used by |
|---|---|---|
| `local` (default) | `http://localhost:7070`, started by hand | Development |
| `ci` | `http://localhost:7070`, started by the workflow | GitHub Actions |
| `docker` | `http://sut:7070` in `docker-compose.yml` | Not run yet ([known issues](known-issues.md)) |

Each profile is a properties file in `framework/src/main/resources/config/`; any key can be
overridden by an environment variable (`sut.baseUrl` → `SUT_BASE_URL`). The configuration is
validated at start-up and reports every problem at once.

## Test data

- Every test that needs an account creates its own (`TestAccount`), with a unique handle, and
  deletes it at the end. Deletion is verified: signing in as the deleted account must then fail
  with 401.
  A cleanup that cannot be verified fails the test (`CleanupFailedException`), so leaks are seen.
- Restful-Booker bookings are created per test (`ManagedBooking`) and deleted, and the deletion is
  read back.
- Nothing is shared between tests, so suites run in parallel (4 threads) and in any order.

## What gates a merge

The pull-request gate (`ci.yml`) is: formatting, Checkstyle, compile with `-Werror`, framework and
tool unit tests, the `pr-gate` suite (51 tests against the reference service), the quarantine
policy check and Newman. Quarantined tests still run but cannot fail the gate. The public practice
API is excluded on purpose: its outages must not block a merge.

The nightly (`nightly.yml`) runs the whole regression, both targets, one shard per suite, with up to
two retries, and publishes the dashboard and Allure report with their history. It never blocks a
merge.

## Flaky tests and quarantine

- A test that fails and then passes on a retry is reported as **flaky**, never as passed. Retries
  exist to measure flakiness, not to hide it.
- The nightly records every flaky test in a 30-day history. A test flaky 3 or more times in 14 days
  is proposed for quarantine by pull request (`flaky-history --propose-only`); a person decides.
- A quarantine entry needs an owner, a reason and an expiry date (at most 14 days ahead when
  proposed). `quarantine-check` fails the build on an expired, ownerless or unmatched entry.
- Quarantined tests carry the `quarantine` group, still run in their own non-gating step, and are
  listed on the dashboard.

## Failures: triage and healing

Every failed test is put in exactly one of seven categories by rules, in a fixed order: network or
timeout, public-target 5xx, contract violation, test data, polled-condition timeout, behaviour
assertion, then `UNKNOWN`. An optional model step may reclassify only `UNKNOWN`. Four categories
can be healed (`LOCATOR_DRIFT`, `TIMING`, `TEST_DATA`, `CONTRACT_DRIFT`); the healer proposes a fix
on a branch, behind guardrails and verification, and never merges. Details: [self-healing.md](self-healing.md).

## Evidence

`RECORD_MODE` decides how much each test keeps: `failures` (default) keeps everything for failed
attempts only, `all` keeps it for every test, `off` keeps only the run summary. A failed test's
attempts are gathered into a failure bundle (folder and zip) with a README, the transcript, the
call timeline and, after triage, a one-page failure report. Details: [reporting.md](reporting.md).

## Entry and exit

- **Entry**: the reference service answers `/health`; the configuration validates at start-up
  (all problems reported at once, not one at a time).
- **Exit for a merge**: the gate is green; no quarantine entry is expired.
- **Exit for a release**: the nightly regression is green on both targets, or each failure is
  triaged with an owner.

## Not covered here

Load and soak testing, chaos at the infrastructure level, and anything that needs the author's
private systems. The reference service's chaos switches cover the application level only.
