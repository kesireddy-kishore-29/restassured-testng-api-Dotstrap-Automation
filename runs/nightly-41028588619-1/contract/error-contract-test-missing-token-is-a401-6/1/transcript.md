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
| 1 | `GET /v1/conversations/{id}` | 401 | 34 | `qa-ea7a2adb-5fd2-453f-b81d-2bef63daa63b` |

## 1. GET /v1/conversations/{id}

```text
#1 GET http://localhost:7070/v1/conversations/cnv_any
correlation: qa-ea7a2adb-5fd2-453f-b81d-2bef63daa63b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea7a2adb-5fd2-453f-b81d-2bef63daa63b
Content-Type: application/json

--- response: 401 in 34 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea7a2adb-5fd2-453f-b81d-2bef63daa63b
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
Content-Length: 260

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations/cnv_any","correlationId":"qa-ea7a2adb-5fd2-453f-b81d-2bef63daa63b"}
```
