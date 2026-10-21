# 9. Why Java, REST Assured and TestNG, in a repository of their own

- Status: accepted
- Date: 2026-10-20

## Context

These repositories are meant to show range to people hiring for QA and SDET roles. The author
analysed about 980 recent QA/SDET job descriptions (Naukri and Foundit):

- Java is the most requested language for test automation; Python comes next (33 to 42% of jobs).
- REST Assured with TestNG is the usual coded API stack, and Postman is expected alongside it.
- Selenium with Java is the most common UI stack (46 to 61% of jobs); Playwright is the fastest
  growing, usually with TypeScript.

The author's day job is C# with Selenium, so Java and these libraries add range rather than repeat
it.

## Decision

1. The API flagship uses Java 21, Maven, REST Assured, TestNG, AssertJ and Jackson, with Postman and
   Newman alongside ([ADR 10](0010-postman-alongside-coded-suites.md)).
2. Each stack lives in its own repository (API in Java, UI in TypeScript, plus a Selenium and a
   Python lite repository), sharing feature IDs, triage categories, evidence layout and report
   formats. A reader sees one idiomatic project per stack instead of a polyglot monorepo where each
   stack is a guest.

## Alternatives considered

- **Karate**: concise for API tests, but less common in job descriptions and further from how
  most teams write Java.
- **JUnit 5**: equally good; TestNG's suite files, groups and data providers are what the job
  descriptions name most often next to REST Assured.
- **One repository for everything**: easier to keep in step, harder to read, and each stack's
  build would be bent to fit the others.

## Consequences

- The shared conventions (feature IDs, categories, `RECORD_MODE`, JSON formats) are written down and
  kept identical by hand; the dashboard template is copied byte for byte between the flagships.
- The Python lite repository reuses this repository's reference service in CI by checking out a
  pinned ref, rather than copying its code.
