# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-752ed8f1e308, displayName=Name, password=short, region=eu], password]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[3]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 489 | `qa-df78b91c-8d1a-4fd3-93fe-2a832551199e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df78b91c-8d1a-4fd3-93fe-2a832551199e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df78b91c-8d1a-4fd3-93fe-2a832551199e
Content-Type: application/json

--- request body ---
{"handle":"qa-752ed8f1e308","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 489 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df78b91c-8d1a-4fd3-93fe-2a832551199e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-df78b91c-8d1a-4fd3-93fe-2a832551199e","errors":[{"field":"password","message":"8-72 characters"}]}
```
