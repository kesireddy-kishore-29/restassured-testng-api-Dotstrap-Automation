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
| 1 | `GET /v1/credits/balance` | 401 | 23 | `qa-4f3d1edb-ecc1-4b42-8bb9-4beab0b9f230` |

## 1. GET /v1/credits/balance

```text
#1 GET http://localhost:7070/v1/credits/balance
correlation: qa-4f3d1edb-ecc1-4b42-8bb9-4beab0b9f230

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f3d1edb-ecc1-4b42-8bb9-4beab0b9f230
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f3d1edb-ecc1-4b42-8bb9-4beab0b9f230
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 254

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/balance","correlationId":"qa-4f3d1edb-ecc1-4b42-8bb9-4beab0b9f230"}
```
