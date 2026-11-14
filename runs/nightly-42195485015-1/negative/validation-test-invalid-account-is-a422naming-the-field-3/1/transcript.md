# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-92e0372790cf, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 431 | `qa-85a9d713-9e6c-4a5f-98d7-7eb50c830afc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-85a9d713-9e6c-4a5f-98d7-7eb50c830afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85a9d713-9e6c-4a5f-98d7-7eb50c830afc
Content-Type: application/json

--- request body ---
{"handle":"qa-92e0372790cf","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 431 ms ---
Date: Fri, 06 Nov 2026 09:30:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85a9d713-9e6c-4a5f-98d7-7eb50c830afc
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
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-85a9d713-9e6c-4a5f-98d7-7eb50c830afc","errors":[{"field":"password","message":"8-72 characters"}]}
```
