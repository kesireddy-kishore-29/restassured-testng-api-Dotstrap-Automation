# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-fe750009dd8e, displayName=   , password=pw-0117800c-c845-47d8-b9fb-e4f8c38498e3, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 502 | `qa-9ec7a9d2-1503-4fcc-babe-a95099e4b1d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ec7a9d2-1503-4fcc-babe-a95099e4b1d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ec7a9d2-1503-4fcc-babe-a95099e4b1d6
Content-Type: application/json

--- request body ---
{"handle":"qa-fe750009dd8e","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 502 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ec7a9d2-1503-4fcc-babe-a95099e4b1d6
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-9ec7a9d2-1503-4fcc-babe-a95099e4b1d6","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
