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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 304 | `qa-94ef9920-683c-417c-a348-7a258ee9439a` |
| 2 | `GET /health` | 200 | 5 | `qa-f2416a03-5d25-4478-9d47-83f34be713a6` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-94ef9920-683c-417c-a348-7a258ee9439a

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-94ef9920-683c-417c-a348-7a258ee9439a
Content-Type: application/json

--- response: 403 in 304 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94ef9920-683c-417c-a348-7a258ee9439a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-94ef9920-683c-417c-a348-7a258ee9439a"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-f2416a03-5d25-4478-9d47-83f34be713a6

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-f2416a03-5d25-4478-9d47-83f34be713a6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2416a03-5d25-4478-9d47-83f34be713a6
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
