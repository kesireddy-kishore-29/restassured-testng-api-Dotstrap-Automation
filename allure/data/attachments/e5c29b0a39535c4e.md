# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-52abe1ef1473, displayName=   , password=pw-7f65ab74-575c-4070-9934-b7315d9cdfa2, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 344 | `qa-fa3dde4a-d2a9-4668-a034-3db24f126654` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fa3dde4a-d2a9-4668-a034-3db24f126654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa3dde4a-d2a9-4668-a034-3db24f126654
Content-Type: application/json

--- request body ---
{"handle":"qa-52abe1ef1473","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 344 ms ---
Date: Sat, 21 Nov 2026 09:56:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa3dde4a-d2a9-4668-a034-3db24f126654
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
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-fa3dde4a-d2a9-4668-a034-3db24f126654","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
