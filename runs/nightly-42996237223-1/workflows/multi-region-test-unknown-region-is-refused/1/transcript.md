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
| 1 | `POST /v1/accounts` | 422 | 33 | `qa-1444e303-2093-43a9-bd46-28bf81fbfd7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1444e303-2093-43a9-bd46-28bf81fbfd7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1444e303-2093-43a9-bd46-28bf81fbfd7a
Content-Type: application/json

--- request body ---
{"handle":"qa-7bc608253c18","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1444e303-2093-43a9-bd46-28bf81fbfd7a
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-1444e303-2093-43a9-bd46-28bf81fbfd7a","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
