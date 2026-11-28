# Transcript: An unknown home region is refused with 422

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#unknownRegionIsRefused` |
| Features | FEAT-REGION-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 535 | `qa-83ac64ba-9941-4fbd-acb0-aa0a2692c55b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-83ac64ba-9941-4fbd-acb0-aa0a2692c55b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ac64ba-9941-4fbd-acb0-aa0a2692c55b
Content-Type: application/json

--- request body ---
{"handle":"qa-0be6803561bc","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 535 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83ac64ba-9941-4fbd-acb0-aa0a2692c55b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-83ac64ba-9941-4fbd-acb0-aa0a2692c55b","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
