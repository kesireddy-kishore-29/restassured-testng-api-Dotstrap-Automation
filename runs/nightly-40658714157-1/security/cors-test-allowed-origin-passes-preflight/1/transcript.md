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
| 1 | `OPTIONS /v1/credits/purchases` | 204 | 24 | `qa-b50f5f67-c5e6-465a-ba78-ace49ed97768` |

## 1. OPTIONS /v1/credits/purchases

```text
#1 OPTIONS http://localhost:7070/v1/credits/purchases
correlation: qa-b50f5f67-c5e6-465a-ba78-ace49ed97768

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization, Idempotency-Key, Content-Type
Origin: https://app.example.test
Access-Control-Request-Method: POST
X-Correlation-Id: qa-b50f5f67-c5e6-465a-ba78-ace49ed97768
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b50f5f67-c5e6-465a-ba78-ace49ed97768
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
