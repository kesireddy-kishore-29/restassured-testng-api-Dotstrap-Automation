# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-ffd446c46237, displayName=   , password=pw-d3c6607c-b0c0-4a2b-a099-8ad6fb739c5a, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 533 | `qa-bfe0f0a4-90bc-49d3-be0a-52259eada45d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bfe0f0a4-90bc-49d3-be0a-52259eada45d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfe0f0a4-90bc-49d3-be0a-52259eada45d
Content-Type: application/json

--- request body ---
{"handle":"qa-ffd446c46237","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 533 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfe0f0a4-90bc-49d3-be0a-52259eada45d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-bfe0f0a4-90bc-49d3-be0a-52259eada45d","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
