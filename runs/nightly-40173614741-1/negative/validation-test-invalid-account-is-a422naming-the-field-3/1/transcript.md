# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-e2babd3f081d, displayName=Name, password=short, region=eu], password]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[3]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 483 | `qa-e1b6c22d-790d-4953-a813-218e4d6089f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1b6c22d-790d-4953-a813-218e4d6089f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b6c22d-790d-4953-a813-218e4d6089f7
Content-Type: application/json

--- request body ---
{"handle":"qa-e2babd3f081d","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 483 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1b6c22d-790d-4953-a813-218e4d6089f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-e1b6c22d-790d-4953-a813-218e4d6089f7","errors":[{"field":"password","message":"8-72 characters"}]}
```
