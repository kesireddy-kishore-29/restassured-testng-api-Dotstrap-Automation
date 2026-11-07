# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007fcd6443b6c0@2bb0e6ac]

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
| 1 | `GET /health` | 200 | 351 | `qa-eca173b1-ff67-45a2-b28a-c633c1bff177` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-eca173b1-ff67-45a2-b28a-c633c1bff177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eca173b1-ff67-45a2-b28a-c633c1bff177
Content-Type: application/json

--- response: 200 in 351 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-eca173b1-ff67-45a2-b28a-c633c1bff177
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
