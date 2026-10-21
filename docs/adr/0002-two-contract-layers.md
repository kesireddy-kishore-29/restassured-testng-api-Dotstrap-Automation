# 2. Two contract layers: provider OpenAPI and consumer JSON Schemas

- Status: accepted
- Date: 2026-10-20

## Context

A contract test can ask two different questions. Does the provider keep its own published
promise? And does the response still give this consumer what it relies on? One check cannot
answer both.

## Decision

1. Every response from the reference service passes through `ContractConformanceFilter`, which
   validates it against the provider's OpenAPI document (Atlassian swagger-request-validator).
   Request-side findings are ignored, because negative tests send invalid requests on purpose.
2. Key responses are also validated against consumer JSON Schemas (`framework/…/schemas`,
   networknt validator). These schemas are tolerant readers: they require the fields the consumer
   uses and allow extra ones.

A violation of either fails the test as a `ContractViolation` and is written into the transcript
next to the call that caused it.

## Alternatives considered

- **OpenAPI only**: misses consumer drift when the provider changes its document together with
  its response.
- **Consumer schemas only**: misses provider bugs in fields this consumer does not read.
- **Pact**: the right tool between teams; here there is one consumer and one provider in the same
  repository, so a broker would add ceremony without adding a second party.

## Consequences

- An undocumented change shows up as an OpenAPI violation (a provider bug). A documented change
  that the consumer has not followed shows up as a consumer schema violation (`CONTRACT_DRIFT`).
- Tolerant schemas never name a new field, so triage reads it from the recorded response to see a
  rename as "one field gone, one new" (found in the self-healing demo).
