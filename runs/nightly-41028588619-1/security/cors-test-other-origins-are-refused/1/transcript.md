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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 16 | `qa-aba40c66-a6f0-4c0a-a0bf-98954f5bddb1` |
| 2 | `GET /health` | 200 | 13 | `qa-8ff2cdd0-5776-4e42-abcc-39268083becf` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-aba40c66-a6f0-4c0a-a0bf-98954f5bddb1

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
X-Correlation-Id: qa-aba40c66-a6f0-4c0a-a0bf-98954f5bddb1
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aba40c66-a6f0-4c0a-a0bf-98954f5bddb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-aba40c66-a6f0-4c0a-a0bf-98954f5bddb1"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-8ff2cdd0-5776-4e42-abcc-39268083becf

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-8ff2cdd0-5776-4e42-abcc-39268083becf
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ff2cdd0-5776-4e42-abcc-39268083becf
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
