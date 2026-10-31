# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-ccee3bb7b895, displayName=Name, password=pw-259c321b-4701-44f4-9b22-d5e14ff1ce81, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-f9b53263-0332-4082-839d-bc0542ce6eff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f9b53263-0332-4082-839d-bc0542ce6eff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b53263-0332-4082-839d-bc0542ce6eff
Content-Type: application/json

--- request body ---
{"handle":"qa-ccee3bb7b895","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9b53263-0332-4082-839d-bc0542ce6eff
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-f9b53263-0332-4082-839d-bc0542ce6eff","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
