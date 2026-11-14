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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 7 | `qa-51e7e51f-8bf6-4d8f-bc42-3b46d6e2ffcc` |
| 2 | `GET /health` | 200 | 9 | `qa-29a437b7-cfa0-4e23-bab9-0184abe97b8e` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-51e7e51f-8bf6-4d8f-bc42-3b46d6e2ffcc

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-51e7e51f-8bf6-4d8f-bc42-3b46d6e2ffcc
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51e7e51f-8bf6-4d8f-bc42-3b46d6e2ffcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-51e7e51f-8bf6-4d8f-bc42-3b46d6e2ffcc"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-29a437b7-cfa0-4e23-bab9-0184abe97b8e

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-29a437b7-cfa0-4e23-bab9-0184abe97b8e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-29a437b7-cfa0-4e23-bab9-0184abe97b8e
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
