# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-ebe191480c14, displayName=   , password=pw-346051d4-bb19-4b18-819b-71970d214c52, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 424 | `qa-76270b8f-dea1-4320-a6c7-75e0d7a6db91` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-76270b8f-dea1-4320-a6c7-75e0d7a6db91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76270b8f-dea1-4320-a6c7-75e0d7a6db91
Content-Type: application/json

--- request body ---
{"handle":"qa-ebe191480c14","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 424 ms ---
Date: Wed, 11 Nov 2026 09:34:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76270b8f-dea1-4320-a6c7-75e0d7a6db91
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-76270b8f-dea1-4320-a6c7-75e0d7a6db91","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
