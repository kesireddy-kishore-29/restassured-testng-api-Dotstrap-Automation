# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[6]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/conversations/{id}` | 401 | 23 | `qa-57cd1167-f1de-4588-9dc9-3a85b1cef9c2` |

## 1. GET /v1/conversations/{id}

```text
#1 GET http://localhost:7070/v1/conversations/cnv_any
correlation: qa-57cd1167-f1de-4588-9dc9-3a85b1cef9c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57cd1167-f1de-4588-9dc9-3a85b1cef9c2
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57cd1167-f1de-4588-9dc9-3a85b1cef9c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 260

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any","correlationId":"qa-57cd1167-f1de-4588-9dc9-3a85b1cef9c2"}
```
