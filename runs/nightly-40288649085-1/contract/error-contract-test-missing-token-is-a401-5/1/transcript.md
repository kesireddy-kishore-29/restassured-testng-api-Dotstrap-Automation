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
| 1 | `GET /v1/conversations` | 401 | 24 | `qa-ff3bba34-ea78-464f-8895-0b6b192930d6` |

## 1. GET /v1/conversations

```text
#1 GET http://localhost:7070/v1/conversations
correlation: qa-ff3bba34-ea78-464f-8895-0b6b192930d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff3bba34-ea78-464f-8895-0b6b192930d6
Content-Type: application/json

--- response: 401 in 24 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff3bba34-ea78-464f-8895-0b6b192930d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-ff3bba34-ea78-464f-8895-0b6b192930d6"}
```
