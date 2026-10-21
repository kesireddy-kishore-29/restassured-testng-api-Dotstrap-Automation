# 5. Triage by rules first; a model only for what the rules cannot place

- Status: accepted
- Date: 2026-10-21

## Context

A failed test needs a category to decide what happens next: retry later, file a bug, or propose
a fix. A language model can classify messy failures, but it costs money, needs a key, can be
wrong in confident ways, and gives different answers to the same input.

## Decision

Seven categories, the same in every repository: `LOCATOR_DRIFT`, `TIMING`, `TEST_DATA`,
`CONTRACT_DRIFT`, `ENVIRONMENT`, `PRODUCT_BUG`, `UNKNOWN`. Ordered rules classify each failure from
the error, the failing call (named in the message, else the last call that broke) and the run's
context. Only `UNKNOWN` may go to a model, and only when `ANTHROPIC_API_KEY` is set:
`claude-opus-5-5` with structured JSON output, effort `medium`, and server-side fallback on a
safety decline. A refusal or a truncated answer is reported as such and never read as a category.

## Consequences

- Triage is free, repeatable and explainable: every record names the rule that fired.
- Without a key, the AI step is reported as skipped, not silently omitted. It has never run in this
  project's own runs (no key on the development machine).
- Allure's categories mirror the rules as a preview; `qa-tools triage` is authoritative.
