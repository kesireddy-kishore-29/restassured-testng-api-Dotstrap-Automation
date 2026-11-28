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
| 1 | `GET /health` | 200 | 313 | `qa-89b2329b-61f7-4f08-a906-5fc516cd1b2f` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-89b2329b-61f7-4f08-a906-5fc516cd1b2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89b2329b-61f7-4f08-a906-5fc516cd1b2f
Content-Type: application/json

--- response: 200 in 313 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-89b2329b-61f7-4f08-a906-5fc516cd1b2f
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
