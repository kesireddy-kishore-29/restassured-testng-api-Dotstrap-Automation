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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 6 | `qa-4dfcb1f3-8a25-490d-8370-34f9d4bb4fbd` |
| 2 | `GET /health` | 200 | 8 | `qa-d6ee0bb8-e070-4ac0-844c-0b02cca97d1f` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-4dfcb1f3-8a25-490d-8370-34f9d4bb4fbd

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
Origin: https://evil.example
X-Correlation-Id: qa-4dfcb1f3-8a25-490d-8370-34f9d4bb4fbd
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4dfcb1f3-8a25-490d-8370-34f9d4bb4fbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-4dfcb1f3-8a25-490d-8370-34f9d4bb4fbd"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-d6ee0bb8-e070-4ac0-844c-0b02cca97d1f

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-d6ee0bb8-e070-4ac0-844c-0b02cca97d1f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ee0bb8-e070-4ac0-844c-0b02cca97d1f
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
