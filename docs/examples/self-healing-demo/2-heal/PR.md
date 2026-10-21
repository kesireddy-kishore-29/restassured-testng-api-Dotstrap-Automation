## Self-healed: CONTRACT_DRIFT

> Proposed by `rule-based`. **Never auto-merged**: a person reviews, then merges or closes. **Contract change: decide whether the provider is wrong before merging.**

| | |
|---|---|
| Failure category | `CONTRACT_DRIFT` |
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Evidence | `failure-bundles/contract-test-credit-resources-match-their-contracts.zip` (run `api-chaos-4`) |
| Also explains | 7 other failing test(s) with the same cause (below) |

### Root cause

The response no longer matches its contract: JSON Schema 'balance' violated by GET /v1/credits/balance -> 200

### Other failures with the same cause

- `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400`
- `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402`
- `com.qaautomation.tests.resilience.IdempotencyTest#concurrentDuplicatesProduceOnePurchase`
- `com.qaautomation.tests.resilience.IdempotencyTest#replayReturnsTheOriginalAndChargesOnce`
- `com.qaautomation.tests.resilience.IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused`
- `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance`
- `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt`

The verification below reruns each of them on this branch.

### Why this diff

The response of GET /v1/credits/balance no longer has the required field `balance` and now has `availableBalance` instead. This patch renames the field in the `balance` consumer contract and in its client model's wire name only; other contracts and the tests are unchanged, and the tests keep asserting the same values.

### Files changed (allowed paths only)

- `framework/src/main/resources/schemas/balance.schema.json`
- `framework/src/main/java/com/qaautomation/framework/clients/model/Balance.java`

### Guardrails

All passed: allowed paths, no forbidden constructs, no loosened checks.

### Verification (before → after)

Before: the test failed in the triaged run.

| Step | Result |
|---|---|
| format, lint, compile (-Werror) | passed |
| failing test, run 1 of 3 | passed |
| failing test, run 2 of 3 | passed |
| failing test, run 3 of 3 | passed |
| surrounding suite 'contract' | passed |
| also explained: CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400 | passed |
| also explained: CreditsNegativeTest#sendingWithNoCreditsIsA402 | passed |
| also explained: IdempotencyTest#concurrentDuplicatesProduceOnePurchase | passed |
| also explained: IdempotencyTest#replayReturnsTheOriginalAndChargesOnce | passed |
| also explained: IdempotencyTest#reusingAKeyForADifferentPurchaseIsRefused | passed |
| also explained: LedgerConsistencyTest#historySumsToTheBalance | passed |
| also explained: MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt | passed |

---
Labels: `self-healed`, `needs-contract-decision`
