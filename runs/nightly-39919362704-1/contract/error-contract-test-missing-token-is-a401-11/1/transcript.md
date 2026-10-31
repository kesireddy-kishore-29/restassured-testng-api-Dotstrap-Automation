# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[11]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/credits/balance` | 401 | 58 | `qa-14b3d0f8-6a7a-456b-bca2-0d87094ea4ab` |

## 1. GET /v1/credits/balance

```text
#1 GET http://localhost:7070/v1/credits/balance
correlation: qa-14b3d0f8-6a7a-456b-bca2-0d87094ea4ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14b3d0f8-6a7a-456b-bca2-0d87094ea4ab
Content-Type: application/json

--- response: 401 in 58 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14b3d0f8-6a7a-456b-bca2-0d87094ea4ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 254

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/balance","correlationId":"qa-14b3d0f8-6a7a-456b-bca2-0d87094ea4ab"}
```
