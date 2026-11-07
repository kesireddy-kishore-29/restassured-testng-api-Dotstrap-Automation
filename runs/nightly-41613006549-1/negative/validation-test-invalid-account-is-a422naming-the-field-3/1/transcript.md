# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-cc3474f9fa86, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 16 | `qa-0c3fb7cb-3915-40d4-af7c-603335887aa4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0c3fb7cb-3915-40d4-af7c-603335887aa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c3fb7cb-3915-40d4-af7c-603335887aa4
Content-Type: application/json

--- request body ---
{"handle":"qa-cc3474f9fa86","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c3fb7cb-3915-40d4-af7c-603335887aa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-0c3fb7cb-3915-40d4-af7c-603335887aa4","errors":[{"field":"password","message":"8-72 characters"}]}
```
