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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 6 | `qa-b6776e69-c3ea-4a30-ae30-4376868bc952` |
| 2 | `GET /health` | 200 | 3 | `qa-acb80975-fb95-47ae-877b-3d40866f1d6a` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-b6776e69-c3ea-4a30-ae30-4376868bc952

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-b6776e69-c3ea-4a30-ae30-4376868bc952
Content-Type: application/json

--- response: 403 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6776e69-c3ea-4a30-ae30-4376868bc952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-b6776e69-c3ea-4a30-ae30-4376868bc952"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-acb80975-fb95-47ae-877b-3d40866f1d6a

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-acb80975-fb95-47ae-877b-3d40866f1d6a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-acb80975-fb95-47ae-877b-3d40866f1d6a
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
