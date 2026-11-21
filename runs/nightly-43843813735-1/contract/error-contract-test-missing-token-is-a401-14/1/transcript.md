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
| 1 | `GET /v1/admin/stats` | 401 | 14 | `qa-41aa597f-bd91-4c3a-9f91-20600dbd55cb` |

## 1. GET /v1/admin/stats

```text
#1 GET http://localhost:7070/v1/admin/stats
correlation: qa-41aa597f-bd91-4c3a-9f91-20600dbd55cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41aa597f-bd91-4c3a-9f91-20600dbd55cb
Content-Type: application/json

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41aa597f-bd91-4c3a-9f91-20600dbd55cb
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
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/admin/stats","correlationId":"qa-41aa597f-bd91-4c3a-9f91-20600dbd55cb"}
```
