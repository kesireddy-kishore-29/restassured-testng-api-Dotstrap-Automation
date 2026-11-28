# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-defd011010f7, displayName=   , password=pw-64f44e46-e795-4492-99a7-1b5c4acbb299, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 404 | `qa-c86758ac-d88f-401c-8e11-753826885e7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c86758ac-d88f-401c-8e11-753826885e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86758ac-d88f-401c-8e11-753826885e7f
Content-Type: application/json

--- request body ---
{"handle":"qa-defd011010f7","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 404 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c86758ac-d88f-401c-8e11-753826885e7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-c86758ac-d88f-401c-8e11-753826885e7f","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
