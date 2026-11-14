# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-a9df1038f8cd, displayName=Name, password=pw-1640f5fb-5582-4a01-91b2-2090d9149576, region=mars], region]

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#invalidAccountIsA422NamingTheField[4]` |
| Features | FEAT-ACCT-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 14 | `qa-408a61ec-7ee0-4a9d-a73d-88da90f113b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-408a61ec-7ee0-4a9d-a73d-88da90f113b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-408a61ec-7ee0-4a9d-a73d-88da90f113b7
Content-Type: application/json

--- request body ---
{"handle":"qa-a9df1038f8cd","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-408a61ec-7ee0-4a9d-a73d-88da90f113b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-408a61ec-7ee0-4a9d-a73d-88da90f113b7","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
