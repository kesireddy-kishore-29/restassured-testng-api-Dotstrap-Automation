# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-d51d2cbe0fbd, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 51 | `qa-d80a04e5-c085-4301-8651-bbaa0c4460ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d80a04e5-c085-4301-8651-bbaa0c4460ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d80a04e5-c085-4301-8651-bbaa0c4460ea
Content-Type: application/json

--- request body ---
{"handle":"qa-d51d2cbe0fbd","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 51 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d80a04e5-c085-4301-8651-bbaa0c4460ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d80a04e5-c085-4301-8651-bbaa0c4460ea","errors":[{"field":"password","message":"8-72 characters"}]}
```
