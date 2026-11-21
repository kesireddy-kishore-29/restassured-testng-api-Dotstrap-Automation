# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-92a9e43a4512, displayName=Name, password=pw-8ba4cf22-9457-4e8b-bab6-44d1bcc11a81, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 12 | `qa-63a3039a-71ef-40e5-9765-50b1533de091` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63a3039a-71ef-40e5-9765-50b1533de091

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a3039a-71ef-40e5-9765-50b1533de091
Content-Type: application/json

--- request body ---
{"handle":"qa-92a9e43a4512","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63a3039a-71ef-40e5-9765-50b1533de091
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-63a3039a-71ef-40e5-9765-50b1533de091","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
