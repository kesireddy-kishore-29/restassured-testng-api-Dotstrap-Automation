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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 391 | `qa-ed40ac4c-5434-47d1-8cb9-05a6fa13e620` |
| 2 | `GET /health` | 200 | 7 | `qa-67aba880-2dbe-4774-8fb4-b7eab803e84d` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-ed40ac4c-5434-47d1-8cb9-05a6fa13e620

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
Origin: https://evil.example
X-Correlation-Id: qa-ed40ac4c-5434-47d1-8cb9-05a6fa13e620
Content-Type: application/json

--- response: 403 in 391 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed40ac4c-5434-47d1-8cb9-05a6fa13e620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-ed40ac4c-5434-47d1-8cb9-05a6fa13e620"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-67aba880-2dbe-4774-8fb4-b7eab803e84d

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-67aba880-2dbe-4774-8fb4-b7eab803e84d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-67aba880-2dbe-4774-8fb4-b7eab803e84d
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
