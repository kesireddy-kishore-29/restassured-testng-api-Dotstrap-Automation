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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 8 | `qa-272b199a-2748-41d0-adaf-692ac22bd62c` |
| 2 | `GET /health` | 200 | 9 | `qa-79756aa1-eb0f-4394-b717-58d6dab9fe08` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-272b199a-2748-41d0-adaf-692ac22bd62c

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
X-Correlation-Id: qa-272b199a-2748-41d0-adaf-692ac22bd62c
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-272b199a-2748-41d0-adaf-692ac22bd62c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-272b199a-2748-41d0-adaf-692ac22bd62c"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-79756aa1-eb0f-4394-b717-58d6dab9fe08

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-79756aa1-eb0f-4394-b717-58d6dab9fe08
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-79756aa1-eb0f-4394-b717-58d6dab9fe08
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
