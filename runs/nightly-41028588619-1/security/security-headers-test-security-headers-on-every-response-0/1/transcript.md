# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000074a94c42aef8@7825c3b6]

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
| 1 | `GET /health` | 200 | 367 | `qa-a90424bf-291e-4a2e-8ad3-8f20c0ef964c` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-a90424bf-291e-4a2e-8ad3-8f20c0ef964c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a90424bf-291e-4a2e-8ad3-8f20c0ef964c
Content-Type: application/json

--- response: 200 in 367 ms ---
Date: Fri, 30 Oct 2026 08:45:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a90424bf-291e-4a2e-8ad3-8f20c0ef964c
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
