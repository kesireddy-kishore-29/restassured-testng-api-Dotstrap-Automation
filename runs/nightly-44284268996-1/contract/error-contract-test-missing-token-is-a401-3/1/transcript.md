# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/{handle}` | 401 | 29 | `qa-18b1be75-94dd-490a-b3ae-0443c15b5ee3` |

## 1. GET /v1/accounts/{handle}

```text
#1 GET http://localhost:7070/v1/accounts/qa-anyone
correlation: qa-18b1be75-94dd-490a-b3ae-0443c15b5ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b1be75-94dd-490a-b3ae-0443c15b5ee3
Content-Type: application/json

--- response: 401 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18b1be75-94dd-490a-b3ae-0443c15b5ee3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 257

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/qa-anyone","correlationId":"qa-18b1be75-94dd-490a-b3ae-0443c15b5ee3"}
```
