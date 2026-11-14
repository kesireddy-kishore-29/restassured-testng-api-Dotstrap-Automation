# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-92e0372790cf, displayName=   , password=pw-6020a028-a8e5-40c5-b043-ca29b3a0c1e3, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 424 | `qa-7a8c573d-e87c-4042-97a0-b4227a60d20f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7a8c573d-e87c-4042-97a0-b4227a60d20f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a8c573d-e87c-4042-97a0-b4227a60d20f
Content-Type: application/json

--- request body ---
{"handle":"qa-92e0372790cf","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 424 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a8c573d-e87c-4042-97a0-b4227a60d20f
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
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-7a8c573d-e87c-4042-97a0-b4227a60d20f","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
