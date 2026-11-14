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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-4121d884-46af-4f97-9195-3a90e8d245fc` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-1fba64bc-b306-4928-817a-e0c90185c20a` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-522fd3d0-4422-479b-8432-574391e254ad` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-cf079b4f-4875-44ad-b80f-81728dc80db5` |
| 5 | `GET /v1/accounts/me` | 200 | 27 | `qa-19d3bee9-98e2-45bd-983f-64cd0b302ed9` |
| 6 | `GET /v1/accounts/me` | 200 | 11 | `qa-e58c4a52-ed7a-4af7-8a6f-b5e03a4049af` |
| 7 | `GET /v1/accounts/me` | 200 | 13 | `qa-51b28f8e-f632-4355-ad54-214e04075350` |
| 8 | `GET /v1/accounts/me` | 200 | 19 | `qa-7139c157-b258-48ba-a606-50c70169c76f` |
| 9 | `GET /v1/accounts/me` | 200 | 10 | `qa-fd0f4e87-b5cb-44e2-8c50-cc6042a2cbbe` |
| 10 | `GET /v1/accounts/me` | 200 | 25 | `qa-ff43e81e-5ae9-48b8-a20c-ec95e36b596c` |
| 11 | `GET /v1/accounts/me` | 200 | 6 | `qa-dee265b3-a8dc-491e-9eea-c603dc27970a` |
| 12 | `GET /v1/accounts/me` | 200 | 7 | `qa-681a134b-5a4b-4f16-b661-4e895eb577c9` |
| 13 | `GET /v1/accounts/me` | 200 | 7 | `qa-af9e7794-15cd-4a3a-9dfe-b1f0d03b58bf` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-a27a38ba-d90b-4c06-986a-7e679c1b1420` |
| 15 | `GET /v1/accounts/me` | 200 | 16 | `qa-94ceaec0-24e3-4b1e-999d-1a58afd9ae10` |
| 16 | `GET /v1/accounts/me` | 200 | 13 | `qa-0ce5ed77-0b09-492c-b560-5bded4f11730` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-9716cf42-a919-42d7-95f9-ba5bcf463714` |
| 18 | `GET /v1/accounts/me` | 200 | 25 | `qa-0f36d762-ebc4-4f15-910b-340ece837a05` |
| 19 | `GET /v1/accounts/me` | 200 | 14 | `qa-0e6364c4-144b-4de2-8ab9-9a3780460d64` |
| 20 | `GET /v1/accounts/me` | 200 | 24 | `qa-7bf76ffb-927a-4bf0-ae63-1ef7ae64c134` |
| 21 | `GET /v1/accounts/me` | 200 | 7 | `qa-148513f3-ace0-4a1d-881a-855007044afc` |
| 22 | `GET /v1/accounts/me` | 200 | 4 | `qa-607e44c5-ab69-4403-b1d2-5830ab1597e7` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-b2c4e790-ec53-4993-bc46-7035993b626a` |
| 24 | `GET /v1/accounts/me` | 200 | 15 | `qa-34d935cf-27e0-49b6-a488-7f28306845f5` |
| 25 | `GET /v1/accounts/me` | 200 | 24 | `qa-1c594cce-be9d-4f29-a760-ff33e381566f` |
| 26 | `GET /v1/accounts/me` | 200 | 21 | `qa-ac0d9a85-b33c-48f5-94c2-43864d1bf0ec` |
| 27 | `GET /v1/accounts/me` | 200 | 29 | `qa-18b8171c-f4a4-45bf-a38f-826d6c5ca1db` |
| 28 | `GET /v1/accounts/me` | 200 | 26 | `qa-3e8adfaa-9432-4328-ba5e-fa2871671a27` |
| 29 | `GET /v1/accounts/me` | 200 | 33 | `qa-ce33fea3-c237-416a-9433-6ccfb63ce8f9` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-997c94d0-ff56-45a2-90e9-d04d654f8a9e` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-35a63fea-5dbb-47d7-8122-ff2ac0f2739e` |
| 32 | `GET /v1/accounts/me` | 200 | 11 | `qa-d27cedc5-aa51-4fef-83a1-1c1e0def128f` |
| 33 | `GET /v1/accounts/me` | 200 | 14 | `qa-6eaa3246-92ec-4622-9e7f-2734f1e8d125` |
| 34 | `GET /v1/accounts/me` | 200 | 19 | `qa-3d4f1926-8f58-4b31-9305-70d7cd92265b` |
| 35 | `GET /v1/accounts/me` | 200 | 12 | `qa-498e9fa3-df45-4027-ad53-2abd3983adab` |
| 36 | `GET /v1/accounts/me` | 200 | 14 | `qa-36d5e602-9e6e-460c-b60a-b7626b1ab76f` |
| 37 | `GET /v1/accounts/me` | 200 | 14 | `qa-cdddee62-21bf-4682-82af-ad7f4c8ba4a6` |
| 38 | `GET /v1/accounts/me` | 200 | 12 | `qa-5e194288-0fc2-452f-9475-5165f1d7d54f` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-7acdf02f-8ac7-4a82-ae88-27b2bec517b8` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-8c8465fe-c532-4491-8d2e-d6047ea8d1fb` |
| 41 | `GET /v1/accounts/me` | 200 | 3 | `qa-37ff2570-7414-42f6-af75-d3169fd840c0` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-1d97ce41-6cf8-47ab-b8ad-c8fc7fab675c` |
| 43 | `GET /v1/accounts/me` | 200 | 3 | `qa-1089fe54-b14b-45c3-ac99-73b8184614cb` |
| 44 | `GET /v1/accounts/me` | 200 | 3 | `qa-41ed685d-7d9a-4e45-9541-71143cf33cdb` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-e68fb7af-f7d0-4bbf-8f63-3587d57f5bd2` |
| 46 | `GET /v1/accounts/me` | 200 | 2 | `qa-b0540ead-6bdf-4f58-908f-939a301a5e13` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-e84e1424-ebcd-4691-b5da-0bc52668dde1` |
| 48 | `GET /v1/accounts/me` | 200 | 6 | `qa-edb9e884-1a4f-4f84-8021-d5ec232802ab` |
| 49 | `GET /v1/accounts/me` | 200 | 23 | `qa-1ed0acf5-74f6-44c4-92c8-3fc2cdda9e0d` |
| 50 | `GET /v1/accounts/me` | 200 | 4 | `qa-35108de4-3d7f-43e2-be51-5e1ca5e48ca1` |
| 51 | `GET /v1/accounts/me` | 200 | 3 | `qa-496cc4c4-0228-486a-9978-2fd035ed335f` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-93487b2c-7fa0-4d48-85e7-d00088ee612c` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-c18debbe-ba52-43f1-9d51-e87cc84cb2e9` |
| 54 | `GET /v1/accounts/me` | 200 | 8 | `qa-8d64cbd4-38c2-48dc-8d27-61cac70ba70d` |
| 55 | `GET /v1/accounts/me` | 200 | 2 | `qa-f4b0de71-177e-4492-ba24-e461ce84ab42` |
| 56 | `GET /v1/accounts/me` | 200 | 2 | `qa-b9c042a3-ddbd-461b-a4fd-9189f99c68fa` |
| 57 | `GET /v1/accounts/me` | 200 | 1 | `qa-56a6ecd0-b980-4538-90e1-30c893da63c9` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-10f27c46-4dfe-42d8-af76-912fa25e6791` |
| 59 | `GET /v1/accounts/me` | 200 | 2 | `qa-b5459d01-a9de-45f5-b6ba-80fd5c88cc1a` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-8917e531-84d2-4f6a-9e4b-9b89442a53bd` |
| 61 | `GET /v1/accounts/me` | 200 | 10 | `qa-0bfd1c3c-6a0e-4b5e-b7a1-91fb2363e35e` |
| 62 | `GET /v1/accounts/me` | 200 | 11 | `qa-a066cb91-ff9a-4d52-8cb8-857c628f17cb` |
| 63 | `GET /v1/accounts/me` | 200 | 11 | `qa-20f8faf6-4900-41e6-acbe-f5da254c3686` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-31edea1e-d880-4959-8dbb-e7791fd3168c` |
| 65 | `POST /v1/auth/token` | 429 | 15 | `qa-a6c28b1e-7e41-476f-9cdf-531daa7d9ba6` |
| 66 | `POST /v1/accounts` | 429 | 5 | `qa-61bd2d46-bcda-4e1a-afef-6d2c05a18e8b` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-888ac9c3-a66f-4cc1-996f-fccc93932c1d` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-fc26dd8f-1797-4767-a4aa-e3c45cfb1543` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-46703b24-6df1-40e6-9907-991be2eb0286` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-efe3fc34-3dc2-4bea-b6d3-d90ea6fa262a` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-3e3909fc-57df-4b6a-99df-17e52203e59c` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-cd07dbd4-1d71-40a8-a5bf-be1c2c20d519` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-119cf739-d896-4928-998d-d13c544cc193` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 5 | `qa-c4ee7aaa-4c91-42ff-ae4d-cb08b809c28b` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-9d18f518-8201-4aaa-8333-29f622c46bcd` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-cc716349-4493-4767-bb6f-e8e4dde06b07` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-b3c57a76-b976-45ca-8543-31525ced9115` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-b47bc724-7c7f-4947-acdb-64ba75959b54` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-35f93a3b-7c82-4031-b7f4-a93ec0b2ee2d` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-60e4ca37-2d0f-4c92-8c0a-01901b84f1fc` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-d9329774-18f6-4dcc-8be8-def527aca1dc` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-9dcdb9bb-a287-4246-a6ba-be5c47998a94` |
| 83 | `GET /v1/accounts/me` | 429 | 6 | `qa-dace8832-a2b5-4804-a7a9-6be0056185cd` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-ff66bc4b-7768-4aca-8685-65fac6f5181a` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-be1a6495-031d-43d3-a0fc-523e7a5c58dd` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-580394f0-1788-4499-afa5-7433045e193d` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-b6e3510a-af65-4b6f-a798-2f4364c0de13` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-6ab31682-fad1-4303-89fc-898e4da46048` |
| 89 | `GET /v1/accounts/me` | 429 | 2 | `qa-487697b4-e4cd-40ac-bd5d-fa29f02d3b08` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-4ddfad7d-e4a1-4309-bcb1-8807bc66fc05` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-decfb9a5-8ef2-422e-ae98-b2994be8685c` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-1bf306c1-331e-430a-b475-4ae6741a9c5b` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-7530509f-0113-4c17-8b68-8f63ea1700a1` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-71641346-e181-4dec-94ca-2621112aca00` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-6bb37b3f-9abd-4a9a-9a11-735c231f7bec` |
| 96 | `GET /v1/accounts/me` | 429 | 3 | `qa-39e69596-c253-4396-9a80-89e42d3ff88e` |
| 97 | `GET /v1/accounts/me` | 429 | 3 | `qa-2beccbdb-becd-401d-b847-baed05667f2a` |
| 98 | `GET /v1/accounts/me` | 200 | 9 | `qa-c20a31b3-ed1d-4c83-99a8-1342a070870d` |
| 99 | `POST /v1/auth/token` | 200 | 6 | `qa-ba2caa9d-023f-479b-8677-354112b8f24c` |
| 100 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-6d5693a8-e647-4a34-9c27-8394f493956d` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-40d702bf-7da0-4983-9da7-ce535da5682e` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-442c7a21-1ebc-4a3a-888e-c54b433b2c84` |
| 103 | `POST /v1/auth/token` | 401 | 19 | `qa-bf239ca1-6d74-488b-8dcb-56eb1a01730d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4121d884-46af-4f97-9195-3a90e8d245fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4121d884-46af-4f97-9195-3a90e8d245fc
Content-Type: application/json

--- request body ---
{"handle":"qa-53eae9716807","displayName":"QA 53eae9716807","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4121d884-46af-4f97-9195-3a90e8d245fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 9
Location: /v1/accounts/qa-53eae9716807
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1fba64bc-b306-4928-817a-e0c90185c20a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fba64bc-b306-4928-817a-e0c90185c20a
Content-Type: application/json

--- request body ---
{"handle":"qa-8f4840e3b3a5","displayName":"QA 8f4840e3b3a5","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1fba64bc-b306-4928-817a-e0c90185c20a
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
Location: /v1/accounts/qa-8f4840e3b3a5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c3f62cdf-a981-4208-80b6-5813741a0a0e","handle":"qa-8f4840e3b3a5","displayName":"QA 8f4840e3b3a5","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.128812890Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-522fd3d0-4422-479b-8432-574391e254ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-522fd3d0-4422-479b-8432-574391e254ad
Content-Type: application/json

--- request body ---
{"handle":"qa-53eae9716807","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-522fd3d0-4422-479b-8432-574391e254ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b17497c7-68ac-4a96-8c7c-79d381737693"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf079b4f-4875-44ad-b80f-81728dc80db5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf079b4f-4875-44ad-b80f-81728dc80db5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8f4840e3b3a5","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf079b4f-4875-44ad-b80f-81728dc80db5
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
Location: /v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc","subject":"Error contract","status":"open","region":"eu","participants":["qa-53eae9716807","qa-8f4840e3b3a5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.205807864Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-19d3bee9-98e2-45bd-983f-64cd0b302ed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d3bee9-98e2-45bd-983f-64cd0b302ed9
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-19d3bee9-98e2-45bd-983f-64cd0b302ed9
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e58c4a52-ed7a-4af7-8a6f-b5e03a4049af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e58c4a52-ed7a-4af7-8a6f-b5e03a4049af
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e58c4a52-ed7a-4af7-8a6f-b5e03a4049af
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-51b28f8e-f632-4355-ad54-214e04075350

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b28f8e-f632-4355-ad54-214e04075350
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-51b28f8e-f632-4355-ad54-214e04075350
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-7139c157-b258-48ba-a606-50c70169c76f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7139c157-b258-48ba-a606-50c70169c76f
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7139c157-b258-48ba-a606-50c70169c76f
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd0f4e87-b5cb-44e2-8c50-cc6042a2cbbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd0f4e87-b5cb-44e2-8c50-cc6042a2cbbe
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd0f4e87-b5cb-44e2-8c50-cc6042a2cbbe
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff43e81e-5ae9-48b8-a20c-ec95e36b596c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff43e81e-5ae9-48b8-a20c-ec95e36b596c
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff43e81e-5ae9-48b8-a20c-ec95e36b596c
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-dee265b3-a8dc-491e-9eea-c603dc27970a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dee265b3-a8dc-491e-9eea-c603dc27970a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-dee265b3-a8dc-491e-9eea-c603dc27970a
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-681a134b-5a4b-4f16-b661-4e895eb577c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-681a134b-5a4b-4f16-b661-4e895eb577c9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-681a134b-5a4b-4f16-b661-4e895eb577c9
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-af9e7794-15cd-4a3a-9dfe-b1f0d03b58bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af9e7794-15cd-4a3a-9dfe-b1f0d03b58bf
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-af9e7794-15cd-4a3a-9dfe-b1f0d03b58bf
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-a27a38ba-d90b-4c06-986a-7e679c1b1420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a27a38ba-d90b-4c06-986a-7e679c1b1420
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a27a38ba-d90b-4c06-986a-7e679c1b1420
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-94ceaec0-24e3-4b1e-999d-1a58afd9ae10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94ceaec0-24e3-4b1e-999d-1a58afd9ae10
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-94ceaec0-24e3-4b1e-999d-1a58afd9ae10
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ce5ed77-0b09-492c-b560-5bded4f11730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ce5ed77-0b09-492c-b560-5bded4f11730
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ce5ed77-0b09-492c-b560-5bded4f11730
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-9716cf42-a919-42d7-95f9-ba5bcf463714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9716cf42-a919-42d7-95f9-ba5bcf463714
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9716cf42-a919-42d7-95f9-ba5bcf463714
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f36d762-ebc4-4f15-910b-340ece837a05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f36d762-ebc4-4f15-910b-340ece837a05
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f36d762-ebc4-4f15-910b-340ece837a05
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e6364c4-144b-4de2-8ab9-9a3780460d64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e6364c4-144b-4de2-8ab9-9a3780460d64
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e6364c4-144b-4de2-8ab9-9a3780460d64
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bf76ffb-927a-4bf0-ae63-1ef7ae64c134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf76ffb-927a-4bf0-ae63-1ef7ae64c134
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bf76ffb-927a-4bf0-ae63-1ef7ae64c134
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-148513f3-ace0-4a1d-881a-855007044afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-148513f3-ace0-4a1d-881a-855007044afc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-148513f3-ace0-4a1d-881a-855007044afc
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-607e44c5-ab69-4403-b1d2-5830ab1597e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-607e44c5-ab69-4403-b1d2-5830ab1597e7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-607e44c5-ab69-4403-b1d2-5830ab1597e7
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2c4e790-ec53-4993-bc46-7035993b626a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2c4e790-ec53-4993-bc46-7035993b626a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2c4e790-ec53-4993-bc46-7035993b626a
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-34d935cf-27e0-49b6-a488-7f28306845f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34d935cf-27e0-49b6-a488-7f28306845f5
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-34d935cf-27e0-49b6-a488-7f28306845f5
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c594cce-be9d-4f29-a760-ff33e381566f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c594cce-be9d-4f29-a760-ff33e381566f
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c594cce-be9d-4f29-a760-ff33e381566f
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac0d9a85-b33c-48f5-94c2-43864d1bf0ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac0d9a85-b33c-48f5-94c2-43864d1bf0ec
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac0d9a85-b33c-48f5-94c2-43864d1bf0ec
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-18b8171c-f4a4-45bf-a38f-826d6c5ca1db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b8171c-f4a4-45bf-a38f-826d6c5ca1db
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-18b8171c-f4a4-45bf-a38f-826d6c5ca1db
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e8adfaa-9432-4328-ba5e-fa2871671a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e8adfaa-9432-4328-ba5e-fa2871671a27
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e8adfaa-9432-4328-ba5e-fa2871671a27
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce33fea3-c237-416a-9433-6ccfb63ce8f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce33fea3-c237-416a-9433-6ccfb63ce8f9
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce33fea3-c237-416a-9433-6ccfb63ce8f9
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-997c94d0-ff56-45a2-90e9-d04d654f8a9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-997c94d0-ff56-45a2-90e9-d04d654f8a9e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-997c94d0-ff56-45a2-90e9-d04d654f8a9e
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-35a63fea-5dbb-47d7-8122-ff2ac0f2739e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a63fea-5dbb-47d7-8122-ff2ac0f2739e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-35a63fea-5dbb-47d7-8122-ff2ac0f2739e
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-d27cedc5-aa51-4fef-83a1-1c1e0def128f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d27cedc5-aa51-4fef-83a1-1c1e0def128f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d27cedc5-aa51-4fef-83a1-1c1e0def128f
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eaa3246-92ec-4622-9e7f-2734f1e8d125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eaa3246-92ec-4622-9e7f-2734f1e8d125
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eaa3246-92ec-4622-9e7f-2734f1e8d125
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d4f1926-8f58-4b31-9305-70d7cd92265b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4f1926-8f58-4b31-9305-70d7cd92265b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d4f1926-8f58-4b31-9305-70d7cd92265b
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-498e9fa3-df45-4027-ad53-2abd3983adab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-498e9fa3-df45-4027-ad53-2abd3983adab
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-498e9fa3-df45-4027-ad53-2abd3983adab
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-36d5e602-9e6e-460c-b60a-b7626b1ab76f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36d5e602-9e6e-460c-b60a-b7626b1ab76f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-36d5e602-9e6e-460c-b60a-b7626b1ab76f
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdddee62-21bf-4682-82af-ad7f4c8ba4a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdddee62-21bf-4682-82af-ad7f4c8ba4a6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdddee62-21bf-4682-82af-ad7f4c8ba4a6
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e194288-0fc2-452f-9475-5165f1d7d54f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e194288-0fc2-452f-9475-5165f1d7d54f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e194288-0fc2-452f-9475-5165f1d7d54f
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-7acdf02f-8ac7-4a82-ae88-27b2bec517b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7acdf02f-8ac7-4a82-ae88-27b2bec517b8
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7acdf02f-8ac7-4a82-ae88-27b2bec517b8
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c8465fe-c532-4491-8d2e-d6047ea8d1fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c8465fe-c532-4491-8d2e-d6047ea8d1fb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c8465fe-c532-4491-8d2e-d6047ea8d1fb
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-37ff2570-7414-42f6-af75-d3169fd840c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37ff2570-7414-42f6-af75-d3169fd840c0
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-37ff2570-7414-42f6-af75-d3169fd840c0
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d97ce41-6cf8-47ab-b8ad-c8fc7fab675c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d97ce41-6cf8-47ab-b8ad-c8fc7fab675c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d97ce41-6cf8-47ab-b8ad-c8fc7fab675c
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-1089fe54-b14b-45c3-ac99-73b8184614cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1089fe54-b14b-45c3-ac99-73b8184614cb
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1089fe54-b14b-45c3-ac99-73b8184614cb
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-41ed685d-7d9a-4e45-9541-71143cf33cdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41ed685d-7d9a-4e45-9541-71143cf33cdb
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-41ed685d-7d9a-4e45-9541-71143cf33cdb
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-e68fb7af-f7d0-4bbf-8f63-3587d57f5bd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e68fb7af-f7d0-4bbf-8f63-3587d57f5bd2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e68fb7af-f7d0-4bbf-8f63-3587d57f5bd2
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0540ead-6bdf-4f58-908f-939a301a5e13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0540ead-6bdf-4f58-908f-939a301a5e13
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0540ead-6bdf-4f58-908f-939a301a5e13
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-e84e1424-ebcd-4691-b5da-0bc52668dde1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84e1424-ebcd-4691-b5da-0bc52668dde1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84e1424-ebcd-4691-b5da-0bc52668dde1
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-edb9e884-1a4f-4f84-8021-d5ec232802ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edb9e884-1a4f-4f84-8021-d5ec232802ab
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-edb9e884-1a4f-4f84-8021-d5ec232802ab
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ed0acf5-74f6-44c4-92c8-3fc2cdda9e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ed0acf5-74f6-44c4-92c8-3fc2cdda9e0d
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ed0acf5-74f6-44c4-92c8-3fc2cdda9e0d
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-35108de4-3d7f-43e2-be51-5e1ca5e48ca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35108de4-3d7f-43e2-be51-5e1ca5e48ca1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-35108de4-3d7f-43e2-be51-5e1ca5e48ca1
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-496cc4c4-0228-486a-9978-2fd035ed335f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-496cc4c4-0228-486a-9978-2fd035ed335f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-496cc4c4-0228-486a-9978-2fd035ed335f
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-93487b2c-7fa0-4d48-85e7-d00088ee612c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93487b2c-7fa0-4d48-85e7-d00088ee612c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-93487b2c-7fa0-4d48-85e7-d00088ee612c
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-c18debbe-ba52-43f1-9d51-e87cc84cb2e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c18debbe-ba52-43f1-9d51-e87cc84cb2e9
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c18debbe-ba52-43f1-9d51-e87cc84cb2e9
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d64cbd4-38c2-48dc-8d27-61cac70ba70d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d64cbd4-38c2-48dc-8d27-61cac70ba70d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d64cbd4-38c2-48dc-8d27-61cac70ba70d
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4b0de71-177e-4492-ba24-e461ce84ab42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b0de71-177e-4492-ba24-e461ce84ab42
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4b0de71-177e-4492-ba24-e461ce84ab42
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9c042a3-ddbd-461b-a4fd-9189f99c68fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9c042a3-ddbd-461b-a4fd-9189f99c68fa
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9c042a3-ddbd-461b-a4fd-9189f99c68fa
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-56a6ecd0-b980-4538-90e1-30c893da63c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56a6ecd0-b980-4538-90e1-30c893da63c9
Content-Type: application/json

--- response: 200 in 1 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-56a6ecd0-b980-4538-90e1-30c893da63c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-10f27c46-4dfe-42d8-af76-912fa25e6791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10f27c46-4dfe-42d8-af76-912fa25e6791
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-10f27c46-4dfe-42d8-af76-912fa25e6791
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5459d01-a9de-45f5-b6ba-80fd5c88cc1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5459d01-a9de-45f5-b6ba-80fd5c88cc1a
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5459d01-a9de-45f5-b6ba-80fd5c88cc1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-8917e531-84d2-4f6a-9e4b-9b89442a53bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8917e531-84d2-4f6a-9e4b-9b89442a53bd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8917e531-84d2-4f6a-9e4b-9b89442a53bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bfd1c3c-6a0e-4b5e-b7a1-91fb2363e35e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bfd1c3c-6a0e-4b5e-b7a1-91fb2363e35e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bfd1c3c-6a0e-4b5e-b7a1-91fb2363e35e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-a066cb91-ff9a-4d52-8cb8-857c628f17cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a066cb91-ff9a-4d52-8cb8-857c628f17cb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a066cb91-ff9a-4d52-8cb8-857c628f17cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-20f8faf6-4900-41e6-acbe-f5da254c3686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20f8faf6-4900-41e6-acbe-f5da254c3686
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-20f8faf6-4900-41e6-acbe-f5da254c3686
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-31edea1e-d880-4959-8dbb-e7791fd3168c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31edea1e-d880-4959-8dbb-e7791fd3168c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31edea1e-d880-4959-8dbb-e7791fd3168c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-31edea1e-d880-4959-8dbb-e7791fd3168c"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-a6c28b1e-7e41-476f-9cdf-531daa7d9ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6c28b1e-7e41-476f-9cdf-531daa7d9ba6
Content-Type: application/json

--- request body ---
{"handle":"qa-53eae9716807","password":"****"}

--- response: 429 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6c28b1e-7e41-476f-9cdf-531daa7d9ba6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-a6c28b1e-7e41-476f-9cdf-531daa7d9ba6"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-61bd2d46-bcda-4e1a-afef-6d2c05a18e8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61bd2d46-bcda-4e1a-afef-6d2c05a18e8b
Content-Type: application/json

--- request body ---
{"handle":"qa-6a50dd4b7919","displayName":"QA 6a50dd4b7919","password":"****","region":"eu"}

--- response: 429 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61bd2d46-bcda-4e1a-afef-6d2c05a18e8b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-61bd2d46-bcda-4e1a-afef-6d2c05a18e8b"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-888ac9c3-a66f-4cc1-996f-fccc93932c1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-888ac9c3-a66f-4cc1-996f-fccc93932c1d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-888ac9c3-a66f-4cc1-996f-fccc93932c1d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-888ac9c3-a66f-4cc1-996f-fccc93932c1d"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fc26dd8f-1797-4767-a4aa-e3c45cfb1543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc26dd8f-1797-4767-a4aa-e3c45cfb1543
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc26dd8f-1797-4767-a4aa-e3c45cfb1543
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc26dd8f-1797-4767-a4aa-e3c45cfb1543"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46703b24-6df1-40e6-9907-991be2eb0286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46703b24-6df1-40e6-9907-991be2eb0286
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46703b24-6df1-40e6-9907-991be2eb0286
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-46703b24-6df1-40e6-9907-991be2eb0286"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-53eae9716807
correlation: qa-efe3fc34-3dc2-4bea-b6d3-d90ea6fa262a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efe3fc34-3dc2-4bea-b6d3-d90ea6fa262a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efe3fc34-3dc2-4bea-b6d3-d90ea6fa262a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-53eae9716807","correlationId":"qa-efe3fc34-3dc2-4bea-b6d3-d90ea6fa262a"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-3e3909fc-57df-4b6a-99df-17e52203e59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e3909fc-57df-4b6a-99df-17e52203e59c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-53eae9716807","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e3909fc-57df-4b6a-99df-17e52203e59c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-3e3909fc-57df-4b6a-99df-17e52203e59c"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-cd07dbd4-1d71-40a8-a5bf-be1c2c20d519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd07dbd4-1d71-40a8-a5bf-be1c2c20d519
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd07dbd4-1d71-40a8-a5bf-be1c2c20d519
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-cd07dbd4-1d71-40a8-a5bf-be1c2c20d519"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc
correlation: qa-119cf739-d896-4928-998d-d13c544cc193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-119cf739-d896-4928-998d-d13c544cc193
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-119cf739-d896-4928-998d-d13c544cc193
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc","correlationId":"qa-119cf739-d896-4928-998d-d13c544cc193"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/messages
correlation: qa-c4ee7aaa-4c91-42ff-ae4d-cb08b809c28b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ee7aaa-4c91-42ff-ae4d-cb08b809c28b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4ee7aaa-4c91-42ff-ae4d-cb08b809c28b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/messages","correlationId":"qa-c4ee7aaa-4c91-42ff-ae4d-cb08b809c28b"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/messages
correlation: qa-9d18f518-8201-4aaa-8333-29f622c46bcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d18f518-8201-4aaa-8333-29f622c46bcd
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d18f518-8201-4aaa-8333-29f622c46bcd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/messages","correlationId":"qa-9d18f518-8201-4aaa-8333-29f622c46bcd"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/read
correlation: qa-cc716349-4493-4767-bb6f-e8e4dde06b07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc716349-4493-4767-bb6f-e8e4dde06b07
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc716349-4493-4767-bb6f-e8e4dde06b07
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/read","correlationId":"qa-cc716349-4493-4767-bb6f-e8e4dde06b07"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/close
correlation: qa-b3c57a76-b976-45ca-8543-31525ced9115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c57a76-b976-45ca-8543-31525ced9115
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3c57a76-b976-45ca-8543-31525ced9115
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fda6e226-d95e-4326-b007-f8e34c0e77cc/close","correlationId":"qa-b3c57a76-b976-45ca-8543-31525ced9115"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-b47bc724-7c7f-4947-acdb-64ba75959b54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b47bc724-7c7f-4947-acdb-64ba75959b54
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b47bc724-7c7f-4947-acdb-64ba75959b54
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-b47bc724-7c7f-4947-acdb-64ba75959b54"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-35f93a3b-7c82-4031-b7f4-a93ec0b2ee2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f93a3b-7c82-4031-b7f4-a93ec0b2ee2d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35f93a3b-7c82-4031-b7f4-a93ec0b2ee2d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-35f93a3b-7c82-4031-b7f4-a93ec0b2ee2d"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-60e4ca37-2d0f-4c92-8c0a-01901b84f1fc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-72e7b4d974bc4d55b5c35f3d660ea7ea
X-Correlation-Id: qa-60e4ca37-2d0f-4c92-8c0a-01901b84f1fc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60e4ca37-2d0f-4c92-8c0a-01901b84f1fc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-60e4ca37-2d0f-4c92-8c0a-01901b84f1fc"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-d9329774-18f6-4dcc-8be8-def527aca1dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9329774-18f6-4dcc-8be8-def527aca1dc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9329774-18f6-4dcc-8be8-def527aca1dc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-d9329774-18f6-4dcc-8be8-def527aca1dc"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-9dcdb9bb-a287-4246-a6ba-be5c47998a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dcdb9bb-a287-4246-a6ba-be5c47998a94
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dcdb9bb-a287-4246-a6ba-be5c47998a94
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9dcdb9bb-a287-4246-a6ba-be5c47998a94"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-dace8832-a2b5-4804-a7a9-6be0056185cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dace8832-a2b5-4804-a7a9-6be0056185cd
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dace8832-a2b5-4804-a7a9-6be0056185cd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dace8832-a2b5-4804-a7a9-6be0056185cd"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff66bc4b-7768-4aca-8685-65fac6f5181a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff66bc4b-7768-4aca-8685-65fac6f5181a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff66bc4b-7768-4aca-8685-65fac6f5181a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ff66bc4b-7768-4aca-8685-65fac6f5181a"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-be1a6495-031d-43d3-a0fc-523e7a5c58dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be1a6495-031d-43d3-a0fc-523e7a5c58dd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be1a6495-031d-43d3-a0fc-523e7a5c58dd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-be1a6495-031d-43d3-a0fc-523e7a5c58dd"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-580394f0-1788-4499-afa5-7433045e193d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-580394f0-1788-4499-afa5-7433045e193d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-580394f0-1788-4499-afa5-7433045e193d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-580394f0-1788-4499-afa5-7433045e193d"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6e3510a-af65-4b6f-a798-2f4364c0de13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e3510a-af65-4b6f-a798-2f4364c0de13
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6e3510a-af65-4b6f-a798-2f4364c0de13
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b6e3510a-af65-4b6f-a798-2f4364c0de13"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ab31682-fad1-4303-89fc-898e4da46048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ab31682-fad1-4303-89fc-898e4da46048
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ab31682-fad1-4303-89fc-898e4da46048
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ab31682-fad1-4303-89fc-898e4da46048"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-487697b4-e4cd-40ac-bd5d-fa29f02d3b08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-487697b4-e4cd-40ac-bd5d-fa29f02d3b08
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-487697b4-e4cd-40ac-bd5d-fa29f02d3b08
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-487697b4-e4cd-40ac-bd5d-fa29f02d3b08"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ddfad7d-e4a1-4309-bcb1-8807bc66fc05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ddfad7d-e4a1-4309-bcb1-8807bc66fc05
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ddfad7d-e4a1-4309-bcb1-8807bc66fc05
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4ddfad7d-e4a1-4309-bcb1-8807bc66fc05"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-decfb9a5-8ef2-422e-ae98-b2994be8685c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-decfb9a5-8ef2-422e-ae98-b2994be8685c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-decfb9a5-8ef2-422e-ae98-b2994be8685c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-decfb9a5-8ef2-422e-ae98-b2994be8685c"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bf306c1-331e-430a-b475-4ae6741a9c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bf306c1-331e-430a-b475-4ae6741a9c5b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bf306c1-331e-430a-b475-4ae6741a9c5b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1bf306c1-331e-430a-b475-4ae6741a9c5b"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-7530509f-0113-4c17-8b68-8f63ea1700a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7530509f-0113-4c17-8b68-8f63ea1700a1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7530509f-0113-4c17-8b68-8f63ea1700a1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7530509f-0113-4c17-8b68-8f63ea1700a1"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-71641346-e181-4dec-94ca-2621112aca00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71641346-e181-4dec-94ca-2621112aca00
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71641346-e181-4dec-94ca-2621112aca00
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-71641346-e181-4dec-94ca-2621112aca00"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-6bb37b3f-9abd-4a9a-9a11-735c231f7bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb37b3f-9abd-4a9a-9a11-735c231f7bec
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bb37b3f-9abd-4a9a-9a11-735c231f7bec
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6bb37b3f-9abd-4a9a-9a11-735c231f7bec"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-39e69596-c253-4396-9a80-89e42d3ff88e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39e69596-c253-4396-9a80-89e42d3ff88e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39e69596-c253-4396-9a80-89e42d3ff88e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39e69596-c253-4396-9a80-89e42d3ff88e"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-2beccbdb-becd-401d-b847-baed05667f2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2beccbdb-becd-401d-b847-baed05667f2a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2beccbdb-becd-401d-b847-baed05667f2a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2beccbdb-becd-401d-b847-baed05667f2a"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-c20a31b3-ed1d-4c83-99a8-1342a070870d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c20a31b3-ed1d-4c83-99a8-1342a070870d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c20a31b3-ed1d-4c83-99a8-1342a070870d
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

{"id":"acc_b17497c7-68ac-4a96-8c7c-79d381737693","handle":"qa-53eae9716807","displayName":"QA 53eae9716807","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.093807902Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-ba2caa9d-023f-479b-8677-354112b8f24c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba2caa9d-023f-479b-8677-354112b8f24c
Content-Type: application/json

--- request body ---
{"handle":"qa-8f4840e3b3a5","password":"****"}

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba2caa9d-023f-479b-8677-354112b8f24c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3f62cdf-a981-4208-80b6-5813741a0a0e"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d5693a8-e647-4a34-9c27-8394f493956d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d5693a8-e647-4a34-9c27-8394f493956d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d5693a8-e647-4a34-9c27-8394f493956d
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
correlation: qa-40d702bf-7da0-4983-9da7-ce535da5682e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40d702bf-7da0-4983-9da7-ce535da5682e
Content-Type: application/json

--- request body ---
{"handle":"qa-8f4840e3b3a5","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40d702bf-7da0-4983-9da7-ce535da5682e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-40d702bf-7da0-4983-9da7-ce535da5682e"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-442c7a21-1ebc-4a3a-888e-c54b433b2c84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-442c7a21-1ebc-4a3a-888e-c54b433b2c84
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-442c7a21-1ebc-4a3a-888e-c54b433b2c84
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
correlation: qa-bf239ca1-6d74-488b-8dcb-56eb1a01730d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf239ca1-6d74-488b-8dcb-56eb1a01730d
Content-Type: application/json

--- request body ---
{"handle":"qa-53eae9716807","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf239ca1-6d74-488b-8dcb-56eb1a01730d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf239ca1-6d74-488b-8dcb-56eb1a01730d"}
```
