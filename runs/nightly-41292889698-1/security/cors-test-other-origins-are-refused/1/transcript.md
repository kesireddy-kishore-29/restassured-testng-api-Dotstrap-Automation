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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 11 | `qa-55b5211e-3cc1-44fa-98c3-19acca145df1` |
| 2 | `GET /health` | 200 | 4 | `qa-40e94566-931a-4eeb-a0e2-36677c848883` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-55b5211e-3cc1-44fa-98c3-19acca145df1

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-55b5211e-3cc1-44fa-98c3-19acca145df1
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55b5211e-3cc1-44fa-98c3-19acca145df1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-55b5211e-3cc1-44fa-98c3-19acca145df1"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-40e94566-931a-4eeb-a0e2-36677c848883

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-40e94566-931a-4eeb-a0e2-36677c848883
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e94566-931a-4eeb-a0e2-36677c848883
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
