# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-dc8569dbd9a2, displayName=   , password=pw-5866d9f1-5014-4bc1-8ab3-f4e64296a842, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 301 | `qa-054ade2f-fab3-4890-a967-299574fec7f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-054ade2f-fab3-4890-a967-299574fec7f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-054ade2f-fab3-4890-a967-299574fec7f2
Content-Type: application/json

--- request body ---
{"handle":"qa-dc8569dbd9a2","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 301 ms ---
Date: Mon, 23 Nov 2026 10:54:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-054ade2f-fab3-4890-a967-299574fec7f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-054ade2f-fab3-4890-a967-299574fec7f2","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
