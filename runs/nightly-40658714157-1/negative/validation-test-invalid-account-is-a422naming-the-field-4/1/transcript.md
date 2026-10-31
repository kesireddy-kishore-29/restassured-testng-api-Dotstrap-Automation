# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-a46b98fd7745, displayName=Name, password=pw-a35d36ed-7472-4989-b631-249a2b478ca0, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-ee802b97-6593-4318-aa98-e0ce933eacf1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee802b97-6593-4318-aa98-e0ce933eacf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee802b97-6593-4318-aa98-e0ce933eacf1
Content-Type: application/json

--- request body ---
{"handle":"qa-a46b98fd7745","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee802b97-6593-4318-aa98-e0ce933eacf1
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-ee802b97-6593-4318-aa98-e0ce933eacf1","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
