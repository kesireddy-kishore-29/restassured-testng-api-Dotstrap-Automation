# Transcript: Every protected operation answers a missing token with a 401 problem [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `PATCH /v1/accounts/me` | 401 | 12 | `qa-63b65ca0-dbdb-45d9-9808-890c8a86a6c4` |

## 1. PATCH /v1/accounts/me

```text
#1 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-63b65ca0-dbdb-45d9-9808-890c8a86a6c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b65ca0-dbdb-45d9-9808-890c8a86a6c4
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 401 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63b65ca0-dbdb-45d9-9808-890c8a86a6c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-63b65ca0-dbdb-45d9-9808-890c8a86a6c4"}
```
