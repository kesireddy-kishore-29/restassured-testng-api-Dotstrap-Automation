# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007ce730685560@3a75daa3]

| | |
|---|---|
| Test | `com.qaautomation.tests.security.SecurityHeadersTest#securityHeadersOnEveryResponse[1]` |
| Features | FEAT-SEC-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/me` | 401 | 12 | `qa-63b14b9e-cf7a-4612-bc4c-b9a8b4972c8e` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-63b14b9e-cf7a-4612-bc4c-b9a8b4972c8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b14b9e-cf7a-4612-bc4c-b9a8b4972c8e
Content-Type: application/json

--- response: 401 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63b14b9e-cf7a-4612-bc4c-b9a8b4972c8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-63b14b9e-cf7a-4612-bc4c-b9a8b4972c8e"}
```
