# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-59d34809-d3d4-45dc-b4b0-47e12f47572f` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-48582b37-68ba-4b01-8d98-0b07e9bee0d7` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-4a8b23d8-c744-4d93-a336-583890e8ecab` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-436925f9-5ab0-45c6-a166-6317f90c0c15` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 25 | `qa-1ea292f2-1ead-4555-9b6d-b4baf87ef7f5` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-d345dba0-04ff-4444-98f3-e2e0f2890290` |
| 7 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-fcd449d9-389f-4d0e-90a4-d0bb97655fef` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-82dcc057-7eed-4d89-8889-94b9feb35211` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-e25212b9-b4bd-4c9d-93da-dfda357350ba` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-d13ed32c-39f8-4a60-bc0e-e630f11b1ce3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-59d34809-d3d4-45dc-b4b0-47e12f47572f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59d34809-d3d4-45dc-b4b0-47e12f47572f
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b7a89de300","displayName":"QA b8b7a89de300","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-59d34809-d3d4-45dc-b4b0-47e12f47572f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Location: /v1/accounts/qa-b8b7a89de300
X-Served-Region: eu
Content-Length: 181

{"id":"acc_725e3bff-7728-4758-b4bb-1c03331e0c72","handle":"qa-b8b7a89de300","displayName":"QA b8b7a89de300","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.462920385Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48582b37-68ba-4b01-8d98-0b07e9bee0d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48582b37-68ba-4b01-8d98-0b07e9bee0d7
Content-Type: application/json

--- request body ---
{"handle":"qa-d6c063f382d0","displayName":"QA d6c063f382d0","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-48582b37-68ba-4b01-8d98-0b07e9bee0d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Location: /v1/accounts/qa-d6c063f382d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6943ae70-2895-4a5e-b8df-e9729d67381e","handle":"qa-d6c063f382d0","displayName":"QA d6c063f382d0","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.495516468Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4a8b23d8-c744-4d93-a336-583890e8ecab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a8b23d8-c744-4d93-a336-583890e8ecab
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b7a89de300","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a8b23d8-c744-4d93-a336-583890e8ecab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_725e3bff-7728-4758-b4bb-1c03331e0c72"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-436925f9-5ab0-45c6-a166-6317f90c0c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-436925f9-5ab0-45c6-a166-6317f90c0c15
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d6c063f382d0","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-436925f9-5ab0-45c6-a166-6317f90c0c15
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
Location: /v1/conversations/cnv_742ea9d1-3575-40b9-b67a-cac380479fdc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_742ea9d1-3575-40b9-b67a-cac380479fdc","subject":"Error contract","status":"open","region":"eu","participants":["qa-b8b7a89de300","qa-d6c063f382d0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.580607451Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_742ea9d1-3575-40b9-b67a-cac380479fdc/messages
correlation: qa-1ea292f2-1ead-4555-9b6d-b4baf87ef7f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea292f2-1ead-4555-9b6d-b4baf87ef7f5
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ea292f2-1ead-4555-9b6d-b4baf87ef7f5
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_742ea9d1-3575-40b9-b67a-cac380479fdc/messages","correlationId":"qa-1ea292f2-1ead-4555-9b6d-b4baf87ef7f5","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d345dba0-04ff-4444-98f3-e2e0f2890290

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d345dba0-04ff-4444-98f3-e2e0f2890290
Content-Type: application/json

--- request body ---
{"handle":"qa-d6c063f382d0","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d345dba0-04ff-4444-98f3-e2e0f2890290
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6943ae70-2895-4a5e-b8df-e9729d67381e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcd449d9-389f-4d0e-90a4-d0bb97655fef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcd449d9-389f-4d0e-90a4-d0bb97655fef
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcd449d9-389f-4d0e-90a4-d0bb97655fef
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-82dcc057-7eed-4d89-8889-94b9feb35211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82dcc057-7eed-4d89-8889-94b9feb35211
Content-Type: application/json

--- request body ---
{"handle":"qa-d6c063f382d0","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82dcc057-7eed-4d89-8889-94b9feb35211
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-82dcc057-7eed-4d89-8889-94b9feb35211"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e25212b9-b4bd-4c9d-93da-dfda357350ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e25212b9-b4bd-4c9d-93da-dfda357350ba
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e25212b9-b4bd-4c9d-93da-dfda357350ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d13ed32c-39f8-4a60-bc0e-e630f11b1ce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d13ed32c-39f8-4a60-bc0e-e630f11b1ce3
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b7a89de300","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d13ed32c-39f8-4a60-bc0e-e630f11b1ce3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d13ed32c-39f8-4a60-bc0e-e630f11b1ce3"}
```
