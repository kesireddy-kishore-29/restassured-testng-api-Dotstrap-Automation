# Transcript: No token: 401 unauthenticated with a Bearer challenge

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#missingTokenIsUnauthenticated` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/me` | 401 | 23 | `qa-2dd840ea-6a29-4645-a8f2-2fcd292f38c3` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-2dd840ea-6a29-4645-a8f2-2fcd292f38c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dd840ea-6a29-4645-a8f2-2fcd292f38c3
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2dd840ea-6a29-4645-a8f2-2fcd292f38c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-2dd840ea-6a29-4645-a8f2-2fcd292f38c3"}
```
