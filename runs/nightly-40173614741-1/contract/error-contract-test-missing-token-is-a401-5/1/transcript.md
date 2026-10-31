# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[5]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/conversations` | 401 | 35 | `qa-df9c188b-e99a-4699-bc1b-913753efea0f` |

## 1. GET /v1/conversations

```text
#1 GET http://localhost:7070/v1/conversations
correlation: qa-df9c188b-e99a-4699-bc1b-913753efea0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df9c188b-e99a-4699-bc1b-913753efea0f
Content-Type: application/json

--- response: 401 in 35 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df9c188b-e99a-4699-bc1b-913753efea0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-df9c188b-e99a-4699-bc1b-913753efea0f"}
```
