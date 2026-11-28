# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007c989443a7d0@658f616e]

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
| 1 | `GET /health` | 200 | 373 | `qa-e6b36922-e85e-4867-8930-03338d557b56` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-e6b36922-e85e-4867-8930-03338d557b56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6b36922-e85e-4867-8930-03338d557b56
Content-Type: application/json

--- response: 200 in 373 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6b36922-e85e-4867-8930-03338d557b56
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
