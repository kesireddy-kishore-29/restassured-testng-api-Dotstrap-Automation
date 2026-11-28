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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 408 | `qa-65b1d2cc-17ac-4d7d-82b7-ba40e29385d6` |
| 2 | `GET /health` | 200 | 12 | `qa-de326405-9c6b-4bb5-9a27-3b19b8877942` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-65b1d2cc-17ac-4d7d-82b7-ba40e29385d6

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
X-Correlation-Id: qa-65b1d2cc-17ac-4d7d-82b7-ba40e29385d6
Content-Type: application/json

--- response: 403 in 408 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65b1d2cc-17ac-4d7d-82b7-ba40e29385d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-65b1d2cc-17ac-4d7d-82b7-ba40e29385d6"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-de326405-9c6b-4bb5-9a27-3b19b8877942

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-de326405-9c6b-4bb5-9a27-3b19b8877942
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-de326405-9c6b-4bb5-9a27-3b19b8877942
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
