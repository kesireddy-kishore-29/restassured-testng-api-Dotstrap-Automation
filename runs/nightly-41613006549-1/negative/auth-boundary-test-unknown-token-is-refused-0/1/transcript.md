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
| 1 | `GET /v1/accounts/me` | 401 | 383 | `qa-b4e9e407-bcdd-4754-a525-82e251d1e018` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4e9e407-bcdd-4754-a525-82e251d1e018

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4e9e407-bcdd-4754-a525-82e251d1e018
Content-Type: application/json

--- response: 401 in 383 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4e9e407-bcdd-4754-a525-82e251d1e018
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

{"type":"https://reference-service.example/problems/invalid-token","title":"Invalid token","status":401,"detail":"The token is not recognised.","instance":"/v1/accounts/me","correlationId":"qa-b4e9e407-bcdd-4754-a525-82e251d1e018"}
```
