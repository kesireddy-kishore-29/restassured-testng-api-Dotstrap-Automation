# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007cbe0843b770@79bc1388]

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
| 1 | `GET /health` | 200 | 466 | `qa-4d5ef18d-13ba-4be8-b570-6809b72d0a3b` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-4d5ef18d-13ba-4be8-b570-6809b72d0a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d5ef18d-13ba-4be8-b570-6809b72d0a3b
Content-Type: application/json

--- response: 200 in 466 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d5ef18d-13ba-4be8-b570-6809b72d0a3b
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
