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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 17 | `qa-a06f278c-e45f-43b5-b3ee-8bcd2c846252` |
| 2 | `GET /health` | 200 | 8 | `qa-f847288c-e395-4abc-b9b2-fe09f8ded2f0` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-a06f278c-e45f-43b5-b3ee-8bcd2c846252

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-a06f278c-e45f-43b5-b3ee-8bcd2c846252
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a06f278c-e45f-43b5-b3ee-8bcd2c846252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-a06f278c-e45f-43b5-b3ee-8bcd2c846252"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-f847288c-e395-4abc-b9b2-fe09f8ded2f0

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-f847288c-e395-4abc-b9b2-fe09f8ded2f0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f847288c-e395-4abc-b9b2-fe09f8ded2f0
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
