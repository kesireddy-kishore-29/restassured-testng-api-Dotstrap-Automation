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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 10 | `qa-94382fdc-49f9-4f3a-ac6a-7d9057c71c25` |
| 2 | `GET /health` | 200 | 5 | `qa-004cc392-b49e-4d67-bd7a-990421b8b43e` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-94382fdc-49f9-4f3a-ac6a-7d9057c71c25

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-94382fdc-49f9-4f3a-ac6a-7d9057c71c25
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94382fdc-49f9-4f3a-ac6a-7d9057c71c25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-94382fdc-49f9-4f3a-ac6a-7d9057c71c25"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-004cc392-b49e-4d67-bd7a-990421b8b43e

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-004cc392-b49e-4d67-bd7a-990421b8b43e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-004cc392-b49e-4d67-bd7a-990421b8b43e
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
