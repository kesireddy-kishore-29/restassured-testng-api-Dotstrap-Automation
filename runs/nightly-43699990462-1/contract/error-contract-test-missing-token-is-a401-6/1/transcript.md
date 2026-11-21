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
| 1 | `GET /v1/conversations/{id}` | 401 | 64 | `qa-3d6ee92a-56dc-4dc9-828c-0354412ba816` |

## 1. GET /v1/conversations/{id}

```text
#1 GET http://localhost:7070/v1/conversations/cnv_any
correlation: qa-3d6ee92a-56dc-4dc9-828c-0354412ba816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d6ee92a-56dc-4dc9-828c-0354412ba816
Content-Type: application/json

--- response: 401 in 64 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d6ee92a-56dc-4dc9-828c-0354412ba816
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 260

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any","correlationId":"qa-3d6ee92a-56dc-4dc9-828c-0354412ba816"}
```
