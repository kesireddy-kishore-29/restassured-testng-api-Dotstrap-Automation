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
| 1 | `GET /health` | 200 | 393 | `qa-59207efc-1fbc-4cbe-a52d-291e6916c71f` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-59207efc-1fbc-4cbe-a52d-291e6916c71f

--- request headers ---
Accept: application/json
Origin: https://app.example.test
X-Correlation-Id: qa-59207efc-1fbc-4cbe-a52d-291e6916c71f
Content-Type: application/json

--- response: 200 in 393 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-59207efc-1fbc-4cbe-a52d-291e6916c71f
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
