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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 313 | `qa-f6de9205-6cba-4fa3-b751-e9075c1f7b34` |
| 2 | `GET /health` | 200 | 4 | `qa-1305e922-666a-4744-8f11-65f90d9dd93a` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-f6de9205-6cba-4fa3-b751-e9075c1f7b34

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-f6de9205-6cba-4fa3-b751-e9075c1f7b34
Content-Type: application/json

--- response: 403 in 313 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6de9205-6cba-4fa3-b751-e9075c1f7b34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-f6de9205-6cba-4fa3-b751-e9075c1f7b34"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-1305e922-666a-4744-8f11-65f90d9dd93a

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-1305e922-666a-4744-8f11-65f90d9dd93a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1305e922-666a-4744-8f11-65f90d9dd93a
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
