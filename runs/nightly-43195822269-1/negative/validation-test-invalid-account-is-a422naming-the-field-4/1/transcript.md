# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-fe750009dd8e, displayName=Name, password=pw-0117800c-c845-47d8-b9fb-e4f8c38498e3, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 31 | `qa-1a05f351-a05b-4759-a437-db2f0fb75f21` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1a05f351-a05b-4759-a437-db2f0fb75f21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a05f351-a05b-4759-a437-db2f0fb75f21
Content-Type: application/json

--- request body ---
{"handle":"qa-fe750009dd8e","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a05f351-a05b-4759-a437-db2f0fb75f21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-1a05f351-a05b-4759-a437-db2f0fb75f21","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
