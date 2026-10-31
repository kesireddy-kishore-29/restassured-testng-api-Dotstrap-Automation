# Transcript: Every protected operation answers a missing token with a 401 problem [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `DELETE /v1/accounts/me` | 401 | 15 | `qa-bd8a2f91-a12f-49a7-bccc-114b3522667c` |

## 1. DELETE /v1/accounts/me

```text
#1 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd8a2f91-a12f-49a7-bccc-114b3522667c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd8a2f91-a12f-49a7-bccc-114b3522667c
Content-Type: application/json

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd8a2f91-a12f-49a7-bccc-114b3522667c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-bd8a2f91-a12f-49a7-bccc-114b3522667c"}
```
