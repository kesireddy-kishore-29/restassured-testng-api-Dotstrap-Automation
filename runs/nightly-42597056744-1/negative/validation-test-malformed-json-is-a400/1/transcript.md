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
| 1 | `POST /v1/accounts` | 400 | 392 | `qa-d66fd9eb-dcfd-4902-8fab-1ea1d8d865e3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d66fd9eb-dcfd-4902-8fab-1ea1d8d865e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d66fd9eb-dcfd-4902-8fab-1ea1d8d865e3
Content-Type: application/json

--- request body ---
{"handle": 

--- response: 400 in 392 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d66fd9eb-dcfd-4902-8fab-1ea1d8d865e3
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-d66fd9eb-dcfd-4902-8fab-1ea1d8d865e3"}
```
