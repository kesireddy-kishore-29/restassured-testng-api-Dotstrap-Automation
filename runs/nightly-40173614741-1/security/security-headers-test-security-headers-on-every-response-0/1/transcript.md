# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000073204443bfb8@24b8fc5f]

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
| 1 | `GET /health` | 200 | 344 | `qa-491a9096-7bcf-4d3a-b42d-22dc279080bf` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-491a9096-7bcf-4d3a-b42d-22dc279080bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-491a9096-7bcf-4d3a-b42d-22dc279080bf
Content-Type: application/json

--- response: 200 in 344 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-491a9096-7bcf-4d3a-b42d-22dc279080bf
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
