# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-defd011010f7, displayName=Name, password=pw-64f44e46-e795-4492-99a7-1b5c4acbb299, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 13 | `qa-fe25e60a-5bf5-48f7-a5d9-837011559eac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fe25e60a-5bf5-48f7-a5d9-837011559eac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe25e60a-5bf5-48f7-a5d9-837011559eac
Content-Type: application/json

--- request body ---
{"handle":"qa-defd011010f7","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe25e60a-5bf5-48f7-a5d9-837011559eac
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-fe25e60a-5bf5-48f7-a5d9-837011559eac","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
