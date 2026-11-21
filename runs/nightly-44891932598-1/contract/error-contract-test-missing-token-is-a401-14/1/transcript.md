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
| 1 | `GET /v1/admin/stats` | 401 | 40 | `qa-e69486a6-223a-4f13-9b12-98cf8c4a1617` |

## 1. GET /v1/admin/stats

```text
#1 GET http://localhost:7070/v1/admin/stats
correlation: qa-e69486a6-223a-4f13-9b12-98cf8c4a1617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e69486a6-223a-4f13-9b12-98cf8c4a1617
Content-Type: application/json

--- response: 401 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e69486a6-223a-4f13-9b12-98cf8c4a1617
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 7
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/admin/stats","correlationId":"qa-e69486a6-223a-4f13-9b12-98cf8c4a1617"}
```
