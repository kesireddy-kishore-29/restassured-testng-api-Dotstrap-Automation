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
| 1 | `GET /v1/conversations/{id}` | 401 | 23 | `qa-72b1de0c-9841-4751-ba95-c49e87e2fffc` |

## 1. GET /v1/conversations/{id}

```text
#1 GET http://localhost:7070/v1/conversations/cnv_any
correlation: qa-72b1de0c-9841-4751-ba95-c49e87e2fffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72b1de0c-9841-4751-ba95-c49e87e2fffc
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72b1de0c-9841-4751-ba95-c49e87e2fffc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 260

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any","correlationId":"qa-72b1de0c-9841-4751-ba95-c49e87e2fffc"}
```
