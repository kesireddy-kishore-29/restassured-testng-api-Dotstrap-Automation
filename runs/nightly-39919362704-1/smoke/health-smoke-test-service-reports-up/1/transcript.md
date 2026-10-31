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
| 1 | `GET /health` | 200 | 20 | `qa-2f9042f1-75f9-4a39-ba7a-83f6bcc05adf` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-2f9042f1-75f9-4a39-ba7a-83f6bcc05adf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f9042f1-75f9-4a39-ba7a-83f6bcc05adf
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f9042f1-75f9-4a39-ba7a-83f6bcc05adf
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
