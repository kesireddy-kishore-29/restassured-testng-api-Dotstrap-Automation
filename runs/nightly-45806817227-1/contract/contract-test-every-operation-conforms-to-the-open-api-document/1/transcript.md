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
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-d0899a93-bded-4298-be17-a8f677dcb277` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-ca66175c-2b73-406a-ae21-f66927873acc` |
| 3 | `GET /health` | 200 | 65 | `qa-49741c41-4ff0-4c58-b081-684808c616e8` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-1f998d58-3e11-42ad-b482-1c0a557fabe8` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-23d1da71-3cf2-4aec-a6ac-f8ccabb935d7` |
| 6 | `PATCH /v1/accounts/me` | 200 | 21 | `qa-d227ace8-b806-4119-a3ea-73ac91fedb40` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 28 | `qa-3dfa383c-1630-47fc-bbc8-e7db398d7a15` |
| 8 | `POST /v1/conversations` | 201 | 21 | `qa-7dfdb118-057e-480a-acb8-cce9978acca1` |
| 9 | `GET /v1/conversations` | 200 | 11 | `qa-29284b07-8ae2-480d-b91f-b77994fc8df2` |
| 10 | `POST /v1/auth/token` | 200 | 21 | `qa-cadd7b25-2978-4446-9b26-d06646856189` |
| 11 | `GET /v1/conversations/{id}` | 200 | 11 | `qa-964938ab-b909-41eb-9df3-e53e35e7c773` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-438d8659-e56d-41dc-aa7f-8d7d1c041b4b` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 13 | `qa-30f7e563-62a0-4704-9416-ab93fa561cab` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-b7179d04-1554-4eee-b1d1-f5e09185b815` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 12 | `qa-a9514fe4-e3df-4a98-8334-dc42a6ff3189` |
| 16 | `GET /v1/credits/balance` | 200 | 10 | `qa-926eb3e4-c9f2-4014-84dd-2b0b834cc94b` |
| 17 | `GET /v1/credits/ledger` | 200 | 17 | `qa-80c27e29-fc57-46cc-8e09-ef5761d6c24d` |
| 18 | `POST /v1/credits/purchases` | 201 | 23 | `qa-f1dcdcb3-5ade-494c-809e-309242e41a94` |
| 19 | `GET /v1/admin/stats` | 403 | 31 | `qa-e74716bc-494b-4e96-b451-c1de76cc9d07` |
| 20 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-ec94c843-511e-4ab0-b241-70fa3761dbbf` |
| 21 | `POST /v1/auth/token` | 401 | 18 | `qa-9bfc6af2-c482-4293-8e3b-d86b69cba3f5` |
| 22 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-68214b4c-8585-4328-b45a-aebde2937474` |
| 23 | `POST /v1/auth/token` | 401 | 18 | `qa-c303c298-02b1-4db0-b217-a8b7ec13ebad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0899a93-bded-4298-be17-a8f677dcb277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0899a93-bded-4298-be17-a8f677dcb277
Content-Type: application/json

--- request body ---
{"handle":"qa-075bcbd53da0","displayName":"QA 075bcbd53da0","password":"****","region":"eu"}

--- response: 201 in 455 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0899a93-bded-4298-be17-a8f677dcb277
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-075bcbd53da0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47dcee41-41a9-4633-a48f-a902ecf65b4a","handle":"qa-075bcbd53da0","displayName":"QA 075bcbd53da0","region":"eu","role":"user","createdAt":"2026-11-26T11:02:42.432747673Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ca66175c-2b73-406a-ae21-f66927873acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca66175c-2b73-406a-ae21-f66927873acc
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b2c9802591","displayName":"QA b8b2c9802591","password":"****","region":"us"}

--- response: 201 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca66175c-2b73-406a-ae21-f66927873acc
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
Location: /v1/accounts/qa-b8b2c9802591
X-Served-Region: us
Content-Length: 181

{"id":"acc_1ea2b08b-bf12-4254-9ccd-e4a878110fb1","handle":"qa-b8b2c9802591","displayName":"QA b8b2c9802591","region":"us","role":"user","createdAt":"2026-11-26T11:02:42.893177736Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-49741c41-4ff0-4c58-b081-684808c616e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49741c41-4ff0-4c58-b081-684808c616e8
Content-Type: application/json

--- response: 200 in 65 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-49741c41-4ff0-4c58-b081-684808c616e8
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
correlation: qa-1f998d58-3e11-42ad-b482-1c0a557fabe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f998d58-3e11-42ad-b482-1c0a557fabe8
Content-Type: application/json

--- request body ---
{"handle":"qa-075bcbd53da0","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f998d58-3e11-42ad-b482-1c0a557fabe8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47dcee41-41a9-4633-a48f-a902ecf65b4a"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-23d1da71-3cf2-4aec-a6ac-f8ccabb935d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23d1da71-3cf2-4aec-a6ac-f8ccabb935d7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-23d1da71-3cf2-4aec-a6ac-f8ccabb935d7
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

{"id":"acc_47dcee41-41a9-4633-a48f-a902ecf65b4a","handle":"qa-075bcbd53da0","displayName":"QA 075bcbd53da0","region":"eu","role":"user","createdAt":"2026-11-26T11:02:42.432747673Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d227ace8-b806-4119-a3ea-73ac91fedb40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d227ace8-b806-4119-a3ea-73ac91fedb40
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-d227ace8-b806-4119-a3ea-73ac91fedb40
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

{"id":"acc_47dcee41-41a9-4633-a48f-a902ecf65b4a","handle":"qa-075bcbd53da0","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-26T11:02:42.432747673Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-b8b2c9802591
correlation: qa-3dfa383c-1630-47fc-bbc8-e7db398d7a15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dfa383c-1630-47fc-bbc8-e7db398d7a15
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-3dfa383c-1630-47fc-bbc8-e7db398d7a15
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

{"handle":"qa-b8b2c9802591","displayName":"QA b8b2c9802591","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-7dfdb118-057e-480a-acb8-cce9978acca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dfdb118-057e-480a-acb8-cce9978acca1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8b2c9802591","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dfdb118-057e-480a-acb8-cce9978acca1
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
Location: /v1/conversations/cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc
X-Data-Region: us
Content-Length: 238

{"id":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-075bcbd53da0","qa-b8b2c9802591"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.218711126Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-29284b07-8ae2-480d-b91f-b77994fc8df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29284b07-8ae2-480d-b91f-b77994fc8df2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-29284b07-8ae2-480d-b91f-b77994fc8df2
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

{"items":[{"id":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-075bcbd53da0","qa-b8b2c9802591"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.218711126Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-cadd7b25-2978-4446-9b26-d06646856189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cadd7b25-2978-4446-9b26-d06646856189
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b2c9802591","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-cadd7b25-2978-4446-9b26-d06646856189
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ea2b08b-bf12-4254-9ccd-e4a878110fb1"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc
correlation: qa-964938ab-b909-41eb-9df3-e53e35e7c773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964938ab-b909-41eb-9df3-e53e35e7c773
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-964938ab-b909-41eb-9df3-e53e35e7c773
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

{"id":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-075bcbd53da0","qa-b8b2c9802591"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-26T11:02:43.218711126Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc/messages
correlation: qa-438d8659-e56d-41dc-aa7f-8d7d1c041b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438d8659-e56d-41dc-aa7f-8d7d1c041b4b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-438d8659-e56d-41dc-aa7f-8d7d1c041b4b
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

{"items":[{"id":"msg_e8b8c420-5328-417e-9a96-9f214604bdb7","conversationId":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","sender":"qa-075bcbd53da0","body":"Hi","createdAt":"2026-11-26T11:02:43.218746853Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc/messages
correlation: qa-30f7e563-62a0-4704-9416-ab93fa561cab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f7e563-62a0-4704-9416-ab93fa561cab
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-30f7e563-62a0-4704-9416-ab93fa561cab
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

{"id":"msg_2119da19-ea6b-4283-9aad-9f36183854f5","conversationId":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","sender":"qa-b8b2c9802591","body":"Reply","createdAt":"2026-11-26T11:02:43.363497031Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc/read
correlation: qa-b7179d04-1554-4eee-b1d1-f5e09185b815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7179d04-1554-4eee-b1d1-f5e09185b815
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7179d04-1554-4eee-b1d1-f5e09185b815
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

{"conversationId":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc/close
correlation: qa-a9514fe4-e3df-4a98-8334-dc42a6ff3189

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9514fe4-e3df-4a98-8334-dc42a6ff3189
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9514fe4-e3df-4a98-8334-dc42a6ff3189
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

{"id":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-075bcbd53da0","qa-b8b2c9802591"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.218711126Z","closedAt":"2026-11-26T11:02:43.421852353Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-926eb3e4-c9f2-4014-84dd-2b0b834cc94b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-926eb3e4-c9f2-4014-84dd-2b0b834cc94b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-926eb3e4-c9f2-4014-84dd-2b0b834cc94b
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

{"balance":4,"currency":"credits","accountId":"acc_47dcee41-41a9-4633-a48f-a902ecf65b4a"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-80c27e29-fc57-46cc-8e09-ef5761d6c24d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80c27e29-fc57-46cc-8e09-ef5761d6c24d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-80c27e29-fc57-46cc-8e09-ef5761d6c24d
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

{"items":[{"id":"led_19d51763-c769-45d0-a1ca-74ed616362a3","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-26T11:02:42.432772329Z"},{"id":"led_e9a29898-a1d7-4873-ad10-51bd6ecbc5be","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_8a8151bd-d6cd-4cd0-9b93-e0370ae36fdc","createdAt":"2026-11-26T11:02:43.218691739Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f1dcdcb3-5ade-494c-809e-309242e41a94

--- request headers ---
Accept: application/json
Idempotency-Key: qa-564506995fb447baad1886cc62a6a957
X-Correlation-Id: qa-f1dcdcb3-5ade-494c-809e-309242e41a94
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1dcdcb3-5ade-494c-809e-309242e41a94
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
Location: /v1/credits/purchases/pur_00256257-0ed9-49c9-b92f-4961f17a845f
Content-Length: 144

{"id":"pur_00256257-0ed9-49c9-b92f-4961f17a845f","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-26T11:02:43.514054937Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-e74716bc-494b-4e96-b451-c1de76cc9d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e74716bc-494b-4e96-b451-c1de76cc9d07
Content-Type: application/json

--- response: 403 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e74716bc-494b-4e96-b451-c1de76cc9d07
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-e74716bc-494b-4e96-b451-c1de76cc9d07"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec94c843-511e-4ab0-b241-70fa3761dbbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec94c843-511e-4ab0-b241-70fa3761dbbf
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec94c843-511e-4ab0-b241-70fa3761dbbf
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
correlation: qa-9bfc6af2-c482-4293-8e3b-d86b69cba3f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bfc6af2-c482-4293-8e3b-d86b69cba3f5
Content-Type: application/json

--- request body ---
{"handle":"qa-b8b2c9802591","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bfc6af2-c482-4293-8e3b-d86b69cba3f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9bfc6af2-c482-4293-8e3b-d86b69cba3f5"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68214b4c-8585-4328-b45a-aebde2937474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68214b4c-8585-4328-b45a-aebde2937474
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68214b4c-8585-4328-b45a-aebde2937474
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
correlation: qa-c303c298-02b1-4db0-b217-a8b7ec13ebad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c303c298-02b1-4db0-b217-a8b7ec13ebad
Content-Type: application/json

--- request body ---
{"handle":"qa-075bcbd53da0","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c303c298-02b1-4db0-b217-a8b7ec13ebad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c303c298-02b1-4db0-b217-a8b7ec13ebad"}
```
