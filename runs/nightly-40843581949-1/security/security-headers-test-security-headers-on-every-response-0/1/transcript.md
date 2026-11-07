# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007429b842d150@70895f4c]

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
| 1 | `GET /health` | 200 | 395 | `qa-e48cc35c-4920-4b6e-ab25-adabf2e17533` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-e48cc35c-4920-4b6e-ab25-adabf2e17533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48cc35c-4920-4b6e-ab25-adabf2e17533
Content-Type: application/json

--- response: 200 in 395 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e48cc35c-4920-4b6e-ab25-adabf2e17533
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
