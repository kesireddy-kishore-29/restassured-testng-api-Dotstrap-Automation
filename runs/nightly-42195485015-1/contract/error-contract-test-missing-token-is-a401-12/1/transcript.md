# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[12]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/credits/ledger` | 401 | 27 | `qa-b70e5422-45f4-4bf1-bd26-b572bf900c47` |

## 1. GET /v1/credits/ledger

```text
#1 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b70e5422-45f4-4bf1-bd26-b572bf900c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b70e5422-45f4-4bf1-bd26-b572bf900c47
Content-Type: application/json

--- response: 401 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b70e5422-45f4-4bf1-bd26-b572bf900c47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 7
WWW-Authenticate: Bearer
Content-Length: 253

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/ledger","correlationId":"qa-b70e5422-45f4-4bf1-bd26-b572bf900c47"}
```
