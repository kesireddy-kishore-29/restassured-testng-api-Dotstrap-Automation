# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x0000747658439dd0@31fcfa80]

| | |
|---|---|
| Test | `com.qaautomation.tests.security.SecurityHeadersTest#securityHeadersOnEveryResponse[0]` |
| Features | FEAT-SEC-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /health` | 200 | 390 | `qa-595e2b9c-4bb3-4267-82bf-a3da895dfc5d` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-595e2b9c-4bb3-4267-82bf-a3da895dfc5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-595e2b9c-4bb3-4267-82bf-a3da895dfc5d
Content-Type: application/json

--- response: 200 in 390 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-595e2b9c-4bb3-4267-82bf-a3da895dfc5d
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
