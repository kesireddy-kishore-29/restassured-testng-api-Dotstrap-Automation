# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000070cc7043ca88@70895f4c]

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
| 1 | `GET /health` | 200 | 350 | `qa-7cced3eb-a896-476f-b0af-c620c214c923` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-7cced3eb-a896-476f-b0af-c620c214c923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cced3eb-a896-476f-b0af-c620c214c923
Content-Type: application/json

--- response: 200 in 350 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cced3eb-a896-476f-b0af-c620c214c923
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
