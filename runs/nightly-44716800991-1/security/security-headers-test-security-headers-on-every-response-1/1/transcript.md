# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007795dc43cf60@41159538]

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
| 1 | `GET /v1/accounts/me` | 401 | 291 | `qa-d3ecfbad-b518-49f3-ae9a-d0c7be7d8caf` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3ecfbad-b518-49f3-ae9a-d0c7be7d8caf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ecfbad-b518-49f3-ae9a-d0c7be7d8caf
Content-Type: application/json

--- response: 401 in 291 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d3ecfbad-b518-49f3-ae9a-d0c7be7d8caf
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

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-d3ecfbad-b518-49f3-ae9a-d0c7be7d8caf"}
```
