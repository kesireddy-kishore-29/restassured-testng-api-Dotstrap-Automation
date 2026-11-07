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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 21 | `qa-0ab26f7e-1161-4eca-a332-8f7b802854dd` |
| 2 | `GET /health` | 200 | 8 | `qa-938b4a49-ac3e-4875-89be-7d5d9ca82702` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-0ab26f7e-1161-4eca-a332-8f7b802854dd

--- request headers ---
Accept: application/json
Access-Control-Request-Headers: Authorization
Access-Control-Request-Method: GET
Origin: https://evil.example
X-Correlation-Id: qa-0ab26f7e-1161-4eca-a332-8f7b802854dd
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ab26f7e-1161-4eca-a332-8f7b802854dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-0ab26f7e-1161-4eca-a332-8f7b802854dd"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-938b4a49-ac3e-4875-89be-7d5d9ca82702

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-938b4a49-ac3e-4875-89be-7d5d9ca82702
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-938b4a49-ac3e-4875-89be-7d5d9ca82702
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
