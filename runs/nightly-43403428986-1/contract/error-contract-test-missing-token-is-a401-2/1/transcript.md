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
| 1 | `DELETE /v1/accounts/me` | 401 | 21 | `qa-d94cd485-d5c1-4402-ab8f-6ff822b8b572` |

## 1. DELETE /v1/accounts/me

```text
#1 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d94cd485-d5c1-4402-ab8f-6ff822b8b572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d94cd485-d5c1-4402-ab8f-6ff822b8b572
Content-Type: application/json

--- response: 401 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d94cd485-d5c1-4402-ab8f-6ff822b8b572
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-d94cd485-d5c1-4402-ab8f-6ff822b8b572"}
```
