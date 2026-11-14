# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/{handle}` | 401 | 21 | `qa-3d0ea8e9-a3ef-40bc-b6bb-7acc8a151234` |

## 1. GET /v1/accounts/{handle}

```text
#1 GET http://localhost:7070/v1/accounts/qa-anyone
correlation: qa-3d0ea8e9-a3ef-40bc-b6bb-7acc8a151234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d0ea8e9-a3ef-40bc-b6bb-7acc8a151234
Content-Type: application/json

--- response: 401 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d0ea8e9-a3ef-40bc-b6bb-7acc8a151234
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 257

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/qa-anyone","correlationId":"qa-3d0ea8e9-a3ef-40bc-b6bb-7acc8a151234"}
```
