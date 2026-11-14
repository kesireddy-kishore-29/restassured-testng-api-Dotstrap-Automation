# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x0000727fdc43d6b8@7d0cd141]

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
| 1 | `GET /health` | 200 | 337 | `qa-8ba2eefb-baca-48fe-9559-ee2be947d2a7` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-8ba2eefb-baca-48fe-9559-ee2be947d2a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ba2eefb-baca-48fe-9559-ee2be947d2a7
Content-Type: application/json

--- response: 200 in 337 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ba2eefb-baca-48fe-9559-ee2be947d2a7
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
