# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007c8a2c43b268@33120864]

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
| 1 | `GET /v1/accounts/me` | 401 | 422 | `qa-b4cbaad7-605d-4f91-81d7-eca6ea56a9a9` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4cbaad7-605d-4f91-81d7-eca6ea56a9a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4cbaad7-605d-4f91-81d7-eca6ea56a9a9
Content-Type: application/json

--- response: 401 in 422 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4cbaad7-605d-4f91-81d7-eca6ea56a9a9
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

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-b4cbaad7-605d-4f91-81d7-eca6ea56a9a9"}
```
