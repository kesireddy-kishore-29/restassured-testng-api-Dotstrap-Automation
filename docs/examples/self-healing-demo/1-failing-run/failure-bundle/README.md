# Failure bundle: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.kishore.qa.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Run | `api-chaos-2` (git `bf44d507e4af`) |
| Attempts | 3 |
| Error | `com.kishore.qa.framework.assertions.ContractViolation` |

## What is in here

| File | What it is | How to open |
|---|---|---|
| `attempt-N/transcript.md` | Every HTTP call of that attempt: method, URL, headers, bodies, status, timing, correlation ID. Secrets are masked. | Any Markdown viewer |
| `attempt-N/transcript.json` | The same calls as data | Any JSON viewer |
| `attempt-N/timeline.html` | The calls on a time axis, coloured by status | A browser |
| `attempt-N/error.txt` | The assertion or exception, with stack trace | A text editor |
| `attempt-N/meta.json` | Test identity, features, timings, environment, git SHA | A JSON viewer |
| `triage.json` | Failure category and suggested next action (added by triage) | A JSON viewer |
| `failure-report.md` | One-page summary for a person (added by triage) | A Markdown viewer |

API tests have no video by design: the transcript replays the whole interaction.
