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
| 1 | `GET /v1/accounts/me` | 401 | 516 | `qa-109c8625-896b-4c5a-9633-fd90f050ce5a` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-109c8625-896b-4c5a-9633-fd90f050ce5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-109c8625-896b-4c5a-9633-fd90f050ce5a
Content-Type: application/json

--- response: 401 in 516 ms ---
Date: Fri, 30 Oct 2026 08:46:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-109c8625-896b-4c5a-9633-fd90f050ce5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-109c8625-896b-4c5a-9633-fd90f050ce5a"}
```
