# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-a46b98fd7745, displayName=   , password=pw-a35d36ed-7472-4989-b631-249a2b478ca0, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 359 | `qa-2de596e1-94ab-40a4-9a22-941406c2e42d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2de596e1-94ab-40a4-9a22-941406c2e42d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2de596e1-94ab-40a4-9a22-941406c2e42d
Content-Type: application/json

--- request body ---
{"handle":"qa-a46b98fd7745","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 359 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2de596e1-94ab-40a4-9a22-941406c2e42d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2de596e1-94ab-40a4-9a22-941406c2e42d","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
