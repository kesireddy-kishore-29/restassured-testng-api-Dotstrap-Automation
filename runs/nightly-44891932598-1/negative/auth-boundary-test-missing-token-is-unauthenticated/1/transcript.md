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
| 1 | `GET /v1/accounts/me` | 401 | 359 | `qa-8e4c32f5-cfbf-4542-87cc-2f8ecdd5b833` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e4c32f5-cfbf-4542-87cc-2f8ecdd5b833

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4c32f5-cfbf-4542-87cc-2f8ecdd5b833
Content-Type: application/json

--- response: 401 in 359 ms ---
Date: Sat, 21 Nov 2026 09:56:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e4c32f5-cfbf-4542-87cc-2f8ecdd5b833
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-8e4c32f5-cfbf-4542-87cc-2f8ecdd5b833"}
```
