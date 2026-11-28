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
| 1 | `DELETE /v1/accounts/me` | 401 | 23 | `qa-6fddb8d9-677a-4f63-a0c5-a04a292d2867` |

## 1. DELETE /v1/accounts/me

```text
#1 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fddb8d9-677a-4f63-a0c5-a04a292d2867

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fddb8d9-677a-4f63-a0c5-a04a292d2867
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fddb8d9-677a-4f63-a0c5-a04a292d2867
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-6fddb8d9-677a-4f63-a0c5-a04a292d2867"}
```
