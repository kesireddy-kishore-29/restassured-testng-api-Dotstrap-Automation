# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007e9e9c42a790@e6b0dcf]

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
| 1 | `GET /v1/accounts/me` | 401 | 431 | `qa-85762135-c3a8-4583-b7f3-16555229de6c` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-85762135-c3a8-4583-b7f3-16555229de6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85762135-c3a8-4583-b7f3-16555229de6c
Content-Type: application/json

--- response: 401 in 431 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85762135-c3a8-4583-b7f3-16555229de6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-85762135-c3a8-4583-b7f3-16555229de6c"}
```
