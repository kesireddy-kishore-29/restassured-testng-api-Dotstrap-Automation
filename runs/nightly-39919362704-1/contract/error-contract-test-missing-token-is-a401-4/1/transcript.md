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
| 1 | `POST /v1/conversations` | 401 | 17 | `qa-ae2afd8c-9b27-43b5-8cc3-917642beee3a` |

## 1. POST /v1/conversations

```text
#1 POST http://localhost:7070/v1/conversations
correlation: qa-ae2afd8c-9b27-43b5-8cc3-917642beee3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2afd8c-9b27-43b5-8cc3-917642beee3a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-anyone","subject":"Probe","message":"Hi"}

--- response: 401 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae2afd8c-9b27-43b5-8cc3-917642beee3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-ae2afd8c-9b27-43b5-8cc3-917642beee3a"}
```
