# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/me` | 401 | 30 | `qa-b3f86adb-cbf4-4997-b3db-821a3152061f` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3f86adb-cbf4-4997-b3db-821a3152061f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3f86adb-cbf4-4997-b3db-821a3152061f
Content-Type: application/json

--- response: 401 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3f86adb-cbf4-4997-b3db-821a3152061f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-b3f86adb-cbf4-4997-b3db-821a3152061f"}
```
