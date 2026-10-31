# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x0000728b4c43cec0@2bb0e6ac]

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
| 1 | `GET /health` | 200 | 418 | `qa-f91eba6b-10ba-4225-9af7-ea943e97ad02` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-f91eba6b-10ba-4225-9af7-ea943e97ad02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f91eba6b-10ba-4225-9af7-ea943e97ad02
Content-Type: application/json

--- response: 200 in 418 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-f91eba6b-10ba-4225-9af7-ea943e97ad02
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
