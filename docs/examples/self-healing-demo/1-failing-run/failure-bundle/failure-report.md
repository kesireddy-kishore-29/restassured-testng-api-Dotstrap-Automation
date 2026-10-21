# Failure: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Category | **CONTRACT_DRIFT** (rules, rule `contract-violation`, confidence 0.95) |
| Next action | Decide: provider bug (file an issue) or agreed change (update schema + client model). |
| Healable | yes (needs a human decision) |
| Test | `com.kishore.qa.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Run | `api-chaos-2` |

## Why

The response no longer matches its contract: JSON Schema 'balance' violated by GET /v1/credits/balance -> 200

## Failing call

| | |
|---|---|
| method | `GET` |
| operation | `/v1/credits/balance` |
| url | `http://localhost:7070/v1/credits/balance` |
| status | `200` |
| correlationId | `qa-aae7afa4-af76-4e2f-8a37-7d8b840ca71d` |

## Contract diff

- Missing (required by the contract): [balance]
- Unexpected (not in the contract): [availableBalance]
- Looks like a rename: `balance` → `availableBalance`

## Error

```text
JSON Schema 'balance' violated by GET /v1/credits/balance -> 200:
  - $: required property 'balance' not found
```

## Evidence

- attemptDir: `contract/contract-test-credit-resources-match-their-contracts/3`
- transcript: `contract/contract-test-credit-resources-match-their-contracts/3/transcript.md`
- timeline: `contract/contract-test-credit-resources-match-their-contracts/3/timeline.html`
- bundle: `failure-bundles/contract-test-credit-resources-match-their-contracts/`
- bundleZip: `failure-bundles/contract-test-credit-resources-match-their-contracts.zip`

AI step: skipped (ANTHROPIC_API_KEY not set)
