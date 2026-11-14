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
| 1 | `GET /health` | 200 | 28 | `qa-046ee94c-573d-4c79-b0cd-d79e6ad110fb` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-046ee94c-573d-4c79-b0cd-d79e6ad110fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-046ee94c-573d-4c79-b0cd-d79e6ad110fb
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-046ee94c-573d-4c79-b0cd-d79e6ad110fb
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
