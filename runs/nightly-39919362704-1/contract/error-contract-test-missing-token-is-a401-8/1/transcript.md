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
| 1 | `POST /v1/conversations/{id}/messages` | 401 | 35 | `qa-f643f743-6ff3-4a48-bcac-4b73e3460a09` |

## 1. POST /v1/conversations/{id}/messages

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/messages
correlation: qa-f643f743-6ff3-4a48-bcac-4b73e3460a09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f643f743-6ff3-4a48-bcac-4b73e3460a09
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 401 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f643f743-6ff3-4a48-bcac-4b73e3460a09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 269

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/messages","correlationId":"qa-f643f743-6ff3-4a48-bcac-4b73e3460a09"}
```
