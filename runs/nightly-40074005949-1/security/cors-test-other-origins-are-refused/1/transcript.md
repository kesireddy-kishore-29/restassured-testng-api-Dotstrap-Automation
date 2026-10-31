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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 12 | `qa-628173f5-a597-4cb7-b259-873c041b1406` |
| 2 | `GET /health` | 200 | 19 | `qa-1ba62321-d196-43db-98f9-ec586b468076` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-628173f5-a597-4cb7-b259-873c041b1406

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
X-Correlation-Id: qa-628173f5-a597-4cb7-b259-873c041b1406
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-628173f5-a597-4cb7-b259-873c041b1406
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-628173f5-a597-4cb7-b259-873c041b1406"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-1ba62321-d196-43db-98f9-ec586b468076

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-1ba62321-d196-43db-98f9-ec586b468076
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ba62321-d196-43db-98f9-ec586b468076
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
