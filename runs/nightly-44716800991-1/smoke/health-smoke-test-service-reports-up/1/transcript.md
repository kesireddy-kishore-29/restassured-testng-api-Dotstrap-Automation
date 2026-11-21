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
| 1 | `GET /health` | 200 | 15 | `qa-f6f79c31-72a8-42cc-bad0-3b06fe728d6d` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-f6f79c31-72a8-42cc-bad0-3b06fe728d6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6f79c31-72a8-42cc-bad0-3b06fe728d6d
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6f79c31-72a8-42cc-bad0-3b06fe728d6d
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
