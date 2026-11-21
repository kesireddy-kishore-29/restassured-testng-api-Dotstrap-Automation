# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-814ce68d8672, displayName=Name, password=pw-09ec9252-c5cb-4bab-9295-7377a206a253, region=mars], region]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[4]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 19 | `qa-133367f4-61a1-4d70-afce-cb1aa2f6215e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-133367f4-61a1-4d70-afce-cb1aa2f6215e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-133367f4-61a1-4d70-afce-cb1aa2f6215e
Content-Type: application/json

--- request body ---
{"handle":"qa-814ce68d8672","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-133367f4-61a1-4d70-afce-cb1aa2f6215e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-133367f4-61a1-4d70-afce-cb1aa2f6215e","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
