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
| 1 | `OPTIONS /v1/credits/purchases` | 204 | 16 | `qa-eb29a7cd-2127-468a-a9b2-13fd49b8b012` |

## 1. OPTIONS /v1/credits/purchases

```text
#1 OPTIONS http://localhost:7070/v1/credits/purchases
correlation: qa-eb29a7cd-2127-468a-a9b2-13fd49b8b012

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization, Idempotency-Key, Content-Type
Access-Control-Request-Method: POST
Origin: https://app.example.test
X-Correlation-Id: qa-eb29a7cd-2127-468a-a9b2-13fd49b8b012
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb29a7cd-2127-468a-a9b2-13fd49b8b012
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
