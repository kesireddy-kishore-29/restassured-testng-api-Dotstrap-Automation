# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-cc3474f9fa86, displayName=   , password=pw-7ed519af-7b8b-4d11-917a-fb6aa3893364, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 11 | `qa-16d8de74-3943-424c-9af0-8d81694ae86e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-16d8de74-3943-424c-9af0-8d81694ae86e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d8de74-3943-424c-9af0-8d81694ae86e
Content-Type: application/json

--- request body ---
{"handle":"qa-cc3474f9fa86","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16d8de74-3943-424c-9af0-8d81694ae86e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-16d8de74-3943-424c-9af0-8d81694ae86e","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
