# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-1256fda2f150, displayName=   , password=pw-2e6e058f-26b1-4df1-9d15-835c1458fe00, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 30 | `qa-9bddf438-8979-41b5-927d-19c574ef4353` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9bddf438-8979-41b5-927d-19c574ef4353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bddf438-8979-41b5-927d-19c574ef4353
Content-Type: application/json

--- request body ---
{"handle":"qa-1256fda2f150","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bddf438-8979-41b5-927d-19c574ef4353
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-9bddf438-8979-41b5-927d-19c574ef4353","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
