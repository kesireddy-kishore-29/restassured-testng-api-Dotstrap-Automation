# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[7]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/conversations/{id}/messages` | 401 | 23 | `qa-d1b20d5c-52ef-4ea0-94f2-b818f4ca3901` |

## 1. GET /v1/conversations/{id}/messages

```text
#1 GET http://localhost:7070/v1/conversations/cnv_any/messages
correlation: qa-d1b20d5c-52ef-4ea0-94f2-b818f4ca3901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1b20d5c-52ef-4ea0-94f2-b818f4ca3901
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1b20d5c-52ef-4ea0-94f2-b818f4ca3901
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 269

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/messages","correlationId":"qa-d1b20d5c-52ef-4ea0-94f2-b818f4ca3901"}
```
