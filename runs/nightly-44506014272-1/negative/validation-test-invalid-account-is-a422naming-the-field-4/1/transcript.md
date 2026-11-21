# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-782f816629d0, displayName=Name, password=pw-38522e50-44fa-4c7f-8ecd-773116ec9457, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 14 | `qa-f1b2e0fb-b2e3-4a3d-809f-f982d20933a5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f1b2e0fb-b2e3-4a3d-809f-f982d20933a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b2e0fb-b2e3-4a3d-809f-f982d20933a5
Content-Type: application/json

--- request body ---
{"handle":"qa-782f816629d0","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1b2e0fb-b2e3-4a3d-809f-f982d20933a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-f1b2e0fb-b2e3-4a3d-809f-f982d20933a5","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
