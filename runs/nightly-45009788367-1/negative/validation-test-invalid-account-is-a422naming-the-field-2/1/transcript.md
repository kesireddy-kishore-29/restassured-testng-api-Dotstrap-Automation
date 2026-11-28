# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-64f5d30360e6, displayName=   , password=pw-9eba11ba-1a58-4a52-b3af-1859449f2faf, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 476 | `qa-29b68b2e-06f7-439b-a839-c1ae1b0d30ec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29b68b2e-06f7-439b-a839-c1ae1b0d30ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29b68b2e-06f7-439b-a839-c1ae1b0d30ec
Content-Type: application/json

--- request body ---
{"handle":"qa-64f5d30360e6","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 476 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29b68b2e-06f7-439b-a839-c1ae1b0d30ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-29b68b2e-06f7-439b-a839-c1ae1b0d30ec","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
