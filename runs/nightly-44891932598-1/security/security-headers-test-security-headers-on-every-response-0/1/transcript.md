# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007570a443b338@6d07ba8b]

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
| 1 | `GET /health` | 200 | 389 | `qa-087fc92d-5ace-41c7-a58d-65624cc90bcf` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-087fc92d-5ace-41c7-a58d-65624cc90bcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-087fc92d-5ace-41c7-a58d-65624cc90bcf
Content-Type: application/json

--- response: 200 in 389 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-087fc92d-5ace-41c7-a58d-65624cc90bcf
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
