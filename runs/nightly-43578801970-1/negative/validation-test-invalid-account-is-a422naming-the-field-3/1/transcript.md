# Transcript: An invalid account request is a 422 naming the field [password too short, NewAccount[handle=qa-814ce68d8672, displayName=Name, password=short, region=eu], password]

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
| 1 | `POST /v1/accounts` | 422 | 530 | `qa-d5234066-c981-4360-a30b-eaff2cf983a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d5234066-c981-4360-a30b-eaff2cf983a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5234066-c981-4360-a30b-eaff2cf983a3
Content-Type: application/json

--- request body ---
{"handle":"qa-814ce68d8672","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 530 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5234066-c981-4360-a30b-eaff2cf983a3
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-d5234066-c981-4360-a30b-eaff2cf983a3","errors":[{"field":"password","message":"8-72 characters"}]}
```
