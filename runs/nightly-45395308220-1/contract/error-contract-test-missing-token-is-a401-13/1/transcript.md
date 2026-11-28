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
| 1 | `POST /v1/credits/purchases` | 401 | 14 | `qa-807bf7ac-c88a-4eca-bcd6-d1c9af3c6194` |

## 1. POST /v1/credits/purchases

```text
#1 POST http://localhost:7070/v1/credits/purchases
correlation: qa-807bf7ac-c88a-4eca-bcd6-d1c9af3c6194

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e9926e49b1bf423b8c63ac0b9e898fdd
X-Correlation-Id: qa-807bf7ac-c88a-4eca-bcd6-d1c9af3c6194
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 401 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-807bf7ac-c88a-4eca-bcd6-d1c9af3c6194
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 256

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/purchases","correlationId":"qa-807bf7ac-c88a-4eca-bcd6-d1c9af3c6194"}
```
