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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-b0b9e20f-7b6d-4610-9d49-abe834fdcd72` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-644e4102-8239-4bb3-9476-63935f5e6f36` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f74bc2c1-a260-4367-ac21-a6e155e17cfe` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-192ba107-e475-4c73-9773-56d13ba5a52e` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-d745f745-35b6-466f-a0a1-0e2fd996979c` |
| 6 | `GET /v1/accounts/me` | 200 | 26 | `qa-e93c9aac-90e4-4d26-a6e0-80c31b99c9f8` |
| 7 | `GET /v1/accounts/me` | 200 | 37 | `qa-66a83532-4df8-43f9-8d87-2a1e099b3ff2` |
| 8 | `GET /v1/accounts/me` | 200 | 6 | `qa-07d52f97-f89a-43b6-8194-fb3a8a30f24f` |
| 9 | `GET /v1/accounts/me` | 200 | 3 | `qa-90d5676b-eed0-47ea-84b5-ce633f9cb886` |
| 10 | `GET /v1/accounts/me` | 200 | 14 | `qa-0acdb513-fbeb-4809-8429-8a9da10b119a` |
| 11 | `GET /v1/accounts/me` | 200 | 16 | `qa-54bbbafe-5e54-49b2-82ff-0605f1084dbe` |
| 12 | `GET /v1/accounts/me` | 200 | 17 | `qa-707670f4-fe14-44cb-9780-f44cd81af30f` |
| 13 | `GET /v1/accounts/me` | 200 | 19 | `qa-495cc94b-ef95-4f79-bf89-0bb19b52bfea` |
| 14 | `GET /v1/accounts/me` | 200 | 25 | `qa-851dd6ca-0be0-4c43-a10b-305d5c90cd38` |
| 15 | `GET /v1/accounts/me` | 200 | 19 | `qa-59b4124a-3a42-44ac-b260-97285f29b817` |
| 16 | `GET /v1/accounts/me` | 200 | 19 | `qa-22166639-6512-4ee4-8d2b-9ac120b4825d` |
| 17 | `GET /v1/accounts/me` | 200 | 37 | `qa-c70071e6-1f9f-436f-92d5-6ce64ece9e70` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-847356b0-1e26-49bd-bc2e-23c69c571b50` |
| 19 | `GET /v1/accounts/me` | 200 | 8 | `qa-4941483d-48b0-477a-a8de-b044c1e1e385` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-b3953b0e-3ac4-4ecb-93f3-b61870c31a8b` |
| 21 | `GET /v1/accounts/me` | 200 | 13 | `qa-295758a1-8a4d-48bd-8ac2-1e2050fe6c2d` |
| 22 | `GET /v1/accounts/me` | 200 | 24 | `qa-3231d86e-7ec7-4149-a337-18d9a9f4a8eb` |
| 23 | `GET /v1/accounts/me` | 200 | 14 | `qa-d15485b4-d3d7-49de-b449-17ee92c49d3e` |
| 24 | `GET /v1/accounts/me` | 200 | 22 | `qa-89601355-d4c5-4b95-b080-d7fdce5960fc` |
| 25 | `GET /v1/accounts/me` | 200 | 21 | `qa-9d5a9e10-6230-4f0e-b23c-8a6bb9a40247` |
| 26 | `GET /v1/accounts/me` | 200 | 15 | `qa-cd4ce28a-d50f-4e8e-abcd-54b7fe531758` |
| 27 | `GET /v1/accounts/me` | 200 | 12 | `qa-3755124e-0090-4db2-a015-c67abf3531a8` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-e62d83f8-6379-4ee1-b169-afa73fb02fd3` |
| 29 | `GET /v1/accounts/me` | 200 | 47 | `qa-654d18e6-686a-402d-8077-f4194874a703` |
| 30 | `GET /v1/accounts/me` | 200 | 10 | `qa-397074c9-3014-4853-b324-2084af91f72e` |
| 31 | `GET /v1/accounts/me` | 200 | 18 | `qa-cb06d747-e2d1-467c-9c9b-ff91eaff9563` |
| 32 | `GET /v1/accounts/me` | 200 | 8 | `qa-fd9ad669-00fa-4302-aba1-de219b58a1f1` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-ccda3921-807d-4988-8916-cbddcc3a21aa` |
| 34 | `GET /v1/accounts/me` | 200 | 11 | `qa-c8cba378-a72e-4ce1-84ac-b58eab28f17d` |
| 35 | `GET /v1/accounts/me` | 200 | 19 | `qa-5f291a93-8fdc-4fc9-9767-73b26c4701cd` |
| 36 | `GET /v1/accounts/me` | 200 | 17 | `qa-74f1b0b1-484b-42d4-b16a-f4beb112e061` |
| 37 | `GET /v1/accounts/me` | 200 | 30 | `qa-b3323a84-1c8b-450a-8923-d5f4b89c33bd` |
| 38 | `GET /v1/accounts/me` | 200 | 11 | `qa-55df75a1-b1fc-4cc6-8d87-e9f1709ed440` |
| 39 | `GET /v1/accounts/me` | 200 | 8 | `qa-818439af-3cf8-4941-8245-75dfac6d5cad` |
| 40 | `GET /v1/accounts/me` | 200 | 13 | `qa-b96ca7ff-cdef-48fc-baad-04cd986df46c` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-ecca3592-6292-4342-b68c-30d86ee3bfd6` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-ecbb6871-4421-4110-bcdf-5155a933f22c` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-537b2e15-ff33-447a-bb9c-8b362bc3ae2e` |
| 44 | `GET /v1/accounts/me` | 200 | 5 | `qa-f1aa3469-0987-4523-95bc-9a85f2fd7714` |
| 45 | `GET /v1/accounts/me` | 200 | 13 | `qa-2db73d41-8b40-42e5-a276-6a98ebb9f0bf` |
| 46 | `GET /v1/accounts/me` | 200 | 13 | `qa-9c6e65ad-7f72-4eb5-bedc-3e58e0b41b68` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-1b7519d8-cf44-4560-8c69-c0ef27f39fea` |
| 48 | `GET /v1/accounts/me` | 200 | 4 | `qa-f9fe24bd-6e1d-4c0d-9ed2-68c16709c8fd` |
| 49 | `GET /v1/accounts/me` | 200 | 14 | `qa-01d41111-6177-4429-9347-54c4c71983f3` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-9bae6d14-577c-49d8-9931-7318810a15af` |
| 51 | `GET /v1/accounts/me` | 200 | 14 | `qa-f8d2d8bc-2a3d-481f-8a80-43c71ddb11dd` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-febb5c6c-83b9-4375-a434-1fac86584385` |
| 53 | `GET /v1/accounts/me` | 200 | 20 | `qa-82e4c177-52ab-434e-9908-6948c363e8c8` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-46c0ca89-100a-42bb-97fb-1de448ee572e` |
| 55 | `GET /v1/accounts/me` | 200 | 8 | `qa-1548e940-23d0-40b7-98b2-23fd1d11c9c1` |
| 56 | `GET /v1/accounts/me` | 200 | 21 | `qa-bb0697ae-ee4c-4a69-9ee3-88b1334cc933` |
| 57 | `GET /v1/accounts/me` | 200 | 24 | `qa-341b9d5d-72d0-450a-a8e9-7015bbb53bd8` |
| 58 | `GET /v1/accounts/me` | 200 | 15 | `qa-509bf630-a97b-417a-a2f2-94f82c9a730f` |
| 59 | `GET /v1/accounts/me` | 200 | 9 | `qa-2ad3fb69-ebd1-4284-9af0-4e7f14682eac` |
| 60 | `GET /v1/accounts/me` | 200 | 27 | `qa-bcda26bb-8faa-422f-b8a8-14518c0189a3` |
| 61 | `GET /v1/accounts/me` | 200 | 11 | `qa-3427fa5c-50a0-42fc-814b-b476c349c5c5` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-3b987823-7132-4571-9ee2-d4db3ef9fd01` |
| 63 | `GET /v1/accounts/me` | 200 | 5 | `qa-cc7eb75d-8c34-4b42-aca3-521c0c398d46` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-2947f879-65d7-4d2d-88e4-1ddff02309f4` |
| 65 | `POST /v1/auth/token` | 429 | 6 | `qa-f84da8e7-286b-4ee8-897d-f85e7f6b494d` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-1893da39-0872-4eab-b6a6-06fde35cd5a8` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-3ad1542c-2106-4b87-983b-e3fd74fb1cfb` |
| 68 | `PATCH /v1/accounts/me` | 429 | 5 | `qa-9668b316-3db1-45b6-aafe-4166617d4190` |
| 69 | `DELETE /v1/accounts/me` | 429 | 6 | `qa-26d61c38-7d52-4825-a287-bf993de032e5` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 3 | `qa-3f50414d-6100-4992-ade9-a6a13c626701` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-71578aa1-c34b-479f-b455-e8f354ec9de5` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-b4713ede-8f64-40dc-b197-f973b39faaa0` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-3881330a-1e74-48df-a2d3-453571c8fd7a` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-f9122491-89eb-476c-bd08-ff98b2d96c2b` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-9eced5f1-27c2-482d-b7c6-5439f941c960` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-c5341342-64a2-4d92-bbb6-ef995de225d6` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-60af7bf5-a87d-49ef-9d62-9ff1fa7b3c2a` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-cf15e9e2-cb73-45b4-a702-7ba7d3bdac95` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-e1902e20-4c5f-4f22-80f1-04a070be8bb6` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-3df3470e-7554-4bb5-94ed-521353171a95` |
| 81 | `GET /v1/admin/stats` | 429 | 2 | `qa-9bd0e480-170e-4a3d-89b1-95d4dd5c24d1` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-5064329b-f16d-422b-99d1-0da44909296d` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-418be98d-55f7-4798-94bf-b72563033c6d` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-db770bf7-d374-4b15-844f-8e934eabe5d0` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-670538b0-3d85-4eb1-a243-682c2a1174d2` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-995ca842-a376-42c8-8dac-9bed27107f0d` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-8524f931-aba1-4609-b23d-09378fdf5043` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-9d13cf6e-053a-4086-9468-ed8f6a91e6a8` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-a93bc3e4-4262-4357-a637-e0731fc3544b` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-b045a377-2711-40e5-8bba-b07f75b0a2e8` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-f8c396f0-1644-4164-8a5a-87097e991fb0` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-d6416e48-e455-4c49-8834-ac8a8fbcc2fa` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-a1885f6a-68f5-480d-b513-a3b04967dac6` |
| 94 | `GET /v1/accounts/me` | 429 | 3 | `qa-be1e31f7-c562-4b14-a913-44f17fbf01c3` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-4eafc4bf-3800-4835-8afb-0fc300addeee` |
| 96 | `GET /v1/accounts/me` | 429 | 3 | `qa-33191089-b4ab-4394-9dda-33c5479d19c9` |
| 97 | `GET /v1/accounts/me` | 429 | 5 | `qa-a83d7155-1510-4022-bcf0-0e2ed44db54d` |
| 98 | `GET /v1/accounts/me` | 200 | 4 | `qa-9ca765e0-14c0-4d1a-9138-dadf6925b28f` |
| 99 | `POST /v1/auth/token` | 200 | 9 | `qa-bac2ce7f-03ce-4917-94f3-ee7c6913b300` |
| 100 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9a16e011-392f-4963-9619-300b5f6bdaa8` |
| 101 | `POST /v1/auth/token` | 401 | 5 | `qa-9a503feb-aee1-4085-ae54-118821277737` |
| 102 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-8dc77fa9-ff4e-44f4-8fba-3b5b67d3924c` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-620dbdd6-fd50-4598-8718-f41ea51747ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0b9e20f-7b6d-4610-9d49-abe834fdcd72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0b9e20f-7b6d-4610-9d49-abe834fdcd72
Content-Type: application/json

--- request body ---
{"handle":"qa-886edc192110","displayName":"QA 886edc192110","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0b9e20f-7b6d-4610-9d49-abe834fdcd72
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
Location: /v1/accounts/qa-886edc192110
X-Served-Region: eu
Content-Length: 181

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-644e4102-8239-4bb3-9476-63935f5e6f36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-644e4102-8239-4bb3-9476-63935f5e6f36
Content-Type: application/json

--- request body ---
{"handle":"qa-d32ac65b041a","displayName":"QA d32ac65b041a","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-644e4102-8239-4bb3-9476-63935f5e6f36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Location: /v1/accounts/qa-d32ac65b041a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e583b6a-9d66-4514-9c78-dd277cb6c359","handle":"qa-d32ac65b041a","displayName":"QA d32ac65b041a","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.729138339Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f74bc2c1-a260-4367-ac21-a6e155e17cfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f74bc2c1-a260-4367-ac21-a6e155e17cfe
Content-Type: application/json

--- request body ---
{"handle":"qa-886edc192110","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f74bc2c1-a260-4367-ac21-a6e155e17cfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_120ef016-89f6-4955-8495-fe0252dfa79f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-192ba107-e475-4c73-9773-56d13ba5a52e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192ba107-e475-4c73-9773-56d13ba5a52e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d32ac65b041a","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-192ba107-e475-4c73-9773-56d13ba5a52e
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
Location: /v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7","subject":"Error contract","status":"open","region":"eu","participants":["qa-886edc192110","qa-d32ac65b041a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.812733519Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-d745f745-35b6-466f-a0a1-0e2fd996979c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d745f745-35b6-466f-a0a1-0e2fd996979c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d745f745-35b6-466f-a0a1-0e2fd996979c
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e93c9aac-90e4-4d26-a6e0-80c31b99c9f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e93c9aac-90e4-4d26-a6e0-80c31b99c9f8
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e93c9aac-90e4-4d26-a6e0-80c31b99c9f8
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-66a83532-4df8-43f9-8d87-2a1e099b3ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66a83532-4df8-43f9-8d87-2a1e099b3ff2
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-66a83532-4df8-43f9-8d87-2a1e099b3ff2
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-07d52f97-f89a-43b6-8194-fb3a8a30f24f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d52f97-f89a-43b6-8194-fb3a8a30f24f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-07d52f97-f89a-43b6-8194-fb3a8a30f24f
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-90d5676b-eed0-47ea-84b5-ce633f9cb886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d5676b-eed0-47ea-84b5-ce633f9cb886
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-90d5676b-eed0-47ea-84b5-ce633f9cb886
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-0acdb513-fbeb-4809-8429-8a9da10b119a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0acdb513-fbeb-4809-8429-8a9da10b119a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0acdb513-fbeb-4809-8429-8a9da10b119a
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-54bbbafe-5e54-49b2-82ff-0605f1084dbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54bbbafe-5e54-49b2-82ff-0605f1084dbe
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-54bbbafe-5e54-49b2-82ff-0605f1084dbe
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-707670f4-fe14-44cb-9780-f44cd81af30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-707670f4-fe14-44cb-9780-f44cd81af30f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-707670f4-fe14-44cb-9780-f44cd81af30f
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-495cc94b-ef95-4f79-bf89-0bb19b52bfea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495cc94b-ef95-4f79-bf89-0bb19b52bfea
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-495cc94b-ef95-4f79-bf89-0bb19b52bfea
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-851dd6ca-0be0-4c43-a10b-305d5c90cd38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-851dd6ca-0be0-4c43-a10b-305d5c90cd38
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-851dd6ca-0be0-4c43-a10b-305d5c90cd38
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-59b4124a-3a42-44ac-b260-97285f29b817

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b4124a-3a42-44ac-b260-97285f29b817
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-59b4124a-3a42-44ac-b260-97285f29b817
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-22166639-6512-4ee4-8d2b-9ac120b4825d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22166639-6512-4ee4-8d2b-9ac120b4825d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-22166639-6512-4ee4-8d2b-9ac120b4825d
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-c70071e6-1f9f-436f-92d5-6ce64ece9e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c70071e6-1f9f-436f-92d5-6ce64ece9e70
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c70071e6-1f9f-436f-92d5-6ce64ece9e70
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-847356b0-1e26-49bd-bc2e-23c69c571b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-847356b0-1e26-49bd-bc2e-23c69c571b50
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-847356b0-1e26-49bd-bc2e-23c69c571b50
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-4941483d-48b0-477a-a8de-b044c1e1e385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4941483d-48b0-477a-a8de-b044c1e1e385
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4941483d-48b0-477a-a8de-b044c1e1e385
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3953b0e-3ac4-4ecb-93f3-b61870c31a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3953b0e-3ac4-4ecb-93f3-b61870c31a8b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3953b0e-3ac4-4ecb-93f3-b61870c31a8b
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-295758a1-8a4d-48bd-8ac2-1e2050fe6c2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-295758a1-8a4d-48bd-8ac2-1e2050fe6c2d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-295758a1-8a4d-48bd-8ac2-1e2050fe6c2d
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-3231d86e-7ec7-4149-a337-18d9a9f4a8eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3231d86e-7ec7-4149-a337-18d9a9f4a8eb
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3231d86e-7ec7-4149-a337-18d9a9f4a8eb
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-d15485b4-d3d7-49de-b449-17ee92c49d3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d15485b4-d3d7-49de-b449-17ee92c49d3e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d15485b4-d3d7-49de-b449-17ee92c49d3e
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-89601355-d4c5-4b95-b080-d7fdce5960fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89601355-d4c5-4b95-b080-d7fdce5960fc
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-89601355-d4c5-4b95-b080-d7fdce5960fc
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d5a9e10-6230-4f0e-b23c-8a6bb9a40247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d5a9e10-6230-4f0e-b23c-8a6bb9a40247
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d5a9e10-6230-4f0e-b23c-8a6bb9a40247
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd4ce28a-d50f-4e8e-abcd-54b7fe531758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd4ce28a-d50f-4e8e-abcd-54b7fe531758
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd4ce28a-d50f-4e8e-abcd-54b7fe531758
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-3755124e-0090-4db2-a015-c67abf3531a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3755124e-0090-4db2-a015-c67abf3531a8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3755124e-0090-4db2-a015-c67abf3531a8
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-e62d83f8-6379-4ee1-b169-afa73fb02fd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e62d83f8-6379-4ee1-b169-afa73fb02fd3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e62d83f8-6379-4ee1-b169-afa73fb02fd3
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-654d18e6-686a-402d-8077-f4194874a703

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654d18e6-686a-402d-8077-f4194874a703
Content-Type: application/json

--- response: 200 in 47 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-654d18e6-686a-402d-8077-f4194874a703
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-397074c9-3014-4853-b324-2084af91f72e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397074c9-3014-4853-b324-2084af91f72e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-397074c9-3014-4853-b324-2084af91f72e
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb06d747-e2d1-467c-9c9b-ff91eaff9563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb06d747-e2d1-467c-9c9b-ff91eaff9563
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb06d747-e2d1-467c-9c9b-ff91eaff9563
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd9ad669-00fa-4302-aba1-de219b58a1f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd9ad669-00fa-4302-aba1-de219b58a1f1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd9ad669-00fa-4302-aba1-de219b58a1f1
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-ccda3921-807d-4988-8916-cbddcc3a21aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccda3921-807d-4988-8916-cbddcc3a21aa
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccda3921-807d-4988-8916-cbddcc3a21aa
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8cba378-a72e-4ce1-84ac-b58eab28f17d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8cba378-a72e-4ce1-84ac-b58eab28f17d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8cba378-a72e-4ce1-84ac-b58eab28f17d
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f291a93-8fdc-4fc9-9767-73b26c4701cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f291a93-8fdc-4fc9-9767-73b26c4701cd
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f291a93-8fdc-4fc9-9767-73b26c4701cd
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-74f1b0b1-484b-42d4-b16a-f4beb112e061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74f1b0b1-484b-42d4-b16a-f4beb112e061
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-74f1b0b1-484b-42d4-b16a-f4beb112e061
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3323a84-1c8b-450a-8923-d5f4b89c33bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3323a84-1c8b-450a-8923-d5f4b89c33bd
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3323a84-1c8b-450a-8923-d5f4b89c33bd
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-55df75a1-b1fc-4cc6-8d87-e9f1709ed440

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55df75a1-b1fc-4cc6-8d87-e9f1709ed440
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-55df75a1-b1fc-4cc6-8d87-e9f1709ed440
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-818439af-3cf8-4941-8245-75dfac6d5cad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-818439af-3cf8-4941-8245-75dfac6d5cad
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-818439af-3cf8-4941-8245-75dfac6d5cad
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-b96ca7ff-cdef-48fc-baad-04cd986df46c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b96ca7ff-cdef-48fc-baad-04cd986df46c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b96ca7ff-cdef-48fc-baad-04cd986df46c
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecca3592-6292-4342-b68c-30d86ee3bfd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecca3592-6292-4342-b68c-30d86ee3bfd6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecca3592-6292-4342-b68c-30d86ee3bfd6
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecbb6871-4421-4110-bcdf-5155a933f22c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecbb6871-4421-4110-bcdf-5155a933f22c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecbb6871-4421-4110-bcdf-5155a933f22c
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-537b2e15-ff33-447a-bb9c-8b362bc3ae2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-537b2e15-ff33-447a-bb9c-8b362bc3ae2e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-537b2e15-ff33-447a-bb9c-8b362bc3ae2e
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1aa3469-0987-4523-95bc-9a85f2fd7714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1aa3469-0987-4523-95bc-9a85f2fd7714
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1aa3469-0987-4523-95bc-9a85f2fd7714
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-2db73d41-8b40-42e5-a276-6a98ebb9f0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db73d41-8b40-42e5-a276-6a98ebb9f0bf
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2db73d41-8b40-42e5-a276-6a98ebb9f0bf
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c6e65ad-7f72-4eb5-bedc-3e58e0b41b68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c6e65ad-7f72-4eb5-bedc-3e58e0b41b68
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c6e65ad-7f72-4eb5-bedc-3e58e0b41b68
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b7519d8-cf44-4560-8c69-c0ef27f39fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7519d8-cf44-4560-8c69-c0ef27f39fea
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b7519d8-cf44-4560-8c69-c0ef27f39fea
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9fe24bd-6e1d-4c0d-9ed2-68c16709c8fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fe24bd-6e1d-4c0d-9ed2-68c16709c8fd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9fe24bd-6e1d-4c0d-9ed2-68c16709c8fd
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-01d41111-6177-4429-9347-54c4c71983f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01d41111-6177-4429-9347-54c4c71983f3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-01d41111-6177-4429-9347-54c4c71983f3
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-9bae6d14-577c-49d8-9931-7318810a15af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bae6d14-577c-49d8-9931-7318810a15af
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bae6d14-577c-49d8-9931-7318810a15af
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8d2d8bc-2a3d-481f-8a80-43c71ddb11dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8d2d8bc-2a3d-481f-8a80-43c71ddb11dd
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8d2d8bc-2a3d-481f-8a80-43c71ddb11dd
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-febb5c6c-83b9-4375-a434-1fac86584385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-febb5c6c-83b9-4375-a434-1fac86584385
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-febb5c6c-83b9-4375-a434-1fac86584385
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-82e4c177-52ab-434e-9908-6948c363e8c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e4c177-52ab-434e-9908-6948c363e8c8
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-82e4c177-52ab-434e-9908-6948c363e8c8
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-46c0ca89-100a-42bb-97fb-1de448ee572e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46c0ca89-100a-42bb-97fb-1de448ee572e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-46c0ca89-100a-42bb-97fb-1de448ee572e
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-1548e940-23d0-40b7-98b2-23fd1d11c9c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1548e940-23d0-40b7-98b2-23fd1d11c9c1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1548e940-23d0-40b7-98b2-23fd1d11c9c1
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb0697ae-ee4c-4a69-9ee3-88b1334cc933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb0697ae-ee4c-4a69-9ee3-88b1334cc933
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb0697ae-ee4c-4a69-9ee3-88b1334cc933
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-341b9d5d-72d0-450a-a8e9-7015bbb53bd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-341b9d5d-72d0-450a-a8e9-7015bbb53bd8
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-341b9d5d-72d0-450a-a8e9-7015bbb53bd8
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-509bf630-a97b-417a-a2f2-94f82c9a730f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-509bf630-a97b-417a-a2f2-94f82c9a730f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-509bf630-a97b-417a-a2f2-94f82c9a730f
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ad3fb69-ebd1-4284-9af0-4e7f14682eac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad3fb69-ebd1-4284-9af0-4e7f14682eac
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ad3fb69-ebd1-4284-9af0-4e7f14682eac
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcda26bb-8faa-422f-b8a8-14518c0189a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcda26bb-8faa-422f-b8a8-14518c0189a3
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcda26bb-8faa-422f-b8a8-14518c0189a3
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-3427fa5c-50a0-42fc-814b-b476c349c5c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3427fa5c-50a0-42fc-814b-b476c349c5c5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3427fa5c-50a0-42fc-814b-b476c349c5c5
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b987823-7132-4571-9ee2-d4db3ef9fd01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b987823-7132-4571-9ee2-d4db3ef9fd01
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b987823-7132-4571-9ee2-d4db3ef9fd01
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc7eb75d-8c34-4b42-aca3-521c0c398d46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc7eb75d-8c34-4b42-aca3-521c0c398d46
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc7eb75d-8c34-4b42-aca3-521c0c398d46
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-2947f879-65d7-4d2d-88e4-1ddff02309f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2947f879-65d7-4d2d-88e4-1ddff02309f4
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2947f879-65d7-4d2d-88e4-1ddff02309f4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2947f879-65d7-4d2d-88e4-1ddff02309f4"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-f84da8e7-286b-4ee8-897d-f85e7f6b494d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f84da8e7-286b-4ee8-897d-f85e7f6b494d
Content-Type: application/json

--- request body ---
{"handle":"qa-886edc192110","password":"****"}

--- response: 429 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f84da8e7-286b-4ee8-897d-f85e7f6b494d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-f84da8e7-286b-4ee8-897d-f85e7f6b494d"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-1893da39-0872-4eab-b6a6-06fde35cd5a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1893da39-0872-4eab-b6a6-06fde35cd5a8
Content-Type: application/json

--- request body ---
{"handle":"qa-d375c0489d1c","displayName":"QA d375c0489d1c","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1893da39-0872-4eab-b6a6-06fde35cd5a8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-1893da39-0872-4eab-b6a6-06fde35cd5a8"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ad1542c-2106-4b87-983b-e3fd74fb1cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ad1542c-2106-4b87-983b-e3fd74fb1cfb
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ad1542c-2106-4b87-983b-e3fd74fb1cfb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3ad1542c-2106-4b87-983b-e3fd74fb1cfb"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9668b316-3db1-45b6-aafe-4166617d4190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9668b316-3db1-45b6-aafe-4166617d4190
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9668b316-3db1-45b6-aafe-4166617d4190
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9668b316-3db1-45b6-aafe-4166617d4190"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26d61c38-7d52-4825-a287-bf993de032e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d61c38-7d52-4825-a287-bf993de032e5
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26d61c38-7d52-4825-a287-bf993de032e5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-26d61c38-7d52-4825-a287-bf993de032e5"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-886edc192110
correlation: qa-3f50414d-6100-4992-ade9-a6a13c626701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f50414d-6100-4992-ade9-a6a13c626701
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f50414d-6100-4992-ade9-a6a13c626701
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-886edc192110","correlationId":"qa-3f50414d-6100-4992-ade9-a6a13c626701"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-71578aa1-c34b-479f-b455-e8f354ec9de5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71578aa1-c34b-479f-b455-e8f354ec9de5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-886edc192110","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71578aa1-c34b-479f-b455-e8f354ec9de5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-71578aa1-c34b-479f-b455-e8f354ec9de5"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-b4713ede-8f64-40dc-b197-f973b39faaa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4713ede-8f64-40dc-b197-f973b39faaa0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4713ede-8f64-40dc-b197-f973b39faaa0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-b4713ede-8f64-40dc-b197-f973b39faaa0"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7
correlation: qa-3881330a-1e74-48df-a2d3-453571c8fd7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3881330a-1e74-48df-a2d3-453571c8fd7a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3881330a-1e74-48df-a2d3-453571c8fd7a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7","correlationId":"qa-3881330a-1e74-48df-a2d3-453571c8fd7a"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/messages
correlation: qa-f9122491-89eb-476c-bd08-ff98b2d96c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9122491-89eb-476c-bd08-ff98b2d96c2b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f9122491-89eb-476c-bd08-ff98b2d96c2b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/messages","correlationId":"qa-f9122491-89eb-476c-bd08-ff98b2d96c2b"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/messages
correlation: qa-9eced5f1-27c2-482d-b7c6-5439f941c960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eced5f1-27c2-482d-b7c6-5439f941c960
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9eced5f1-27c2-482d-b7c6-5439f941c960
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/messages","correlationId":"qa-9eced5f1-27c2-482d-b7c6-5439f941c960"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/read
correlation: qa-c5341342-64a2-4d92-bbb6-ef995de225d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5341342-64a2-4d92-bbb6-ef995de225d6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5341342-64a2-4d92-bbb6-ef995de225d6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/read","correlationId":"qa-c5341342-64a2-4d92-bbb6-ef995de225d6"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/close
correlation: qa-60af7bf5-a87d-49ef-9d62-9ff1fa7b3c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60af7bf5-a87d-49ef-9d62-9ff1fa7b3c2a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60af7bf5-a87d-49ef-9d62-9ff1fa7b3c2a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_53cf9c9f-914d-49f8-9c69-a4418574c7c7/close","correlationId":"qa-60af7bf5-a87d-49ef-9d62-9ff1fa7b3c2a"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-cf15e9e2-cb73-45b4-a702-7ba7d3bdac95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf15e9e2-cb73-45b4-a702-7ba7d3bdac95
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf15e9e2-cb73-45b4-a702-7ba7d3bdac95
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-cf15e9e2-cb73-45b4-a702-7ba7d3bdac95"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-e1902e20-4c5f-4f22-80f1-04a070be8bb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1902e20-4c5f-4f22-80f1-04a070be8bb6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1902e20-4c5f-4f22-80f1-04a070be8bb6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-e1902e20-4c5f-4f22-80f1-04a070be8bb6"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3df3470e-7554-4bb5-94ed-521353171a95

--- request headers ---
Accept: application/json
Idempotency-Key: qa-97f8da81766a4757a13604757b8ba09b
X-Correlation-Id: qa-3df3470e-7554-4bb5-94ed-521353171a95
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3df3470e-7554-4bb5-94ed-521353171a95
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-3df3470e-7554-4bb5-94ed-521353171a95"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-9bd0e480-170e-4a3d-89b1-95d4dd5c24d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bd0e480-170e-4a3d-89b1-95d4dd5c24d1
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bd0e480-170e-4a3d-89b1-95d4dd5c24d1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-9bd0e480-170e-4a3d-89b1-95d4dd5c24d1"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-5064329b-f16d-422b-99d1-0da44909296d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5064329b-f16d-422b-99d1-0da44909296d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5064329b-f16d-422b-99d1-0da44909296d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5064329b-f16d-422b-99d1-0da44909296d"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-418be98d-55f7-4798-94bf-b72563033c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-418be98d-55f7-4798-94bf-b72563033c6d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-418be98d-55f7-4798-94bf-b72563033c6d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-418be98d-55f7-4798-94bf-b72563033c6d"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-db770bf7-d374-4b15-844f-8e934eabe5d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db770bf7-d374-4b15-844f-8e934eabe5d0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db770bf7-d374-4b15-844f-8e934eabe5d0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-db770bf7-d374-4b15-844f-8e934eabe5d0"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-670538b0-3d85-4eb1-a243-682c2a1174d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-670538b0-3d85-4eb1-a243-682c2a1174d2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-670538b0-3d85-4eb1-a243-682c2a1174d2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-670538b0-3d85-4eb1-a243-682c2a1174d2"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-995ca842-a376-42c8-8dac-9bed27107f0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-995ca842-a376-42c8-8dac-9bed27107f0d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-995ca842-a376-42c8-8dac-9bed27107f0d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-995ca842-a376-42c8-8dac-9bed27107f0d"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-8524f931-aba1-4609-b23d-09378fdf5043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8524f931-aba1-4609-b23d-09378fdf5043
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8524f931-aba1-4609-b23d-09378fdf5043
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8524f931-aba1-4609-b23d-09378fdf5043"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d13cf6e-053a-4086-9468-ed8f6a91e6a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d13cf6e-053a-4086-9468-ed8f6a91e6a8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d13cf6e-053a-4086-9468-ed8f6a91e6a8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9d13cf6e-053a-4086-9468-ed8f6a91e6a8"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-a93bc3e4-4262-4357-a637-e0731fc3544b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a93bc3e4-4262-4357-a637-e0731fc3544b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a93bc3e4-4262-4357-a637-e0731fc3544b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a93bc3e4-4262-4357-a637-e0731fc3544b"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-b045a377-2711-40e5-8bba-b07f75b0a2e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b045a377-2711-40e5-8bba-b07f75b0a2e8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b045a377-2711-40e5-8bba-b07f75b0a2e8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b045a377-2711-40e5-8bba-b07f75b0a2e8"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8c396f0-1644-4164-8a5a-87097e991fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8c396f0-1644-4164-8a5a-87097e991fb0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8c396f0-1644-4164-8a5a-87097e991fb0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f8c396f0-1644-4164-8a5a-87097e991fb0"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6416e48-e455-4c49-8834-ac8a8fbcc2fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6416e48-e455-4c49-8834-ac8a8fbcc2fa
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6416e48-e455-4c49-8834-ac8a8fbcc2fa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d6416e48-e455-4c49-8834-ac8a8fbcc2fa"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1885f6a-68f5-480d-b513-a3b04967dac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1885f6a-68f5-480d-b513-a3b04967dac6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1885f6a-68f5-480d-b513-a3b04967dac6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a1885f6a-68f5-480d-b513-a3b04967dac6"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-be1e31f7-c562-4b14-a913-44f17fbf01c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be1e31f7-c562-4b14-a913-44f17fbf01c3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be1e31f7-c562-4b14-a913-44f17fbf01c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-be1e31f7-c562-4b14-a913-44f17fbf01c3"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-4eafc4bf-3800-4835-8afb-0fc300addeee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eafc4bf-3800-4835-8afb-0fc300addeee
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4eafc4bf-3800-4835-8afb-0fc300addeee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4eafc4bf-3800-4835-8afb-0fc300addeee"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-33191089-b4ab-4394-9dda-33c5479d19c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33191089-b4ab-4394-9dda-33c5479d19c9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33191089-b4ab-4394-9dda-33c5479d19c9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-33191089-b4ab-4394-9dda-33c5479d19c9"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-a83d7155-1510-4022-bcf0-0e2ed44db54d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a83d7155-1510-4022-bcf0-0e2ed44db54d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a83d7155-1510-4022-bcf0-0e2ed44db54d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a83d7155-1510-4022-bcf0-0e2ed44db54d"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ca765e0-14c0-4d1a-9138-dadf6925b28f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca765e0-14c0-4d1a-9138-dadf6925b28f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ca765e0-14c0-4d1a-9138-dadf6925b28f
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

{"id":"acc_120ef016-89f6-4955-8495-fe0252dfa79f","handle":"qa-886edc192110","displayName":"QA 886edc192110","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.684884360Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-bac2ce7f-03ce-4917-94f3-ee7c6913b300

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac2ce7f-03ce-4917-94f3-ee7c6913b300
Content-Type: application/json

--- request body ---
{"handle":"qa-d32ac65b041a","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-bac2ce7f-03ce-4917-94f3-ee7c6913b300
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e583b6a-9d66-4514-9c78-dd277cb6c359"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a16e011-392f-4963-9619-300b5f6bdaa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a16e011-392f-4963-9619-300b5f6bdaa8
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a16e011-392f-4963-9619-300b5f6bdaa8
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
correlation: qa-9a503feb-aee1-4085-ae54-118821277737

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a503feb-aee1-4085-ae54-118821277737
Content-Type: application/json

--- request body ---
{"handle":"qa-d32ac65b041a","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a503feb-aee1-4085-ae54-118821277737
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a503feb-aee1-4085-ae54-118821277737"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8dc77fa9-ff4e-44f4-8fba-3b5b67d3924c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dc77fa9-ff4e-44f4-8fba-3b5b67d3924c
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8dc77fa9-ff4e-44f4-8fba-3b5b67d3924c
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
correlation: qa-620dbdd6-fd50-4598-8718-f41ea51747ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620dbdd6-fd50-4598-8718-f41ea51747ca
Content-Type: application/json

--- request body ---
{"handle":"qa-886edc192110","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-620dbdd6-fd50-4598-8718-f41ea51747ca
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-620dbdd6-fd50-4598-8718-f41ea51747ca"}
```
