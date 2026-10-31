# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-a46b98fd7745, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 366 | `qa-aa9a712c-bd22-4a23-9537-dbf0bd0172ba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aa9a712c-bd22-4a23-9537-dbf0bd0172ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa9a712c-bd22-4a23-9537-dbf0bd0172ba
Content-Type: application/json

--- request body ---
{"handle":"qa-a46b98fd7745","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 366 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa9a712c-bd22-4a23-9537-dbf0bd0172ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-aa9a712c-bd22-4a23-9537-dbf0bd0172ba","errors":[{"field":"password","message":"8-72 characters"}]}
```
