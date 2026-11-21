# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-152f9eb98435, displayName=Name, password=pw-09249070-79ee-4c5b-a87b-bdc7a541b8e7, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 7 | `qa-6e02786e-e72c-4bd0-ba43-34deddd1fa9d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e02786e-e72c-4bd0-ba43-34deddd1fa9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e02786e-e72c-4bd0-ba43-34deddd1fa9d
Content-Type: application/json

--- request body ---
{"handle":"qa-152f9eb98435","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e02786e-e72c-4bd0-ba43-34deddd1fa9d
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6e02786e-e72c-4bd0-ba43-34deddd1fa9d","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
