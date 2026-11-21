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
| 1 | `POST /v1/credits/purchases` | 401 | 16 | `qa-edef989c-31b9-460a-8411-112a270f6432` |

## 1. POST /v1/credits/purchases

```text
#1 POST http://localhost:7070/v1/credits/purchases
correlation: qa-edef989c-31b9-460a-8411-112a270f6432

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ec76026b0d64468f89e15b66a0548098
X-Correlation-Id: qa-edef989c-31b9-460a-8411-112a270f6432
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edef989c-31b9-460a-8411-112a270f6432
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 256

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/purchases","correlationId":"qa-edef989c-31b9-460a-8411-112a270f6432"}
```
