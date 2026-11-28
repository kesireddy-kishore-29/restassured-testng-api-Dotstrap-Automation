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
| 1 | `OPTIONS /v1/accounts/me` | 403 | 456 | `qa-53a51a8c-8ec2-432c-b7ea-c7eb4ec2878f` |
| 2 | `GET /health` | 200 | 21 | `qa-9bce650d-a430-4dae-a04a-e45ddeecac95` |

## 1. OPTIONS /v1/accounts/me

```text
#1 OPTIONS http://localhost:7070/v1/accounts/me
correlation: qa-53a51a8c-8ec2-432c-b7ea-c7eb4ec2878f

--- request headers ---
Accept: application/json
Access-Control-Request-Method: GET
Origin: https://evil.example
Access-Control-Request-Headers: Authorization
X-Correlation-Id: qa-53a51a8c-8ec2-432c-b7ea-c7eb4ec2878f
Content-Type: application/json

--- response: 403 in 456 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53a51a8c-8ec2-432c-b7ea-c7eb4ec2878f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 258

{"type":"https://reference-service.example/problems/cors-origin-denied","title":"Origin not allowed","status":403,"detail":"Origin 'https://evil.example' is not allowed.","instance":"/v1/accounts/me","correlationId":"qa-53a51a8c-8ec2-432c-b7ea-c7eb4ec2878f"}
```

## 2. GET /health

```text
#2 GET http://localhost:7070/health
correlation: qa-9bce650d-a430-4dae-a04a-e45ddeecac95

--- request headers ---
Accept: application/json
Origin: https://evil.example
X-Correlation-Id: qa-9bce650d-a430-4dae-a04a-e45ddeecac95
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bce650d-a430-4dae-a04a-e45ddeecac95
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
