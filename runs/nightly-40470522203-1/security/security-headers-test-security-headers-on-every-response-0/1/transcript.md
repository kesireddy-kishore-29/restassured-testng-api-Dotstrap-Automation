# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007c8a2c43b040@353c0b67]

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
| 1 | `GET /health` | 200 | 420 | `qa-38b35a03-79b8-4b77-9029-a26646a0fea0` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-38b35a03-79b8-4b77-9029-a26646a0fea0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38b35a03-79b8-4b77-9029-a26646a0fea0
Content-Type: application/json

--- response: 200 in 420 ms ---
Date: Tue, 27 Oct 2026 08:00:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-38b35a03-79b8-4b77-9029-a26646a0fea0
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
