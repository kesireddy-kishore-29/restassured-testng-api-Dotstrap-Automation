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
| 1 | `GET /v1/conversations/{id}/messages` | 401 | 48 | `qa-ebca7c5a-f598-4cd8-b383-59544b4b67cd` |

## 1. GET /v1/conversations/{id}/messages

```text
#1 GET http://localhost:7070/v1/conversations/cnv_any/messages
correlation: qa-ebca7c5a-f598-4cd8-b383-59544b4b67cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebca7c5a-f598-4cd8-b383-59544b4b67cd
Content-Type: application/json

--- response: 401 in 48 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebca7c5a-f598-4cd8-b383-59544b4b67cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 269

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/messages","correlationId":"qa-ebca7c5a-f598-4cd8-b383-59544b4b67cd"}
```
