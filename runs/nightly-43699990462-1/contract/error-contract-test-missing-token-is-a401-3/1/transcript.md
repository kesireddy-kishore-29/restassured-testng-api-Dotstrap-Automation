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
| 1 | `GET /v1/accounts/{handle}` | 401 | 29 | `qa-9b7121b8-9c53-4913-8632-a9cbd89f8a3b` |

## 1. GET /v1/accounts/{handle}

```text
#1 GET http://localhost:7070/v1/accounts/qa-anyone
correlation: qa-9b7121b8-9c53-4913-8632-a9cbd89f8a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b7121b8-9c53-4913-8632-a9cbd89f8a3b
Content-Type: application/json

--- response: 401 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b7121b8-9c53-4913-8632-a9cbd89f8a3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 257

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/qa-anyone","correlationId":"qa-9b7121b8-9c53-4913-8632-a9cbd89f8a3b"}
```
