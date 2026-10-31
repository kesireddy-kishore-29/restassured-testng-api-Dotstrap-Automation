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
| 1 | `POST /v1/accounts` | 415 | 23 | `qa-c48de32c-ae36-417a-adb4-a196f53b1d1a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c48de32c-ae36-417a-adb4-a196f53b1d1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c48de32c-ae36-417a-adb4-a196f53b1d1a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
handle=qa-x

--- response: 415 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c48de32c-ae36-417a-adb4-a196f53b1d1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-c48de32c-ae36-417a-adb4-a196f53b1d1a"}
```
