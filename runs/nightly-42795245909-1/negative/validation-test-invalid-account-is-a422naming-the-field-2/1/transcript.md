# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-901a43b91fa9, displayName=   , password=pw-e1ed727a-1846-41bb-8301-7f1dffdf7367, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 567 | `qa-8d7aeddb-56fe-4c9e-9aee-813892f7f4cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8d7aeddb-56fe-4c9e-9aee-813892f7f4cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d7aeddb-56fe-4c9e-9aee-813892f7f4cc
Content-Type: application/json

--- request body ---
{"handle":"qa-901a43b91fa9","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 567 ms ---
Date: Tue, 10 Nov 2026 09:59:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d7aeddb-56fe-4c9e-9aee-813892f7f4cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-8d7aeddb-56fe-4c9e-9aee-813892f7f4cc","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
