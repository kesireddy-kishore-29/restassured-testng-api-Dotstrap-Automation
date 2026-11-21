# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-152f9eb98435, displayName=   , password=pw-09249070-79ee-4c5b-a87b-bdc7a541b8e7, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 295 | `qa-3c14a74f-df85-4f86-8351-33908e83a790` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c14a74f-df85-4f86-8351-33908e83a790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c14a74f-df85-4f86-8351-33908e83a790
Content-Type: application/json

--- request body ---
{"handle":"qa-152f9eb98435","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 295 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c14a74f-df85-4f86-8351-33908e83a790
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
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-3c14a74f-df85-4f86-8351-33908e83a790","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
