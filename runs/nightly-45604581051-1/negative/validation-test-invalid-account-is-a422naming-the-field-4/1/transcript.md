# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-e2e0514298bb, displayName=Name, password=pw-89706817-fbbe-479d-91e5-a6c143035d92, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 16 | `qa-4bd4ed92-e5bf-469c-99ad-74044595627a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4bd4ed92-e5bf-469c-99ad-74044595627a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bd4ed92-e5bf-469c-99ad-74044595627a
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e0514298bb","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 16 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4bd4ed92-e5bf-469c-99ad-74044595627a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-4bd4ed92-e5bf-469c-99ad-74044595627a","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
