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
| 1 | `GET /v1/admin/stats` | 401 | 42 | `qa-fa39076c-feae-4ac5-9165-3e4442155d8d` |

## 1. GET /v1/admin/stats

```text
#1 GET http://localhost:7070/v1/admin/stats
correlation: qa-fa39076c-feae-4ac5-9165-3e4442155d8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa39076c-feae-4ac5-9165-3e4442155d8d
Content-Type: application/json

--- response: 401 in 42 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa39076c-feae-4ac5-9165-3e4442155d8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/admin/stats","correlationId":"qa-fa39076c-feae-4ac5-9165-3e4442155d8d"}
```
