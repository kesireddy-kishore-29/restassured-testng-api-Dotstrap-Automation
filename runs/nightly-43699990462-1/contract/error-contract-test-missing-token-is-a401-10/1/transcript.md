# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[10]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/conversations/{id}/close` | 401 | 17 | `qa-24648340-9d61-4afd-866b-9d1341d51f61` |

## 1. POST /v1/conversations/{id}/close

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/close
correlation: qa-24648340-9d61-4afd-866b-9d1341d51f61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24648340-9d61-4afd-866b-9d1341d51f61
Content-Type: application/json

--- response: 401 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24648340-9d61-4afd-866b-9d1341d51f61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 266

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/close","correlationId":"qa-24648340-9d61-4afd-866b-9d1341d51f61"}
```
