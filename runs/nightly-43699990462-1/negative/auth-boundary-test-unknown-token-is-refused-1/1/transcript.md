# Transcript: A token the service never issued is refused [eyJhbGciOiJub25lIn0.eyJzdWIiOiJhZG1pbiJ9., invalid-token]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#unknownTokenIsRefused[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /v1/accounts/me` | 401 | 16 | `qa-a41146bd-15cc-4a60-a774-c41e3f495c2d` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-a41146bd-15cc-4a60-a774-c41e3f495c2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a41146bd-15cc-4a60-a774-c41e3f495c2d
Content-Type: application/json

--- response: 401 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a41146bd-15cc-4a60-a774-c41e3f495c2d
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

{"type":"https://reference-service.example/problems/invalid-token","title":"Invalid token","status":401,"detail":"The token is not recognised.","instance":"/v1/accounts/me","correlationId":"qa-a41146bd-15cc-4a60-a774-c41e3f495c2d"}
```
