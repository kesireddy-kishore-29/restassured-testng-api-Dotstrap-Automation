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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 11 | `qa-5cf55d17-3a75-4f95-9cda-a3a22e580f22` |
| 2 | `GET /health` | 200 | 19 | `qa-87ddb4aa-cde4-48cc-9afc-54c76576d06b` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-5cf55d17-3a75-4f95-9cda-a3a22e580f22

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-5cf55d17-3a75-4f95-9cda-a3a22e580f22
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cf55d17-3a75-4f95-9cda-a3a22e580f22
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-5cf55d17-3a75-4f95-9cda-a3a22e580f22"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-87ddb4aa-cde4-48cc-9afc-54c76576d06b

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-87ddb4aa-cde4-48cc-9afc-54c76576d06b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-87ddb4aa-cde4-48cc-9afc-54c76576d06b
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
