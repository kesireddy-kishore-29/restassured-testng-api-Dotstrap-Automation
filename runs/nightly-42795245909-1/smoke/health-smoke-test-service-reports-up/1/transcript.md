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
| 1 | `GET /health` | 200 | 22 | `qa-a27ad877-8b59-4123-a26e-9c7e443d42c0` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-a27ad877-8b59-4123-a26e-9c7e443d42c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a27ad877-8b59-4123-a26e-9c7e443d42c0
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a27ad877-8b59-4123-a26e-9c7e443d42c0
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
