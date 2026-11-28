# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-dc8569dbd9a2, displayName=Name, password=pw-5866d9f1-5014-4bc1-8ab3-f4e64296a842, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 10 | `qa-59660861-91ac-4a3a-ba86-b31a79d3b946` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-59660861-91ac-4a3a-ba86-b31a79d3b946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59660861-91ac-4a3a-ba86-b31a79d3b946
Content-Type: application/json

--- request body ---
{"handle":"qa-dc8569dbd9a2","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59660861-91ac-4a3a-ba86-b31a79d3b946
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-59660861-91ac-4a3a-ba86-b31a79d3b946","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
