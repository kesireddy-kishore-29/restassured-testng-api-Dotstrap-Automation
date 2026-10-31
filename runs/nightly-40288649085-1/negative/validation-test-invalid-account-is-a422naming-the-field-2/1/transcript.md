# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-a0814ae9aee5, displayName=   , password=pw-afffd7de-6c56-4d36-84a8-92b6235aaed6, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 614 | `qa-26548907-9b7d-4824-be82-ad3f779a1061` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26548907-9b7d-4824-be82-ad3f779a1061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26548907-9b7d-4824-be82-ad3f779a1061
Content-Type: application/json

--- request body ---
{"handle":"qa-a0814ae9aee5","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 614 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26548907-9b7d-4824-be82-ad3f779a1061
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
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-26548907-9b7d-4824-be82-ad3f779a1061","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
