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
| 1 | `POST /v1/accounts` | 400 | 21 | `qa-dc32424f-2f2f-493b-bff0-a221b53ef71d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dc32424f-2f2f-493b-bff0-a221b53ef71d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc32424f-2f2f-493b-bff0-a221b53ef71d
Content-Type: application/json

--- request body ---
{"handle": 

--- response: 400 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc32424f-2f2f-493b-bff0-a221b53ef71d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-dc32424f-2f2f-493b-bff0-a221b53ef71d"}
```
