# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-d1bca1ea9d6a, displayName=   , password=pw-e3a3cb53-d72a-4706-8859-79d3feeb2da7, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 390 | `qa-e940273b-74ba-4823-a1d4-912125bdcfae` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e940273b-74ba-4823-a1d4-912125bdcfae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e940273b-74ba-4823-a1d4-912125bdcfae
Content-Type: application/json

--- request body ---
{"handle":"qa-d1bca1ea9d6a","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 390 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e940273b-74ba-4823-a1d4-912125bdcfae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-e940273b-74ba-4823-a1d4-912125bdcfae","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
