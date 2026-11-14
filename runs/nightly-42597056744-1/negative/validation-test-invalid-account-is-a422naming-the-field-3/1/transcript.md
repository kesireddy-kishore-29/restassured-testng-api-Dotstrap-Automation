# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-a9df1038f8cd, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 386 | `qa-96575239-9496-4eb3-96b8-43dd34af565b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-96575239-9496-4eb3-96b8-43dd34af565b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96575239-9496-4eb3-96b8-43dd34af565b
Content-Type: application/json

--- request body ---
{"handle":"qa-a9df1038f8cd","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 386 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96575239-9496-4eb3-96b8-43dd34af565b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-96575239-9496-4eb3-96b8-43dd34af565b","errors":[{"field":"password","message":"8-72 characters"}]}
```
