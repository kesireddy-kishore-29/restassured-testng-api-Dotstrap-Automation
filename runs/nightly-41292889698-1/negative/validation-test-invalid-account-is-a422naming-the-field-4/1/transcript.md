# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-d0a719c4d6f3, displayName=Name, password=pw-e434ecc7-ce24-45b0-bcb1-c47af4a53524, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 44 | `qa-cd61029b-1ea8-456f-b72a-ea8e2f804f4c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd61029b-1ea8-456f-b72a-ea8e2f804f4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd61029b-1ea8-456f-b72a-ea8e2f804f4c
Content-Type: application/json

--- request body ---
{"handle":"qa-d0a719c4d6f3","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 44 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd61029b-1ea8-456f-b72a-ea8e2f804f4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-cd61029b-1ea8-456f-b72a-ea8e2f804f4c","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
