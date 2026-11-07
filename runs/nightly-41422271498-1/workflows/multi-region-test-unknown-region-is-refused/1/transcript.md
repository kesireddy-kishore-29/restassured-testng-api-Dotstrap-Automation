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
| 1 | `POST /v1/accounts` | 422 | 21 | `qa-b56c19f0-2cc3-403b-8862-70ee17004c04` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b56c19f0-2cc3-403b-8862-70ee17004c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56c19f0-2cc3-403b-8862-70ee17004c04
Content-Type: application/json

--- request body ---
{"handle":"qa-d26b604a90c6","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b56c19f0-2cc3-403b-8862-70ee17004c04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-b56c19f0-2cc3-403b-8862-70ee17004c04","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
