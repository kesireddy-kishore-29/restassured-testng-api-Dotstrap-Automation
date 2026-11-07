# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-8cb235d43002, displayName=Name, password=pw-709204a9-56ce-44d6-a7e8-a6e1843e4ef1, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-ab8b1ce0-ca93-44dd-95f1-1d2fddaa05a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab8b1ce0-ca93-44dd-95f1-1d2fddaa05a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab8b1ce0-ca93-44dd-95f1-1d2fddaa05a5
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb235d43002","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab8b1ce0-ca93-44dd-95f1-1d2fddaa05a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-ab8b1ce0-ca93-44dd-95f1-1d2fddaa05a5","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
