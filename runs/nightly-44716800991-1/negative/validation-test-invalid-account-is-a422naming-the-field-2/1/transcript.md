# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-9703ea8e50c5, displayName=   , password=pw-217d5867-2430-41fd-a5b0-3e893e6d26b0, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 294 | `qa-75dfb75a-1998-4e23-9d26-2c8d76bf0152` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75dfb75a-1998-4e23-9d26-2c8d76bf0152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75dfb75a-1998-4e23-9d26-2c8d76bf0152
Content-Type: application/json

--- request body ---
{"handle":"qa-9703ea8e50c5","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 294 ms ---
Date: Fri, 20 Nov 2026 10:09:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75dfb75a-1998-4e23-9d26-2c8d76bf0152
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-75dfb75a-1998-4e23-9d26-2c8d76bf0152","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
