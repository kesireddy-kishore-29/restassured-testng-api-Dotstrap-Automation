# Transcript: An invalid account request is a 422 naming the field [handle with capitals, NewAccount[handle=Bad-Handle, displayName=Name, password=pw-0117800c-c845-47d8-b9fb-e4f8c38498e3, region=eu], handle]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[1]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 510 | `qa-8c9362bd-d7b7-4433-881f-2b641eaa379c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c9362bd-d7b7-4433-881f-2b641eaa379c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9362bd-d7b7-4433-881f-2b641eaa379c
Content-Type: application/json

--- request body ---
{"handle":"Bad-Handle","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 510 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c9362bd-d7b7-4433-881f-2b641eaa379c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-8c9362bd-d7b7-4433-881f-2b641eaa379c","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```
