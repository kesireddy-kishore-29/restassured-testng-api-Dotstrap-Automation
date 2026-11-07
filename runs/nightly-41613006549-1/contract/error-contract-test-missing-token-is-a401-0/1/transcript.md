# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/me` | 401 | 376 | `qa-443b43b7-1600-4cc7-b693-1ced16e1c780` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-443b43b7-1600-4cc7-b693-1ced16e1c780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-443b43b7-1600-4cc7-b693-1ced16e1c780
Content-Type: application/json

--- response: 401 in 376 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-443b43b7-1600-4cc7-b693-1ced16e1c780
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-443b43b7-1600-4cc7-b693-1ced16e1c780"}
```
