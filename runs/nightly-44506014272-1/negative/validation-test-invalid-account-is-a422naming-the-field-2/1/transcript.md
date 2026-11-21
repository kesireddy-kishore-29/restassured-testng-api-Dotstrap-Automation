# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-782f816629d0, displayName=   , password=pw-38522e50-44fa-4c7f-8ecd-773116ec9457, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 438 | `qa-1dc63aae-d77c-44f9-9d9c-f1de81b74865` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1dc63aae-d77c-44f9-9d9c-f1de81b74865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dc63aae-d77c-44f9-9d9c-f1de81b74865
Content-Type: application/json

--- request body ---
{"handle":"qa-782f816629d0","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 438 ms ---
Date: Thu, 19 Nov 2026 10:29:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1dc63aae-d77c-44f9-9d9c-f1de81b74865
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-1dc63aae-d77c-44f9-9d9c-f1de81b74865","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
