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
| 1 | `GET /v1/credits/ledger` | 401 | 16 | `qa-3ca982f6-f497-4469-aaa5-32d45f48419a` |

## 1. GET /v1/credits/ledger

```text
#1 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3ca982f6-f497-4469-aaa5-32d45f48419a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca982f6-f497-4469-aaa5-32d45f48419a
Content-Type: application/json

--- response: 401 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ca982f6-f497-4469-aaa5-32d45f48419a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 253

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/ledger","correlationId":"qa-3ca982f6-f497-4469-aaa5-32d45f48419a"}
```
