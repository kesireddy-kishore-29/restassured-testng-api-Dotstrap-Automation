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
| 1 | `GET /v1/conversations` | 401 | 15 | `qa-84117519-9b36-4b60-8c36-845846b60593` |

## 1. GET /v1/conversations

```text
#1 GET http://localhost:7070/v1/conversations
correlation: qa-84117519-9b36-4b60-8c36-845846b60593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84117519-9b36-4b60-8c36-845846b60593
Content-Type: application/json

--- response: 401 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84117519-9b36-4b60-8c36-845846b60593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-84117519-9b36-4b60-8c36-845846b60593"}
```
