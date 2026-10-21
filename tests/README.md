# tests/

The suites, one package each (`smoke`, `contract`, `functional`, `negative`, `workflows`,
`resilience`, `security`, `booker`, `demo`), selected by the TestNG files in
[`src/test/resources/suites/`](src/test/resources/suites/): `./mvnw verify -pl tests -Dsuite=<name>`.
Every test carries `@Feature` IDs from [`features.json`](../features.json); tests contain intent and
assertions only, and everything else lives in the framework.
