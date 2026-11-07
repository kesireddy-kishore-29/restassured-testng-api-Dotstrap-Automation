# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-8cb235d43002, displayName=   , password=pw-709204a9-56ce-44d6-a7e8-a6e1843e4ef1, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 33 | `qa-2ed222b0-ecff-413d-97db-154c481dbee0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ed222b0-ecff-413d-97db-154c481dbee0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ed222b0-ecff-413d-97db-154c481dbee0
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb235d43002","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ed222b0-ecff-413d-97db-154c481dbee0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2ed222b0-ecff-413d-97db-154c481dbee0","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
