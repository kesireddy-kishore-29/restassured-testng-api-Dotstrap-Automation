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
| 1 | `POST /v1/accounts` | 201 | 334 | `qa-0766546b-e9d6-46b1-b900-b9fd12911c21` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-3f4c0371-7c6b-4f9d-8ee0-87c7ea435508` |
| 3 | `GET /health` | 200 | 25 | `qa-2335a44d-00b1-4305-964f-bd3a7f2b5a91` |
| 4 | `POST /v1/auth/token` | 200 | 10 | `qa-6a0643a3-db6c-48e4-92e0-527ea2d85905` |
| 5 | `GET /v1/accounts/me` | 200 | 30 | `qa-66100788-4925-4573-ba3c-e89a55e9be02` |
| 6 | `PATCH /v1/accounts/me` | 200 | 33 | `qa-50ea20a3-6927-4c61-b2cb-59f9eb466fe2` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 18 | `qa-562569dd-1913-4014-9109-7c77a4f9030f` |
| 8 | `POST /v1/conversations` | 201 | 14 | `qa-ea840133-e6d4-4a67-9c36-989d63e437c3` |
| 9 | `GET /v1/conversations` | 200 | 20 | `qa-3fe93cdb-1e1a-4ef1-a8f6-806f3cb99fa9` |
| 10 | `POST /v1/auth/token` | 200 | 16 | `qa-c22bfd16-3f6d-46e3-8fe8-e75ba6ecb0e7` |
| 11 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-563bbeba-d99e-48cb-b9ea-01b08344ebcb` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-d99220c5-9f0a-4c68-95e5-1cea4670a0b9` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-0b5d60a0-d578-412f-b249-d6c73f8784b6` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-f5fd2e57-448a-4ede-ba6c-a7afc93f61f7` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 11 | `qa-072911c9-40eb-4f50-bb62-c3fa58ec4de4` |
| 16 | `GET /v1/credits/balance` | 200 | 5 | `qa-46fba7ea-5fde-47e8-a70d-2ded5e6dd199` |
| 17 | `GET /v1/credits/ledger` | 200 | 8 | `qa-804f652e-6083-4d72-bb11-d4e482faf9cf` |
| 18 | `POST /v1/credits/purchases` | 201 | 10 | `qa-c612060f-4645-484a-8122-34d76c50383a` |
| 19 | `GET /v1/admin/stats` | 403 | 16 | `qa-381e9f8e-734a-4867-9127-6219edef7089` |
| 20 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-68dd6f0e-301e-4b7e-8856-ec233ddc2fbd` |
| 21 | `POST /v1/auth/token` | 401 | 32 | `qa-1e8f35be-05d8-491c-a190-55b53a25c5ab` |
| 22 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-d8e6ca46-3f16-4387-8c6a-fe767d779f5f` |
| 23 | `POST /v1/auth/token` | 401 | 13 | `qa-7131c54f-548f-4469-8eca-3f8e2ec10a9f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0766546b-e9d6-46b1-b900-b9fd12911c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0766546b-e9d6-46b1-b900-b9fd12911c21
Content-Type: application/json

--- request body ---
{"handle":"qa-5d21d8ad3468","displayName":"QA 5d21d8ad3468","password":"****","region":"eu"}

--- response: 201 in 334 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0766546b-e9d6-46b1-b900-b9fd12911c21
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
Location: /v1/accounts/qa-5d21d8ad3468
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8896ddd-8b9f-4e3a-9dfc-ccf4f6cadbbe","handle":"qa-5d21d8ad3468","displayName":"QA 5d21d8ad3468","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.121229075Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3f4c0371-7c6b-4f9d-8ee0-87c7ea435508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f4c0371-7c6b-4f9d-8ee0-87c7ea435508
Content-Type: application/json

--- request body ---
{"handle":"qa-b1ef43c330b9","displayName":"QA b1ef43c330b9","password":"****","region":"us"}

--- response: 201 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f4c0371-7c6b-4f9d-8ee0-87c7ea435508
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-b1ef43c330b9
X-Served-Region: us
Content-Length: 181

{"id":"acc_9aa55ab5-2a43-4d64-80c0-09b3824a77f3","handle":"qa-b1ef43c330b9","displayName":"QA b1ef43c330b9","region":"us","role":"user","createdAt":"2026-11-16T09:53:51.383833379Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-2335a44d-00b1-4305-964f-bd3a7f2b5a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2335a44d-00b1-4305-964f-bd3a7f2b5a91
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-2335a44d-00b1-4305-964f-bd3a7f2b5a91
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
correlation: qa-6a0643a3-db6c-48e4-92e0-527ea2d85905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a0643a3-db6c-48e4-92e0-527ea2d85905
Content-Type: application/json

--- request body ---
{"handle":"qa-5d21d8ad3468","password":"****"}

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a0643a3-db6c-48e4-92e0-527ea2d85905
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8896ddd-8b9f-4e3a-9dfc-ccf4f6cadbbe"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-66100788-4925-4573-ba3c-e89a55e9be02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66100788-4925-4573-ba3c-e89a55e9be02
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-66100788-4925-4573-ba3c-e89a55e9be02
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

{"id":"acc_c8896ddd-8b9f-4e3a-9dfc-ccf4f6cadbbe","handle":"qa-5d21d8ad3468","displayName":"QA 5d21d8ad3468","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.121229075Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-50ea20a3-6927-4c61-b2cb-59f9eb466fe2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ea20a3-6927-4c61-b2cb-59f9eb466fe2
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-50ea20a3-6927-4c61-b2cb-59f9eb466fe2
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

{"id":"acc_c8896ddd-8b9f-4e3a-9dfc-ccf4f6cadbbe","handle":"qa-5d21d8ad3468","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.121229075Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-b1ef43c330b9
correlation: qa-562569dd-1913-4014-9109-7c77a4f9030f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-562569dd-1913-4014-9109-7c77a4f9030f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-562569dd-1913-4014-9109-7c77a4f9030f
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

{"handle":"qa-b1ef43c330b9","displayName":"QA b1ef43c330b9","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-ea840133-e6d4-4a67-9c36-989d63e437c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea840133-e6d4-4a67-9c36-989d63e437c3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b1ef43c330b9","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea840133-e6d4-4a67-9c36-989d63e437c3
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
Location: /v1/conversations/cnv_748cdd88-6d11-4b4d-a046-ee80314e316c
X-Data-Region: us
Content-Length: 238

{"id":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5d21d8ad3468","qa-b1ef43c330b9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.626596084Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-3fe93cdb-1e1a-4ef1-a8f6-806f3cb99fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fe93cdb-1e1a-4ef1-a8f6-806f3cb99fa9
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fe93cdb-1e1a-4ef1-a8f6-806f3cb99fa9
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

{"items":[{"id":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5d21d8ad3468","qa-b1ef43c330b9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.626596084Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c22bfd16-3f6d-46e3-8fe8-e75ba6ecb0e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c22bfd16-3f6d-46e3-8fe8-e75ba6ecb0e7
Content-Type: application/json

--- request body ---
{"handle":"qa-b1ef43c330b9","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c22bfd16-3f6d-46e3-8fe8-e75ba6ecb0e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9aa55ab5-2a43-4d64-80c0-09b3824a77f3"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_748cdd88-6d11-4b4d-a046-ee80314e316c
correlation: qa-563bbeba-d99e-48cb-b9ea-01b08344ebcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-563bbeba-d99e-48cb-b9ea-01b08344ebcb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-563bbeba-d99e-48cb-b9ea-01b08344ebcb
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

{"id":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-5d21d8ad3468","qa-b1ef43c330b9"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-16T09:53:51.626596084Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_748cdd88-6d11-4b4d-a046-ee80314e316c/messages
correlation: qa-d99220c5-9f0a-4c68-95e5-1cea4670a0b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d99220c5-9f0a-4c68-95e5-1cea4670a0b9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d99220c5-9f0a-4c68-95e5-1cea4670a0b9
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

{"items":[{"id":"msg_26add7b3-6482-4ac3-867b-23fa69e0ee5d","conversationId":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","sender":"qa-5d21d8ad3468","body":"Hi","createdAt":"2026-11-16T09:53:51.626622193Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_748cdd88-6d11-4b4d-a046-ee80314e316c/messages
correlation: qa-0b5d60a0-d578-412f-b249-d6c73f8784b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b5d60a0-d578-412f-b249-d6c73f8784b6
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b5d60a0-d578-412f-b249-d6c73f8784b6
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

{"id":"msg_7e7cb624-11a6-43b6-8dd5-fd7acd07cb7c","conversationId":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","sender":"qa-b1ef43c330b9","body":"Reply","createdAt":"2026-11-16T09:53:51.760770636Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_748cdd88-6d11-4b4d-a046-ee80314e316c/read
correlation: qa-f5fd2e57-448a-4ede-ba6c-a7afc93f61f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5fd2e57-448a-4ede-ba6c-a7afc93f61f7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5fd2e57-448a-4ede-ba6c-a7afc93f61f7
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

{"conversationId":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_748cdd88-6d11-4b4d-a046-ee80314e316c/close
correlation: qa-072911c9-40eb-4f50-bb62-c3fa58ec4de4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072911c9-40eb-4f50-bb62-c3fa58ec4de4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-072911c9-40eb-4f50-bb62-c3fa58ec4de4
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

{"id":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-5d21d8ad3468","qa-b1ef43c330b9"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.626596084Z","closedAt":"2026-11-16T09:53:51.801107848Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-46fba7ea-5fde-47e8-a70d-2ded5e6dd199

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46fba7ea-5fde-47e8-a70d-2ded5e6dd199
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-46fba7ea-5fde-47e8-a70d-2ded5e6dd199
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

{"balance":4,"currency":"credits","accountId":"acc_c8896ddd-8b9f-4e3a-9dfc-ccf4f6cadbbe"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-804f652e-6083-4d72-bb11-d4e482faf9cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-804f652e-6083-4d72-bb11-d4e482faf9cf
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-804f652e-6083-4d72-bb11-d4e482faf9cf
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

{"items":[{"id":"led_581cf827-2e51-4619-a9ed-5ee6e1d19751","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-16T09:53:51.121255124Z"},{"id":"led_34d446b8-1585-4158-9e27-aab70e68eafc","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_748cdd88-6d11-4b4d-a046-ee80314e316c","createdAt":"2026-11-16T09:53:51.626471487Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c612060f-4645-484a-8122-34d76c50383a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4c4f49093a7849cdb339ec35985bece3
X-Correlation-Id: qa-c612060f-4645-484a-8122-34d76c50383a
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c612060f-4645-484a-8122-34d76c50383a
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
Location: /v1/credits/purchases/pur_7683a214-a3ab-42a8-be93-5cb171bc3c08
Content-Length: 144

{"id":"pur_7683a214-a3ab-42a8-be93-5cb171bc3c08","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-16T09:53:51.850492539Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-381e9f8e-734a-4867-9127-6219edef7089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-381e9f8e-734a-4867-9127-6219edef7089
Content-Type: application/json

--- response: 403 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-381e9f8e-734a-4867-9127-6219edef7089
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-381e9f8e-734a-4867-9127-6219edef7089"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-68dd6f0e-301e-4b7e-8856-ec233ddc2fbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68dd6f0e-301e-4b7e-8856-ec233ddc2fbd
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-68dd6f0e-301e-4b7e-8856-ec233ddc2fbd
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
correlation: qa-1e8f35be-05d8-491c-a190-55b53a25c5ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e8f35be-05d8-491c-a190-55b53a25c5ab
Content-Type: application/json

--- request body ---
{"handle":"qa-b1ef43c330b9","password":"****"}

--- response: 401 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e8f35be-05d8-491c-a190-55b53a25c5ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e8f35be-05d8-491c-a190-55b53a25c5ab"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8e6ca46-3f16-4387-8c6a-fe767d779f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8e6ca46-3f16-4387-8c6a-fe767d779f5f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8e6ca46-3f16-4387-8c6a-fe767d779f5f
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
correlation: qa-7131c54f-548f-4469-8eca-3f8e2ec10a9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7131c54f-548f-4469-8eca-3f8e2ec10a9f
Content-Type: application/json

--- request body ---
{"handle":"qa-5d21d8ad3468","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7131c54f-548f-4469-8eca-3f8e2ec10a9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7131c54f-548f-4469-8eca-3f8e2ec10a9f"}
```
