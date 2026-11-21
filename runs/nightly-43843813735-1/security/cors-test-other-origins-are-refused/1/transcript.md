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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 15 | `qa-ef9e7141-6339-44d1-9bc0-973f20877866` |
| 2 | `GET /health` | 200 | 21 | `qa-5f076559-f46d-42f4-b934-a525b72030a3` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-ef9e7141-6339-44d1-9bc0-973f20877866

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-ef9e7141-6339-44d1-9bc0-973f20877866
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef9e7141-6339-44d1-9bc0-973f20877866
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-ef9e7141-6339-44d1-9bc0-973f20877866"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-5f076559-f46d-42f4-b934-a525b72030a3

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-5f076559-f46d-42f4-b934-a525b72030a3
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f076559-f46d-42f4-b934-a525b72030a3
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
