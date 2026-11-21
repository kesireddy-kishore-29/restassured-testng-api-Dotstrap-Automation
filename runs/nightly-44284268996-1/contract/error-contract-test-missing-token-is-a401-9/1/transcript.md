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
| 1 | `POST /v1/conversations/{id}/read` | 401 | 22 | `qa-0e5cc2ba-0a42-465b-bc78-0e2b500fa593` |

## 1. POST /v1/conversations/{id}/read

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/read
correlation: qa-0e5cc2ba-0a42-465b-bc78-0e2b500fa593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e5cc2ba-0a42-465b-bc78-0e2b500fa593
Content-Type: application/json

--- response: 401 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e5cc2ba-0a42-465b-bc78-0e2b500fa593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 265

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/read","correlationId":"qa-0e5cc2ba-0a42-465b-bc78-0e2b500fa593"}
```
