# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[5]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/conversations` | 401 | 12 | `qa-7c61fb00-abe4-4a76-8b4b-701ae4a7f373` |

## 1. GET /v1/conversations

```text
#1 GET http://localhost:7070/v1/conversations
correlation: qa-7c61fb00-abe4-4a76-8b4b-701ae4a7f373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c61fb00-abe4-4a76-8b4b-701ae4a7f373
Content-Type: application/json

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c61fb00-abe4-4a76-8b4b-701ae4a7f373
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-7c61fb00-abe4-4a76-8b4b-701ae4a7f373"}
```
