# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[13]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/credits/purchases` | 401 | 14 | `qa-77c50e58-8756-4fda-a3cc-b28b1aa6a440` |

## 1. POST /v1/credits/purchases

```text
#1 POST http://localhost:7070/v1/credits/purchases
correlation: qa-77c50e58-8756-4fda-a3cc-b28b1aa6a440

--- request headers ---
Accept: application/json
Idempotency-Key: qa-96b9ff9214574a0bba4324e462819b05
X-Correlation-Id: qa-77c50e58-8756-4fda-a3cc-b28b1aa6a440
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77c50e58-8756-4fda-a3cc-b28b1aa6a440
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 256

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/purchases","correlationId":"qa-77c50e58-8756-4fda-a3cc-b28b1aa6a440"}
```
