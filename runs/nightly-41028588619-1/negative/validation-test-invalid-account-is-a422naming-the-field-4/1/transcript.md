# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-cdc505e763c1, displayName=Name, password=pw-ad879074-fe5c-41a1-aa50-4cff7f2eaa5f, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 13 | `qa-7d37ec50-bc65-4c06-8b1e-78e1b5cb0796` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d37ec50-bc65-4c06-8b1e-78e1b5cb0796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d37ec50-bc65-4c06-8b1e-78e1b5cb0796
Content-Type: application/json

--- request body ---
{"handle":"qa-cdc505e763c1","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 13 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d37ec50-bc65-4c06-8b1e-78e1b5cb0796
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-7d37ec50-bc65-4c06-8b1e-78e1b5cb0796","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
