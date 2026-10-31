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
| 1 | `DELETE /v1/accounts/me` | 401 | 17 | `qa-0c1ed08c-5a52-4ff6-af4f-50356f97c433` |

## 1. DELETE /v1/accounts/me

```text
#1 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c1ed08c-5a52-4ff6-af4f-50356f97c433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c1ed08c-5a52-4ff6-af4f-50356f97c433
Content-Type: application/json

--- response: 401 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c1ed08c-5a52-4ff6-af4f-50356f97c433
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-0c1ed08c-5a52-4ff6-af4f-50356f97c433"}
```
