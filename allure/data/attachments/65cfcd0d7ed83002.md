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
| 1 | `GET /v1/conversations` | 401 | 29 | `qa-f86a15eb-0567-4d8d-8c80-8c39c341bbe8` |

## 1. GET /v1/conversations

```text
#1 GET http://localhost:7070/v1/conversations
correlation: qa-f86a15eb-0567-4d8d-8c80-8c39c341bbe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f86a15eb-0567-4d8d-8c80-8c39c341bbe8
Content-Type: application/json

--- response: 401 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f86a15eb-0567-4d8d-8c80-8c39c341bbe8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-f86a15eb-0567-4d8d-8c80-8c39c341bbe8"}
```
