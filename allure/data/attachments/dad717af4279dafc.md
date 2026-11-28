# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-6dbdea95853d, displayName=   , password=pw-52d53b69-195d-42bf-8444-fce7ef04b39d, region=eu], displayName]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[2]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 423 | `qa-5027a9cd-24aa-48f2-a3b6-8104448a1c0f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5027a9cd-24aa-48f2-a3b6-8104448a1c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5027a9cd-24aa-48f2-a3b6-8104448a1c0f
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbdea95853d","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 423 ms ---
Date: Sat, 28 Nov 2026 10:37:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5027a9cd-24aa-48f2-a3b6-8104448a1c0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-5027a9cd-24aa-48f2-a3b6-8104448a1c0f","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
