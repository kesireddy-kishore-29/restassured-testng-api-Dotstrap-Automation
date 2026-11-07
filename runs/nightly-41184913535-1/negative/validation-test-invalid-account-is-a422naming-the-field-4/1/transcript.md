# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-1256fda2f150, displayName=Name, password=pw-2e6e058f-26b1-4df1-9d15-835c1458fe00, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 13 | `qa-839fb634-65eb-4074-a6b0-c613177e6700` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-839fb634-65eb-4074-a6b0-c613177e6700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839fb634-65eb-4074-a6b0-c613177e6700
Content-Type: application/json

--- request body ---
{"handle":"qa-1256fda2f150","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-839fb634-65eb-4074-a6b0-c613177e6700
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-839fb634-65eb-4074-a6b0-c613177e6700","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
