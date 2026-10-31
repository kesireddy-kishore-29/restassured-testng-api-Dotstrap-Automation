# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-d1bca1ea9d6a, displayName=Name, password=pw-e3a3cb53-d72a-4706-8859-79d3feeb2da7, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-6051416d-56f2-494c-9a5c-87a446cc31db` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6051416d-56f2-494c-9a5c-87a446cc31db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6051416d-56f2-494c-9a5c-87a446cc31db
Content-Type: application/json

--- request body ---
{"handle":"qa-d1bca1ea9d6a","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6051416d-56f2-494c-9a5c-87a446cc31db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6051416d-56f2-494c-9a5c-87a446cc31db","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
