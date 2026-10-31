# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-7438b8db-7f3f-43e1-bb45-8044dc91ba5e` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-da740467-710e-486e-822e-631fb0cb3274` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-a64da87b-d781-4f84-9178-c5901ecaa8d3` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-e70051ac-fe0b-4415-b622-ec0adfb6bb49` |
| 5 | `PATCH /v1/accounts/me` | 400 | 9 | `qa-118fecb3-f8fb-4429-8697-f9ef739b1f9c` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-38e342f4-418a-4001-870c-5a805262f9bd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-fdbb0afd-e04b-4297-9208-94390229af95` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-81c119bc-e619-4106-bec7-28baacea0797` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d3129a5a-1b06-4036-ab98-26c8f616551d` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-149fab87-667b-46ea-9f49-ed1666c0ea2c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7438b8db-7f3f-43e1-bb45-8044dc91ba5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7438b8db-7f3f-43e1-bb45-8044dc91ba5e
Content-Type: application/json

--- request body ---
{"handle":"qa-f5cc04be80b5","displayName":"QA f5cc04be80b5","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7438b8db-7f3f-43e1-bb45-8044dc91ba5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 9
Location: /v1/accounts/qa-f5cc04be80b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9439ea7d-fd4d-4206-bf0f-7c43be170e46","handle":"qa-f5cc04be80b5","displayName":"QA f5cc04be80b5","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.376248750Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-da740467-710e-486e-822e-631fb0cb3274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da740467-710e-486e-822e-631fb0cb3274
Content-Type: application/json

--- request body ---
{"handle":"qa-48e2d61cf66c","displayName":"QA 48e2d61cf66c","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-da740467-710e-486e-822e-631fb0cb3274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 9
Location: /v1/accounts/qa-48e2d61cf66c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_eb772138-b7b9-4069-801c-a628fc93eb4e","handle":"qa-48e2d61cf66c","displayName":"QA 48e2d61cf66c","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.411906508Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a64da87b-d781-4f84-9178-c5901ecaa8d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64da87b-d781-4f84-9178-c5901ecaa8d3
Content-Type: application/json

--- request body ---
{"handle":"qa-f5cc04be80b5","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a64da87b-d781-4f84-9178-c5901ecaa8d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9439ea7d-fd4d-4206-bf0f-7c43be170e46"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e70051ac-fe0b-4415-b622-ec0adfb6bb49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e70051ac-fe0b-4415-b622-ec0adfb6bb49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-48e2d61cf66c","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e70051ac-fe0b-4415-b622-ec0adfb6bb49
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
Location: /v1/conversations/cnv_c41d511f-f94d-40bf-ab9d-be3f9ddea140
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c41d511f-f94d-40bf-ab9d-be3f9ddea140","subject":"Error contract","status":"open","region":"eu","participants":["qa-f5cc04be80b5","qa-48e2d61cf66c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.465668080Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-118fecb3-f8fb-4429-8697-f9ef739b1f9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-118fecb3-f8fb-4429-8697-f9ef739b1f9c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-118fecb3-f8fb-4429-8697-f9ef739b1f9c
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-118fecb3-f8fb-4429-8697-f9ef739b1f9c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-38e342f4-418a-4001-870c-5a805262f9bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38e342f4-418a-4001-870c-5a805262f9bd
Content-Type: application/json

--- request body ---
{"handle":"qa-48e2d61cf66c","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-38e342f4-418a-4001-870c-5a805262f9bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_eb772138-b7b9-4069-801c-a628fc93eb4e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fdbb0afd-e04b-4297-9208-94390229af95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdbb0afd-e04b-4297-9208-94390229af95
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fdbb0afd-e04b-4297-9208-94390229af95
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
correlation: qa-81c119bc-e619-4106-bec7-28baacea0797

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81c119bc-e619-4106-bec7-28baacea0797
Content-Type: application/json

--- request body ---
{"handle":"qa-48e2d61cf66c","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81c119bc-e619-4106-bec7-28baacea0797
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81c119bc-e619-4106-bec7-28baacea0797"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3129a5a-1b06-4036-ab98-26c8f616551d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3129a5a-1b06-4036-ab98-26c8f616551d
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3129a5a-1b06-4036-ab98-26c8f616551d
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
correlation: qa-149fab87-667b-46ea-9f49-ed1666c0ea2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-149fab87-667b-46ea-9f49-ed1666c0ea2c
Content-Type: application/json

--- request body ---
{"handle":"qa-f5cc04be80b5","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-149fab87-667b-46ea-9f49-ed1666c0ea2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-149fab87-667b-46ea-9f49-ed1666c0ea2c"}
```
