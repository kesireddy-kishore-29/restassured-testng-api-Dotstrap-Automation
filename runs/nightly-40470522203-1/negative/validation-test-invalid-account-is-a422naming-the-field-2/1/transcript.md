# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-b48250a984ca, displayName=   , password=pw-59c56c44-819b-458a-96bb-ae1a1a8b4e02, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 535 | `qa-75c1f956-011f-4be3-bd16-75b0a65e1534` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75c1f956-011f-4be3-bd16-75b0a65e1534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c1f956-011f-4be3-bd16-75b0a65e1534
Content-Type: application/json

--- request body ---
{"handle":"qa-b48250a984ca","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 535 ms ---
Date: Tue, 27 Oct 2026 08:00:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75c1f956-011f-4be3-bd16-75b0a65e1534
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-75c1f956-011f-4be3-bd16-75b0a65e1534","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
