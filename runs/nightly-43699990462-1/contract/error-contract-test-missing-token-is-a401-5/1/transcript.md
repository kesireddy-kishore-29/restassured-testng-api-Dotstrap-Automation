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
| 1 | `GET /v1/conversations` | 401 | 22 | `qa-58359a34-23e6-4a61-9c23-3a36b3eed76c` |

## 1. GET /v1/conversations

```text
#1 GET http://localhost:7070/v1/conversations
correlation: qa-58359a34-23e6-4a61-9c23-3a36b3eed76c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58359a34-23e6-4a61-9c23-3a36b3eed76c
Content-Type: application/json

--- response: 401 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58359a34-23e6-4a61-9c23-3a36b3eed76c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-58359a34-23e6-4a61-9c23-3a36b3eed76c"}
```
