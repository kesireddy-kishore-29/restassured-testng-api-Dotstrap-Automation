# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-d65f7ae95911, displayName=Name, password=pw-d09d8e32-b2b8-4a24-abc5-899238945303, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-03c80361-cb46-4e7d-8d82-a6b88c6b9703` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-03c80361-cb46-4e7d-8d82-a6b88c6b9703

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03c80361-cb46-4e7d-8d82-a6b88c6b9703
Content-Type: application/json

--- request body ---
{"handle":"qa-d65f7ae95911","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03c80361-cb46-4e7d-8d82-a6b88c6b9703
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-03c80361-cb46-4e7d-8d82-a6b88c6b9703","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
