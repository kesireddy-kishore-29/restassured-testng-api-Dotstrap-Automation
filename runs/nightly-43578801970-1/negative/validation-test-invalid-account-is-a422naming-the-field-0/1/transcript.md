# Transcript: An invalid account request is a 422 naming the field [handle too short, NewAccount[handle=ab, displayName=Name, password=pw-09ec9252-c5cb-4bab-9295-7377a206a253, region=eu], handle]

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
| 1 | `POST /v1/accounts` | 422 | 531 | `qa-2feceeae-be7f-4876-a1f8-ba68b9a2b7b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2feceeae-be7f-4876-a1f8-ba68b9a2b7b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2feceeae-be7f-4876-a1f8-ba68b9a2b7b2
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 531 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2feceeae-be7f-4876-a1f8-ba68b9a2b7b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2feceeae-be7f-4876-a1f8-ba68b9a2b7b2","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```
