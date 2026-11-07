# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007277e842a988@b5163e1]

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
| 1 | `GET /health` | 200 | 426 | `qa-c3f0f80f-d2ca-4b22-8df2-87e1cd8dffe9` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-c3f0f80f-d2ca-4b22-8df2-87e1cd8dffe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f0f80f-d2ca-4b22-8df2-87e1cd8dffe9
Content-Type: application/json

--- response: 200 in 426 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3f0f80f-d2ca-4b22-8df2-87e1cd8dffe9
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
