# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007d49e043b508@118f819b]

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
| 1 | `GET /health` | 200 | 421 | `qa-7c6f8d19-9102-49c4-a95a-5f45c87e4d7e` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-7c6f8d19-9102-49c4-a95a-5f45c87e4d7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c6f8d19-9102-49c4-a95a-5f45c87e4d7e
Content-Type: application/json

--- response: 200 in 421 ms ---
Date: Fri, 23 Oct 2026 07:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c6f8d19-9102-49c4-a95a-5f45c87e4d7e
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
