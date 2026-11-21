# Transcript: An allowed origin passes preflight for an idempotent purchase

| | |
|---|---|
| Test | `com.qaautomation.tests.security.CorsTest#allowedOriginPassesPreflight` |
| Features | FEAT-CORS-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `OPTIONS /v1/credits/purchases` | 204 | 19 | `qa-fa822deb-43c1-418d-afb5-58261945b45f` |

## 1. OPTIONS /v1/credits/purchases

```text
#1 OPTIONS http://localhost:7070/v1/credits/purchases
correlation: qa-fa822deb-43c1-418d-afb5-58261945b45f

--- request headers ---
Accept: application/json
Origin: https://app.example.test
Access-Control-Request-Headers: Authorization, Idempotency-Key, Content-Type
Access-Control-Request-Method: POST
X-Correlation-Id: qa-fa822deb-43c1-418d-afb5-58261945b45f
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa822deb-43c1-418d-afb5-58261945b45f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Access-Control-Allow-Origin: https://app.example.test
Access-Control-Expose-Headers: Location, Retry-After, RateLimit-Limit, RateLimit-Remaining, RateLimit-Reset, Idempotent-Replayed, X-Correlation-Id, X-Served-Region, X-Data-Region
Access-Control-Allow-Methods: GET, POST, PATCH, DELETE, OPTIONS
Access-Control-Allow-Headers: Authorization, Content-Type, Idempotency-Key, X-Correlation-Id
Access-Control-Max-Age: 600
```
