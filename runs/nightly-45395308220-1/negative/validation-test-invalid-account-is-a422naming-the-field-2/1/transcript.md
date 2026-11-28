# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-4823693655c9, displayName=   , password=pw-425e4f18-1dea-4de4-a07d-c1688b3e2417, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 350 | `qa-7f1d025a-2dd1-461a-bb27-1c728ba9b2b5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7f1d025a-2dd1-461a-bb27-1c728ba9b2b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1d025a-2dd1-461a-bb27-1c728ba9b2b5
Content-Type: application/json

--- request body ---
{"handle":"qa-4823693655c9","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 350 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f1d025a-2dd1-461a-bb27-1c728ba9b2b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-7f1d025a-2dd1-461a-bb27-1c728ba9b2b5","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
