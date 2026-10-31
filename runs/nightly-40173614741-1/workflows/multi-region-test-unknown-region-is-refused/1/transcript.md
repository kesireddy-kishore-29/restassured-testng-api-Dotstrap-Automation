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
| 1 | `POST /v1/accounts` | 422 | 48 | `qa-9b8e3908-15cb-4329-9223-4fadf583df24` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b8e3908-15cb-4329-9223-4fadf583df24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8e3908-15cb-4329-9223-4fadf583df24
Content-Type: application/json

--- request body ---
{"handle":"qa-f3773eebbbb9","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 48 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b8e3908-15cb-4329-9223-4fadf583df24
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-9b8e3908-15cb-4329-9223-4fadf583df24","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
