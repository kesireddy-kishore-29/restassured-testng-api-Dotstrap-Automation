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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 15 | `qa-5abbfa98-2e86-4b14-8c99-b1b290f67e58` |
| 2 | `GET /health` | 200 | 13 | `qa-523eca7b-7388-48bf-b561-4f4a312b3a8d` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-5abbfa98-2e86-4b14-8c99-b1b290f67e58

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
Origin: https://evil.example
X-Correlation-Id: qa-5abbfa98-2e86-4b14-8c99-b1b290f67e58
Content-Type: application/json

--- response: 403 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5abbfa98-2e86-4b14-8c99-b1b290f67e58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-5abbfa98-2e86-4b14-8c99-b1b290f67e58"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-523eca7b-7388-48bf-b561-4f4a312b3a8d

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-523eca7b-7388-48bf-b561-4f4a312b3a8d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-523eca7b-7388-48bf-b561-4f4a312b3a8d
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
