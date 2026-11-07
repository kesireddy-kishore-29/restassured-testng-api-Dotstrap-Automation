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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 51 | `qa-5b593662-9bb1-4685-bb7d-013af34123f4` |
| 2 | `GET /health` | 200 | 10 | `qa-75e74eb2-91b7-41aa-b97b-a48bb1fa6be6` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-5b593662-9bb1-4685-bb7d-013af34123f4

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-5b593662-9bb1-4685-bb7d-013af34123f4
Content-Type: application/json

--- response: 403 in 51 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b593662-9bb1-4685-bb7d-013af34123f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-5b593662-9bb1-4685-bb7d-013af34123f4"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-75e74eb2-91b7-41aa-b97b-a48bb1fa6be6

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-75e74eb2-91b7-41aa-b97b-a48bb1fa6be6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-75e74eb2-91b7-41aa-b97b-a48bb1fa6be6
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
