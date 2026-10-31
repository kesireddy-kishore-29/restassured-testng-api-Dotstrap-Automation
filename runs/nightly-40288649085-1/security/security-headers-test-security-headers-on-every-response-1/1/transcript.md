# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x0000728b4c43d0e8@44af49c4]

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
| 1 | `GET /v1/accounts/me` | 401 | 411 | `qa-b70cbe52-6667-40a4-b42f-fb91e763611f` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-b70cbe52-6667-40a4-b42f-fb91e763611f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b70cbe52-6667-40a4-b42f-fb91e763611f
Content-Type: application/json

--- response: 401 in 411 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b70cbe52-6667-40a4-b42f-fb91e763611f
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

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-b70cbe52-6667-40a4-b42f-fb91e763611f"}
```
