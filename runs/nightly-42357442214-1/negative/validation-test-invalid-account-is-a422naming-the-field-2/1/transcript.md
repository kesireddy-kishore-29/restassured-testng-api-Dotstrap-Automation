# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-079c775bb365, displayName=   , password=pw-d1ddf6c2-0be8-4517-a944-3ef4c40d078e, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 335 | `qa-35fde88f-80cd-4adf-aafd-bc71e163463c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35fde88f-80cd-4adf-aafd-bc71e163463c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35fde88f-80cd-4adf-aafd-bc71e163463c
Content-Type: application/json

--- request body ---
{"handle":"qa-079c775bb365","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 335 ms ---
Date: Sat, 07 Nov 2026 08:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35fde88f-80cd-4adf-aafd-bc71e163463c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-35fde88f-80cd-4adf-aafd-bc71e163463c","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
