# Transcript: An invalid account request is a 422 naming the field [handle too short, NewAccount[handle=ab, displayName=Name, password=pw-38522e50-44fa-4c7f-8ecd-773116ec9457, region=eu], handle]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[0]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 432 | `qa-6335d873-8262-46f9-b496-9b747f427cc5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6335d873-8262-46f9-b496-9b747f427cc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6335d873-8262-46f9-b496-9b747f427cc5
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 432 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6335d873-8262-46f9-b496-9b747f427cc5
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
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6335d873-8262-46f9-b496-9b747f427cc5","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```
