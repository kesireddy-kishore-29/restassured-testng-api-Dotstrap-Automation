# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007bed0043e0b0@26b87615]

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
| 1 | `GET /v1/accounts/me` | 401 | 388 | `qa-660d53c4-f996-42c0-8e68-9a3c584554e9` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-660d53c4-f996-42c0-8e68-9a3c584554e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-660d53c4-f996-42c0-8e68-9a3c584554e9
Content-Type: application/json

--- response: 401 in 388 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-660d53c4-f996-42c0-8e68-9a3c584554e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-660d53c4-f996-42c0-8e68-9a3c584554e9"}
```
