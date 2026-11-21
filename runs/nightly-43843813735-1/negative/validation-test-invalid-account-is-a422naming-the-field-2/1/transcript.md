# Transcript: An invalid account request is a 422 naming the field [blank display name, NewAccount[handle=qa-92a9e43a4512, displayName=   , password=pw-8ba4cf22-9457-4e8b-bab6-44d1bcc11a81, region=eu], displayName]

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
| 1 | `POST /v1/accounts` | 422 | 456 | `qa-f734f318-605b-4cff-ab19-b5316517f07a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f734f318-605b-4cff-ab19-b5316517f07a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f734f318-605b-4cff-ab19-b5316517f07a
Content-Type: application/json

--- request body ---
{"handle":"qa-92a9e43a4512","displayName":"   ","password":"****","region":"eu"}

--- response: 422 in 456 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f734f318-605b-4cff-ab19-b5316517f07a
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
Content-Length: 313

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-f734f318-605b-4cff-ab19-b5316517f07a","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```
