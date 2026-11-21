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
| 1 | `GET /v1/accounts/me` | 401 | 17 | `qa-92937ca1-4e67-4b28-8fa2-f5c0b7271b3b` |

## 1. GET /v1/accounts/me

```text
#1 GET http://localhost:7070/v1/accounts/me
correlation: qa-92937ca1-4e67-4b28-8fa2-f5c0b7271b3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92937ca1-4e67-4b28-8fa2-f5c0b7271b3b
Content-Type: application/json

--- response: 401 in 17 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92937ca1-4e67-4b28-8fa2-f5c0b7271b3b
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

{"type":"https://reference-service.example/problems/invalid-token","title":"Invalid token","status":401,"detail":"The token is not recognised.","instance":"/v1/accounts/me","correlationId":"qa-92937ca1-4e67-4b28-8fa2-f5c0b7271b3b"}
```
