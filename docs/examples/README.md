# Examples from real runs

Everything here was produced by local runs on 2026-10-22 and copied as it was written (the only
edit: the author's email is left out of the heal commit view).

| Folder | From | What it shows |
|---|---|---|
| [self-healing-demo/](self-healing-demo/) | `api-chaos-5`, `api-chaos-healed-5` | Contract drift: 9 failures, one cause, one verified heal branch, 115/115 after |
| [failure-evidence/](failure-evidence/) | `api-demo-8` | One failure bundle (a polled condition that never comes true, triaged `TIMING`), its report, transcript and timeline, and the run's triage summary |
| [dashboard/](dashboard/) | `api-allure-4`, `api-allure-5`, `api-allure-6` | The health dashboard (light, dark, 390 px) with a three-run trend, the run gallery of `api-demo-8`, and the Allure overview |
