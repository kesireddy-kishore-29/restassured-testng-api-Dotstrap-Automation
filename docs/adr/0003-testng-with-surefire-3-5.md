# 3. TestNG suite files, run by Surefire 3.5.x

- Status: accepted
- Date: 2026-10-20

## Context

Suites are selected with TestNG XML files (`-Dsuite=pr-gate`), which combine packages and groups
and set the parallelism. Surefire 3.6 runs TestNG through the JUnit Platform engine, which
ignores suite XML files: every test would run in every suite.

## Decision

Use TestNG 7.12 with suite XML files, and pin Surefire to 3.5.6, the last line with the classic
TestNG provider. The reason is written next to the version in `pom.xml`.

## Alternatives considered

- **JUnit 5 with tags**: fine, but TestNG's groups, data providers with parallelism and listeners
  fit this framework better, and the lite Selenium repo shows TestNG in its usual form.
- **Surefire 3.6 with groups on the command line**: loses the per-suite parallel settings and the
  package exclusions.

## Consequences

- A Surefire upgrade has to be checked against the suite files; the pin and its comment make that
  visible.
- `-Dtest=Class#method` still works for single tests (the verifier of the healer uses it).
