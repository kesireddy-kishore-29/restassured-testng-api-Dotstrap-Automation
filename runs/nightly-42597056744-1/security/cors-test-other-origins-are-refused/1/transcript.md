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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 7 | `qa-4301e3ca-9cd7-41d4-a0a4-653229973298` |
| 2 | `GET /health` | 200 | 4 | `qa-7a2ce3fe-5832-4aa4-948f-78de7880cfcf` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-4301e3ca-9cd7-41d4-a0a4-653229973298

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
X-Correlation-Id: qa-4301e3ca-9cd7-41d4-a0a4-653229973298
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4301e3ca-9cd7-41d4-a0a4-653229973298
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-4301e3ca-9cd7-41d4-a0a4-653229973298"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-7a2ce3fe-5832-4aa4-948f-78de7880cfcf

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-7a2ce3fe-5832-4aa4-948f-78de7880cfcf
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a2ce3fe-5832-4aa4-948f-78de7880cfcf
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
