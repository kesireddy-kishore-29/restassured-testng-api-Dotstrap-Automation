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
| 1 | `POST /v1/accounts` | 422 | 25 | `qa-abb2625a-ce6d-4e40-b785-3c27c5f6b54b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-abb2625a-ce6d-4e40-b785-3c27c5f6b54b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abb2625a-ce6d-4e40-b785-3c27c5f6b54b
Content-Type: application/json

--- request body ---
{"handle":"qa-c7c54ebcfca2","displayName":"Mars","password":"****","region":"mars"}

--- response: 422 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abb2625a-ce6d-4e40-b785-3c27c5f6b54b
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-abb2625a-ce6d-4e40-b785-3c27c5f6b54b","errors":[{"field":"region","message":"one of: in, eu, us"}]}
```
