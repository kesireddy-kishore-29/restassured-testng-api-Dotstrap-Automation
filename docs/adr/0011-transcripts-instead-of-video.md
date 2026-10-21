# 11. API tests record transcripts and timelines, not video

- Status: accepted
- Date: 2026-10-20

## Context

The UI repositories record a video of every failed test so a person can see what happened without
re-running it. An API test has nothing to film; a screen recording of a console would be theatre.
What a person needs is the exact conversation between the test and the service.

## Decision

Every HTTP call a test makes is recorded by a REST Assured filter: method, URL, headers and bodies
(redacted), status, duration, correlation ID, and any contract violation next to the call that
caused it. Each attempt keeps `transcript.json` (for tools), `transcript.md` (for people) and
`timeline.html` (the calls on a time axis, coloured by outcome), all attached to Allure as well. The
run gallery embeds the timeline where a UI repository shows the video.

## Consequences

- A failure can be replayed by reading the calls in order; a multi-actor workflow shows which actor
  made which call.
- Triage reads the same transcript to find the failing call, and the rule healer reads the
  recorded response to see a renamed field.
- Redaction has to be right, because transcripts contain headers and bodies; it has its own unit
  tests.
