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
| 1 | `POST /v1/accounts` | 422 | 348 | `qa-0e5bb316-363f-4e66-8361-3c87488a2693` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e5bb316-363f-4e66-8361-3c87488a2693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e5bb316-363f-4e66-8361-3c87488a2693
Content-Type: application/json

--- request body ---
{"handle":"qa-f497e4047244","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 348 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e5bb316-363f-4e66-8361-3c87488a2693
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-0e5bb316-363f-4e66-8361-3c87488a2693","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
