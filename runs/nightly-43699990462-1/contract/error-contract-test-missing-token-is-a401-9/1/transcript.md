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
| 1 | `POST /v1/conversations/{id}/read` | 401 | 11 | `qa-75e83d87-7771-4424-befd-b3f06e6e91d9` |

## 1. POST /v1/conversations/{id}/read

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/read
correlation: qa-75e83d87-7771-4424-befd-b3f06e6e91d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75e83d87-7771-4424-befd-b3f06e6e91d9
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75e83d87-7771-4424-befd-b3f06e6e91d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 265

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/read","correlationId":"qa-75e83d87-7771-4424-befd-b3f06e6e91d9"}
```
