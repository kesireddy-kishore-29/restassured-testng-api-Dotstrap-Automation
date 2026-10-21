# 6. Self-healing proposes; people merge

- Status: accepted
- Date: 2026-10-21

## Context

"Self-healing" tests often heal by loosening: a longer timeout, a weaker assertion, a skipped
test. That turns a red signal green without fixing anything, and the suite slowly stops testing.

## Decision

- Only the four healable categories are healed. `ENVIRONMENT`, `PRODUCT_BUG` and `UNKNOWN` never
  are.
- A heal may change only framework code that describes the system (clients, data, auth, config,
  consumer schemas for contract drift). Tests, assertions, suites, build files, CI, the service and
  these decisions are forbidden paths.
- Guardrails are code, with unit tests that prove each rule refuses: no hard waits, no disabled
  tests, no suppressed checks, no swallowed exceptions, no timeouts above 30 s, no removed checks,
  no loosened schemas.
- A patch is verified on its branch: build, the failing test 3 times in a row, its suite, and every
  other failure the same fix claims to explain. Then it is committed on `heal/<category>/<test>-<date>`
  and, in CI, opened as a pull request. Nothing is merged automatically.
- Failures with identical fixes share one branch. At most 3 pull requests per run, at most 2
  attempts per failure per day.
- Every outcome is recorded in `healing-log.json` and shown on the dashboard.

## Consequences

- A heal is a reviewed change with evidence attached, not a silent edit.
- Contract-drift heals carry a "decide first" note and label: the provider may be wrong.
- Pull requests opened with the workflow token do not trigger CI by GitHub's rules; reviewers push
  to the branch or reopen the pull request to run it.
