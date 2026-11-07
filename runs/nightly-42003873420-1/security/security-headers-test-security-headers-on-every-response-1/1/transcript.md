# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007af21c42e460@352fb86a]

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
| 1 | `GET /v1/accounts/me` | 401 | 509 | `qa-746fa691-a98d-430c-b708-87cdc9fadc7d` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-746fa691-a98d-430c-b708-87cdc9fadc7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-746fa691-a98d-430c-b708-87cdc9fadc7d
Content-Type: application/json

--- response: 401 in 509 ms ---
Date: Thu, 05 Nov 2026 09:37:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-746fa691-a98d-430c-b708-87cdc9fadc7d
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

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-746fa691-a98d-430c-b708-87cdc9fadc7d"}
```
