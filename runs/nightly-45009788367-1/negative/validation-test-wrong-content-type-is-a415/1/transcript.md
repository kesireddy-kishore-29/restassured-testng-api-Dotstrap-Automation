# Transcript: A body that is not application/json is a 415

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#wrongContentTypeIsA415` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 415 | 23 | `qa-88c94cf9-c2e9-4dd7-8c38-cbe1d3ec683f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88c94cf9-c2e9-4dd7-8c38-cbe1d3ec683f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88c94cf9-c2e9-4dd7-8c38-cbe1d3ec683f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
handle=qa-x

--- response: 415 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88c94cf9-c2e9-4dd7-8c38-cbe1d3ec683f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-88c94cf9-c2e9-4dd7-8c38-cbe1d3ec683f"}
```
