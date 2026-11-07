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
| 1 | `GET /health` | 200 | 9 | `qa-8b2f6182-fe51-47f9-a984-3aeab25511d6` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-8b2f6182-fe51-47f9-a984-3aeab25511d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b2f6182-fe51-47f9-a984-3aeab25511d6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b2f6182-fe51-47f9-a984-3aeab25511d6
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
