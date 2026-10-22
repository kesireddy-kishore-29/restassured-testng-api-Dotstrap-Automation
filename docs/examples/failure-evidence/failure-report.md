# Failure: DEMO: a polled condition that never becomes true

| | |
|---|---|
| Category | **TIMING** (rules, rule `await-timeout`, confidence 0.80) |
| Next action | Propose a wait-on-condition fix; never a hard wait or a longer timeout. |
| Healable | yes |
| Test | `com.qaautomation.tests.demo.DeliberateFailureTest#conditionNeverMetFails` |
| Features | FEAT-DEMO-01 |
| Run | `api-demo-8` |

## Why

A polled condition did not become true in time.

## Failing call

| | |
|---|---|
| method | `GET` |
| operation | `/v1/credits/balance` |
| url | `http://localhost:7070/v1/credits/balance` |
| status | `200` |
| correlationId | `qa-61d50acf-3ba4-4fa7-8ff5-c74f54301654` |

## Error

```text
Condition with alias 'balance reaches 99 (it never will)' didn't complete within 2 seconds because condition with Lambda expression in com.qaautomation.tests.demo.DeliberateFailureTest was not fulfilled.
```

## Evidence

- attemptDir: `demo/deliberate-failure-test-condition-never-met-fails/2`
- transcript: `demo/deliberate-failure-test-condition-never-met-fails/2/transcript.md`
- timeline: `demo/deliberate-failure-test-condition-never-met-fails/2/timeline.html`
- bundle: `failure-bundles/deliberate-failure-test-condition-never-met-fails/`
- bundleZip: `failure-bundles/deliberate-failure-test-condition-never-met-fails.zip`

AI step: skipped (ANTHROPIC_API_KEY not set)
