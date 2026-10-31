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
| 1 | `GET /health` | 200 | 21 | `qa-0859bf3e-945b-4d55-abd6-8aa3be2f8ceb` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-0859bf3e-945b-4d55-abd6-8aa3be2f8ceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0859bf3e-945b-4d55-abd6-8aa3be2f8ceb
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 30 Oct 2026 08:45:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0859bf3e-945b-4d55-abd6-8aa3be2f8ceb
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
