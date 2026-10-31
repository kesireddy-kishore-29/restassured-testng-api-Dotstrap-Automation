# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-4ba4644d-04ec-4270-83ce-24c6bc8c1821` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-2d5a2c2d-69c0-4c6b-bead-ce644bca3b8a` |
| 3 | `POST /v1/accounts` | 201 | 71 | `qa-4aea0d98-847e-4d58-93bd-f4e4500fb1d4` |
| 4 | `POST /v1/auth/token` | 200 | 36 | `qa-d41a05ea-3d70-45c2-beb5-6239b4896569` |
| 5 | `POST /v1/conversations` | 201 | 47 | `qa-6ebf42d1-38c8-4fa5-bdab-64d45628936a` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-2f59cfba-e2c6-4f95-8d92-77d625c448f5` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 29 | `qa-4454752e-12a1-45c2-b017-95d9b5a033bb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ba610d08-8b4a-4105-9d86-067a476168da` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-0ff91195-1008-429d-920e-506ef868d2eb` |
| 10 | `POST /v1/auth/token` | 200 | 19 | `qa-2e348ee6-13c7-49a4-8811-9cefea8dc022` |
| 11 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-5f30e2ef-5d87-4229-8902-db180410ffa9` |
| 12 | `POST /v1/auth/token` | 401 | 9 | `qa-bac56af8-a1ef-4076-8ea7-dbe90164c359` |
| 13 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-3809761d-3328-43cc-af2c-089a55ecd8f4` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-f9ce6939-548a-4fa0-94b4-6cb5e9f44219` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ba4644d-04ec-4270-83ce-24c6bc8c1821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ba4644d-04ec-4270-83ce-24c6bc8c1821
Content-Type: application/json

--- request body ---
{"handle":"qa-f21cdce7b76f","displayName":"QA f21cdce7b76f","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ba4644d-04ec-4270-83ce-24c6bc8c1821
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Location: /v1/accounts/qa-f21cdce7b76f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_29e62af6-2979-4060-a616-aaa84f875d90","handle":"qa-f21cdce7b76f","displayName":"QA f21cdce7b76f","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.942173425Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2d5a2c2d-69c0-4c6b-bead-ce644bca3b8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d5a2c2d-69c0-4c6b-bead-ce644bca3b8a
Content-Type: application/json

--- request body ---
{"handle":"qa-f28df78884d8","displayName":"QA f28df78884d8","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d5a2c2d-69c0-4c6b-bead-ce644bca3b8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Location: /v1/accounts/qa-f28df78884d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28ed7564-53c1-422d-bc3d-5f7e6248b648","handle":"qa-f28df78884d8","displayName":"QA f28df78884d8","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.012036937Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4aea0d98-847e-4d58-93bd-f4e4500fb1d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aea0d98-847e-4d58-93bd-f4e4500fb1d4
Content-Type: application/json

--- request body ---
{"handle":"qa-23ca09c18e14","displayName":"QA 23ca09c18e14","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aea0d98-847e-4d58-93bd-f4e4500fb1d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Location: /v1/accounts/qa-23ca09c18e14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6d37563-ea72-42e6-bec7-ec6023b183b1","handle":"qa-23ca09c18e14","displayName":"QA 23ca09c18e14","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.061478625Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d41a05ea-3d70-45c2-beb5-6239b4896569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d41a05ea-3d70-45c2-beb5-6239b4896569
Content-Type: application/json

--- request body ---
{"handle":"qa-f21cdce7b76f","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d41a05ea-3d70-45c2-beb5-6239b4896569
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_29e62af6-2979-4060-a616-aaa84f875d90"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6ebf42d1-38c8-4fa5-bdab-64d45628936a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ebf42d1-38c8-4fa5-bdab-64d45628936a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f28df78884d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ebf42d1-38c8-4fa5-bdab-64d45628936a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_46a9d577-5bef-496e-8e80-f98120f35eb0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_46a9d577-5bef-496e-8e80-f98120f35eb0","subject":"Error contract","status":"open","region":"eu","participants":["qa-f21cdce7b76f","qa-f28df78884d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.239316581Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f59cfba-e2c6-4f95-8d92-77d625c448f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f59cfba-e2c6-4f95-8d92-77d625c448f5
Content-Type: application/json

--- request body ---
{"handle":"qa-23ca09c18e14","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f59cfba-e2c6-4f95-8d92-77d625c448f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6d37563-ea72-42e6-bec7-ec6023b183b1"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_46a9d577-5bef-496e-8e80-f98120f35eb0/close
correlation: qa-4454752e-12a1-45c2-b017-95d9b5a033bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4454752e-12a1-45c2-b017-95d9b5a033bb
Content-Type: application/json

--- response: 403 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4454752e-12a1-45c2-b017-95d9b5a033bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_46a9d577-5bef-496e-8e80-f98120f35eb0/close","correlationId":"qa-4454752e-12a1-45c2-b017-95d9b5a033bb"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba610d08-8b4a-4105-9d86-067a476168da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba610d08-8b4a-4105-9d86-067a476168da
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba610d08-8b4a-4105-9d86-067a476168da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-0ff91195-1008-429d-920e-506ef868d2eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff91195-1008-429d-920e-506ef868d2eb
Content-Type: application/json

--- request body ---
{"handle":"qa-23ca09c18e14","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ff91195-1008-429d-920e-506ef868d2eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ff91195-1008-429d-920e-506ef868d2eb"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2e348ee6-13c7-49a4-8811-9cefea8dc022

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e348ee6-13c7-49a4-8811-9cefea8dc022
Content-Type: application/json

--- request body ---
{"handle":"qa-f28df78884d8","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e348ee6-13c7-49a4-8811-9cefea8dc022
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28ed7564-53c1-422d-bc3d-5f7e6248b648"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f30e2ef-5d87-4229-8902-db180410ffa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f30e2ef-5d87-4229-8902-db180410ffa9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f30e2ef-5d87-4229-8902-db180410ffa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-bac56af8-a1ef-4076-8ea7-dbe90164c359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac56af8-a1ef-4076-8ea7-dbe90164c359
Content-Type: application/json

--- request body ---
{"handle":"qa-f28df78884d8","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bac56af8-a1ef-4076-8ea7-dbe90164c359
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bac56af8-a1ef-4076-8ea7-dbe90164c359"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3809761d-3328-43cc-af2c-089a55ecd8f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3809761d-3328-43cc-af2c-089a55ecd8f4
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3809761d-3328-43cc-af2c-089a55ecd8f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f9ce6939-548a-4fa0-94b4-6cb5e9f44219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9ce6939-548a-4fa0-94b4-6cb5e9f44219
Content-Type: application/json

--- request body ---
{"handle":"qa-f21cdce7b76f","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9ce6939-548a-4fa0-94b4-6cb5e9f44219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f9ce6939-548a-4fa0-94b4-6cb5e9f44219"}
```
