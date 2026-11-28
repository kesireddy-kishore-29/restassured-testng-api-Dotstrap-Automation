# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-e2e0514298bb, displayName=   , password=pw-89706817-fbbe-479d-91e5-a6c143035d92, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 499 | `qa-b30dd8b9-466e-4440-85c2-bc40da56ff51` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b30dd8b9-466e-4440-85c2-bc40da56ff51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b30dd8b9-466e-4440-85c2-bc40da56ff51
Content-Type: application/json

--- request body ---
{"handle":"qa-e2e0514298bb","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 499 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b30dd8b9-466e-4440-85c2-bc40da56ff51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-b30dd8b9-466e-4440-85c2-bc40da56ff51","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
