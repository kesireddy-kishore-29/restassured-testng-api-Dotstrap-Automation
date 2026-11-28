# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007f91dc43a828@48e610f2]

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
| 1 | `GET /v1/accounts/me` | 401 | 350 | `qa-baeb0f73-c825-47ba-857d-dad6ff341d6e` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-baeb0f73-c825-47ba-857d-dad6ff341d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baeb0f73-c825-47ba-857d-dad6ff341d6e
Content-Type: application/json

--- response: 401 in 350 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-baeb0f73-c825-47ba-857d-dad6ff341d6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-baeb0f73-c825-47ba-857d-dad6ff341d6e"}
```
