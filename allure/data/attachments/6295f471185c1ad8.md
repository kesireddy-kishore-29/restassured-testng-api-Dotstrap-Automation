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
| 1 | `GET /v1/accounts/me` | 401 | 6 | `qa-14513d69-2390-4ea6-9f13-e4f46c06ca24` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-14513d69-2390-4ea6-9f13-e4f46c06ca24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14513d69-2390-4ea6-9f13-e4f46c06ca24
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14513d69-2390-4ea6-9f13-e4f46c06ca24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-14513d69-2390-4ea6-9f13-e4f46c06ca24"}
```
