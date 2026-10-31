# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000073adbc43df68@6729d94c]

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
| 1 | `GET /v1/accounts/me` | 401 | 419 | `qa-745f8551-8ac9-4eb1-84ef-5f2b9f949b0e` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-745f8551-8ac9-4eb1-84ef-5f2b9f949b0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745f8551-8ac9-4eb1-84ef-5f2b9f949b0e
Content-Type: application/json

--- response: 401 in 419 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-745f8551-8ac9-4eb1-84ef-5f2b9f949b0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-745f8551-8ac9-4eb1-84ef-5f2b9f949b0e"}
```
