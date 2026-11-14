# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-d51d2cbe0fbd, displayName=   , password=pw-67a7923e-e418-4fe6-861d-8275a671afeb, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 45 | `qa-c40c95cf-6a96-4f94-88f0-a142ba950615` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c40c95cf-6a96-4f94-88f0-a142ba950615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40c95cf-6a96-4f94-88f0-a142ba950615
Content-Type: application/json

--- request body ---
{"handle":"qa-d51d2cbe0fbd","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 45 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c40c95cf-6a96-4f94-88f0-a142ba950615
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-c40c95cf-6a96-4f94-88f0-a142ba950615","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
