# Transcript: An allowed origin can read the headers the app needs

| | |
|---|---|
| Test | `com.qaautomation.tests.security.CorsTest#allowedOriginCanReadTheHeadersTheAppNeeds` |
| Features | FEAT-CORS-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /health` | 200 | 15 | `qa-cff5f4ed-af77-47f4-a3aa-ab0f3f1910a7` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-cff5f4ed-af77-47f4-a3aa-ab0f3f1910a7

--- request headers ---
Accept: application/json
Origin: https://app.example.test
X-Correlation-Id: qa-cff5f4ed-af77-47f4-a3aa-ab0f3f1910a7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-cff5f4ed-af77-47f4-a3aa-ab0f3f1910a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Access-Control-Allow-Origin: https://app.example.test
Access-Control-Expose-Headers: Location, Retry-After, RateLimit-Limit, RateLimit-Remaining, RateLimit-Reset, Idempotent-Replayed, X-Correlation-Id, X-Served-Region, X-Data-Region
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```
