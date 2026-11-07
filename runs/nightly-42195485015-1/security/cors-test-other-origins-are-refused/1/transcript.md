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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 44 | `qa-e4787e4c-84a7-4db2-b8b6-90577a9bdfc4` |
| 2 | `GET /health` | 200 | 11 | `qa-e33e258c-8a65-4969-89bf-1f3516baea75` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-e4787e4c-84a7-4db2-b8b6-90577a9bdfc4

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-e4787e4c-84a7-4db2-b8b6-90577a9bdfc4
Content-Type: application/json

--- response: 403 in 44 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4787e4c-84a7-4db2-b8b6-90577a9bdfc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-e4787e4c-84a7-4db2-b8b6-90577a9bdfc4"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-e33e258c-8a65-4969-89bf-1f3516baea75

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-e33e258c-8a65-4969-89bf-1f3516baea75
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e33e258c-8a65-4969-89bf-1f3516baea75
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
