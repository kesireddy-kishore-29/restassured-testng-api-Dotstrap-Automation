# Transcript: Every protected operation answers a missing token with a 401 problem [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `DELETE /v1/accounts/me` | 401 | 23 | `qa-4732a71d-1e01-45f6-9df4-2e189f93cc0d` |

## 1. DELETE /v1/accounts/me

```text
#1 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4732a71d-1e01-45f6-9df4-2e189f93cc0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4732a71d-1e01-45f6-9df4-2e189f93cc0d
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4732a71d-1e01-45f6-9df4-2e189f93cc0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-4732a71d-1e01-45f6-9df4-2e189f93cc0d"}
```
