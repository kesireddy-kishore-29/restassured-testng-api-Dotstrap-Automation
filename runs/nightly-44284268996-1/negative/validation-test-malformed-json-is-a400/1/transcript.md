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
| 1 | `POST /v1/accounts` | 400 | 420 | `qa-90cb97df-85b2-4801-8e0d-fddd51afe28c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90cb97df-85b2-4801-8e0d-fddd51afe28c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90cb97df-85b2-4801-8e0d-fddd51afe28c
Content-Type: application/json

--- request body ---
{"handle": 

--- response: 400 in 420 ms ---
Date: Wed, 18 Nov 2026 10:19:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90cb97df-85b2-4801-8e0d-fddd51afe28c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-90cb97df-85b2-4801-8e0d-fddd51afe28c"}
```
