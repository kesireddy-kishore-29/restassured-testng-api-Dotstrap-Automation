# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-52abe1ef1473, displayName=Name, password=pw-7f65ab74-575c-4070-9934-b7315d9cdfa2, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 14 | `qa-da7b65d1-e310-44b9-99d8-2d897f050049` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da7b65d1-e310-44b9-99d8-2d897f050049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da7b65d1-e310-44b9-99d8-2d897f050049
Content-Type: application/json

--- request body ---
{"handle":"qa-52abe1ef1473","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 14 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da7b65d1-e310-44b9-99d8-2d897f050049
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-da7b65d1-e310-44b9-99d8-2d897f050049","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
