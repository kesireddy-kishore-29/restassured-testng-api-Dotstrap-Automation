# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-2eb6679c632b, displayName=   , password=pw-675f8b30-de93-46ee-95c6-7c6e16fdfdcd, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 37 | `qa-0f65c89e-fbc1-4fd4-87cf-7b524ab1efa4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0f65c89e-fbc1-4fd4-87cf-7b524ab1efa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f65c89e-fbc1-4fd4-87cf-7b524ab1efa4
Content-Type: application/json

--- request body ---
{"handle":"qa-2eb6679c632b","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f65c89e-fbc1-4fd4-87cf-7b524ab1efa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 8
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-0f65c89e-fbc1-4fd4-87cf-7b524ab1efa4","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
