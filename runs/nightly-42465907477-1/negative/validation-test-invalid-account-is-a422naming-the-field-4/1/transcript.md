# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-7a37eb4db285, displayName=Name, password=pw-6b774b21-0023-4254-82a4-e400fe780885, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 16 | `qa-e5bf41b5-4f92-4f79-ab73-3abbfb9d25ef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5bf41b5-4f92-4f79-ab73-3abbfb9d25ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5bf41b5-4f92-4f79-ab73-3abbfb9d25ef
Content-Type: application/json

--- request body ---
{"handle":"qa-7a37eb4db285","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5bf41b5-4f92-4f79-ab73-3abbfb9d25ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-e5bf41b5-4f92-4f79-ab73-3abbfb9d25ef","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
