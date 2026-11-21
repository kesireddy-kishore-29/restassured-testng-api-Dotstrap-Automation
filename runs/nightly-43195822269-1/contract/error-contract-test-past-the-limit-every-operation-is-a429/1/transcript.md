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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-041abdbe-8af1-485d-8005-b8ecba29c321` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-eb127348-51cd-49a1-a789-6b07d5edc8fb` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-97840c3b-46e7-46a6-8ab0-6a49fdb34524` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-c3ea44cd-dce8-45ac-bb36-bc9929acce95` |
| 5 | `GET /v1/accounts/me` | 200 | 14 | `qa-4a2e70c7-8f0f-435e-a746-b2e80a1a237f` |
| 6 | `GET /v1/accounts/me` | 200 | 32 | `qa-3ee2e838-fe3c-4f7c-a59a-e3c18679d901` |
| 7 | `GET /v1/accounts/me` | 200 | 22 | `qa-8b6ac6e3-25f6-4f3a-a0fb-9218f4637010` |
| 8 | `GET /v1/accounts/me` | 200 | 26 | `qa-d3496e9d-a514-4101-99c4-b0d185129e54` |
| 9 | `GET /v1/accounts/me` | 200 | 22 | `qa-0f9fe170-af40-4b00-94f2-b85441ad62ce` |
| 10 | `GET /v1/accounts/me` | 200 | 9 | `qa-312211bc-da2b-4218-83eb-6d989d2a164a` |
| 11 | `GET /v1/accounts/me` | 200 | 10 | `qa-5c7a674b-147f-4429-867a-07616e4a48e0` |
| 12 | `GET /v1/accounts/me` | 200 | 25 | `qa-03c02995-2afa-47e9-94ff-d3008680d8fd` |
| 13 | `GET /v1/accounts/me` | 200 | 18 | `qa-8bd670cc-ac9d-461d-9818-a57bea2eea3e` |
| 14 | `GET /v1/accounts/me` | 200 | 7 | `qa-01bbd7c5-f07c-4171-98f6-c44fc63fabe3` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-6c91e09e-eec0-4cae-845b-a2ccaf9433a5` |
| 16 | `GET /v1/accounts/me` | 200 | 27 | `qa-ae6e93b4-2f0f-42ec-bc44-e27c7bcf0a56` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-8cc21b0f-bb20-4887-98ef-14fc6c0a82b3` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-63136015-ac76-4841-9f36-453831dcc59d` |
| 19 | `GET /v1/accounts/me` | 200 | 17 | `qa-bc606e88-f094-40a8-aa13-39d32792986e` |
| 20 | `GET /v1/accounts/me` | 200 | 5 | `qa-d6e01886-0be0-4b77-a387-0772800f1e4f` |
| 21 | `GET /v1/accounts/me` | 200 | 16 | `qa-4cf1a92e-11ef-4bce-9636-1c6619914bb7` |
| 22 | `GET /v1/accounts/me` | 200 | 10 | `qa-8c048d08-dbff-4cc0-81af-0b4e024ee3d7` |
| 23 | `GET /v1/accounts/me` | 200 | 5 | `qa-4bac8c42-66e5-4fd3-86fa-c869293e6800` |
| 24 | `GET /v1/accounts/me` | 200 | 26 | `qa-dd4425e1-4bf1-42b1-825c-264a94b1498d` |
| 25 | `GET /v1/accounts/me` | 200 | 12 | `qa-73a9955f-f2fc-450a-8f61-c34a14d4e462` |
| 26 | `GET /v1/accounts/me` | 200 | 31 | `qa-428e81ff-29d1-416a-b0ec-904bd83e4c6c` |
| 27 | `GET /v1/accounts/me` | 200 | 49 | `qa-74c90f1b-4a84-4c56-a1fc-be8b48352d26` |
| 28 | `GET /v1/accounts/me` | 200 | 56 | `qa-ac12c33c-7c28-4fe0-a800-27023253b97b` |
| 29 | `GET /v1/accounts/me` | 200 | 4 | `qa-dbebadf0-0561-4492-9454-c2b992ef0ff9` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-aa91c681-cae4-4b68-bb07-46de7c61b974` |
| 31 | `GET /v1/accounts/me` | 200 | 11 | `qa-3377de1c-74a8-4407-9b80-851c4859c4d3` |
| 32 | `GET /v1/accounts/me` | 200 | 16 | `qa-ba51b1d0-4c67-4406-b91a-c7a0acf9d461` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-98a78388-38e8-44fd-868a-cb2f25b7a7fa` |
| 34 | `GET /v1/accounts/me` | 200 | 18 | `qa-7e7a7335-0eb2-4705-bf0a-0695dc5d7575` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-277bc209-4445-4b54-959b-3cd168b7f58a` |
| 36 | `GET /v1/accounts/me` | 200 | 13 | `qa-2fba8729-0f5c-4675-9c27-f0f09a1b4038` |
| 37 | `GET /v1/accounts/me` | 200 | 18 | `qa-eb82bfdf-cb50-4e2d-8391-fe69ad3ebd69` |
| 38 | `GET /v1/accounts/me` | 200 | 17 | `qa-15aec320-9c38-4082-95fc-43ee9cf5c417` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-23b9a33a-828e-4bd7-bf32-7926497e5f1c` |
| 40 | `GET /v1/accounts/me` | 200 | 10 | `qa-80216239-83ec-43f3-a2bb-0656b947e5f5` |
| 41 | `GET /v1/accounts/me` | 200 | 8 | `qa-81fd7d5a-f49a-4da2-8e69-f98c02f50e13` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-8b8a04a6-9cc9-476d-8fb2-2fa6143a6223` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-a36be383-3471-41d2-8136-5d8e190e142a` |
| 44 | `GET /v1/accounts/me` | 200 | 2 | `qa-329f6e3c-d107-4b7b-89bf-779f125e0407` |
| 45 | `GET /v1/accounts/me` | 200 | 9 | `qa-e92f27d7-284c-4d21-aeae-8ccebe5044c3` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-98a64334-75e0-49b7-9009-8faa2052db9a` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-38f36823-d063-4e43-8561-59ca675bbd18` |
| 48 | `GET /v1/accounts/me` | 200 | 8 | `qa-e3045642-e9d1-465f-9ce3-32b631f66600` |
| 49 | `GET /v1/accounts/me` | 200 | 9 | `qa-1874e640-3e95-4c3c-aea7-786f5214a168` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-d7ddcf96-61b8-4f14-be5e-5683f5a96a5f` |
| 51 | `GET /v1/accounts/me` | 200 | 5 | `qa-cd465277-2a39-4a60-ab21-cb43c45eaf0f` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-db4720f7-247c-468d-818b-059f807fc49b` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-7be292f9-8281-4532-b21d-7827d05bcd88` |
| 54 | `GET /v1/accounts/me` | 200 | 3 | `qa-912f3ff0-c8f1-43db-83d4-4e60d58128be` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-5f7b9a53-9eb4-4332-9e39-05bba283aa4b` |
| 56 | `GET /v1/accounts/me` | 200 | 15 | `qa-dcc02e6c-6dca-4bff-9ed8-f10c856035bb` |
| 57 | `GET /v1/accounts/me` | 200 | 8 | `qa-5b63d47d-d2c6-476a-89d0-a34260e86370` |
| 58 | `GET /v1/accounts/me` | 200 | 15 | `qa-d9fbe9c4-268a-474a-a355-5624c7541ab7` |
| 59 | `GET /v1/accounts/me` | 200 | 12 | `qa-86b1a775-5884-4373-ba5a-7b8d1267962c` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-d6484917-42bf-4e0c-99ec-ab46eca195a8` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-c5d21e44-7fbf-439a-be83-8f3f805d2424` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-67bc2e43-f4ac-4a55-b0e0-2b2aec130a11` |
| 63 | `GET /v1/accounts/me` | 200 | 8 | `qa-67eeb0c0-6d90-40ec-819e-9529bb2fb43a` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-9edfd523-61d2-4c1e-a6c8-11fcadae7508` |
| 65 | `POST /v1/auth/token` | 429 | 4 | `qa-760ebe6e-af59-471d-90e8-46256470c1d6` |
| 66 | `POST /v1/accounts` | 429 | 3 | `qa-c96b88b0-a709-44bd-b9be-62b9fa53b325` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-150606e8-dd32-4fe1-9196-28187f826fa4` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-cd6aef6b-088c-4aac-b180-fafa80a2892a` |
| 69 | `DELETE /v1/accounts/me` | 429 | 5 | `qa-28070c8b-1c41-46e3-a505-80a07ecc542e` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 3 | `qa-b85c9264-4dc2-46a7-8bc8-7cce921877dc` |
| 71 | `POST /v1/conversations` | 429 | 2 | `qa-1b04a99c-f3e6-4704-ac6e-6491e11d6521` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-44b25f99-3c4d-41bf-a6b0-eb271e7c0faa` |
| 73 | `GET /v1/conversations/{id}` | 429 | 2 | `qa-5127fdc6-bf89-488c-ac12-bada82952bfe` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 3 | `qa-6daaf0c1-8c72-452f-9240-d69f56119d18` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-e1025a87-f0e3-4423-b11d-469696f9a960` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-08c23dea-4be2-40f6-aadd-95b49e0c3eb5` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-1f6385c7-6d0f-4de0-9399-e0c79caa9b90` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-c37ae65f-a098-413a-a992-f56965d1c6f6` |
| 79 | `GET /v1/credits/ledger` | 429 | 2 | `qa-5d099ce2-2feb-47a3-be1b-7903d3a5af17` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-bdaafc91-1179-4674-b887-85b576452b63` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-fa3686ad-5abe-410a-81df-16223a5494ab` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-8a6efea1-3d7d-4c0e-8684-a3de7141e474` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-c76b4d18-120e-4eaa-9b63-b5fe7e43885b` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-131a7f47-a165-48a4-9d73-5aa688b11c69` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-eec6bee1-3e7e-4ccb-a4c9-3208e47822ef` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-1184decc-856d-41bb-8031-3b56a849cc82` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-ce95fcb3-f1d9-44f1-9cea-8983d4618565` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-3df9f7d9-d9da-4e20-9747-2268609708ac` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-49264603-8104-4ac4-abd7-8d51d6c6a505` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-14b54802-17d7-454b-a61c-bd63545fd69a` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-ea3e52a4-05a5-439e-a5f3-4dda60eef320` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-c665e836-6265-4ffb-bee3-5e7865affcf5` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-5f1aeccf-f666-4d40-83b1-4dc1b9f56145` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-c4399e33-225a-427b-8104-40929325ae33` |
| 95 | `GET /v1/accounts/me` | 429 | 5 | `qa-70ce44ea-f15f-45d7-8b23-04fcb0f9dd19` |
| 96 | `GET /v1/accounts/me` | 429 | 6 | `qa-c3aa405a-1b1a-4548-8a95-aceeb0d891f3` |
| 97 | `GET /v1/accounts/me` | 429 | 4 | `qa-7f7c3b76-d27f-42d2-b674-69e4cb38864d` |
| 98 | `GET /v1/accounts/me` | 200 | 5 | `qa-36b0ec06-37a8-471a-882f-f8bf20ff24cf` |
| 99 | `POST /v1/auth/token` | 200 | 6 | `qa-cca57f56-a9d4-4902-9584-def8ca0ec5d8` |
| 100 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7ec93dbd-30b9-4f8f-8850-d87d732b6444` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-95a55ebf-81e4-472d-930f-36293b74e1ab` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-6ce53377-ef42-410d-818f-01d82c064123` |
| 103 | `POST /v1/auth/token` | 401 | 4 | `qa-22494152-cf5b-489f-ac9c-d81ebdff6b15` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-041abdbe-8af1-485d-8005-b8ecba29c321

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-041abdbe-8af1-485d-8005-b8ecba29c321
Content-Type: application/json

--- request body ---
{"handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-041abdbe-8af1-485d-8005-b8ecba29c321
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Location: /v1/accounts/qa-557851ad8cf9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eb127348-51cd-49a1-a789-6b07d5edc8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb127348-51cd-49a1-a789-6b07d5edc8fb
Content-Type: application/json

--- request body ---
{"handle":"qa-a98eebe3f87a","displayName":"QA a98eebe3f87a","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb127348-51cd-49a1-a789-6b07d5edc8fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Location: /v1/accounts/qa-a98eebe3f87a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7567a67-29ce-492e-b1ec-85e5f0f3aa1a","handle":"qa-a98eebe3f87a","displayName":"QA a98eebe3f87a","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.375015384Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97840c3b-46e7-46a6-8ab0-6a49fdb34524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97840c3b-46e7-46a6-8ab0-6a49fdb34524
Content-Type: application/json

--- request body ---
{"handle":"qa-557851ad8cf9","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-97840c3b-46e7-46a6-8ab0-6a49fdb34524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c3ea44cd-dce8-45ac-bb36-bc9929acce95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3ea44cd-dce8-45ac-bb36-bc9929acce95
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a98eebe3f87a","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3ea44cd-dce8-45ac-bb36-bc9929acce95
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
Location: /v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d","subject":"Error contract","status":"open","region":"eu","participants":["qa-557851ad8cf9","qa-a98eebe3f87a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.440716264Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a2e70c7-8f0f-435e-a746-b2e80a1a237f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a2e70c7-8f0f-435e-a746-b2e80a1a237f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a2e70c7-8f0f-435e-a746-b2e80a1a237f
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ee2e838-fe3c-4f7c-a59a-e3c18679d901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ee2e838-fe3c-4f7c-a59a-e3c18679d901
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee2e838-fe3c-4f7c-a59a-e3c18679d901
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b6ac6e3-25f6-4f3a-a0fb-9218f4637010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b6ac6e3-25f6-4f3a-a0fb-9218f4637010
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b6ac6e3-25f6-4f3a-a0fb-9218f4637010
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3496e9d-a514-4101-99c4-b0d185129e54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3496e9d-a514-4101-99c4-b0d185129e54
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3496e9d-a514-4101-99c4-b0d185129e54
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f9fe170-af40-4b00-94f2-b85441ad62ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f9fe170-af40-4b00-94f2-b85441ad62ce
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f9fe170-af40-4b00-94f2-b85441ad62ce
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-312211bc-da2b-4218-83eb-6d989d2a164a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-312211bc-da2b-4218-83eb-6d989d2a164a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-312211bc-da2b-4218-83eb-6d989d2a164a
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c7a674b-147f-4429-867a-07616e4a48e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c7a674b-147f-4429-867a-07616e4a48e0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c7a674b-147f-4429-867a-07616e4a48e0
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-03c02995-2afa-47e9-94ff-d3008680d8fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03c02995-2afa-47e9-94ff-d3008680d8fd
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-03c02995-2afa-47e9-94ff-d3008680d8fd
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bd670cc-ac9d-461d-9818-a57bea2eea3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd670cc-ac9d-461d-9818-a57bea2eea3e
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bd670cc-ac9d-461d-9818-a57bea2eea3e
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-01bbd7c5-f07c-4171-98f6-c44fc63fabe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01bbd7c5-f07c-4171-98f6-c44fc63fabe3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-01bbd7c5-f07c-4171-98f6-c44fc63fabe3
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c91e09e-eec0-4cae-845b-a2ccaf9433a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c91e09e-eec0-4cae-845b-a2ccaf9433a5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c91e09e-eec0-4cae-845b-a2ccaf9433a5
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae6e93b4-2f0f-42ec-bc44-e27c7bcf0a56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6e93b4-2f0f-42ec-bc44-e27c7bcf0a56
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae6e93b4-2f0f-42ec-bc44-e27c7bcf0a56
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cc21b0f-bb20-4887-98ef-14fc6c0a82b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc21b0f-bb20-4887-98ef-14fc6c0a82b3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc21b0f-bb20-4887-98ef-14fc6c0a82b3
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-63136015-ac76-4841-9f36-453831dcc59d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63136015-ac76-4841-9f36-453831dcc59d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-63136015-ac76-4841-9f36-453831dcc59d
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc606e88-f094-40a8-aa13-39d32792986e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc606e88-f094-40a8-aa13-39d32792986e
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc606e88-f094-40a8-aa13-39d32792986e
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6e01886-0be0-4b77-a387-0772800f1e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6e01886-0be0-4b77-a387-0772800f1e4f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6e01886-0be0-4b77-a387-0772800f1e4f
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cf1a92e-11ef-4bce-9636-1c6619914bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cf1a92e-11ef-4bce-9636-1c6619914bb7
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cf1a92e-11ef-4bce-9636-1c6619914bb7
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c048d08-dbff-4cc0-81af-0b4e024ee3d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c048d08-dbff-4cc0-81af-0b4e024ee3d7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c048d08-dbff-4cc0-81af-0b4e024ee3d7
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bac8c42-66e5-4fd3-86fa-c869293e6800

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bac8c42-66e5-4fd3-86fa-c869293e6800
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bac8c42-66e5-4fd3-86fa-c869293e6800
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd4425e1-4bf1-42b1-825c-264a94b1498d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd4425e1-4bf1-42b1-825c-264a94b1498d
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd4425e1-4bf1-42b1-825c-264a94b1498d
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-73a9955f-f2fc-450a-8f61-c34a14d4e462

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73a9955f-f2fc-450a-8f61-c34a14d4e462
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-73a9955f-f2fc-450a-8f61-c34a14d4e462
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-428e81ff-29d1-416a-b0ec-904bd83e4c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-428e81ff-29d1-416a-b0ec-904bd83e4c6c
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-428e81ff-29d1-416a-b0ec-904bd83e4c6c
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-74c90f1b-4a84-4c56-a1fc-be8b48352d26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74c90f1b-4a84-4c56-a1fc-be8b48352d26
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-74c90f1b-4a84-4c56-a1fc-be8b48352d26
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac12c33c-7c28-4fe0-a800-27023253b97b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac12c33c-7c28-4fe0-a800-27023253b97b
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac12c33c-7c28-4fe0-a800-27023253b97b
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-dbebadf0-0561-4492-9454-c2b992ef0ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbebadf0-0561-4492-9454-c2b992ef0ff9
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbebadf0-0561-4492-9454-c2b992ef0ff9
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa91c681-cae4-4b68-bb07-46de7c61b974

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa91c681-cae4-4b68-bb07-46de7c61b974
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa91c681-cae4-4b68-bb07-46de7c61b974
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-3377de1c-74a8-4407-9b80-851c4859c4d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3377de1c-74a8-4407-9b80-851c4859c4d3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-3377de1c-74a8-4407-9b80-851c4859c4d3
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba51b1d0-4c67-4406-b91a-c7a0acf9d461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba51b1d0-4c67-4406-b91a-c7a0acf9d461
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba51b1d0-4c67-4406-b91a-c7a0acf9d461
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-98a78388-38e8-44fd-868a-cb2f25b7a7fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a78388-38e8-44fd-868a-cb2f25b7a7fa
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-98a78388-38e8-44fd-868a-cb2f25b7a7fa
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e7a7335-0eb2-4705-bf0a-0695dc5d7575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e7a7335-0eb2-4705-bf0a-0695dc5d7575
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e7a7335-0eb2-4705-bf0a-0695dc5d7575
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-277bc209-4445-4b54-959b-3cd168b7f58a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-277bc209-4445-4b54-959b-3cd168b7f58a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-277bc209-4445-4b54-959b-3cd168b7f58a
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fba8729-0f5c-4675-9c27-f0f09a1b4038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fba8729-0f5c-4675-9c27-f0f09a1b4038
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fba8729-0f5c-4675-9c27-f0f09a1b4038
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb82bfdf-cb50-4e2d-8391-fe69ad3ebd69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb82bfdf-cb50-4e2d-8391-fe69ad3ebd69
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb82bfdf-cb50-4e2d-8391-fe69ad3ebd69
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-15aec320-9c38-4082-95fc-43ee9cf5c417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15aec320-9c38-4082-95fc-43ee9cf5c417
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-15aec320-9c38-4082-95fc-43ee9cf5c417
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-23b9a33a-828e-4bd7-bf32-7926497e5f1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23b9a33a-828e-4bd7-bf32-7926497e5f1c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-23b9a33a-828e-4bd7-bf32-7926497e5f1c
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-80216239-83ec-43f3-a2bb-0656b947e5f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80216239-83ec-43f3-a2bb-0656b947e5f5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-80216239-83ec-43f3-a2bb-0656b947e5f5
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-81fd7d5a-f49a-4da2-8e69-f98c02f50e13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81fd7d5a-f49a-4da2-8e69-f98c02f50e13
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-81fd7d5a-f49a-4da2-8e69-f98c02f50e13
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b8a04a6-9cc9-476d-8fb2-2fa6143a6223

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b8a04a6-9cc9-476d-8fb2-2fa6143a6223
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b8a04a6-9cc9-476d-8fb2-2fa6143a6223
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-a36be383-3471-41d2-8136-5d8e190e142a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36be383-3471-41d2-8136-5d8e190e142a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a36be383-3471-41d2-8136-5d8e190e142a
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-329f6e3c-d107-4b7b-89bf-779f125e0407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-329f6e3c-d107-4b7b-89bf-779f125e0407
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-329f6e3c-d107-4b7b-89bf-779f125e0407
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-e92f27d7-284c-4d21-aeae-8ccebe5044c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e92f27d7-284c-4d21-aeae-8ccebe5044c3
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e92f27d7-284c-4d21-aeae-8ccebe5044c3
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-98a64334-75e0-49b7-9009-8faa2052db9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a64334-75e0-49b7-9009-8faa2052db9a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-98a64334-75e0-49b7-9009-8faa2052db9a
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-38f36823-d063-4e43-8561-59ca675bbd18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38f36823-d063-4e43-8561-59ca675bbd18
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-38f36823-d063-4e43-8561-59ca675bbd18
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3045642-e9d1-465f-9ce3-32b631f66600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3045642-e9d1-465f-9ce3-32b631f66600
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3045642-e9d1-465f-9ce3-32b631f66600
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-1874e640-3e95-4c3c-aea7-786f5214a168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1874e640-3e95-4c3c-aea7-786f5214a168
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1874e640-3e95-4c3c-aea7-786f5214a168
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7ddcf96-61b8-4f14-be5e-5683f5a96a5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7ddcf96-61b8-4f14-be5e-5683f5a96a5f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7ddcf96-61b8-4f14-be5e-5683f5a96a5f
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd465277-2a39-4a60-ab21-cb43c45eaf0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd465277-2a39-4a60-ab21-cb43c45eaf0f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd465277-2a39-4a60-ab21-cb43c45eaf0f
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-db4720f7-247c-468d-818b-059f807fc49b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db4720f7-247c-468d-818b-059f807fc49b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-db4720f7-247c-468d-818b-059f807fc49b
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-7be292f9-8281-4532-b21d-7827d05bcd88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7be292f9-8281-4532-b21d-7827d05bcd88
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-7be292f9-8281-4532-b21d-7827d05bcd88
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-912f3ff0-c8f1-43db-83d4-4e60d58128be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-912f3ff0-c8f1-43db-83d4-4e60d58128be
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-912f3ff0-c8f1-43db-83d4-4e60d58128be
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f7b9a53-9eb4-4332-9e39-05bba283aa4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f7b9a53-9eb4-4332-9e39-05bba283aa4b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f7b9a53-9eb4-4332-9e39-05bba283aa4b
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcc02e6c-6dca-4bff-9ed8-f10c856035bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcc02e6c-6dca-4bff-9ed8-f10c856035bb
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcc02e6c-6dca-4bff-9ed8-f10c856035bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b63d47d-d2c6-476a-89d0-a34260e86370

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b63d47d-d2c6-476a-89d0-a34260e86370
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b63d47d-d2c6-476a-89d0-a34260e86370
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9fbe9c4-268a-474a-a355-5624c7541ab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9fbe9c4-268a-474a-a355-5624c7541ab7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9fbe9c4-268a-474a-a355-5624c7541ab7
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-86b1a775-5884-4373-ba5a-7b8d1267962c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b1a775-5884-4373-ba5a-7b8d1267962c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-86b1a775-5884-4373-ba5a-7b8d1267962c
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6484917-42bf-4e0c-99ec-ab46eca195a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6484917-42bf-4e0c-99ec-ab46eca195a8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6484917-42bf-4e0c-99ec-ab46eca195a8
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5d21e44-7fbf-439a-be83-8f3f805d2424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5d21e44-7fbf-439a-be83-8f3f805d2424
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5d21e44-7fbf-439a-be83-8f3f805d2424
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-67bc2e43-f4ac-4a55-b0e0-2b2aec130a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67bc2e43-f4ac-4a55-b0e0-2b2aec130a11
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-67bc2e43-f4ac-4a55-b0e0-2b2aec130a11
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-67eeb0c0-6d90-40ec-819e-9529bb2fb43a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67eeb0c0-6d90-40ec-819e-9529bb2fb43a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-67eeb0c0-6d90-40ec-819e-9529bb2fb43a
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-9edfd523-61d2-4c1e-a6c8-11fcadae7508

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9edfd523-61d2-4c1e-a6c8-11fcadae7508
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9edfd523-61d2-4c1e-a6c8-11fcadae7508
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9edfd523-61d2-4c1e-a6c8-11fcadae7508"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-760ebe6e-af59-471d-90e8-46256470c1d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-760ebe6e-af59-471d-90e8-46256470c1d6
Content-Type: application/json

--- request body ---
{"handle":"qa-557851ad8cf9","password":"****"}

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-760ebe6e-af59-471d-90e8-46256470c1d6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-760ebe6e-af59-471d-90e8-46256470c1d6"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-c96b88b0-a709-44bd-b9be-62b9fa53b325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c96b88b0-a709-44bd-b9be-62b9fa53b325
Content-Type: application/json

--- request body ---
{"handle":"qa-4165e6c2efad","displayName":"QA 4165e6c2efad","password":"****","region":"eu"}

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c96b88b0-a709-44bd-b9be-62b9fa53b325
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-c96b88b0-a709-44bd-b9be-62b9fa53b325"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-150606e8-dd32-4fe1-9196-28187f826fa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-150606e8-dd32-4fe1-9196-28187f826fa4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-150606e8-dd32-4fe1-9196-28187f826fa4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-150606e8-dd32-4fe1-9196-28187f826fa4"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cd6aef6b-088c-4aac-b180-fafa80a2892a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd6aef6b-088c-4aac-b180-fafa80a2892a
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd6aef6b-088c-4aac-b180-fafa80a2892a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cd6aef6b-088c-4aac-b180-fafa80a2892a"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28070c8b-1c41-46e3-a505-80a07ecc542e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28070c8b-1c41-46e3-a505-80a07ecc542e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28070c8b-1c41-46e3-a505-80a07ecc542e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-28070c8b-1c41-46e3-a505-80a07ecc542e"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-557851ad8cf9
correlation: qa-b85c9264-4dc2-46a7-8bc8-7cce921877dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b85c9264-4dc2-46a7-8bc8-7cce921877dc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b85c9264-4dc2-46a7-8bc8-7cce921877dc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-557851ad8cf9","correlationId":"qa-b85c9264-4dc2-46a7-8bc8-7cce921877dc"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-1b04a99c-f3e6-4704-ac6e-6491e11d6521

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b04a99c-f3e6-4704-ac6e-6491e11d6521
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-557851ad8cf9","subject":"Probe","message":"Hi"}

--- response: 429 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b04a99c-f3e6-4704-ac6e-6491e11d6521
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-1b04a99c-f3e6-4704-ac6e-6491e11d6521"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-44b25f99-3c4d-41bf-a6b0-eb271e7c0faa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44b25f99-3c4d-41bf-a6b0-eb271e7c0faa
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44b25f99-3c4d-41bf-a6b0-eb271e7c0faa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-44b25f99-3c4d-41bf-a6b0-eb271e7c0faa"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d
correlation: qa-5127fdc6-bf89-488c-ac12-bada82952bfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5127fdc6-bf89-488c-ac12-bada82952bfe
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5127fdc6-bf89-488c-ac12-bada82952bfe
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d","correlationId":"qa-5127fdc6-bf89-488c-ac12-bada82952bfe"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/messages
correlation: qa-6daaf0c1-8c72-452f-9240-d69f56119d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6daaf0c1-8c72-452f-9240-d69f56119d18
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6daaf0c1-8c72-452f-9240-d69f56119d18
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/messages","correlationId":"qa-6daaf0c1-8c72-452f-9240-d69f56119d18"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/messages
correlation: qa-e1025a87-f0e3-4423-b11d-469696f9a960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1025a87-f0e3-4423-b11d-469696f9a960
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1025a87-f0e3-4423-b11d-469696f9a960
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/messages","correlationId":"qa-e1025a87-f0e3-4423-b11d-469696f9a960"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/read
correlation: qa-08c23dea-4be2-40f6-aadd-95b49e0c3eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08c23dea-4be2-40f6-aadd-95b49e0c3eb5
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08c23dea-4be2-40f6-aadd-95b49e0c3eb5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/read","correlationId":"qa-08c23dea-4be2-40f6-aadd-95b49e0c3eb5"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/close
correlation: qa-1f6385c7-6d0f-4de0-9399-e0c79caa9b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f6385c7-6d0f-4de0-9399-e0c79caa9b90
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f6385c7-6d0f-4de0-9399-e0c79caa9b90
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_3bf0fac4-a607-4260-9276-ff5dbb1e605d/close","correlationId":"qa-1f6385c7-6d0f-4de0-9399-e0c79caa9b90"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-c37ae65f-a098-413a-a992-f56965d1c6f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c37ae65f-a098-413a-a992-f56965d1c6f6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c37ae65f-a098-413a-a992-f56965d1c6f6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-c37ae65f-a098-413a-a992-f56965d1c6f6"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5d099ce2-2feb-47a3-be1b-7903d3a5af17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d099ce2-2feb-47a3-be1b-7903d3a5af17
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5d099ce2-2feb-47a3-be1b-7903d3a5af17
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-5d099ce2-2feb-47a3-be1b-7903d3a5af17"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bdaafc91-1179-4674-b887-85b576452b63

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0427511972604fd7a75309d634e0785f
X-Correlation-Id: qa-bdaafc91-1179-4674-b887-85b576452b63
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bdaafc91-1179-4674-b887-85b576452b63
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-bdaafc91-1179-4674-b887-85b576452b63"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-fa3686ad-5abe-410a-81df-16223a5494ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa3686ad-5abe-410a-81df-16223a5494ab
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa3686ad-5abe-410a-81df-16223a5494ab
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-fa3686ad-5abe-410a-81df-16223a5494ab"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a6efea1-3d7d-4c0e-8684-a3de7141e474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a6efea1-3d7d-4c0e-8684-a3de7141e474
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a6efea1-3d7d-4c0e-8684-a3de7141e474
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8a6efea1-3d7d-4c0e-8684-a3de7141e474"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-c76b4d18-120e-4eaa-9b63-b5fe7e43885b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c76b4d18-120e-4eaa-9b63-b5fe7e43885b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c76b4d18-120e-4eaa-9b63-b5fe7e43885b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c76b4d18-120e-4eaa-9b63-b5fe7e43885b"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-131a7f47-a165-48a4-9d73-5aa688b11c69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-131a7f47-a165-48a4-9d73-5aa688b11c69
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-131a7f47-a165-48a4-9d73-5aa688b11c69
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-131a7f47-a165-48a4-9d73-5aa688b11c69"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-eec6bee1-3e7e-4ccb-a4c9-3208e47822ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eec6bee1-3e7e-4ccb-a4c9-3208e47822ef
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eec6bee1-3e7e-4ccb-a4c9-3208e47822ef
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eec6bee1-3e7e-4ccb-a4c9-3208e47822ef"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-1184decc-856d-41bb-8031-3b56a849cc82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1184decc-856d-41bb-8031-3b56a849cc82
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1184decc-856d-41bb-8031-3b56a849cc82
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1184decc-856d-41bb-8031-3b56a849cc82"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce95fcb3-f1d9-44f1-9cea-8983d4618565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce95fcb3-f1d9-44f1-9cea-8983d4618565
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce95fcb3-f1d9-44f1-9cea-8983d4618565
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ce95fcb3-f1d9-44f1-9cea-8983d4618565"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-3df9f7d9-d9da-4e20-9747-2268609708ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df9f7d9-d9da-4e20-9747-2268609708ac
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3df9f7d9-d9da-4e20-9747-2268609708ac
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3df9f7d9-d9da-4e20-9747-2268609708ac"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-49264603-8104-4ac4-abd7-8d51d6c6a505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49264603-8104-4ac4-abd7-8d51d6c6a505
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49264603-8104-4ac4-abd7-8d51d6c6a505
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-49264603-8104-4ac4-abd7-8d51d6c6a505"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-14b54802-17d7-454b-a61c-bd63545fd69a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14b54802-17d7-454b-a61c-bd63545fd69a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14b54802-17d7-454b-a61c-bd63545fd69a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-14b54802-17d7-454b-a61c-bd63545fd69a"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea3e52a4-05a5-439e-a5f3-4dda60eef320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea3e52a4-05a5-439e-a5f3-4dda60eef320
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea3e52a4-05a5-439e-a5f3-4dda60eef320
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ea3e52a4-05a5-439e-a5f3-4dda60eef320"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-c665e836-6265-4ffb-bee3-5e7865affcf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c665e836-6265-4ffb-bee3-5e7865affcf5
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c665e836-6265-4ffb-bee3-5e7865affcf5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c665e836-6265-4ffb-bee3-5e7865affcf5"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f1aeccf-f666-4d40-83b1-4dc1b9f56145

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f1aeccf-f666-4d40-83b1-4dc1b9f56145
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f1aeccf-f666-4d40-83b1-4dc1b9f56145
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5f1aeccf-f666-4d40-83b1-4dc1b9f56145"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4399e33-225a-427b-8104-40929325ae33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4399e33-225a-427b-8104-40929325ae33
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4399e33-225a-427b-8104-40929325ae33
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c4399e33-225a-427b-8104-40929325ae33"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-70ce44ea-f15f-45d7-8b23-04fcb0f9dd19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ce44ea-f15f-45d7-8b23-04fcb0f9dd19
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70ce44ea-f15f-45d7-8b23-04fcb0f9dd19
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-70ce44ea-f15f-45d7-8b23-04fcb0f9dd19"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3aa405a-1b1a-4548-8a95-aceeb0d891f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3aa405a-1b1a-4548-8a95-aceeb0d891f3
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3aa405a-1b1a-4548-8a95-aceeb0d891f3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c3aa405a-1b1a-4548-8a95-aceeb0d891f3"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f7c3b76-d27f-42d2-b674-69e4cb38864d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f7c3b76-d27f-42d2-b674-69e4cb38864d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f7c3b76-d27f-42d2-b674-69e4cb38864d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7f7c3b76-d27f-42d2-b674-69e4cb38864d"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-36b0ec06-37a8-471a-882f-f8bf20ff24cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36b0ec06-37a8-471a-882f-f8bf20ff24cf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-36b0ec06-37a8-471a-882f-f8bf20ff24cf
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

{"id":"acc_ded12871-dcc6-44b5-b0a1-e71e54772f4e","handle":"qa-557851ad8cf9","displayName":"QA 557851ad8cf9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.326895700Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-cca57f56-a9d4-4902-9584-def8ca0ec5d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca57f56-a9d4-4902-9584-def8ca0ec5d8
Content-Type: application/json

--- request body ---
{"handle":"qa-a98eebe3f87a","password":"****"}

--- response: 200 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-cca57f56-a9d4-4902-9584-def8ca0ec5d8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7567a67-29ce-492e-b1ec-85e5f0f3aa1a"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ec93dbd-30b9-4f8f-8850-d87d732b6444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ec93dbd-30b9-4f8f-8850-d87d732b6444
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ec93dbd-30b9-4f8f-8850-d87d732b6444
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
correlation: qa-95a55ebf-81e4-472d-930f-36293b74e1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95a55ebf-81e4-472d-930f-36293b74e1ab
Content-Type: application/json

--- request body ---
{"handle":"qa-a98eebe3f87a","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95a55ebf-81e4-472d-930f-36293b74e1ab
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95a55ebf-81e4-472d-930f-36293b74e1ab"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ce53377-ef42-410d-818f-01d82c064123

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce53377-ef42-410d-818f-01d82c064123
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ce53377-ef42-410d-818f-01d82c064123
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
correlation: qa-22494152-cf5b-489f-ac9c-d81ebdff6b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22494152-cf5b-489f-ac9c-d81ebdff6b15
Content-Type: application/json

--- request body ---
{"handle":"qa-557851ad8cf9","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 12 Nov 2026 09:56:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22494152-cf5b-489f-ac9c-d81ebdff6b15
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22494152-cf5b-489f-ac9c-d81ebdff6b15"}
```
