# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-c539bd62d30a, displayName=   , password=pw-b14f60c2-09b3-4323-ac8d-a761e82bd311, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 435 | `qa-d023427c-a3d5-4c62-9d26-068f2ab062f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d023427c-a3d5-4c62-9d26-068f2ab062f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d023427c-a3d5-4c62-9d26-068f2ab062f2
Content-Type: application/json

--- request body ---
{"handle":"qa-c539bd62d30a","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 435 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d023427c-a3d5-4c62-9d26-068f2ab062f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d023427c-a3d5-4c62-9d26-068f2ab062f2","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
