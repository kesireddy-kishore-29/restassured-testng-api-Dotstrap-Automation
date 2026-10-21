# Examples from real runs

Everything here was produced by local runs on 2026-10-21 and copied as it was written (the only
edit: the author's email is left out of the heal commit view).

| Folder | From | What it shows |
|---|---|---|
| [self-healing-demo/](self-healing-demo/) | `api-chaos-4`, `api-chaos-healed-4` | Contract drift: 8 failures, one cause, one verified heal branch, 51/51 after |
| [failure-evidence/](failure-evidence/) | `api-demo-7` | One failure bundle (a polled condition that never comes true, triaged `TIMING`), its report, transcript and timeline, and the run's triage summary |
| [dashboard/](dashboard/) | `api-allure-1`, `api-allure-2`, `api-allure-3` | The health dashboard (light, dark, 390 px) with a three-run trend, the run gallery of `api-demo-7`, and the Allure overview |
