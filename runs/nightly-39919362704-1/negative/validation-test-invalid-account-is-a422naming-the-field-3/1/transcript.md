# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-ccee3bb7b895, displayName=Name, password=short, region=eu], password]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[3]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 487 | `qa-afcff822-6c0f-4b34-9ec8-8abafc1ea362` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-afcff822-6c0f-4b34-9ec8-8abafc1ea362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afcff822-6c0f-4b34-9ec8-8abafc1ea362
Content-Type: application/json

--- request body ---
{"handle":"qa-ccee3bb7b895","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 487 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afcff822-6c0f-4b34-9ec8-8abafc1ea362
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-afcff822-6c0f-4b34-9ec8-8abafc1ea362","errors":[{"field":"password","message":"8-72 characters"}]}
```
