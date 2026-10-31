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
| 1 | `GET /health` | 200 | 30 | `qa-0b0842b3-a75f-4248-9d01-b526845a53dd` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-0b0842b3-a75f-4248-9d01-b526845a53dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b0842b3-a75f-4248-9d01-b526845a53dd
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b0842b3-a75f-4248-9d01-b526845a53dd
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
