# Transcript: Every response carries the security headers and no server banner [401 problem, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000076c6d843c318@57cf865f]

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
| 1 | `GET /v1/accounts/me` | 401 | 429 | `qa-6c8e5a08-49fd-4d6f-9d8a-ac9ecd240036` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c8e5a08-49fd-4d6f-9d8a-ac9ecd240036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c8e5a08-49fd-4d6f-9d8a-ac9ecd240036
Content-Type: application/json

--- response: 401 in 429 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c8e5a08-49fd-4d6f-9d8a-ac9ecd240036
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-6c8e5a08-49fd-4d6f-9d8a-ac9ecd240036"}
```
