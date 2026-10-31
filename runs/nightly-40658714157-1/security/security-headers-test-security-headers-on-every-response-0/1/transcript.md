# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000073adbc43dd40@6480bc24]

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
| 1 | `GET /health` | 200 | 423 | `qa-202f6a88-eeb0-4e81-90b9-0b94977d5aee` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-202f6a88-eeb0-4e81-90b9-0b94977d5aee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-202f6a88-eeb0-4e81-90b9-0b94977d5aee
Content-Type: application/json

--- response: 200 in 423 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-202f6a88-eeb0-4e81-90b9-0b94977d5aee
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
