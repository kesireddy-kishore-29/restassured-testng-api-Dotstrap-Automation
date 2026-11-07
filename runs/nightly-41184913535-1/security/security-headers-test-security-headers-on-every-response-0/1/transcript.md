# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007f39c442b590@655d4830]

| | |
|---|---|
| Test | `com.qaautomation.tests.security.SecurityHeadersTest#securityHeadersOnEveryResponse[0]` |
| Features | FEAT-SEC-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /health` | 200 | 410 | `qa-b0f85f11-384a-4e5d-a51e-b87db143403d` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-b0f85f11-384a-4e5d-a51e-b87db143403d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0f85f11-384a-4e5d-a51e-b87db143403d
Content-Type: application/json

--- response: 200 in 410 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0f85f11-384a-4e5d-a51e-b87db143403d
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
