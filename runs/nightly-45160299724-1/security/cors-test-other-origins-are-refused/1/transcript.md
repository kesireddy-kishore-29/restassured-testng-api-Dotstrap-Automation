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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 18 | `qa-7330a6b7-b264-4258-b390-ec7cbcb84bf7` |
| 2 | `GET /health` | 200 | 8 | `qa-a5d52dab-343a-46e8-965f-25e963f7615d` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-7330a6b7-b264-4258-b390-ec7cbcb84bf7

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-7330a6b7-b264-4258-b390-ec7cbcb84bf7
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7330a6b7-b264-4258-b390-ec7cbcb84bf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-7330a6b7-b264-4258-b390-ec7cbcb84bf7"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-a5d52dab-343a-46e8-965f-25e963f7615d

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-a5d52dab-343a-46e8-965f-25e963f7615d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5d52dab-343a-46e8-965f-25e963f7615d
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
