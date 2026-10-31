# Transcript: A token the service never issued is refused [not-a-real-token-at-all, invalid-token]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#unknownTokenIsRefused[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/me` | 401 | 339 | `qa-ae3a7193-824c-4964-9524-3213e7e6e737` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae3a7193-824c-4964-9524-3213e7e6e737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae3a7193-824c-4964-9524-3213e7e6e737
Content-Type: application/json

--- response: 401 in 339 ms ---
Date: Thu, 29 Oct 2026 08:38:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae3a7193-824c-4964-9524-3213e7e6e737
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 231

{"type":"https://reference-service.example/problems/invalid-token","title":"Invalid token","status":401,"detail":"The token is not recognised.","instance":"/v1/accounts/me","correlationId":"qa-ae3a7193-824c-4964-9524-3213e7e6e737"}
```
