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
| 1 | `POST /v1/accounts` | 422 | 491 | `qa-e8dc747d-a616-41e3-b3ea-36720fd45948` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e8dc747d-a616-41e3-b3ea-36720fd45948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8dc747d-a616-41e3-b3ea-36720fd45948
Content-Type: application/json

--- request body ---
{"handle":"qa-54f60532385d","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 491 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8dc747d-a616-41e3-b3ea-36720fd45948
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-e8dc747d-a616-41e3-b3ea-36720fd45948","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
