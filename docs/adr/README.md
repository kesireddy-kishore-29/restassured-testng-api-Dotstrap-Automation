# Architecture decision records

One file per decision: context, decision, alternatives, consequences. A decision that changes gets
a new record that supersedes the old one; old records are not rewritten.

| # | Decision |
|---|---|
| [1](0001-self-hosted-reference-service.md) | A self-hosted reference service is the main target |
| [2](0002-two-contract-layers.md) | Two contract layers: provider OpenAPI and consumer JSON Schemas |
| [3](0003-testng-with-surefire-3-5.md) | TestNG suite files, run by Surefire 3.5.x |
| [4](0004-shared-evidence-layout.md) | One evidence layout and one RECORD_MODE switch for the family |
| [5](0005-rules-first-triage.md) | Triage by rules first; a model only for what the rules cannot place |
| [6](0006-governed-self-healing.md) | Self-healing proposes; people merge |
| [7](0007-static-dashboard-and-allure.md) | A static dashboard for the trend, Allure for the detail |
| [8](0008-public-targets-never-gate.md) | Targets we do not control never gate a merge |
| [9](0009-why-java-rest-assured-testng.md) | Why Java, REST Assured and TestNG, in a repository of their own |
| [10](0010-postman-alongside-coded-suites.md) | A Postman collection alongside the coded suites |
| [11](0011-transcripts-instead-of-video.md) | API tests record transcripts and timelines, not video |
