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
| 1 | `GET /v1/accounts/{handle}` | 401 | 423 | `qa-bf52a32a-95c0-45e8-9568-c4d9f159ec74` |

## 1. GET /v1/accounts/{handle}

```text
#1 GET http://localhost:7070/v1/accounts/qa-anyone
correlation: qa-bf52a32a-95c0-45e8-9568-c4d9f159ec74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf52a32a-95c0-45e8-9568-c4d9f159ec74
Content-Type: application/json

--- response: 401 in 423 ms ---
Date: Wed, 04 Nov 2026 09:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf52a32a-95c0-45e8-9568-c4d9f159ec74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 257

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/qa-anyone","correlationId":"qa-bf52a32a-95c0-45e8-9568-c4d9f159ec74"}
```
