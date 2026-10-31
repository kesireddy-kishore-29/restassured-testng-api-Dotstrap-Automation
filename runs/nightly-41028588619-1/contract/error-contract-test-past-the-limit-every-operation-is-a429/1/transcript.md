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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-218ad677-906f-4915-95c6-8bbfd2efca2c` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-01a9853c-8705-44bb-bf89-fe93c254d506` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-912cf689-262f-494e-83da-51010bac29db` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-69e95fba-5b84-41e0-9b8f-594d546bdc24` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-1f00ee4e-28a5-4881-ae46-2caa3674564b` |
| 6 | `GET /v1/accounts/me` | 200 | 22 | `qa-83e032ee-a79b-47e0-9cda-9606df1c9860` |
| 7 | `GET /v1/accounts/me` | 200 | 15 | `qa-2c2ff259-fbf2-4a5f-8f0b-aa027affa646` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-64dbecea-97fb-42da-9e57-f942d701a203` |
| 9 | `GET /v1/accounts/me` | 200 | 19 | `qa-e87774a6-0b70-4961-9031-a33d2095cfc1` |
| 10 | `GET /v1/accounts/me` | 200 | 13 | `qa-bf2d7175-a893-4357-a8ea-6e7ebe878e06` |
| 11 | `GET /v1/accounts/me` | 200 | 16 | `qa-0443c1b6-0eea-4fa6-a9b7-0cffe0ed0658` |
| 12 | `GET /v1/accounts/me` | 200 | 22 | `qa-2ad6abc1-fb61-4237-9556-28bbb4c36556` |
| 13 | `GET /v1/accounts/me` | 200 | 18 | `qa-1f91297b-cca2-42ce-b748-253bc9e658c5` |
| 14 | `GET /v1/accounts/me` | 200 | 8 | `qa-a1db9008-d312-4ad4-bf8e-e83560b82e43` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-23f60c53-e0c1-4d85-8826-2953bdaa33e4` |
| 16 | `GET /v1/accounts/me` | 200 | 23 | `qa-b3739533-1699-4273-bdf7-ad8a3c7a6808` |
| 17 | `GET /v1/accounts/me` | 200 | 16 | `qa-e9123099-c52b-433b-85e4-e011a8d33999` |
| 18 | `GET /v1/accounts/me` | 200 | 20 | `qa-80cd39fe-fbc6-4e64-b352-aa4b7176b923` |
| 19 | `GET /v1/accounts/me` | 200 | 21 | `qa-236259e0-8e55-4f04-ac02-a34f563f8069` |
| 20 | `GET /v1/accounts/me` | 200 | 24 | `qa-01248f87-b74f-4f5f-badd-7190abdb85de` |
| 21 | `GET /v1/accounts/me` | 200 | 18 | `qa-cb74d109-30c9-4642-b8df-db09e2174dc5` |
| 22 | `GET /v1/accounts/me` | 200 | 25 | `qa-27449a40-1971-4a04-82fa-f0521825cb12` |
| 23 | `GET /v1/accounts/me` | 200 | 17 | `qa-f0924d58-f05e-4563-9b6d-f62e4796d9be` |
| 24 | `GET /v1/accounts/me` | 200 | 11 | `qa-b0628c7c-a511-4a65-9d8c-edf45f768922` |
| 25 | `GET /v1/accounts/me` | 200 | 21 | `qa-9da11fad-d46b-4395-bbaa-c5d709427d19` |
| 26 | `GET /v1/accounts/me` | 200 | 27 | `qa-832ed72b-51dc-4246-ace2-505c98dab056` |
| 27 | `GET /v1/accounts/me` | 200 | 68 | `qa-91842e9b-209c-42da-8de4-34f1212a96d1` |
| 28 | `GET /v1/accounts/me` | 200 | 28 | `qa-4685ec50-4a3d-44dd-b34f-e150c4352e3d` |
| 29 | `GET /v1/accounts/me` | 200 | 14 | `qa-41e95ecc-9465-4ae4-bff6-910dff803cb5` |
| 30 | `GET /v1/accounts/me` | 200 | 16 | `qa-dfa9b620-b445-4fdb-8f97-42c58fd0e9b5` |
| 31 | `GET /v1/accounts/me` | 200 | 22 | `qa-a0cb38b9-738a-42d3-b17b-0d8cc25aa823` |
| 32 | `GET /v1/accounts/me` | 200 | 25 | `qa-32b8a64b-c06e-4bfd-82e1-683a01948c76` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-8391fafb-f579-4633-a532-368127179ba2` |
| 34 | `GET /v1/accounts/me` | 200 | 9 | `qa-0e15be2d-8f00-409c-be8a-0645fa76459b` |
| 35 | `GET /v1/accounts/me` | 200 | 13 | `qa-14e12969-0b00-41f3-874e-2b5fa30916d0` |
| 36 | `GET /v1/accounts/me` | 200 | 14 | `qa-b5efcf2f-0147-498a-a44c-76008e149a2c` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-71d60d0e-3134-4f01-a6c3-ece34c43a53f` |
| 38 | `GET /v1/accounts/me` | 200 | 17 | `qa-d393aaed-3033-4f31-bcb0-5d772bf82b30` |
| 39 | `GET /v1/accounts/me` | 200 | 8 | `qa-db65fecc-0a8a-4922-acf7-89ae43d6d739` |
| 40 | `GET /v1/accounts/me` | 200 | 11 | `qa-e62a5955-cb17-49cc-800a-9b368d5fb250` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-f9285302-434d-45dd-bd6a-914504666dd8` |
| 42 | `GET /v1/accounts/me` | 200 | 15 | `qa-88beeb3f-f660-4008-8a8e-453dee055f3b` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-902099e4-c434-4e42-bc2a-658a42f3bdb7` |
| 44 | `GET /v1/accounts/me` | 200 | 18 | `qa-33cb3d5d-4bda-4a02-990b-3f0e04889d9c` |
| 45 | `GET /v1/accounts/me` | 200 | 17 | `qa-64ae8c0b-8bce-4d67-850a-59c6c0969edc` |
| 46 | `GET /v1/accounts/me` | 200 | 13 | `qa-18dd3367-c3b1-4ec3-988c-f95a1a056f8b` |
| 47 | `GET /v1/accounts/me` | 200 | 19 | `qa-0ab16b85-4114-4d0e-94f4-e675fa817428` |
| 48 | `GET /v1/accounts/me` | 200 | 13 | `qa-7daf4c2b-bdd9-42ef-b7c5-1cad2476f5d5` |
| 49 | `GET /v1/accounts/me` | 200 | 8 | `qa-5c7a24f2-2861-48a2-bb0c-3c3a4687c480` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-4d71a576-100a-42a1-8cae-e337c459b675` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-64f73fac-ac4b-47bc-8c5d-adcccb676d42` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-0a5d3850-577c-4307-b751-845be5b41d7b` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-93f4827b-59e4-4815-87fc-6b93a9b002b9` |
| 54 | `GET /v1/accounts/me` | 200 | 21 | `qa-5578cf73-7077-42ea-a73e-8bff9d1e23cd` |
| 55 | `GET /v1/accounts/me` | 200 | 22 | `qa-4ef4499b-3a71-418f-8b4e-a0ed91efa073` |
| 56 | `GET /v1/accounts/me` | 200 | 13 | `qa-1fb62925-6920-4207-95b3-1d403535c135` |
| 57 | `GET /v1/accounts/me` | 200 | 14 | `qa-31c12c3c-9239-4c54-aa5f-1665ce3f9ce6` |
| 58 | `GET /v1/accounts/me` | 200 | 19 | `qa-39ec3c63-48a0-4b2d-a1e7-c4ff1f867662` |
| 59 | `GET /v1/accounts/me` | 200 | 13 | `qa-871178d9-f908-4932-a4e9-abda1c9ef65a` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-0fdff283-5a44-4e50-b7b6-33d5014ee3e8` |
| 61 | `GET /v1/accounts/me` | 200 | 11 | `qa-4150ebbe-b35a-482b-9f5e-f0fdbb2397dc` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-864bf11c-2abc-4829-8481-efa5ded7cfea` |
| 63 | `GET /v1/accounts/me` | 200 | 22 | `qa-010ba82c-7da0-41a6-ad75-f924cf9aaf79` |
| 64 | `GET /v1/accounts/me` | 429 | 9 | `qa-fa31f493-1fa8-40e1-a20b-aeb275a2055e` |
| 65 | `POST /v1/auth/token` | 429 | 6 | `qa-24410dbb-ddcc-49fb-b250-cc95b13fe08c` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-c0ae0416-ef9e-4514-86b8-53b50c3da16b` |
| 67 | `GET /v1/accounts/me` | 429 | 19 | `qa-d7909d5b-08dd-4fb3-b252-0f7f6e810f6a` |
| 68 | `PATCH /v1/accounts/me` | 429 | 13 | `qa-58eacdf9-840f-4229-8ce3-437397120001` |
| 69 | `DELETE /v1/accounts/me` | 429 | 12 | `qa-7facdfc2-44fa-49d5-b315-59343b1defc8` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-a8e3eb84-aed7-4f1b-8653-aaf43904231e` |
| 71 | `POST /v1/conversations` | 429 | 8 | `qa-dab567b5-3517-4cb9-976e-a192e3f967d2` |
| 72 | `GET /v1/conversations` | 429 | 7 | `qa-b8b56a39-77b0-4775-a9af-e9242243af84` |
| 73 | `GET /v1/conversations/{id}` | 429 | 8 | `qa-b42af11e-bd2f-41e2-bb80-cbf811dc3d42` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 10 | `qa-bf74451f-ecee-405d-906f-2a4e824b0685` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-794318cc-3a13-4e6b-bc27-978f689b3b6a` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-cfd4d704-7f56-4c8d-8f9b-1a248e54939a` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 8 | `qa-038835cf-95dc-46f8-841e-57c8aa09e564` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-6590fa50-48c8-4ab4-a05c-530ed2c40b13` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-84e63089-ff1c-40a4-8e73-279cc94a720a` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-2bb9b5e1-2e91-4fef-83de-3c56e88d24aa` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-b6d5ca5e-3165-4a0e-bbd2-1a3eeeffb440` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-2c5ce223-ea41-4914-8dc3-223320bf890d` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-4269a431-dcc3-473d-9842-ca6d6677fbf0` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-bb1cf425-2c59-4967-a385-18dd6ae9b244` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-08690cae-f051-41a3-9719-1945650758a6` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-41187cd6-2a80-489e-9407-6268a2fd4383` |
| 87 | `GET /v1/accounts/me` | 429 | 5 | `qa-3d30ec82-0d3c-4e9f-ab2f-7d5ddd290804` |
| 88 | `GET /v1/accounts/me` | 429 | 5 | `qa-79f5c321-fb6f-4f68-8a48-d588a0a9e708` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-bb1a89f3-2c34-45f0-a089-13476ea62526` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-97527edd-6a63-4f7f-bfb7-9499d9b9e498` |
| 91 | `GET /v1/accounts/me` | 429 | 5 | `qa-d777bb51-ad38-49b1-961a-35b3e3868ac4` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-9c5ccde7-e03d-4dca-8095-a3459ab51d3a` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-586bdc95-b128-4cc9-8d3a-2063eac65f53` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-6ec1b3cd-811c-4707-bd67-156de5d392e2` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-1481a5bf-6126-4ecf-8dfd-20198e705789` |
| 96 | `GET /v1/accounts/me` | 200 | 5 | `qa-80048b5d-e1bf-46ad-813c-454d50718d0a` |
| 97 | `POST /v1/auth/token` | 200 | 9 | `qa-c114f17e-c6cb-49e4-b041-7726b58aab1b` |
| 98 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-dab8c89d-db4e-4e03-90d5-5b7a07141713` |
| 99 | `POST /v1/auth/token` | 401 | 6 | `qa-3fca92f4-891a-4da4-96be-4b16770487ee` |
| 100 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0c118fa6-4c56-4831-b884-b67c75523116` |
| 101 | `POST /v1/auth/token` | 401 | 5 | `qa-1e5326d1-9bc5-4fae-a594-86bdeddad6be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-218ad677-906f-4915-95c6-8bbfd2efca2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-218ad677-906f-4915-95c6-8bbfd2efca2c
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-218ad677-906f-4915-95c6-8bbfd2efca2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Location: /v1/accounts/qa-4bfda96516d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-01a9853c-8705-44bb-bf89-fe93c254d506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a9853c-8705-44bb-bf89-fe93c254d506
Content-Type: application/json

--- request body ---
{"handle":"qa-0ad70067a0d1","displayName":"QA 0ad70067a0d1","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-01a9853c-8705-44bb-bf89-fe93c254d506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Location: /v1/accounts/qa-0ad70067a0d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44570dfc-ba1b-40e6-aea2-fbeb3fa2ef90","handle":"qa-0ad70067a0d1","displayName":"QA 0ad70067a0d1","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.482884271Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-912cf689-262f-494e-83da-51010bac29db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-912cf689-262f-494e-83da-51010bac29db
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfda96516d9","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-912cf689-262f-494e-83da-51010bac29db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-69e95fba-5b84-41e0-9b8f-594d546bdc24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69e95fba-5b84-41e0-9b8f-594d546bdc24
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0ad70067a0d1","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-69e95fba-5b84-41e0-9b8f-594d546bdc24
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
Location: /v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa","subject":"Error contract","status":"open","region":"eu","participants":["qa-4bfda96516d9","qa-0ad70067a0d1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.606969631Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f00ee4e-28a5-4881-ae46-2caa3674564b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f00ee4e-28a5-4881-ae46-2caa3674564b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f00ee4e-28a5-4881-ae46-2caa3674564b
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-83e032ee-a79b-47e0-9cda-9606df1c9860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e032ee-a79b-47e0-9cda-9606df1c9860
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-83e032ee-a79b-47e0-9cda-9606df1c9860
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c2ff259-fbf2-4a5f-8f0b-aa027affa646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2ff259-fbf2-4a5f-8f0b-aa027affa646
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c2ff259-fbf2-4a5f-8f0b-aa027affa646
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-64dbecea-97fb-42da-9e57-f942d701a203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64dbecea-97fb-42da-9e57-f942d701a203
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-64dbecea-97fb-42da-9e57-f942d701a203
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-e87774a6-0b70-4961-9031-a33d2095cfc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e87774a6-0b70-4961-9031-a33d2095cfc1
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e87774a6-0b70-4961-9031-a33d2095cfc1
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf2d7175-a893-4357-a8ea-6e7ebe878e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf2d7175-a893-4357-a8ea-6e7ebe878e06
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf2d7175-a893-4357-a8ea-6e7ebe878e06
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-0443c1b6-0eea-4fa6-a9b7-0cffe0ed0658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0443c1b6-0eea-4fa6-a9b7-0cffe0ed0658
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0443c1b6-0eea-4fa6-a9b7-0cffe0ed0658
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ad6abc1-fb61-4237-9556-28bbb4c36556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad6abc1-fb61-4237-9556-28bbb4c36556
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ad6abc1-fb61-4237-9556-28bbb4c36556
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f91297b-cca2-42ce-b748-253bc9e658c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f91297b-cca2-42ce-b748-253bc9e658c5
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f91297b-cca2-42ce-b748-253bc9e658c5
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1db9008-d312-4ad4-bf8e-e83560b82e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1db9008-d312-4ad4-bf8e-e83560b82e43
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1db9008-d312-4ad4-bf8e-e83560b82e43
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-23f60c53-e0c1-4d85-8826-2953bdaa33e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f60c53-e0c1-4d85-8826-2953bdaa33e4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-23f60c53-e0c1-4d85-8826-2953bdaa33e4
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3739533-1699-4273-bdf7-ad8a3c7a6808

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3739533-1699-4273-bdf7-ad8a3c7a6808
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3739533-1699-4273-bdf7-ad8a3c7a6808
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9123099-c52b-433b-85e4-e011a8d33999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9123099-c52b-433b-85e4-e011a8d33999
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9123099-c52b-433b-85e4-e011a8d33999
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-80cd39fe-fbc6-4e64-b352-aa4b7176b923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80cd39fe-fbc6-4e64-b352-aa4b7176b923
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-80cd39fe-fbc6-4e64-b352-aa4b7176b923
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-236259e0-8e55-4f04-ac02-a34f563f8069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-236259e0-8e55-4f04-ac02-a34f563f8069
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-236259e0-8e55-4f04-ac02-a34f563f8069
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-01248f87-b74f-4f5f-badd-7190abdb85de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01248f87-b74f-4f5f-badd-7190abdb85de
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-01248f87-b74f-4f5f-badd-7190abdb85de
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb74d109-30c9-4642-b8df-db09e2174dc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb74d109-30c9-4642-b8df-db09e2174dc5
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb74d109-30c9-4642-b8df-db09e2174dc5
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-27449a40-1971-4a04-82fa-f0521825cb12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27449a40-1971-4a04-82fa-f0521825cb12
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-27449a40-1971-4a04-82fa-f0521825cb12
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0924d58-f05e-4563-9b6d-f62e4796d9be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0924d58-f05e-4563-9b6d-f62e4796d9be
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0924d58-f05e-4563-9b6d-f62e4796d9be
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0628c7c-a511-4a65-9d8c-edf45f768922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0628c7c-a511-4a65-9d8c-edf45f768922
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0628c7c-a511-4a65-9d8c-edf45f768922
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-9da11fad-d46b-4395-bbaa-c5d709427d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9da11fad-d46b-4395-bbaa-c5d709427d19
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9da11fad-d46b-4395-bbaa-c5d709427d19
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-832ed72b-51dc-4246-ace2-505c98dab056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-832ed72b-51dc-4246-ace2-505c98dab056
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-832ed72b-51dc-4246-ace2-505c98dab056
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-91842e9b-209c-42da-8de4-34f1212a96d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91842e9b-209c-42da-8de4-34f1212a96d1
Content-Type: application/json

--- response: 200 in 68 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-91842e9b-209c-42da-8de4-34f1212a96d1
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-4685ec50-4a3d-44dd-b34f-e150c4352e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4685ec50-4a3d-44dd-b34f-e150c4352e3d
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4685ec50-4a3d-44dd-b34f-e150c4352e3d
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-41e95ecc-9465-4ae4-bff6-910dff803cb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41e95ecc-9465-4ae4-bff6-910dff803cb5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-41e95ecc-9465-4ae4-bff6-910dff803cb5
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfa9b620-b445-4fdb-8f97-42c58fd0e9b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfa9b620-b445-4fdb-8f97-42c58fd0e9b5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfa9b620-b445-4fdb-8f97-42c58fd0e9b5
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0cb38b9-738a-42d3-b17b-0d8cc25aa823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0cb38b9-738a-42d3-b17b-0d8cc25aa823
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0cb38b9-738a-42d3-b17b-0d8cc25aa823
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-32b8a64b-c06e-4bfd-82e1-683a01948c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b8a64b-c06e-4bfd-82e1-683a01948c76
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-32b8a64b-c06e-4bfd-82e1-683a01948c76
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-8391fafb-f579-4633-a532-368127179ba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8391fafb-f579-4633-a532-368127179ba2
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8391fafb-f579-4633-a532-368127179ba2
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e15be2d-8f00-409c-be8a-0645fa76459b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e15be2d-8f00-409c-be8a-0645fa76459b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e15be2d-8f00-409c-be8a-0645fa76459b
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-14e12969-0b00-41f3-874e-2b5fa30916d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14e12969-0b00-41f3-874e-2b5fa30916d0
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-14e12969-0b00-41f3-874e-2b5fa30916d0
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5efcf2f-0147-498a-a44c-76008e149a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5efcf2f-0147-498a-a44c-76008e149a2c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5efcf2f-0147-498a-a44c-76008e149a2c
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-71d60d0e-3134-4f01-a6c3-ece34c43a53f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71d60d0e-3134-4f01-a6c3-ece34c43a53f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-71d60d0e-3134-4f01-a6c3-ece34c43a53f
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-d393aaed-3033-4f31-bcb0-5d772bf82b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d393aaed-3033-4f31-bcb0-5d772bf82b30
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d393aaed-3033-4f31-bcb0-5d772bf82b30
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-db65fecc-0a8a-4922-acf7-89ae43d6d739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db65fecc-0a8a-4922-acf7-89ae43d6d739
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-db65fecc-0a8a-4922-acf7-89ae43d6d739
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-e62a5955-cb17-49cc-800a-9b368d5fb250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e62a5955-cb17-49cc-800a-9b368d5fb250
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e62a5955-cb17-49cc-800a-9b368d5fb250
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9285302-434d-45dd-bd6a-914504666dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9285302-434d-45dd-bd6a-914504666dd8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9285302-434d-45dd-bd6a-914504666dd8
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-88beeb3f-f660-4008-8a8e-453dee055f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88beeb3f-f660-4008-8a8e-453dee055f3b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-88beeb3f-f660-4008-8a8e-453dee055f3b
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-902099e4-c434-4e42-bc2a-658a42f3bdb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-902099e4-c434-4e42-bc2a-658a42f3bdb7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-902099e4-c434-4e42-bc2a-658a42f3bdb7
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-33cb3d5d-4bda-4a02-990b-3f0e04889d9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33cb3d5d-4bda-4a02-990b-3f0e04889d9c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-33cb3d5d-4bda-4a02-990b-3f0e04889d9c
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-64ae8c0b-8bce-4d67-850a-59c6c0969edc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64ae8c0b-8bce-4d67-850a-59c6c0969edc
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-64ae8c0b-8bce-4d67-850a-59c6c0969edc
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-18dd3367-c3b1-4ec3-988c-f95a1a056f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18dd3367-c3b1-4ec3-988c-f95a1a056f8b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-18dd3367-c3b1-4ec3-988c-f95a1a056f8b
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ab16b85-4114-4d0e-94f4-e675fa817428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab16b85-4114-4d0e-94f4-e675fa817428
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ab16b85-4114-4d0e-94f4-e675fa817428
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-7daf4c2b-bdd9-42ef-b7c5-1cad2476f5d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7daf4c2b-bdd9-42ef-b7c5-1cad2476f5d5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7daf4c2b-bdd9-42ef-b7c5-1cad2476f5d5
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c7a24f2-2861-48a2-bb0c-3c3a4687c480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c7a24f2-2861-48a2-bb0c-3c3a4687c480
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c7a24f2-2861-48a2-bb0c-3c3a4687c480
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d71a576-100a-42a1-8cae-e337c459b675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d71a576-100a-42a1-8cae-e337c459b675
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d71a576-100a-42a1-8cae-e337c459b675
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-64f73fac-ac4b-47bc-8c5d-adcccb676d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64f73fac-ac4b-47bc-8c5d-adcccb676d42
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-64f73fac-ac4b-47bc-8c5d-adcccb676d42
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a5d3850-577c-4307-b751-845be5b41d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a5d3850-577c-4307-b751-845be5b41d7b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a5d3850-577c-4307-b751-845be5b41d7b
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-93f4827b-59e4-4815-87fc-6b93a9b002b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93f4827b-59e4-4815-87fc-6b93a9b002b9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-93f4827b-59e4-4815-87fc-6b93a9b002b9
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-5578cf73-7077-42ea-a73e-8bff9d1e23cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5578cf73-7077-42ea-a73e-8bff9d1e23cd
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5578cf73-7077-42ea-a73e-8bff9d1e23cd
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ef4499b-3a71-418f-8b4e-a0ed91efa073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ef4499b-3a71-418f-8b4e-a0ed91efa073
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ef4499b-3a71-418f-8b4e-a0ed91efa073
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-1fb62925-6920-4207-95b3-1d403535c135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fb62925-6920-4207-95b3-1d403535c135
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fb62925-6920-4207-95b3-1d403535c135
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-31c12c3c-9239-4c54-aa5f-1665ce3f9ce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31c12c3c-9239-4c54-aa5f-1665ce3f9ce6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-31c12c3c-9239-4c54-aa5f-1665ce3f9ce6
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-39ec3c63-48a0-4b2d-a1e7-c4ff1f867662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39ec3c63-48a0-4b2d-a1e7-c4ff1f867662
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-39ec3c63-48a0-4b2d-a1e7-c4ff1f867662
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-871178d9-f908-4932-a4e9-abda1c9ef65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-871178d9-f908-4932-a4e9-abda1c9ef65a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-871178d9-f908-4932-a4e9-abda1c9ef65a
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fdff283-5a44-4e50-b7b6-33d5014ee3e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fdff283-5a44-4e50-b7b6-33d5014ee3e8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fdff283-5a44-4e50-b7b6-33d5014ee3e8
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-4150ebbe-b35a-482b-9f5e-f0fdbb2397dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4150ebbe-b35a-482b-9f5e-f0fdbb2397dc
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4150ebbe-b35a-482b-9f5e-f0fdbb2397dc
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-864bf11c-2abc-4829-8481-efa5ded7cfea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-864bf11c-2abc-4829-8481-efa5ded7cfea
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-864bf11c-2abc-4829-8481-efa5ded7cfea
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-010ba82c-7da0-41a6-ad75-f924cf9aaf79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-010ba82c-7da0-41a6-ad75-f924cf9aaf79
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-010ba82c-7da0-41a6-ad75-f924cf9aaf79
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa31f493-1fa8-40e1-a20b-aeb275a2055e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa31f493-1fa8-40e1-a20b-aeb275a2055e
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa31f493-1fa8-40e1-a20b-aeb275a2055e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fa31f493-1fa8-40e1-a20b-aeb275a2055e"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-24410dbb-ddcc-49fb-b250-cc95b13fe08c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24410dbb-ddcc-49fb-b250-cc95b13fe08c
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfda96516d9","password":"****"}

--- response: 429 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24410dbb-ddcc-49fb-b250-cc95b13fe08c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-24410dbb-ddcc-49fb-b250-cc95b13fe08c"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-c0ae0416-ef9e-4514-86b8-53b50c3da16b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ae0416-ef9e-4514-86b8-53b50c3da16b
Content-Type: application/json

--- request body ---
{"handle":"qa-c1814c1310fa","displayName":"QA c1814c1310fa","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0ae0416-ef9e-4514-86b8-53b50c3da16b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-c0ae0416-ef9e-4514-86b8-53b50c3da16b"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7909d5b-08dd-4fb3-b252-0f7f6e810f6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7909d5b-08dd-4fb3-b252-0f7f6e810f6a
Content-Type: application/json

--- response: 429 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7909d5b-08dd-4fb3-b252-0f7f6e810f6a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7909d5b-08dd-4fb3-b252-0f7f6e810f6a"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-58eacdf9-840f-4229-8ce3-437397120001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58eacdf9-840f-4229-8ce3-437397120001
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58eacdf9-840f-4229-8ce3-437397120001
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-58eacdf9-840f-4229-8ce3-437397120001"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7facdfc2-44fa-49d5-b315-59343b1defc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7facdfc2-44fa-49d5-b315-59343b1defc8
Content-Type: application/json

--- response: 429 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7facdfc2-44fa-49d5-b315-59343b1defc8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7facdfc2-44fa-49d5-b315-59343b1defc8"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-4bfda96516d9
correlation: qa-a8e3eb84-aed7-4f1b-8653-aaf43904231e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8e3eb84-aed7-4f1b-8653-aaf43904231e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8e3eb84-aed7-4f1b-8653-aaf43904231e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-4bfda96516d9","correlationId":"qa-a8e3eb84-aed7-4f1b-8653-aaf43904231e"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-dab567b5-3517-4cb9-976e-a192e3f967d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab567b5-3517-4cb9-976e-a192e3f967d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4bfda96516d9","subject":"Probe","message":"Hi"}

--- response: 429 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dab567b5-3517-4cb9-976e-a192e3f967d2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-dab567b5-3517-4cb9-976e-a192e3f967d2"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-b8b56a39-77b0-4775-a9af-e9242243af84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8b56a39-77b0-4775-a9af-e9242243af84
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8b56a39-77b0-4775-a9af-e9242243af84
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-b8b56a39-77b0-4775-a9af-e9242243af84"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa
correlation: qa-b42af11e-bd2f-41e2-bb80-cbf811dc3d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b42af11e-bd2f-41e2-bb80-cbf811dc3d42
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b42af11e-bd2f-41e2-bb80-cbf811dc3d42
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa","correlationId":"qa-b42af11e-bd2f-41e2-bb80-cbf811dc3d42"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/messages
correlation: qa-bf74451f-ecee-405d-906f-2a4e824b0685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf74451f-ecee-405d-906f-2a4e824b0685
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf74451f-ecee-405d-906f-2a4e824b0685
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/messages","correlationId":"qa-bf74451f-ecee-405d-906f-2a4e824b0685"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/messages
correlation: qa-794318cc-3a13-4e6b-bc27-978f689b3b6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-794318cc-3a13-4e6b-bc27-978f689b3b6a
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-794318cc-3a13-4e6b-bc27-978f689b3b6a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/messages","correlationId":"qa-794318cc-3a13-4e6b-bc27-978f689b3b6a"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/read
correlation: qa-cfd4d704-7f56-4c8d-8f9b-1a248e54939a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfd4d704-7f56-4c8d-8f9b-1a248e54939a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfd4d704-7f56-4c8d-8f9b-1a248e54939a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/read","correlationId":"qa-cfd4d704-7f56-4c8d-8f9b-1a248e54939a"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/close
correlation: qa-038835cf-95dc-46f8-841e-57c8aa09e564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-038835cf-95dc-46f8-841e-57c8aa09e564
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-038835cf-95dc-46f8-841e-57c8aa09e564
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_26ac8fff-52c2-4381-9fc5-b67e5870c3fa/close","correlationId":"qa-038835cf-95dc-46f8-841e-57c8aa09e564"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-6590fa50-48c8-4ab4-a05c-530ed2c40b13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6590fa50-48c8-4ab4-a05c-530ed2c40b13
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6590fa50-48c8-4ab4-a05c-530ed2c40b13
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-6590fa50-48c8-4ab4-a05c-530ed2c40b13"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-84e63089-ff1c-40a4-8e73-279cc94a720a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84e63089-ff1c-40a4-8e73-279cc94a720a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84e63089-ff1c-40a4-8e73-279cc94a720a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-84e63089-ff1c-40a4-8e73-279cc94a720a"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2bb9b5e1-2e91-4fef-83de-3c56e88d24aa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3268ce1a859a44768433b43f2c86b347
X-Correlation-Id: qa-2bb9b5e1-2e91-4fef-83de-3c56e88d24aa
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bb9b5e1-2e91-4fef-83de-3c56e88d24aa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-2bb9b5e1-2e91-4fef-83de-3c56e88d24aa"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-b6d5ca5e-3165-4a0e-bbd2-1a3eeeffb440

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6d5ca5e-3165-4a0e-bbd2-1a3eeeffb440
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6d5ca5e-3165-4a0e-bbd2-1a3eeeffb440
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-b6d5ca5e-3165-4a0e-bbd2-1a3eeeffb440"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c5ce223-ea41-4914-8dc3-223320bf890d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c5ce223-ea41-4914-8dc3-223320bf890d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c5ce223-ea41-4914-8dc3-223320bf890d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2c5ce223-ea41-4914-8dc3-223320bf890d"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-4269a431-dcc3-473d-9842-ca6d6677fbf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4269a431-dcc3-473d-9842-ca6d6677fbf0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4269a431-dcc3-473d-9842-ca6d6677fbf0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4269a431-dcc3-473d-9842-ca6d6677fbf0"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb1cf425-2c59-4967-a385-18dd6ae9b244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb1cf425-2c59-4967-a385-18dd6ae9b244
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb1cf425-2c59-4967-a385-18dd6ae9b244
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bb1cf425-2c59-4967-a385-18dd6ae9b244"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-08690cae-f051-41a3-9719-1945650758a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08690cae-f051-41a3-9719-1945650758a6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08690cae-f051-41a3-9719-1945650758a6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-08690cae-f051-41a3-9719-1945650758a6"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-41187cd6-2a80-489e-9407-6268a2fd4383

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41187cd6-2a80-489e-9407-6268a2fd4383
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-41187cd6-2a80-489e-9407-6268a2fd4383
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-41187cd6-2a80-489e-9407-6268a2fd4383"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d30ec82-0d3c-4e9f-ab2f-7d5ddd290804

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d30ec82-0d3c-4e9f-ab2f-7d5ddd290804
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d30ec82-0d3c-4e9f-ab2f-7d5ddd290804
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3d30ec82-0d3c-4e9f-ab2f-7d5ddd290804"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-79f5c321-fb6f-4f68-8a48-d588a0a9e708

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79f5c321-fb6f-4f68-8a48-d588a0a9e708
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79f5c321-fb6f-4f68-8a48-d588a0a9e708
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-79f5c321-fb6f-4f68-8a48-d588a0a9e708"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb1a89f3-2c34-45f0-a089-13476ea62526

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb1a89f3-2c34-45f0-a089-13476ea62526
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb1a89f3-2c34-45f0-a089-13476ea62526
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bb1a89f3-2c34-45f0-a089-13476ea62526"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-97527edd-6a63-4f7f-bfb7-9499d9b9e498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97527edd-6a63-4f7f-bfb7-9499d9b9e498
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97527edd-6a63-4f7f-bfb7-9499d9b9e498
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-97527edd-6a63-4f7f-bfb7-9499d9b9e498"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-d777bb51-ad38-49b1-961a-35b3e3868ac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d777bb51-ad38-49b1-961a-35b3e3868ac4
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d777bb51-ad38-49b1-961a-35b3e3868ac4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d777bb51-ad38-49b1-961a-35b3e3868ac4"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c5ccde7-e03d-4dca-8095-a3459ab51d3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c5ccde7-e03d-4dca-8095-a3459ab51d3a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c5ccde7-e03d-4dca-8095-a3459ab51d3a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9c5ccde7-e03d-4dca-8095-a3459ab51d3a"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-586bdc95-b128-4cc9-8d3a-2063eac65f53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586bdc95-b128-4cc9-8d3a-2063eac65f53
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-586bdc95-b128-4cc9-8d3a-2063eac65f53
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-586bdc95-b128-4cc9-8d3a-2063eac65f53"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ec1b3cd-811c-4707-bd67-156de5d392e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ec1b3cd-811c-4707-bd67-156de5d392e2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ec1b3cd-811c-4707-bd67-156de5d392e2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ec1b3cd-811c-4707-bd67-156de5d392e2"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-1481a5bf-6126-4ecf-8dfd-20198e705789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1481a5bf-6126-4ecf-8dfd-20198e705789
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1481a5bf-6126-4ecf-8dfd-20198e705789
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1481a5bf-6126-4ecf-8dfd-20198e705789"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-80048b5d-e1bf-46ad-813c-454d50718d0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80048b5d-e1bf-46ad-813c-454d50718d0a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-80048b5d-e1bf-46ad-813c-454d50718d0a
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

{"id":"acc_54d7b84e-800e-4805-9d05-ed0ae383f3c3","handle":"qa-4bfda96516d9","displayName":"QA 4bfda96516d9","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.430525074Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-c114f17e-c6cb-49e4-b041-7726b58aab1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c114f17e-c6cb-49e4-b041-7726b58aab1b
Content-Type: application/json

--- request body ---
{"handle":"qa-0ad70067a0d1","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c114f17e-c6cb-49e4-b041-7726b58aab1b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44570dfc-ba1b-40e6-aea2-fbeb3fa2ef90"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dab8c89d-db4e-4e03-90d5-5b7a07141713

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dab8c89d-db4e-4e03-90d5-5b7a07141713
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dab8c89d-db4e-4e03-90d5-5b7a07141713
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
correlation: qa-3fca92f4-891a-4da4-96be-4b16770487ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fca92f4-891a-4da4-96be-4b16770487ee
Content-Type: application/json

--- request body ---
{"handle":"qa-0ad70067a0d1","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fca92f4-891a-4da4-96be-4b16770487ee
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3fca92f4-891a-4da4-96be-4b16770487ee"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c118fa6-4c56-4831-b884-b67c75523116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c118fa6-4c56-4831-b884-b67c75523116
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c118fa6-4c56-4831-b884-b67c75523116
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
correlation: qa-1e5326d1-9bc5-4fae-a594-86bdeddad6be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e5326d1-9bc5-4fae-a594-86bdeddad6be
Content-Type: application/json

--- request body ---
{"handle":"qa-4bfda96516d9","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 30 Oct 2026 08:46:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e5326d1-9bc5-4fae-a594-86bdeddad6be
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1e5326d1-9bc5-4fae-a594-86bdeddad6be"}
```
