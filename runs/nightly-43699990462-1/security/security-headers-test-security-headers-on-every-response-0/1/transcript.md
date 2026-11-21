# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007da32043b580@7916256f]

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
| 1 | `GET /health` | 200 | 356 | `qa-c8c818a3-3ec4-4bec-a61b-bdbf65c726fa` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-c8c818a3-3ec4-4bec-a61b-bdbf65c726fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c818a3-3ec4-4bec-a61b-bdbf65c726fa
Content-Type: application/json

--- response: 200 in 356 ms ---
Date: Sun, 15 Nov 2026 09:36:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8c818a3-3ec4-4bec-a61b-bdbf65c726fa
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
