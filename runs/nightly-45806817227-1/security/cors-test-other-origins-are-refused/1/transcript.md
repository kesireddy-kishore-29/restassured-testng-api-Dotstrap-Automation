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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 277 | `qa-9ee4f92c-0a41-4ca1-bc84-7dc213a3eda1` |
| 2 | `GET /health` | 200 | 6 | `qa-abec6462-6443-4961-8077-7a6a503f701f` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-9ee4f92c-0a41-4ca1-bc84-7dc213a3eda1

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-9ee4f92c-0a41-4ca1-bc84-7dc213a3eda1
Content-Type: application/json

--- response: 403 in 277 ms ---
Date: Thu, 26 Nov 2026 11:02:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ee4f92c-0a41-4ca1-bc84-7dc213a3eda1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-9ee4f92c-0a41-4ca1-bc84-7dc213a3eda1"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-abec6462-6443-4961-8077-7a6a503f701f

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-abec6462-6443-4961-8077-7a6a503f701f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-abec6462-6443-4961-8077-7a6a503f701f
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
