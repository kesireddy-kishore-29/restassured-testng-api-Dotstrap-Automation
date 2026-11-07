# Transcript: Every protected operation answers a missing token with a 401 problem [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[11]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/credits/balance` | 401 | 17 | `qa-da736f70-559b-422f-a26e-488f6c324c61` |

## 1. GET /v1/credits/balance

```text
#1 GET http://localhost:7070/v1/credits/balance
correlation: qa-da736f70-559b-422f-a26e-488f6c324c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da736f70-559b-422f-a26e-488f6c324c61
Content-Type: application/json

--- response: 401 in 17 ms ---
Date: Wed, 04 Nov 2026 09:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da736f70-559b-422f-a26e-488f6c324c61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 254

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/credits/balance","correlationId":"qa-da736f70-559b-422f-a26e-488f6c324c61"}
```
