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
| 1 | `GET /v1/accounts/me` | 401 | 9 | `qa-f7025952-afe8-4c37-9338-81f35955ecf6` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7025952-afe8-4c37-9338-81f35955ecf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7025952-afe8-4c37-9338-81f35955ecf6
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7025952-afe8-4c37-9338-81f35955ecf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-f7025952-afe8-4c37-9338-81f35955ecf6"}
```
