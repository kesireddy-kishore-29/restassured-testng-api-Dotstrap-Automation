# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-e2babd3f081d, displayName=Name, password=pw-0838f2b8-a51d-4b7d-8233-0196ff0962fb, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 20 | `qa-6d1bd768-02b3-4ee1-875d-216870a49c16` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d1bd768-02b3-4ee1-875d-216870a49c16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d1bd768-02b3-4ee1-875d-216870a49c16
Content-Type: application/json

--- request body ---
{"handle":"qa-e2babd3f081d","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d1bd768-02b3-4ee1-875d-216870a49c16
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-6d1bd768-02b3-4ee1-875d-216870a49c16","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
