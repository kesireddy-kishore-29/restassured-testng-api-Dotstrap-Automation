# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000073cb7043dc78@1eea89a8]

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
| 1 | `GET /health` | 200 | 472 | `qa-15fea501-414f-47a6-b840-7e102c7922b2` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-15fea501-414f-47a6-b840-7e102c7922b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15fea501-414f-47a6-b840-7e102c7922b2
Content-Type: application/json

--- response: 200 in 472 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-15fea501-414f-47a6-b840-7e102c7922b2
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
