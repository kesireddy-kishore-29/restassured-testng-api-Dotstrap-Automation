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
| 1 | `POST /v1/accounts` | 201 | 390 | `qa-2af72376-f413-4fef-87ba-d7998b84eba7` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-379680a2-23ee-480e-b671-34048b351f6a` |
| 3 | `GET /health` | 200 | 56 | `qa-fa24c072-6aa3-4d5e-8bae-9027cde9081e` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-4b0a23e4-37c7-47e0-9207-9d88ae917c72` |
| 5 | `GET /v1/accounts/me` | 200 | 22 | `qa-7ab18e38-df00-4776-8586-f5af0d78b5f0` |
| 6 | `PATCH /v1/accounts/me` | 200 | 20 | `qa-c7bb688d-5307-4170-bfb9-b0f256e75354` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 23 | `qa-853c5c22-7065-40ee-8250-bd75c063f9a5` |
| 8 | `POST /v1/conversations` | 201 | 16 | `qa-d22a03d7-250f-442d-a8f9-896c3d540979` |
| 9 | `GET /v1/conversations` | 200 | 21 | `qa-2b166f2c-2616-49ff-ab88-f79ccef73b34` |
| 10 | `POST /v1/auth/token` | 200 | 27 | `qa-15809f44-728c-4aac-99a8-db76c345f1ce` |
| 11 | `GET /v1/conversations/{id}` | 200 | 21 | `qa-8d0790f3-db20-4472-8dcb-bc47867f7d8a` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-bd5d8995-6e16-42cd-97ba-eda53a36966d` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 14 | `qa-a042a07e-b30c-4d93-94d2-ce4c2092fe4f` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 22 | `qa-1c9a18e7-0db4-4869-9b41-26a434a72b1f` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 18 | `qa-c5c9d225-9843-4c5e-bd0d-0cc04f370dab` |
| 16 | `GET /v1/credits/balance` | 200 | 18 | `qa-eea17dd0-8e55-45d7-9b45-e43f1faa9b2b` |
| 17 | `GET /v1/credits/ledger` | 200 | 15 | `qa-9b02c568-8fba-4ef9-a921-273660a6a472` |
| 18 | `POST /v1/credits/purchases` | 201 | 19 | `qa-a0e6b0d8-df6b-4a06-b638-9b9313a84341` |
| 19 | `GET /v1/admin/stats` | 403 | 11 | `qa-16e9c6c6-df6d-4927-86f8-141ce3f75c34` |
| 20 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-f3ba02e2-8c28-4623-936a-d640720784bb` |
| 21 | `POST /v1/auth/token` | 401 | 38 | `qa-9c9ec464-00ce-4599-9ec3-60067aa1d2d7` |
| 22 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-58974621-89aa-4e7b-bba0-75e50fbe5909` |
| 23 | `POST /v1/auth/token` | 401 | 41 | `qa-3ea53cd6-53d5-4edd-bf7b-748b84fd34fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2af72376-f413-4fef-87ba-d7998b84eba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2af72376-f413-4fef-87ba-d7998b84eba7
Content-Type: application/json

--- request body ---
{"handle":"qa-7588665543bb","displayName":"QA 7588665543bb","password":"****","region":"eu"}

--- response: 201 in 390 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2af72376-f413-4fef-87ba-d7998b84eba7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-7588665543bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_282fe34c-b53f-4ad1-99a0-c704f6e392ad","handle":"qa-7588665543bb","displayName":"QA 7588665543bb","region":"eu","role":"user","createdAt":"2026-11-05T09:37:52.611510544Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-379680a2-23ee-480e-b671-34048b351f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-379680a2-23ee-480e-b671-34048b351f6a
Content-Type: application/json

--- request body ---
{"handle":"qa-3237e33a43ec","displayName":"QA 3237e33a43ec","password":"****","region":"us"}

--- response: 201 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-379680a2-23ee-480e-b671-34048b351f6a
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
Location: /v1/accounts/qa-3237e33a43ec
X-Served-Region: us
Content-Length: 181

{"id":"acc_387daefc-6af5-4527-9ce2-3ba61884525d","handle":"qa-3237e33a43ec","displayName":"QA 3237e33a43ec","region":"us","role":"user","createdAt":"2026-11-05T09:37:53.063922430Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-fa24c072-6aa3-4d5e-8bae-9027cde9081e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa24c072-6aa3-4d5e-8bae-9027cde9081e
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa24c072-6aa3-4d5e-8bae-9027cde9081e
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
correlation: qa-4b0a23e4-37c7-47e0-9207-9d88ae917c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b0a23e4-37c7-47e0-9207-9d88ae917c72
Content-Type: application/json

--- request body ---
{"handle":"qa-7588665543bb","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b0a23e4-37c7-47e0-9207-9d88ae917c72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_282fe34c-b53f-4ad1-99a0-c704f6e392ad"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ab18e38-df00-4776-8586-f5af0d78b5f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ab18e38-df00-4776-8586-f5af0d78b5f0
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ab18e38-df00-4776-8586-f5af0d78b5f0
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

{"id":"acc_282fe34c-b53f-4ad1-99a0-c704f6e392ad","handle":"qa-7588665543bb","displayName":"QA 7588665543bb","region":"eu","role":"user","createdAt":"2026-11-05T09:37:52.611510544Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c7bb688d-5307-4170-bfb9-b0f256e75354

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7bb688d-5307-4170-bfb9-b0f256e75354
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7bb688d-5307-4170-bfb9-b0f256e75354
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

{"id":"acc_282fe34c-b53f-4ad1-99a0-c704f6e392ad","handle":"qa-7588665543bb","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-05T09:37:52.611510544Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-3237e33a43ec
correlation: qa-853c5c22-7065-40ee-8250-bd75c063f9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853c5c22-7065-40ee-8250-bd75c063f9a5
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-853c5c22-7065-40ee-8250-bd75c063f9a5
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

{"handle":"qa-3237e33a43ec","displayName":"QA 3237e33a43ec","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-d22a03d7-250f-442d-a8f9-896c3d540979

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d22a03d7-250f-442d-a8f9-896c3d540979
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3237e33a43ec","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d22a03d7-250f-442d-a8f9-896c3d540979
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
Location: /v1/conversations/cnv_d98cb26e-e762-4bd4-a64b-d418548bc573
X-Data-Region: us
Content-Length: 238

{"id":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-7588665543bb","qa-3237e33a43ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.374981999Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-2b166f2c-2616-49ff-ab88-f79ccef73b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b166f2c-2616-49ff-ab88-f79ccef73b34
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b166f2c-2616-49ff-ab88-f79ccef73b34
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

{"items":[{"id":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-7588665543bb","qa-3237e33a43ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.374981999Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-15809f44-728c-4aac-99a8-db76c345f1ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15809f44-728c-4aac-99a8-db76c345f1ce
Content-Type: application/json

--- request body ---
{"handle":"qa-3237e33a43ec","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-15809f44-728c-4aac-99a8-db76c345f1ce
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_387daefc-6af5-4527-9ce2-3ba61884525d"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_d98cb26e-e762-4bd4-a64b-d418548bc573
correlation: qa-8d0790f3-db20-4472-8dcb-bc47867f7d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d0790f3-db20-4472-8dcb-bc47867f7d8a
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d0790f3-db20-4472-8dcb-bc47867f7d8a
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

{"id":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-7588665543bb","qa-3237e33a43ec"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-05T09:37:53.374981999Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_d98cb26e-e762-4bd4-a64b-d418548bc573/messages
correlation: qa-bd5d8995-6e16-42cd-97ba-eda53a36966d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd5d8995-6e16-42cd-97ba-eda53a36966d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd5d8995-6e16-42cd-97ba-eda53a36966d
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

{"items":[{"id":"msg_961cabad-2be4-484e-a1b6-8eba171e8f67","conversationId":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","sender":"qa-7588665543bb","body":"Hi","createdAt":"2026-11-05T09:37:53.375022274Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_d98cb26e-e762-4bd4-a64b-d418548bc573/messages
correlation: qa-a042a07e-b30c-4d93-94d2-ce4c2092fe4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a042a07e-b30c-4d93-94d2-ce4c2092fe4f
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a042a07e-b30c-4d93-94d2-ce4c2092fe4f
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

{"id":"msg_a656b8d5-7b3e-43f4-abd2-a873c55ce260","conversationId":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","sender":"qa-3237e33a43ec","body":"Reply","createdAt":"2026-11-05T09:37:53.564786869Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_d98cb26e-e762-4bd4-a64b-d418548bc573/read
correlation: qa-1c9a18e7-0db4-4869-9b41-26a434a72b1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9a18e7-0db4-4869-9b41-26a434a72b1f
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c9a18e7-0db4-4869-9b41-26a434a72b1f
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

{"conversationId":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_d98cb26e-e762-4bd4-a64b-d418548bc573/close
correlation: qa-c5c9d225-9843-4c5e-bd0d-0cc04f370dab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c9d225-9843-4c5e-bd0d-0cc04f370dab
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5c9d225-9843-4c5e-bd0d-0cc04f370dab
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

{"id":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-7588665543bb","qa-3237e33a43ec"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-05T09:37:53.374981999Z","closedAt":"2026-11-05T09:37:53.651055686Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-eea17dd0-8e55-45d7-9b45-e43f1faa9b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eea17dd0-8e55-45d7-9b45-e43f1faa9b2b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eea17dd0-8e55-45d7-9b45-e43f1faa9b2b
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

{"balance":4,"currency":"credits","accountId":"acc_282fe34c-b53f-4ad1-99a0-c704f6e392ad"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9b02c568-8fba-4ef9-a921-273660a6a472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b02c568-8fba-4ef9-a921-273660a6a472
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b02c568-8fba-4ef9-a921-273660a6a472
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

{"items":[{"id":"led_8bb76f5a-9696-4d6b-b6c4-2c6eeabe0db9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-05T09:37:52.611519471Z"},{"id":"led_167c5bef-68a1-4a3c-b45a-d5f2b5750974","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_d98cb26e-e762-4bd4-a64b-d418548bc573","createdAt":"2026-11-05T09:37:53.374936353Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a0e6b0d8-df6b-4a06-b638-9b9313a84341

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d04497baf8bd403aadc0a7d66191ec60
X-Correlation-Id: qa-a0e6b0d8-df6b-4a06-b638-9b9313a84341
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0e6b0d8-df6b-4a06-b638-9b9313a84341
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
Location: /v1/credits/purchases/pur_fd1ea0da-180e-4971-992d-1a75bdd2ab4e
Content-Length: 144

{"id":"pur_fd1ea0da-180e-4971-992d-1a75bdd2ab4e","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-05T09:37:53.753415194Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-16e9c6c6-df6d-4927-86f8-141ce3f75c34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16e9c6c6-df6d-4927-86f8-141ce3f75c34
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16e9c6c6-df6d-4927-86f8-141ce3f75c34
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-16e9c6c6-df6d-4927-86f8-141ce3f75c34"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3ba02e2-8c28-4623-936a-d640720784bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ba02e2-8c28-4623-936a-d640720784bb
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3ba02e2-8c28-4623-936a-d640720784bb
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
correlation: qa-9c9ec464-00ce-4599-9ec3-60067aa1d2d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c9ec464-00ce-4599-9ec3-60067aa1d2d7
Content-Type: application/json

--- request body ---
{"handle":"qa-3237e33a43ec","password":"****"}

--- response: 401 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c9ec464-00ce-4599-9ec3-60067aa1d2d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c9ec464-00ce-4599-9ec3-60067aa1d2d7"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58974621-89aa-4e7b-bba0-75e50fbe5909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58974621-89aa-4e7b-bba0-75e50fbe5909
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58974621-89aa-4e7b-bba0-75e50fbe5909
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
correlation: qa-3ea53cd6-53d5-4edd-bf7b-748b84fd34fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ea53cd6-53d5-4edd-bf7b-748b84fd34fd
Content-Type: application/json

--- request body ---
{"handle":"qa-7588665543bb","password":"****"}

--- response: 401 in 41 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ea53cd6-53d5-4edd-bf7b-748b84fd34fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ea53cd6-53d5-4edd-bf7b-748b84fd34fd"}
```
