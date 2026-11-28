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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 12 | `qa-a464885f-a77d-43da-8d5c-f2d394639b2e` |
| 2 | `GET /health` | 200 | 7 | `qa-950722b5-f931-4f05-acab-22bae84eb57a` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-a464885f-a77d-43da-8d5c-f2d394639b2e

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
Access-Control-Request-Method: GET
X-Correlation-Id: qa-a464885f-a77d-43da-8d5c-f2d394639b2e
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a464885f-a77d-43da-8d5c-f2d394639b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-a464885f-a77d-43da-8d5c-f2d394639b2e"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-950722b5-f931-4f05-acab-22bae84eb57a

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-950722b5-f931-4f05-acab-22bae84eb57a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-950722b5-f931-4f05-acab-22bae84eb57a
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
