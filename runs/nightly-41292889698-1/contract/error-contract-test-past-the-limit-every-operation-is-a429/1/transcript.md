# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 102 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-63740770-1954-46be-abbd-4fcc83ac8f0b` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-3a43404e-128e-4a22-896f-25dbf4fd93f4` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-c3f6871d-c85e-4ee6-8d97-1a3ae3431857` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-fccef910-a0f9-4658-b45c-d42df2a4f820` |
| 5 | `GET /v1/accounts/me` | 200 | 21 | `qa-f1b1235a-847c-4cf8-b316-3b42c11d01ef` |
| 6 | `GET /v1/accounts/me` | 200 | 21 | `qa-2075b5a3-7457-4e65-9be3-90f054e74253` |
| 7 | `GET /v1/accounts/me` | 200 | 24 | `qa-aa5b6bfb-2b36-43a8-897b-a6283d27d2f7` |
| 8 | `GET /v1/accounts/me` | 200 | 22 | `qa-1f5a2110-658f-4d69-85f2-4494fe27291d` |
| 9 | `GET /v1/accounts/me` | 200 | 20 | `qa-e78ddebc-cdf4-468a-8ae3-695bb48c88b7` |
| 10 | `GET /v1/accounts/me` | 200 | 23 | `qa-b9fd0308-838f-41c9-a7b6-f9c61707909a` |
| 11 | `GET /v1/accounts/me` | 200 | 15 | `qa-687fd6c5-53cc-4c42-9665-a43660004ff9` |
| 12 | `GET /v1/accounts/me` | 200 | 32 | `qa-7f7b5ee5-6621-4a03-babd-6fcb471940cd` |
| 13 | `GET /v1/accounts/me` | 200 | 21 | `qa-f695752c-6e04-46ac-ace8-6868b2f11418` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-64777bbb-74c9-4e60-9f19-b8cd6227e668` |
| 15 | `GET /v1/accounts/me` | 200 | 18 | `qa-c54ab802-4d9a-4343-905e-9ab7bed62387` |
| 16 | `GET /v1/accounts/me` | 200 | 14 | `qa-7ac2e665-9cc0-4f15-9088-7f8e596793a3` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-b94f61d0-92ad-46ff-b398-dd67f2b6434a` |
| 18 | `GET /v1/accounts/me` | 200 | 21 | `qa-afd12632-b078-4b55-b6ce-a6ba6591712f` |
| 19 | `GET /v1/accounts/me` | 200 | 14 | `qa-3f233dce-673c-4017-9739-792e5a213ee3` |
| 20 | `GET /v1/accounts/me` | 200 | 29 | `qa-5565b63c-a66a-4eb3-9cca-b25a336813ca` |
| 21 | `GET /v1/accounts/me` | 200 | 7 | `qa-2afe5a75-d2dc-4d43-aba0-478719459e4e` |
| 22 | `GET /v1/accounts/me` | 200 | 17 | `qa-1e5f3492-7089-46c2-8b13-0b794aef8ad6` |
| 23 | `GET /v1/accounts/me` | 200 | 23 | `qa-99fa1a7d-795e-46e9-8990-eb0cb33613e5` |
| 24 | `GET /v1/accounts/me` | 200 | 18 | `qa-36816867-a0b0-46e1-8b42-b93b6e9eb102` |
| 25 | `GET /v1/accounts/me` | 200 | 21 | `qa-348b1b82-154e-4453-8d0d-5ecc07c00eb5` |
| 26 | `GET /v1/accounts/me` | 200 | 13 | `qa-0dcef57b-4dac-4a09-a05a-10d5f2155281` |
| 27 | `GET /v1/accounts/me` | 200 | 41 | `qa-8f6f54ee-6124-4213-852a-c07c0181b7e0` |
| 28 | `GET /v1/accounts/me` | 200 | 16 | `qa-70dd8ec4-a0cd-4e3c-a5bd-f0960627b198` |
| 29 | `GET /v1/accounts/me` | 200 | 16 | `qa-066a0328-4756-413e-a87d-70311762cfe6` |
| 30 | `GET /v1/accounts/me` | 200 | 19 | `qa-611bc377-49f1-4473-8145-b021503241fb` |
| 31 | `GET /v1/accounts/me` | 200 | 14 | `qa-a3a95b3b-4304-411e-a881-fa856e99ddf2` |
| 32 | `GET /v1/accounts/me` | 200 | 11 | `qa-4a630092-8d60-42f8-8743-45b6a670ab86` |
| 33 | `GET /v1/accounts/me` | 200 | 21 | `qa-7b7aec83-d278-44f7-8068-3fca69568036` |
| 34 | `GET /v1/accounts/me` | 200 | 30 | `qa-597649fa-a363-4d23-a2ed-a13a159e1b7d` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-6d1f0b37-ae50-4db0-9d0c-3ab1d864aa7c` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-bad01d0a-58c3-4317-9868-8e98ffd26d30` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-e7ccb71c-cb3d-4ce1-b7f8-3238499631ad` |
| 38 | `GET /v1/accounts/me` | 200 | 9 | `qa-f78c7922-1afa-45c3-9b3e-cdb580dcf131` |
| 39 | `GET /v1/accounts/me` | 200 | 12 | `qa-d79df503-d2f2-473a-9df3-870b6fcdcd44` |
| 40 | `GET /v1/accounts/me` | 200 | 16 | `qa-56ee3ade-8f2e-4ef9-bffa-5969f9ef22c4` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-cfba5f1c-a712-43b5-8729-d4b6320676f7` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-4cc5ca04-801f-4d3d-9aa3-149fb9146d6e` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-4aed6741-de08-4830-a482-30e0daf3f949` |
| 44 | `GET /v1/accounts/me` | 200 | 9 | `qa-39b8acfa-47df-47c6-8736-f6a677b97d88` |
| 45 | `GET /v1/accounts/me` | 200 | 9 | `qa-5a80835c-066a-4246-8f84-579279422fcd` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-02eba574-bd9c-4275-8b2f-18156e9c7655` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-1bdfe8d0-3a6a-405b-a9a4-bfa4d757894e` |
| 48 | `GET /v1/accounts/me` | 200 | 6 | `qa-754588e7-9fba-47ac-926f-3e2ff663d259` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-611c4f43-9c08-4f3f-afeb-f0ae95066f12` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-c90089bc-21c6-4b4c-b974-5e4e3d4ace25` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-efe5e038-3078-4278-b39a-73a41727f145` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-cbf3381e-cbde-44e0-80cd-851d7f82b7fc` |
| 53 | `GET /v1/accounts/me` | 200 | 10 | `qa-b963a2ec-70d4-4190-9fc2-39f6218d094b` |
| 54 | `GET /v1/accounts/me` | 200 | 40 | `qa-e0d0e0d4-890a-43fb-889b-043e17adab8b` |
| 55 | `GET /v1/accounts/me` | 200 | 12 | `qa-2e675ac9-558f-4a92-b0b0-033b3593cf0f` |
| 56 | `GET /v1/accounts/me` | 200 | 15 | `qa-78ae8eb0-6444-4b36-8ab5-cc6c00ef08a1` |
| 57 | `GET /v1/accounts/me` | 200 | 10 | `qa-8f861876-85c2-4ce1-8857-b589206c505c` |
| 58 | `GET /v1/accounts/me` | 200 | 6 | `qa-395aa82d-7491-4442-8d30-97eca06240fb` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-dff16b61-4cbf-4a66-bca0-fed8ccce9638` |
| 60 | `GET /v1/accounts/me` | 200 | 11 | `qa-a8acff17-e488-43cc-9596-e3d1eb4e0883` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-fe8dcd9d-57b5-49cf-be3c-e67160910cec` |
| 62 | `GET /v1/accounts/me` | 200 | 7 | `qa-048d83ff-fdbd-4f30-b37c-812717126e9a` |
| 63 | `GET /v1/accounts/me` | 200 | 7 | `qa-fd63d3bd-ebc1-476f-8492-237be848d4d5` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-fa51d31c-356f-44c9-b6a8-6af64a4b274c` |
| 65 | `POST /v1/auth/token` | 429 | 7 | `qa-596498be-c294-43df-acc8-8bb583f81c57` |
| 66 | `POST /v1/accounts` | 429 | 6 | `qa-6e15b623-93c9-42e3-ac8d-40b84fcda9bb` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-ad2ec4b7-4fb2-4916-914e-0aa1b7a21ec6` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-8998b0d8-c2df-4c84-b637-182634eded70` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-c1bd1446-fb9a-435c-9337-62f3da5c6e0e` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-5fa0b20b-7309-474c-932b-2d82b4c3ed63` |
| 71 | `POST /v1/conversations` | 429 | 9 | `qa-dbb72111-ff7f-4af8-a370-550868d2338c` |
| 72 | `GET /v1/conversations` | 429 | 11 | `qa-ec384ce3-8fa0-42a3-8e5c-cebd7a40d3b4` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-a38b820a-cef0-46bf-a33a-f518a75f5600` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 7 | `qa-27c050be-8867-474f-be9f-afef8ab79f7f` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 7 | `qa-47514695-b979-4d87-867b-d512ebd5c466` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 7 | `qa-d03dc76f-26f5-40b8-a662-6eb25672a74c` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-75c11e56-7941-4c4e-bfb6-45bcc74cf54d` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-07e38de9-9f49-4aab-a3cb-9d0f9702a3c1` |
| 79 | `GET /v1/credits/ledger` | 429 | 7 | `qa-d2fb3b19-b3a8-4d7b-9d2e-ef54597e477d` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-6004d147-935f-4b93-8f21-6e799ac76843` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-a7c50df3-6590-4489-86f1-130500b7ff0c` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-19fdf95d-c199-44fe-924b-145e42baafc5` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-f24d7150-9a4a-438f-8476-941b698378ee` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-0884fb99-f635-4eaa-b52d-91410cc0d320` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-261a0c73-ef9e-4687-bf37-4f05f01f2f24` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-479e0ab3-59f3-48d7-924a-37611904d80c` |
| 87 | `GET /v1/accounts/me` | 429 | 4 | `qa-cfba2d8d-3c45-4bfe-ae0c-268cb14bc302` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-17dd4fb7-791e-4e43-b7db-d9831c34da62` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-bd7433e7-5ae3-4eb5-acc2-cb43f0e7634e` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-0de33d9b-aa1f-4335-83ac-05ea98247d10` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-ff6e7c4c-2d70-4128-b1fc-b3de34d6ce7e` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-7248d6cc-e245-417d-ae5e-976fa81f5167` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-68019970-9352-438f-8d2f-0c1cace25af7` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-342ae9ef-d871-48a7-9e22-102c02f9428d` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-9a890b99-693d-4ddc-9da8-a4298e6c8f21` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-8ab9331d-1039-495d-a7ef-4d866267d44c` |
| 97 | `GET /v1/accounts/me` | 200 | 4 | `qa-fc890eb3-a910-4b51-96d0-301ffc48454f` |
| 98 | `POST /v1/auth/token` | 200 | 9 | `qa-88191434-7052-416a-947a-0f5cfa962240` |
| 99 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-39cc5558-f989-469b-97dc-c40bc3c74928` |
| 100 | `POST /v1/auth/token` | 401 | 7 | `qa-f822515b-b878-4c90-ac15-48ed8c490ad4` |
| 101 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-14e4b22b-5c85-4c98-87ca-db264279fd53` |
| 102 | `POST /v1/auth/token` | 401 | 4 | `qa-39e36b27-cf07-4c9f-a235-cac117f731ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-63740770-1954-46be-abbd-4fcc83ac8f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63740770-1954-46be-abbd-4fcc83ac8f0b
Content-Type: application/json

--- request body ---
{"handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-63740770-1954-46be-abbd-4fcc83ac8f0b
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
Location: /v1/accounts/qa-40f3369d9b74
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a43404e-128e-4a22-896f-25dbf4fd93f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a43404e-128e-4a22-896f-25dbf4fd93f4
Content-Type: application/json

--- request body ---
{"handle":"qa-fdcd2516fc13","displayName":"QA fdcd2516fc13","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a43404e-128e-4a22-896f-25dbf4fd93f4
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
Location: /v1/accounts/qa-fdcd2516fc13
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8b4f169-ba8e-40ec-94bb-5ebe6b2d5718","handle":"qa-fdcd2516fc13","displayName":"QA fdcd2516fc13","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.949229486Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c3f6871d-c85e-4ee6-8d97-1a3ae3431857

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f6871d-c85e-4ee6-8d97-1a3ae3431857
Content-Type: application/json

--- request body ---
{"handle":"qa-40f3369d9b74","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3f6871d-c85e-4ee6-8d97-1a3ae3431857
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fccef910-a0f9-4658-b45c-d42df2a4f820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fccef910-a0f9-4658-b45c-d42df2a4f820
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fdcd2516fc13","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-fccef910-a0f9-4658-b45c-d42df2a4f820
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
Location: /v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26","subject":"Error contract","status":"open","region":"eu","participants":["qa-40f3369d9b74","qa-fdcd2516fc13"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.036689109Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1b1235a-847c-4cf8-b316-3b42c11d01ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b1235a-847c-4cf8-b316-3b42c11d01ef
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b1235a-847c-4cf8-b316-3b42c11d01ef
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-2075b5a3-7457-4e65-9be3-90f054e74253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2075b5a3-7457-4e65-9be3-90f054e74253
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2075b5a3-7457-4e65-9be3-90f054e74253
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa5b6bfb-2b36-43a8-897b-a6283d27d2f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa5b6bfb-2b36-43a8-897b-a6283d27d2f7
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa5b6bfb-2b36-43a8-897b-a6283d27d2f7
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f5a2110-658f-4d69-85f2-4494fe27291d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f5a2110-658f-4d69-85f2-4494fe27291d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f5a2110-658f-4d69-85f2-4494fe27291d
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-e78ddebc-cdf4-468a-8ae3-695bb48c88b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78ddebc-cdf4-468a-8ae3-695bb48c88b7
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78ddebc-cdf4-468a-8ae3-695bb48c88b7
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9fd0308-838f-41c9-a7b6-f9c61707909a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9fd0308-838f-41c9-a7b6-f9c61707909a
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9fd0308-838f-41c9-a7b6-f9c61707909a
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-687fd6c5-53cc-4c42-9665-a43660004ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687fd6c5-53cc-4c42-9665-a43660004ff9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-687fd6c5-53cc-4c42-9665-a43660004ff9
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f7b5ee5-6621-4a03-babd-6fcb471940cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f7b5ee5-6621-4a03-babd-6fcb471940cd
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f7b5ee5-6621-4a03-babd-6fcb471940cd
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-f695752c-6e04-46ac-ace8-6868b2f11418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f695752c-6e04-46ac-ace8-6868b2f11418
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f695752c-6e04-46ac-ace8-6868b2f11418
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-64777bbb-74c9-4e60-9f19-b8cd6227e668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64777bbb-74c9-4e60-9f19-b8cd6227e668
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-64777bbb-74c9-4e60-9f19-b8cd6227e668
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-c54ab802-4d9a-4343-905e-9ab7bed62387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c54ab802-4d9a-4343-905e-9ab7bed62387
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c54ab802-4d9a-4343-905e-9ab7bed62387
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ac2e665-9cc0-4f15-9088-7f8e596793a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ac2e665-9cc0-4f15-9088-7f8e596793a3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ac2e665-9cc0-4f15-9088-7f8e596793a3
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-b94f61d0-92ad-46ff-b398-dd67f2b6434a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b94f61d0-92ad-46ff-b398-dd67f2b6434a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b94f61d0-92ad-46ff-b398-dd67f2b6434a
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-afd12632-b078-4b55-b6ce-a6ba6591712f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afd12632-b078-4b55-b6ce-a6ba6591712f
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-afd12632-b078-4b55-b6ce-a6ba6591712f
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f233dce-673c-4017-9739-792e5a213ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f233dce-673c-4017-9739-792e5a213ee3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f233dce-673c-4017-9739-792e5a213ee3
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-5565b63c-a66a-4eb3-9cca-b25a336813ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5565b63c-a66a-4eb3-9cca-b25a336813ca
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5565b63c-a66a-4eb3-9cca-b25a336813ca
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-2afe5a75-d2dc-4d43-aba0-478719459e4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2afe5a75-d2dc-4d43-aba0-478719459e4e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2afe5a75-d2dc-4d43-aba0-478719459e4e
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e5f3492-7089-46c2-8b13-0b794aef8ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e5f3492-7089-46c2-8b13-0b794aef8ad6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e5f3492-7089-46c2-8b13-0b794aef8ad6
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-99fa1a7d-795e-46e9-8990-eb0cb33613e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99fa1a7d-795e-46e9-8990-eb0cb33613e5
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-99fa1a7d-795e-46e9-8990-eb0cb33613e5
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-36816867-a0b0-46e1-8b42-b93b6e9eb102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36816867-a0b0-46e1-8b42-b93b6e9eb102
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-36816867-a0b0-46e1-8b42-b93b6e9eb102
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-348b1b82-154e-4453-8d0d-5ecc07c00eb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-348b1b82-154e-4453-8d0d-5ecc07c00eb5
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-348b1b82-154e-4453-8d0d-5ecc07c00eb5
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-0dcef57b-4dac-4a09-a05a-10d5f2155281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dcef57b-4dac-4a09-a05a-10d5f2155281
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dcef57b-4dac-4a09-a05a-10d5f2155281
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f6f54ee-6124-4213-852a-c07c0181b7e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f6f54ee-6124-4213-852a-c07c0181b7e0
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f6f54ee-6124-4213-852a-c07c0181b7e0
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-70dd8ec4-a0cd-4e3c-a5bd-f0960627b198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70dd8ec4-a0cd-4e3c-a5bd-f0960627b198
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-70dd8ec4-a0cd-4e3c-a5bd-f0960627b198
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-066a0328-4756-413e-a87d-70311762cfe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-066a0328-4756-413e-a87d-70311762cfe6
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-066a0328-4756-413e-a87d-70311762cfe6
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-611bc377-49f1-4473-8145-b021503241fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-611bc377-49f1-4473-8145-b021503241fb
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-611bc377-49f1-4473-8145-b021503241fb
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3a95b3b-4304-411e-a881-fa856e99ddf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3a95b3b-4304-411e-a881-fa856e99ddf2
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3a95b3b-4304-411e-a881-fa856e99ddf2
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a630092-8d60-42f8-8743-45b6a670ab86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a630092-8d60-42f8-8743-45b6a670ab86
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a630092-8d60-42f8-8743-45b6a670ab86
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b7aec83-d278-44f7-8068-3fca69568036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b7aec83-d278-44f7-8068-3fca69568036
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b7aec83-d278-44f7-8068-3fca69568036
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-597649fa-a363-4d23-a2ed-a13a159e1b7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-597649fa-a363-4d23-a2ed-a13a159e1b7d
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-597649fa-a363-4d23-a2ed-a13a159e1b7d
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d1f0b37-ae50-4db0-9d0c-3ab1d864aa7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d1f0b37-ae50-4db0-9d0c-3ab1d864aa7c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d1f0b37-ae50-4db0-9d0c-3ab1d864aa7c
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-bad01d0a-58c3-4317-9868-8e98ffd26d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bad01d0a-58c3-4317-9868-8e98ffd26d30
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-bad01d0a-58c3-4317-9868-8e98ffd26d30
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7ccb71c-cb3d-4ce1-b7f8-3238499631ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7ccb71c-cb3d-4ce1-b7f8-3238499631ad
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7ccb71c-cb3d-4ce1-b7f8-3238499631ad
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-f78c7922-1afa-45c3-9b3e-cdb580dcf131

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f78c7922-1afa-45c3-9b3e-cdb580dcf131
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f78c7922-1afa-45c3-9b3e-cdb580dcf131
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-d79df503-d2f2-473a-9df3-870b6fcdcd44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d79df503-d2f2-473a-9df3-870b6fcdcd44
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d79df503-d2f2-473a-9df3-870b6fcdcd44
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-56ee3ade-8f2e-4ef9-bffa-5969f9ef22c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ee3ade-8f2e-4ef9-bffa-5969f9ef22c4
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-56ee3ade-8f2e-4ef9-bffa-5969f9ef22c4
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-cfba5f1c-a712-43b5-8729-d4b6320676f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfba5f1c-a712-43b5-8729-d4b6320676f7
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfba5f1c-a712-43b5-8729-d4b6320676f7
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cc5ca04-801f-4d3d-9aa3-149fb9146d6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc5ca04-801f-4d3d-9aa3-149fb9146d6e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cc5ca04-801f-4d3d-9aa3-149fb9146d6e
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-4aed6741-de08-4830-a482-30e0daf3f949

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aed6741-de08-4830-a482-30e0daf3f949
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aed6741-de08-4830-a482-30e0daf3f949
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-39b8acfa-47df-47c6-8736-f6a677b97d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b8acfa-47df-47c6-8736-f6a677b97d88
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b8acfa-47df-47c6-8736-f6a677b97d88
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a80835c-066a-4246-8f84-579279422fcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a80835c-066a-4246-8f84-579279422fcd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a80835c-066a-4246-8f84-579279422fcd
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-02eba574-bd9c-4275-8b2f-18156e9c7655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02eba574-bd9c-4275-8b2f-18156e9c7655
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-02eba574-bd9c-4275-8b2f-18156e9c7655
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bdfe8d0-3a6a-405b-a9a4-bfa4d757894e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bdfe8d0-3a6a-405b-a9a4-bfa4d757894e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bdfe8d0-3a6a-405b-a9a4-bfa4d757894e
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-754588e7-9fba-47ac-926f-3e2ff663d259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-754588e7-9fba-47ac-926f-3e2ff663d259
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-754588e7-9fba-47ac-926f-3e2ff663d259
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-611c4f43-9c08-4f3f-afeb-f0ae95066f12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-611c4f43-9c08-4f3f-afeb-f0ae95066f12
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-611c4f43-9c08-4f3f-afeb-f0ae95066f12
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-c90089bc-21c6-4b4c-b974-5e4e3d4ace25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c90089bc-21c6-4b4c-b974-5e4e3d4ace25
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c90089bc-21c6-4b4c-b974-5e4e3d4ace25
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-efe5e038-3078-4278-b39a-73a41727f145

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efe5e038-3078-4278-b39a-73a41727f145
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-efe5e038-3078-4278-b39a-73a41727f145
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbf3381e-cbde-44e0-80cd-851d7f82b7fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbf3381e-cbde-44e0-80cd-851d7f82b7fc
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbf3381e-cbde-44e0-80cd-851d7f82b7fc
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-b963a2ec-70d4-4190-9fc2-39f6218d094b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b963a2ec-70d4-4190-9fc2-39f6218d094b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b963a2ec-70d4-4190-9fc2-39f6218d094b
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0d0e0d4-890a-43fb-889b-043e17adab8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0d0e0d4-890a-43fb-889b-043e17adab8b
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0d0e0d4-890a-43fb-889b-043e17adab8b
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e675ac9-558f-4a92-b0b0-033b3593cf0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e675ac9-558f-4a92-b0b0-033b3593cf0f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e675ac9-558f-4a92-b0b0-033b3593cf0f
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-78ae8eb0-6444-4b36-8ab5-cc6c00ef08a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78ae8eb0-6444-4b36-8ab5-cc6c00ef08a1
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-78ae8eb0-6444-4b36-8ab5-cc6c00ef08a1
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f861876-85c2-4ce1-8857-b589206c505c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f861876-85c2-4ce1-8857-b589206c505c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f861876-85c2-4ce1-8857-b589206c505c
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-395aa82d-7491-4442-8d30-97eca06240fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-395aa82d-7491-4442-8d30-97eca06240fb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-395aa82d-7491-4442-8d30-97eca06240fb
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-dff16b61-4cbf-4a66-bca0-fed8ccce9638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff16b61-4cbf-4a66-bca0-fed8ccce9638
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-dff16b61-4cbf-4a66-bca0-fed8ccce9638
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8acff17-e488-43cc-9596-e3d1eb4e0883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8acff17-e488-43cc-9596-e3d1eb4e0883
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8acff17-e488-43cc-9596-e3d1eb4e0883
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe8dcd9d-57b5-49cf-be3c-e67160910cec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe8dcd9d-57b5-49cf-be3c-e67160910cec
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe8dcd9d-57b5-49cf-be3c-e67160910cec
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-048d83ff-fdbd-4f30-b37c-812717126e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-048d83ff-fdbd-4f30-b37c-812717126e9a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-048d83ff-fdbd-4f30-b37c-812717126e9a
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd63d3bd-ebc1-476f-8492-237be848d4d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd63d3bd-ebc1-476f-8492-237be848d4d5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd63d3bd-ebc1-476f-8492-237be848d4d5
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa51d31c-356f-44c9-b6a8-6af64a4b274c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa51d31c-356f-44c9-b6a8-6af64a4b274c
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa51d31c-356f-44c9-b6a8-6af64a4b274c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fa51d31c-356f-44c9-b6a8-6af64a4b274c"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-596498be-c294-43df-acc8-8bb583f81c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-596498be-c294-43df-acc8-8bb583f81c57
Content-Type: application/json

--- request body ---
{"handle":"qa-40f3369d9b74","password":"****"}

--- response: 429 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-596498be-c294-43df-acc8-8bb583f81c57
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-596498be-c294-43df-acc8-8bb583f81c57"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-6e15b623-93c9-42e3-ac8d-40b84fcda9bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e15b623-93c9-42e3-ac8d-40b84fcda9bb
Content-Type: application/json

--- request body ---
{"handle":"qa-218758259300","displayName":"QA 218758259300","password":"****","region":"eu"}

--- response: 429 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e15b623-93c9-42e3-ac8d-40b84fcda9bb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-6e15b623-93c9-42e3-ac8d-40b84fcda9bb"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad2ec4b7-4fb2-4916-914e-0aa1b7a21ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2ec4b7-4fb2-4916-914e-0aa1b7a21ec6
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad2ec4b7-4fb2-4916-914e-0aa1b7a21ec6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ad2ec4b7-4fb2-4916-914e-0aa1b7a21ec6"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-8998b0d8-c2df-4c84-b637-182634eded70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8998b0d8-c2df-4c84-b637-182634eded70
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8998b0d8-c2df-4c84-b637-182634eded70
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8998b0d8-c2df-4c84-b637-182634eded70"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c1bd1446-fb9a-435c-9337-62f3da5c6e0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1bd1446-fb9a-435c-9337-62f3da5c6e0e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c1bd1446-fb9a-435c-9337-62f3da5c6e0e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c1bd1446-fb9a-435c-9337-62f3da5c6e0e"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-40f3369d9b74
correlation: qa-5fa0b20b-7309-474c-932b-2d82b4c3ed63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fa0b20b-7309-474c-932b-2d82b4c3ed63
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fa0b20b-7309-474c-932b-2d82b4c3ed63
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-40f3369d9b74","correlationId":"qa-5fa0b20b-7309-474c-932b-2d82b4c3ed63"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-dbb72111-ff7f-4af8-a370-550868d2338c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbb72111-ff7f-4af8-a370-550868d2338c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-40f3369d9b74","subject":"Probe","message":"Hi"}

--- response: 429 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbb72111-ff7f-4af8-a370-550868d2338c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-dbb72111-ff7f-4af8-a370-550868d2338c"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-ec384ce3-8fa0-42a3-8e5c-cebd7a40d3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec384ce3-8fa0-42a3-8e5c-cebd7a40d3b4
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec384ce3-8fa0-42a3-8e5c-cebd7a40d3b4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-ec384ce3-8fa0-42a3-8e5c-cebd7a40d3b4"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26
correlation: qa-a38b820a-cef0-46bf-a33a-f518a75f5600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a38b820a-cef0-46bf-a33a-f518a75f5600
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a38b820a-cef0-46bf-a33a-f518a75f5600
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26","correlationId":"qa-a38b820a-cef0-46bf-a33a-f518a75f5600"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/messages
correlation: qa-27c050be-8867-474f-be9f-afef8ab79f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27c050be-8867-474f-be9f-afef8ab79f7f
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27c050be-8867-474f-be9f-afef8ab79f7f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/messages","correlationId":"qa-27c050be-8867-474f-be9f-afef8ab79f7f"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/messages
correlation: qa-47514695-b979-4d87-867b-d512ebd5c466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47514695-b979-4d87-867b-d512ebd5c466
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47514695-b979-4d87-867b-d512ebd5c466
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/messages","correlationId":"qa-47514695-b979-4d87-867b-d512ebd5c466"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/read
correlation: qa-d03dc76f-26f5-40b8-a662-6eb25672a74c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d03dc76f-26f5-40b8-a662-6eb25672a74c
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d03dc76f-26f5-40b8-a662-6eb25672a74c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/read","correlationId":"qa-d03dc76f-26f5-40b8-a662-6eb25672a74c"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/close
correlation: qa-75c11e56-7941-4c4e-bfb6-45bcc74cf54d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c11e56-7941-4c4e-bfb6-45bcc74cf54d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75c11e56-7941-4c4e-bfb6-45bcc74cf54d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_923f1a4b-1b11-4c28-a91c-bc2398780b26/close","correlationId":"qa-75c11e56-7941-4c4e-bfb6-45bcc74cf54d"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-07e38de9-9f49-4aab-a3cb-9d0f9702a3c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07e38de9-9f49-4aab-a3cb-9d0f9702a3c1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07e38de9-9f49-4aab-a3cb-9d0f9702a3c1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-07e38de9-9f49-4aab-a3cb-9d0f9702a3c1"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d2fb3b19-b3a8-4d7b-9d2e-ef54597e477d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2fb3b19-b3a8-4d7b-9d2e-ef54597e477d
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2fb3b19-b3a8-4d7b-9d2e-ef54597e477d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-d2fb3b19-b3a8-4d7b-9d2e-ef54597e477d"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6004d147-935f-4b93-8f21-6e799ac76843

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a7df53489b4147b086ec0306c751d792
X-Correlation-Id: qa-6004d147-935f-4b93-8f21-6e799ac76843
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6004d147-935f-4b93-8f21-6e799ac76843
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-6004d147-935f-4b93-8f21-6e799ac76843"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-a7c50df3-6590-4489-86f1-130500b7ff0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7c50df3-6590-4489-86f1-130500b7ff0c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7c50df3-6590-4489-86f1-130500b7ff0c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-a7c50df3-6590-4489-86f1-130500b7ff0c"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-19fdf95d-c199-44fe-924b-145e42baafc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19fdf95d-c199-44fe-924b-145e42baafc5
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19fdf95d-c199-44fe-924b-145e42baafc5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-19fdf95d-c199-44fe-924b-145e42baafc5"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-f24d7150-9a4a-438f-8476-941b698378ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f24d7150-9a4a-438f-8476-941b698378ee
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f24d7150-9a4a-438f-8476-941b698378ee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f24d7150-9a4a-438f-8476-941b698378ee"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-0884fb99-f635-4eaa-b52d-91410cc0d320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0884fb99-f635-4eaa-b52d-91410cc0d320
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0884fb99-f635-4eaa-b52d-91410cc0d320
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0884fb99-f635-4eaa-b52d-91410cc0d320"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-261a0c73-ef9e-4687-bf37-4f05f01f2f24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-261a0c73-ef9e-4687-bf37-4f05f01f2f24
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-261a0c73-ef9e-4687-bf37-4f05f01f2f24
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-261a0c73-ef9e-4687-bf37-4f05f01f2f24"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-479e0ab3-59f3-48d7-924a-37611904d80c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479e0ab3-59f3-48d7-924a-37611904d80c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-479e0ab3-59f3-48d7-924a-37611904d80c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-479e0ab3-59f3-48d7-924a-37611904d80c"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-cfba2d8d-3c45-4bfe-ae0c-268cb14bc302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfba2d8d-3c45-4bfe-ae0c-268cb14bc302
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfba2d8d-3c45-4bfe-ae0c-268cb14bc302
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cfba2d8d-3c45-4bfe-ae0c-268cb14bc302"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-17dd4fb7-791e-4e43-b7db-d9831c34da62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17dd4fb7-791e-4e43-b7db-d9831c34da62
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17dd4fb7-791e-4e43-b7db-d9831c34da62
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-17dd4fb7-791e-4e43-b7db-d9831c34da62"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd7433e7-5ae3-4eb5-acc2-cb43f0e7634e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd7433e7-5ae3-4eb5-acc2-cb43f0e7634e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd7433e7-5ae3-4eb5-acc2-cb43f0e7634e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bd7433e7-5ae3-4eb5-acc2-cb43f0e7634e"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-0de33d9b-aa1f-4335-83ac-05ea98247d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de33d9b-aa1f-4335-83ac-05ea98247d10
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0de33d9b-aa1f-4335-83ac-05ea98247d10
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0de33d9b-aa1f-4335-83ac-05ea98247d10"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff6e7c4c-2d70-4128-b1fc-b3de34d6ce7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6e7c4c-2d70-4128-b1fc-b3de34d6ce7e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff6e7c4c-2d70-4128-b1fc-b3de34d6ce7e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ff6e7c4c-2d70-4128-b1fc-b3de34d6ce7e"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-7248d6cc-e245-417d-ae5e-976fa81f5167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7248d6cc-e245-417d-ae5e-976fa81f5167
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7248d6cc-e245-417d-ae5e-976fa81f5167
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7248d6cc-e245-417d-ae5e-976fa81f5167"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-68019970-9352-438f-8d2f-0c1cace25af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68019970-9352-438f-8d2f-0c1cace25af7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68019970-9352-438f-8d2f-0c1cace25af7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-68019970-9352-438f-8d2f-0c1cace25af7"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-342ae9ef-d871-48a7-9e22-102c02f9428d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-342ae9ef-d871-48a7-9e22-102c02f9428d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-342ae9ef-d871-48a7-9e22-102c02f9428d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-342ae9ef-d871-48a7-9e22-102c02f9428d"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a890b99-693d-4ddc-9da8-a4298e6c8f21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a890b99-693d-4ddc-9da8-a4298e6c8f21
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a890b99-693d-4ddc-9da8-a4298e6c8f21
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9a890b99-693d-4ddc-9da8-a4298e6c8f21"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ab9331d-1039-495d-a7ef-4d866267d44c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ab9331d-1039-495d-a7ef-4d866267d44c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ab9331d-1039-495d-a7ef-4d866267d44c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8ab9331d-1039-495d-a7ef-4d866267d44c"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc890eb3-a910-4b51-96d0-301ffc48454f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc890eb3-a910-4b51-96d0-301ffc48454f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc890eb3-a910-4b51-96d0-301ffc48454f
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

{"id":"acc_0c54ef8d-49dc-4bcc-9175-ab0895bf9a8d","handle":"qa-40f3369d9b74","displayName":"QA 40f3369d9b74","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.876741639Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-88191434-7052-416a-947a-0f5cfa962240

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88191434-7052-416a-947a-0f5cfa962240
Content-Type: application/json

--- request body ---
{"handle":"qa-fdcd2516fc13","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-88191434-7052-416a-947a-0f5cfa962240
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8b4f169-ba8e-40ec-94bb-5ebe6b2d5718"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39cc5558-f989-469b-97dc-c40bc3c74928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39cc5558-f989-469b-97dc-c40bc3c74928
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39cc5558-f989-469b-97dc-c40bc3c74928
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

## 100. POST /v1/auth/token

```text
#100 POST http://localhost:7070/v1/auth/token
correlation: qa-f822515b-b878-4c90-ac15-48ed8c490ad4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f822515b-b878-4c90-ac15-48ed8c490ad4
Content-Type: application/json

--- request body ---
{"handle":"qa-fdcd2516fc13","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f822515b-b878-4c90-ac15-48ed8c490ad4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f822515b-b878-4c90-ac15-48ed8c490ad4"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-14e4b22b-5c85-4c98-87ca-db264279fd53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e4b22b-5c85-4c98-87ca-db264279fd53
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-14e4b22b-5c85-4c98-87ca-db264279fd53
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

## 102. POST /v1/auth/token

```text
#102 POST http://localhost:7070/v1/auth/token
correlation: qa-39e36b27-cf07-4c9f-a235-cac117f731ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39e36b27-cf07-4c9f-a235-cac117f731ce
Content-Type: application/json

--- request body ---
{"handle":"qa-40f3369d9b74","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39e36b27-cf07-4c9f-a235-cac117f731ce
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39e36b27-cf07-4c9f-a235-cac117f731ce"}
```
