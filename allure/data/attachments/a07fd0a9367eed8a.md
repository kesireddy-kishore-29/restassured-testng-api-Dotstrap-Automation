# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-6dbdea95853d, displayName=Name, password=pw-52d53b69-195d-42bf-8444-fce7ef04b39d, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 9 | `qa-46e2a3df-96ae-46dd-972e-bd8804f0069e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-46e2a3df-96ae-46dd-972e-bd8804f0069e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46e2a3df-96ae-46dd-972e-bd8804f0069e
Content-Type: application/json

--- request body ---
{"handle":"qa-6dbdea95853d","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46e2a3df-96ae-46dd-972e-bd8804f0069e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-46e2a3df-96ae-46dd-972e-bd8804f0069e","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
