# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007da32043b7a8@1e5b1677]

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
| 1 | `GET /v1/accounts/me` | 401 | 355 | `qa-39a4fce9-cc03-4c41-9076-ecdbc10ebfb6` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-39a4fce9-cc03-4c41-9076-ecdbc10ebfb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39a4fce9-cc03-4c41-9076-ecdbc10ebfb6
Content-Type: application/json

--- response: 401 in 355 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39a4fce9-cc03-4c41-9076-ecdbc10ebfb6
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

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-39a4fce9-cc03-4c41-9076-ecdbc10ebfb6"}
```
