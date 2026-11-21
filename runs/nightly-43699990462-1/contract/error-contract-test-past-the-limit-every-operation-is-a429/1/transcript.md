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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-ab328e15-bf57-4c75-b212-2c30f0a8a4ec` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-3676dbce-2cf9-4f28-b3b0-117578c9da43` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-8a963fd6-d8ee-447e-abe6-4a8b1b7c7a06` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-7bc33ccd-279f-4a40-a6b9-e47085d8fbb0` |
| 5 | `GET /v1/accounts/me` | 200 | 33 | `qa-ea01daf6-57a7-4d98-9e39-f0c23d5feb0f` |
| 6 | `GET /v1/accounts/me` | 200 | 23 | `qa-9fd5a081-050b-4630-b703-1e5cd6db97f6` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-63bedf6d-d3d1-4dfc-b9b3-169cb595234c` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-bd8d6214-6973-4baa-95bb-ab9787648298` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-c57e1112-660c-4a1e-aa9b-a07558d49edd` |
| 10 | `GET /v1/accounts/me` | 200 | 16 | `qa-9b536525-6cf1-4df5-aedb-454eae8d632e` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-34b2367a-f032-49a6-a8e7-3e538a4d892a` |
| 12 | `GET /v1/accounts/me` | 200 | 6 | `qa-7c21be02-d542-47a0-b75e-3daa15471376` |
| 13 | `GET /v1/accounts/me` | 200 | 24 | `qa-276772f5-5626-4b83-b2bc-23046665bf0c` |
| 14 | `GET /v1/accounts/me` | 200 | 15 | `qa-9edd1699-f0fd-4fc9-89b0-08aff3669d5b` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-bb5f853c-743e-4118-8b37-0c25c2abb751` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-de18e5f1-546e-4a77-b688-50410a8c7780` |
| 17 | `GET /v1/accounts/me` | 200 | 21 | `qa-0bcf93ea-0db5-460c-a175-4b3b447425af` |
| 18 | `GET /v1/accounts/me` | 200 | 19 | `qa-27fe7457-9af6-498c-970e-6847bcd603fe` |
| 19 | `GET /v1/accounts/me` | 200 | 22 | `qa-2940276e-471f-459b-a278-d5b4f0828609` |
| 20 | `GET /v1/accounts/me` | 200 | 12 | `qa-d6bcef80-2a1e-498b-ad22-aefc24b67450` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-435ff674-88ad-42da-8cda-34084ab93756` |
| 22 | `GET /v1/accounts/me` | 200 | 28 | `qa-6f4402fb-6d24-407a-8432-858f728032e6` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-77a3f995-4097-4d38-984c-e6b5b83a403c` |
| 24 | `GET /v1/accounts/me` | 200 | 19 | `qa-f9f88c7e-8525-4aed-9e04-7c7a78bf407b` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-02537cfd-7c7c-465a-857a-63a485c01010` |
| 26 | `GET /v1/accounts/me` | 200 | 20 | `qa-9b07dd2a-fbb4-481a-9af0-9b6c24b836a0` |
| 27 | `GET /v1/accounts/me` | 200 | 10 | `qa-ffcde35e-8343-4627-9b57-f3424082c02b` |
| 28 | `GET /v1/accounts/me` | 200 | 15 | `qa-c3c235ad-e8d4-423e-9fc9-6df002dd654a` |
| 29 | `GET /v1/accounts/me` | 200 | 50 | `qa-95584352-1828-4109-93ea-6c197d8b8b48` |
| 30 | `GET /v1/accounts/me` | 200 | 29 | `qa-b07b6ded-bdca-4e20-bc33-e6d8c78ec0a3` |
| 31 | `GET /v1/accounts/me` | 200 | 27 | `qa-546063b2-d77a-468b-862f-c4fbb255d93a` |
| 32 | `GET /v1/accounts/me` | 200 | 14 | `qa-4f33e207-919c-4980-bbe4-817859d08700` |
| 33 | `GET /v1/accounts/me` | 200 | 12 | `qa-009fa6f6-b3bc-4301-9dd3-3d035b6e627d` |
| 34 | `GET /v1/accounts/me` | 200 | 15 | `qa-160ee650-86f4-4250-b41c-8da0c588e483` |
| 35 | `GET /v1/accounts/me` | 200 | 19 | `qa-725f27b0-d27b-410b-ade3-91773060c4ff` |
| 36 | `GET /v1/accounts/me` | 200 | 22 | `qa-012efe0e-e234-4f6d-8b75-a3d28392842c` |
| 37 | `GET /v1/accounts/me` | 200 | 17 | `qa-ce58f7a8-ef78-4b5e-88d0-ccd57604bdc8` |
| 38 | `GET /v1/accounts/me` | 200 | 14 | `qa-8ad323f4-49d3-4817-8cf6-8e2bf6d13385` |
| 39 | `GET /v1/accounts/me` | 200 | 19 | `qa-209d8f0d-8a2f-459d-b84d-c6946bdc5d44` |
| 40 | `GET /v1/accounts/me` | 200 | 3 | `qa-3a186af7-4195-468f-a7db-db6a224482ab` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-c3e20a93-4a35-427d-9997-7290fbf5f213` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-fecdf074-1c54-4621-8e21-a75fb44fb856` |
| 43 | `GET /v1/accounts/me` | 200 | 14 | `qa-ac0f737e-8bc6-45c6-9ef9-ee3bce59d947` |
| 44 | `GET /v1/accounts/me` | 200 | 18 | `qa-28620f5c-05cf-47b7-9df5-d3795726198c` |
| 45 | `GET /v1/accounts/me` | 200 | 14 | `qa-459ee486-6cd9-4afa-90dd-6159380cab9c` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-ef447041-98aa-4a60-b2f7-8a8c1044b039` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-8cc019d8-e18a-4efb-b74e-63217146d8e0` |
| 48 | `GET /v1/accounts/me` | 200 | 3 | `qa-37d166b8-5af8-4f54-8027-3710818e6836` |
| 49 | `GET /v1/accounts/me` | 200 | 3 | `qa-d9383cd5-8e15-4a18-91d8-5363695f37c5` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-096a1eea-818e-47d5-8327-690920c96e59` |
| 51 | `GET /v1/accounts/me` | 200 | 30 | `qa-324d7d06-e7aa-4afe-b988-a2677d827a44` |
| 52 | `GET /v1/accounts/me` | 200 | 13 | `qa-195f2332-e0e7-4676-ad9e-7b1379201df8` |
| 53 | `GET /v1/accounts/me` | 200 | 13 | `qa-7c9f4196-0f2b-478c-a49b-859742e800b2` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-bd1cdf1d-e13b-4d0f-8cf3-8f45ca4de0c4` |
| 55 | `GET /v1/accounts/me` | 200 | 10 | `qa-962503bd-8298-417b-966c-284d7077921c` |
| 56 | `GET /v1/accounts/me` | 200 | 8 | `qa-0c6189c4-0753-41a7-9178-49208631fc67` |
| 57 | `GET /v1/accounts/me` | 200 | 21 | `qa-83b50692-cac0-4119-8d2a-d08d2949a01f` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-fa4d3f88-9e8e-48b7-9d02-1409354b8111` |
| 59 | `GET /v1/accounts/me` | 200 | 3 | `qa-63e25910-c61c-4bb0-91a7-c7657321ae83` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-37ea6b96-f0cc-4353-9891-af70a4784811` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-684b15ad-2e87-4e77-99a0-2777e395c0c0` |
| 62 | `GET /v1/accounts/me` | 200 | 3 | `qa-2281fce1-bdf8-420b-8612-4e66212cfab7` |
| 63 | `GET /v1/accounts/me` | 200 | 5 | `qa-6ca7082d-7230-4089-ad0c-b61c5059ef63` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-a8585acb-237c-4a4a-862a-4d36c04173c7` |
| 65 | `POST /v1/auth/token` | 429 | 4 | `qa-fb70c573-4827-4cd4-8f1c-144361397a6b` |
| 66 | `POST /v1/accounts` | 429 | 2 | `qa-99af2773-38d2-432b-8a82-b3e8402fc8bb` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-4844ecf7-b8e2-4a22-81c4-07cbc4bb0b71` |
| 68 | `PATCH /v1/accounts/me` | 429 | 3 | `qa-a9f3e50d-78f2-44c1-8245-8bc4904f0e2c` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-ab64b121-6997-4295-b28a-fbf6ea4def0b` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-df2da535-ed7e-465b-a762-7a74efc0c3e1` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-0df20465-d995-46c7-9c5d-0cc21c7b1fee` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-748d3207-ef56-4b06-88dd-950fd15af405` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-4f7dc789-e3cf-43cf-9a37-31ba1900e690` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 3 | `qa-b55e913a-beab-4a75-aaf6-b588185c4232` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-10ebd9ac-88c8-498d-9858-a3ec59651841` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 7 | `qa-3a63d80d-d106-4dae-85a3-5430ccc1c041` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-a5159e43-51ed-4dc7-8277-0c6965f41fa5` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-6339ab5b-5eb1-4658-9a25-5e52f846796f` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-30d7b2a0-9e78-4acb-85fb-8128c5c319a2` |
| 80 | `POST /v1/credits/purchases` | 429 | 2 | `qa-200af062-d83b-446f-9ea0-843c2672addb` |
| 81 | `GET /v1/admin/stats` | 429 | 2 | `qa-2f54e016-794f-49d8-9334-571382cdfc81` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-bffdd642-5f0c-4017-8db6-22063443209c` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-d70ae547-86b0-4907-9f6e-6d832ce40400` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-776014b4-dde7-4fd3-9f6a-e4417d964b4d` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-04fc5cfc-cefc-4490-b865-6186bd9529d5` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-5465c54c-bd38-4430-b7f8-ee4a3a895f08` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-fe3dc3ba-f539-454b-914f-acadf80aafd6` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-30d9b0ef-471f-4a3d-8a04-8db851af8a63` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-c6d583c0-e4b6-45b8-8cb8-3a98818efc6f` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-5ce6386c-930e-42b1-bcf4-43f77e6daa1e` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-847213e2-8570-4e3d-ad1c-1269a95708bb` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-8760bf11-c9b0-48e7-87fa-9e0cffca4022` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-b9b642bd-068e-4394-8119-13f4a88e41e9` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-73ae9e70-c5ad-44e1-9a66-a29dd1598b13` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-5306f6dd-08b8-4d30-a226-fff0728039cb` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-335e1a89-8c31-4366-bc68-f81181c93471` |
| 97 | `GET /v1/accounts/me` | 429 | 5 | `qa-74515ac1-a389-420b-9f27-c3408ab89181` |
| 98 | `GET /v1/accounts/me` | 200 | 5 | `qa-8565044c-97c9-4ac5-883c-d1f07091a390` |
| 99 | `POST /v1/auth/token` | 200 | 8 | `qa-849ef817-e56e-4084-86a2-ec2d507b0882` |
| 100 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-89108a21-47b7-4738-91d6-eaba1ac5e047` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-0aa70ef3-9348-4e08-92ec-ef5fc3c5024a` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-c6c06df2-601e-44f7-9ab9-90220bf4680c` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-3c19631d-1dfa-45d0-8055-778398b0677b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ab328e15-bf57-4c75-b212-2c30f0a8a4ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab328e15-bf57-4c75-b212-2c30f0a8a4ec
Content-Type: application/json

--- request body ---
{"handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab328e15-bf57-4c75-b212-2c30f0a8a4ec
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
Location: /v1/accounts/qa-eed1c6b5013b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3676dbce-2cf9-4f28-b3b0-117578c9da43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3676dbce-2cf9-4f28-b3b0-117578c9da43
Content-Type: application/json

--- request body ---
{"handle":"qa-c660f6c6cd50","displayName":"QA c660f6c6cd50","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-3676dbce-2cf9-4f28-b3b0-117578c9da43
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
Location: /v1/accounts/qa-c660f6c6cd50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_edaa7707-2029-4fe6-bfda-17c19751a8fc","handle":"qa-c660f6c6cd50","displayName":"QA c660f6c6cd50","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.648070277Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a963fd6-d8ee-447e-abe6-4a8b1b7c7a06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a963fd6-d8ee-447e-abe6-4a8b1b7c7a06
Content-Type: application/json

--- request body ---
{"handle":"qa-eed1c6b5013b","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a963fd6-d8ee-447e-abe6-4a8b1b7c7a06
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7bc33ccd-279f-4a40-a6b9-e47085d8fbb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bc33ccd-279f-4a40-a6b9-e47085d8fbb0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c660f6c6cd50","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bc33ccd-279f-4a40-a6b9-e47085d8fbb0
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
Location: /v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2","subject":"Error contract","status":"open","region":"eu","participants":["qa-eed1c6b5013b","qa-c660f6c6cd50"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.714545915Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea01daf6-57a7-4d98-9e39-f0c23d5feb0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea01daf6-57a7-4d98-9e39-f0c23d5feb0f
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea01daf6-57a7-4d98-9e39-f0c23d5feb0f
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fd5a081-050b-4630-b703-1e5cd6db97f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd5a081-050b-4630-b703-1e5cd6db97f6
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fd5a081-050b-4630-b703-1e5cd6db97f6
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-63bedf6d-d3d1-4dfc-b9b3-169cb595234c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63bedf6d-d3d1-4dfc-b9b3-169cb595234c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-63bedf6d-d3d1-4dfc-b9b3-169cb595234c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd8d6214-6973-4baa-95bb-ab9787648298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd8d6214-6973-4baa-95bb-ab9787648298
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd8d6214-6973-4baa-95bb-ab9787648298
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-c57e1112-660c-4a1e-aa9b-a07558d49edd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c57e1112-660c-4a1e-aa9b-a07558d49edd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c57e1112-660c-4a1e-aa9b-a07558d49edd
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b536525-6cf1-4df5-aedb-454eae8d632e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b536525-6cf1-4df5-aedb-454eae8d632e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b536525-6cf1-4df5-aedb-454eae8d632e
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-34b2367a-f032-49a6-a8e7-3e538a4d892a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34b2367a-f032-49a6-a8e7-3e538a4d892a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-34b2367a-f032-49a6-a8e7-3e538a4d892a
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c21be02-d542-47a0-b75e-3daa15471376

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c21be02-d542-47a0-b75e-3daa15471376
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c21be02-d542-47a0-b75e-3daa15471376
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-276772f5-5626-4b83-b2bc-23046665bf0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-276772f5-5626-4b83-b2bc-23046665bf0c
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-276772f5-5626-4b83-b2bc-23046665bf0c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-9edd1699-f0fd-4fc9-89b0-08aff3669d5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9edd1699-f0fd-4fc9-89b0-08aff3669d5b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-9edd1699-f0fd-4fc9-89b0-08aff3669d5b
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb5f853c-743e-4118-8b37-0c25c2abb751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb5f853c-743e-4118-8b37-0c25c2abb751
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb5f853c-743e-4118-8b37-0c25c2abb751
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-de18e5f1-546e-4a77-b688-50410a8c7780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de18e5f1-546e-4a77-b688-50410a8c7780
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-de18e5f1-546e-4a77-b688-50410a8c7780
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bcf93ea-0db5-460c-a175-4b3b447425af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bcf93ea-0db5-460c-a175-4b3b447425af
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bcf93ea-0db5-460c-a175-4b3b447425af
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-27fe7457-9af6-498c-970e-6847bcd603fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27fe7457-9af6-498c-970e-6847bcd603fe
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-27fe7457-9af6-498c-970e-6847bcd603fe
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-2940276e-471f-459b-a278-d5b4f0828609

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2940276e-471f-459b-a278-d5b4f0828609
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-2940276e-471f-459b-a278-d5b4f0828609
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6bcef80-2a1e-498b-ad22-aefc24b67450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6bcef80-2a1e-498b-ad22-aefc24b67450
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6bcef80-2a1e-498b-ad22-aefc24b67450
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-435ff674-88ad-42da-8cda-34084ab93756

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435ff674-88ad-42da-8cda-34084ab93756
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-435ff674-88ad-42da-8cda-34084ab93756
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f4402fb-6d24-407a-8432-858f728032e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f4402fb-6d24-407a-8432-858f728032e6
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f4402fb-6d24-407a-8432-858f728032e6
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-77a3f995-4097-4d38-984c-e6b5b83a403c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77a3f995-4097-4d38-984c-e6b5b83a403c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-77a3f995-4097-4d38-984c-e6b5b83a403c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9f88c7e-8525-4aed-9e04-7c7a78bf407b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9f88c7e-8525-4aed-9e04-7c7a78bf407b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9f88c7e-8525-4aed-9e04-7c7a78bf407b
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-02537cfd-7c7c-465a-857a-63a485c01010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02537cfd-7c7c-465a-857a-63a485c01010
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-02537cfd-7c7c-465a-857a-63a485c01010
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b07dd2a-fbb4-481a-9af0-9b6c24b836a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b07dd2a-fbb4-481a-9af0-9b6c24b836a0
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b07dd2a-fbb4-481a-9af0-9b6c24b836a0
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffcde35e-8343-4627-9b57-f3424082c02b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffcde35e-8343-4627-9b57-f3424082c02b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffcde35e-8343-4627-9b57-f3424082c02b
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3c235ad-e8d4-423e-9fc9-6df002dd654a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3c235ad-e8d4-423e-9fc9-6df002dd654a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3c235ad-e8d4-423e-9fc9-6df002dd654a
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-95584352-1828-4109-93ea-6c197d8b8b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95584352-1828-4109-93ea-6c197d8b8b48
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-95584352-1828-4109-93ea-6c197d8b8b48
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-b07b6ded-bdca-4e20-bc33-e6d8c78ec0a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b07b6ded-bdca-4e20-bc33-e6d8c78ec0a3
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b07b6ded-bdca-4e20-bc33-e6d8c78ec0a3
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-546063b2-d77a-468b-862f-c4fbb255d93a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-546063b2-d77a-468b-862f-c4fbb255d93a
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-546063b2-d77a-468b-862f-c4fbb255d93a
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f33e207-919c-4980-bbe4-817859d08700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f33e207-919c-4980-bbe4-817859d08700
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f33e207-919c-4980-bbe4-817859d08700
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-009fa6f6-b3bc-4301-9dd3-3d035b6e627d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-009fa6f6-b3bc-4301-9dd3-3d035b6e627d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-009fa6f6-b3bc-4301-9dd3-3d035b6e627d
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-160ee650-86f4-4250-b41c-8da0c588e483

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-160ee650-86f4-4250-b41c-8da0c588e483
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-160ee650-86f4-4250-b41c-8da0c588e483
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-725f27b0-d27b-410b-ade3-91773060c4ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-725f27b0-d27b-410b-ade3-91773060c4ff
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-725f27b0-d27b-410b-ade3-91773060c4ff
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-012efe0e-e234-4f6d-8b75-a3d28392842c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-012efe0e-e234-4f6d-8b75-a3d28392842c
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-012efe0e-e234-4f6d-8b75-a3d28392842c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce58f7a8-ef78-4b5e-88d0-ccd57604bdc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce58f7a8-ef78-4b5e-88d0-ccd57604bdc8
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce58f7a8-ef78-4b5e-88d0-ccd57604bdc8
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ad323f4-49d3-4817-8cf6-8e2bf6d13385

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad323f4-49d3-4817-8cf6-8e2bf6d13385
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad323f4-49d3-4817-8cf6-8e2bf6d13385
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-209d8f0d-8a2f-459d-b84d-c6946bdc5d44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-209d8f0d-8a2f-459d-b84d-c6946bdc5d44
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-209d8f0d-8a2f-459d-b84d-c6946bdc5d44
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a186af7-4195-468f-a7db-db6a224482ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a186af7-4195-468f-a7db-db6a224482ab
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a186af7-4195-468f-a7db-db6a224482ab
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3e20a93-4a35-427d-9997-7290fbf5f213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3e20a93-4a35-427d-9997-7290fbf5f213
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3e20a93-4a35-427d-9997-7290fbf5f213
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-fecdf074-1c54-4621-8e21-a75fb44fb856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fecdf074-1c54-4621-8e21-a75fb44fb856
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fecdf074-1c54-4621-8e21-a75fb44fb856
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac0f737e-8bc6-45c6-9ef9-ee3bce59d947

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0f737e-8bc6-45c6-9ef9-ee3bce59d947
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac0f737e-8bc6-45c6-9ef9-ee3bce59d947
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-28620f5c-05cf-47b7-9df5-d3795726198c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28620f5c-05cf-47b7-9df5-d3795726198c
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-28620f5c-05cf-47b7-9df5-d3795726198c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-459ee486-6cd9-4afa-90dd-6159380cab9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-459ee486-6cd9-4afa-90dd-6159380cab9c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-459ee486-6cd9-4afa-90dd-6159380cab9c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef447041-98aa-4a60-b2f7-8a8c1044b039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef447041-98aa-4a60-b2f7-8a8c1044b039
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef447041-98aa-4a60-b2f7-8a8c1044b039
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cc019d8-e18a-4efb-b74e-63217146d8e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cc019d8-e18a-4efb-b74e-63217146d8e0
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cc019d8-e18a-4efb-b74e-63217146d8e0
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-37d166b8-5af8-4f54-8027-3710818e6836

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d166b8-5af8-4f54-8027-3710818e6836
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-37d166b8-5af8-4f54-8027-3710818e6836
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9383cd5-8e15-4a18-91d8-5363695f37c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9383cd5-8e15-4a18-91d8-5363695f37c5
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9383cd5-8e15-4a18-91d8-5363695f37c5
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-096a1eea-818e-47d5-8327-690920c96e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-096a1eea-818e-47d5-8327-690920c96e59
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-096a1eea-818e-47d5-8327-690920c96e59
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-324d7d06-e7aa-4afe-b988-a2677d827a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-324d7d06-e7aa-4afe-b988-a2677d827a44
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-324d7d06-e7aa-4afe-b988-a2677d827a44
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-195f2332-e0e7-4676-ad9e-7b1379201df8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-195f2332-e0e7-4676-ad9e-7b1379201df8
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-195f2332-e0e7-4676-ad9e-7b1379201df8
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c9f4196-0f2b-478c-a49b-859742e800b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c9f4196-0f2b-478c-a49b-859742e800b2
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c9f4196-0f2b-478c-a49b-859742e800b2
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd1cdf1d-e13b-4d0f-8cf3-8f45ca4de0c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd1cdf1d-e13b-4d0f-8cf3-8f45ca4de0c4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd1cdf1d-e13b-4d0f-8cf3-8f45ca4de0c4
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-962503bd-8298-417b-966c-284d7077921c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-962503bd-8298-417b-966c-284d7077921c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-962503bd-8298-417b-966c-284d7077921c
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c6189c4-0753-41a7-9178-49208631fc67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c6189c4-0753-41a7-9178-49208631fc67
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c6189c4-0753-41a7-9178-49208631fc67
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-83b50692-cac0-4119-8d2a-d08d2949a01f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83b50692-cac0-4119-8d2a-d08d2949a01f
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-83b50692-cac0-4119-8d2a-d08d2949a01f
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa4d3f88-9e8e-48b7-9d02-1409354b8111

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa4d3f88-9e8e-48b7-9d02-1409354b8111
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa4d3f88-9e8e-48b7-9d02-1409354b8111
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-63e25910-c61c-4bb0-91a7-c7657321ae83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e25910-c61c-4bb0-91a7-c7657321ae83
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-63e25910-c61c-4bb0-91a7-c7657321ae83
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-37ea6b96-f0cc-4353-9891-af70a4784811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ea6b96-f0cc-4353-9891-af70a4784811
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-37ea6b96-f0cc-4353-9891-af70a4784811
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-684b15ad-2e87-4e77-99a0-2777e395c0c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-684b15ad-2e87-4e77-99a0-2777e395c0c0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-684b15ad-2e87-4e77-99a0-2777e395c0c0
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-2281fce1-bdf8-420b-8612-4e66212cfab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2281fce1-bdf8-420b-8612-4e66212cfab7
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2281fce1-bdf8-420b-8612-4e66212cfab7
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ca7082d-7230-4089-ad0c-b61c5059ef63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca7082d-7230-4089-ad0c-b61c5059ef63
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca7082d-7230-4089-ad0c-b61c5059ef63
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8585acb-237c-4a4a-862a-4d36c04173c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8585acb-237c-4a4a-862a-4d36c04173c7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8585acb-237c-4a4a-862a-4d36c04173c7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a8585acb-237c-4a4a-862a-4d36c04173c7"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-fb70c573-4827-4cd4-8f1c-144361397a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb70c573-4827-4cd4-8f1c-144361397a6b
Content-Type: application/json

--- request body ---
{"handle":"qa-eed1c6b5013b","password":"****"}

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb70c573-4827-4cd4-8f1c-144361397a6b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-fb70c573-4827-4cd4-8f1c-144361397a6b"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-99af2773-38d2-432b-8a82-b3e8402fc8bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99af2773-38d2-432b-8a82-b3e8402fc8bb
Content-Type: application/json

--- request body ---
{"handle":"qa-1f786d012b7d","displayName":"QA 1f786d012b7d","password":"****","region":"eu"}

--- response: 429 in 2 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99af2773-38d2-432b-8a82-b3e8402fc8bb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-99af2773-38d2-432b-8a82-b3e8402fc8bb"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-4844ecf7-b8e2-4a22-81c4-07cbc4bb0b71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4844ecf7-b8e2-4a22-81c4-07cbc4bb0b71
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4844ecf7-b8e2-4a22-81c4-07cbc4bb0b71
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4844ecf7-b8e2-4a22-81c4-07cbc4bb0b71"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a9f3e50d-78f2-44c1-8245-8bc4904f0e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9f3e50d-78f2-44c1-8245-8bc4904f0e2c
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9f3e50d-78f2-44c1-8245-8bc4904f0e2c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a9f3e50d-78f2-44c1-8245-8bc4904f0e2c"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab64b121-6997-4295-b28a-fbf6ea4def0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab64b121-6997-4295-b28a-fbf6ea4def0b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab64b121-6997-4295-b28a-fbf6ea4def0b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ab64b121-6997-4295-b28a-fbf6ea4def0b"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-eed1c6b5013b
correlation: qa-df2da535-ed7e-465b-a762-7a74efc0c3e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df2da535-ed7e-465b-a762-7a74efc0c3e1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df2da535-ed7e-465b-a762-7a74efc0c3e1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-eed1c6b5013b","correlationId":"qa-df2da535-ed7e-465b-a762-7a74efc0c3e1"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-0df20465-d995-46c7-9c5d-0cc21c7b1fee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0df20465-d995-46c7-9c5d-0cc21c7b1fee
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-eed1c6b5013b","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0df20465-d995-46c7-9c5d-0cc21c7b1fee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-0df20465-d995-46c7-9c5d-0cc21c7b1fee"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-748d3207-ef56-4b06-88dd-950fd15af405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-748d3207-ef56-4b06-88dd-950fd15af405
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-748d3207-ef56-4b06-88dd-950fd15af405
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-748d3207-ef56-4b06-88dd-950fd15af405"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2
correlation: qa-4f7dc789-e3cf-43cf-9a37-31ba1900e690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f7dc789-e3cf-43cf-9a37-31ba1900e690
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f7dc789-e3cf-43cf-9a37-31ba1900e690
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2","correlationId":"qa-4f7dc789-e3cf-43cf-9a37-31ba1900e690"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/messages
correlation: qa-b55e913a-beab-4a75-aaf6-b588185c4232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55e913a-beab-4a75-aaf6-b588185c4232
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b55e913a-beab-4a75-aaf6-b588185c4232
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/messages","correlationId":"qa-b55e913a-beab-4a75-aaf6-b588185c4232"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/messages
correlation: qa-10ebd9ac-88c8-498d-9858-a3ec59651841

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ebd9ac-88c8-498d-9858-a3ec59651841
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10ebd9ac-88c8-498d-9858-a3ec59651841
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/messages","correlationId":"qa-10ebd9ac-88c8-498d-9858-a3ec59651841"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/read
correlation: qa-3a63d80d-d106-4dae-85a3-5430ccc1c041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a63d80d-d106-4dae-85a3-5430ccc1c041
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a63d80d-d106-4dae-85a3-5430ccc1c041
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/read","correlationId":"qa-3a63d80d-d106-4dae-85a3-5430ccc1c041"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/close
correlation: qa-a5159e43-51ed-4dc7-8277-0c6965f41fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5159e43-51ed-4dc7-8277-0c6965f41fa5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5159e43-51ed-4dc7-8277-0c6965f41fa5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_78ae94ec-24fb-49ce-a2e6-f31afd3cc8f2/close","correlationId":"qa-a5159e43-51ed-4dc7-8277-0c6965f41fa5"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-6339ab5b-5eb1-4658-9a25-5e52f846796f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6339ab5b-5eb1-4658-9a25-5e52f846796f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6339ab5b-5eb1-4658-9a25-5e52f846796f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-6339ab5b-5eb1-4658-9a25-5e52f846796f"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-30d7b2a0-9e78-4acb-85fb-8128c5c319a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d7b2a0-9e78-4acb-85fb-8128c5c319a2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30d7b2a0-9e78-4acb-85fb-8128c5c319a2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-30d7b2a0-9e78-4acb-85fb-8128c5c319a2"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-200af062-d83b-446f-9ea0-843c2672addb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5792b26ae9ef4db7aa1b013be93910fe
X-Correlation-Id: qa-200af062-d83b-446f-9ea0-843c2672addb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 2 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-200af062-d83b-446f-9ea0-843c2672addb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-200af062-d83b-446f-9ea0-843c2672addb"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-2f54e016-794f-49d8-9334-571382cdfc81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f54e016-794f-49d8-9334-571382cdfc81
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f54e016-794f-49d8-9334-571382cdfc81
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-2f54e016-794f-49d8-9334-571382cdfc81"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-bffdd642-5f0c-4017-8db6-22063443209c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bffdd642-5f0c-4017-8db6-22063443209c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bffdd642-5f0c-4017-8db6-22063443209c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bffdd642-5f0c-4017-8db6-22063443209c"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-d70ae547-86b0-4907-9f6e-6d832ce40400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d70ae547-86b0-4907-9f6e-6d832ce40400
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d70ae547-86b0-4907-9f6e-6d832ce40400
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d70ae547-86b0-4907-9f6e-6d832ce40400"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-776014b4-dde7-4fd3-9f6a-e4417d964b4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-776014b4-dde7-4fd3-9f6a-e4417d964b4d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-776014b4-dde7-4fd3-9f6a-e4417d964b4d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-776014b4-dde7-4fd3-9f6a-e4417d964b4d"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-04fc5cfc-cefc-4490-b865-6186bd9529d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04fc5cfc-cefc-4490-b865-6186bd9529d5
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04fc5cfc-cefc-4490-b865-6186bd9529d5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-04fc5cfc-cefc-4490-b865-6186bd9529d5"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-5465c54c-bd38-4430-b7f8-ee4a3a895f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5465c54c-bd38-4430-b7f8-ee4a3a895f08
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5465c54c-bd38-4430-b7f8-ee4a3a895f08
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5465c54c-bd38-4430-b7f8-ee4a3a895f08"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe3dc3ba-f539-454b-914f-acadf80aafd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe3dc3ba-f539-454b-914f-acadf80aafd6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe3dc3ba-f539-454b-914f-acadf80aafd6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fe3dc3ba-f539-454b-914f-acadf80aafd6"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-30d9b0ef-471f-4a3d-8a04-8db851af8a63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d9b0ef-471f-4a3d-8a04-8db851af8a63
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30d9b0ef-471f-4a3d-8a04-8db851af8a63
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-30d9b0ef-471f-4a3d-8a04-8db851af8a63"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-c6d583c0-e4b6-45b8-8cb8-3a98818efc6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d583c0-e4b6-45b8-8cb8-3a98818efc6f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c6d583c0-e4b6-45b8-8cb8-3a98818efc6f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c6d583c0-e4b6-45b8-8cb8-3a98818efc6f"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ce6386c-930e-42b1-bcf4-43f77e6daa1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce6386c-930e-42b1-bcf4-43f77e6daa1e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ce6386c-930e-42b1-bcf4-43f77e6daa1e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5ce6386c-930e-42b1-bcf4-43f77e6daa1e"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-847213e2-8570-4e3d-ad1c-1269a95708bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-847213e2-8570-4e3d-ad1c-1269a95708bb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-847213e2-8570-4e3d-ad1c-1269a95708bb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-847213e2-8570-4e3d-ad1c-1269a95708bb"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-8760bf11-c9b0-48e7-87fa-9e0cffca4022

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8760bf11-c9b0-48e7-87fa-9e0cffca4022
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8760bf11-c9b0-48e7-87fa-9e0cffca4022
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8760bf11-c9b0-48e7-87fa-9e0cffca4022"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9b642bd-068e-4394-8119-13f4a88e41e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9b642bd-068e-4394-8119-13f4a88e41e9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9b642bd-068e-4394-8119-13f4a88e41e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b9b642bd-068e-4394-8119-13f4a88e41e9"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-73ae9e70-c5ad-44e1-9a66-a29dd1598b13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ae9e70-c5ad-44e1-9a66-a29dd1598b13
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73ae9e70-c5ad-44e1-9a66-a29dd1598b13
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-73ae9e70-c5ad-44e1-9a66-a29dd1598b13"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-5306f6dd-08b8-4d30-a226-fff0728039cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5306f6dd-08b8-4d30-a226-fff0728039cb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5306f6dd-08b8-4d30-a226-fff0728039cb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5306f6dd-08b8-4d30-a226-fff0728039cb"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-335e1a89-8c31-4366-bc68-f81181c93471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-335e1a89-8c31-4366-bc68-f81181c93471
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-335e1a89-8c31-4366-bc68-f81181c93471
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-335e1a89-8c31-4366-bc68-f81181c93471"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-74515ac1-a389-420b-9f27-c3408ab89181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74515ac1-a389-420b-9f27-c3408ab89181
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74515ac1-a389-420b-9f27-c3408ab89181
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-74515ac1-a389-420b-9f27-c3408ab89181"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-8565044c-97c9-4ac5-883c-d1f07091a390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8565044c-97c9-4ac5-883c-d1f07091a390
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-8565044c-97c9-4ac5-883c-d1f07091a390
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

{"id":"acc_7bbefc0b-2e1d-49db-bcac-99ae2d55d13a","handle":"qa-eed1c6b5013b","displayName":"QA eed1c6b5013b","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.595983888Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-849ef817-e56e-4084-86a2-ec2d507b0882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-849ef817-e56e-4084-86a2-ec2d507b0882
Content-Type: application/json

--- request body ---
{"handle":"qa-c660f6c6cd50","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-849ef817-e56e-4084-86a2-ec2d507b0882
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edaa7707-2029-4fe6-bfda-17c19751a8fc"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89108a21-47b7-4738-91d6-eaba1ac5e047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89108a21-47b7-4738-91d6-eaba1ac5e047
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89108a21-47b7-4738-91d6-eaba1ac5e047
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
correlation: qa-0aa70ef3-9348-4e08-92ec-ef5fc3c5024a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa70ef3-9348-4e08-92ec-ef5fc3c5024a
Content-Type: application/json

--- request body ---
{"handle":"qa-c660f6c6cd50","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0aa70ef3-9348-4e08-92ec-ef5fc3c5024a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0aa70ef3-9348-4e08-92ec-ef5fc3c5024a"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6c06df2-601e-44f7-9ab9-90220bf4680c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c06df2-601e-44f7-9ab9-90220bf4680c
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6c06df2-601e-44f7-9ab9-90220bf4680c
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
correlation: qa-3c19631d-1dfa-45d0-8055-778398b0677b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c19631d-1dfa-45d0-8055-778398b0677b
Content-Type: application/json

--- request body ---
{"handle":"qa-eed1c6b5013b","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 15 Nov 2026 09:36:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c19631d-1dfa-45d0-8055-778398b0677b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c19631d-1dfa-45d0-8055-778398b0677b"}
```
