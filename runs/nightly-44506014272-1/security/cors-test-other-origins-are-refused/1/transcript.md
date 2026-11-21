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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 17 | `qa-6e6e9616-f1d8-4086-89ba-aaa361707db8` |
| 2 | `GET /health` | 200 | 14 | `qa-65271cd7-4a6c-44d5-8984-5fd338a94df1` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-6e6e9616-f1d8-4086-89ba-aaa361707db8

--- request headers ---
Accept: application/json
Origin: https://evil.example
Access-Control-Request-Method: GET
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-6e6e9616-f1d8-4086-89ba-aaa361707db8
Content-Type: application/json

--- response: 403 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e6e9616-f1d8-4086-89ba-aaa361707db8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-6e6e9616-f1d8-4086-89ba-aaa361707db8"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-65271cd7-4a6c-44d5-8984-5fd338a94df1

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-65271cd7-4a6c-44d5-8984-5fd338a94df1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-65271cd7-4a6c-44d5-8984-5fd338a94df1
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
