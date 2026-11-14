# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-901a43b91fa9, displayName=Name, password=pw-e1ed727a-1846-41bb-8301-7f1dffdf7367, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 13 | `qa-90c018c0-579b-4976-b1d7-9691198a1ca1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90c018c0-579b-4976-b1d7-9691198a1ca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90c018c0-579b-4976-b1d7-9691198a1ca1
Content-Type: application/json

--- request body ---
{"handle":"qa-901a43b91fa9","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90c018c0-579b-4976-b1d7-9691198a1ca1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-90c018c0-579b-4976-b1d7-9691198a1ca1","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
