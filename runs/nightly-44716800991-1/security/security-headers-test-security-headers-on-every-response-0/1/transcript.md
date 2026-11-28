# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007795dc43c648@667cd13f]

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
| 1 | `GET /health` | 200 | 290 | `qa-77de63f9-34d0-48a8-bd7a-3aefa83dc35d` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-77de63f9-34d0-48a8-bd7a-3aefa83dc35d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77de63f9-34d0-48a8-bd7a-3aefa83dc35d
Content-Type: application/json

--- response: 200 in 290 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-77de63f9-34d0-48a8-bd7a-3aefa83dc35d
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
