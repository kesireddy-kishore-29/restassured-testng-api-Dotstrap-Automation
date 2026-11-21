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
| 1 | `POST /v1/accounts` | 422 | 487 | `qa-2baa3ff4-246b-4708-87f5-0eb62c0fcc52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2baa3ff4-246b-4708-87f5-0eb62c0fcc52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2baa3ff4-246b-4708-87f5-0eb62c0fcc52
Content-Type: application/json

--- request body ---
{"handle":"qa-5b7569d7ba13","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 487 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2baa3ff4-246b-4708-87f5-0eb62c0fcc52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2baa3ff4-246b-4708-87f5-0eb62c0fcc52","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
