# Known issues and limits

Everything below is stated as it is. Where something was not run, it says so.

## Not verified yet

| What | State |
|---|---|
| **GitHub Actions** | `ci.yml`, `nightly.yml` and `heal.yml` pass actionlint 1.7.12 with shellcheck 0.11.0, but have **never run on GitHub**: the repository had no remote while it was built. Not yet exercised: artifact hand-off between jobs, the sticky PR comment, GitHub Pages publishing, the quarantine-proposal pull request, label creation and `heal --open-prs`. |
| **Nightly sharding** | Simulated locally only: two suites with separate evidence roots, merged with `qa-tools merge` and reported (13/13 tests, correct totals). |
| **AI step** | Never executed against the API: `ANTHROPIC_API_KEY` was not set on the development machine, so triage and healing report the AI step as skipped. The request shape and the handling of refusals and truncated answers are unit-tested with a fake transport. |
| **Opening heal pull requests** | `heal` ran end to end locally and created a verified branch ([demo](examples/self-healing-demo/)). `--open-prs` (push and `gh pr create`) was not run: there was no remote. |
| **Docker** | Docker Desktop could not start its Linux engine (WSL is not installed and installing it needs administrator rights and a reboot). The `Dockerfile`, `docker-compose.yml` and the `-Pdocker` profile have not been run. |

## Behaviour to know about

- **Badges and links assume the GitHub account `kesireddy-kishore-29`.** Until the first workflow runs
  there, the CI and nightly badges show no status and the report link is empty; nothing in this
  repository claims a CI result.
- **Pull requests opened by the workflow token do not start other workflows** (a GitHub rule). A
  heal pull request therefore shows no CI until someone pushes to it or closes and reopens it.
- **The verifier picks the Maven command by OS**: `mvn.cmd` on Windows (needs Maven on `PATH`),
  `./mvnw` elsewhere. A heal verification takes about 3.5 minutes locally because every step
  starts Maven.
- **Allure results accumulate** in `tests/target/allure-results` between local runs unless you run
  `mvn clean`. CI always starts clean.
- **The framework's own unit tests write Allure results** into `framework/allure-results`
  (ignored by git).
- **Latency figures are from a laptop** calling a service on the same machine. Read them as a
  trend between runs, not as performance numbers.
- **`npm audit` in `postman/` reports 23 advisories** (7 moderate, 15 high, 1 critical; checked
  2026-10-21) in the dependencies of `newman` 6.2.3 and `newman-reporter-htmlextra` 1.23.1, both
  the latest releases. They are development tools that run this repository's own collection
  against local and practice services; `npm audit fix --force` would change major versions and
  is not applied. Re-check when Newman publishes a new release.
- **Contract coverage is 18 of 19 operations and 38 of 105 documented response codes.** The one
  operation never called by a test is `GET /openapi.yaml`, which the conformance filter fetches
  outside the transcript. Most of the codes not seen are 429 and 503, which every operation
  documents but only the rate-limit and resilience suites provoke, on a few operations.

## Findings against the public practice API (Restful-Booker)

These are its actual behaviour, asserted as such, with a comment at each assertion:

- A successful `DELETE /booking/{id}` answers **201 Created**.
- A write without a token answers **403**, where HTTP semantics would be 401.
- Wrong credentials answer **200** with `{"reason":"Bad credentials"}` instead of 401.
- It answers **418** to REST Assured's default multi-value `Accept` header; the client sends exactly
  `application/json`.

## Tooling pitfalls found while building (and how they are handled)

- **Surefire 3.6** runs TestNG through the JUnit Platform engine and ignores suite XML files →
  pinned to 3.5.6 ([ADR 3](adr/0003-testng-with-surefire-3-5.md)).
- **networknt json-schema-validator 3.x** (Jackson 3) breaks the Atlassian OpenAPI validator built
  on 2.x → pinned to 2.0.8.
- **allure-maven 3** keeps its own history cache and merges it with the history passed in, so each
  run was counted two or three times → its history is switched off and `scripts/allure-report.sh`
  passes the previous report's history explicitly.
- **Allure 2 puts a result in every category that matches** (not the first), so a catch-all
  category swallowed everything → there is no catch-all; unmatched failures fall into Allure's own
  defaults.
- **Rebuilding the service jar while it runs** made it answer 500 (ClassNotFoundException) → run
  it from a copy when developing.
