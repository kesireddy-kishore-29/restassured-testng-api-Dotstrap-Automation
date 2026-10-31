# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 101 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-ea63ab90-d103-4648-ac25-4c39cf5047ec` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-c66e399c-7e1b-48e6-83e1-272d89b9a3be` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-140260cd-2f79-4d5b-b9ac-844233cb97a0` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-6944c1de-8d64-462b-9993-4da8fc177169` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-02307351-5d5f-40ec-8b99-8a9a5e3c34bc` |
| 6 | `GET /v1/accounts/me` | 200 | 27 | `qa-e0b2b6df-0ea1-4869-9ff8-c711e70f6ded` |
| 7 | `GET /v1/accounts/me` | 200 | 17 | `qa-40d55aa5-a55e-45e5-a60c-ca67365f2402` |
| 8 | `GET /v1/accounts/me` | 200 | 11 | `qa-722d0106-98ab-4621-a8ea-14c44a65ad80` |
| 9 | `GET /v1/accounts/me` | 200 | 19 | `qa-c117e7ab-207f-4231-81bb-468a0710596f` |
| 10 | `GET /v1/accounts/me` | 200 | 17 | `qa-d9683634-fbab-4644-8560-5028d1730ae5` |
| 11 | `GET /v1/accounts/me` | 200 | 36 | `qa-e48eb02d-e442-489f-95f3-edf5a85f664c` |
| 12 | `GET /v1/accounts/me` | 200 | 20 | `qa-27c5a042-0a7e-45cb-8c52-cdcf9411ffc1` |
| 13 | `GET /v1/accounts/me` | 200 | 33 | `qa-57d56190-11bf-435d-9be0-739a868888fa` |
| 14 | `GET /v1/accounts/me` | 200 | 29 | `qa-0b3b93aa-043d-4b11-abb2-254ffdd51ecf` |
| 15 | `GET /v1/accounts/me` | 200 | 21 | `qa-5f68d0c8-1eb9-4fce-8a88-cbe49d6adce6` |
| 16 | `GET /v1/accounts/me` | 200 | 39 | `qa-ee3b539f-8f70-4733-8718-0e799821a1c2` |
| 17 | `GET /v1/accounts/me` | 200 | 36 | `qa-dcbb8dcb-b975-4c27-9d18-94ae3b37c428` |
| 18 | `GET /v1/accounts/me` | 200 | 22 | `qa-c73b260b-d40c-4873-8beb-682b66d6abe4` |
| 19 | `GET /v1/accounts/me` | 200 | 18 | `qa-810475a9-4d65-4519-8ff7-32cd2c80996f` |
| 20 | `GET /v1/accounts/me` | 200 | 22 | `qa-6abfd1b6-abcf-4bb8-9c0d-5043335b8ea9` |
| 21 | `GET /v1/accounts/me` | 200 | 18 | `qa-c67a4103-2029-4bae-938f-7c8fd05eea7b` |
| 22 | `GET /v1/accounts/me` | 200 | 42 | `qa-43f7a1cb-e746-42da-9fe7-54d71015b598` |
| 23 | `GET /v1/accounts/me` | 200 | 34 | `qa-24a73b2b-00a6-49fd-95d6-67dbfee0eed3` |
| 24 | `GET /v1/accounts/me` | 200 | 18 | `qa-16f6e0f7-ca0e-4113-bf6b-5acc6208aa7c` |
| 25 | `GET /v1/accounts/me` | 200 | 35 | `qa-e4cb6253-7791-4614-b1c3-f86db72e91a8` |
| 26 | `GET /v1/accounts/me` | 200 | 18 | `qa-a061482d-6858-452b-878a-51d0af0a08e9` |
| 27 | `GET /v1/accounts/me` | 200 | 18 | `qa-c32864ae-1113-46c3-8c8e-249e10c16c9b` |
| 28 | `GET /v1/accounts/me` | 200 | 17 | `qa-e59a2a8a-f8fb-4df7-ac6a-2a3c8019b24a` |
| 29 | `GET /v1/accounts/me` | 200 | 25 | `qa-c44f480a-422f-4542-9bf8-4db1effe5904` |
| 30 | `GET /v1/accounts/me` | 200 | 14 | `qa-6e5201b1-25e6-4dbc-8ca1-3661d4eb6442` |
| 31 | `GET /v1/accounts/me` | 200 | 13 | `qa-05757751-eb50-4f84-a8d0-16eaff2cc6e0` |
| 32 | `GET /v1/accounts/me` | 200 | 14 | `qa-10ad3aac-6544-41ba-ae61-d4cd7613e96b` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-4e24373a-0be6-435c-ac39-3e1a5b1231a5` |
| 34 | `GET /v1/accounts/me` | 200 | 14 | `qa-d0a796bf-bf11-432a-b37c-340424d03e6d` |
| 35 | `GET /v1/accounts/me` | 200 | 23 | `qa-e78d2a0d-c8a3-434c-93bc-222a9d13a824` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-dc69a9ca-c3c1-4084-b9c0-63761cc11a51` |
| 37 | `GET /v1/accounts/me` | 200 | 13 | `qa-aef56765-2026-4b90-8265-3ac3e5738d0b` |
| 38 | `GET /v1/accounts/me` | 200 | 20 | `qa-98ad2bdd-ac7c-488a-b8f5-494dc479a1b5` |
| 39 | `GET /v1/accounts/me` | 200 | 28 | `qa-e06fccd8-0ef3-4acd-88a1-dd294287a130` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-ec7f15fe-5e8f-4a68-9434-5d8f18a362d5` |
| 41 | `GET /v1/accounts/me` | 200 | 15 | `qa-bb4836fb-1253-41a9-8572-a99fe7370aaa` |
| 42 | `GET /v1/accounts/me` | 200 | 19 | `qa-b20e27a2-e7e8-470f-96ee-4ab97980faae` |
| 43 | `GET /v1/accounts/me` | 200 | 16 | `qa-8b7b8da9-dd7b-470d-8b8d-a34f7769ad76` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-b2bf4747-025b-46d0-a8f5-d5f0f167cda7` |
| 45 | `GET /v1/accounts/me` | 200 | 15 | `qa-f9318efb-cec3-4321-862c-df76497ae599` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-34ad5eee-d320-49c2-ae5f-b5f806057697` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-270dec15-1150-4fc7-94d8-6df876a0aefc` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-544a61f9-2679-49c6-b5a3-9ffe1636a480` |
| 49 | `GET /v1/accounts/me` | 200 | 10 | `qa-e8fa477e-805a-4ef2-b31f-eee6b3712a31` |
| 50 | `GET /v1/accounts/me` | 200 | 10 | `qa-31e1b891-c671-4664-962c-c6a85890e5ff` |
| 51 | `GET /v1/accounts/me` | 200 | 13 | `qa-7302607b-9c69-4e90-8b99-c63069bc37fc` |
| 52 | `GET /v1/accounts/me` | 200 | 14 | `qa-1517a62f-54f7-451c-ae49-6e5791b2aeee` |
| 53 | `GET /v1/accounts/me` | 200 | 16 | `qa-78bc2436-fea2-4714-b810-f4d0bfc619ab` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-10799e2d-c784-4981-8a47-28fe10d9f1ab` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-2b4dfb0e-c564-44c6-a2a0-2bf34fc0616a` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-19c11756-620a-4cd5-b45f-363c5a2925b2` |
| 57 | `GET /v1/accounts/me` | 200 | 13 | `qa-b1af9487-d135-44f1-91a9-257209dae14c` |
| 58 | `GET /v1/accounts/me` | 200 | 16 | `qa-b6fbaee7-a8b7-4cfb-9b40-ddba1b948cfd` |
| 59 | `GET /v1/accounts/me` | 200 | 13 | `qa-b5b501b6-0e92-4f64-ade0-09450362b3b4` |
| 60 | `GET /v1/accounts/me` | 200 | 26 | `qa-8947228c-8021-4cad-a996-42ed0384ad97` |
| 61 | `GET /v1/accounts/me` | 200 | 11 | `qa-3f8dc97a-369d-4245-88b8-67baedb6504a` |
| 62 | `GET /v1/accounts/me` | 200 | 13 | `qa-2cefd32b-ae58-4d2a-b6bb-3ce4cdcf719f` |
| 63 | `GET /v1/accounts/me` | 200 | 13 | `qa-6ce65ada-2ffe-4991-830b-9026e3a9ca02` |
| 64 | `GET /v1/accounts/me` | 429 | 12 | `qa-dc6f2509-c9e9-47cb-82a3-d45cf9543f1f` |
| 65 | `POST /v1/auth/token` | 429 | 10 | `qa-7547daf0-a9d7-4578-a2f5-8e026089ed57` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-b184bd97-7b67-43c1-94b9-e4271b765185` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-be8df082-f297-4141-968b-82cdbc6516e0` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-ea55e040-2d3c-4263-935a-313416feb5a0` |
| 69 | `DELETE /v1/accounts/me` | 429 | 8 | `qa-50a570af-b867-46b9-8948-f76cede7b97e` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-77cb0b46-bc14-4f8a-90e1-ad786e943799` |
| 71 | `POST /v1/conversations` | 429 | 6 | `qa-fcddf877-4b10-4560-80bb-abf3f4e18878` |
| 72 | `GET /v1/conversations` | 429 | 7 | `qa-ff153918-8b14-4032-92fe-278d474a5c2e` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-c5786e4b-bb8c-4f95-a9ba-4b1e0c83bf14` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 5 | `qa-5f0a670a-93b2-4007-b402-3b0f8fc8ea8d` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-7aeec190-7a8e-4113-ac9a-be402f79a7f9` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 8 | `qa-48f92a9f-ed50-4b6a-a621-c5100a220cd9` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-df953ad8-d750-4078-86b6-2565c1879f1c` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-39083525-39de-4de5-a523-e4f58d813902` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-42a7d0fc-8208-40c7-88b3-c5307ba8cc80` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-b647c449-dd0e-43f8-9ecd-57dd80597eda` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-8a3eced7-a672-4188-a3c0-ca4585007b37` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-86c9dcdb-788a-40fa-8778-39ce4a853129` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-c9bc8910-8cd2-4cfb-b903-779f042fb692` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-60612417-4c24-4bc9-a3e3-5f5672da8827` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-38a02cbe-f2a2-45d3-bbb3-07e599444d7c` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-bea3b61b-2d63-41c0-9927-04570474b20a` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-c60ef5bc-6f7c-4a6f-9316-9ced07494e29` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-cd3b4d2a-6aaa-4ad9-bdb5-21de615b3a6a` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-a3ade4fc-b677-48fa-8fa1-54b7f9e4e9a8` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-633516ff-d492-4e6a-b3bf-6243e6ebf350` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-3345a1a0-e9c9-4747-94d3-563597028612` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-6f05b7f0-3c42-4648-878f-4c4e10215356` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-fcce4fc2-c3cd-485f-99f3-f7ca2f1a8a9c` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-bf76b7af-a0c8-4325-bf26-9d9d7c8b1905` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-a2c1f17e-b6b5-402f-86fe-e0faa32e50db` |
| 96 | `GET /v1/accounts/me` | 200 | 7 | `qa-9024967e-27e8-4e28-890a-91f33b7340b9` |
| 97 | `POST /v1/auth/token` | 200 | 11 | `qa-a74190cb-5fb6-443e-b036-b4d21e47fdc9` |
| 98 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-78bebf53-8f46-44a4-add4-6e2f4be62d98` |
| 99 | `POST /v1/auth/token` | 401 | 5 | `qa-f70cac13-c098-4b45-8dbc-2ba44a401523` |
| 100 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ccbff2a7-37dc-490e-b476-1e3ae344c3b8` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-be980f18-f9d7-4dc8-92e5-096f50638d31` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea63ab90-d103-4648-ac25-4c39cf5047ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea63ab90-d103-4648-ac25-4c39cf5047ec
Content-Type: application/json

--- request body ---
{"handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea63ab90-d103-4648-ac25-4c39cf5047ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Location: /v1/accounts/qa-6060be658e6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c66e399c-7e1b-48e6-83e1-272d89b9a3be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c66e399c-7e1b-48e6-83e1-272d89b9a3be
Content-Type: application/json

--- request body ---
{"handle":"qa-0270a77e5295","displayName":"QA 0270a77e5295","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c66e399c-7e1b-48e6-83e1-272d89b9a3be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Location: /v1/accounts/qa-0270a77e5295
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22434b47-c47d-439d-8948-da0d214b11f4","handle":"qa-0270a77e5295","displayName":"QA 0270a77e5295","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.792410794Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-140260cd-2f79-4d5b-b9ac-844233cb97a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-140260cd-2f79-4d5b-b9ac-844233cb97a0
Content-Type: application/json

--- request body ---
{"handle":"qa-6060be658e6a","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-140260cd-2f79-4d5b-b9ac-844233cb97a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6944c1de-8d64-462b-9993-4da8fc177169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6944c1de-8d64-462b-9993-4da8fc177169
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0270a77e5295","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6944c1de-8d64-462b-9993-4da8fc177169
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
Location: /v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_099b1d12-a382-4268-bc4f-d34b7983478e","subject":"Error contract","status":"open","region":"eu","participants":["qa-6060be658e6a","qa-0270a77e5295"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:45.914371201Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-02307351-5d5f-40ec-8b99-8a9a5e3c34bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02307351-5d5f-40ec-8b99-8a9a5e3c34bc
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-02307351-5d5f-40ec-8b99-8a9a5e3c34bc
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0b2b6df-0ea1-4869-9ff8-c711e70f6ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0b2b6df-0ea1-4869-9ff8-c711e70f6ded
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0b2b6df-0ea1-4869-9ff8-c711e70f6ded
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-40d55aa5-a55e-45e5-a60c-ca67365f2402

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40d55aa5-a55e-45e5-a60c-ca67365f2402
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-40d55aa5-a55e-45e5-a60c-ca67365f2402
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-722d0106-98ab-4621-a8ea-14c44a65ad80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-722d0106-98ab-4621-a8ea-14c44a65ad80
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-722d0106-98ab-4621-a8ea-14c44a65ad80
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-c117e7ab-207f-4231-81bb-468a0710596f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c117e7ab-207f-4231-81bb-468a0710596f
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c117e7ab-207f-4231-81bb-468a0710596f
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9683634-fbab-4644-8560-5028d1730ae5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9683634-fbab-4644-8560-5028d1730ae5
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9683634-fbab-4644-8560-5028d1730ae5
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-e48eb02d-e442-489f-95f3-edf5a85f664c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48eb02d-e442-489f-95f3-edf5a85f664c
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e48eb02d-e442-489f-95f3-edf5a85f664c
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-27c5a042-0a7e-45cb-8c52-cdcf9411ffc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27c5a042-0a7e-45cb-8c52-cdcf9411ffc1
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-27c5a042-0a7e-45cb-8c52-cdcf9411ffc1
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-57d56190-11bf-435d-9be0-739a868888fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57d56190-11bf-435d-9be0-739a868888fa
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-57d56190-11bf-435d-9be0-739a868888fa
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b3b93aa-043d-4b11-abb2-254ffdd51ecf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b3b93aa-043d-4b11-abb2-254ffdd51ecf
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b3b93aa-043d-4b11-abb2-254ffdd51ecf
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f68d0c8-1eb9-4fce-8a88-cbe49d6adce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f68d0c8-1eb9-4fce-8a88-cbe49d6adce6
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f68d0c8-1eb9-4fce-8a88-cbe49d6adce6
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee3b539f-8f70-4733-8718-0e799821a1c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee3b539f-8f70-4733-8718-0e799821a1c2
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee3b539f-8f70-4733-8718-0e799821a1c2
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcbb8dcb-b975-4c27-9d18-94ae3b37c428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcbb8dcb-b975-4c27-9d18-94ae3b37c428
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcbb8dcb-b975-4c27-9d18-94ae3b37c428
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-c73b260b-d40c-4873-8beb-682b66d6abe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c73b260b-d40c-4873-8beb-682b66d6abe4
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c73b260b-d40c-4873-8beb-682b66d6abe4
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-810475a9-4d65-4519-8ff7-32cd2c80996f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810475a9-4d65-4519-8ff7-32cd2c80996f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-810475a9-4d65-4519-8ff7-32cd2c80996f
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-6abfd1b6-abcf-4bb8-9c0d-5043335b8ea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6abfd1b6-abcf-4bb8-9c0d-5043335b8ea9
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6abfd1b6-abcf-4bb8-9c0d-5043335b8ea9
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-c67a4103-2029-4bae-938f-7c8fd05eea7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c67a4103-2029-4bae-938f-7c8fd05eea7b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c67a4103-2029-4bae-938f-7c8fd05eea7b
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-43f7a1cb-e746-42da-9fe7-54d71015b598

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43f7a1cb-e746-42da-9fe7-54d71015b598
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-43f7a1cb-e746-42da-9fe7-54d71015b598
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-24a73b2b-00a6-49fd-95d6-67dbfee0eed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24a73b2b-00a6-49fd-95d6-67dbfee0eed3
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-24a73b2b-00a6-49fd-95d6-67dbfee0eed3
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-16f6e0f7-ca0e-4113-bf6b-5acc6208aa7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16f6e0f7-ca0e-4113-bf6b-5acc6208aa7c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-16f6e0f7-ca0e-4113-bf6b-5acc6208aa7c
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4cb6253-7791-4614-b1c3-f86db72e91a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4cb6253-7791-4614-b1c3-f86db72e91a8
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4cb6253-7791-4614-b1c3-f86db72e91a8
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-a061482d-6858-452b-878a-51d0af0a08e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a061482d-6858-452b-878a-51d0af0a08e9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a061482d-6858-452b-878a-51d0af0a08e9
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-c32864ae-1113-46c3-8c8e-249e10c16c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c32864ae-1113-46c3-8c8e-249e10c16c9b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c32864ae-1113-46c3-8c8e-249e10c16c9b
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-e59a2a8a-f8fb-4df7-ac6a-2a3c8019b24a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e59a2a8a-f8fb-4df7-ac6a-2a3c8019b24a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e59a2a8a-f8fb-4df7-ac6a-2a3c8019b24a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-c44f480a-422f-4542-9bf8-4db1effe5904

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c44f480a-422f-4542-9bf8-4db1effe5904
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c44f480a-422f-4542-9bf8-4db1effe5904
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e5201b1-25e6-4dbc-8ca1-3661d4eb6442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e5201b1-25e6-4dbc-8ca1-3661d4eb6442
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e5201b1-25e6-4dbc-8ca1-3661d4eb6442
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-05757751-eb50-4f84-a8d0-16eaff2cc6e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05757751-eb50-4f84-a8d0-16eaff2cc6e0
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-05757751-eb50-4f84-a8d0-16eaff2cc6e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-10ad3aac-6544-41ba-ae61-d4cd7613e96b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ad3aac-6544-41ba-ae61-d4cd7613e96b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ad3aac-6544-41ba-ae61-d4cd7613e96b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e24373a-0be6-435c-ac39-3e1a5b1231a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e24373a-0be6-435c-ac39-3e1a5b1231a5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e24373a-0be6-435c-ac39-3e1a5b1231a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0a796bf-bf11-432a-b37c-340424d03e6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0a796bf-bf11-432a-b37c-340424d03e6d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0a796bf-bf11-432a-b37c-340424d03e6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-e78d2a0d-c8a3-434c-93bc-222a9d13a824

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78d2a0d-c8a3-434c-93bc-222a9d13a824
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78d2a0d-c8a3-434c-93bc-222a9d13a824
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc69a9ca-c3c1-4084-b9c0-63761cc11a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc69a9ca-c3c1-4084-b9c0-63761cc11a51
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc69a9ca-c3c1-4084-b9c0-63761cc11a51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-aef56765-2026-4b90-8265-3ac3e5738d0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aef56765-2026-4b90-8265-3ac3e5738d0b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-aef56765-2026-4b90-8265-3ac3e5738d0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-98ad2bdd-ac7c-488a-b8f5-494dc479a1b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ad2bdd-ac7c-488a-b8f5-494dc479a1b5
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-98ad2bdd-ac7c-488a-b8f5-494dc479a1b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-e06fccd8-0ef3-4acd-88a1-dd294287a130

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e06fccd8-0ef3-4acd-88a1-dd294287a130
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e06fccd8-0ef3-4acd-88a1-dd294287a130
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec7f15fe-5e8f-4a68-9434-5d8f18a362d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec7f15fe-5e8f-4a68-9434-5d8f18a362d5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec7f15fe-5e8f-4a68-9434-5d8f18a362d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb4836fb-1253-41a9-8572-a99fe7370aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb4836fb-1253-41a9-8572-a99fe7370aaa
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb4836fb-1253-41a9-8572-a99fe7370aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-b20e27a2-e7e8-470f-96ee-4ab97980faae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b20e27a2-e7e8-470f-96ee-4ab97980faae
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b20e27a2-e7e8-470f-96ee-4ab97980faae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b7b8da9-dd7b-470d-8b8d-a34f7769ad76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b7b8da9-dd7b-470d-8b8d-a34f7769ad76
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b7b8da9-dd7b-470d-8b8d-a34f7769ad76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2bf4747-025b-46d0-a8f5-d5f0f167cda7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2bf4747-025b-46d0-a8f5-d5f0f167cda7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2bf4747-025b-46d0-a8f5-d5f0f167cda7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9318efb-cec3-4321-862c-df76497ae599

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9318efb-cec3-4321-862c-df76497ae599
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9318efb-cec3-4321-862c-df76497ae599
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-34ad5eee-d320-49c2-ae5f-b5f806057697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34ad5eee-d320-49c2-ae5f-b5f806057697
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-34ad5eee-d320-49c2-ae5f-b5f806057697
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-270dec15-1150-4fc7-94d8-6df876a0aefc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-270dec15-1150-4fc7-94d8-6df876a0aefc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-270dec15-1150-4fc7-94d8-6df876a0aefc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-544a61f9-2679-49c6-b5a3-9ffe1636a480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-544a61f9-2679-49c6-b5a3-9ffe1636a480
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-544a61f9-2679-49c6-b5a3-9ffe1636a480
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8fa477e-805a-4ef2-b31f-eee6b3712a31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8fa477e-805a-4ef2-b31f-eee6b3712a31
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8fa477e-805a-4ef2-b31f-eee6b3712a31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-31e1b891-c671-4664-962c-c6a85890e5ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31e1b891-c671-4664-962c-c6a85890e5ff
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-31e1b891-c671-4664-962c-c6a85890e5ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-7302607b-9c69-4e90-8b99-c63069bc37fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7302607b-9c69-4e90-8b99-c63069bc37fc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-7302607b-9c69-4e90-8b99-c63069bc37fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-1517a62f-54f7-451c-ae49-6e5791b2aeee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1517a62f-54f7-451c-ae49-6e5791b2aeee
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1517a62f-54f7-451c-ae49-6e5791b2aeee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-78bc2436-fea2-4714-b810-f4d0bfc619ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78bc2436-fea2-4714-b810-f4d0bfc619ab
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-78bc2436-fea2-4714-b810-f4d0bfc619ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-10799e2d-c784-4981-8a47-28fe10d9f1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10799e2d-c784-4981-8a47-28fe10d9f1ab
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-10799e2d-c784-4981-8a47-28fe10d9f1ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b4dfb0e-c564-44c6-a2a0-2bf34fc0616a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4dfb0e-c564-44c6-a2a0-2bf34fc0616a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b4dfb0e-c564-44c6-a2a0-2bf34fc0616a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-19c11756-620a-4cd5-b45f-363c5a2925b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19c11756-620a-4cd5-b45f-363c5a2925b2
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-19c11756-620a-4cd5-b45f-363c5a2925b2
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1af9487-d135-44f1-91a9-257209dae14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1af9487-d135-44f1-91a9-257209dae14c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1af9487-d135-44f1-91a9-257209dae14c
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6fbaee7-a8b7-4cfb-9b40-ddba1b948cfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6fbaee7-a8b7-4cfb-9b40-ddba1b948cfd
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6fbaee7-a8b7-4cfb-9b40-ddba1b948cfd
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5b501b6-0e92-4f64-ade0-09450362b3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5b501b6-0e92-4f64-ade0-09450362b3b4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5b501b6-0e92-4f64-ade0-09450362b3b4
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-8947228c-8021-4cad-a996-42ed0384ad97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8947228c-8021-4cad-a996-42ed0384ad97
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8947228c-8021-4cad-a996-42ed0384ad97
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f8dc97a-369d-4245-88b8-67baedb6504a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f8dc97a-369d-4245-88b8-67baedb6504a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f8dc97a-369d-4245-88b8-67baedb6504a
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cefd32b-ae58-4d2a-b6bb-3ce4cdcf719f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cefd32b-ae58-4d2a-b6bb-3ce4cdcf719f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cefd32b-ae58-4d2a-b6bb-3ce4cdcf719f
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ce65ada-2ffe-4991-830b-9026e3a9ca02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ce65ada-2ffe-4991-830b-9026e3a9ca02
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ce65ada-2ffe-4991-830b-9026e3a9ca02
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc6f2509-c9e9-47cb-82a3-d45cf9543f1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc6f2509-c9e9-47cb-82a3-d45cf9543f1f
Content-Type: application/json

--- response: 429 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc6f2509-c9e9-47cb-82a3-d45cf9543f1f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dc6f2509-c9e9-47cb-82a3-d45cf9543f1f"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-7547daf0-a9d7-4578-a2f5-8e026089ed57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7547daf0-a9d7-4578-a2f5-8e026089ed57
Content-Type: application/json

--- request body ---
{"handle":"qa-6060be658e6a","password":"****"}

--- response: 429 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7547daf0-a9d7-4578-a2f5-8e026089ed57
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
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/auth/token","correlationId":"qa-7547daf0-a9d7-4578-a2f5-8e026089ed57"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-b184bd97-7b67-43c1-94b9-e4271b765185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b184bd97-7b67-43c1-94b9-e4271b765185
Content-Type: application/json

--- request body ---
{"handle":"qa-e9a8f945f603","displayName":"QA e9a8f945f603","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b184bd97-7b67-43c1-94b9-e4271b765185
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
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts","correlationId":"qa-b184bd97-7b67-43c1-94b9-e4271b765185"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-be8df082-f297-4141-968b-82cdbc6516e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be8df082-f297-4141-968b-82cdbc6516e0
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be8df082-f297-4141-968b-82cdbc6516e0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-be8df082-f297-4141-968b-82cdbc6516e0"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ea55e040-2d3c-4263-935a-313416feb5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea55e040-2d3c-4263-935a-313416feb5a0
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea55e040-2d3c-4263-935a-313416feb5a0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ea55e040-2d3c-4263-935a-313416feb5a0"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50a570af-b867-46b9-8948-f76cede7b97e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a570af-b867-46b9-8948-f76cede7b97e
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50a570af-b867-46b9-8948-f76cede7b97e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-50a570af-b867-46b9-8948-f76cede7b97e"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-6060be658e6a
correlation: qa-77cb0b46-bc14-4f8a-90e1-ad786e943799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77cb0b46-bc14-4f8a-90e1-ad786e943799
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77cb0b46-bc14-4f8a-90e1-ad786e943799
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
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-6060be658e6a","correlationId":"qa-77cb0b46-bc14-4f8a-90e1-ad786e943799"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-fcddf877-4b10-4560-80bb-abf3f4e18878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcddf877-4b10-4560-80bb-abf3f4e18878
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6060be658e6a","subject":"Probe","message":"Hi"}

--- response: 429 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcddf877-4b10-4560-80bb-abf3f4e18878
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
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-fcddf877-4b10-4560-80bb-abf3f4e18878"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-ff153918-8b14-4032-92fe-278d474a5c2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff153918-8b14-4032-92fe-278d474a5c2e
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff153918-8b14-4032-92fe-278d474a5c2e
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
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-ff153918-8b14-4032-92fe-278d474a5c2e"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e
correlation: qa-c5786e4b-bb8c-4f95-a9ba-4b1e0c83bf14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5786e4b-bb8c-4f95-a9ba-4b1e0c83bf14
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5786e4b-bb8c-4f95-a9ba-4b1e0c83bf14
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
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e","correlationId":"qa-c5786e4b-bb8c-4f95-a9ba-4b1e0c83bf14"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/messages
correlation: qa-5f0a670a-93b2-4007-b402-3b0f8fc8ea8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f0a670a-93b2-4007-b402-3b0f8fc8ea8d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f0a670a-93b2-4007-b402-3b0f8fc8ea8d
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
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/messages","correlationId":"qa-5f0a670a-93b2-4007-b402-3b0f8fc8ea8d"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/messages
correlation: qa-7aeec190-7a8e-4113-ac9a-be402f79a7f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aeec190-7a8e-4113-ac9a-be402f79a7f9
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7aeec190-7a8e-4113-ac9a-be402f79a7f9
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
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/messages","correlationId":"qa-7aeec190-7a8e-4113-ac9a-be402f79a7f9"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/read
correlation: qa-48f92a9f-ed50-4b6a-a621-c5100a220cd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48f92a9f-ed50-4b6a-a621-c5100a220cd9
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48f92a9f-ed50-4b6a-a621-c5100a220cd9
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
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/read","correlationId":"qa-48f92a9f-ed50-4b6a-a621-c5100a220cd9"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/close
correlation: qa-df953ad8-d750-4078-86b6-2565c1879f1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df953ad8-d750-4078-86b6-2565c1879f1c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df953ad8-d750-4078-86b6-2565c1879f1c
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
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_099b1d12-a382-4268-bc4f-d34b7983478e/close","correlationId":"qa-df953ad8-d750-4078-86b6-2565c1879f1c"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-39083525-39de-4de5-a523-e4f58d813902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39083525-39de-4de5-a523-e4f58d813902
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39083525-39de-4de5-a523-e4f58d813902
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
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-39083525-39de-4de5-a523-e4f58d813902"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-42a7d0fc-8208-40c7-88b3-c5307ba8cc80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42a7d0fc-8208-40c7-88b3-c5307ba8cc80
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42a7d0fc-8208-40c7-88b3-c5307ba8cc80
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
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-42a7d0fc-8208-40c7-88b3-c5307ba8cc80"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b647c449-dd0e-43f8-9ecd-57dd80597eda

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2ce93bbd977341a9857a32a3846d1294
X-Correlation-Id: qa-b647c449-dd0e-43f8-9ecd-57dd80597eda
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b647c449-dd0e-43f8-9ecd-57dd80597eda
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
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-b647c449-dd0e-43f8-9ecd-57dd80597eda"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-8a3eced7-a672-4188-a3c0-ca4585007b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a3eced7-a672-4188-a3c0-ca4585007b37
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a3eced7-a672-4188-a3c0-ca4585007b37
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-8a3eced7-a672-4188-a3c0-ca4585007b37"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-86c9dcdb-788a-40fa-8778-39ce4a853129

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c9dcdb-788a-40fa-8778-39ce4a853129
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86c9dcdb-788a-40fa-8778-39ce4a853129
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-86c9dcdb-788a-40fa-8778-39ce4a853129"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9bc8910-8cd2-4cfb-b903-779f042fb692

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9bc8910-8cd2-4cfb-b903-779f042fb692
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9bc8910-8cd2-4cfb-b903-779f042fb692
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c9bc8910-8cd2-4cfb-b903-779f042fb692"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-60612417-4c24-4bc9-a3e3-5f5672da8827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60612417-4c24-4bc9-a3e3-5f5672da8827
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60612417-4c24-4bc9-a3e3-5f5672da8827
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60612417-4c24-4bc9-a3e3-5f5672da8827"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-38a02cbe-f2a2-45d3-bbb3-07e599444d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38a02cbe-f2a2-45d3-bbb3-07e599444d7c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38a02cbe-f2a2-45d3-bbb3-07e599444d7c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-38a02cbe-f2a2-45d3-bbb3-07e599444d7c"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-bea3b61b-2d63-41c0-9927-04570474b20a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea3b61b-2d63-41c0-9927-04570474b20a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bea3b61b-2d63-41c0-9927-04570474b20a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bea3b61b-2d63-41c0-9927-04570474b20a"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-c60ef5bc-6f7c-4a6f-9316-9ced07494e29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c60ef5bc-6f7c-4a6f-9316-9ced07494e29
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c60ef5bc-6f7c-4a6f-9316-9ced07494e29
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c60ef5bc-6f7c-4a6f-9316-9ced07494e29"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd3b4d2a-6aaa-4ad9-bdb5-21de615b3a6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd3b4d2a-6aaa-4ad9-bdb5-21de615b3a6a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd3b4d2a-6aaa-4ad9-bdb5-21de615b3a6a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cd3b4d2a-6aaa-4ad9-bdb5-21de615b3a6a"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3ade4fc-b677-48fa-8fa1-54b7f9e4e9a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3ade4fc-b677-48fa-8fa1-54b7f9e4e9a8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a3ade4fc-b677-48fa-8fa1-54b7f9e4e9a8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a3ade4fc-b677-48fa-8fa1-54b7f9e4e9a8"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-633516ff-d492-4e6a-b3bf-6243e6ebf350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-633516ff-d492-4e6a-b3bf-6243e6ebf350
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-633516ff-d492-4e6a-b3bf-6243e6ebf350
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-633516ff-d492-4e6a-b3bf-6243e6ebf350"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-3345a1a0-e9c9-4747-94d3-563597028612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3345a1a0-e9c9-4747-94d3-563597028612
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3345a1a0-e9c9-4747-94d3-563597028612
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3345a1a0-e9c9-4747-94d3-563597028612"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f05b7f0-3c42-4648-878f-4c4e10215356

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f05b7f0-3c42-4648-878f-4c4e10215356
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 23 Oct 2026 07:41:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f05b7f0-3c42-4648-878f-4c4e10215356
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6f05b7f0-3c42-4648-878f-4c4e10215356"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-fcce4fc2-c3cd-485f-99f3-f7ca2f1a8a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcce4fc2-c3cd-485f-99f3-f7ca2f1a8a9c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fcce4fc2-c3cd-485f-99f3-f7ca2f1a8a9c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fcce4fc2-c3cd-485f-99f3-f7ca2f1a8a9c"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf76b7af-a0c8-4325-bf26-9d9d7c8b1905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf76b7af-a0c8-4325-bf26-9d9d7c8b1905
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf76b7af-a0c8-4325-bf26-9d9d7c8b1905
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bf76b7af-a0c8-4325-bf26-9d9d7c8b1905"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2c1f17e-b6b5-402f-86fe-e0faa32e50db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2c1f17e-b6b5-402f-86fe-e0faa32e50db
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a2c1f17e-b6b5-402f-86fe-e0faa32e50db
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a2c1f17e-b6b5-402f-86fe-e0faa32e50db"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-9024967e-27e8-4e28-890a-91f33b7340b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9024967e-27e8-4e28-890a-91f33b7340b9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9024967e-27e8-4e28-890a-91f33b7340b9
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

{"id":"acc_d0f2fc99-05f7-43d2-8f4f-588fd775b761","handle":"qa-6060be658e6a","displayName":"QA 6060be658e6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.731782444Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-a74190cb-5fb6-443e-b036-b4d21e47fdc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74190cb-5fb6-443e-b036-b4d21e47fdc9
Content-Type: application/json

--- request body ---
{"handle":"qa-0270a77e5295","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a74190cb-5fb6-443e-b036-b4d21e47fdc9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22434b47-c47d-439d-8948-da0d214b11f4"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78bebf53-8f46-44a4-add4-6e2f4be62d98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78bebf53-8f46-44a4-add4-6e2f4be62d98
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78bebf53-8f46-44a4-add4-6e2f4be62d98
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

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-f70cac13-c098-4b45-8dbc-2ba44a401523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f70cac13-c098-4b45-8dbc-2ba44a401523
Content-Type: application/json

--- request body ---
{"handle":"qa-0270a77e5295","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f70cac13-c098-4b45-8dbc-2ba44a401523
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f70cac13-c098-4b45-8dbc-2ba44a401523"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccbff2a7-37dc-490e-b476-1e3ae344c3b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccbff2a7-37dc-490e-b476-1e3ae344c3b8
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccbff2a7-37dc-490e-b476-1e3ae344c3b8
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

## 101. POST /v1/auth/token

```text
#101 POST http://localhost:7070/v1/auth/token
correlation: qa-be980f18-f9d7-4dc8-92e5-096f50638d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be980f18-f9d7-4dc8-92e5-096f50638d31
Content-Type: application/json

--- request body ---
{"handle":"qa-6060be658e6a","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 23 Oct 2026 07:41:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be980f18-f9d7-4dc8-92e5-096f50638d31
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be980f18-f9d7-4dc8-92e5-096f50638d31"}
```
