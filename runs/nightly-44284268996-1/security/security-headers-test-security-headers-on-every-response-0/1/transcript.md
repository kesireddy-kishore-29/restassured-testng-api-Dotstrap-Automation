# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000076c6d843c0f0@e6b0dcf]

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
| 1 | `GET /health` | 200 | 433 | `qa-64b65357-dcc4-424d-b806-3f5c734f480a` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-64b65357-dcc4-424d-b806-3f5c734f480a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b65357-dcc4-424d-b806-3f5c734f480a
Content-Type: application/json

--- response: 200 in 433 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b65357-dcc4-424d-b806-3f5c734f480a
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
