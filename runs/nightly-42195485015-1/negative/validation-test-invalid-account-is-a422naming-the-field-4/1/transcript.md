# Transcript: An invalid account request is a 422 naming the field [unknown region, NewAccount[handle=qa-92e0372790cf, displayName=Name, password=pw-6020a028-a8e5-40c5-b043-ca29b3a0c1e3, region=mars], region]

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
| 1 | `POST /v1/accounts` | 422 | 15 | `qa-0fbb6cac-da47-425b-bbc0-93778092c3b0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0fbb6cac-da47-425b-bbc0-93778092c3b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fbb6cac-da47-425b-bbc0-93778092c3b0
Content-Type: application/json

--- request body ---
{"handle":"qa-92e0372790cf","displayName":"Name","password":"****","region":"mars"}

--- response: 422 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fbb6cac-da47-425b-bbc0-93778092c3b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-0fbb6cac-da47-425b-bbc0-93778092c3b0","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
