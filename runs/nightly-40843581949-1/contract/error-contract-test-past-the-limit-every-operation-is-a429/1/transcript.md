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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-f3937830-8a5b-4e27-abb3-866e84120f7e` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-6b8632ad-e3d1-4183-a928-c0dc25428260` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-ac5074cb-b5b2-4910-a8f5-c3c87fc4e748` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-f30ee362-390e-4750-ac1c-2d4d2366bd06` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-cbdfd811-2aa8-4418-b172-1a81a61b9294` |
| 6 | `GET /v1/accounts/me` | 200 | 18 | `qa-1efce7bb-b528-45b0-a32d-c5c887624d19` |
| 7 | `GET /v1/accounts/me` | 200 | 15 | `qa-f85326e1-f29e-4988-900b-03de5bb8e6cf` |
| 8 | `GET /v1/accounts/me` | 200 | 16 | `qa-8c2c53b7-dad6-45e2-bf68-fe94e659dcf0` |
| 9 | `GET /v1/accounts/me` | 200 | 23 | `qa-8a06088f-3c6f-4ebe-a3d9-9cdbfda6609e` |
| 10 | `GET /v1/accounts/me` | 200 | 13 | `qa-11a9d45d-e643-49ce-84e4-27dbc15280d4` |
| 11 | `GET /v1/accounts/me` | 200 | 22 | `qa-a6d63b59-c469-4f22-bb0a-685371b75201` |
| 12 | `GET /v1/accounts/me` | 200 | 18 | `qa-d74b2a90-b682-4d30-9c2c-b28b27f86233` |
| 13 | `GET /v1/accounts/me` | 200 | 16 | `qa-db5ba91b-854c-424c-ad7c-6822e0409bf1` |
| 14 | `GET /v1/accounts/me` | 200 | 20 | `qa-006f4eb5-c7a9-494b-97bf-2ffa999b678a` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-2f0d7917-5432-46d0-8b37-a05b607021fb` |
| 16 | `GET /v1/accounts/me` | 200 | 25 | `qa-bc0902f0-05b9-4ab6-826e-2f0c535e0efe` |
| 17 | `GET /v1/accounts/me` | 200 | 16 | `qa-1c75b895-2279-453e-96ce-df8fb80a8ee7` |
| 18 | `GET /v1/accounts/me` | 200 | 29 | `qa-0309f5d1-50c8-46cf-8132-36e1dec0f5bc` |
| 19 | `GET /v1/accounts/me` | 200 | 32 | `qa-9458d73c-402d-4b48-86e0-0e52f675f1ce` |
| 20 | `GET /v1/accounts/me` | 200 | 26 | `qa-af5d972e-daae-46f1-85fd-01e58f8913b1` |
| 21 | `GET /v1/accounts/me` | 200 | 28 | `qa-97a80556-5dd5-4710-ba8a-56be09a7c768` |
| 22 | `GET /v1/accounts/me` | 200 | 19 | `qa-a4aa6017-01f4-469e-a14e-775d3efa531e` |
| 23 | `GET /v1/accounts/me` | 200 | 21 | `qa-296d290a-7522-4e4e-8803-7dca181a352a` |
| 24 | `GET /v1/accounts/me` | 200 | 23 | `qa-ef2756df-60b1-4de2-b4d2-9e62771fc29a` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-f7f8eb87-87e9-4416-bf1d-b392924b727e` |
| 26 | `GET /v1/accounts/me` | 200 | 27 | `qa-9233478f-c524-4745-84e0-b647f68ae511` |
| 27 | `GET /v1/accounts/me` | 200 | 11 | `qa-6eab6387-b14d-44f7-971c-c9ea53d3f7d1` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-19ff86e1-21d0-4314-8949-877a4c5eb351` |
| 29 | `GET /v1/accounts/me` | 200 | 40 | `qa-10c945d7-bfd2-46a8-b212-a19400c189f7` |
| 30 | `GET /v1/accounts/me` | 200 | 18 | `qa-31f0a16c-4e98-4596-a247-d7032723a4a1` |
| 31 | `GET /v1/accounts/me` | 200 | 16 | `qa-4a542a93-9c34-42e6-8ad6-5583f11eafa0` |
| 32 | `GET /v1/accounts/me` | 200 | 11 | `qa-a804b508-7605-4d6e-8c05-8b250cd2ceb6` |
| 33 | `GET /v1/accounts/me` | 200 | 10 | `qa-84ef2f00-aa18-4483-b7a3-7d3006200f05` |
| 34 | `GET /v1/accounts/me` | 200 | 9 | `qa-58253dc5-2fe5-40f7-9b2e-557bca40c0cd` |
| 35 | `GET /v1/accounts/me` | 200 | 19 | `qa-47045796-79f2-4358-9fad-7c8c39832dda` |
| 36 | `GET /v1/accounts/me` | 200 | 10 | `qa-d19e97be-dbd5-4492-a711-d6acc0cd20cd` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-462128fd-f64a-4ae2-9a1a-acbdb20afdaa` |
| 38 | `GET /v1/accounts/me` | 200 | 15 | `qa-86d36b7c-175b-4cc8-9f96-6aad855a412d` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-1fc5d89f-9d31-4710-bbc5-63525f6afd59` |
| 40 | `GET /v1/accounts/me` | 200 | 7 | `qa-0d8f9e4f-d9eb-43c7-b750-18eb7135a0fa` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-16b6cce1-788f-4eee-bc0f-417ddae506e7` |
| 42 | `GET /v1/accounts/me` | 200 | 10 | `qa-e48fda79-2a30-4490-abb5-19b87f342a59` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-23ca2b13-c34e-4696-88af-f4c64df98563` |
| 44 | `GET /v1/accounts/me` | 200 | 10 | `qa-d3d1f81d-ae01-4e0e-a250-cbb14a0d7a33` |
| 45 | `GET /v1/accounts/me` | 200 | 3 | `qa-e406ec74-3d30-408a-81c5-37314bb5fa71` |
| 46 | `GET /v1/accounts/me` | 200 | 4 | `qa-60ce65ae-2a04-4c49-b14f-6bc208a3ae62` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-8c809d21-b944-4e53-a9c0-0d30ece1ee43` |
| 48 | `GET /v1/accounts/me` | 200 | 24 | `qa-45b463f1-1e89-4c2a-b366-686b90782f3a` |
| 49 | `GET /v1/accounts/me` | 200 | 14 | `qa-a3fbcf4e-79cb-4268-9601-ca4b66723784` |
| 50 | `GET /v1/accounts/me` | 200 | 52 | `qa-e6751f2e-ae39-4530-a668-5c65bf304f8c` |
| 51 | `GET /v1/accounts/me` | 200 | 20 | `qa-0accb97c-5952-4df4-affd-b7a9247b98cf` |
| 52 | `GET /v1/accounts/me` | 200 | 9 | `qa-012fe634-574e-4787-82f7-79df7a685a73` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-548787a9-7a2d-468c-b867-8490e806b936` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-9f9699ca-6fe9-460e-9957-4a505f8b30f1` |
| 55 | `GET /v1/accounts/me` | 200 | 20 | `qa-983d21d7-bf73-40de-b1f6-55bc4d7860dc` |
| 56 | `GET /v1/accounts/me` | 200 | 23 | `qa-af5cda57-6b07-4857-bb74-78c145a838bb` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-e63ec9ba-d144-46a0-b2c2-0ece9eeb8ab1` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-f126f48b-48c6-47c3-bb50-4ea7f0951697` |
| 59 | `GET /v1/accounts/me` | 200 | 9 | `qa-9171eda5-2b40-4f6e-b7c3-857439b57411` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-51b93c6e-c6c1-442f-a5e1-15fa4e331dac` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-fc1be8bd-6998-4334-b6f6-604148ce638d` |
| 62 | `GET /v1/accounts/me` | 200 | 7 | `qa-4cf7a4d5-0474-4f5e-8c0a-e918794787db` |
| 63 | `GET /v1/accounts/me` | 200 | 4 | `qa-8091a1f8-2c13-44b5-a0de-6ee0c9deb236` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-86f53478-ea49-41ef-9789-9a28417fa43d` |
| 65 | `POST /v1/auth/token` | 429 | 7 | `qa-f5115c38-6a71-482d-8168-fa30456a00ea` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-302a38be-d989-4c35-b884-47332dd8bae7` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-02466b3f-579a-4dac-a7e2-4e4024d29105` |
| 68 | `PATCH /v1/accounts/me` | 429 | 14 | `qa-31f857ad-1250-422e-a1c8-eac1b9809fce` |
| 69 | `DELETE /v1/accounts/me` | 429 | 16 | `qa-44ac9045-01c6-4195-b536-e848207fda66` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 6 | `qa-dde8da0c-8eae-4c00-9181-b1d87b269647` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-7b4e0981-0671-40e7-a156-c725b3acbb5e` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-9a93b586-f18a-43e0-8194-a45be9cb907f` |
| 73 | `GET /v1/conversations/{id}` | 429 | 6 | `qa-6ec10dde-cddc-4304-8d02-5f7d6e9399e6` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 5 | `qa-99d45ae0-bda7-4835-b423-97a3f8a32d05` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-b395d5f1-2860-4781-a416-38ae26974c24` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-a872fe33-aeb6-497d-b7f0-303c16d22984` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-59bb02aa-2e3a-4a81-aab2-6d1d617e7e22` |
| 78 | `GET /v1/credits/balance` | 429 | 5 | `qa-0894be83-af17-4763-89a7-6a9f21c5c451` |
| 79 | `GET /v1/credits/ledger` | 429 | 5 | `qa-1ca52a04-775c-48b6-9450-826a2b861366` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-c3fd86d3-6b49-4da2-8515-2682eb408acc` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-2eb64b46-4705-48c5-9d65-3ad15b0e545e` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-fb0bd182-047e-4dd4-8ed3-7e812e485adf` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-9978926a-63ae-4857-b14b-5bec0b8ec933` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-da4b1934-3698-43f5-948a-8c48a4c78b6d` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-979473bd-ac01-49cd-9caa-2ea35ef5b4cf` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-4795b297-52e3-4a8d-9e7a-46b990bcf947` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-4c4f5f47-07b1-426c-b8f1-263d0a3d2345` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-581aa721-beea-4b89-af4b-b74978b18fec` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-1f97eb7c-c7e0-4612-a406-afc2c6bb283f` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-9d04d41f-1114-4f7e-8739-01e676ebe4a7` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-30540f26-33ac-45ea-a3bd-60760a14d2e6` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-0c7098a7-987f-4484-93d6-2836d911e5f7` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-5aad3619-9022-449e-89d4-37839f0fb48e` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-c142b495-ba91-4d1f-824a-08bcd5e2da5f` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-2205f978-68f2-4b67-aebc-65dac8fc966c` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-d1a0fce5-773e-4d91-a650-d0be0b664114` |
| 97 | `GET /v1/accounts/me` | 200 | 5 | `qa-89d0e3b6-1ff2-4b0b-8a3f-ee2c2daf2182` |
| 98 | `POST /v1/auth/token` | 200 | 8 | `qa-752f40c6-c63b-45c2-a733-10fd3025d2aa` |
| 99 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-984bf3c9-2a5a-4144-8f29-d818f8721d07` |
| 100 | `POST /v1/auth/token` | 401 | 4 | `qa-93d3ff61-6e98-480a-b2d9-e77d4da0fdf4` |
| 101 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-7d7808a0-9815-49a6-b6dc-591c34e81c0f` |
| 102 | `POST /v1/auth/token` | 401 | 4 | `qa-9cd1ff32-1ed9-4679-8cfd-1d3469566400` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f3937830-8a5b-4e27-abb3-866e84120f7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3937830-8a5b-4e27-abb3-866e84120f7e
Content-Type: application/json

--- request body ---
{"handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3937830-8a5b-4e27-abb3-866e84120f7e
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
Location: /v1/accounts/qa-d04b4a29d0c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b8632ad-e3d1-4183-a928-c0dc25428260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8632ad-e3d1-4183-a928-c0dc25428260
Content-Type: application/json

--- request body ---
{"handle":"qa-693760357560","displayName":"QA 693760357560","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b8632ad-e3d1-4183-a928-c0dc25428260
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
Location: /v1/accounts/qa-693760357560
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01bbee9f-5db6-4d04-9b3b-6549cbd089ac","handle":"qa-693760357560","displayName":"QA 693760357560","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.438476057Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ac5074cb-b5b2-4910-a8f5-c3c87fc4e748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac5074cb-b5b2-4910-a8f5-c3c87fc4e748
Content-Type: application/json

--- request body ---
{"handle":"qa-d04b4a29d0c0","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac5074cb-b5b2-4910-a8f5-c3c87fc4e748
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f30ee362-390e-4750-ac1c-2d4d2366bd06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f30ee362-390e-4750-ac1c-2d4d2366bd06
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-693760357560","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f30ee362-390e-4750-ac1c-2d4d2366bd06
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
Location: /v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_da58d49b-585f-472d-9882-a7601ec3f5a5","subject":"Error contract","status":"open","region":"eu","participants":["qa-d04b4a29d0c0","qa-693760357560"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.502639124Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbdfd811-2aa8-4418-b172-1a81a61b9294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbdfd811-2aa8-4418-b172-1a81a61b9294
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbdfd811-2aa8-4418-b172-1a81a61b9294
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-1efce7bb-b528-45b0-a32d-c5c887624d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1efce7bb-b528-45b0-a32d-c5c887624d19
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1efce7bb-b528-45b0-a32d-c5c887624d19
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-f85326e1-f29e-4988-900b-03de5bb8e6cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f85326e1-f29e-4988-900b-03de5bb8e6cf
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f85326e1-f29e-4988-900b-03de5bb8e6cf
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c2c53b7-dad6-45e2-bf68-fe94e659dcf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2c53b7-dad6-45e2-bf68-fe94e659dcf0
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2c53b7-dad6-45e2-bf68-fe94e659dcf0
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a06088f-3c6f-4ebe-a3d9-9cdbfda6609e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a06088f-3c6f-4ebe-a3d9-9cdbfda6609e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a06088f-3c6f-4ebe-a3d9-9cdbfda6609e
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-11a9d45d-e643-49ce-84e4-27dbc15280d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11a9d45d-e643-49ce-84e4-27dbc15280d4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-11a9d45d-e643-49ce-84e4-27dbc15280d4
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6d63b59-c469-4f22-bb0a-685371b75201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6d63b59-c469-4f22-bb0a-685371b75201
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6d63b59-c469-4f22-bb0a-685371b75201
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-d74b2a90-b682-4d30-9c2c-b28b27f86233

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d74b2a90-b682-4d30-9c2c-b28b27f86233
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d74b2a90-b682-4d30-9c2c-b28b27f86233
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-db5ba91b-854c-424c-ad7c-6822e0409bf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db5ba91b-854c-424c-ad7c-6822e0409bf1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-db5ba91b-854c-424c-ad7c-6822e0409bf1
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-006f4eb5-c7a9-494b-97bf-2ffa999b678a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-006f4eb5-c7a9-494b-97bf-2ffa999b678a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-006f4eb5-c7a9-494b-97bf-2ffa999b678a
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f0d7917-5432-46d0-8b37-a05b607021fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f0d7917-5432-46d0-8b37-a05b607021fb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f0d7917-5432-46d0-8b37-a05b607021fb
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc0902f0-05b9-4ab6-826e-2f0c535e0efe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc0902f0-05b9-4ab6-826e-2f0c535e0efe
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc0902f0-05b9-4ab6-826e-2f0c535e0efe
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c75b895-2279-453e-96ce-df8fb80a8ee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c75b895-2279-453e-96ce-df8fb80a8ee7
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c75b895-2279-453e-96ce-df8fb80a8ee7
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-0309f5d1-50c8-46cf-8132-36e1dec0f5bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0309f5d1-50c8-46cf-8132-36e1dec0f5bc
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0309f5d1-50c8-46cf-8132-36e1dec0f5bc
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-9458d73c-402d-4b48-86e0-0e52f675f1ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9458d73c-402d-4b48-86e0-0e52f675f1ce
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9458d73c-402d-4b48-86e0-0e52f675f1ce
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-af5d972e-daae-46f1-85fd-01e58f8913b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5d972e-daae-46f1-85fd-01e58f8913b1
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-af5d972e-daae-46f1-85fd-01e58f8913b1
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-97a80556-5dd5-4710-ba8a-56be09a7c768

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a80556-5dd5-4710-ba8a-56be09a7c768
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-97a80556-5dd5-4710-ba8a-56be09a7c768
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4aa6017-01f4-469e-a14e-775d3efa531e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4aa6017-01f4-469e-a14e-775d3efa531e
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4aa6017-01f4-469e-a14e-775d3efa531e
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-296d290a-7522-4e4e-8803-7dca181a352a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-296d290a-7522-4e4e-8803-7dca181a352a
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-296d290a-7522-4e4e-8803-7dca181a352a
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef2756df-60b1-4de2-b4d2-9e62771fc29a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef2756df-60b1-4de2-b4d2-9e62771fc29a
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef2756df-60b1-4de2-b4d2-9e62771fc29a
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7f8eb87-87e9-4416-bf1d-b392924b727e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7f8eb87-87e9-4416-bf1d-b392924b727e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7f8eb87-87e9-4416-bf1d-b392924b727e
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-9233478f-c524-4745-84e0-b647f68ae511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9233478f-c524-4745-84e0-b647f68ae511
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9233478f-c524-4745-84e0-b647f68ae511
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eab6387-b14d-44f7-971c-c9ea53d3f7d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eab6387-b14d-44f7-971c-c9ea53d3f7d1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eab6387-b14d-44f7-971c-c9ea53d3f7d1
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-19ff86e1-21d0-4314-8949-877a4c5eb351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ff86e1-21d0-4314-8949-877a4c5eb351
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-19ff86e1-21d0-4314-8949-877a4c5eb351
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-10c945d7-bfd2-46a8-b212-a19400c189f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10c945d7-bfd2-46a8-b212-a19400c189f7
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-10c945d7-bfd2-46a8-b212-a19400c189f7
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-31f0a16c-4e98-4596-a247-d7032723a4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31f0a16c-4e98-4596-a247-d7032723a4a1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-31f0a16c-4e98-4596-a247-d7032723a4a1
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a542a93-9c34-42e6-8ad6-5583f11eafa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a542a93-9c34-42e6-8ad6-5583f11eafa0
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a542a93-9c34-42e6-8ad6-5583f11eafa0
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-a804b508-7605-4d6e-8c05-8b250cd2ceb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a804b508-7605-4d6e-8c05-8b250cd2ceb6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a804b508-7605-4d6e-8c05-8b250cd2ceb6
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-84ef2f00-aa18-4483-b7a3-7d3006200f05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84ef2f00-aa18-4483-b7a3-7d3006200f05
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-84ef2f00-aa18-4483-b7a3-7d3006200f05
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-58253dc5-2fe5-40f7-9b2e-557bca40c0cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58253dc5-2fe5-40f7-9b2e-557bca40c0cd
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-58253dc5-2fe5-40f7-9b2e-557bca40c0cd
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-47045796-79f2-4358-9fad-7c8c39832dda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47045796-79f2-4358-9fad-7c8c39832dda
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-47045796-79f2-4358-9fad-7c8c39832dda
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-d19e97be-dbd5-4492-a711-d6acc0cd20cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d19e97be-dbd5-4492-a711-d6acc0cd20cd
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d19e97be-dbd5-4492-a711-d6acc0cd20cd
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-462128fd-f64a-4ae2-9a1a-acbdb20afdaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-462128fd-f64a-4ae2-9a1a-acbdb20afdaa
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-462128fd-f64a-4ae2-9a1a-acbdb20afdaa
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-86d36b7c-175b-4cc8-9f96-6aad855a412d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86d36b7c-175b-4cc8-9f96-6aad855a412d
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-86d36b7c-175b-4cc8-9f96-6aad855a412d
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-1fc5d89f-9d31-4710-bbc5-63525f6afd59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fc5d89f-9d31-4710-bbc5-63525f6afd59
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fc5d89f-9d31-4710-bbc5-63525f6afd59
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d8f9e4f-d9eb-43c7-b750-18eb7135a0fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8f9e4f-d9eb-43c7-b750-18eb7135a0fa
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d8f9e4f-d9eb-43c7-b750-18eb7135a0fa
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-16b6cce1-788f-4eee-bc0f-417ddae506e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16b6cce1-788f-4eee-bc0f-417ddae506e7
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-16b6cce1-788f-4eee-bc0f-417ddae506e7
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-e48fda79-2a30-4490-abb5-19b87f342a59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48fda79-2a30-4490-abb5-19b87f342a59
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e48fda79-2a30-4490-abb5-19b87f342a59
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-23ca2b13-c34e-4696-88af-f4c64df98563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23ca2b13-c34e-4696-88af-f4c64df98563
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-23ca2b13-c34e-4696-88af-f4c64df98563
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3d1f81d-ae01-4e0e-a250-cbb14a0d7a33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3d1f81d-ae01-4e0e-a250-cbb14a0d7a33
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3d1f81d-ae01-4e0e-a250-cbb14a0d7a33
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-e406ec74-3d30-408a-81c5-37314bb5fa71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e406ec74-3d30-408a-81c5-37314bb5fa71
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e406ec74-3d30-408a-81c5-37314bb5fa71
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-60ce65ae-2a04-4c49-b14f-6bc208a3ae62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ce65ae-2a04-4c49-b14f-6bc208a3ae62
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-60ce65ae-2a04-4c49-b14f-6bc208a3ae62
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c809d21-b944-4e53-a9c0-0d30ece1ee43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c809d21-b944-4e53-a9c0-0d30ece1ee43
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c809d21-b944-4e53-a9c0-0d30ece1ee43
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-45b463f1-1e89-4c2a-b366-686b90782f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45b463f1-1e89-4c2a-b366-686b90782f3a
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-45b463f1-1e89-4c2a-b366-686b90782f3a
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3fbcf4e-79cb-4268-9601-ca4b66723784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3fbcf4e-79cb-4268-9601-ca4b66723784
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3fbcf4e-79cb-4268-9601-ca4b66723784
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-e6751f2e-ae39-4530-a668-5c65bf304f8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6751f2e-ae39-4530-a668-5c65bf304f8c
Content-Type: application/json

--- response: 200 in 52 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6751f2e-ae39-4530-a668-5c65bf304f8c
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0accb97c-5952-4df4-affd-b7a9247b98cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0accb97c-5952-4df4-affd-b7a9247b98cf
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-0accb97c-5952-4df4-affd-b7a9247b98cf
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-012fe634-574e-4787-82f7-79df7a685a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012fe634-574e-4787-82f7-79df7a685a73
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-012fe634-574e-4787-82f7-79df7a685a73
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-548787a9-7a2d-468c-b867-8490e806b936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-548787a9-7a2d-468c-b867-8490e806b936
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-548787a9-7a2d-468c-b867-8490e806b936
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f9699ca-6fe9-460e-9957-4a505f8b30f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f9699ca-6fe9-460e-9957-4a505f8b30f1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f9699ca-6fe9-460e-9957-4a505f8b30f1
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-983d21d7-bf73-40de-b1f6-55bc4d7860dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-983d21d7-bf73-40de-b1f6-55bc4d7860dc
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-983d21d7-bf73-40de-b1f6-55bc4d7860dc
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-af5cda57-6b07-4857-bb74-78c145a838bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5cda57-6b07-4857-bb74-78c145a838bb
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-af5cda57-6b07-4857-bb74-78c145a838bb
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-e63ec9ba-d144-46a0-b2c2-0ece9eeb8ab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e63ec9ba-d144-46a0-b2c2-0ece9eeb8ab1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e63ec9ba-d144-46a0-b2c2-0ece9eeb8ab1
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-f126f48b-48c6-47c3-bb50-4ea7f0951697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f126f48b-48c6-47c3-bb50-4ea7f0951697
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f126f48b-48c6-47c3-bb50-4ea7f0951697
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-9171eda5-2b40-4f6e-b7c3-857439b57411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9171eda5-2b40-4f6e-b7c3-857439b57411
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9171eda5-2b40-4f6e-b7c3-857439b57411
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-51b93c6e-c6c1-442f-a5e1-15fa4e331dac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b93c6e-c6c1-442f-a5e1-15fa4e331dac
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b93c6e-c6c1-442f-a5e1-15fa4e331dac
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc1be8bd-6998-4334-b6f6-604148ce638d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc1be8bd-6998-4334-b6f6-604148ce638d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc1be8bd-6998-4334-b6f6-604148ce638d
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cf7a4d5-0474-4f5e-8c0a-e918794787db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cf7a4d5-0474-4f5e-8c0a-e918794787db
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cf7a4d5-0474-4f5e-8c0a-e918794787db
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-8091a1f8-2c13-44b5-a0de-6ee0c9deb236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8091a1f8-2c13-44b5-a0de-6ee0c9deb236
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-8091a1f8-2c13-44b5-a0de-6ee0c9deb236
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-86f53478-ea49-41ef-9789-9a28417fa43d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f53478-ea49-41ef-9789-9a28417fa43d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86f53478-ea49-41ef-9789-9a28417fa43d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-86f53478-ea49-41ef-9789-9a28417fa43d"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-f5115c38-6a71-482d-8168-fa30456a00ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5115c38-6a71-482d-8168-fa30456a00ea
Content-Type: application/json

--- request body ---
{"handle":"qa-d04b4a29d0c0","password":"****"}

--- response: 429 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5115c38-6a71-482d-8168-fa30456a00ea
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-f5115c38-6a71-482d-8168-fa30456a00ea"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-302a38be-d989-4c35-b884-47332dd8bae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302a38be-d989-4c35-b884-47332dd8bae7
Content-Type: application/json

--- request body ---
{"handle":"qa-c374a5581e3a","displayName":"QA c374a5581e3a","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-302a38be-d989-4c35-b884-47332dd8bae7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-302a38be-d989-4c35-b884-47332dd8bae7"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-02466b3f-579a-4dac-a7e2-4e4024d29105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02466b3f-579a-4dac-a7e2-4e4024d29105
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02466b3f-579a-4dac-a7e2-4e4024d29105
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-02466b3f-579a-4dac-a7e2-4e4024d29105"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-31f857ad-1250-422e-a1c8-eac1b9809fce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31f857ad-1250-422e-a1c8-eac1b9809fce
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31f857ad-1250-422e-a1c8-eac1b9809fce
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-31f857ad-1250-422e-a1c8-eac1b9809fce"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-44ac9045-01c6-4195-b536-e848207fda66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ac9045-01c6-4195-b536-e848207fda66
Content-Type: application/json

--- response: 429 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44ac9045-01c6-4195-b536-e848207fda66
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-44ac9045-01c6-4195-b536-e848207fda66"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-d04b4a29d0c0
correlation: qa-dde8da0c-8eae-4c00-9181-b1d87b269647

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dde8da0c-8eae-4c00-9181-b1d87b269647
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dde8da0c-8eae-4c00-9181-b1d87b269647
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-d04b4a29d0c0","correlationId":"qa-dde8da0c-8eae-4c00-9181-b1d87b269647"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-7b4e0981-0671-40e7-a156-c725b3acbb5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b4e0981-0671-40e7-a156-c725b3acbb5e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d04b4a29d0c0","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b4e0981-0671-40e7-a156-c725b3acbb5e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-7b4e0981-0671-40e7-a156-c725b3acbb5e"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-9a93b586-f18a-43e0-8194-a45be9cb907f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a93b586-f18a-43e0-8194-a45be9cb907f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a93b586-f18a-43e0-8194-a45be9cb907f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-9a93b586-f18a-43e0-8194-a45be9cb907f"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5
correlation: qa-6ec10dde-cddc-4304-8d02-5f7d6e9399e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ec10dde-cddc-4304-8d02-5f7d6e9399e6
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ec10dde-cddc-4304-8d02-5f7d6e9399e6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5","correlationId":"qa-6ec10dde-cddc-4304-8d02-5f7d6e9399e6"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/messages
correlation: qa-99d45ae0-bda7-4835-b423-97a3f8a32d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99d45ae0-bda7-4835-b423-97a3f8a32d05
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99d45ae0-bda7-4835-b423-97a3f8a32d05
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/messages","correlationId":"qa-99d45ae0-bda7-4835-b423-97a3f8a32d05"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/messages
correlation: qa-b395d5f1-2860-4781-a416-38ae26974c24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b395d5f1-2860-4781-a416-38ae26974c24
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b395d5f1-2860-4781-a416-38ae26974c24
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/messages","correlationId":"qa-b395d5f1-2860-4781-a416-38ae26974c24"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/read
correlation: qa-a872fe33-aeb6-497d-b7f0-303c16d22984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a872fe33-aeb6-497d-b7f0-303c16d22984
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a872fe33-aeb6-497d-b7f0-303c16d22984
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/read","correlationId":"qa-a872fe33-aeb6-497d-b7f0-303c16d22984"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/close
correlation: qa-59bb02aa-2e3a-4a81-aab2-6d1d617e7e22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59bb02aa-2e3a-4a81-aab2-6d1d617e7e22
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59bb02aa-2e3a-4a81-aab2-6d1d617e7e22
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_da58d49b-585f-472d-9882-a7601ec3f5a5/close","correlationId":"qa-59bb02aa-2e3a-4a81-aab2-6d1d617e7e22"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-0894be83-af17-4763-89a7-6a9f21c5c451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0894be83-af17-4763-89a7-6a9f21c5c451
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0894be83-af17-4763-89a7-6a9f21c5c451
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-0894be83-af17-4763-89a7-6a9f21c5c451"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-1ca52a04-775c-48b6-9450-826a2b861366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ca52a04-775c-48b6-9450-826a2b861366
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ca52a04-775c-48b6-9450-826a2b861366
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-1ca52a04-775c-48b6-9450-826a2b861366"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c3fd86d3-6b49-4da2-8515-2682eb408acc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5be95a42e485412594f652a9e650588d
X-Correlation-Id: qa-c3fd86d3-6b49-4da2-8515-2682eb408acc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3fd86d3-6b49-4da2-8515-2682eb408acc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-c3fd86d3-6b49-4da2-8515-2682eb408acc"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-2eb64b46-4705-48c5-9d65-3ad15b0e545e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eb64b46-4705-48c5-9d65-3ad15b0e545e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2eb64b46-4705-48c5-9d65-3ad15b0e545e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-2eb64b46-4705-48c5-9d65-3ad15b0e545e"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb0bd182-047e-4dd4-8ed3-7e812e485adf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb0bd182-047e-4dd4-8ed3-7e812e485adf
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb0bd182-047e-4dd4-8ed3-7e812e485adf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fb0bd182-047e-4dd4-8ed3-7e812e485adf"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-9978926a-63ae-4857-b14b-5bec0b8ec933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9978926a-63ae-4857-b14b-5bec0b8ec933
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9978926a-63ae-4857-b14b-5bec0b8ec933
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9978926a-63ae-4857-b14b-5bec0b8ec933"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-da4b1934-3698-43f5-948a-8c48a4c78b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da4b1934-3698-43f5-948a-8c48a4c78b6d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da4b1934-3698-43f5-948a-8c48a4c78b6d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-da4b1934-3698-43f5-948a-8c48a4c78b6d"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-979473bd-ac01-49cd-9caa-2ea35ef5b4cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979473bd-ac01-49cd-9caa-2ea35ef5b4cf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-979473bd-ac01-49cd-9caa-2ea35ef5b4cf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-979473bd-ac01-49cd-9caa-2ea35ef5b4cf"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-4795b297-52e3-4a8d-9e7a-46b990bcf947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4795b297-52e3-4a8d-9e7a-46b990bcf947
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4795b297-52e3-4a8d-9e7a-46b990bcf947
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4795b297-52e3-4a8d-9e7a-46b990bcf947"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c4f5f47-07b1-426c-b8f1-263d0a3d2345

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c4f5f47-07b1-426c-b8f1-263d0a3d2345
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c4f5f47-07b1-426c-b8f1-263d0a3d2345
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4c4f5f47-07b1-426c-b8f1-263d0a3d2345"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-581aa721-beea-4b89-af4b-b74978b18fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-581aa721-beea-4b89-af4b-b74978b18fec
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-581aa721-beea-4b89-af4b-b74978b18fec
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-581aa721-beea-4b89-af4b-b74978b18fec"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f97eb7c-c7e0-4612-a406-afc2c6bb283f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f97eb7c-c7e0-4612-a406-afc2c6bb283f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f97eb7c-c7e0-4612-a406-afc2c6bb283f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1f97eb7c-c7e0-4612-a406-afc2c6bb283f"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d04d41f-1114-4f7e-8739-01e676ebe4a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d04d41f-1114-4f7e-8739-01e676ebe4a7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d04d41f-1114-4f7e-8739-01e676ebe4a7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9d04d41f-1114-4f7e-8739-01e676ebe4a7"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-30540f26-33ac-45ea-a3bd-60760a14d2e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30540f26-33ac-45ea-a3bd-60760a14d2e6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30540f26-33ac-45ea-a3bd-60760a14d2e6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-30540f26-33ac-45ea-a3bd-60760a14d2e6"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c7098a7-987f-4484-93d6-2836d911e5f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c7098a7-987f-4484-93d6-2836d911e5f7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c7098a7-987f-4484-93d6-2836d911e5f7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0c7098a7-987f-4484-93d6-2836d911e5f7"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-5aad3619-9022-449e-89d4-37839f0fb48e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aad3619-9022-449e-89d4-37839f0fb48e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5aad3619-9022-449e-89d4-37839f0fb48e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5aad3619-9022-449e-89d4-37839f0fb48e"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-c142b495-ba91-4d1f-824a-08bcd5e2da5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c142b495-ba91-4d1f-824a-08bcd5e2da5f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c142b495-ba91-4d1f-824a-08bcd5e2da5f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c142b495-ba91-4d1f-824a-08bcd5e2da5f"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-2205f978-68f2-4b67-aebc-65dac8fc966c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2205f978-68f2-4b67-aebc-65dac8fc966c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2205f978-68f2-4b67-aebc-65dac8fc966c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2205f978-68f2-4b67-aebc-65dac8fc966c"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1a0fce5-773e-4d91-a650-d0be0b664114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1a0fce5-773e-4d91-a650-d0be0b664114
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1a0fce5-773e-4d91-a650-d0be0b664114
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d1a0fce5-773e-4d91-a650-d0be0b664114"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-89d0e3b6-1ff2-4b0b-8a3f-ee2c2daf2182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d0e3b6-1ff2-4b0b-8a3f-ee2c2daf2182
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 29 Oct 2026 08:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-89d0e3b6-1ff2-4b0b-8a3f-ee2c2daf2182
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

{"id":"acc_b8f88a83-bc04-4bf6-a667-22ced9e40b57","handle":"qa-d04b4a29d0c0","displayName":"QA d04b4a29d0c0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.366559012Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-752f40c6-c63b-45c2-a733-10fd3025d2aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-752f40c6-c63b-45c2-a733-10fd3025d2aa
Content-Type: application/json

--- request body ---
{"handle":"qa-693760357560","password":"****"}

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-752f40c6-c63b-45c2-a733-10fd3025d2aa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01bbee9f-5db6-4d04-9b3b-6549cbd089ac"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-984bf3c9-2a5a-4144-8f29-d818f8721d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-984bf3c9-2a5a-4144-8f29-d818f8721d07
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-984bf3c9-2a5a-4144-8f29-d818f8721d07
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
correlation: qa-93d3ff61-6e98-480a-b2d9-e77d4da0fdf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d3ff61-6e98-480a-b2d9-e77d4da0fdf4
Content-Type: application/json

--- request body ---
{"handle":"qa-693760357560","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93d3ff61-6e98-480a-b2d9-e77d4da0fdf4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93d3ff61-6e98-480a-b2d9-e77d4da0fdf4"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d7808a0-9815-49a6-b6dc-591c34e81c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d7808a0-9815-49a6-b6dc-591c34e81c0f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 29 Oct 2026 08:39:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d7808a0-9815-49a6-b6dc-591c34e81c0f
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
correlation: qa-9cd1ff32-1ed9-4679-8cfd-1d3469566400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd1ff32-1ed9-4679-8cfd-1d3469566400
Content-Type: application/json

--- request body ---
{"handle":"qa-d04b4a29d0c0","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 29 Oct 2026 08:39:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cd1ff32-1ed9-4679-8cfd-1d3469566400
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9cd1ff32-1ed9-4679-8cfd-1d3469566400"}
```
