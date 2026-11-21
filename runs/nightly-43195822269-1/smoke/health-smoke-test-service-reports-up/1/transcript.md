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
| 1 | `GET /health` | 200 | 17 | `qa-ef5f409d-48ac-4f28-a41c-f3d3e6494082` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-ef5f409d-48ac-4f28-a41c-f3d3e6494082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef5f409d-48ac-4f28-a41c-f3d3e6494082
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef5f409d-48ac-4f28-a41c-f3d3e6494082
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
