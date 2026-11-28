# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-9703ea8e50c5, displayName=Name, password=pw-217d5867-2430-41fd-a5b0-3e893e6d26b0, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 9 | `qa-6283580d-79c8-43dd-a69e-eda73ebfdee4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6283580d-79c8-43dd-a69e-eda73ebfdee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6283580d-79c8-43dd-a69e-eda73ebfdee4
Content-Type: application/json

--- request body ---
{"handle":"qa-9703ea8e50c5","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 9 ms ---
Date: Fri, 20 Nov 2026 10:09:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6283580d-79c8-43dd-a69e-eda73ebfdee4
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6283580d-79c8-43dd-a69e-eda73ebfdee4","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
