# Transcript: The reference service reports itself up, with its version and regions

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#serviceReportsUp` |
| Features | FEAT-HEALTH-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /health` | 200 | 354 | `qa-c11317c2-73a6-45b6-aa4e-7089be0234e3` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-c11317c2-73a6-45b6-aa4e-7089be0234e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c11317c2-73a6-45b6-aa4e-7089be0234e3
Content-Type: application/json

--- response: 200 in 354 ms ---
Date: Fri, 27 Nov 2026 10:59:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c11317c2-73a6-45b6-aa4e-7089be0234e3
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
