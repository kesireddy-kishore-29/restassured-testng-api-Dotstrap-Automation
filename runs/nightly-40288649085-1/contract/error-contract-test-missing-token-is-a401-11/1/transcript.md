# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[11]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/credits/balance` | 401 | 19 | `qa-93636a3e-9d2d-420d-976a-03edb48ab2e8` |

## 1. GET /v1/credits/balance

```text
#1 GET http://localhost:7070/v1/credits/balance
correlation: qa-93636a3e-9d2d-420d-976a-03edb48ab2e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93636a3e-9d2d-420d-976a-03edb48ab2e8
Content-Type: application/json

--- response: 401 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93636a3e-9d2d-420d-976a-03edb48ab2e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 254

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/balance","correlationId":"qa-93636a3e-9d2d-420d-976a-03edb48ab2e8"}
```
