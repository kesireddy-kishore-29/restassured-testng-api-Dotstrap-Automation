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
| 1 | `POST /v1/accounts` | 422 | 40 | `qa-2f3be93f-bd38-4c8d-a87c-1c5e3a8541ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2f3be93f-bd38-4c8d-a87c-1c5e3a8541ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f3be93f-bd38-4c8d-a87c-1c5e3a8541ad
Content-Type: application/json

--- request body ---
{"handle":"qa-ea168d6ec599","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 40 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f3be93f-bd38-4c8d-a87c-1c5e3a8541ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2f3be93f-bd38-4c8d-a87c-1c5e3a8541ad","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
