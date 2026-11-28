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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 11 | `qa-a28b0329-5476-4cfd-9698-aa2d971345f5` |
| 2 | `GET /health` | 200 | 10 | `qa-cc622666-cb28-4112-9b65-6f0017bdb5f5` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-a28b0329-5476-4cfd-9698-aa2d971345f5

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
Origin: https://evil.example
X-Correlation-Id: qa-a28b0329-5476-4cfd-9698-aa2d971345f5
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a28b0329-5476-4cfd-9698-aa2d971345f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-a28b0329-5476-4cfd-9698-aa2d971345f5"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-cc622666-cb28-4112-9b65-6f0017bdb5f5

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-cc622666-cb28-4112-9b65-6f0017bdb5f5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc622666-cb28-4112-9b65-6f0017bdb5f5
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
