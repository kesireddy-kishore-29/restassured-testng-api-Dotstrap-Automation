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
| 1 | `POST /v1/accounts` | 422 | 39 | `qa-66ec50cf-4bad-48b3-b3fd-6e4e5e06dceb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-66ec50cf-4bad-48b3-b3fd-6e4e5e06dceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ec50cf-4bad-48b3-b3fd-6e4e5e06dceb
Content-Type: application/json

--- request body ---
{"handle":"qa-e52423a8d63c","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66ec50cf-4bad-48b3-b3fd-6e4e5e06dceb
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-66ec50cf-4bad-48b3-b3fd-6e4e5e06dceb","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
