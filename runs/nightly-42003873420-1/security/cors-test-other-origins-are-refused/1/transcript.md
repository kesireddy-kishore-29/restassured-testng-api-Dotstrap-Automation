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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 16 | `qa-432ab6fb-5d83-4b6c-8e4b-bba0dede73fd` |
| 2 | `GET /health` | 200 | 8 | `qa-5dbf1d80-a855-40f1-832d-8b33b84810b7` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-432ab6fb-5d83-4b6c-8e4b-bba0dede73fd

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-432ab6fb-5d83-4b6c-8e4b-bba0dede73fd
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-432ab6fb-5d83-4b6c-8e4b-bba0dede73fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-432ab6fb-5d83-4b6c-8e4b-bba0dede73fd"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-5dbf1d80-a855-40f1-832d-8b33b84810b7

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-5dbf1d80-a855-40f1-832d-8b33b84810b7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dbf1d80-a855-40f1-832d-8b33b84810b7
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
