# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[10]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/conversations/{id}/close` | 401 | 38 | `qa-6ae393f2-6220-4b19-b9d6-29cf480f8940` |

## 1. POST /v1/conversations/{id}/close

```text
#1 POST http://localhost:7070/v1/conversations/cnv_any/close
correlation: qa-6ae393f2-6220-4b19-b9d6-29cf480f8940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ae393f2-6220-4b19-b9d6-29cf480f8940
Content-Type: application/json

--- response: 401 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ae393f2-6220-4b19-b9d6-29cf480f8940
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
WWW-Authenticate: Bearer
Content-Length: 266

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any/close","correlationId":"qa-6ae393f2-6220-4b19-b9d6-29cf480f8940"}
```
