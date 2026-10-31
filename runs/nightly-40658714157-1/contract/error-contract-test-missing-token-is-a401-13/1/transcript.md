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
| 1 | `POST /v1/credits/purchases` | 401 | 9 | `qa-ef95358b-e7e7-45ea-b157-f55f2afc1bb6` |

## 1. POST /v1/credits/purchases

```text
#1 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ef95358b-e7e7-45ea-b157-f55f2afc1bb6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-eaa1eaf774254389919bd8eb8ad84433
X-Correlation-Id: qa-ef95358b-e7e7-45ea-b157-f55f2afc1bb6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef95358b-e7e7-45ea-b157-f55f2afc1bb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 256

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/purchases","correlationId":"qa-ef95358b-e7e7-45ea-b157-f55f2afc1bb6"}
```
