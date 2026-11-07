# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007e9e9c42a568@57209d2a]

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
| 1 | `GET /health` | 200 | 430 | `qa-95e61937-2217-42b8-aed4-4402407a0597` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-95e61937-2217-42b8-aed4-4402407a0597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95e61937-2217-42b8-aed4-4402407a0597
Content-Type: application/json

--- response: 200 in 430 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-95e61937-2217-42b8-aed4-4402407a0597
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
