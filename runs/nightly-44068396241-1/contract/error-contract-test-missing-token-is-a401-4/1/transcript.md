# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/conversations` | 401 | 15 | `qa-fa515268-600a-4762-84c1-7e12a3b097ef` |

## 1. POST /v1/conversations

```text
#1 POST http://localhost:7070/v1/conversations
correlation: qa-fa515268-600a-4762-84c1-7e12a3b097ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa515268-600a-4762-84c1-7e12a3b097ef
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-anyone","subject":"Probe","message":"Hi"}

--- response: 401 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa515268-600a-4762-84c1-7e12a3b097ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-fa515268-600a-4762-84c1-7e12a3b097ef"}
```
