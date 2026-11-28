# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-4823693655c9, displayName=Name, password=pw-425e4f18-1dea-4de4-a07d-c1688b3e2417, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-9bffedbb-f842-432a-8870-8769287f8d71` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9bffedbb-f842-432a-8870-8769287f8d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bffedbb-f842-432a-8870-8769287f8d71
Content-Type: application/json

--- request body ---
{"handle":"qa-4823693655c9","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bffedbb-f842-432a-8870-8769287f8d71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-9bffedbb-f842-432a-8870-8769287f8d71","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
