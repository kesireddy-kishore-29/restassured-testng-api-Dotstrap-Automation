# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[9]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/conversations/{id}/read` | 401 | 38 | `qa-ed2cc103-e5a1-4ae9-87df-0be0530cf972` |

## 1. POST /v1/conversations/{id}/read

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/read
correlation: qa-ed2cc103-e5a1-4ae9-87df-0be0530cf972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2cc103-e5a1-4ae9-87df-0be0530cf972
Content-Type: application/json

--- response: 401 in 38 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed2cc103-e5a1-4ae9-87df-0be0530cf972
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 265

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/read","correlationId":"qa-ed2cc103-e5a1-4ae9-87df-0be0530cf972"}
```
