# Transcript: Every response carries the security headers and no server banner [200 health, com.qaautomation.tests.security.SecurityHeadersTest$$Lambda/0x000079bb9043dc28@167b03d8]

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
| 1 | `GET /health` | 200 | 314 | `qa-b84d58c7-a3cc-458a-8627-b22c1af9f043` |

## 1. GET /health

```text
#1 GET http://localhost:7070/health
correlation: qa-b84d58c7-a3cc-458a-8627-b22c1af9f043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b84d58c7-a3cc-458a-8627-b22c1af9f043
Content-Type: application/json

--- response: 200 in 314 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b84d58c7-a3cc-458a-8627-b22c1af9f043
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
