# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-b48250a984ca, displayName=Name, password=pw-59c56c44-819b-458a-96bb-ae1a1a8b4e02, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 20 | `qa-2970ab1b-a9dc-4ec0-b504-9c10c8e217c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2970ab1b-a9dc-4ec0-b504-9c10c8e217c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2970ab1b-a9dc-4ec0-b504-9c10c8e217c5
Content-Type: application/json

--- request body ---
{"handle":"qa-b48250a984ca","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2970ab1b-a9dc-4ec0-b504-9c10c8e217c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2970ab1b-a9dc-4ec0-b504-9c10c8e217c5","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
