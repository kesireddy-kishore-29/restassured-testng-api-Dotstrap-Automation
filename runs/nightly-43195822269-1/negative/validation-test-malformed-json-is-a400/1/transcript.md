# Transcript: A body that is not JSON is a 400 malformed-json problem

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#malformedJsonIsA400` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 400 | 504 | `qa-e08e2dc0-1b0d-4213-920e-bc5f73c9efe8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e08e2dc0-1b0d-4213-920e-bc5f73c9efe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e08e2dc0-1b0d-4213-920e-bc5f73c9efe8
Content-Type: application/json

--- request body ---
{"handle": 

--- response: 400 in 504 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e08e2dc0-1b0d-4213-920e-bc5f73c9efe8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-e08e2dc0-1b0d-4213-920e-bc5f73c9efe8"}
```
