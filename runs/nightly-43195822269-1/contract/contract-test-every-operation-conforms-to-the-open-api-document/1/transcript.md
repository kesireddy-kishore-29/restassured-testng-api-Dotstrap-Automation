# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 293 | `qa-2349c971-1ec7-421a-a47c-134be7071dc0` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-6c31ced6-395f-4df2-b6c6-34ae323c77cc` |
| 3 | `GET /health` | 200 | 43 | `qa-266cfe89-e6ad-4e92-8593-6efe5fa70442` |
| 4 | `POST /v1/auth/token` | 200 | 22 | `qa-eeb03091-d34d-4de8-ae7b-f543bc3cf503` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-0e72ac4e-b268-4416-8f7f-31bbe48a3f9c` |
| 6 | `PATCH /v1/accounts/me` | 200 | 19 | `qa-00ae6c0c-a372-4b87-b59f-4787ac80f83e` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-2c132806-437a-4d55-9e2c-f1c102cb2eb0` |
| 8 | `POST /v1/conversations` | 201 | 11 | `qa-40baa730-f309-45cc-8d35-b208379cea4b` |
| 9 | `GET /v1/conversations` | 200 | 7 | `qa-9833c943-7f8c-4b32-b8a0-22d99856b71e` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-59ae415b-7271-4d17-a017-21054bf62016` |
| 11 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-39b9a7e7-533e-4704-b7af-d99fd4779aed` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-88cc7a5a-1e76-4560-8001-89f77bc4b817` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 4 | `qa-c24d5a0b-636b-4027-8de9-d9e4253573f3` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 5 | `qa-51e9ac49-5225-4f58-898b-b5461d078a14` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 8 | `qa-80ede3d2-8c08-4033-a95b-96c1b8f1c662` |
| 16 | `GET /v1/credits/balance` | 200 | 3 | `qa-59c178fa-234c-4f38-ac4d-3da37f70f38d` |
| 17 | `GET /v1/credits/ledger` | 200 | 6 | `qa-9e669bbf-3d41-4d96-a4fa-77a5f436a0b2` |
| 18 | `POST /v1/credits/purchases` | 201 | 6 | `qa-4406e470-6f08-424a-ba53-1f8ea2d3fa2d` |
| 19 | `GET /v1/admin/stats` | 403 | 5 | `qa-5cd5c506-a9a8-4dd2-a709-07056863e256` |
| 20 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-bdadb668-d585-41d1-b0f6-16a418cb5534` |
| 21 | `POST /v1/auth/token` | 401 | 4 | `qa-405b8260-ef18-440c-b45a-16e3f591518f` |
| 22 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a7d163c4-a475-4787-b51a-de86829b0b61` |
| 23 | `POST /v1/auth/token` | 401 | 13 | `qa-a5286d94-2727-4a47-8025-a95d5097af30` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2349c971-1ec7-421a-a47c-134be7071dc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2349c971-1ec7-421a-a47c-134be7071dc0
Content-Type: application/json

--- request body ---
{"handle":"qa-9aa04a462915","displayName":"QA 9aa04a462915","password":"****","region":"eu"}

--- response: 201 in 293 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-2349c971-1ec7-421a-a47c-134be7071dc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-9aa04a462915
X-Served-Region: eu
Content-Length: 181

{"id":"acc_169b55cd-5ec6-4186-a939-8f98cc64d5dd","handle":"qa-9aa04a462915","displayName":"QA 9aa04a462915","region":"eu","role":"user","createdAt":"2026-11-12T09:56:29.275841892Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c31ced6-395f-4df2-b6c6-34ae323c77cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c31ced6-395f-4df2-b6c6-34ae323c77cc
Content-Type: application/json

--- request body ---
{"handle":"qa-c41cea12f318","displayName":"QA c41cea12f318","password":"****","region":"us"}

--- response: 201 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c31ced6-395f-4df2-b6c6-34ae323c77cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-c41cea12f318
X-Served-Region: us
Content-Length: 181

{"id":"acc_c34ea1de-bea4-41eb-97c2-065f39231430","handle":"qa-c41cea12f318","displayName":"QA c41cea12f318","region":"us","role":"user","createdAt":"2026-11-12T09:56:29.547123778Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-266cfe89-e6ad-4e92-8593-6efe5fa70442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-266cfe89-e6ad-4e92-8593-6efe5fa70442
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-266cfe89-e6ad-4e92-8593-6efe5fa70442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-eeb03091-d34d-4de8-ae7b-f543bc3cf503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eeb03091-d34d-4de8-ae7b-f543bc3cf503
Content-Type: application/json

--- request body ---
{"handle":"qa-9aa04a462915","password":"****"}

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-eeb03091-d34d-4de8-ae7b-f543bc3cf503
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_169b55cd-5ec6-4186-a939-8f98cc64d5dd"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e72ac4e-b268-4416-8f7f-31bbe48a3f9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e72ac4e-b268-4416-8f7f-31bbe48a3f9c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e72ac4e-b268-4416-8f7f-31bbe48a3f9c
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
Content-Length: 181

{"id":"acc_169b55cd-5ec6-4186-a939-8f98cc64d5dd","handle":"qa-9aa04a462915","displayName":"QA 9aa04a462915","region":"eu","role":"user","createdAt":"2026-11-12T09:56:29.275841892Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-00ae6c0c-a372-4b87-b59f-4787ac80f83e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00ae6c0c-a372-4b87-b59f-4787ac80f83e
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 19 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-00ae6c0c-a372-4b87-b59f-4787ac80f83e
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
Content-Length: 178

{"id":"acc_169b55cd-5ec6-4186-a939-8f98cc64d5dd","handle":"qa-9aa04a462915","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-12T09:56:29.275841892Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-c41cea12f318
correlation: qa-2c132806-437a-4d55-9e2c-f1c102cb2eb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c132806-437a-4d55-9e2c-f1c102cb2eb0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c132806-437a-4d55-9e2c-f1c102cb2eb0
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
Content-Length: 74

{"handle":"qa-c41cea12f318","displayName":"QA c41cea12f318","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-40baa730-f309-45cc-8d35-b208379cea4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40baa730-f309-45cc-8d35-b208379cea4b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c41cea12f318","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-40baa730-f309-45cc-8d35-b208379cea4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_1c125b53-b8c5-4730-8694-0474205bdff3
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-9aa04a462915","qa-c41cea12f318"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:29.756411512Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-9833c943-7f8c-4b32-b8a0-22d99856b71e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9833c943-7f8c-4b32-b8a0-22d99856b71e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9833c943-7f8c-4b32-b8a0-22d99856b71e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-9aa04a462915","qa-c41cea12f318"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:29.756411512Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-59ae415b-7271-4d17-a017-21054bf62016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59ae415b-7271-4d17-a017-21054bf62016
Content-Type: application/json

--- request body ---
{"handle":"qa-c41cea12f318","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-59ae415b-7271-4d17-a017-21054bf62016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c34ea1de-bea4-41eb-97c2-065f39231430"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_1c125b53-b8c5-4730-8694-0474205bdff3
correlation: qa-39b9a7e7-533e-4704-b7af-d99fd4779aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b9a7e7-533e-4704-b7af-d99fd4779aed
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b9a7e7-533e-4704-b7af-d99fd4779aed
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-9aa04a462915","qa-c41cea12f318"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-12T09:56:29.756411512Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_1c125b53-b8c5-4730-8694-0474205bdff3/messages
correlation: qa-88cc7a5a-1e76-4560-8001-89f77bc4b817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88cc7a5a-1e76-4560-8001-89f77bc4b817
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-88cc7a5a-1e76-4560-8001-89f77bc4b817
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_0d7b01dd-9a53-4fbf-847c-3e5c2f943ef3","conversationId":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","sender":"qa-9aa04a462915","body":"Hi","createdAt":"2026-11-12T09:56:29.756430692Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_1c125b53-b8c5-4730-8694-0474205bdff3/messages
correlation: qa-c24d5a0b-636b-4027-8de9-d9e4253573f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24d5a0b-636b-4027-8de9-d9e4253573f3
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c24d5a0b-636b-4027-8de9-d9e4253573f3
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_867a973a-de81-4938-9e80-7d44c1468897","conversationId":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","sender":"qa-c41cea12f318","body":"Reply","createdAt":"2026-11-12T09:56:29.864136465Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_1c125b53-b8c5-4730-8694-0474205bdff3/read
correlation: qa-51e9ac49-5225-4f58-898b-b5461d078a14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e9ac49-5225-4f58-898b-b5461d078a14
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-51e9ac49-5225-4f58-898b-b5461d078a14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_1c125b53-b8c5-4730-8694-0474205bdff3/close
correlation: qa-80ede3d2-8c08-4033-a95b-96c1b8f1c662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80ede3d2-8c08-4033-a95b-96c1b8f1c662
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-80ede3d2-8c08-4033-a95b-96c1b8f1c662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-9aa04a462915","qa-c41cea12f318"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-12T09:56:29.756411512Z","closedAt":"2026-11-12T09:56:29.885943970Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-59c178fa-234c-4f38-ac4d-3da37f70f38d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59c178fa-234c-4f38-ac4d-3da37f70f38d
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-59c178fa-234c-4f38-ac4d-3da37f70f38d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_169b55cd-5ec6-4186-a939-8f98cc64d5dd"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9e669bbf-3d41-4d96-a4fa-77a5f436a0b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e669bbf-3d41-4d96-a4fa-77a5f436a0b2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e669bbf-3d41-4d96-a4fa-77a5f436a0b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_e2ae2996-0c4d-4fe4-8a6d-f1b1c5cb2514","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-12T09:56:29.275847991Z"},{"id":"led_160cc47f-4d65-4a79-8f0c-40184d3958a9","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_1c125b53-b8c5-4730-8694-0474205bdff3","createdAt":"2026-11-12T09:56:29.756386372Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4406e470-6f08-424a-ba53-1f8ea2d3fa2d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-20857f9cdfdf499db3bcc52600e6af57
X-Correlation-Id: qa-4406e470-6f08-424a-ba53-1f8ea2d3fa2d
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-4406e470-6f08-424a-ba53-1f8ea2d3fa2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_879abd01-2519-4dd6-a11e-3b08f73565d9
Content-Length: 144

{"id":"pur_879abd01-2519-4dd6-a11e-3b08f73565d9","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-12T09:56:29.913913345Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-5cd5c506-a9a8-4dd2-a709-07056863e256

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cd5c506-a9a8-4dd2-a709-07056863e256
Content-Type: application/json

--- response: 403 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5cd5c506-a9a8-4dd2-a709-07056863e256
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-5cd5c506-a9a8-4dd2-a709-07056863e256"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bdadb668-d585-41d1-b0f6-16a418cb5534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdadb668-d585-41d1-b0f6-16a418cb5534
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bdadb668-d585-41d1-b0f6-16a418cb5534
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-405b8260-ef18-440c-b45a-16e3f591518f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-405b8260-ef18-440c-b45a-16e3f591518f
Content-Type: application/json

--- request body ---
{"handle":"qa-c41cea12f318","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-405b8260-ef18-440c-b45a-16e3f591518f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-405b8260-ef18-440c-b45a-16e3f591518f"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7d163c4-a475-4787-b51a-de86829b0b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7d163c4-a475-4787-b51a-de86829b0b61
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7d163c4-a475-4787-b51a-de86829b0b61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-a5286d94-2727-4a47-8025-a95d5097af30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5286d94-2727-4a47-8025-a95d5097af30
Content-Type: application/json

--- request body ---
{"handle":"qa-9aa04a462915","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5286d94-2727-4a47-8025-a95d5097af30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5286d94-2727-4a47-8025-a95d5097af30"}
```
