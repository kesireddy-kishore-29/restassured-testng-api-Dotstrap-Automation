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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-8adc9480-b27f-4726-a2be-a42021186d51` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-2cd42277-d26e-4b2b-9127-b55f6c2a83c1` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-0768c8dd-ea09-421b-a294-366fd398f302` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-56bcabe5-88df-4d78-aab0-ca84d89f91e6` |
| 5 | `GET /v1/accounts/me` | 200 | 23 | `qa-13b73629-db76-497f-96b0-140867abe631` |
| 6 | `GET /v1/accounts/me` | 200 | 24 | `qa-f023b5a6-9184-431a-a63b-9e8a413bc118` |
| 7 | `GET /v1/accounts/me` | 200 | 27 | `qa-d47bd49a-21a0-4b4c-b5f2-3e9e814bb42b` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-1e9322fc-5b9f-4a5c-9ef7-f31086cd6d4d` |
| 9 | `GET /v1/accounts/me` | 200 | 30 | `qa-96f71771-7984-4f98-8fe7-2fc41fc76d72` |
| 10 | `GET /v1/accounts/me` | 200 | 16 | `qa-0ec41f6e-bc64-4ad3-853b-a029bddd84eb` |
| 11 | `GET /v1/accounts/me` | 200 | 10 | `qa-50c9cbc0-567d-4e7e-99f2-0ebd0e55246e` |
| 12 | `GET /v1/accounts/me` | 200 | 20 | `qa-cd95712d-50c7-436f-a0c1-e9dec09ffee4` |
| 13 | `GET /v1/accounts/me` | 200 | 15 | `qa-d1f38f3a-65d5-4df3-a528-b34461adbaa6` |
| 14 | `GET /v1/accounts/me` | 200 | 6 | `qa-1c1e2cdd-f520-4491-80c6-73e973fe7c2f` |
| 15 | `GET /v1/accounts/me` | 200 | 18 | `qa-e8f6cd8e-d479-444a-96cd-d3b7e065701e` |
| 16 | `GET /v1/accounts/me` | 200 | 18 | `qa-81ecb973-f927-4d57-848b-083203c75049` |
| 17 | `GET /v1/accounts/me` | 200 | 15 | `qa-b847bc89-d351-4af1-9c2a-31b9c9333ee7` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-b0a943f0-fee1-484b-adce-ced7c28daaf9` |
| 19 | `GET /v1/accounts/me` | 200 | 50 | `qa-57c49519-30d8-402a-85dd-4b7cff7e00a5` |
| 20 | `GET /v1/accounts/me` | 200 | 16 | `qa-c3b67e02-162b-4817-ad8a-1f8a414b5403` |
| 21 | `GET /v1/accounts/me` | 200 | 12 | `qa-0b62a187-579c-43b4-8a28-4ed71562fbb7` |
| 22 | `GET /v1/accounts/me` | 200 | 21 | `qa-af1001c4-33fe-4241-a2b2-9f26e2e97e3d` |
| 23 | `GET /v1/accounts/me` | 200 | 26 | `qa-512ae525-3da4-4b2f-abec-353b00357ad5` |
| 24 | `GET /v1/accounts/me` | 200 | 26 | `qa-00ff2b3d-0d46-4459-8e76-3ef826f4ec12` |
| 25 | `GET /v1/accounts/me` | 200 | 15 | `qa-491a302f-88ac-45fa-b7ed-ceed33435845` |
| 26 | `GET /v1/accounts/me` | 200 | 24 | `qa-085ef74e-c2a7-4408-9607-9de7d4bfa18f` |
| 27 | `GET /v1/accounts/me` | 200 | 36 | `qa-31694545-15e7-47e5-bd04-f3798d0bafb8` |
| 28 | `GET /v1/accounts/me` | 200 | 26 | `qa-70e86126-3f28-4803-bf0c-096b12f1a05b` |
| 29 | `GET /v1/accounts/me` | 200 | 16 | `qa-96d922be-4722-40c1-8159-5147b63343cf` |
| 30 | `GET /v1/accounts/me` | 200 | 30 | `qa-b4392228-b0a9-46bb-a067-5e90f9f95da5` |
| 31 | `GET /v1/accounts/me` | 200 | 11 | `qa-e2354d30-3e59-482b-b3ec-dc20ae30182f` |
| 32 | `GET /v1/accounts/me` | 200 | 13 | `qa-60615ad8-4f2f-4b9f-9a38-2aa35c2a629b` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-ddc89caf-7d4b-46fe-9316-fcb6faf708ea` |
| 34 | `GET /v1/accounts/me` | 200 | 17 | `qa-071ab0c0-b0ea-43ff-923c-ba67feaa5730` |
| 35 | `GET /v1/accounts/me` | 200 | 23 | `qa-8090b439-d9a9-4b1d-a451-526bc883afeb` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-f9df4620-e40f-4a0b-b065-701115c1ff7c` |
| 37 | `GET /v1/accounts/me` | 200 | 24 | `qa-521417f9-4446-40c0-b3d0-d18807bdcd9c` |
| 38 | `GET /v1/accounts/me` | 200 | 11 | `qa-bae95a26-b423-4177-806f-d872c90b30b7` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-5170a619-8083-438d-a377-fdf80c3a7325` |
| 40 | `GET /v1/accounts/me` | 200 | 4 | `qa-c468384d-186c-4376-b09c-f69ef86e66e3` |
| 41 | `GET /v1/accounts/me` | 200 | 12 | `qa-9ee029e5-80ce-4d1d-b16f-d81c0c230eed` |
| 42 | `GET /v1/accounts/me` | 200 | 25 | `qa-1061ac57-10ec-4042-a634-7a76acadb5cc` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-dfdc6e55-d8bb-406e-bf75-b66407f38975` |
| 44 | `GET /v1/accounts/me` | 200 | 24 | `qa-f31eb0c0-2cd8-4503-a4d3-418dd9461a11` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-77ab5237-a4be-4989-97e4-43371d6493f6` |
| 46 | `GET /v1/accounts/me` | 200 | 21 | `qa-0ca79b07-7535-478e-9752-b08234d2f1d4` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-cbee8f74-c1ea-4b55-b489-93179ee2f87c` |
| 48 | `GET /v1/accounts/me` | 200 | 15 | `qa-4711cda7-fb89-42f8-8043-1be1c7f2772f` |
| 49 | `GET /v1/accounts/me` | 200 | 27 | `qa-57576ab5-a9f9-46cd-a187-7c86da9611fd` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-7922efe2-e630-4d55-b1a0-581db81ffbe9` |
| 51 | `GET /v1/accounts/me` | 200 | 12 | `qa-09a750b8-2017-4b21-9393-349fa68bf84a` |
| 52 | `GET /v1/accounts/me` | 200 | 16 | `qa-17af5011-1592-4ee6-be5f-52c11833de31` |
| 53 | `GET /v1/accounts/me` | 200 | 45 | `qa-08065e8e-4f5e-4e2d-ad62-252613c90259` |
| 54 | `GET /v1/accounts/me` | 200 | 13 | `qa-7cd88de7-66a4-4d65-b5c6-a57da8208061` |
| 55 | `GET /v1/accounts/me` | 200 | 12 | `qa-4999b39a-df20-42ed-9f87-00f1640cc987` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-35460644-ac8f-436c-b99c-47fec1b01fe5` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-e8be0cd2-5474-46a8-8645-43fc4d6e7fdd` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-d8e91cb9-2856-4336-a652-c7824efda2d3` |
| 59 | `GET /v1/accounts/me` | 200 | 7 | `qa-33159d54-9408-4495-ad8b-f359e0366543` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-9d0b36f9-8f28-4c7c-8bd4-1ea4d4c9072c` |
| 61 | `GET /v1/accounts/me` | 200 | 3 | `qa-4e5e9cca-676f-4c21-8917-0d05b2004929` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-0a81c8dc-7915-46a2-b3ee-6bf9d1c025c8` |
| 63 | `GET /v1/accounts/me` | 200 | 5 | `qa-40cfee2d-00df-43ae-8790-d039c048f461` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-500415e5-0ddd-4c09-8bc6-b58e2a933c79` |
| 65 | `POST /v1/auth/token` | 429 | 5 | `qa-6dd8eb45-7f2a-4947-804f-9e1d2eee9192` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-6f42303e-a8b3-48ea-b7b1-5f4112bf9f3c` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-c0662afd-e553-4327-980d-790eabdc98f5` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-85de273a-edb8-4ed6-aa9d-42e949609a6c` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-c4a77670-d80e-4d07-81fd-2d657cd5d160` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 6 | `qa-d9fb3e18-60e3-487f-b13a-10b89b995392` |
| 71 | `POST /v1/conversations` | 429 | 7 | `qa-003ca5ac-0cee-47a8-9620-96268f221a3e` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-6a54ea60-a861-47cb-82d4-f33aee7f4d28` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-40439819-437b-484b-b68a-1e0a7da309a6` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-6ebc6fff-7320-4d3d-b664-61db659bd112` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-a5607a63-f9f6-4406-a943-806a3657c3bf` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-f1ea3322-6cde-410a-8aea-991b1dbcfa12` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-300e4dc7-a6eb-4d7e-a214-5a24da024045` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-efda67cd-7365-443b-b171-dd5d25637e40` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-9b51c619-c37e-482c-a564-64e45e6487b4` |
| 80 | `POST /v1/credits/purchases` | 429 | 6 | `qa-246202c5-03a8-4e80-84b2-a7936f6aa650` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-c85680db-33a3-4a01-943d-cd358e3bedfb` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-80b08bcf-55f1-48a8-8e70-be516b67037b` |
| 83 | `GET /v1/accounts/me` | 429 | 6 | `qa-6bc14eab-daae-4d57-9b93-9eb806ccfa84` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-05521a67-a412-498c-85ba-2f995663d150` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-729f38b4-5ed6-423c-b867-07b248aff9b7` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-84ba5775-87af-4216-8dd5-cbf177b11167` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-b5666627-5af3-47e6-9b2a-eb4e70000cec` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-8b7d01a0-8191-497d-ab6a-d894b8e15d40` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-1bbb6667-ffbc-42c3-bf8d-af8c886b2a09` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-8054db58-f71a-4f28-ad78-c4c844b4781e` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-30c086f4-876d-498d-91c5-479696777207` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-721deb70-dbba-4a1f-ad11-206f30e32bbe` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-22b62e2e-3e27-4b2d-b315-d0e121b5905a` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-3c9f3ad7-418e-46c4-a7a1-20c700c8c13f` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-d2a9a529-6d5a-4e3e-8f85-0129a711cf99` |
| 96 | `GET /v1/accounts/me` | 429 | 3 | `qa-c152c1c7-5d90-49ad-be78-7708c64ea509` |
| 97 | `GET /v1/accounts/me` | 200 | 5 | `qa-f4b57a14-dcbd-4a1a-8f2d-6f4c689ccd5f` |
| 98 | `POST /v1/auth/token` | 200 | 8 | `qa-a6b986fd-4772-496b-87f9-0fa79634f965` |
| 99 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-fbfe8c25-d59f-4704-bffe-a2a2fd081034` |
| 100 | `POST /v1/auth/token` | 401 | 8 | `qa-4c3cbe32-fbe8-4c7b-baf3-3fbcf3c07802` |
| 101 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f23f8a68-dadf-4452-afc0-74d8fd1f1edd` |
| 102 | `POST /v1/auth/token` | 401 | 8 | `qa-5a2f6fa7-0897-42b6-a3fe-67a297daaf86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8adc9480-b27f-4726-a2be-a42021186d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8adc9480-b27f-4726-a2be-a42021186d51
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8adc9480-b27f-4726-a2be-a42021186d51
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
Location: /v1/accounts/qa-f4f7c13142b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2cd42277-d26e-4b2b-9127-b55f6c2a83c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd42277-d26e-4b2b-9127-b55f6c2a83c1
Content-Type: application/json

--- request body ---
{"handle":"qa-a9ef200481e6","displayName":"QA a9ef200481e6","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cd42277-d26e-4b2b-9127-b55f6c2a83c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Location: /v1/accounts/qa-a9ef200481e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_550d501b-1bd0-4cba-b7cd-903e554007e1","handle":"qa-a9ef200481e6","displayName":"QA a9ef200481e6","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.708096328Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0768c8dd-ea09-421b-a294-366fd398f302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0768c8dd-ea09-421b-a294-366fd398f302
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f7c13142b2","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0768c8dd-ea09-421b-a294-366fd398f302
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-56bcabe5-88df-4d78-aab0-ca84d89f91e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56bcabe5-88df-4d78-aab0-ca84d89f91e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9ef200481e6","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-56bcabe5-88df-4d78-aab0-ca84d89f91e6
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
Location: /v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bdf12797-22ef-469d-ac29-eb72798fe03b","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4f7c13142b2","qa-a9ef200481e6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.781396874Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-13b73629-db76-497f-96b0-140867abe631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b73629-db76-497f-96b0-140867abe631
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-13b73629-db76-497f-96b0-140867abe631
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-f023b5a6-9184-431a-a63b-9e8a413bc118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f023b5a6-9184-431a-a63b-9e8a413bc118
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-f023b5a6-9184-431a-a63b-9e8a413bc118
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-d47bd49a-21a0-4b4c-b5f2-3e9e814bb42b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d47bd49a-21a0-4b4c-b5f2-3e9e814bb42b
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d47bd49a-21a0-4b4c-b5f2-3e9e814bb42b
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e9322fc-5b9f-4a5c-9ef7-f31086cd6d4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9322fc-5b9f-4a5c-9ef7-f31086cd6d4d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e9322fc-5b9f-4a5c-9ef7-f31086cd6d4d
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-96f71771-7984-4f98-8fe7-2fc41fc76d72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f71771-7984-4f98-8fe7-2fc41fc76d72
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-96f71771-7984-4f98-8fe7-2fc41fc76d72
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ec41f6e-bc64-4ad3-853b-a029bddd84eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec41f6e-bc64-4ad3-853b-a029bddd84eb
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ec41f6e-bc64-4ad3-853b-a029bddd84eb
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-50c9cbc0-567d-4e7e-99f2-0ebd0e55246e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c9cbc0-567d-4e7e-99f2-0ebd0e55246e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c9cbc0-567d-4e7e-99f2-0ebd0e55246e
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd95712d-50c7-436f-a0c1-e9dec09ffee4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd95712d-50c7-436f-a0c1-e9dec09ffee4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd95712d-50c7-436f-a0c1-e9dec09ffee4
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1f38f3a-65d5-4df3-a528-b34461adbaa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1f38f3a-65d5-4df3-a528-b34461adbaa6
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1f38f3a-65d5-4df3-a528-b34461adbaa6
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c1e2cdd-f520-4491-80c6-73e973fe7c2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c1e2cdd-f520-4491-80c6-73e973fe7c2f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c1e2cdd-f520-4491-80c6-73e973fe7c2f
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8f6cd8e-d479-444a-96cd-d3b7e065701e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8f6cd8e-d479-444a-96cd-d3b7e065701e
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8f6cd8e-d479-444a-96cd-d3b7e065701e
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-81ecb973-f927-4d57-848b-083203c75049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ecb973-f927-4d57-848b-083203c75049
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-81ecb973-f927-4d57-848b-083203c75049
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-b847bc89-d351-4af1-9c2a-31b9c9333ee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b847bc89-d351-4af1-9c2a-31b9c9333ee7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b847bc89-d351-4af1-9c2a-31b9c9333ee7
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0a943f0-fee1-484b-adce-ced7c28daaf9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a943f0-fee1-484b-adce-ced7c28daaf9
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a943f0-fee1-484b-adce-ced7c28daaf9
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-57c49519-30d8-402a-85dd-4b7cff7e00a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57c49519-30d8-402a-85dd-4b7cff7e00a5
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-57c49519-30d8-402a-85dd-4b7cff7e00a5
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3b67e02-162b-4817-ad8a-1f8a414b5403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3b67e02-162b-4817-ad8a-1f8a414b5403
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3b67e02-162b-4817-ad8a-1f8a414b5403
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b62a187-579c-43b4-8a28-4ed71562fbb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b62a187-579c-43b4-8a28-4ed71562fbb7
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b62a187-579c-43b4-8a28-4ed71562fbb7
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-af1001c4-33fe-4241-a2b2-9f26e2e97e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af1001c4-33fe-4241-a2b2-9f26e2e97e3d
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-af1001c4-33fe-4241-a2b2-9f26e2e97e3d
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-512ae525-3da4-4b2f-abec-353b00357ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512ae525-3da4-4b2f-abec-353b00357ad5
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-512ae525-3da4-4b2f-abec-353b00357ad5
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-00ff2b3d-0d46-4459-8e76-3ef826f4ec12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00ff2b3d-0d46-4459-8e76-3ef826f4ec12
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-00ff2b3d-0d46-4459-8e76-3ef826f4ec12
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-491a302f-88ac-45fa-b7ed-ceed33435845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-491a302f-88ac-45fa-b7ed-ceed33435845
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-491a302f-88ac-45fa-b7ed-ceed33435845
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-085ef74e-c2a7-4408-9607-9de7d4bfa18f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-085ef74e-c2a7-4408-9607-9de7d4bfa18f
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-085ef74e-c2a7-4408-9607-9de7d4bfa18f
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-31694545-15e7-47e5-bd04-f3798d0bafb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31694545-15e7-47e5-bd04-f3798d0bafb8
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-31694545-15e7-47e5-bd04-f3798d0bafb8
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-70e86126-3f28-4803-bf0c-096b12f1a05b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e86126-3f28-4803-bf0c-096b12f1a05b
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-70e86126-3f28-4803-bf0c-096b12f1a05b
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-96d922be-4722-40c1-8159-5147b63343cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d922be-4722-40c1-8159-5147b63343cf
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d922be-4722-40c1-8159-5147b63343cf
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4392228-b0a9-46bb-a067-5e90f9f95da5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4392228-b0a9-46bb-a067-5e90f9f95da5
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4392228-b0a9-46bb-a067-5e90f9f95da5
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2354d30-3e59-482b-b3ec-dc20ae30182f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2354d30-3e59-482b-b3ec-dc20ae30182f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2354d30-3e59-482b-b3ec-dc20ae30182f
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-60615ad8-4f2f-4b9f-9a38-2aa35c2a629b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60615ad8-4f2f-4b9f-9a38-2aa35c2a629b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-60615ad8-4f2f-4b9f-9a38-2aa35c2a629b
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddc89caf-7d4b-46fe-9316-fcb6faf708ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddc89caf-7d4b-46fe-9316-fcb6faf708ea
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddc89caf-7d4b-46fe-9316-fcb6faf708ea
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-071ab0c0-b0ea-43ff-923c-ba67feaa5730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-071ab0c0-b0ea-43ff-923c-ba67feaa5730
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-071ab0c0-b0ea-43ff-923c-ba67feaa5730
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-8090b439-d9a9-4b1d-a451-526bc883afeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8090b439-d9a9-4b1d-a451-526bc883afeb
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8090b439-d9a9-4b1d-a451-526bc883afeb
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9df4620-e40f-4a0b-b065-701115c1ff7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9df4620-e40f-4a0b-b065-701115c1ff7c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9df4620-e40f-4a0b-b065-701115c1ff7c
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-521417f9-4446-40c0-b3d0-d18807bdcd9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-521417f9-4446-40c0-b3d0-d18807bdcd9c
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-521417f9-4446-40c0-b3d0-d18807bdcd9c
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-bae95a26-b423-4177-806f-d872c90b30b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bae95a26-b423-4177-806f-d872c90b30b7
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-bae95a26-b423-4177-806f-d872c90b30b7
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5170a619-8083-438d-a377-fdf80c3a7325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5170a619-8083-438d-a377-fdf80c3a7325
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5170a619-8083-438d-a377-fdf80c3a7325
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-c468384d-186c-4376-b09c-f69ef86e66e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c468384d-186c-4376-b09c-f69ef86e66e3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c468384d-186c-4376-b09c-f69ef86e66e3
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ee029e5-80ce-4d1d-b16f-d81c0c230eed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee029e5-80ce-4d1d-b16f-d81c0c230eed
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ee029e5-80ce-4d1d-b16f-d81c0c230eed
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-1061ac57-10ec-4042-a634-7a76acadb5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1061ac57-10ec-4042-a634-7a76acadb5cc
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1061ac57-10ec-4042-a634-7a76acadb5cc
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfdc6e55-d8bb-406e-bf75-b66407f38975

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfdc6e55-d8bb-406e-bf75-b66407f38975
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfdc6e55-d8bb-406e-bf75-b66407f38975
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-f31eb0c0-2cd8-4503-a4d3-418dd9461a11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f31eb0c0-2cd8-4503-a4d3-418dd9461a11
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f31eb0c0-2cd8-4503-a4d3-418dd9461a11
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-77ab5237-a4be-4989-97e4-43371d6493f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77ab5237-a4be-4989-97e4-43371d6493f6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-77ab5237-a4be-4989-97e4-43371d6493f6
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ca79b07-7535-478e-9752-b08234d2f1d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca79b07-7535-478e-9752-b08234d2f1d4
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ca79b07-7535-478e-9752-b08234d2f1d4
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbee8f74-c1ea-4b55-b489-93179ee2f87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbee8f74-c1ea-4b55-b489-93179ee2f87c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbee8f74-c1ea-4b55-b489-93179ee2f87c
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-4711cda7-fb89-42f8-8043-1be1c7f2772f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4711cda7-fb89-42f8-8043-1be1c7f2772f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4711cda7-fb89-42f8-8043-1be1c7f2772f
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-57576ab5-a9f9-46cd-a187-7c86da9611fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57576ab5-a9f9-46cd-a187-7c86da9611fd
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-57576ab5-a9f9-46cd-a187-7c86da9611fd
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-7922efe2-e630-4d55-b1a0-581db81ffbe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7922efe2-e630-4d55-b1a0-581db81ffbe9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-7922efe2-e630-4d55-b1a0-581db81ffbe9
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-09a750b8-2017-4b21-9393-349fa68bf84a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a750b8-2017-4b21-9393-349fa68bf84a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-09a750b8-2017-4b21-9393-349fa68bf84a
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-17af5011-1592-4ee6-be5f-52c11833de31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17af5011-1592-4ee6-be5f-52c11833de31
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-17af5011-1592-4ee6-be5f-52c11833de31
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-08065e8e-4f5e-4e2d-ad62-252613c90259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08065e8e-4f5e-4e2d-ad62-252613c90259
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-08065e8e-4f5e-4e2d-ad62-252613c90259
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cd88de7-66a4-4d65-b5c6-a57da8208061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cd88de7-66a4-4d65-b5c6-a57da8208061
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cd88de7-66a4-4d65-b5c6-a57da8208061
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-4999b39a-df20-42ed-9f87-00f1640cc987

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4999b39a-df20-42ed-9f87-00f1640cc987
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4999b39a-df20-42ed-9f87-00f1640cc987
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-35460644-ac8f-436c-b99c-47fec1b01fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35460644-ac8f-436c-b99c-47fec1b01fe5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-35460644-ac8f-436c-b99c-47fec1b01fe5
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8be0cd2-5474-46a8-8645-43fc4d6e7fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8be0cd2-5474-46a8-8645-43fc4d6e7fdd
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8be0cd2-5474-46a8-8645-43fc4d6e7fdd
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8e91cb9-2856-4336-a652-c7824efda2d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8e91cb9-2856-4336-a652-c7824efda2d3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8e91cb9-2856-4336-a652-c7824efda2d3
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-33159d54-9408-4495-ad8b-f359e0366543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33159d54-9408-4495-ad8b-f359e0366543
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-33159d54-9408-4495-ad8b-f359e0366543
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d0b36f9-8f28-4c7c-8bd4-1ea4d4c9072c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d0b36f9-8f28-4c7c-8bd4-1ea4d4c9072c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d0b36f9-8f28-4c7c-8bd4-1ea4d4c9072c
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e5e9cca-676f-4c21-8917-0d05b2004929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e5e9cca-676f-4c21-8917-0d05b2004929
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e5e9cca-676f-4c21-8917-0d05b2004929
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a81c8dc-7915-46a2-b3ee-6bf9d1c025c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a81c8dc-7915-46a2-b3ee-6bf9d1c025c8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a81c8dc-7915-46a2-b3ee-6bf9d1c025c8
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-40cfee2d-00df-43ae-8790-d039c048f461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40cfee2d-00df-43ae-8790-d039c048f461
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-40cfee2d-00df-43ae-8790-d039c048f461
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-500415e5-0ddd-4c09-8bc6-b58e2a933c79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-500415e5-0ddd-4c09-8bc6-b58e2a933c79
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-500415e5-0ddd-4c09-8bc6-b58e2a933c79
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-500415e5-0ddd-4c09-8bc6-b58e2a933c79"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-6dd8eb45-7f2a-4947-804f-9e1d2eee9192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd8eb45-7f2a-4947-804f-9e1d2eee9192
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f7c13142b2","password":"****"}

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6dd8eb45-7f2a-4947-804f-9e1d2eee9192
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-6dd8eb45-7f2a-4947-804f-9e1d2eee9192"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-6f42303e-a8b3-48ea-b7b1-5f4112bf9f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f42303e-a8b3-48ea-b7b1-5f4112bf9f3c
Content-Type: application/json

--- request body ---
{"handle":"qa-da6c98b70e18","displayName":"QA da6c98b70e18","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f42303e-a8b3-48ea-b7b1-5f4112bf9f3c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-6f42303e-a8b3-48ea-b7b1-5f4112bf9f3c"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0662afd-e553-4327-980d-790eabdc98f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0662afd-e553-4327-980d-790eabdc98f5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0662afd-e553-4327-980d-790eabdc98f5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c0662afd-e553-4327-980d-790eabdc98f5"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-85de273a-edb8-4ed6-aa9d-42e949609a6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85de273a-edb8-4ed6-aa9d-42e949609a6c
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85de273a-edb8-4ed6-aa9d-42e949609a6c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-85de273a-edb8-4ed6-aa9d-42e949609a6c"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4a77670-d80e-4d07-81fd-2d657cd5d160

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a77670-d80e-4d07-81fd-2d657cd5d160
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4a77670-d80e-4d07-81fd-2d657cd5d160
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c4a77670-d80e-4d07-81fd-2d657cd5d160"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-f4f7c13142b2
correlation: qa-d9fb3e18-60e3-487f-b13a-10b89b995392

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9fb3e18-60e3-487f-b13a-10b89b995392
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9fb3e18-60e3-487f-b13a-10b89b995392
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-f4f7c13142b2","correlationId":"qa-d9fb3e18-60e3-487f-b13a-10b89b995392"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-003ca5ac-0cee-47a8-9620-96268f221a3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003ca5ac-0cee-47a8-9620-96268f221a3e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f4f7c13142b2","subject":"Probe","message":"Hi"}

--- response: 429 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-003ca5ac-0cee-47a8-9620-96268f221a3e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-003ca5ac-0cee-47a8-9620-96268f221a3e"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-6a54ea60-a861-47cb-82d4-f33aee7f4d28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a54ea60-a861-47cb-82d4-f33aee7f4d28
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a54ea60-a861-47cb-82d4-f33aee7f4d28
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-6a54ea60-a861-47cb-82d4-f33aee7f4d28"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b
correlation: qa-40439819-437b-484b-b68a-1e0a7da309a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40439819-437b-484b-b68a-1e0a7da309a6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40439819-437b-484b-b68a-1e0a7da309a6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b","correlationId":"qa-40439819-437b-484b-b68a-1e0a7da309a6"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/messages
correlation: qa-6ebc6fff-7320-4d3d-b664-61db659bd112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ebc6fff-7320-4d3d-b664-61db659bd112
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ebc6fff-7320-4d3d-b664-61db659bd112
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/messages","correlationId":"qa-6ebc6fff-7320-4d3d-b664-61db659bd112"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/messages
correlation: qa-a5607a63-f9f6-4406-a943-806a3657c3bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5607a63-f9f6-4406-a943-806a3657c3bf
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5607a63-f9f6-4406-a943-806a3657c3bf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/messages","correlationId":"qa-a5607a63-f9f6-4406-a943-806a3657c3bf"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/read
correlation: qa-f1ea3322-6cde-410a-8aea-991b1dbcfa12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1ea3322-6cde-410a-8aea-991b1dbcfa12
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1ea3322-6cde-410a-8aea-991b1dbcfa12
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/read","correlationId":"qa-f1ea3322-6cde-410a-8aea-991b1dbcfa12"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/close
correlation: qa-300e4dc7-a6eb-4d7e-a214-5a24da024045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-300e4dc7-a6eb-4d7e-a214-5a24da024045
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-300e4dc7-a6eb-4d7e-a214-5a24da024045
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_bdf12797-22ef-469d-ac29-eb72798fe03b/close","correlationId":"qa-300e4dc7-a6eb-4d7e-a214-5a24da024045"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-efda67cd-7365-443b-b171-dd5d25637e40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efda67cd-7365-443b-b171-dd5d25637e40
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efda67cd-7365-443b-b171-dd5d25637e40
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-efda67cd-7365-443b-b171-dd5d25637e40"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9b51c619-c37e-482c-a564-64e45e6487b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b51c619-c37e-482c-a564-64e45e6487b4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b51c619-c37e-482c-a564-64e45e6487b4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-9b51c619-c37e-482c-a564-64e45e6487b4"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-246202c5-03a8-4e80-84b2-a7936f6aa650

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cc023d4f8f9e4711b1fe2b8b6cc77276
X-Correlation-Id: qa-246202c5-03a8-4e80-84b2-a7936f6aa650
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-246202c5-03a8-4e80-84b2-a7936f6aa650
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-246202c5-03a8-4e80-84b2-a7936f6aa650"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-c85680db-33a3-4a01-943d-cd358e3bedfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c85680db-33a3-4a01-943d-cd358e3bedfb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c85680db-33a3-4a01-943d-cd358e3bedfb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-c85680db-33a3-4a01-943d-cd358e3bedfb"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-80b08bcf-55f1-48a8-8e70-be516b67037b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b08bcf-55f1-48a8-8e70-be516b67037b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80b08bcf-55f1-48a8-8e70-be516b67037b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-80b08bcf-55f1-48a8-8e70-be516b67037b"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-6bc14eab-daae-4d57-9b93-9eb806ccfa84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc14eab-daae-4d57-9b93-9eb806ccfa84
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bc14eab-daae-4d57-9b93-9eb806ccfa84
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6bc14eab-daae-4d57-9b93-9eb806ccfa84"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-05521a67-a412-498c-85ba-2f995663d150

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05521a67-a412-498c-85ba-2f995663d150
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05521a67-a412-498c-85ba-2f995663d150
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-05521a67-a412-498c-85ba-2f995663d150"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-729f38b4-5ed6-423c-b867-07b248aff9b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-729f38b4-5ed6-423c-b867-07b248aff9b7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-729f38b4-5ed6-423c-b867-07b248aff9b7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-729f38b4-5ed6-423c-b867-07b248aff9b7"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-84ba5775-87af-4216-8dd5-cbf177b11167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84ba5775-87af-4216-8dd5-cbf177b11167
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84ba5775-87af-4216-8dd5-cbf177b11167
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-84ba5775-87af-4216-8dd5-cbf177b11167"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5666627-5af3-47e6-9b2a-eb4e70000cec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5666627-5af3-47e6-9b2a-eb4e70000cec
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5666627-5af3-47e6-9b2a-eb4e70000cec
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b5666627-5af3-47e6-9b2a-eb4e70000cec"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b7d01a0-8191-497d-ab6a-d894b8e15d40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b7d01a0-8191-497d-ab6a-d894b8e15d40
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b7d01a0-8191-497d-ab6a-d894b8e15d40
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8b7d01a0-8191-497d-ab6a-d894b8e15d40"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bbb6667-ffbc-42c3-bf8d-af8c886b2a09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bbb6667-ffbc-42c3-bf8d-af8c886b2a09
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bbb6667-ffbc-42c3-bf8d-af8c886b2a09
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1bbb6667-ffbc-42c3-bf8d-af8c886b2a09"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-8054db58-f71a-4f28-ad78-c4c844b4781e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8054db58-f71a-4f28-ad78-c4c844b4781e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8054db58-f71a-4f28-ad78-c4c844b4781e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8054db58-f71a-4f28-ad78-c4c844b4781e"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-30c086f4-876d-498d-91c5-479696777207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c086f4-876d-498d-91c5-479696777207
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30c086f4-876d-498d-91c5-479696777207
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-30c086f4-876d-498d-91c5-479696777207"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-721deb70-dbba-4a1f-ad11-206f30e32bbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-721deb70-dbba-4a1f-ad11-206f30e32bbe
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-721deb70-dbba-4a1f-ad11-206f30e32bbe
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-721deb70-dbba-4a1f-ad11-206f30e32bbe"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-22b62e2e-3e27-4b2d-b315-d0e121b5905a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b62e2e-3e27-4b2d-b315-d0e121b5905a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22b62e2e-3e27-4b2d-b315-d0e121b5905a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-22b62e2e-3e27-4b2d-b315-d0e121b5905a"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c9f3ad7-418e-46c4-a7a1-20c700c8c13f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c9f3ad7-418e-46c4-a7a1-20c700c8c13f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c9f3ad7-418e-46c4-a7a1-20c700c8c13f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3c9f3ad7-418e-46c4-a7a1-20c700c8c13f"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2a9a529-6d5a-4e3e-8f85-0129a711cf99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2a9a529-6d5a-4e3e-8f85-0129a711cf99
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2a9a529-6d5a-4e3e-8f85-0129a711cf99
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d2a9a529-6d5a-4e3e-8f85-0129a711cf99"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-c152c1c7-5d90-49ad-be78-7708c64ea509

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c152c1c7-5d90-49ad-be78-7708c64ea509
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c152c1c7-5d90-49ad-be78-7708c64ea509
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c152c1c7-5d90-49ad-be78-7708c64ea509"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4b57a14-dcbd-4a1a-8f2d-6f4c689ccd5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b57a14-dcbd-4a1a-8f2d-6f4c689ccd5f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b57a14-dcbd-4a1a-8f2d-6f4c689ccd5f
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

{"id":"acc_3bd47a4d-d331-41a8-ae2a-ff632d94e927","handle":"qa-f4f7c13142b2","displayName":"QA f4f7c13142b2","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.648026083Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-a6b986fd-4772-496b-87f9-0fa79634f965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6b986fd-4772-496b-87f9-0fa79634f965
Content-Type: application/json

--- request body ---
{"handle":"qa-a9ef200481e6","password":"****"}

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6b986fd-4772-496b-87f9-0fa79634f965
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_550d501b-1bd0-4cba-b7cd-903e554007e1"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbfe8c25-d59f-4704-bffe-a2a2fd081034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbfe8c25-d59f-4704-bffe-a2a2fd081034
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbfe8c25-d59f-4704-bffe-a2a2fd081034
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
correlation: qa-4c3cbe32-fbe8-4c7b-baf3-3fbcf3c07802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c3cbe32-fbe8-4c7b-baf3-3fbcf3c07802
Content-Type: application/json

--- request body ---
{"handle":"qa-a9ef200481e6","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c3cbe32-fbe8-4c7b-baf3-3fbcf3c07802
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c3cbe32-fbe8-4c7b-baf3-3fbcf3c07802"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f23f8a68-dadf-4452-afc0-74d8fd1f1edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f23f8a68-dadf-4452-afc0-74d8fd1f1edd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f23f8a68-dadf-4452-afc0-74d8fd1f1edd
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
correlation: qa-5a2f6fa7-0897-42b6-a3fe-67a297daaf86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a2f6fa7-0897-42b6-a3fe-67a297daaf86
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f7c13142b2","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a2f6fa7-0897-42b6-a3fe-67a297daaf86
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a2f6fa7-0897-42b6-a3fe-67a297daaf86"}
```
