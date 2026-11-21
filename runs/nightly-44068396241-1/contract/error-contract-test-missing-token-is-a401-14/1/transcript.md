# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[14]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/admin/stats` | 401 | 15 | `qa-d0537feb-ab7e-4e51-ba07-b7f173185a6f` |

## 1. GET /v1/admin/stats

```text
#1 GET http://localhost:7070/v1/admin/stats
correlation: qa-d0537feb-ab7e-4e51-ba07-b7f173185a6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0537feb-ab7e-4e51-ba07-b7f173185a6f
Content-Type: application/json

--- response: 401 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0537feb-ab7e-4e51-ba07-b7f173185a6f
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
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/admin/stats","correlationId":"qa-d0537feb-ab7e-4e51-ba07-b7f173185a6f"}
```
