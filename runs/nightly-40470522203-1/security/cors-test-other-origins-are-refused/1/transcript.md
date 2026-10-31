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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 21 | `qa-cd381580-0fed-4d54-b9a2-eb3c91b215af` |
| 2 | `GET /health` | 200 | 12 | `qa-75811089-87ae-42a5-9b5d-7d0b71f9a042` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-cd381580-0fed-4d54-b9a2-eb3c91b215af

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
Origin: https://evil.example
X-Correlation-Id: qa-cd381580-0fed-4d54-b9a2-eb3c91b215af
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd381580-0fed-4d54-b9a2-eb3c91b215af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-cd381580-0fed-4d54-b9a2-eb3c91b215af"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-75811089-87ae-42a5-9b5d-7d0b71f9a042

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-75811089-87ae-42a5-9b5d-7d0b71f9a042
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-75811089-87ae-42a5-9b5d-7d0b71f9a042
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
