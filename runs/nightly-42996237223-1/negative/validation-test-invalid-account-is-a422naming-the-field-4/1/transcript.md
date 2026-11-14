# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-ebe191480c14, displayName=Name, password=pw-346051d4-bb19-4b18-819b-71970d214c52, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 16 | `qa-548f7e49-c48b-4db0-9dcf-ba633b811176` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-548f7e49-c48b-4db0-9dcf-ba633b811176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-548f7e49-c48b-4db0-9dcf-ba633b811176
Content-Type: application/json

--- request body ---
{"handle":"qa-ebe191480c14","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-548f7e49-c48b-4db0-9dcf-ba633b811176
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-548f7e49-c48b-4db0-9dcf-ba633b811176","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
