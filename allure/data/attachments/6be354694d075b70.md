# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000076e4a0687760@430807ee]

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
| 1 | `GET /health` | 200 | 12 | `qa-43eca4aa-f912-41bb-b21b-81c6c0882bdb` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-43eca4aa-f912-41bb-b21b-81c6c0882bdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43eca4aa-f912-41bb-b21b-81c6c0882bdb
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-43eca4aa-f912-41bb-b21b-81c6c0882bdb
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
