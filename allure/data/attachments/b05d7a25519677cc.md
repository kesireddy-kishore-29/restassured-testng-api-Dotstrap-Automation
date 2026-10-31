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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 32 | `qa-88cb0994-1ecd-4aca-b2a4-812c90f6228a` |
| 2 | `GET /health` | 200 | 11 | `qa-16d7672a-62d8-4139-bb85-4356cef07dab` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-88cb0994-1ecd-4aca-b2a4-812c90f6228a

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-88cb0994-1ecd-4aca-b2a4-812c90f6228a
Content-Type: application/json

--- response: 403 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88cb0994-1ecd-4aca-b2a4-812c90f6228a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-88cb0994-1ecd-4aca-b2a4-812c90f6228a"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-16d7672a-62d8-4139-bb85-4356cef07dab

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-16d7672a-62d8-4139-bb85-4356cef07dab
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d7672a-62d8-4139-bb85-4356cef07dab
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
