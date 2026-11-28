# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007dc33843cb60@2f4ddda7]

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
| 1 | `GET /health` | 200 | 270 | `qa-f8b0783b-0a2b-418e-8a11-2d0d397ff774` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-f8b0783b-0a2b-418e-8a11-2d0d397ff774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8b0783b-0a2b-418e-8a11-2d0d397ff774
Content-Type: application/json

--- response: 200 in 270 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8b0783b-0a2b-418e-8a11-2d0d397ff774
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
