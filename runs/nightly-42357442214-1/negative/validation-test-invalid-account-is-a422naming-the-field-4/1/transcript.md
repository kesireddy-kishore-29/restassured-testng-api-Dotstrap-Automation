# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-079c775bb365, displayName=Name, password=pw-d1ddf6c2-0be8-4517-a944-3ef4c40d078e, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 18 | `qa-d8d6bfed-e28b-4793-8cbe-e3660ecdd238` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8d6bfed-e28b-4793-8cbe-e3660ecdd238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d6bfed-e28b-4793-8cbe-e3660ecdd238
Content-Type: application/json

--- request body ---
{"handle":"qa-079c775bb365","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8d6bfed-e28b-4793-8cbe-e3660ecdd238
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d8d6bfed-e28b-4793-8cbe-e3660ecdd238","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
