# 4. One evidence layout and one RECORD_MODE switch for the family

- Status: accepted
- Date: 2026-10-20

## Context

Four repositories in four stacks produce failures. If each stores evidence differently, every tool
(triage, reports, healing) has to be written four times, and a reader has to learn four layouts.

## Decision

Every repository writes:

```
run-evidence/<repo>/<run-id>/
  run-summary.json  flaky-report.json  triage-summary.json
  <suite>/<test-slug>/<attempt>/        meta.json and the stack's evidence
  failure-bundles/<test-slug>/ and .zip
  triage/<test-slug>.json
```

`RECORD_MODE` is `failures` (default), `all` or `off` everywhere. The JSON formats (run summary,
triage record, flaky report, quarantine, healing log, history) are the same. In this repository
the evidence per attempt is the call transcript (`transcript.md`, `transcript.json`), the call
timeline (`timeline.html`), the error and the metadata.

## Consequences

- The dashboard and gallery templates are shared byte for byte with the UI flagship.
- An API test has no video; its timeline is the replay, and the gallery embeds it.
- Run folders are never committed; curated samples from real runs live in `docs/examples/`.
