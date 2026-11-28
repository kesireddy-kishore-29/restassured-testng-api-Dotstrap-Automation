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
| 1 | `GET /v1/accounts/{handle}` | 401 | 25 | `qa-25c0e06d-ad85-4b06-9320-e0a823dca5dd` |

## 1. GET /v1/accounts/{handle}

```text
#1 GET http://localhost:7070/v1/accounts/qa-anyone
correlation: qa-25c0e06d-ad85-4b06-9320-e0a823dca5dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c0e06d-ad85-4b06-9320-e0a823dca5dd
Content-Type: application/json

--- response: 401 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25c0e06d-ad85-4b06-9320-e0a823dca5dd
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/qa-anyone","correlationId":"qa-25c0e06d-ad85-4b06-9320-e0a823dca5dd"}
```
