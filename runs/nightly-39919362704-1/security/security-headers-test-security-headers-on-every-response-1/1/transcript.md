# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007d49e043b968@4b56bb73]

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
| 1 | `GET /v1/accounts/me` | 401 | 423 | `qa-098ab238-58a0-4481-b294-85a9d1ec12e3` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-098ab238-58a0-4481-b294-85a9d1ec12e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-098ab238-58a0-4481-b294-85a9d1ec12e3
Content-Type: application/json

--- response: 401 in 423 ms ---
Date: Fri, 23 Oct 2026 07:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-098ab238-58a0-4481-b294-85a9d1ec12e3
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
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-098ab238-58a0-4481-b294-85a9d1ec12e3"}
```
