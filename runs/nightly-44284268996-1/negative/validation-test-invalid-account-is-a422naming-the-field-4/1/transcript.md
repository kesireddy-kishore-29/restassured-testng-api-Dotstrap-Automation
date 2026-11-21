# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-a78f09b5b112, displayName=Name, password=pw-a3a63237-97b3-420d-a7fe-2ad986dee123, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-3a36524e-7efc-41f5-8424-9ee3aee65338` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a36524e-7efc-41f5-8424-9ee3aee65338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a36524e-7efc-41f5-8424-9ee3aee65338
Content-Type: application/json

--- request body ---
{"handle":"qa-a78f09b5b112","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a36524e-7efc-41f5-8424-9ee3aee65338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-3a36524e-7efc-41f5-8424-9ee3aee65338","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
