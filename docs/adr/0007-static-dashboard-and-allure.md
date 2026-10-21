# 7. A static dashboard for the trend, Allure for the detail

- Status: accepted
- Date: 2026-10-21

## Context

People ask two kinds of questions about tests. "Are we healthy, and getting better or worse?" and
"What exactly happened in this test?" Allure answers the second well. It answers the first only
partly, and knows nothing about triage, healing, quarantine or contract coverage.

## Decision

- A single-file static dashboard (`index.html`, no server, no build step) shows the trends over 30
  runs, failures by triage category, the healing ledger, quarantine, feature coverage and
  repository-specific sections (here: contract coverage and latency per endpoint). Its template is
  shared byte for byte with the UI flagship; only the data differs.
- Allure 2 stays for drill-down, with history carried from the last published report.
- A run gallery lists every test with its attempts and links to the evidence.
- The step summary is also the pull-request comment.

## Consequences

- The dashboard is published to GitHub Pages next to Allure by the nightly, with `history.json`
  kept on the `gh-pages` branch.
- One template serves two repositories, so a change is made once and copied (an md5 check is part
  of the routine).
- allure-maven keeps its own history cache, which double-counted runs; it is switched off and the
  history passed in explicitly (see known issues).
