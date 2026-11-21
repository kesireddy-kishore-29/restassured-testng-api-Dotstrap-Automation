# Transcript: Every protected operation answers a missing token with a 401 problem [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `PATCH /v1/accounts/me` | 401 | 42 | `qa-3adcc5de-d646-4134-8292-fd9e561311a7` |

## 1. PATCH /v1/accounts/me

```text
#1 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-3adcc5de-d646-4134-8292-fd9e561311a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3adcc5de-d646-4134-8292-fd9e561311a7
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 401 in 42 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3adcc5de-d646-4134-8292-fd9e561311a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 250

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/accounts/me","correlationId":"qa-3adcc5de-d646-4134-8292-fd9e561311a7"}
```
