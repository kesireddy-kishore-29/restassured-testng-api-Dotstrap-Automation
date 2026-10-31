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
| 1 | `GET /v1/admin/stats` | 401 | 11 | `qa-dfd90cfe-9e99-40bd-ac7e-e4364b31368b` |

## 1. GET /v1/admin/stats

```text
#1 GET http://localhost:7070/v1/admin/stats
correlation: qa-dfd90cfe-9e99-40bd-ac7e-e4364b31368b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfd90cfe-9e99-40bd-ac7e-e4364b31368b
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfd90cfe-9e99-40bd-ac7e-e4364b31368b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/admin/stats","correlationId":"qa-dfd90cfe-9e99-40bd-ac7e-e4364b31368b"}
```
