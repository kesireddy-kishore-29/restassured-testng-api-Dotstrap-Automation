# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-7a37eb4db285, displayName=   , password=pw-6b774b21-0023-4254-82a4-e400fe780885, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 318 | `qa-961ad494-a4db-497d-8c2a-259ed41f5805` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-961ad494-a4db-497d-8c2a-259ed41f5805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-961ad494-a4db-497d-8c2a-259ed41f5805
Content-Type: application/json

--- request body ---
{"handle":"qa-7a37eb4db285","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 318 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-961ad494-a4db-497d-8c2a-259ed41f5805
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-961ad494-a4db-497d-8c2a-259ed41f5805","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
