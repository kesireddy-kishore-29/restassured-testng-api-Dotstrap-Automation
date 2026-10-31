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
| 1 | `POST /v1/accounts` | 422 | 28 | `qa-d9ee5569-6d9a-4eaf-9da0-a739c1a77cb6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9ee5569-6d9a-4eaf-9da0-a739c1a77cb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9ee5569-6d9a-4eaf-9da0-a739c1a77cb6
Content-Type: application/json

--- request body ---
{"handle":"qa-554c87b96feb","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9ee5569-6d9a-4eaf-9da0-a739c1a77cb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d9ee5569-6d9a-4eaf-9da0-a739c1a77cb6","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
