# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-a0814ae9aee5, displayName=Name, password=pw-afffd7de-6c56-4d36-84a8-92b6235aaed6, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 21 | `qa-ce742ad4-f6f1-4257-a5a7-2acffa0b1b73` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce742ad4-f6f1-4257-a5a7-2acffa0b1b73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce742ad4-f6f1-4257-a5a7-2acffa0b1b73
Content-Type: application/json

--- request body ---
{"handle":"qa-a0814ae9aee5","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce742ad4-f6f1-4257-a5a7-2acffa0b1b73
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-ce742ad4-f6f1-4257-a5a7-2acffa0b1b73","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
