# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000070477843ba18@f3c01ed]

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
| 1 | `GET /health` | 200 | 298 | `qa-c7a9c1c6-c554-4ba3-8245-d36b62e53d1a` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-c7a9c1c6-c554-4ba3-8245-d36b62e53d1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a9c1c6-c554-4ba3-8245-d36b62e53d1a
Content-Type: application/json

--- response: 200 in 298 ms ---
Date: Tue, 24 Nov 2026 12:38:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7a9c1c6-c554-4ba3-8245-d36b62e53d1a
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
