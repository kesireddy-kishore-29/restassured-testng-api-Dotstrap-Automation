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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 20 | `qa-c7c9f479-28ab-4049-a7f0-6fbc1c3e0f6e` |
| 2 | `GET /health` | 200 | 8 | `qa-b7f720ed-92ca-4e24-8571-b39e8418913f` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-c7c9f479-28ab-4049-a7f0-6fbc1c3e0f6e

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
Origin: https://evil.example
X-Correlation-Id: qa-c7c9f479-28ab-4049-a7f0-6fbc1c3e0f6e
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7c9f479-28ab-4049-a7f0-6fbc1c3e0f6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-c7c9f479-28ab-4049-a7f0-6fbc1c3e0f6e"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-b7f720ed-92ca-4e24-8571-b39e8418913f

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-b7f720ed-92ca-4e24-8571-b39e8418913f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7f720ed-92ca-4e24-8571-b39e8418913f
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
