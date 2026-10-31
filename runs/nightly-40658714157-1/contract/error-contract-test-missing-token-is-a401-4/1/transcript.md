# Transcript: Every protected operation answers a missing token with a 401 problem [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#missingTokenIsA401[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/conversations` | 401 | 23 | `qa-b7d39b37-e7fb-4518-92ad-bf26b4e900fd` |

## 1. POST /v1/conversations

```text
#1 POST http://localhost:7070/v1/conversations
correlation: qa-b7d39b37-e7fb-4518-92ad-bf26b4e900fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7d39b37-e7fb-4518-92ad-bf26b4e900fd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-anyone","subject":"Probe","message":"Hi"}

--- response: 401 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7d39b37-e7fb-4518-92ad-bf26b4e900fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
WWW-Authenticate: Bearer
Content-Length: 252

{"type":"https://reference-service.example/problems/unauthenticated","title":"Authentication required","status":401,"detail":"Send Authorization: Bearer <token>.","instance":"/v1/conversations","correlationId":"qa-b7d39b37-e7fb-4518-92ad-bf26b4e900fd"}
```
