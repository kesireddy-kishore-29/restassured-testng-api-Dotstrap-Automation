# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-ccee3bb7b895, displayName=   , password=pw-259c321b-4701-44f4-9b22-d5e14ff1ce81, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 486 | `qa-5006978d-7e8a-4c1e-ad03-cf28c1d14b08` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5006978d-7e8a-4c1e-ad03-cf28c1d14b08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5006978d-7e8a-4c1e-ad03-cf28c1d14b08
Content-Type: application/json

--- request body ---
{"handle":"qa-ccee3bb7b895","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 486 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5006978d-7e8a-4c1e-ad03-cf28c1d14b08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-5006978d-7e8a-4c1e-ad03-cf28c1d14b08","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
