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
| 1 | `DELETE /v1/accounts/me` | 401 | 379 | `qa-5cc7cd37-42b0-4d0c-8d2c-8543a670dc53` |

## 1. DELETE /v1/accounts/me

```text
#1 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5cc7cd37-42b0-4d0c-8d2c-8543a670dc53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cc7cd37-42b0-4d0c-8d2c-8543a670dc53
Content-Type: application/json

--- response: 401 in 379 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cc7cd37-42b0-4d0c-8d2c-8543a670dc53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-5cc7cd37-42b0-4d0c-8d2c-8543a670dc53"}
```
