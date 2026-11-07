# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-d51d2cbe0fbd, displayName=Name, password=pw-67a7923e-e418-4fe6-861d-8275a671afeb, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 11 | `qa-27a05d12-98cf-47b0-8c4d-255c510f2af2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-27a05d12-98cf-47b0-8c4d-255c510f2af2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27a05d12-98cf-47b0-8c4d-255c510f2af2
Content-Type: application/json

--- request body ---
{"handle":"qa-d51d2cbe0fbd","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27a05d12-98cf-47b0-8c4d-255c510f2af2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-27a05d12-98cf-47b0-8c4d-255c510f2af2","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
