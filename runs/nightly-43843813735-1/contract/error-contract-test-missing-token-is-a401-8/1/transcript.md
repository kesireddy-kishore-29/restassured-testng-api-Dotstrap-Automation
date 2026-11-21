# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[8]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/conversations/{id}/messages` | 401 | 14 | `qa-d6fa3f3b-771a-4859-b271-d92575062e5c` |

## 1. POST /v1/conversations/{id}/messages

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/messages
correlation: qa-d6fa3f3b-771a-4859-b271-d92575062e5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6fa3f3b-771a-4859-b271-d92575062e5c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 401 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6fa3f3b-771a-4859-b271-d92575062e5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 269

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/messages","correlationId":"qa-d6fa3f3b-771a-4859-b271-d92575062e5c"}
```
