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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 15 | `qa-54c12863-e29c-47c7-ad36-dfeb3c6087ba` |
| 2 | `GET /health` | 200 | 9 | `qa-6567c7c9-1f84-4d40-a1ae-cb8501889dc9` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-54c12863-e29c-47c7-ad36-dfeb3c6087ba

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-54c12863-e29c-47c7-ad36-dfeb3c6087ba
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54c12863-e29c-47c7-ad36-dfeb3c6087ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-54c12863-e29c-47c7-ad36-dfeb3c6087ba"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-6567c7c9-1f84-4d40-a1ae-cb8501889dc9

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-6567c7c9-1f84-4d40-a1ae-cb8501889dc9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6567c7c9-1f84-4d40-a1ae-cb8501889dc9
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
