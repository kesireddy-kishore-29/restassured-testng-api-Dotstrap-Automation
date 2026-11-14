# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x00007f9a8843bda0@55d39dbc]

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
| 1 | `GET /health` | 200 | 387 | `qa-5498c98c-50b8-4b39-bd0f-da65bf854828` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-5498c98c-50b8-4b39-bd0f-da65bf854828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5498c98c-50b8-4b39-bd0f-da65bf854828
Content-Type: application/json

--- response: 200 in 387 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5498c98c-50b8-4b39-bd0f-da65bf854828
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
