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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-7c26ff0e-c109-4ec8-9b22-e44e9f933916` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-f11c247a-2fd4-48d4-9ad9-156a7c8578b9` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-5002789f-f7e3-4388-86ed-b20385599929` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-961f9591-6116-474c-9fe3-2f9b84718840` |
| 5 | `GET /v1/accounts/me` | 200 | 14 | `qa-f1caae32-2e68-404b-b075-0b50d962dcd4` |
| 6 | `GET /v1/accounts/me` | 200 | 18 | `qa-0d773396-09db-4ad6-9bf7-8c2ce81a44d5` |
| 7 | `GET /v1/accounts/me` | 200 | 11 | `qa-4e8135b3-1e28-4963-8719-782596facfa6` |
| 8 | `GET /v1/accounts/me` | 200 | 15 | `qa-2e638ef6-3bad-4930-87c5-2872b40acc32` |
| 9 | `GET /v1/accounts/me` | 200 | 12 | `qa-6f5d0f77-4bbd-487b-95af-49c3e9e72271` |
| 10 | `GET /v1/accounts/me` | 200 | 19 | `qa-fc30dab0-eed2-4280-9a2f-30ef82384eb3` |
| 11 | `GET /v1/accounts/me` | 200 | 19 | `qa-0a4611ca-2718-4df1-866a-5b3256b46dc7` |
| 12 | `GET /v1/accounts/me` | 200 | 25 | `qa-2b25db24-4adc-465f-a06b-2a19d6c600a8` |
| 13 | `GET /v1/accounts/me` | 200 | 20 | `qa-5de0db3d-d599-4cac-b248-4c69573c9341` |
| 14 | `GET /v1/accounts/me` | 200 | 13 | `qa-9d2ee0f4-9032-49a8-89f5-992a27f3d86b` |
| 15 | `GET /v1/accounts/me` | 200 | 10 | `qa-c735b8a3-ceeb-4a2e-bad6-a93a8e2edabf` |
| 16 | `GET /v1/accounts/me` | 200 | 15 | `qa-b8995331-d413-4636-be1a-a180019bab12` |
| 17 | `GET /v1/accounts/me` | 200 | 23 | `qa-4aafa32b-648c-4224-bea3-88129790dcbf` |
| 18 | `GET /v1/accounts/me` | 200 | 20 | `qa-444cddca-2d0a-4a8b-9d5b-c098862cd8db` |
| 19 | `GET /v1/accounts/me` | 200 | 8 | `qa-03c0c419-1394-4252-b5cc-63d7c4876a47` |
| 20 | `GET /v1/accounts/me` | 200 | 16 | `qa-31fc10d5-ce72-4f6c-b14b-b103378d9ec1` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-8f6cce26-386c-4929-b295-daa236734a9d` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-d0446487-7b21-4042-bfa3-481147e135ec` |
| 23 | `GET /v1/accounts/me` | 200 | 18 | `qa-325dd639-cf05-432a-a9b8-0ee406e61b27` |
| 24 | `GET /v1/accounts/me` | 200 | 12 | `qa-ffa97c82-9080-467b-9d75-44900d0e562a` |
| 25 | `GET /v1/accounts/me` | 200 | 16 | `qa-4729e33f-485f-4ceb-8a2d-15d8d6e5c6ed` |
| 26 | `GET /v1/accounts/me` | 200 | 20 | `qa-1832db34-e27f-4a1e-ab2f-86f3f2676ec4` |
| 27 | `GET /v1/accounts/me` | 200 | 35 | `qa-6f427c88-56e2-4a46-b076-2aad75743d57` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-740722fd-25d0-413f-b0fa-8b37035ee2a9` |
| 29 | `GET /v1/accounts/me` | 200 | 9 | `qa-58ed4681-b5e0-441b-81bd-416a5941733c` |
| 30 | `GET /v1/accounts/me` | 200 | 9 | `qa-0cae3a55-8a03-4acb-8d99-a6c5ec5e3d93` |
| 31 | `GET /v1/accounts/me` | 200 | 6 | `qa-d589eab8-c98d-45fd-8408-b232ea5b2ade` |
| 32 | `GET /v1/accounts/me` | 200 | 11 | `qa-c0f1e2af-d09f-4b72-8e7b-673e91daa624` |
| 33 | `GET /v1/accounts/me` | 200 | 11 | `qa-32f9f9bd-ea57-4c22-ae61-d65801d07131` |
| 34 | `GET /v1/accounts/me` | 200 | 25 | `qa-1b252ce2-c546-4a6f-9f78-ef1e167ab966` |
| 35 | `GET /v1/accounts/me` | 200 | 17 | `qa-3aee22b1-9a27-423e-b9b7-6012f63b1ec6` |
| 36 | `GET /v1/accounts/me` | 200 | 17 | `qa-2c6a026f-02fe-46c4-889b-8328251acd6c` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-0d7acd75-9be0-4329-b755-b5443a016277` |
| 38 | `GET /v1/accounts/me` | 200 | 28 | `qa-267bda84-5050-4627-aca5-437c21ebf5a6` |
| 39 | `GET /v1/accounts/me` | 200 | 27 | `qa-6c2bb4d7-4608-44bf-bf16-c57cfb6c4caa` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-651d98e4-2855-4774-ac58-6b6d4fd5ba51` |
| 41 | `GET /v1/accounts/me` | 200 | 2 | `qa-4ee9cf78-b58a-4da8-bdf3-e20548546055` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-08d38e41-f639-4d62-a35a-2679c76731f9` |
| 43 | `GET /v1/accounts/me` | 200 | 17 | `qa-f015c735-936a-4d75-8155-8b41a89d905f` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-d9e8530e-408e-4431-aefe-e21fdcfdc7a4` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-b4018008-1263-4995-a532-048bb401d3f1` |
| 46 | `GET /v1/accounts/me` | 200 | 9 | `qa-f7104f7b-0826-4756-94f1-9fee9c9f8460` |
| 47 | `GET /v1/accounts/me` | 200 | 2 | `qa-7a9062f4-a518-4332-b10c-3a4aa29183a6` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-554e4fa1-5c37-4b07-aa4d-176d2b262711` |
| 49 | `GET /v1/accounts/me` | 200 | 7 | `qa-40784c19-8f8e-42bd-8d36-61ce237e7e38` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-f8accfd9-09da-4fb2-a93a-1c4ffde2d640` |
| 51 | `GET /v1/accounts/me` | 200 | 4 | `qa-54ad9e07-ced0-4e67-a131-7c34196d77d2` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-38aaf117-35fd-4dbf-9b8c-7fc56959f1f0` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-f479a45f-abc0-4676-93b5-1ecab3a43f86` |
| 54 | `GET /v1/accounts/me` | 200 | 9 | `qa-35e18e03-4682-4036-8da1-2d2e48329116` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-0f647ada-d3e8-42f1-b797-e87994ddcb0d` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-a9e8971e-ba4e-4a9b-b785-f50b733f34b1` |
| 57 | `GET /v1/accounts/me` | 200 | 10 | `qa-909f1f3a-c44d-42c7-b52d-8eb637382417` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-45c3f5f2-61a6-419f-81fc-ce51549781cc` |
| 59 | `GET /v1/accounts/me` | 200 | 11 | `qa-bc98c501-a1b5-4d65-b573-c61bfc2a2d69` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-f92ad6ef-ff42-4356-bde0-8dfb3e1c8f21` |
| 61 | `GET /v1/accounts/me` | 200 | 11 | `qa-f5747360-edea-46a2-8c92-ef49f78e3ae9` |
| 62 | `GET /v1/accounts/me` | 200 | 10 | `qa-67093e78-7052-4275-91c2-3ab4bf2454e0` |
| 63 | `GET /v1/accounts/me` | 200 | 5 | `qa-bf49d5ff-b7ce-4944-ae57-ba20676edb58` |
| 64 | `GET /v1/accounts/me` | 429 | 8 | `qa-1b5dafcc-267e-4b1d-8ace-b0e45064d9d3` |
| 65 | `POST /v1/auth/token` | 429 | 3 | `qa-232f796d-c593-42b6-afe3-b6ac7677119d` |
| 66 | `POST /v1/accounts` | 429 | 21 | `qa-3bd06ab2-660d-4405-8b1f-b58a339ea813` |
| 67 | `GET /v1/accounts/me` | 429 | 8 | `qa-689702e5-2051-4e55-8265-ad65ab1b4582` |
| 68 | `PATCH /v1/accounts/me` | 429 | 8 | `qa-730b8387-cf3e-45a1-a95d-d6ce34778254` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-69af05bc-03a4-4ee5-bbab-9db3ef3b0c93` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 3 | `qa-c5362ddd-c40d-429c-8a1e-76d0c5b4ab48` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-95bee579-f0e8-417b-8a15-b0deee4dee14` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-123faefb-bd9c-40b6-9651-4561353fc05e` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-c53707d0-adc3-44e3-95c5-5e37bb75bc1c` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 3 | `qa-15583791-05f7-4706-a920-82f678fe9bfc` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-e429333c-cda1-4669-8422-5544c091ea17` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-49f28024-3719-46d4-b6b6-1cca0497ed24` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-16cd5811-b845-4b5e-9419-17df89183135` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-ac50c06c-ac51-441c-a993-fdbc89762b8f` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-db6576c1-29c8-4f8f-96bb-9595d9e1b79e` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-4f8ff38a-5ac8-48a8-92ad-9aa1dad6c537` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-5b9bb35e-63c6-42f6-bf66-fafb068358d4` |
| 82 | `GET /v1/accounts/me` | 429 | 5 | `qa-84f67301-ccdd-45b6-876a-0759709bdd7e` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-0a17049f-41c9-4662-b82e-06e2d571e7b0` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-53e5ce51-3de1-483f-946c-d4cae49e85b1` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-021c5626-2529-4dbd-8930-69079c1c6185` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-7c5daac3-5fe3-4dad-a65e-38de705e63f5` |
| 87 | `GET /v1/accounts/me` | 429 | 4 | `qa-63b42fcc-dae5-47f5-8b15-3e5d2a80c868` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-c4f42aff-51d7-4a8b-a6cf-56df934f26f5` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-9e5f9862-c614-48ce-accc-1bde51dccdff` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-a9c98ee5-13b1-4a3d-b13e-06c6ac975f5d` |
| 91 | `GET /v1/accounts/me` | 429 | 5 | `qa-a0f452ef-4bd0-4192-808f-bb43914d493c` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-6cb0e9e6-955f-4e1e-94e9-718f9f2cf897` |
| 93 | `GET /v1/accounts/me` | 429 | 5 | `qa-f7d862a7-54c0-45d5-9e66-c13eb709cab2` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-f4485dc8-9c39-4719-b49e-9c1345a5738d` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-c868b42c-3daa-47d4-8ff7-47dc9d706182` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-652fe456-cb10-4905-8f1c-00ee50f0414b` |
| 97 | `GET /v1/accounts/me` | 429 | 7 | `qa-d882a6c5-4b42-4e32-aa5c-a036a3b7a455` |
| 98 | `GET /v1/accounts/me` | 200 | 5 | `qa-0d9bd6a2-65c1-437e-b706-eea2ee36e12f` |
| 99 | `POST /v1/auth/token` | 200 | 8 | `qa-23a3537e-5c6c-4769-bba1-fcb4ddf2e0a0` |
| 100 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-652ed4db-92fa-4359-b926-0c97141589e6` |
| 101 | `POST /v1/auth/token` | 401 | 3 | `qa-64f478c8-2e8c-4cec-99c7-6aae875d092f` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-7a419ddc-e7cd-444d-905f-9cf447ebe689` |
| 103 | `POST /v1/auth/token` | 401 | 2 | `qa-4f450a5b-88e3-43f8-9ca7-324af2499646` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c26ff0e-c109-4ec8-9b22-e44e9f933916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c26ff0e-c109-4ec8-9b22-e44e9f933916
Content-Type: application/json

--- request body ---
{"handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c26ff0e-c109-4ec8-9b22-e44e9f933916
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
Location: /v1/accounts/qa-5af4a1960691
X-Served-Region: eu
Content-Length: 181

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f11c247a-2fd4-48d4-9ad9-156a7c8578b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f11c247a-2fd4-48d4-9ad9-156a7c8578b9
Content-Type: application/json

--- request body ---
{"handle":"qa-ea89463dd209","displayName":"QA ea89463dd209","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f11c247a-2fd4-48d4-9ad9-156a7c8578b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Location: /v1/accounts/qa-ea89463dd209
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8104f2d-e646-4a8b-84bd-697ef4883092","handle":"qa-ea89463dd209","displayName":"QA ea89463dd209","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.837095205Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5002789f-f7e3-4388-86ed-b20385599929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5002789f-f7e3-4388-86ed-b20385599929
Content-Type: application/json

--- request body ---
{"handle":"qa-5af4a1960691","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5002789f-f7e3-4388-86ed-b20385599929
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_119b2e79-736f-43a3-8e0a-421a3605532b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-961f9591-6116-474c-9fe3-2f9b84718840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-961f9591-6116-474c-9fe3-2f9b84718840
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ea89463dd209","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-961f9591-6116-474c-9fe3-2f9b84718840
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
Location: /v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef","subject":"Error contract","status":"open","region":"eu","participants":["qa-5af4a1960691","qa-ea89463dd209"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.901003507Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1caae32-2e68-404b-b075-0b50d962dcd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1caae32-2e68-404b-b075-0b50d962dcd4
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1caae32-2e68-404b-b075-0b50d962dcd4
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d773396-09db-4ad6-9bf7-8c2ce81a44d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d773396-09db-4ad6-9bf7-8c2ce81a44d5
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d773396-09db-4ad6-9bf7-8c2ce81a44d5
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e8135b3-1e28-4963-8719-782596facfa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8135b3-1e28-4963-8719-782596facfa6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e8135b3-1e28-4963-8719-782596facfa6
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e638ef6-3bad-4930-87c5-2872b40acc32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e638ef6-3bad-4930-87c5-2872b40acc32
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e638ef6-3bad-4930-87c5-2872b40acc32
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f5d0f77-4bbd-487b-95af-49c3e9e72271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f5d0f77-4bbd-487b-95af-49c3e9e72271
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f5d0f77-4bbd-487b-95af-49c3e9e72271
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc30dab0-eed2-4280-9a2f-30ef82384eb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc30dab0-eed2-4280-9a2f-30ef82384eb3
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc30dab0-eed2-4280-9a2f-30ef82384eb3
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a4611ca-2718-4df1-866a-5b3256b46dc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a4611ca-2718-4df1-866a-5b3256b46dc7
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a4611ca-2718-4df1-866a-5b3256b46dc7
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b25db24-4adc-465f-a06b-2a19d6c600a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b25db24-4adc-465f-a06b-2a19d6c600a8
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b25db24-4adc-465f-a06b-2a19d6c600a8
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-5de0db3d-d599-4cac-b248-4c69573c9341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5de0db3d-d599-4cac-b248-4c69573c9341
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5de0db3d-d599-4cac-b248-4c69573c9341
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d2ee0f4-9032-49a8-89f5-992a27f3d86b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d2ee0f4-9032-49a8-89f5-992a27f3d86b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d2ee0f4-9032-49a8-89f5-992a27f3d86b
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-c735b8a3-ceeb-4a2e-bad6-a93a8e2edabf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c735b8a3-ceeb-4a2e-bad6-a93a8e2edabf
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c735b8a3-ceeb-4a2e-bad6-a93a8e2edabf
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8995331-d413-4636-be1a-a180019bab12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8995331-d413-4636-be1a-a180019bab12
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8995331-d413-4636-be1a-a180019bab12
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-4aafa32b-648c-4224-bea3-88129790dcbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4aafa32b-648c-4224-bea3-88129790dcbf
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4aafa32b-648c-4224-bea3-88129790dcbf
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-444cddca-2d0a-4a8b-9d5b-c098862cd8db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-444cddca-2d0a-4a8b-9d5b-c098862cd8db
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-444cddca-2d0a-4a8b-9d5b-c098862cd8db
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-03c0c419-1394-4252-b5cc-63d7c4876a47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03c0c419-1394-4252-b5cc-63d7c4876a47
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-03c0c419-1394-4252-b5cc-63d7c4876a47
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-31fc10d5-ce72-4f6c-b14b-b103378d9ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31fc10d5-ce72-4f6c-b14b-b103378d9ec1
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-31fc10d5-ce72-4f6c-b14b-b103378d9ec1
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f6cce26-386c-4929-b295-daa236734a9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f6cce26-386c-4929-b295-daa236734a9d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f6cce26-386c-4929-b295-daa236734a9d
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0446487-7b21-4042-bfa3-481147e135ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0446487-7b21-4042-bfa3-481147e135ec
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0446487-7b21-4042-bfa3-481147e135ec
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-325dd639-cf05-432a-a9b8-0ee406e61b27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325dd639-cf05-432a-a9b8-0ee406e61b27
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-325dd639-cf05-432a-a9b8-0ee406e61b27
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffa97c82-9080-467b-9d75-44900d0e562a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffa97c82-9080-467b-9d75-44900d0e562a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffa97c82-9080-467b-9d75-44900d0e562a
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-4729e33f-485f-4ceb-8a2d-15d8d6e5c6ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4729e33f-485f-4ceb-8a2d-15d8d6e5c6ed
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4729e33f-485f-4ceb-8a2d-15d8d6e5c6ed
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-1832db34-e27f-4a1e-ab2f-86f3f2676ec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1832db34-e27f-4a1e-ab2f-86f3f2676ec4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1832db34-e27f-4a1e-ab2f-86f3f2676ec4
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f427c88-56e2-4a46-b076-2aad75743d57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f427c88-56e2-4a46-b076-2aad75743d57
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f427c88-56e2-4a46-b076-2aad75743d57
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-740722fd-25d0-413f-b0fa-8b37035ee2a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-740722fd-25d0-413f-b0fa-8b37035ee2a9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-740722fd-25d0-413f-b0fa-8b37035ee2a9
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-58ed4681-b5e0-441b-81bd-416a5941733c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ed4681-b5e0-441b-81bd-416a5941733c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-58ed4681-b5e0-441b-81bd-416a5941733c
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-0cae3a55-8a03-4acb-8d99-a6c5ec5e3d93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cae3a55-8a03-4acb-8d99-a6c5ec5e3d93
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cae3a55-8a03-4acb-8d99-a6c5ec5e3d93
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-d589eab8-c98d-45fd-8408-b232ea5b2ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d589eab8-c98d-45fd-8408-b232ea5b2ade
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d589eab8-c98d-45fd-8408-b232ea5b2ade
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0f1e2af-d09f-4b72-8e7b-673e91daa624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0f1e2af-d09f-4b72-8e7b-673e91daa624
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0f1e2af-d09f-4b72-8e7b-673e91daa624
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-32f9f9bd-ea57-4c22-ae61-d65801d07131

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32f9f9bd-ea57-4c22-ae61-d65801d07131
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-32f9f9bd-ea57-4c22-ae61-d65801d07131
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b252ce2-c546-4a6f-9f78-ef1e167ab966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b252ce2-c546-4a6f-9f78-ef1e167ab966
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b252ce2-c546-4a6f-9f78-ef1e167ab966
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-3aee22b1-9a27-423e-b9b7-6012f63b1ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aee22b1-9a27-423e-b9b7-6012f63b1ec6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3aee22b1-9a27-423e-b9b7-6012f63b1ec6
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c6a026f-02fe-46c4-889b-8328251acd6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c6a026f-02fe-46c4-889b-8328251acd6c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c6a026f-02fe-46c4-889b-8328251acd6c
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d7acd75-9be0-4329-b755-b5443a016277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d7acd75-9be0-4329-b755-b5443a016277
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d7acd75-9be0-4329-b755-b5443a016277
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-267bda84-5050-4627-aca5-437c21ebf5a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-267bda84-5050-4627-aca5-437c21ebf5a6
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-267bda84-5050-4627-aca5-437c21ebf5a6
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c2bb4d7-4608-44bf-bf16-c57cfb6c4caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2bb4d7-4608-44bf-bf16-c57cfb6c4caa
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c2bb4d7-4608-44bf-bf16-c57cfb6c4caa
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-651d98e4-2855-4774-ac58-6b6d4fd5ba51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-651d98e4-2855-4774-ac58-6b6d4fd5ba51
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-651d98e4-2855-4774-ac58-6b6d4fd5ba51
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ee9cf78-b58a-4da8-bdf3-e20548546055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee9cf78-b58a-4da8-bdf3-e20548546055
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ee9cf78-b58a-4da8-bdf3-e20548546055
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-08d38e41-f639-4d62-a35a-2679c76731f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d38e41-f639-4d62-a35a-2679c76731f9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-08d38e41-f639-4d62-a35a-2679c76731f9
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-f015c735-936a-4d75-8155-8b41a89d905f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f015c735-936a-4d75-8155-8b41a89d905f
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f015c735-936a-4d75-8155-8b41a89d905f
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9e8530e-408e-4431-aefe-e21fdcfdc7a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e8530e-408e-4431-aefe-e21fdcfdc7a4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e8530e-408e-4431-aefe-e21fdcfdc7a4
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4018008-1263-4995-a532-048bb401d3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4018008-1263-4995-a532-048bb401d3f1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4018008-1263-4995-a532-048bb401d3f1
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7104f7b-0826-4756-94f1-9fee9c9f8460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7104f7b-0826-4756-94f1-9fee9c9f8460
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7104f7b-0826-4756-94f1-9fee9c9f8460
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a9062f4-a518-4332-b10c-3a4aa29183a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a9062f4-a518-4332-b10c-3a4aa29183a6
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a9062f4-a518-4332-b10c-3a4aa29183a6
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-554e4fa1-5c37-4b07-aa4d-176d2b262711

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-554e4fa1-5c37-4b07-aa4d-176d2b262711
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-554e4fa1-5c37-4b07-aa4d-176d2b262711
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-40784c19-8f8e-42bd-8d36-61ce237e7e38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40784c19-8f8e-42bd-8d36-61ce237e7e38
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-40784c19-8f8e-42bd-8d36-61ce237e7e38
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8accfd9-09da-4fb2-a93a-1c4ffde2d640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8accfd9-09da-4fb2-a93a-1c4ffde2d640
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8accfd9-09da-4fb2-a93a-1c4ffde2d640
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-54ad9e07-ced0-4e67-a131-7c34196d77d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54ad9e07-ced0-4e67-a131-7c34196d77d2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-54ad9e07-ced0-4e67-a131-7c34196d77d2
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-38aaf117-35fd-4dbf-9b8c-7fc56959f1f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38aaf117-35fd-4dbf-9b8c-7fc56959f1f0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-38aaf117-35fd-4dbf-9b8c-7fc56959f1f0
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-f479a45f-abc0-4676-93b5-1ecab3a43f86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f479a45f-abc0-4676-93b5-1ecab3a43f86
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-f479a45f-abc0-4676-93b5-1ecab3a43f86
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-35e18e03-4682-4036-8da1-2d2e48329116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e18e03-4682-4036-8da1-2d2e48329116
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-35e18e03-4682-4036-8da1-2d2e48329116
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f647ada-d3e8-42f1-b797-e87994ddcb0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f647ada-d3e8-42f1-b797-e87994ddcb0d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f647ada-d3e8-42f1-b797-e87994ddcb0d
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9e8971e-ba4e-4a9b-b785-f50b733f34b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e8971e-ba4e-4a9b-b785-f50b733f34b1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9e8971e-ba4e-4a9b-b785-f50b733f34b1
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-909f1f3a-c44d-42c7-b52d-8eb637382417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-909f1f3a-c44d-42c7-b52d-8eb637382417
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-909f1f3a-c44d-42c7-b52d-8eb637382417
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-45c3f5f2-61a6-419f-81fc-ce51549781cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45c3f5f2-61a6-419f-81fc-ce51549781cc
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-45c3f5f2-61a6-419f-81fc-ce51549781cc
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc98c501-a1b5-4d65-b573-c61bfc2a2d69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc98c501-a1b5-4d65-b573-c61bfc2a2d69
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc98c501-a1b5-4d65-b573-c61bfc2a2d69
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-f92ad6ef-ff42-4356-bde0-8dfb3e1c8f21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f92ad6ef-ff42-4356-bde0-8dfb3e1c8f21
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-f92ad6ef-ff42-4356-bde0-8dfb3e1c8f21
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5747360-edea-46a2-8c92-ef49f78e3ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5747360-edea-46a2-8c92-ef49f78e3ae9
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5747360-edea-46a2-8c92-ef49f78e3ae9
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-67093e78-7052-4275-91c2-3ab4bf2454e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67093e78-7052-4275-91c2-3ab4bf2454e0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-67093e78-7052-4275-91c2-3ab4bf2454e0
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf49d5ff-b7ce-4944-ae57-ba20676edb58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf49d5ff-b7ce-4944-ae57-ba20676edb58
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf49d5ff-b7ce-4944-ae57-ba20676edb58
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b5dafcc-267e-4b1d-8ace-b0e45064d9d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b5dafcc-267e-4b1d-8ace-b0e45064d9d3
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b5dafcc-267e-4b1d-8ace-b0e45064d9d3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1b5dafcc-267e-4b1d-8ace-b0e45064d9d3"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-232f796d-c593-42b6-afe3-b6ac7677119d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-232f796d-c593-42b6-afe3-b6ac7677119d
Content-Type: application/json

--- request body ---
{"handle":"qa-5af4a1960691","password":"****"}

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-232f796d-c593-42b6-afe3-b6ac7677119d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-232f796d-c593-42b6-afe3-b6ac7677119d"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-3bd06ab2-660d-4405-8b1f-b58a339ea813

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bd06ab2-660d-4405-8b1f-b58a339ea813
Content-Type: application/json

--- request body ---
{"handle":"qa-51e01b047afe","displayName":"QA 51e01b047afe","password":"****","region":"eu"}

--- response: 429 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bd06ab2-660d-4405-8b1f-b58a339ea813
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-3bd06ab2-660d-4405-8b1f-b58a339ea813"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-689702e5-2051-4e55-8265-ad65ab1b4582

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-689702e5-2051-4e55-8265-ad65ab1b4582
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-689702e5-2051-4e55-8265-ad65ab1b4582
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-689702e5-2051-4e55-8265-ad65ab1b4582"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-730b8387-cf3e-45a1-a95d-d6ce34778254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-730b8387-cf3e-45a1-a95d-d6ce34778254
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-730b8387-cf3e-45a1-a95d-d6ce34778254
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-730b8387-cf3e-45a1-a95d-d6ce34778254"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69af05bc-03a4-4ee5-bbab-9db3ef3b0c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69af05bc-03a4-4ee5-bbab-9db3ef3b0c93
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69af05bc-03a4-4ee5-bbab-9db3ef3b0c93
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-69af05bc-03a4-4ee5-bbab-9db3ef3b0c93"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-5af4a1960691
correlation: qa-c5362ddd-c40d-429c-8a1e-76d0c5b4ab48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5362ddd-c40d-429c-8a1e-76d0c5b4ab48
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5362ddd-c40d-429c-8a1e-76d0c5b4ab48
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-5af4a1960691","correlationId":"qa-c5362ddd-c40d-429c-8a1e-76d0c5b4ab48"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-95bee579-f0e8-417b-8a15-b0deee4dee14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95bee579-f0e8-417b-8a15-b0deee4dee14
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5af4a1960691","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95bee579-f0e8-417b-8a15-b0deee4dee14
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-95bee579-f0e8-417b-8a15-b0deee4dee14"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-123faefb-bd9c-40b6-9651-4561353fc05e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-123faefb-bd9c-40b6-9651-4561353fc05e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-123faefb-bd9c-40b6-9651-4561353fc05e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-123faefb-bd9c-40b6-9651-4561353fc05e"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef
correlation: qa-c53707d0-adc3-44e3-95c5-5e37bb75bc1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c53707d0-adc3-44e3-95c5-5e37bb75bc1c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c53707d0-adc3-44e3-95c5-5e37bb75bc1c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef","correlationId":"qa-c53707d0-adc3-44e3-95c5-5e37bb75bc1c"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/messages
correlation: qa-15583791-05f7-4706-a920-82f678fe9bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15583791-05f7-4706-a920-82f678fe9bfc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15583791-05f7-4706-a920-82f678fe9bfc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/messages","correlationId":"qa-15583791-05f7-4706-a920-82f678fe9bfc"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/messages
correlation: qa-e429333c-cda1-4669-8422-5544c091ea17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e429333c-cda1-4669-8422-5544c091ea17
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e429333c-cda1-4669-8422-5544c091ea17
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/messages","correlationId":"qa-e429333c-cda1-4669-8422-5544c091ea17"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/read
correlation: qa-49f28024-3719-46d4-b6b6-1cca0497ed24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49f28024-3719-46d4-b6b6-1cca0497ed24
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49f28024-3719-46d4-b6b6-1cca0497ed24
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/read","correlationId":"qa-49f28024-3719-46d4-b6b6-1cca0497ed24"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/close
correlation: qa-16cd5811-b845-4b5e-9419-17df89183135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16cd5811-b845-4b5e-9419-17df89183135
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16cd5811-b845-4b5e-9419-17df89183135
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_526d0d17-2674-4d18-a7d0-d30e92ad1bef/close","correlationId":"qa-16cd5811-b845-4b5e-9419-17df89183135"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-ac50c06c-ac51-441c-a993-fdbc89762b8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac50c06c-ac51-441c-a993-fdbc89762b8f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac50c06c-ac51-441c-a993-fdbc89762b8f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-ac50c06c-ac51-441c-a993-fdbc89762b8f"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-db6576c1-29c8-4f8f-96bb-9595d9e1b79e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db6576c1-29c8-4f8f-96bb-9595d9e1b79e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db6576c1-29c8-4f8f-96bb-9595d9e1b79e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-db6576c1-29c8-4f8f-96bb-9595d9e1b79e"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4f8ff38a-5ac8-48a8-92ad-9aa1dad6c537

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ce65d33c33e945c79a3d3130cb84f0b7
X-Correlation-Id: qa-4f8ff38a-5ac8-48a8-92ad-9aa1dad6c537
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f8ff38a-5ac8-48a8-92ad-9aa1dad6c537
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-4f8ff38a-5ac8-48a8-92ad-9aa1dad6c537"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-5b9bb35e-63c6-42f6-bf66-fafb068358d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9bb35e-63c6-42f6-bf66-fafb068358d4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b9bb35e-63c6-42f6-bf66-fafb068358d4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-5b9bb35e-63c6-42f6-bf66-fafb068358d4"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-84f67301-ccdd-45b6-876a-0759709bdd7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f67301-ccdd-45b6-876a-0759709bdd7e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84f67301-ccdd-45b6-876a-0759709bdd7e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-84f67301-ccdd-45b6-876a-0759709bdd7e"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a17049f-41c9-4662-b82e-06e2d571e7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a17049f-41c9-4662-b82e-06e2d571e7b0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a17049f-41c9-4662-b82e-06e2d571e7b0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0a17049f-41c9-4662-b82e-06e2d571e7b0"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-53e5ce51-3de1-483f-946c-d4cae49e85b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53e5ce51-3de1-483f-946c-d4cae49e85b1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53e5ce51-3de1-483f-946c-d4cae49e85b1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-53e5ce51-3de1-483f-946c-d4cae49e85b1"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-021c5626-2529-4dbd-8930-69079c1c6185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-021c5626-2529-4dbd-8930-69079c1c6185
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-021c5626-2529-4dbd-8930-69079c1c6185
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-021c5626-2529-4dbd-8930-69079c1c6185"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c5daac3-5fe3-4dad-a65e-38de705e63f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5daac3-5fe3-4dad-a65e-38de705e63f5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c5daac3-5fe3-4dad-a65e-38de705e63f5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7c5daac3-5fe3-4dad-a65e-38de705e63f5"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-63b42fcc-dae5-47f5-8b15-3e5d2a80c868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b42fcc-dae5-47f5-8b15-3e5d2a80c868
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63b42fcc-dae5-47f5-8b15-3e5d2a80c868
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-63b42fcc-dae5-47f5-8b15-3e5d2a80c868"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4f42aff-51d7-4a8b-a6cf-56df934f26f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4f42aff-51d7-4a8b-a6cf-56df934f26f5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4f42aff-51d7-4a8b-a6cf-56df934f26f5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c4f42aff-51d7-4a8b-a6cf-56df934f26f5"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e5f9862-c614-48ce-accc-1bde51dccdff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e5f9862-c614-48ce-accc-1bde51dccdff
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e5f9862-c614-48ce-accc-1bde51dccdff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9e5f9862-c614-48ce-accc-1bde51dccdff"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9c98ee5-13b1-4a3d-b13e-06c6ac975f5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c98ee5-13b1-4a3d-b13e-06c6ac975f5d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9c98ee5-13b1-4a3d-b13e-06c6ac975f5d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a9c98ee5-13b1-4a3d-b13e-06c6ac975f5d"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0f452ef-4bd0-4192-808f-bb43914d493c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0f452ef-4bd0-4192-808f-bb43914d493c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0f452ef-4bd0-4192-808f-bb43914d493c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a0f452ef-4bd0-4192-808f-bb43914d493c"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-6cb0e9e6-955f-4e1e-94e9-718f9f2cf897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cb0e9e6-955f-4e1e-94e9-718f9f2cf897
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cb0e9e6-955f-4e1e-94e9-718f9f2cf897
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6cb0e9e6-955f-4e1e-94e9-718f9f2cf897"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7d862a7-54c0-45d5-9e66-c13eb709cab2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d862a7-54c0-45d5-9e66-c13eb709cab2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7d862a7-54c0-45d5-9e66-c13eb709cab2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f7d862a7-54c0-45d5-9e66-c13eb709cab2"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4485dc8-9c39-4719-b49e-9c1345a5738d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4485dc8-9c39-4719-b49e-9c1345a5738d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4485dc8-9c39-4719-b49e-9c1345a5738d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f4485dc8-9c39-4719-b49e-9c1345a5738d"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-c868b42c-3daa-47d4-8ff7-47dc9d706182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c868b42c-3daa-47d4-8ff7-47dc9d706182
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c868b42c-3daa-47d4-8ff7-47dc9d706182
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c868b42c-3daa-47d4-8ff7-47dc9d706182"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-652fe456-cb10-4905-8f1c-00ee50f0414b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-652fe456-cb10-4905-8f1c-00ee50f0414b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-652fe456-cb10-4905-8f1c-00ee50f0414b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-652fe456-cb10-4905-8f1c-00ee50f0414b"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-d882a6c5-4b42-4e32-aa5c-a036a3b7a455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d882a6c5-4b42-4e32-aa5c-a036a3b7a455
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d882a6c5-4b42-4e32-aa5c-a036a3b7a455
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d882a6c5-4b42-4e32-aa5c-a036a3b7a455"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d9bd6a2-65c1-437e-b706-eea2ee36e12f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9bd6a2-65c1-437e-b706-eea2ee36e12f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d9bd6a2-65c1-437e-b706-eea2ee36e12f
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

{"id":"acc_119b2e79-736f-43a3-8e0a-421a3605532b","handle":"qa-5af4a1960691","displayName":"QA 5af4a1960691","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.809151801Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-23a3537e-5c6c-4769-bba1-fcb4ddf2e0a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a3537e-5c6c-4769-bba1-fcb4ddf2e0a0
Content-Type: application/json

--- request body ---
{"handle":"qa-ea89463dd209","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-23a3537e-5c6c-4769-bba1-fcb4ddf2e0a0
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8104f2d-e646-4a8b-84bd-697ef4883092"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-652ed4db-92fa-4359-b926-0c97141589e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-652ed4db-92fa-4359-b926-0c97141589e6
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-652ed4db-92fa-4359-b926-0c97141589e6
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
correlation: qa-64f478c8-2e8c-4cec-99c7-6aae875d092f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64f478c8-2e8c-4cec-99c7-6aae875d092f
Content-Type: application/json

--- request body ---
{"handle":"qa-ea89463dd209","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64f478c8-2e8c-4cec-99c7-6aae875d092f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64f478c8-2e8c-4cec-99c7-6aae875d092f"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a419ddc-e7cd-444d-905f-9cf447ebe689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a419ddc-e7cd-444d-905f-9cf447ebe689
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Tue, 24 Nov 2026 12:38:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a419ddc-e7cd-444d-905f-9cf447ebe689
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
correlation: qa-4f450a5b-88e3-43f8-9ca7-324af2499646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f450a5b-88e3-43f8-9ca7-324af2499646
Content-Type: application/json

--- request body ---
{"handle":"qa-5af4a1960691","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 24 Nov 2026 12:38:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f450a5b-88e3-43f8-9ca7-324af2499646
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f450a5b-88e3-43f8-9ca7-324af2499646"}
```
