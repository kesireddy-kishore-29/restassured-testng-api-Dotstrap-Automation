# Transcript: Any other origin is refused

| | |
|---|---|
| Test | `com.qaautomation.tests.security.CorsTest#otherOriginsAreRefused` |
| Features | FEAT-CORS-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 2 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `OPTIONS /v1/accounts/me` | 403 | 20 | `qa-fbfaa077-0ff7-427c-b065-0df0387d8640` |
| 2 | `GET /health` | 200 | 7 | `qa-6d7aaf8d-b95d-4d41-b7b8-be1fb0dd1fc5` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-fbfaa077-0ff7-427c-b065-0df0387d8640

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-fbfaa077-0ff7-427c-b065-0df0387d8640
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fbfaa077-0ff7-427c-b065-0df0387d8640
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-fbfaa077-0ff7-427c-b065-0df0387d8640"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-6d7aaf8d-b95d-4d41-b7b8-be1fb0dd1fc5

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-6d7aaf8d-b95d-4d41-b7b8-be1fb0dd1fc5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d7aaf8d-b95d-4d41-b7b8-be1fb0dd1fc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```
