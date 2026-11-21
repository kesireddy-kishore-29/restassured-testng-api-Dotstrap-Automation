# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-d65f7ae95911, displayName=   , password=pw-d09d8e32-b2b8-4a24-abc5-899238945303, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 372 | `qa-2fc69529-da11-474a-9255-5c2298d3892e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fc69529-da11-474a-9255-5c2298d3892e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc69529-da11-474a-9255-5c2298d3892e
Content-Type: application/json

--- request body ---
{"handle":"qa-d65f7ae95911","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 372 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fc69529-da11-474a-9255-5c2298d3892e
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-2fc69529-da11-474a-9255-5c2298d3892e","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
