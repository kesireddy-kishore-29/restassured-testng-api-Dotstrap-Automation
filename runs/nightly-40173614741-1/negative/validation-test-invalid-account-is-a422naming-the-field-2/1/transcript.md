# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-e2babd3f081d, displayName=   , password=pw-0838f2b8-a51d-4b7d-8233-0196ff0962fb, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 489 | `qa-3f824b13-462e-467a-96c2-50b040dc34b6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3f824b13-462e-467a-96c2-50b040dc34b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f824b13-462e-467a-96c2-50b040dc34b6
Content-Type: application/json

--- request body ---
{"handle":"qa-e2babd3f081d","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 489 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f824b13-462e-467a-96c2-50b040dc34b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-3f824b13-462e-467a-96c2-50b040dc34b6","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
