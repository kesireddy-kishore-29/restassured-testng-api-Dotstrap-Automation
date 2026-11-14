# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-ffd446c46237, displayName=Name, password=short, region=eu], password]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[3]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 537 | `qa-bf6b5c8c-ae1b-477c-8fb9-44ea52649d7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf6b5c8c-ae1b-477c-8fb9-44ea52649d7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf6b5c8c-ae1b-477c-8fb9-44ea52649d7f
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd446c46237","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 537 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf6b5c8c-ae1b-477c-8fb9-44ea52649d7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-bf6b5c8c-ae1b-477c-8fb9-44ea52649d7f","errors":[{"field":"password","message":"8-72 characters"}]}
```
