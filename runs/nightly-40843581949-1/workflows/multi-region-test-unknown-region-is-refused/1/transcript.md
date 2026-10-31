# Transcript: An unknown home region is refused with 422

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#unknownRegionIsRefused` |
| Features | FEAT-REGION-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 422 | 33 | `qa-93c01828-d608-4632-bd0d-df01c7be0ec6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-93c01828-d608-4632-bd0d-df01c7be0ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93c01828-d608-4632-bd0d-df01c7be0ec6
Content-Type: application/json

--- request body ---
{"handle":"qa-200f3cb2f103","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93c01828-d608-4632-bd0d-df01c7be0ec6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 300

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-93c01828-d608-4632-bd0d-df01c7be0ec6","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
