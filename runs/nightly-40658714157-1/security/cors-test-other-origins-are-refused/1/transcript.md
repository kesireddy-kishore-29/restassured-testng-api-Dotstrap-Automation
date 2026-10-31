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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 22 | `qa-27ed4296-fa69-4e5f-9d38-b881158d7b28` |
| 2 | `GET /health` | 200 | 14 | `qa-f4af87db-f44b-45d4-83e9-0874b8488be8` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-27ed4296-fa69-4e5f-9d38-b881158d7b28

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-27ed4296-fa69-4e5f-9d38-b881158d7b28
Content-Type: application/json

--- response: 403 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27ed4296-fa69-4e5f-9d38-b881158d7b28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-27ed4296-fa69-4e5f-9d38-b881158d7b28"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-f4af87db-f44b-45d4-83e9-0874b8488be8

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-f4af87db-f44b-45d4-83e9-0874b8488be8
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4af87db-f44b-45d4-83e9-0874b8488be8
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
