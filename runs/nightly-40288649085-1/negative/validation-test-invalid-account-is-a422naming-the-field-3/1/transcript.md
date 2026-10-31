# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-a0814ae9aee5, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 629 | `qa-d4b34392-ca9a-484a-bd13-87823a064129` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d4b34392-ca9a-484a-bd13-87823a064129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4b34392-ca9a-484a-bd13-87823a064129
Content-Type: application/json

--- request body ---
{"handle":"qa-a0814ae9aee5","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 629 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4b34392-ca9a-484a-bd13-87823a064129
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
Content-Length: 299

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d4b34392-ca9a-484a-bd13-87823a064129","errors":[{"field":"password","message":"8-72 characters"}]}
```
