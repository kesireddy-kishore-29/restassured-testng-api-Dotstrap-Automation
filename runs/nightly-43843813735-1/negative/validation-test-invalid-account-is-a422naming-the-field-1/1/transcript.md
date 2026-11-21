# Transcript: An invalid account request is a 422 naming the field [handle with capitals, NewAccount[handle=Bad-Handle, displayName=Name, password=pw-8ba4cf22-9457-4e8b-bab6-44d1bcc11a81, region=eu], handle]

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
| 1 | `POST /v1/accounts` | 422 | 450 | `qa-57b62cc7-7b53-40ac-b6a2-5b829a74b0e2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57b62cc7-7b53-40ac-b6a2-5b829a74b0e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b62cc7-7b53-40ac-b6a2-5b829a74b0e2
Content-Type: application/json

--- request body ---
{"handle":"Bad-Handle","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 450 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57b62cc7-7b53-40ac-b6a2-5b829a74b0e2
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
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-57b62cc7-7b53-40ac-b6a2-5b829a74b0e2","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```
