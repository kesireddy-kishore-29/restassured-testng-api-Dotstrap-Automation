# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-2eb6679c632b, displayName=Name, password=pw-675f8b30-de93-46ee-95c6-7c6e16fdfdcd, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 12 | `qa-61ab5cd4-dc7f-4616-b040-039d987d996c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61ab5cd4-dc7f-4616-b040-039d987d996c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61ab5cd4-dc7f-4616-b040-039d987d996c
Content-Type: application/json

--- request body ---
{"handle":"qa-2eb6679c632b","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61ab5cd4-dc7f-4616-b040-039d987d996c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 8
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-61ab5cd4-dc7f-4616-b040-039d987d996c","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
