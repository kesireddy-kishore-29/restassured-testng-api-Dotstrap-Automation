# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-752ed8f1e308, displayName=   , password=pw-17b7749c-7a13-4cac-a838-74d07e841461, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 503 | `qa-63076816-9153-4101-b6da-99553e6c6efe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63076816-9153-4101-b6da-99553e6c6efe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63076816-9153-4101-b6da-99553e6c6efe
Content-Type: application/json

--- request body ---
{"handle":"qa-752ed8f1e308","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 503 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63076816-9153-4101-b6da-99553e6c6efe
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
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-63076816-9153-4101-b6da-99553e6c6efe","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
