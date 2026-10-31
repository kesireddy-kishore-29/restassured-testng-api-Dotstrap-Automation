# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000073204443c1e0@118f819b]

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
| 1 | `GET /v1/accounts/me` | 401 | 345 | `qa-6af3e333-9cc0-4124-9a25-1fdfe7e460aa` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-6af3e333-9cc0-4124-9a25-1fdfe7e460aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af3e333-9cc0-4124-9a25-1fdfe7e460aa
Content-Type: application/json

--- response: 401 in 345 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6af3e333-9cc0-4124-9a25-1fdfe7e460aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-6af3e333-9cc0-4124-9a25-1fdfe7e460aa"}
```
