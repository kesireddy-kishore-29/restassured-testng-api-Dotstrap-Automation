# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 103 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-ce8065da-a16e-4513-b89e-96b7eee5ce8e` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-fe17f90c-2df2-4a01-a7f5-4a8be78caca8` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-1f730cb5-6767-4e38-b539-20e058c2e78a` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-4703d8b9-c8df-404c-9eab-6f93a9c014d5` |
| 5 | `GET /v1/accounts/me` | 200 | 7 | `qa-3eb12e95-e816-449a-9479-de388e4a9316` |
| 6 | `GET /v1/accounts/me` | 200 | 8 | `qa-b4d4c0ed-98ea-4712-88f4-eb938e37d42b` |
| 7 | `GET /v1/accounts/me` | 200 | 37 | `qa-fc99c1a6-ce3e-45f6-9bc0-6908c2448614` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-8e04fadd-9932-4d9a-ae4a-415bd1e5de6b` |
| 9 | `GET /v1/accounts/me` | 200 | 11 | `qa-66a052b0-dfb3-4a29-832d-b7e87af37a13` |
| 10 | `GET /v1/accounts/me` | 200 | 17 | `qa-40feb94a-f11c-4bde-8159-6c7486b2ac15` |
| 11 | `GET /v1/accounts/me` | 200 | 16 | `qa-aae5663d-c76b-4e92-8cd8-21b0f6dd5444` |
| 12 | `GET /v1/accounts/me` | 200 | 19 | `qa-2603551a-0efd-46eb-b91f-fd0bb5e5d11d` |
| 13 | `GET /v1/accounts/me` | 200 | 16 | `qa-7da32b28-97af-40de-a5ac-73df0767a9c9` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-e802f637-e733-4a4b-8c06-9eaeea3b2e91` |
| 15 | `GET /v1/accounts/me` | 200 | 16 | `qa-33485179-0931-4765-8e08-2aa84ad82fd0` |
| 16 | `GET /v1/accounts/me` | 200 | 10 | `qa-3d6e87cd-57d2-4ef9-816d-b55cda12df19` |
| 17 | `GET /v1/accounts/me` | 200 | 7 | `qa-f1a2be68-1d40-4c3f-83fe-a0e4181bb315` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-33697366-7114-4335-9ede-8d7d75f30274` |
| 19 | `GET /v1/accounts/me` | 200 | 5 | `qa-9c4b726b-2dc4-40ea-94ec-d04243ce5b56` |
| 20 | `GET /v1/accounts/me` | 200 | 24 | `qa-75c5b4e0-e720-45a3-8d65-9cf9b1f7006d` |
| 21 | `GET /v1/accounts/me` | 200 | 5 | `qa-1e7f33fb-4404-43dd-b04b-5aecb6df3c88` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-7f398c83-079c-4c15-9288-500f7bc2ae4e` |
| 23 | `GET /v1/accounts/me` | 200 | 11 | `qa-059227ea-e59e-439a-b61b-b7f9f8a4737f` |
| 24 | `GET /v1/accounts/me` | 200 | 21 | `qa-1d246e85-48e8-454e-a7fa-9b1e283f4d78` |
| 25 | `GET /v1/accounts/me` | 200 | 24 | `qa-2db33631-aa3e-435b-bdcb-7857fc9e322d` |
| 26 | `GET /v1/accounts/me` | 200 | 18 | `qa-8e723aa7-9d66-41c2-9a97-72b88b24427c` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-0154d32e-b7b5-4b26-8257-37526a7e0d25` |
| 28 | `GET /v1/accounts/me` | 200 | 13 | `qa-e5d04f90-7b62-4e1e-94c3-86cc9ea3dab5` |
| 29 | `GET /v1/accounts/me` | 200 | 15 | `qa-a69adc07-ed6f-44a8-9b99-e679cb452720` |
| 30 | `GET /v1/accounts/me` | 200 | 21 | `qa-06b63de1-b367-4bae-97ec-e7fcd3c50488` |
| 31 | `GET /v1/accounts/me` | 200 | 18 | `qa-5752673b-2a97-4a60-9bb5-796b4c9c2e75` |
| 32 | `GET /v1/accounts/me` | 200 | 12 | `qa-bcaddac6-f5c8-459b-b26c-b52e50abd134` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-b56a710f-f07a-4f57-8814-fc3a2e6f0188` |
| 34 | `GET /v1/accounts/me` | 200 | 13 | `qa-54835811-645b-42b1-b33d-49553c4c66db` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-bd0c22a2-5e2d-4a3d-9638-f106c252066d` |
| 36 | `GET /v1/accounts/me` | 200 | 17 | `qa-a3b36500-97a8-4672-89c0-e6a73643520b` |
| 37 | `GET /v1/accounts/me` | 200 | 16 | `qa-911c3c67-a8a1-4b5b-bce9-5350dc0a99ae` |
| 38 | `GET /v1/accounts/me` | 200 | 13 | `qa-48bd9abf-222e-40ad-8c03-e579d9b16033` |
| 39 | `GET /v1/accounts/me` | 200 | 10 | `qa-68952805-ed7d-4fc3-ba41-d6a5526cfc68` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-3abc83f2-e286-4e90-b27f-5063e0528d4d` |
| 41 | `GET /v1/accounts/me` | 200 | 4 | `qa-6a7f41cd-6abb-494d-b697-b4c2768d74f2` |
| 42 | `GET /v1/accounts/me` | 200 | 11 | `qa-d3a89d37-1d83-4a33-a49d-fa8d766293c2` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-00b8db0d-4220-490b-83e2-54790194bd69` |
| 44 | `GET /v1/accounts/me` | 200 | 12 | `qa-8073c155-2886-46e1-8eb7-00e7c4ea5928` |
| 45 | `GET /v1/accounts/me` | 200 | 9 | `qa-d72f1c1e-e1ea-4218-8fef-89495c90c916` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-7ed6c95b-a3ef-4ddf-ac45-93bce0552fc8` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-3ca1136c-1190-41de-b184-9696cc0800f2` |
| 48 | `GET /v1/accounts/me` | 200 | 14 | `qa-f2c05ceb-5191-4ee9-ba29-7ab0c390c0f0` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-6d2e009d-1fe2-4282-97d6-a19cb2e99261` |
| 50 | `GET /v1/accounts/me` | 200 | 15 | `qa-7b025c99-47f0-4d36-aa85-41ec64c08519` |
| 51 | `GET /v1/accounts/me` | 200 | 5 | `qa-8e2f2b33-e745-42b2-bb53-8d0bdf1bb1aa` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-c1d1a081-975d-46bb-8bf2-cfe36e696c27` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-26f495bb-4b15-4ee3-9dea-4fa7a84a699f` |
| 54 | `GET /v1/accounts/me` | 200 | 2 | `qa-9627e327-0251-4298-9ca0-475a168abd0a` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-b95f7e23-ad54-4cb4-bf09-de5977698f7c` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-2068e4a9-d9b5-463e-8d38-efba77215d4f` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-1862d504-1449-41b1-bbdc-0b8dcd3c7bec` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-a615b688-1b02-4ccb-bd06-fc234809d838` |
| 59 | `GET /v1/accounts/me` | 200 | 9 | `qa-f610662b-cfa3-418b-9f1b-afabae0515ac` |
| 60 | `GET /v1/accounts/me` | 200 | 14 | `qa-c5d25d8e-d0b6-4cc2-9f13-4fe1e2aac79f` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-e7b85893-1f92-4eeb-9095-ef2c1398384d` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-025d9a66-8c03-420e-8106-243012e18d97` |
| 63 | `GET /v1/accounts/me` | 200 | 14 | `qa-e746ec1c-e68a-46e4-89db-b7bcecd85c91` |
| 64 | `GET /v1/accounts/me` | 429 | 11 | `qa-2923d95d-2034-4803-bf83-956680a864c6` |
| 65 | `POST /v1/auth/token` | 429 | 10 | `qa-0238f6c7-0ec4-4397-a035-418653f735e7` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-86fa24dd-acd6-48f2-bfea-c8f6f5443f5e` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-19cd04a4-6679-4881-8f21-e2e4103864c1` |
| 68 | `PATCH /v1/accounts/me` | 429 | 10 | `qa-bfe6beb1-dea9-43b8-b825-ac363738e482` |
| 69 | `DELETE /v1/accounts/me` | 429 | 3 | `qa-fd927231-0d3c-4341-9527-960495286508` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 2 | `qa-4e6377b1-86ee-4234-9f52-2917da5e371a` |
| 71 | `POST /v1/conversations` | 429 | 2 | `qa-6e8fb8a2-1a60-4ab7-9fe5-4aada0da6bbd` |
| 72 | `GET /v1/conversations` | 429 | 2 | `qa-e861fd21-ffae-4c8e-8177-8b614c0795ea` |
| 73 | `GET /v1/conversations/{id}` | 429 | 2 | `qa-6f195bf8-5f19-4a0f-b4d1-99a8f4c5c34d` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 2 | `qa-ba056279-0749-4003-ba6d-fa137a9db112` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 2 | `qa-f439b1fe-0e47-4d4f-895a-cb5d269aca9c` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 2 | `qa-2a5d3e04-e3de-4841-ac86-2828a35ef6b3` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 1 | `qa-a4634278-453f-4c6d-a4d9-e13702198acc` |
| 78 | `GET /v1/credits/balance` | 429 | 2 | `qa-25c288b3-8ad4-4764-adb0-db3f8521bb6a` |
| 79 | `GET /v1/credits/ledger` | 429 | 2 | `qa-d0c29dbb-de06-477e-82e3-5ac75e78fb8b` |
| 80 | `POST /v1/credits/purchases` | 429 | 1 | `qa-c47a207d-5191-43a1-a4f9-a6d8bcaa4632` |
| 81 | `GET /v1/admin/stats` | 429 | 1 | `qa-3ceb9ac2-b7a7-42a6-bf08-3f7fa949d2c1` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-6b362b41-6478-46b5-a9d6-ce5962dedf0a` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-1d2f5e1b-61ee-43a4-9bb0-94bd53c2a867` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-7b97d553-90d7-42d0-a364-7d7b286f86b8` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-4de69bbf-0e85-409f-bcf1-ac7c3f07bf53` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-50d5a3bc-327b-43f0-84e0-d89ff4901e90` |
| 87 | `GET /v1/accounts/me` | 429 | 4 | `qa-e7176e45-f33b-4544-8444-5a2688d330b6` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-96e9fa50-db7e-4a5d-aba4-a3f096183f7c` |
| 89 | `GET /v1/accounts/me` | 429 | 6 | `qa-a855773a-5452-4cce-81fb-aa3fad3ade56` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-71d687ca-ac1d-47fa-ab56-f64677b2d617` |
| 91 | `GET /v1/accounts/me` | 429 | 5 | `qa-fc7f17fc-7410-470e-ba6f-23e0ad8fc510` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-ec86973e-599e-4e83-9baf-545f84c3be6c` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-e7a39211-d3b3-42bc-9d5f-504ab5933444` |
| 94 | `GET /v1/accounts/me` | 429 | 3 | `qa-789591bb-6cfa-4d48-bed4-41f10ef00e13` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-ad7f6687-2caf-4fbd-8b0f-2518bb17a7cc` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-4088c5b4-b6fa-4179-a570-846296365b3f` |
| 97 | `GET /v1/accounts/me` | 429 | 5 | `qa-543628ff-4294-46fb-bef5-41372ff81df5` |
| 98 | `GET /v1/accounts/me` | 200 | 8 | `qa-de413b7b-2ba3-417b-91c0-4139fecb7771` |
| 99 | `POST /v1/auth/token` | 200 | 10 | `qa-271cbe61-e636-4b03-9766-5acd5f6d4cb1` |
| 100 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-8b4698cd-09db-4374-b3c9-bfc96175e7be` |
| 101 | `POST /v1/auth/token` | 401 | 3 | `qa-ee357233-6119-4461-b6aa-593e4bdf9eb9` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-e3791b12-1e26-4e5e-9700-7856b0b070a3` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-0bc9f696-9e87-4401-9a15-19e7b21170e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce8065da-a16e-4513-b89e-96b7eee5ce8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8065da-a16e-4513-b89e-96b7eee5ce8e
Content-Type: application/json

--- request body ---
{"handle":"qa-f98712876776","displayName":"QA f98712876776","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8065da-a16e-4513-b89e-96b7eee5ce8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Location: /v1/accounts/qa-f98712876776
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fe17f90c-2df2-4a01-a7f5-4a8be78caca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe17f90c-2df2-4a01-a7f5-4a8be78caca8
Content-Type: application/json

--- request body ---
{"handle":"qa-09fc0a29c15f","displayName":"QA 09fc0a29c15f","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe17f90c-2df2-4a01-a7f5-4a8be78caca8
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
Location: /v1/accounts/qa-09fc0a29c15f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03043e6b-0417-4003-91df-64466c1c3762","handle":"qa-09fc0a29c15f","displayName":"QA 09fc0a29c15f","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.701981227Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1f730cb5-6767-4e38-b539-20e058c2e78a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f730cb5-6767-4e38-b539-20e058c2e78a
Content-Type: application/json

--- request body ---
{"handle":"qa-f98712876776","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f730cb5-6767-4e38-b539-20e058c2e78a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6868a6d-4be0-4565-b0e3-b64278553186"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4703d8b9-c8df-404c-9eab-6f93a9c014d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4703d8b9-c8df-404c-9eab-6f93a9c014d5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-09fc0a29c15f","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4703d8b9-c8df-404c-9eab-6f93a9c014d5
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
Location: /v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a7f39264-580b-419b-86ef-21f42ed7e085","subject":"Error contract","status":"open","region":"eu","participants":["qa-f98712876776","qa-09fc0a29c15f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.741728216Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-3eb12e95-e816-449a-9479-de388e4a9316

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eb12e95-e816-449a-9479-de388e4a9316
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eb12e95-e816-449a-9479-de388e4a9316
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4d4c0ed-98ea-4712-88f4-eb938e37d42b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4d4c0ed-98ea-4712-88f4-eb938e37d42b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4d4c0ed-98ea-4712-88f4-eb938e37d42b
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc99c1a6-ce3e-45f6-9bc0-6908c2448614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc99c1a6-ce3e-45f6-9bc0-6908c2448614
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc99c1a6-ce3e-45f6-9bc0-6908c2448614
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e04fadd-9932-4d9a-ae4a-415bd1e5de6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e04fadd-9932-4d9a-ae4a-415bd1e5de6b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e04fadd-9932-4d9a-ae4a-415bd1e5de6b
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-66a052b0-dfb3-4a29-832d-b7e87af37a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a052b0-dfb3-4a29-832d-b7e87af37a13
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a052b0-dfb3-4a29-832d-b7e87af37a13
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-40feb94a-f11c-4bde-8159-6c7486b2ac15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40feb94a-f11c-4bde-8159-6c7486b2ac15
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-40feb94a-f11c-4bde-8159-6c7486b2ac15
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-aae5663d-c76b-4e92-8cd8-21b0f6dd5444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aae5663d-c76b-4e92-8cd8-21b0f6dd5444
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-aae5663d-c76b-4e92-8cd8-21b0f6dd5444
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-2603551a-0efd-46eb-b91f-fd0bb5e5d11d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2603551a-0efd-46eb-b91f-fd0bb5e5d11d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2603551a-0efd-46eb-b91f-fd0bb5e5d11d
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-7da32b28-97af-40de-a5ac-73df0767a9c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7da32b28-97af-40de-a5ac-73df0767a9c9
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7da32b28-97af-40de-a5ac-73df0767a9c9
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-e802f637-e733-4a4b-8c06-9eaeea3b2e91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e802f637-e733-4a4b-8c06-9eaeea3b2e91
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e802f637-e733-4a4b-8c06-9eaeea3b2e91
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-33485179-0931-4765-8e08-2aa84ad82fd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33485179-0931-4765-8e08-2aa84ad82fd0
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-33485179-0931-4765-8e08-2aa84ad82fd0
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
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d6e87cd-57d2-4ef9-816d-b55cda12df19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d6e87cd-57d2-4ef9-816d-b55cda12df19
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d6e87cd-57d2-4ef9-816d-b55cda12df19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1a2be68-1d40-4c3f-83fe-a0e4181bb315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1a2be68-1d40-4c3f-83fe-a0e4181bb315
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1a2be68-1d40-4c3f-83fe-a0e4181bb315
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-33697366-7114-4335-9ede-8d7d75f30274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33697366-7114-4335-9ede-8d7d75f30274
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-33697366-7114-4335-9ede-8d7d75f30274
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c4b726b-2dc4-40ea-94ec-d04243ce5b56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c4b726b-2dc4-40ea-94ec-d04243ce5b56
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c4b726b-2dc4-40ea-94ec-d04243ce5b56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-75c5b4e0-e720-45a3-8d65-9cf9b1f7006d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c5b4e0-e720-45a3-8d65-9cf9b1f7006d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-75c5b4e0-e720-45a3-8d65-9cf9b1f7006d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e7f33fb-4404-43dd-b04b-5aecb6df3c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e7f33fb-4404-43dd-b04b-5aecb6df3c88
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e7f33fb-4404-43dd-b04b-5aecb6df3c88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f398c83-079c-4c15-9288-500f7bc2ae4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f398c83-079c-4c15-9288-500f7bc2ae4e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f398c83-079c-4c15-9288-500f7bc2ae4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-059227ea-e59e-439a-b61b-b7f9f8a4737f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-059227ea-e59e-439a-b61b-b7f9f8a4737f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-059227ea-e59e-439a-b61b-b7f9f8a4737f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d246e85-48e8-454e-a7fa-9b1e283f4d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d246e85-48e8-454e-a7fa-9b1e283f4d78
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d246e85-48e8-454e-a7fa-9b1e283f4d78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-2db33631-aa3e-435b-bdcb-7857fc9e322d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db33631-aa3e-435b-bdcb-7857fc9e322d
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db33631-aa3e-435b-bdcb-7857fc9e322d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e723aa7-9d66-41c2-9a97-72b88b24427c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e723aa7-9d66-41c2-9a97-72b88b24427c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e723aa7-9d66-41c2-9a97-72b88b24427c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-0154d32e-b7b5-4b26-8257-37526a7e0d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0154d32e-b7b5-4b26-8257-37526a7e0d25
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0154d32e-b7b5-4b26-8257-37526a7e0d25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5d04f90-7b62-4e1e-94c3-86cc9ea3dab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5d04f90-7b62-4e1e-94c3-86cc9ea3dab5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5d04f90-7b62-4e1e-94c3-86cc9ea3dab5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-a69adc07-ed6f-44a8-9b99-e679cb452720

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a69adc07-ed6f-44a8-9b99-e679cb452720
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a69adc07-ed6f-44a8-9b99-e679cb452720
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-06b63de1-b367-4bae-97ec-e7fcd3c50488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b63de1-b367-4bae-97ec-e7fcd3c50488
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-06b63de1-b367-4bae-97ec-e7fcd3c50488
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-5752673b-2a97-4a60-9bb5-796b4c9c2e75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5752673b-2a97-4a60-9bb5-796b4c9c2e75
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5752673b-2a97-4a60-9bb5-796b4c9c2e75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcaddac6-f5c8-459b-b26c-b52e50abd134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcaddac6-f5c8-459b-b26c-b52e50abd134
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcaddac6-f5c8-459b-b26c-b52e50abd134
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-b56a710f-f07a-4f57-8814-fc3a2e6f0188

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b56a710f-f07a-4f57-8814-fc3a2e6f0188
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b56a710f-f07a-4f57-8814-fc3a2e6f0188
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-54835811-645b-42b1-b33d-49553c4c66db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54835811-645b-42b1-b33d-49553c4c66db
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-54835811-645b-42b1-b33d-49553c4c66db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd0c22a2-5e2d-4a3d-9638-f106c252066d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0c22a2-5e2d-4a3d-9638-f106c252066d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0c22a2-5e2d-4a3d-9638-f106c252066d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3b36500-97a8-4672-89c0-e6a73643520b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3b36500-97a8-4672-89c0-e6a73643520b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3b36500-97a8-4672-89c0-e6a73643520b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-911c3c67-a8a1-4b5b-bce9-5350dc0a99ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-911c3c67-a8a1-4b5b-bce9-5350dc0a99ae
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-911c3c67-a8a1-4b5b-bce9-5350dc0a99ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-48bd9abf-222e-40ad-8c03-e579d9b16033

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bd9abf-222e-40ad-8c03-e579d9b16033
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-48bd9abf-222e-40ad-8c03-e579d9b16033
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-68952805-ed7d-4fc3-ba41-d6a5526cfc68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68952805-ed7d-4fc3-ba41-d6a5526cfc68
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-68952805-ed7d-4fc3-ba41-d6a5526cfc68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-3abc83f2-e286-4e90-b27f-5063e0528d4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3abc83f2-e286-4e90-b27f-5063e0528d4d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3abc83f2-e286-4e90-b27f-5063e0528d4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a7f41cd-6abb-494d-b697-b4c2768d74f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a7f41cd-6abb-494d-b697-b4c2768d74f2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a7f41cd-6abb-494d-b697-b4c2768d74f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3a89d37-1d83-4a33-a49d-fa8d766293c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a89d37-1d83-4a33-a49d-fa8d766293c2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3a89d37-1d83-4a33-a49d-fa8d766293c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-00b8db0d-4220-490b-83e2-54790194bd69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b8db0d-4220-490b-83e2-54790194bd69
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-00b8db0d-4220-490b-83e2-54790194bd69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-8073c155-2886-46e1-8eb7-00e7c4ea5928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8073c155-2886-46e1-8eb7-00e7c4ea5928
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8073c155-2886-46e1-8eb7-00e7c4ea5928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-d72f1c1e-e1ea-4218-8fef-89495c90c916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d72f1c1e-e1ea-4218-8fef-89495c90c916
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d72f1c1e-e1ea-4218-8fef-89495c90c916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ed6c95b-a3ef-4ddf-ac45-93bce0552fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ed6c95b-a3ef-4ddf-ac45-93bce0552fc8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ed6c95b-a3ef-4ddf-ac45-93bce0552fc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ca1136c-1190-41de-b184-9696cc0800f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca1136c-1190-41de-b184-9696cc0800f2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ca1136c-1190-41de-b184-9696cc0800f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2c05ceb-5191-4ee9-ba29-7ab0c390c0f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c05ceb-5191-4ee9-ba29-7ab0c390c0f0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2c05ceb-5191-4ee9-ba29-7ab0c390c0f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d2e009d-1fe2-4282-97d6-a19cb2e99261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d2e009d-1fe2-4282-97d6-a19cb2e99261
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d2e009d-1fe2-4282-97d6-a19cb2e99261
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b025c99-47f0-4d36-aa85-41ec64c08519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b025c99-47f0-4d36-aa85-41ec64c08519
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b025c99-47f0-4d36-aa85-41ec64c08519
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e2f2b33-e745-42b2-bb53-8d0bdf1bb1aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e2f2b33-e745-42b2-bb53-8d0bdf1bb1aa
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e2f2b33-e745-42b2-bb53-8d0bdf1bb1aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-c1d1a081-975d-46bb-8bf2-cfe36e696c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1d1a081-975d-46bb-8bf2-cfe36e696c27
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1d1a081-975d-46bb-8bf2-cfe36e696c27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-26f495bb-4b15-4ee3-9dea-4fa7a84a699f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26f495bb-4b15-4ee3-9dea-4fa7a84a699f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-26f495bb-4b15-4ee3-9dea-4fa7a84a699f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-9627e327-0251-4298-9ca0-475a168abd0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9627e327-0251-4298-9ca0-475a168abd0a
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9627e327-0251-4298-9ca0-475a168abd0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-b95f7e23-ad54-4cb4-bf09-de5977698f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b95f7e23-ad54-4cb4-bf09-de5977698f7c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b95f7e23-ad54-4cb4-bf09-de5977698f7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-2068e4a9-d9b5-463e-8d38-efba77215d4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2068e4a9-d9b5-463e-8d38-efba77215d4f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2068e4a9-d9b5-463e-8d38-efba77215d4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-1862d504-1449-41b1-bbdc-0b8dcd3c7bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1862d504-1449-41b1-bbdc-0b8dcd3c7bec
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1862d504-1449-41b1-bbdc-0b8dcd3c7bec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-a615b688-1b02-4ccb-bd06-fc234809d838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a615b688-1b02-4ccb-bd06-fc234809d838
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a615b688-1b02-4ccb-bd06-fc234809d838
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-f610662b-cfa3-418b-9f1b-afabae0515ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f610662b-cfa3-418b-9f1b-afabae0515ac
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f610662b-cfa3-418b-9f1b-afabae0515ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5d25d8e-d0b6-4cc2-9f13-4fe1e2aac79f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5d25d8e-d0b6-4cc2-9f13-4fe1e2aac79f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5d25d8e-d0b6-4cc2-9f13-4fe1e2aac79f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7b85893-1f92-4eeb-9095-ef2c1398384d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7b85893-1f92-4eeb-9095-ef2c1398384d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7b85893-1f92-4eeb-9095-ef2c1398384d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-025d9a66-8c03-420e-8106-243012e18d97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-025d9a66-8c03-420e-8106-243012e18d97
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-025d9a66-8c03-420e-8106-243012e18d97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-e746ec1c-e68a-46e4-89db-b7bcecd85c91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e746ec1c-e68a-46e4-89db-b7bcecd85c91
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e746ec1c-e68a-46e4-89db-b7bcecd85c91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-2923d95d-2034-4803-bf83-956680a864c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2923d95d-2034-4803-bf83-956680a864c6
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2923d95d-2034-4803-bf83-956680a864c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2923d95d-2034-4803-bf83-956680a864c6"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-0238f6c7-0ec4-4397-a035-418653f735e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0238f6c7-0ec4-4397-a035-418653f735e7
Content-Type: application/json

--- request body ---
{"handle":"qa-f98712876776","password":"****"}

--- response: 429 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0238f6c7-0ec4-4397-a035-418653f735e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-0238f6c7-0ec4-4397-a035-418653f735e7"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-86fa24dd-acd6-48f2-bfea-c8f6f5443f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86fa24dd-acd6-48f2-bfea-c8f6f5443f5e
Content-Type: application/json

--- request body ---
{"handle":"qa-d022d126869a","displayName":"QA d022d126869a","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86fa24dd-acd6-48f2-bfea-c8f6f5443f5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-86fa24dd-acd6-48f2-bfea-c8f6f5443f5e"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-19cd04a4-6679-4881-8f21-e2e4103864c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19cd04a4-6679-4881-8f21-e2e4103864c1
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19cd04a4-6679-4881-8f21-e2e4103864c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-19cd04a4-6679-4881-8f21-e2e4103864c1"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-bfe6beb1-dea9-43b8-b825-ac363738e482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfe6beb1-dea9-43b8-b825-ac363738e482
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 10 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfe6beb1-dea9-43b8-b825-ac363738e482
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bfe6beb1-dea9-43b8-b825-ac363738e482"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd927231-0d3c-4341-9527-960495286508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd927231-0d3c-4341-9527-960495286508
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd927231-0d3c-4341-9527-960495286508
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fd927231-0d3c-4341-9527-960495286508"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-f98712876776
correlation: qa-4e6377b1-86ee-4234-9f52-2917da5e371a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e6377b1-86ee-4234-9f52-2917da5e371a
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e6377b1-86ee-4234-9f52-2917da5e371a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-f98712876776","correlationId":"qa-4e6377b1-86ee-4234-9f52-2917da5e371a"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-6e8fb8a2-1a60-4ab7-9fe5-4aada0da6bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e8fb8a2-1a60-4ab7-9fe5-4aada0da6bbd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f98712876776","subject":"Probe","message":"Hi"}

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e8fb8a2-1a60-4ab7-9fe5-4aada0da6bbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-6e8fb8a2-1a60-4ab7-9fe5-4aada0da6bbd"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-e861fd21-ffae-4c8e-8177-8b614c0795ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e861fd21-ffae-4c8e-8177-8b614c0795ea
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e861fd21-ffae-4c8e-8177-8b614c0795ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-e861fd21-ffae-4c8e-8177-8b614c0795ea"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085
correlation: qa-6f195bf8-5f19-4a0f-b4d1-99a8f4c5c34d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f195bf8-5f19-4a0f-b4d1-99a8f4c5c34d
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f195bf8-5f19-4a0f-b4d1-99a8f4c5c34d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085","correlationId":"qa-6f195bf8-5f19-4a0f-b4d1-99a8f4c5c34d"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/messages
correlation: qa-ba056279-0749-4003-ba6d-fa137a9db112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba056279-0749-4003-ba6d-fa137a9db112
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba056279-0749-4003-ba6d-fa137a9db112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/messages","correlationId":"qa-ba056279-0749-4003-ba6d-fa137a9db112"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/messages
correlation: qa-f439b1fe-0e47-4d4f-895a-cb5d269aca9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f439b1fe-0e47-4d4f-895a-cb5d269aca9c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f439b1fe-0e47-4d4f-895a-cb5d269aca9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/messages","correlationId":"qa-f439b1fe-0e47-4d4f-895a-cb5d269aca9c"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/read
correlation: qa-2a5d3e04-e3de-4841-ac86-2828a35ef6b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a5d3e04-e3de-4841-ac86-2828a35ef6b3
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a5d3e04-e3de-4841-ac86-2828a35ef6b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/read","correlationId":"qa-2a5d3e04-e3de-4841-ac86-2828a35ef6b3"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/close
correlation: qa-a4634278-453f-4c6d-a4d9-e13702198acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4634278-453f-4c6d-a4d9-e13702198acc
Content-Type: application/json

--- response: 429 in 1 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4634278-453f-4c6d-a4d9-e13702198acc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_a7f39264-580b-419b-86ef-21f42ed7e085/close","correlationId":"qa-a4634278-453f-4c6d-a4d9-e13702198acc"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-25c288b3-8ad4-4764-adb0-db3f8521bb6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c288b3-8ad4-4764-adb0-db3f8521bb6a
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25c288b3-8ad4-4764-adb0-db3f8521bb6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-25c288b3-8ad4-4764-adb0-db3f8521bb6a"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d0c29dbb-de06-477e-82e3-5ac75e78fb8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c29dbb-de06-477e-82e3-5ac75e78fb8b
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0c29dbb-de06-477e-82e3-5ac75e78fb8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-d0c29dbb-de06-477e-82e3-5ac75e78fb8b"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c47a207d-5191-43a1-a4f9-a6d8bcaa4632

--- request headers ---
Accept: application/json
Idempotency-Key: qa-55762b1ed954421196cc2281b02f547f
X-Correlation-Id: qa-c47a207d-5191-43a1-a4f9-a6d8bcaa4632
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 1 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c47a207d-5191-43a1-a4f9-a6d8bcaa4632
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-c47a207d-5191-43a1-a4f9-a6d8bcaa4632"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-3ceb9ac2-b7a7-42a6-bf08-3f7fa949d2c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ceb9ac2-b7a7-42a6-bf08-3f7fa949d2c1
Content-Type: application/json

--- response: 429 in 1 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ceb9ac2-b7a7-42a6-bf08-3f7fa949d2c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-3ceb9ac2-b7a7-42a6-bf08-3f7fa949d2c1"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b362b41-6478-46b5-a9d6-ce5962dedf0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b362b41-6478-46b5-a9d6-ce5962dedf0a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b362b41-6478-46b5-a9d6-ce5962dedf0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6b362b41-6478-46b5-a9d6-ce5962dedf0a"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d2f5e1b-61ee-43a4-9bb0-94bd53c2a867

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d2f5e1b-61ee-43a4-9bb0-94bd53c2a867
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d2f5e1b-61ee-43a4-9bb0-94bd53c2a867
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1d2f5e1b-61ee-43a4-9bb0-94bd53c2a867"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b97d553-90d7-42d0-a364-7d7b286f86b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b97d553-90d7-42d0-a364-7d7b286f86b8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b97d553-90d7-42d0-a364-7d7b286f86b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7b97d553-90d7-42d0-a364-7d7b286f86b8"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-4de69bbf-0e85-409f-bcf1-ac7c3f07bf53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4de69bbf-0e85-409f-bcf1-ac7c3f07bf53
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4de69bbf-0e85-409f-bcf1-ac7c3f07bf53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4de69bbf-0e85-409f-bcf1-ac7c3f07bf53"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-50d5a3bc-327b-43f0-84e0-d89ff4901e90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50d5a3bc-327b-43f0-84e0-d89ff4901e90
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50d5a3bc-327b-43f0-84e0-d89ff4901e90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-50d5a3bc-327b-43f0-84e0-d89ff4901e90"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7176e45-f33b-4544-8444-5a2688d330b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7176e45-f33b-4544-8444-5a2688d330b6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7176e45-f33b-4544-8444-5a2688d330b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e7176e45-f33b-4544-8444-5a2688d330b6"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-96e9fa50-db7e-4a5d-aba4-a3f096183f7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96e9fa50-db7e-4a5d-aba4-a3f096183f7c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96e9fa50-db7e-4a5d-aba4-a3f096183f7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-96e9fa50-db7e-4a5d-aba4-a3f096183f7c"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-a855773a-5452-4cce-81fb-aa3fad3ade56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a855773a-5452-4cce-81fb-aa3fad3ade56
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 25 Nov 2026 11:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a855773a-5452-4cce-81fb-aa3fad3ade56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a855773a-5452-4cce-81fb-aa3fad3ade56"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-71d687ca-ac1d-47fa-ab56-f64677b2d617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71d687ca-ac1d-47fa-ab56-f64677b2d617
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71d687ca-ac1d-47fa-ab56-f64677b2d617
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-71d687ca-ac1d-47fa-ab56-f64677b2d617"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc7f17fc-7410-470e-ba6f-23e0ad8fc510

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc7f17fc-7410-470e-ba6f-23e0ad8fc510
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc7f17fc-7410-470e-ba6f-23e0ad8fc510
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc7f17fc-7410-470e-ba6f-23e0ad8fc510"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec86973e-599e-4e83-9baf-545f84c3be6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec86973e-599e-4e83-9baf-545f84c3be6c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec86973e-599e-4e83-9baf-545f84c3be6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ec86973e-599e-4e83-9baf-545f84c3be6c"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7a39211-d3b3-42bc-9d5f-504ab5933444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7a39211-d3b3-42bc-9d5f-504ab5933444
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7a39211-d3b3-42bc-9d5f-504ab5933444
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e7a39211-d3b3-42bc-9d5f-504ab5933444"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-789591bb-6cfa-4d48-bed4-41f10ef00e13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-789591bb-6cfa-4d48-bed4-41f10ef00e13
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-789591bb-6cfa-4d48-bed4-41f10ef00e13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-789591bb-6cfa-4d48-bed4-41f10ef00e13"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad7f6687-2caf-4fbd-8b0f-2518bb17a7cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad7f6687-2caf-4fbd-8b0f-2518bb17a7cc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad7f6687-2caf-4fbd-8b0f-2518bb17a7cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ad7f6687-2caf-4fbd-8b0f-2518bb17a7cc"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-4088c5b4-b6fa-4179-a570-846296365b3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4088c5b4-b6fa-4179-a570-846296365b3f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4088c5b4-b6fa-4179-a570-846296365b3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4088c5b4-b6fa-4179-a570-846296365b3f"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-543628ff-4294-46fb-bef5-41372ff81df5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-543628ff-4294-46fb-bef5-41372ff81df5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-543628ff-4294-46fb-bef5-41372ff81df5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-543628ff-4294-46fb-bef5-41372ff81df5"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-de413b7b-2ba3-417b-91c0-4139fecb7771

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de413b7b-2ba3-417b-91c0-4139fecb7771
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-de413b7b-2ba3-417b-91c0-4139fecb7771
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

{"id":"acc_c6868a6d-4be0-4565-b0e3-b64278553186","handle":"qa-f98712876776","displayName":"QA f98712876776","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.630216352Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-271cbe61-e636-4b03-9766-5acd5f6d4cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-271cbe61-e636-4b03-9766-5acd5f6d4cb1
Content-Type: application/json

--- request body ---
{"handle":"qa-09fc0a29c15f","password":"****"}

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-271cbe61-e636-4b03-9766-5acd5f6d4cb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03043e6b-0417-4003-91df-64466c1c3762"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b4698cd-09db-4374-b3c9-bfc96175e7be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4698cd-09db-4374-b3c9-bfc96175e7be
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b4698cd-09db-4374-b3c9-bfc96175e7be
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

## 101. POST /v1/auth/token

```text
#101 POST http://localhost:7070/v1/auth/token
correlation: qa-ee357233-6119-4461-b6aa-593e4bdf9eb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee357233-6119-4461-b6aa-593e4bdf9eb9
Content-Type: application/json

--- request body ---
{"handle":"qa-09fc0a29c15f","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee357233-6119-4461-b6aa-593e4bdf9eb9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee357233-6119-4461-b6aa-593e4bdf9eb9"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3791b12-1e26-4e5e-9700-7856b0b070a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3791b12-1e26-4e5e-9700-7856b0b070a3
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3791b12-1e26-4e5e-9700-7856b0b070a3
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

## 103. POST /v1/auth/token

```text
#103 POST http://localhost:7070/v1/auth/token
correlation: qa-0bc9f696-9e87-4401-9a15-19e7b21170e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bc9f696-9e87-4401-9a15-19e7b21170e0
Content-Type: application/json

--- request body ---
{"handle":"qa-f98712876776","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 25 Nov 2026 11:28:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bc9f696-9e87-4401-9a15-19e7b21170e0
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bc9f696-9e87-4401-9a15-19e7b21170e0"}
```
