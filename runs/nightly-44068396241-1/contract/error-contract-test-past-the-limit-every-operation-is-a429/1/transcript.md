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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-68dc8cb5-9fbc-4b93-9619-76aeeab79293` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-82ea2e4e-5083-4dcb-8d1f-33bd480c24fe` |
| 3 | `POST /v1/auth/token` | 200 | 67 | `qa-10ad60f6-cda2-4a9e-a46b-72da5acc339d` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-07317c7d-6f86-4f6c-890f-55c9ece42a35` |
| 5 | `GET /v1/accounts/me` | 200 | 24 | `qa-6271b227-e125-4c40-813b-0d974a3e58d2` |
| 6 | `GET /v1/accounts/me` | 200 | 17 | `qa-4f45b359-74b0-465a-8950-3b7e1cfb7e78` |
| 7 | `GET /v1/accounts/me` | 200 | 25 | `qa-d138de7d-c539-4197-8c61-1c38082882dc` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-e52fb5e7-1e82-4286-b220-753ff4aa40b3` |
| 9 | `GET /v1/accounts/me` | 200 | 14 | `qa-f91ac507-127c-432d-b81d-d55d811fab8e` |
| 10 | `GET /v1/accounts/me` | 200 | 20 | `qa-e5f5b71c-6148-4f86-90f3-bdff414ad0a4` |
| 11 | `GET /v1/accounts/me` | 200 | 12 | `qa-e7e62713-4e91-49eb-8444-817e2329af30` |
| 12 | `GET /v1/accounts/me` | 200 | 20 | `qa-71c1ae3c-d37d-4179-9fe4-845d702e23b3` |
| 13 | `GET /v1/accounts/me` | 200 | 31 | `qa-8e8c1d31-ee34-44cb-ae8b-decedc31a7f2` |
| 14 | `GET /v1/accounts/me` | 200 | 18 | `qa-fb6429b7-0850-4ebe-a70d-7d0c0162dc26` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-0f15f4d6-8764-4362-8971-b8850c93ef67` |
| 16 | `GET /v1/accounts/me` | 200 | 43 | `qa-d0c64e66-6626-4e26-aa12-81da8b286f42` |
| 17 | `GET /v1/accounts/me` | 200 | 22 | `qa-0d9fca6e-7ca6-49b5-9f6e-23e191b1be6d` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-91939c0d-f19a-4a31-a3ac-908051aee046` |
| 19 | `GET /v1/accounts/me` | 200 | 47 | `qa-d0013928-3d04-4b78-ba5e-573445d34000` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-f158d919-6c6c-4065-aa64-c2589d2238a1` |
| 21 | `GET /v1/accounts/me` | 200 | 27 | `qa-fa7e1b77-799e-4052-922a-12a0556de3a9` |
| 22 | `GET /v1/accounts/me` | 200 | 4 | `qa-8a0866ed-f93c-4fa4-9cd7-8e476033c752` |
| 23 | `GET /v1/accounts/me` | 200 | 15 | `qa-1254a34c-5a62-4ec9-a68e-592d170cc43e` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-509b4a25-d716-404d-a020-b5b4d3ff9b14` |
| 25 | `GET /v1/accounts/me` | 200 | 16 | `qa-bab095eb-9f51-4928-9a93-255d860e53d1` |
| 26 | `GET /v1/accounts/me` | 200 | 8 | `qa-8f3ee5cd-ea4a-43a7-ae7b-82607109ed42` |
| 27 | `GET /v1/accounts/me` | 200 | 4 | `qa-2075dd99-1447-4dd3-ae3c-34e0162374e8` |
| 28 | `GET /v1/accounts/me` | 200 | 6 | `qa-c0db4c35-633a-44e0-83d9-e78c20106228` |
| 29 | `GET /v1/accounts/me` | 200 | 10 | `qa-4efd1663-d19b-4d97-bf44-40794c247753` |
| 30 | `GET /v1/accounts/me` | 200 | 10 | `qa-95613915-9482-4626-98f1-f8b432544b22` |
| 31 | `GET /v1/accounts/me` | 200 | 10 | `qa-64b2c5dc-dd61-41d4-8448-13f4da9d5636` |
| 32 | `GET /v1/accounts/me` | 200 | 21 | `qa-0f7d32f3-710d-49fb-accc-492614ce2aeb` |
| 33 | `GET /v1/accounts/me` | 200 | 14 | `qa-8c421302-9cbd-4a73-8635-f08273a3ea0d` |
| 34 | `GET /v1/accounts/me` | 200 | 10 | `qa-aec73555-ccd4-47c0-9453-83d9f9bd147a` |
| 35 | `GET /v1/accounts/me` | 200 | 3 | `qa-3277d943-2280-484d-962d-6315f8b09af0` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-4db7011a-aa71-4189-916d-3a23caa83f72` |
| 37 | `GET /v1/accounts/me` | 200 | 7 | `qa-1e936809-4def-4888-851c-89d018e6aa61` |
| 38 | `GET /v1/accounts/me` | 200 | 25 | `qa-9dad5044-dd3d-48e8-b2c2-e6891eab93aa` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-ee348e0e-e99c-456c-b12d-cf31a729687a` |
| 40 | `GET /v1/accounts/me` | 200 | 15 | `qa-9c212744-00b9-4dcf-9645-c421fac35294` |
| 41 | `GET /v1/accounts/me` | 200 | 13 | `qa-ac0eb283-9549-4c77-b6de-c2ead99d822e` |
| 42 | `GET /v1/accounts/me` | 200 | 11 | `qa-34321ff2-cb4d-4a2d-bcff-053c3c360f3f` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-983797f3-8bb7-48ab-884c-d244da6854b4` |
| 44 | `GET /v1/accounts/me` | 200 | 3 | `qa-21b6955b-a3c6-4a8f-89a9-c32159d08395` |
| 45 | `GET /v1/accounts/me` | 200 | 8 | `qa-6c333fc6-28c5-4ad8-9618-ebf290c9934c` |
| 46 | `GET /v1/accounts/me` | 200 | 8 | `qa-f1b8ffe8-f438-4c09-9cc3-1dd37160054a` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-13bb8258-f919-409e-8e91-a9f9d1812073` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-52d1a5a8-05f5-4b45-b214-77b4a067efa0` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-0b57a9d3-f935-44de-a844-5b3a3da43097` |
| 50 | `GET /v1/accounts/me` | 200 | 2 | `qa-dbbafc4b-9027-43a4-a7f1-2674e8bbf1d8` |
| 51 | `GET /v1/accounts/me` | 200 | 9 | `qa-a02deb7e-8399-4b77-932a-cd99921e981f` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-52072817-a827-493c-bef5-d0da57da69f8` |
| 53 | `GET /v1/accounts/me` | 200 | 7 | `qa-c3fb16a8-e959-41a3-9a93-68fdbd43e9c3` |
| 54 | `GET /v1/accounts/me` | 200 | 8 | `qa-7e57bf07-37e5-4fcc-8e11-1901e27db80e` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-56fd383f-4a29-475c-8806-0e02851ebfa7` |
| 56 | `GET /v1/accounts/me` | 200 | 8 | `qa-d588bf02-bb35-45ed-bbcb-d734c689c516` |
| 57 | `GET /v1/accounts/me` | 200 | 3 | `qa-1a73e5c6-2c22-48bf-82f3-5b66e425ac78` |
| 58 | `GET /v1/accounts/me` | 200 | 14 | `qa-df42e17e-4773-43f6-a255-490622434020` |
| 59 | `GET /v1/accounts/me` | 200 | 13 | `qa-708e4e3f-79fe-4b45-9f3b-74509cf49b31` |
| 60 | `GET /v1/accounts/me` | 200 | 14 | `qa-02eebbd9-ce19-4496-ad9d-7fada1ad2600` |
| 61 | `GET /v1/accounts/me` | 200 | 9 | `qa-04b4764d-d28f-4a4d-b68c-8293ab0d06c8` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-b7889074-6266-41b6-af29-a1599b5273fb` |
| 63 | `GET /v1/accounts/me` | 200 | 13 | `qa-81f9d717-09e0-43d2-82ec-8bc98edc49be` |
| 64 | `GET /v1/accounts/me` | 429 | 19 | `qa-85785843-a1fd-47f0-976e-6447bdc93eef` |
| 65 | `POST /v1/auth/token` | 429 | 9 | `qa-63496b40-256f-4647-8973-d352c03141e4` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-2de38fdd-a692-41d5-9a89-c863063c71cf` |
| 67 | `GET /v1/accounts/me` | 429 | 2 | `qa-92ea7fcf-5163-4161-bc4a-09fb03cb85b7` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-5a8133b4-02e8-443b-b117-acaf418f4bf6` |
| 69 | `DELETE /v1/accounts/me` | 429 | 2 | `qa-df2f1d9c-5d86-4395-b7ce-ad310b1fd6a5` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 6 | `qa-096bed9a-57bc-4258-8894-dbfd0d09890f` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-92a9fd24-a9dd-4d65-87be-d4e490274a9b` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-b4961ea9-064e-497f-b543-45d1b550d657` |
| 73 | `GET /v1/conversations/{id}` | 429 | 2 | `qa-a92b1961-b304-4015-8735-41993c81fc2a` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 2 | `qa-0d3c1667-f229-4e80-bb5f-186c076de9b4` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 2 | `qa-314df952-5d19-4a2c-841e-a341a2e228ff` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 2 | `qa-faa89bcb-34bb-4592-addd-2ef9955567cc` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 2 | `qa-46b760a9-ab27-44bd-95e2-92684112d138` |
| 78 | `GET /v1/credits/balance` | 429 | 2 | `qa-9820fd8b-b9a5-47f8-8f91-d29b412a7382` |
| 79 | `GET /v1/credits/ledger` | 429 | 2 | `qa-5e2368d6-5115-4cdc-b6c3-4078a2995aa8` |
| 80 | `POST /v1/credits/purchases` | 429 | 1 | `qa-fd5ce327-5021-40ba-bcaa-05ab5c6b7667` |
| 81 | `GET /v1/admin/stats` | 429 | 1 | `qa-25f12aa5-c28e-401f-8cb3-0be521c21ea1` |
| 82 | `GET /v1/accounts/me` | 429 | 1 | `qa-46856de2-6bb5-4a65-8dd2-21c7bb6cca90` |
| 83 | `GET /v1/accounts/me` | 429 | 1 | `qa-5107d6cf-3fbc-4f33-8fa0-c76b13681fe1` |
| 84 | `GET /v1/accounts/me` | 429 | 2 | `qa-946e9368-429c-42f3-9f73-1af7c1c3be76` |
| 85 | `GET /v1/accounts/me` | 429 | 2 | `qa-fc24e587-ee68-4e4e-9abd-1fbd097646cf` |
| 86 | `GET /v1/accounts/me` | 429 | 2 | `qa-e3e9ab15-8f8d-4fbc-a12d-917f57b8927c` |
| 87 | `GET /v1/accounts/me` | 429 | 2 | `qa-b422af59-fdae-4d4b-87a4-762ab4ccd103` |
| 88 | `GET /v1/accounts/me` | 429 | 2 | `qa-95d8a9b2-fbbf-4a59-b3dc-4a4971833884` |
| 89 | `GET /v1/accounts/me` | 429 | 2 | `qa-f0ec8652-9e6e-4e76-9fff-269e92d1681c` |
| 90 | `GET /v1/accounts/me` | 429 | 2 | `qa-da167724-fbf4-4703-ae9b-000def242382` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-3afe3462-ae79-4bbc-b029-1eb84baa9a88` |
| 92 | `GET /v1/accounts/me` | 429 | 2 | `qa-14dd8980-7c04-4c05-9325-4745a13d0e1d` |
| 93 | `GET /v1/accounts/me` | 429 | 2 | `qa-ef406b30-54bf-417a-9076-08f90328a68b` |
| 94 | `GET /v1/accounts/me` | 429 | 2 | `qa-ac09982e-03f5-4cee-809b-eda778c27d33` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-288dfcb9-fe3a-40cd-bd98-fa5b64e0e704` |
| 96 | `GET /v1/accounts/me` | 429 | 3 | `qa-3d359152-dcf3-4df1-ae89-797df1063ab1` |
| 97 | `GET /v1/accounts/me` | 429 | 2 | `qa-c2c1a2cb-3268-4200-b188-493759df825a` |
| 98 | `GET /v1/accounts/me` | 200 | 3 | `qa-ed56f201-37c2-49eb-a497-fce137eb51e5` |
| 99 | `POST /v1/auth/token` | 200 | 5 | `qa-32f655e4-7a63-4c78-87d7-3abae850b18a` |
| 100 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-15481f22-99c4-48cf-aa87-7c3206fcf739` |
| 101 | `POST /v1/auth/token` | 401 | 3 | `qa-b67912bc-0351-485e-8447-6fe2174295a2` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-dc2ce810-7f34-4d3a-8443-b150edda705f` |
| 103 | `POST /v1/auth/token` | 401 | 2 | `qa-565bc03f-d85e-44c2-9392-65eaf355c91b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68dc8cb5-9fbc-4b93-9619-76aeeab79293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68dc8cb5-9fbc-4b93-9619-76aeeab79293
Content-Type: application/json

--- request body ---
{"handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-68dc8cb5-9fbc-4b93-9619-76aeeab79293
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
Location: /v1/accounts/qa-94cbe48fc3d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-82ea2e4e-5083-4dcb-8d1f-33bd480c24fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ea2e4e-5083-4dcb-8d1f-33bd480c24fe
Content-Type: application/json

--- request body ---
{"handle":"qa-6c29d7a8c389","displayName":"QA 6c29d7a8c389","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-82ea2e4e-5083-4dcb-8d1f-33bd480c24fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Location: /v1/accounts/qa-6c29d7a8c389
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8ed4fe8d-d5f0-4831-add4-b260651851cc","handle":"qa-6c29d7a8c389","displayName":"QA 6c29d7a8c389","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.114534568Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-10ad60f6-cda2-4a9e-a46b-72da5acc339d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ad60f6-cda2-4a9e-a46b-72da5acc339d
Content-Type: application/json

--- request body ---
{"handle":"qa-94cbe48fc3d1","password":"****"}

--- response: 200 in 67 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ad60f6-cda2-4a9e-a46b-72da5acc339d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-07317c7d-6f86-4f6c-890f-55c9ece42a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07317c7d-6f86-4f6c-890f-55c9ece42a35
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6c29d7a8c389","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-07317c7d-6f86-4f6c-890f-55c9ece42a35
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
Location: /v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f406b325-0dd0-4c02-8bef-e1c183603a24","subject":"Error contract","status":"open","region":"eu","participants":["qa-94cbe48fc3d1","qa-6c29d7a8c389"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.232823687Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6271b227-e125-4c40-813b-0d974a3e58d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6271b227-e125-4c40-813b-0d974a3e58d2
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6271b227-e125-4c40-813b-0d974a3e58d2
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f45b359-74b0-465a-8950-3b7e1cfb7e78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f45b359-74b0-465a-8950-3b7e1cfb7e78
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f45b359-74b0-465a-8950-3b7e1cfb7e78
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-d138de7d-c539-4197-8c61-1c38082882dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d138de7d-c539-4197-8c61-1c38082882dc
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d138de7d-c539-4197-8c61-1c38082882dc
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-e52fb5e7-1e82-4286-b220-753ff4aa40b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e52fb5e7-1e82-4286-b220-753ff4aa40b3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e52fb5e7-1e82-4286-b220-753ff4aa40b3
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-f91ac507-127c-432d-b81d-d55d811fab8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f91ac507-127c-432d-b81d-d55d811fab8e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-f91ac507-127c-432d-b81d-d55d811fab8e
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5f5b71c-6148-4f86-90f3-bdff414ad0a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f5b71c-6148-4f86-90f3-bdff414ad0a4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5f5b71c-6148-4f86-90f3-bdff414ad0a4
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7e62713-4e91-49eb-8444-817e2329af30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7e62713-4e91-49eb-8444-817e2329af30
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7e62713-4e91-49eb-8444-817e2329af30
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-71c1ae3c-d37d-4179-9fe4-845d702e23b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71c1ae3c-d37d-4179-9fe4-845d702e23b3
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-71c1ae3c-d37d-4179-9fe4-845d702e23b3
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e8c1d31-ee34-44cb-ae8b-decedc31a7f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e8c1d31-ee34-44cb-ae8b-decedc31a7f2
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e8c1d31-ee34-44cb-ae8b-decedc31a7f2
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb6429b7-0850-4ebe-a70d-7d0c0162dc26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb6429b7-0850-4ebe-a70d-7d0c0162dc26
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb6429b7-0850-4ebe-a70d-7d0c0162dc26
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f15f4d6-8764-4362-8971-b8850c93ef67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f15f4d6-8764-4362-8971-b8850c93ef67
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f15f4d6-8764-4362-8971-b8850c93ef67
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0c64e66-6626-4e26-aa12-81da8b286f42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c64e66-6626-4e26-aa12-81da8b286f42
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0c64e66-6626-4e26-aa12-81da8b286f42
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d9fca6e-7ca6-49b5-9f6e-23e191b1be6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9fca6e-7ca6-49b5-9f6e-23e191b1be6d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d9fca6e-7ca6-49b5-9f6e-23e191b1be6d
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-91939c0d-f19a-4a31-a3ac-908051aee046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91939c0d-f19a-4a31-a3ac-908051aee046
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-91939c0d-f19a-4a31-a3ac-908051aee046
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0013928-3d04-4b78-ba5e-573445d34000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0013928-3d04-4b78-ba5e-573445d34000
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0013928-3d04-4b78-ba5e-573445d34000
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-f158d919-6c6c-4065-aa64-c2589d2238a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f158d919-6c6c-4065-aa64-c2589d2238a1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-f158d919-6c6c-4065-aa64-c2589d2238a1
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa7e1b77-799e-4052-922a-12a0556de3a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa7e1b77-799e-4052-922a-12a0556de3a9
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa7e1b77-799e-4052-922a-12a0556de3a9
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a0866ed-f93c-4fa4-9cd7-8e476033c752

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a0866ed-f93c-4fa4-9cd7-8e476033c752
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a0866ed-f93c-4fa4-9cd7-8e476033c752
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-1254a34c-5a62-4ec9-a68e-592d170cc43e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1254a34c-5a62-4ec9-a68e-592d170cc43e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-1254a34c-5a62-4ec9-a68e-592d170cc43e
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-509b4a25-d716-404d-a020-b5b4d3ff9b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-509b4a25-d716-404d-a020-b5b4d3ff9b14
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-509b4a25-d716-404d-a020-b5b4d3ff9b14
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-bab095eb-9f51-4928-9a93-255d860e53d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bab095eb-9f51-4928-9a93-255d860e53d1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-bab095eb-9f51-4928-9a93-255d860e53d1
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f3ee5cd-ea4a-43a7-ae7b-82607109ed42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3ee5cd-ea4a-43a7-ae7b-82607109ed42
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f3ee5cd-ea4a-43a7-ae7b-82607109ed42
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-2075dd99-1447-4dd3-ae3c-34e0162374e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2075dd99-1447-4dd3-ae3c-34e0162374e8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2075dd99-1447-4dd3-ae3c-34e0162374e8
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0db4c35-633a-44e0-83d9-e78c20106228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0db4c35-633a-44e0-83d9-e78c20106228
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0db4c35-633a-44e0-83d9-e78c20106228
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-4efd1663-d19b-4d97-bf44-40794c247753

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4efd1663-d19b-4d97-bf44-40794c247753
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4efd1663-d19b-4d97-bf44-40794c247753
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-95613915-9482-4626-98f1-f8b432544b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95613915-9482-4626-98f1-f8b432544b22
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-95613915-9482-4626-98f1-f8b432544b22
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-64b2c5dc-dd61-41d4-8448-13f4da9d5636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b2c5dc-dd61-41d4-8448-13f4da9d5636
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b2c5dc-dd61-41d4-8448-13f4da9d5636
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f7d32f3-710d-49fb-accc-492614ce2aeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f7d32f3-710d-49fb-accc-492614ce2aeb
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f7d32f3-710d-49fb-accc-492614ce2aeb
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c421302-9cbd-4a73-8635-f08273a3ea0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c421302-9cbd-4a73-8635-f08273a3ea0d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c421302-9cbd-4a73-8635-f08273a3ea0d
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-aec73555-ccd4-47c0-9453-83d9f9bd147a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aec73555-ccd4-47c0-9453-83d9f9bd147a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-aec73555-ccd4-47c0-9453-83d9f9bd147a
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-3277d943-2280-484d-962d-6315f8b09af0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3277d943-2280-484d-962d-6315f8b09af0
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-3277d943-2280-484d-962d-6315f8b09af0
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-4db7011a-aa71-4189-916d-3a23caa83f72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4db7011a-aa71-4189-916d-3a23caa83f72
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-4db7011a-aa71-4189-916d-3a23caa83f72
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e936809-4def-4888-851c-89d018e6aa61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e936809-4def-4888-851c-89d018e6aa61
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e936809-4def-4888-851c-89d018e6aa61
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-9dad5044-dd3d-48e8-b2c2-e6891eab93aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dad5044-dd3d-48e8-b2c2-e6891eab93aa
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dad5044-dd3d-48e8-b2c2-e6891eab93aa
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee348e0e-e99c-456c-b12d-cf31a729687a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee348e0e-e99c-456c-b12d-cf31a729687a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee348e0e-e99c-456c-b12d-cf31a729687a
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c212744-00b9-4dcf-9645-c421fac35294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c212744-00b9-4dcf-9645-c421fac35294
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c212744-00b9-4dcf-9645-c421fac35294
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac0eb283-9549-4c77-b6de-c2ead99d822e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0eb283-9549-4c77-b6de-c2ead99d822e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac0eb283-9549-4c77-b6de-c2ead99d822e
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-34321ff2-cb4d-4a2d-bcff-053c3c360f3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34321ff2-cb4d-4a2d-bcff-053c3c360f3f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-34321ff2-cb4d-4a2d-bcff-053c3c360f3f
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-983797f3-8bb7-48ab-884c-d244da6854b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-983797f3-8bb7-48ab-884c-d244da6854b4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-983797f3-8bb7-48ab-884c-d244da6854b4
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-21b6955b-a3c6-4a8f-89a9-c32159d08395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21b6955b-a3c6-4a8f-89a9-c32159d08395
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-21b6955b-a3c6-4a8f-89a9-c32159d08395
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c333fc6-28c5-4ad8-9618-ebf290c9934c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c333fc6-28c5-4ad8-9618-ebf290c9934c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c333fc6-28c5-4ad8-9618-ebf290c9934c
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1b8ffe8-f438-4c09-9cc3-1dd37160054a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b8ffe8-f438-4c09-9cc3-1dd37160054a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b8ffe8-f438-4c09-9cc3-1dd37160054a
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-13bb8258-f919-409e-8e91-a9f9d1812073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13bb8258-f919-409e-8e91-a9f9d1812073
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-13bb8258-f919-409e-8e91-a9f9d1812073
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-52d1a5a8-05f5-4b45-b214-77b4a067efa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52d1a5a8-05f5-4b45-b214-77b4a067efa0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-52d1a5a8-05f5-4b45-b214-77b4a067efa0
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b57a9d3-f935-44de-a844-5b3a3da43097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b57a9d3-f935-44de-a844-5b3a3da43097
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b57a9d3-f935-44de-a844-5b3a3da43097
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-dbbafc4b-9027-43a4-a7f1-2674e8bbf1d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbbafc4b-9027-43a4-a7f1-2674e8bbf1d8
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbbafc4b-9027-43a4-a7f1-2674e8bbf1d8
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a02deb7e-8399-4b77-932a-cd99921e981f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a02deb7e-8399-4b77-932a-cd99921e981f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a02deb7e-8399-4b77-932a-cd99921e981f
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-52072817-a827-493c-bef5-d0da57da69f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52072817-a827-493c-bef5-d0da57da69f8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-52072817-a827-493c-bef5-d0da57da69f8
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3fb16a8-e959-41a3-9a93-68fdbd43e9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3fb16a8-e959-41a3-9a93-68fdbd43e9c3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3fb16a8-e959-41a3-9a93-68fdbd43e9c3
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e57bf07-37e5-4fcc-8e11-1901e27db80e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e57bf07-37e5-4fcc-8e11-1901e27db80e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e57bf07-37e5-4fcc-8e11-1901e27db80e
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-56fd383f-4a29-475c-8806-0e02851ebfa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56fd383f-4a29-475c-8806-0e02851ebfa7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-56fd383f-4a29-475c-8806-0e02851ebfa7
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-d588bf02-bb35-45ed-bbcb-d734c689c516

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d588bf02-bb35-45ed-bbcb-d734c689c516
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d588bf02-bb35-45ed-bbcb-d734c689c516
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a73e5c6-2c22-48bf-82f3-5b66e425ac78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a73e5c6-2c22-48bf-82f3-5b66e425ac78
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a73e5c6-2c22-48bf-82f3-5b66e425ac78
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-df42e17e-4773-43f6-a255-490622434020

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df42e17e-4773-43f6-a255-490622434020
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-df42e17e-4773-43f6-a255-490622434020
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-708e4e3f-79fe-4b45-9f3b-74509cf49b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-708e4e3f-79fe-4b45-9f3b-74509cf49b31
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-708e4e3f-79fe-4b45-9f3b-74509cf49b31
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-02eebbd9-ce19-4496-ad9d-7fada1ad2600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02eebbd9-ce19-4496-ad9d-7fada1ad2600
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-02eebbd9-ce19-4496-ad9d-7fada1ad2600
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-04b4764d-d28f-4a4d-b68c-8293ab0d06c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b4764d-d28f-4a4d-b68c-8293ab0d06c8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-04b4764d-d28f-4a4d-b68c-8293ab0d06c8
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7889074-6266-41b6-af29-a1599b5273fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7889074-6266-41b6-af29-a1599b5273fb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7889074-6266-41b6-af29-a1599b5273fb
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-81f9d717-09e0-43d2-82ec-8bc98edc49be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81f9d717-09e0-43d2-82ec-8bc98edc49be
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-81f9d717-09e0-43d2-82ec-8bc98edc49be
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-85785843-a1fd-47f0-976e-6447bdc93eef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85785843-a1fd-47f0-976e-6447bdc93eef
Content-Type: application/json

--- response: 429 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85785843-a1fd-47f0-976e-6447bdc93eef
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-85785843-a1fd-47f0-976e-6447bdc93eef"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-63496b40-256f-4647-8973-d352c03141e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63496b40-256f-4647-8973-d352c03141e4
Content-Type: application/json

--- request body ---
{"handle":"qa-94cbe48fc3d1","password":"****"}

--- response: 429 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63496b40-256f-4647-8973-d352c03141e4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-63496b40-256f-4647-8973-d352c03141e4"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-2de38fdd-a692-41d5-9a89-c863063c71cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2de38fdd-a692-41d5-9a89-c863063c71cf
Content-Type: application/json

--- request body ---
{"handle":"qa-a63ddff044c9","displayName":"QA a63ddff044c9","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2de38fdd-a692-41d5-9a89-c863063c71cf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-2de38fdd-a692-41d5-9a89-c863063c71cf"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-92ea7fcf-5163-4161-bc4a-09fb03cb85b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ea7fcf-5163-4161-bc4a-09fb03cb85b7
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92ea7fcf-5163-4161-bc4a-09fb03cb85b7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-92ea7fcf-5163-4161-bc4a-09fb03cb85b7"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-5a8133b4-02e8-443b-b117-acaf418f4bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a8133b4-02e8-443b-b117-acaf418f4bf6
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a8133b4-02e8-443b-b117-acaf418f4bf6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5a8133b4-02e8-443b-b117-acaf418f4bf6"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df2f1d9c-5d86-4395-b7ce-ad310b1fd6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df2f1d9c-5d86-4395-b7ce-ad310b1fd6a5
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df2f1d9c-5d86-4395-b7ce-ad310b1fd6a5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-df2f1d9c-5d86-4395-b7ce-ad310b1fd6a5"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-94cbe48fc3d1
correlation: qa-096bed9a-57bc-4258-8894-dbfd0d09890f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096bed9a-57bc-4258-8894-dbfd0d09890f
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-096bed9a-57bc-4258-8894-dbfd0d09890f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-94cbe48fc3d1","correlationId":"qa-096bed9a-57bc-4258-8894-dbfd0d09890f"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-92a9fd24-a9dd-4d65-87be-d4e490274a9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a9fd24-a9dd-4d65-87be-d4e490274a9b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94cbe48fc3d1","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92a9fd24-a9dd-4d65-87be-d4e490274a9b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-92a9fd24-a9dd-4d65-87be-d4e490274a9b"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-b4961ea9-064e-497f-b543-45d1b550d657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4961ea9-064e-497f-b543-45d1b550d657
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4961ea9-064e-497f-b543-45d1b550d657
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-b4961ea9-064e-497f-b543-45d1b550d657"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24
correlation: qa-a92b1961-b304-4015-8735-41993c81fc2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a92b1961-b304-4015-8735-41993c81fc2a
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a92b1961-b304-4015-8735-41993c81fc2a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24","correlationId":"qa-a92b1961-b304-4015-8735-41993c81fc2a"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/messages
correlation: qa-0d3c1667-f229-4e80-bb5f-186c076de9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d3c1667-f229-4e80-bb5f-186c076de9b4
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d3c1667-f229-4e80-bb5f-186c076de9b4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/messages","correlationId":"qa-0d3c1667-f229-4e80-bb5f-186c076de9b4"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/messages
correlation: qa-314df952-5d19-4a2c-841e-a341a2e228ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-314df952-5d19-4a2c-841e-a341a2e228ff
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-314df952-5d19-4a2c-841e-a341a2e228ff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/messages","correlationId":"qa-314df952-5d19-4a2c-841e-a341a2e228ff"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/read
correlation: qa-faa89bcb-34bb-4592-addd-2ef9955567cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faa89bcb-34bb-4592-addd-2ef9955567cc
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faa89bcb-34bb-4592-addd-2ef9955567cc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/read","correlationId":"qa-faa89bcb-34bb-4592-addd-2ef9955567cc"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/close
correlation: qa-46b760a9-ab27-44bd-95e2-92684112d138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b760a9-ab27-44bd-95e2-92684112d138
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46b760a9-ab27-44bd-95e2-92684112d138
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_f406b325-0dd0-4c02-8bef-e1c183603a24/close","correlationId":"qa-46b760a9-ab27-44bd-95e2-92684112d138"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-9820fd8b-b9a5-47f8-8f91-d29b412a7382

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9820fd8b-b9a5-47f8-8f91-d29b412a7382
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9820fd8b-b9a5-47f8-8f91-d29b412a7382
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-9820fd8b-b9a5-47f8-8f91-d29b412a7382"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-5e2368d6-5115-4cdc-b6c3-4078a2995aa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2368d6-5115-4cdc-b6c3-4078a2995aa8
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e2368d6-5115-4cdc-b6c3-4078a2995aa8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-5e2368d6-5115-4cdc-b6c3-4078a2995aa8"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fd5ce327-5021-40ba-bcaa-05ab5c6b7667

--- request headers ---
Accept: application/json
Idempotency-Key: qa-7fe600125a72486aa0e0b02bdec661a0
X-Correlation-Id: qa-fd5ce327-5021-40ba-bcaa-05ab5c6b7667
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 1 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd5ce327-5021-40ba-bcaa-05ab5c6b7667
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-fd5ce327-5021-40ba-bcaa-05ab5c6b7667"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-25f12aa5-c28e-401f-8cb3-0be521c21ea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f12aa5-c28e-401f-8cb3-0be521c21ea1
Content-Type: application/json

--- response: 429 in 1 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25f12aa5-c28e-401f-8cb3-0be521c21ea1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-25f12aa5-c28e-401f-8cb3-0be521c21ea1"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-46856de2-6bb5-4a65-8dd2-21c7bb6cca90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46856de2-6bb5-4a65-8dd2-21c7bb6cca90
Content-Type: application/json

--- response: 429 in 1 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46856de2-6bb5-4a65-8dd2-21c7bb6cca90
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-46856de2-6bb5-4a65-8dd2-21c7bb6cca90"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-5107d6cf-3fbc-4f33-8fa0-c76b13681fe1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5107d6cf-3fbc-4f33-8fa0-c76b13681fe1
Content-Type: application/json

--- response: 429 in 1 ms ---
Date: Tue, 17 Nov 2026 10:50:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5107d6cf-3fbc-4f33-8fa0-c76b13681fe1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5107d6cf-3fbc-4f33-8fa0-c76b13681fe1"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-946e9368-429c-42f3-9f73-1af7c1c3be76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-946e9368-429c-42f3-9f73-1af7c1c3be76
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-946e9368-429c-42f3-9f73-1af7c1c3be76
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-946e9368-429c-42f3-9f73-1af7c1c3be76"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc24e587-ee68-4e4e-9abd-1fbd097646cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc24e587-ee68-4e4e-9abd-1fbd097646cf
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc24e587-ee68-4e4e-9abd-1fbd097646cf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc24e587-ee68-4e4e-9abd-1fbd097646cf"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3e9ab15-8f8d-4fbc-a12d-917f57b8927c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e9ab15-8f8d-4fbc-a12d-917f57b8927c
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3e9ab15-8f8d-4fbc-a12d-917f57b8927c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e3e9ab15-8f8d-4fbc-a12d-917f57b8927c"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-b422af59-fdae-4d4b-87a4-762ab4ccd103

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b422af59-fdae-4d4b-87a4-762ab4ccd103
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b422af59-fdae-4d4b-87a4-762ab4ccd103
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b422af59-fdae-4d4b-87a4-762ab4ccd103"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-95d8a9b2-fbbf-4a59-b3dc-4a4971833884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d8a9b2-fbbf-4a59-b3dc-4a4971833884
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95d8a9b2-fbbf-4a59-b3dc-4a4971833884
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-95d8a9b2-fbbf-4a59-b3dc-4a4971833884"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0ec8652-9e6e-4e76-9fff-269e92d1681c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ec8652-9e6e-4e76-9fff-269e92d1681c
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0ec8652-9e6e-4e76-9fff-269e92d1681c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f0ec8652-9e6e-4e76-9fff-269e92d1681c"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-da167724-fbf4-4703-ae9b-000def242382

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da167724-fbf4-4703-ae9b-000def242382
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da167724-fbf4-4703-ae9b-000def242382
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-da167724-fbf4-4703-ae9b-000def242382"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-3afe3462-ae79-4bbc-b029-1eb84baa9a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3afe3462-ae79-4bbc-b029-1eb84baa9a88
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3afe3462-ae79-4bbc-b029-1eb84baa9a88
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3afe3462-ae79-4bbc-b029-1eb84baa9a88"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-14dd8980-7c04-4c05-9325-4745a13d0e1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14dd8980-7c04-4c05-9325-4745a13d0e1d
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14dd8980-7c04-4c05-9325-4745a13d0e1d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-14dd8980-7c04-4c05-9325-4745a13d0e1d"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef406b30-54bf-417a-9076-08f90328a68b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef406b30-54bf-417a-9076-08f90328a68b
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef406b30-54bf-417a-9076-08f90328a68b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ef406b30-54bf-417a-9076-08f90328a68b"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac09982e-03f5-4cee-809b-eda778c27d33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac09982e-03f5-4cee-809b-eda778c27d33
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac09982e-03f5-4cee-809b-eda778c27d33
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ac09982e-03f5-4cee-809b-eda778c27d33"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-288dfcb9-fe3a-40cd-bd98-fa5b64e0e704

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-288dfcb9-fe3a-40cd-bd98-fa5b64e0e704
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-288dfcb9-fe3a-40cd-bd98-fa5b64e0e704
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-288dfcb9-fe3a-40cd-bd98-fa5b64e0e704"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d359152-dcf3-4df1-ae89-797df1063ab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d359152-dcf3-4df1-ae89-797df1063ab1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d359152-dcf3-4df1-ae89-797df1063ab1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3d359152-dcf3-4df1-ae89-797df1063ab1"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2c1a2cb-3268-4200-b188-493759df825a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c1a2cb-3268-4200-b188-493759df825a
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2c1a2cb-3268-4200-b188-493759df825a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c2c1a2cb-3268-4200-b188-493759df825a"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed56f201-37c2-49eb-a497-fce137eb51e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed56f201-37c2-49eb-a497-fce137eb51e5
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed56f201-37c2-49eb-a497-fce137eb51e5
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

{"id":"acc_585ced43-0ff2-4309-a9a3-87b9e2aef05c","handle":"qa-94cbe48fc3d1","displayName":"QA 94cbe48fc3d1","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.089346888Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-32f655e4-7a63-4c78-87d7-3abae850b18a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f655e4-7a63-4c78-87d7-3abae850b18a
Content-Type: application/json

--- request body ---
{"handle":"qa-6c29d7a8c389","password":"****"}

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-32f655e4-7a63-4c78-87d7-3abae850b18a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8ed4fe8d-d5f0-4831-add4-b260651851cc"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15481f22-99c4-48cf-aa87-7c3206fcf739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15481f22-99c4-48cf-aa87-7c3206fcf739
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15481f22-99c4-48cf-aa87-7c3206fcf739
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
correlation: qa-b67912bc-0351-485e-8447-6fe2174295a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b67912bc-0351-485e-8447-6fe2174295a2
Content-Type: application/json

--- request body ---
{"handle":"qa-6c29d7a8c389","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b67912bc-0351-485e-8447-6fe2174295a2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b67912bc-0351-485e-8447-6fe2174295a2"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc2ce810-7f34-4d3a-8443-b150edda705f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc2ce810-7f34-4d3a-8443-b150edda705f
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc2ce810-7f34-4d3a-8443-b150edda705f
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
correlation: qa-565bc03f-d85e-44c2-9392-65eaf355c91b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-565bc03f-d85e-44c2-9392-65eaf355c91b
Content-Type: application/json

--- request body ---
{"handle":"qa-94cbe48fc3d1","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-565bc03f-d85e-44c2-9392-65eaf355c91b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-565bc03f-d85e-44c2-9392-65eaf355c91b"}
```
