# Self-healing demo: a renamed response field (contract drift)

Everything in this folder comes from one real local run on 2026-10-21 (run IDs `api-chaos-4` and
`api-chaos-healed-4`). Nothing was edited except one thing: the commit view in
`2-heal/heal-commit.patch` leaves out the author's email.

## The scenario

The reference service starts with `SUT_CHAOS=rename-balance-field`. `GET /v1/credits/balance`
now answers `availableBalance` instead of `balance`, and the OpenAPI document it serves says so.
The provider is consistent with itself. The consumer has not caught up: its JSON Schema and its
client model still expect `balance`.

## What happened

| Step | Command | Result |
|---|---|---|
| 1. PR gate on `main` | `RUN_ID=api-chaos-4 ./mvnw verify -pl tests -Dsuite=pr-gate` | 43 passed, **8 failed** ([run-summary](1-failing-run/run-summary.json)) |
| 2. Triage | `java -jar tools/target/qa-tools.jar triage --run run-evidence/restassured-testng-api-Dotstrap-Automation/api-chaos-4` | 8 × `CONTRACT_DRIFT`, one cause: `balance` missing, `availableBalance` undeclared ([triage](1-failing-run/triage/)) |
| 3. Heal | `java -jar tools/target/qa-tools.jar heal --run run-evidence/restassured-testng-api-Dotstrap-Automation/api-chaos-4` | One branch for the one root cause: `heal/contract-drift/contract-test-credit-resources-match-their-contracts-20261021` |
| 4. PR gate on the heal branch | `RUN_ID=api-chaos-healed-4 ./mvnw verify -pl tests -Dsuite=pr-gate` | **51 passed**, 0 failed ([run-summary](3-healed-run/run-summary.json)) |

The heal took 3 min 23 s. Inside it:

1. The rule-based healer proposed a two-line change: the `balance` consumer schema and the
   `@JsonProperty` of the `Balance` model ([patch.diff](2-heal/patch.diff)). No test changed. The
   ledger contract also has a `balance` field and was left alone.
2. The guardrails passed: allowed paths only, no forbidden constructs, no loosened checks.
3. The verifier built the framework, ran the lead failing test 3 times and its suite (`contract`),
   then re-ran each of the 7 other failures the same fix claims to explain. All passed
   ([PR.md](2-heal/PR.md)).
4. The heal was committed on its branch with an entry in `healing-log.json`
   ([heal-commit.patch](2-heal/heal-commit.patch), [healing-log.json](2-heal/healing-log.json)).

## Files

| Path | What it is |
|---|---|
| `1-failing-run/run-summary.json` | The failing run: every test, status, error, evidence folder |
| `1-failing-run/triage-summary.json` | Failures by category for that run |
| `1-failing-run/triage/*.json` | One triage record per failure: category, rule, failing call, schema diff, next action |
| `1-failing-run/failure-bundle/` | The lead failure's bundle (zip), its one-page report, the call transcript and the timeline |
| `2-heal/PR.md` | The pull-request body the healer wrote |
| `2-heal/patch.diff` | The proposed change |
| `2-heal/healing-summary.json` | One `proposed`, seven `same-fix-as` |
| `2-heal/healing-log.json` | The ledger entry: guardrails, verification, time to fix |
| `2-heal/heal-commit.patch` | The commit on the heal branch |
| `3-healed-run/run-summary.json` | The same gate on the heal branch: 51/51 |

## What this demo did not do

- **No pull request was opened.** The repository has no remote yet. In CI, `heal.yml` runs the same
  command with `--open-prs`, which pushes the branch and opens the pull request with the labels
  `self-healed` and `needs-contract-decision`.
- **The AI step was skipped.** `ANTHROPIC_API_KEY` was not set. The rule-based healer handled
  this case on its own.
- **Nobody merged anything.** Contract drift needs a human decision first: is the provider wrong,
  or did the consumer miss an agreed change? The PR body says so.

## Found and fixed while preparing this demo

- The consumer schemas tolerate extra fields, so validation reported only the missing half of the
  rename. Triage now reads the new field from the recorded response.
- The healer renamed the field in every schema that used the name, ledger included. It now changes
  only the contract the violation names.
- One renamed field failed 8 tests, which would have produced 3 identical pull requests (the
  budget). Identical fixes now share one branch, and verification reruns every failure the fix
  explains.
