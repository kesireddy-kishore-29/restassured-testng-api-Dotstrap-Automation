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
| 1 | `POST /v1/accounts` | 422 | 401 | `qa-15ffa651-6d0e-4398-8a29-3a1f438318f8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15ffa651-6d0e-4398-8a29-3a1f438318f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15ffa651-6d0e-4398-8a29-3a1f438318f8
Content-Type: application/json

--- request body ---
{"handle":"qa-3af622dd9881","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 401 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15ffa651-6d0e-4398-8a29-3a1f438318f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-15ffa651-6d0e-4398-8a29-3a1f438318f8","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
