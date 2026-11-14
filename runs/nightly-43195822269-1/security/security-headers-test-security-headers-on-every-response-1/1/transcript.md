# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000070cc7043cec8@6d07ba8b]

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
| 1 | `GET /v1/accounts/me` | 401 | 354 | `qa-94a2ab0f-a220-4d82-9fa4-1ca555cfc8f3` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-94a2ab0f-a220-4d82-9fa4-1ca555cfc8f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a2ab0f-a220-4d82-9fa4-1ca555cfc8f3
Content-Type: application/json

--- response: 401 in 354 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94a2ab0f-a220-4d82-9fa4-1ca555cfc8f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-94a2ab0f-a220-4d82-9fa4-1ca555cfc8f3"}
```
