# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x0000747658439ff8@5a7aac01]

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
| 1 | `GET /v1/accounts/me` | 401 | 391 | `qa-008f52aa-ce07-47b3-ae90-0a29c06f2648` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-008f52aa-ce07-47b3-ae90-0a29c06f2648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-008f52aa-ce07-47b3-ae90-0a29c06f2648
Content-Type: application/json

--- response: 401 in 391 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-008f52aa-ce07-47b3-ae90-0a29c06f2648
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-008f52aa-ce07-47b3-ae90-0a29c06f2648"}
```
