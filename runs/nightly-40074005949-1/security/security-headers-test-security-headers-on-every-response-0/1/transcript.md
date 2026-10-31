# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x0000701e3043ccf0@478289b2]

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
| 1 | `GET /health` | 200 | 372 | `qa-db6f1e61-0b85-4363-9a26-80969783d0dc` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-db6f1e61-0b85-4363-9a26-80969783d0dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db6f1e61-0b85-4363-9a26-80969783d0dc
Content-Type: application/json

--- response: 200 in 372 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-db6f1e61-0b85-4363-9a26-80969783d0dc
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
