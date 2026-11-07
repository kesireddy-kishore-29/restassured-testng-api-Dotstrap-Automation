# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-752ed8f1e308, displayName=Name, password=pw-17b7749c-7a13-4cac-a838-74d07e841461, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 18 | `qa-5586b929-43ba-4449-9489-1ea6c536e871` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5586b929-43ba-4449-9489-1ea6c536e871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5586b929-43ba-4449-9489-1ea6c536e871
Content-Type: application/json

--- request body ---
{"handle":"qa-752ed8f1e308","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5586b929-43ba-4449-9489-1ea6c536e871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-5586b929-43ba-4449-9489-1ea6c536e871","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
