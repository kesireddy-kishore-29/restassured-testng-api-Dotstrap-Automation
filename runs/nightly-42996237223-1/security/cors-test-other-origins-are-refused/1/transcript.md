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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 10 | `qa-9164d15f-9856-46f3-9966-5c6341fb5cbf` |
| 2 | `GET /health` | 200 | 12 | `qa-40191616-a6dd-495a-98f4-5425313ea6a6` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-9164d15f-9856-46f3-9966-5c6341fb5cbf

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-9164d15f-9856-46f3-9966-5c6341fb5cbf
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9164d15f-9856-46f3-9966-5c6341fb5cbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-9164d15f-9856-46f3-9966-5c6341fb5cbf"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-40191616-a6dd-495a-98f4-5425313ea6a6

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-40191616-a6dd-495a-98f4-5425313ea6a6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-40191616-a6dd-495a-98f4-5425313ea6a6
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
