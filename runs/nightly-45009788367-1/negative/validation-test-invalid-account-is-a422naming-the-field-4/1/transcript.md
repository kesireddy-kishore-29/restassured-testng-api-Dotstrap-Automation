# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-64f5d30360e6, displayName=Name, password=pw-9eba11ba-1a58-4a52-b3af-1859449f2faf, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 16 | `qa-4516cdc2-a5f4-403d-a6a6-d0907c7dfa9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4516cdc2-a5f4-403d-a6a6-d0907c7dfa9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4516cdc2-a5f4-403d-a6a6-d0907c7dfa9f
Content-Type: application/json

--- request body ---
{"handle":"qa-64f5d30360e6","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4516cdc2-a5f4-403d-a6a6-d0907c7dfa9f
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-4516cdc2-a5f4-403d-a6a6-d0907c7dfa9f","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
