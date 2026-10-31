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
| 1 | `POST /v1/conversations/{id}/messages` | 401 | 13 | `qa-0add0965-cde9-46ea-9fac-4f2a6f4121e7` |

## 1. POST /v1/conversations/{id}/messages

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/messages
correlation: qa-0add0965-cde9-46ea-9fac-4f2a6f4121e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0add0965-cde9-46ea-9fac-4f2a6f4121e7
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0add0965-cde9-46ea-9fac-4f2a6f4121e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 269

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/messages","correlationId":"qa-0add0965-cde9-46ea-9fac-4f2a6f4121e7"}
```
