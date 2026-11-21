# Transcript: An invalid account request is a 422 naming the field [handle with capitals, NewAccount[handle=Bad-Handle, displayName=Name, password=pw-a3a63237-97b3-420d-a7fe-2ad986dee123, region=eu], handle]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[1]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 410 | `qa-077ddaf0-6bb7-4965-9a6a-254b4000f4fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-077ddaf0-6bb7-4965-9a6a-254b4000f4fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-077ddaf0-6bb7-4965-9a6a-254b4000f4fb
Content-Type: application/json

--- request body ---
{"handle":"Bad-Handle","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 410 ms ---
Date: Wed, 18 Nov 2026 10:19:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-077ddaf0-6bb7-4965-9a6a-254b4000f4fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-077ddaf0-6bb7-4965-9a6a-254b4000f4fb","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```
