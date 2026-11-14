# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-a9df1038f8cd, displayName=   , password=pw-1640f5fb-5582-4a01-91b2-2090d9149576, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 388 | `qa-679cda2c-838f-451e-92c6-400549c72342` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-679cda2c-838f-451e-92c6-400549c72342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-679cda2c-838f-451e-92c6-400549c72342
Content-Type: application/json

--- request body ---
{"handle":"qa-a9df1038f8cd","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 388 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-679cda2c-838f-451e-92c6-400549c72342
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-679cda2c-838f-451e-92c6-400549c72342","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
