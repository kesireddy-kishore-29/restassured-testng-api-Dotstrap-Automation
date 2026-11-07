# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-cc3474f9fa86, displayName=Name, password=pw-7ed519af-7b8b-4d11-917a-fb6aa3893364, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 12 | `qa-53278874-4a7d-4b6a-a66b-554ec9e561da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53278874-4a7d-4b6a-a66b-554ec9e561da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53278874-4a7d-4b6a-a66b-554ec9e561da
Content-Type: application/json

--- request body ---
{"handle":"qa-cc3474f9fa86","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53278874-4a7d-4b6a-a66b-554ec9e561da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-53278874-4a7d-4b6a-a66b-554ec9e561da","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
