# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007dc33843cd88@22fbb368]

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
| 1 | `GET /v1/accounts/me` | 401 | 267 | `qa-bfb686a1-7093-45b0-bdef-70d6a0b627bd` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfb686a1-7093-45b0-bdef-70d6a0b627bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfb686a1-7093-45b0-bdef-70d6a0b627bd
Content-Type: application/json

--- response: 401 in 267 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfb686a1-7093-45b0-bdef-70d6a0b627bd
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

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-bfb686a1-7093-45b0-bdef-70d6a0b627bd"}
```
