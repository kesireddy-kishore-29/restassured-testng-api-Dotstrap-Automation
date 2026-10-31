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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 5 | `qa-edb80cdb-3f5c-47ea-93f6-67b774d674f4` |
| 2 | `GET /health` | 200 | 8 | `qa-adbcdb53-db29-4673-9393-4bf978df609d` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-edb80cdb-3f5c-47ea-93f6-67b774d674f4

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-edb80cdb-3f5c-47ea-93f6-67b774d674f4
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-edb80cdb-3f5c-47ea-93f6-67b774d674f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-edb80cdb-3f5c-47ea-93f6-67b774d674f4"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-adbcdb53-db29-4673-9393-4bf978df609d

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-adbcdb53-db29-4673-9393-4bf978df609d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-adbcdb53-db29-4673-9393-4bf978df609d
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
