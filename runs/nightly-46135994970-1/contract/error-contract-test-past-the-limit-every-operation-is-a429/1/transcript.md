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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-18f2a36b-a6db-44e1-a204-d981bc109455` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-c7cbaa00-52f2-4e10-ae0c-ac8e6fbd71a1` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-beb73b16-a27e-4fad-a18a-f3bd7ff7ed6e` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-e3c503e9-ba74-4172-a9a1-f0cfa1716933` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-b68df687-e63d-46af-9a4f-fc50c9f94095` |
| 6 | `GET /v1/accounts/me` | 200 | 12 | `qa-d2d965c1-896c-4fce-a319-86ab7ce71a4e` |
| 7 | `GET /v1/accounts/me` | 200 | 20 | `qa-6b6eb2fc-3c35-431a-b1b9-7d371a9c5ce4` |
| 8 | `GET /v1/accounts/me` | 200 | 19 | `qa-89e442a5-6d31-4607-b7a5-da1dbfcc04cb` |
| 9 | `GET /v1/accounts/me` | 200 | 16 | `qa-05bea1dd-d0b0-4c73-bf3e-b5658de8fa65` |
| 10 | `GET /v1/accounts/me` | 200 | 17 | `qa-82e636c6-b35d-4573-929f-be638e926193` |
| 11 | `GET /v1/accounts/me` | 200 | 32 | `qa-760b7494-6574-4579-8b96-64e6c403b41a` |
| 12 | `GET /v1/accounts/me` | 200 | 22 | `qa-c28761af-8741-4d95-98b9-6d271f2f33c4` |
| 13 | `GET /v1/accounts/me` | 200 | 16 | `qa-cbe4a378-2efc-4c88-8dfe-259e12d3fb38` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-cc2535a2-da69-434b-80a6-c97850ce9ec4` |
| 15 | `GET /v1/accounts/me` | 200 | 6 | `qa-a2aa0f60-9dc3-48b1-bb00-ddd008e3af6b` |
| 16 | `GET /v1/accounts/me` | 200 | 19 | `qa-f8cae5a4-1203-4ab8-bc0e-ac7a66b82d45` |
| 17 | `GET /v1/accounts/me` | 200 | 26 | `qa-33e5e8bd-06ef-45fc-a8d1-470f09826fcf` |
| 18 | `GET /v1/accounts/me` | 200 | 7 | `qa-137c945e-5242-4fd8-8a93-cd788c8b4547` |
| 19 | `GET /v1/accounts/me` | 200 | 18 | `qa-636ea8b5-d8bc-489a-8538-689ea7ec31e0` |
| 20 | `GET /v1/accounts/me` | 200 | 27 | `qa-e2ddda65-f9e2-499f-a718-40f4e0cd3d76` |
| 21 | `GET /v1/accounts/me` | 200 | 30 | `qa-dfadee62-1679-4232-8c0f-cb8f95d7da5e` |
| 22 | `GET /v1/accounts/me` | 200 | 25 | `qa-743d4da5-1077-4653-9b59-6be0d25400d0` |
| 23 | `GET /v1/accounts/me` | 200 | 12 | `qa-93a7a22f-1bbd-4aba-9e4a-0f86c49376d6` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-72f4c364-91af-4c60-a509-15c6218cee92` |
| 25 | `GET /v1/accounts/me` | 200 | 33 | `qa-566fb396-c15e-4ce9-b5d0-efcbe6e0e718` |
| 26 | `GET /v1/accounts/me` | 200 | 22 | `qa-f7455c17-be9d-4734-a197-ff5db4c7aadd` |
| 27 | `GET /v1/accounts/me` | 200 | 19 | `qa-bde3a3f8-9140-4dce-a1e9-5f29a0195eaa` |
| 28 | `GET /v1/accounts/me` | 200 | 25 | `qa-6047fab7-76a5-40ea-981e-03f3e49f57f3` |
| 29 | `GET /v1/accounts/me` | 200 | 16 | `qa-06104852-7c61-4984-bac0-a2e6db75c6cd` |
| 30 | `GET /v1/accounts/me` | 200 | 19 | `qa-2497bc8d-3006-49dc-8977-e715cd870221` |
| 31 | `GET /v1/accounts/me` | 200 | 42 | `qa-705b5f3f-7616-470a-ad2a-db460d981fc8` |
| 32 | `GET /v1/accounts/me` | 200 | 16 | `qa-9c391c72-36a2-4bc3-91d6-b8d37964962c` |
| 33 | `GET /v1/accounts/me` | 200 | 16 | `qa-0e11b974-60c8-4baa-b71a-db9ff1b8adcf` |
| 34 | `GET /v1/accounts/me` | 200 | 16 | `qa-98b7d03c-65a7-4548-a778-a7b76b92f3f5` |
| 35 | `GET /v1/accounts/me` | 200 | 17 | `qa-9827bb78-dac6-4961-845a-4ebc4b7e72d2` |
| 36 | `GET /v1/accounts/me` | 200 | 22 | `qa-53fc934c-2e76-4944-a9f2-8c6d541a99d9` |
| 37 | `GET /v1/accounts/me` | 200 | 17 | `qa-bd26eb73-27aa-4ea0-87d4-812a2237f945` |
| 38 | `GET /v1/accounts/me` | 200 | 12 | `qa-d5a32e8f-162a-4757-819f-80db8e6bb20f` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-5687e3d3-159c-4507-824f-e5ad3e53582c` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-ae0dd31d-41ee-41dc-927a-b5f0d99235cf` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-a3faa5e8-365c-482a-80b2-7734c2a7778d` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-d96d0b40-9573-4565-815d-17be029b33b1` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-70d3f0af-d3b7-439e-b86c-12f332e09b68` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-e0b66957-a613-418a-8ec3-d42b5fc6c491` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-1a4b77b4-9f92-49b0-b295-d87c8d2e2886` |
| 46 | `GET /v1/accounts/me` | 200 | 16 | `qa-224027a2-1f84-4cab-a45a-ad4d526f693c` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-4d31e492-c0dc-4eb1-afa1-6616532c1ed7` |
| 48 | `GET /v1/accounts/me` | 200 | 10 | `qa-e5f0b74b-878c-4d64-aba2-a453173561af` |
| 49 | `GET /v1/accounts/me` | 200 | 10 | `qa-342061a3-a1f3-47cd-9081-a843f6867ca7` |
| 50 | `GET /v1/accounts/me` | 200 | 11 | `qa-3c053673-d096-4f9d-9c45-b5e5cd93d30f` |
| 51 | `GET /v1/accounts/me` | 200 | 12 | `qa-99b38837-52df-4be7-acb6-ab43312226de` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-68996b4a-5056-42bb-9c0b-88f0102fe936` |
| 53 | `GET /v1/accounts/me` | 200 | 7 | `qa-1a37497f-4bae-4e16-a7d9-7adbd209748b` |
| 54 | `GET /v1/accounts/me` | 200 | 3 | `qa-8fe138bc-c556-493f-8cd3-eb536fae2c93` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-b215a856-c9f2-4613-a25d-6958b933a653` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-8cafcd9b-2013-444c-b6be-011a6cc0452d` |
| 57 | `GET /v1/accounts/me` | 200 | 12 | `qa-262ec585-3198-4939-ae8e-dc38a5954709` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-54c13b26-2405-4d4f-86ab-7c9e61cd8235` |
| 59 | `GET /v1/accounts/me` | 200 | 15 | `qa-fae5f084-7230-4949-9bb2-2802473533b2` |
| 60 | `GET /v1/accounts/me` | 200 | 15 | `qa-8cfa8ab0-cbea-4562-8893-98e95ea04730` |
| 61 | `GET /v1/accounts/me` | 200 | 6 | `qa-c680a902-6ea6-4c18-a4ba-a57cce37ab07` |
| 62 | `GET /v1/accounts/me` | 200 | 13 | `qa-49c40f07-35cd-4a27-b931-ae3e7c7f06c1` |
| 63 | `GET /v1/accounts/me` | 200 | 11 | `qa-ec130ddc-2006-4ced-b661-76e3fbec86a6` |
| 64 | `GET /v1/accounts/me` | 429 | 9 | `qa-a42682aa-647a-4a83-a6e2-4965fb5242c1` |
| 65 | `POST /v1/auth/token` | 429 | 8 | `qa-1277b9d2-7d0a-4e54-bff3-53b31bea518e` |
| 66 | `POST /v1/accounts` | 429 | 21 | `qa-9008b68c-b50a-4080-8513-0a3b7b13ec1c` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-e0f7efe2-2fd2-4dd2-8f4b-97438181d18f` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-2bdb13e4-5d5b-4a64-a040-54eb2b4e846c` |
| 69 | `DELETE /v1/accounts/me` | 429 | 10 | `qa-246e2540-d9bf-4138-9a27-14a4cdf4defb` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 11 | `qa-52e7d39b-8dfc-4bc9-a8b2-4f5e1ba0b4bd` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-dbb94545-c1c3-490d-928f-3e31d1e61115` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-96edf8b6-862c-44cc-8375-9398cdb57c20` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-6befd854-6499-4a87-b684-c85322443227` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-3a287a10-057c-4112-bc24-57446d579d96` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-17a380dd-7fff-471f-8bdc-50a0af4e1aed` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-b1e1ea9b-c88f-41fc-9df3-4530b7c45abd` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 7 | `qa-57510dfe-9f4e-46a8-adcf-4ffb398e204b` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-e3b3a7b4-07c6-40c6-971e-7e39abcd0266` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-eb455e8d-685b-4a44-add5-59bf411f27aa` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-d0c314dd-ba6f-47a1-9180-ca797b30d7df` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-61f059d6-cf39-42df-93dd-57c843f8aa6e` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-0dc3029e-f8c5-40ae-b96a-569035c11ab8` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-20ca5d82-0a82-4b8c-8eb1-b26220d10827` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-22f0b871-352f-4066-ab1c-b018eca81142` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-cf552b43-106b-4429-824c-9def9a9a0f7e` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-9b8a88c4-61de-4acb-87d7-33a6242ddfab` |
| 87 | `GET /v1/accounts/me` | 429 | 5 | `qa-2acaa732-b24f-4312-b3ec-9c5aeaa100c3` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-3a5bb612-9763-4c6b-bd9e-a59a31423a3c` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-f4695b81-3587-4796-8603-82322416c1f9` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-ee7ebe5b-d9a0-48ec-bbf0-9aed9596b75a` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-8925a1cf-a1a4-41b9-be03-be42bb7fd4e2` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-6d094390-9256-4451-9d3d-27dd494b8480` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-9dbf6d2f-85d1-4efa-ad3f-6ebabad04136` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-3c798145-c065-4c3e-8404-9ff636573029` |
| 95 | `GET /v1/accounts/me` | 429 | 5 | `qa-fd43f5c6-e22d-4cd8-9cad-726f38c1c59b` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-400f4cd4-2693-4acf-bbaa-70c45911f153` |
| 97 | `GET /v1/accounts/me` | 200 | 6 | `qa-a85e8f1c-cab7-4b84-ac94-d46a3b4047dd` |
| 98 | `POST /v1/auth/token` | 200 | 16 | `qa-12770548-8ae1-4abb-b844-cf7a3623f576` |
| 99 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e4811f5f-3bc6-4566-beb0-d2262fbb8ed0` |
| 100 | `POST /v1/auth/token` | 401 | 9 | `qa-aa0960e6-b2e6-4ff4-a9c7-a6f620efdba6` |
| 101 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b569d0c0-913f-4e04-8d83-a9d4a2b1ecbc` |
| 102 | `POST /v1/auth/token` | 401 | 5 | `qa-cc7a46d7-574e-40d5-90d7-a68029b56ec3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18f2a36b-a6db-44e1-a204-d981bc109455

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18f2a36b-a6db-44e1-a204-d981bc109455
Content-Type: application/json

--- request body ---
{"handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-18f2a36b-a6db-44e1-a204-d981bc109455
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
Location: /v1/accounts/qa-53eb6cb27a80
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c7cbaa00-52f2-4e10-ae0c-ac8e6fbd71a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7cbaa00-52f2-4e10-ae0c-ac8e6fbd71a1
Content-Type: application/json

--- request body ---
{"handle":"qa-5729ece47984","displayName":"QA 5729ece47984","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7cbaa00-52f2-4e10-ae0c-ac8e6fbd71a1
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
Location: /v1/accounts/qa-5729ece47984
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14064d1f-7d39-460e-91ef-e2ffb6b9bc11","handle":"qa-5729ece47984","displayName":"QA 5729ece47984","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.566808622Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-beb73b16-a27e-4fad-a18a-f3bd7ff7ed6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beb73b16-a27e-4fad-a18a-f3bd7ff7ed6e
Content-Type: application/json

--- request body ---
{"handle":"qa-53eb6cb27a80","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-beb73b16-a27e-4fad-a18a-f3bd7ff7ed6e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e3c503e9-ba74-4172-a9a1-f0cfa1716933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3c503e9-ba74-4172-a9a1-f0cfa1716933
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5729ece47984","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3c503e9-ba74-4172-a9a1-f0cfa1716933
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
Location: /v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee","subject":"Error contract","status":"open","region":"eu","participants":["qa-53eb6cb27a80","qa-5729ece47984"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.657790190Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b68df687-e63d-46af-9a4f-fc50c9f94095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b68df687-e63d-46af-9a4f-fc50c9f94095
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b68df687-e63d-46af-9a4f-fc50c9f94095
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2d965c1-896c-4fce-a319-86ab7ce71a4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d965c1-896c-4fce-a319-86ab7ce71a4e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2d965c1-896c-4fce-a319-86ab7ce71a4e
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b6eb2fc-3c35-431a-b1b9-7d371a9c5ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6eb2fc-3c35-431a-b1b9-7d371a9c5ce4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b6eb2fc-3c35-431a-b1b9-7d371a9c5ce4
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-89e442a5-6d31-4607-b7a5-da1dbfcc04cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89e442a5-6d31-4607-b7a5-da1dbfcc04cb
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-89e442a5-6d31-4607-b7a5-da1dbfcc04cb
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-05bea1dd-d0b0-4c73-bf3e-b5658de8fa65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05bea1dd-d0b0-4c73-bf3e-b5658de8fa65
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-05bea1dd-d0b0-4c73-bf3e-b5658de8fa65
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-82e636c6-b35d-4573-929f-be638e926193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e636c6-b35d-4573-929f-be638e926193
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-82e636c6-b35d-4573-929f-be638e926193
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-760b7494-6574-4579-8b96-64e6c403b41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-760b7494-6574-4579-8b96-64e6c403b41a
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-760b7494-6574-4579-8b96-64e6c403b41a
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-c28761af-8741-4d95-98b9-6d271f2f33c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c28761af-8741-4d95-98b9-6d271f2f33c4
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c28761af-8741-4d95-98b9-6d271f2f33c4
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbe4a378-2efc-4c88-8dfe-259e12d3fb38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe4a378-2efc-4c88-8dfe-259e12d3fb38
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbe4a378-2efc-4c88-8dfe-259e12d3fb38
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc2535a2-da69-434b-80a6-c97850ce9ec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc2535a2-da69-434b-80a6-c97850ce9ec4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc2535a2-da69-434b-80a6-c97850ce9ec4
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2aa0f60-9dc3-48b1-bb00-ddd008e3af6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2aa0f60-9dc3-48b1-bb00-ddd008e3af6b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2aa0f60-9dc3-48b1-bb00-ddd008e3af6b
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-f8cae5a4-1203-4ab8-bc0e-ac7a66b82d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8cae5a4-1203-4ab8-bc0e-ac7a66b82d45
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8cae5a4-1203-4ab8-bc0e-ac7a66b82d45
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-33e5e8bd-06ef-45fc-a8d1-470f09826fcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33e5e8bd-06ef-45fc-a8d1-470f09826fcf
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-33e5e8bd-06ef-45fc-a8d1-470f09826fcf
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-137c945e-5242-4fd8-8a93-cd788c8b4547

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-137c945e-5242-4fd8-8a93-cd788c8b4547
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-137c945e-5242-4fd8-8a93-cd788c8b4547
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-636ea8b5-d8bc-489a-8538-689ea7ec31e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-636ea8b5-d8bc-489a-8538-689ea7ec31e0
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-636ea8b5-d8bc-489a-8538-689ea7ec31e0
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2ddda65-f9e2-499f-a718-40f4e0cd3d76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ddda65-f9e2-499f-a718-40f4e0cd3d76
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2ddda65-f9e2-499f-a718-40f4e0cd3d76
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfadee62-1679-4232-8c0f-cb8f95d7da5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfadee62-1679-4232-8c0f-cb8f95d7da5e
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfadee62-1679-4232-8c0f-cb8f95d7da5e
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-743d4da5-1077-4653-9b59-6be0d25400d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-743d4da5-1077-4653-9b59-6be0d25400d0
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-743d4da5-1077-4653-9b59-6be0d25400d0
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-93a7a22f-1bbd-4aba-9e4a-0f86c49376d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93a7a22f-1bbd-4aba-9e4a-0f86c49376d6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-93a7a22f-1bbd-4aba-9e4a-0f86c49376d6
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-72f4c364-91af-4c60-a509-15c6218cee92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72f4c364-91af-4c60-a509-15c6218cee92
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-72f4c364-91af-4c60-a509-15c6218cee92
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-566fb396-c15e-4ce9-b5d0-efcbe6e0e718

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-566fb396-c15e-4ce9-b5d0-efcbe6e0e718
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-566fb396-c15e-4ce9-b5d0-efcbe6e0e718
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7455c17-be9d-4734-a197-ff5db4c7aadd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7455c17-be9d-4734-a197-ff5db4c7aadd
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7455c17-be9d-4734-a197-ff5db4c7aadd
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-bde3a3f8-9140-4dce-a1e9-5f29a0195eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bde3a3f8-9140-4dce-a1e9-5f29a0195eaa
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bde3a3f8-9140-4dce-a1e9-5f29a0195eaa
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-6047fab7-76a5-40ea-981e-03f3e49f57f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6047fab7-76a5-40ea-981e-03f3e49f57f3
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-6047fab7-76a5-40ea-981e-03f3e49f57f3
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-06104852-7c61-4984-bac0-a2e6db75c6cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06104852-7c61-4984-bac0-a2e6db75c6cd
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-06104852-7c61-4984-bac0-a2e6db75c6cd
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-2497bc8d-3006-49dc-8977-e715cd870221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2497bc8d-3006-49dc-8977-e715cd870221
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2497bc8d-3006-49dc-8977-e715cd870221
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-705b5f3f-7616-470a-ad2a-db460d981fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-705b5f3f-7616-470a-ad2a-db460d981fc8
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-705b5f3f-7616-470a-ad2a-db460d981fc8
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c391c72-36a2-4bc3-91d6-b8d37964962c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c391c72-36a2-4bc3-91d6-b8d37964962c
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c391c72-36a2-4bc3-91d6-b8d37964962c
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e11b974-60c8-4baa-b71a-db9ff1b8adcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e11b974-60c8-4baa-b71a-db9ff1b8adcf
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e11b974-60c8-4baa-b71a-db9ff1b8adcf
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-98b7d03c-65a7-4548-a778-a7b76b92f3f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98b7d03c-65a7-4548-a778-a7b76b92f3f5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-98b7d03c-65a7-4548-a778-a7b76b92f3f5
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-9827bb78-dac6-4961-845a-4ebc4b7e72d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9827bb78-dac6-4961-845a-4ebc4b7e72d2
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-9827bb78-dac6-4961-845a-4ebc4b7e72d2
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-53fc934c-2e76-4944-a9f2-8c6d541a99d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53fc934c-2e76-4944-a9f2-8c6d541a99d9
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-53fc934c-2e76-4944-a9f2-8c6d541a99d9
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd26eb73-27aa-4ea0-87d4-812a2237f945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd26eb73-27aa-4ea0-87d4-812a2237f945
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd26eb73-27aa-4ea0-87d4-812a2237f945
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5a32e8f-162a-4757-819f-80db8e6bb20f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a32e8f-162a-4757-819f-80db8e6bb20f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5a32e8f-162a-4757-819f-80db8e6bb20f
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5687e3d3-159c-4507-824f-e5ad3e53582c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5687e3d3-159c-4507-824f-e5ad3e53582c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5687e3d3-159c-4507-824f-e5ad3e53582c
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae0dd31d-41ee-41dc-927a-b5f0d99235cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae0dd31d-41ee-41dc-927a-b5f0d99235cf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae0dd31d-41ee-41dc-927a-b5f0d99235cf
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3faa5e8-365c-482a-80b2-7734c2a7778d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3faa5e8-365c-482a-80b2-7734c2a7778d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3faa5e8-365c-482a-80b2-7734c2a7778d
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-d96d0b40-9573-4565-815d-17be029b33b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96d0b40-9573-4565-815d-17be029b33b1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-d96d0b40-9573-4565-815d-17be029b33b1
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-70d3f0af-d3b7-439e-b86c-12f332e09b68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d3f0af-d3b7-439e-b86c-12f332e09b68
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d3f0af-d3b7-439e-b86c-12f332e09b68
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0b66957-a613-418a-8ec3-d42b5fc6c491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0b66957-a613-418a-8ec3-d42b5fc6c491
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0b66957-a613-418a-8ec3-d42b5fc6c491
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a4b77b4-9f92-49b0-b295-d87c8d2e2886

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a4b77b4-9f92-49b0-b295-d87c8d2e2886
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a4b77b4-9f92-49b0-b295-d87c8d2e2886
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-224027a2-1f84-4cab-a45a-ad4d526f693c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224027a2-1f84-4cab-a45a-ad4d526f693c
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-224027a2-1f84-4cab-a45a-ad4d526f693c
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d31e492-c0dc-4eb1-afa1-6616532c1ed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d31e492-c0dc-4eb1-afa1-6616532c1ed7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d31e492-c0dc-4eb1-afa1-6616532c1ed7
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5f0b74b-878c-4d64-aba2-a453173561af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5f0b74b-878c-4d64-aba2-a453173561af
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5f0b74b-878c-4d64-aba2-a453173561af
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-342061a3-a1f3-47cd-9081-a843f6867ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-342061a3-a1f3-47cd-9081-a843f6867ca7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-342061a3-a1f3-47cd-9081-a843f6867ca7
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c053673-d096-4f9d-9c45-b5e5cd93d30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c053673-d096-4f9d-9c45-b5e5cd93d30f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c053673-d096-4f9d-9c45-b5e5cd93d30f
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-99b38837-52df-4be7-acb6-ab43312226de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b38837-52df-4be7-acb6-ab43312226de
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-99b38837-52df-4be7-acb6-ab43312226de
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-68996b4a-5056-42bb-9c0b-88f0102fe936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68996b4a-5056-42bb-9c0b-88f0102fe936
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-68996b4a-5056-42bb-9c0b-88f0102fe936
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a37497f-4bae-4e16-a7d9-7adbd209748b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a37497f-4bae-4e16-a7d9-7adbd209748b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a37497f-4bae-4e16-a7d9-7adbd209748b
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-8fe138bc-c556-493f-8cd3-eb536fae2c93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fe138bc-c556-493f-8cd3-eb536fae2c93
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fe138bc-c556-493f-8cd3-eb536fae2c93
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-b215a856-c9f2-4613-a25d-6958b933a653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b215a856-c9f2-4613-a25d-6958b933a653
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-b215a856-c9f2-4613-a25d-6958b933a653
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cafcd9b-2013-444c-b6be-011a6cc0452d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cafcd9b-2013-444c-b6be-011a6cc0452d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cafcd9b-2013-444c-b6be-011a6cc0452d
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-262ec585-3198-4939-ae8e-dc38a5954709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262ec585-3198-4939-ae8e-dc38a5954709
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-262ec585-3198-4939-ae8e-dc38a5954709
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-54c13b26-2405-4d4f-86ab-7c9e61cd8235

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c13b26-2405-4d4f-86ab-7c9e61cd8235
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-54c13b26-2405-4d4f-86ab-7c9e61cd8235
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-fae5f084-7230-4949-9bb2-2802473533b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fae5f084-7230-4949-9bb2-2802473533b2
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-fae5f084-7230-4949-9bb2-2802473533b2
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cfa8ab0-cbea-4562-8893-98e95ea04730

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cfa8ab0-cbea-4562-8893-98e95ea04730
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cfa8ab0-cbea-4562-8893-98e95ea04730
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-c680a902-6ea6-4c18-a4ba-a57cce37ab07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c680a902-6ea6-4c18-a4ba-a57cce37ab07
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c680a902-6ea6-4c18-a4ba-a57cce37ab07
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-49c40f07-35cd-4a27-b931-ae3e7c7f06c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49c40f07-35cd-4a27-b931-ae3e7c7f06c1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-49c40f07-35cd-4a27-b931-ae3e7c7f06c1
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec130ddc-2006-4ced-b661-76e3fbec86a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec130ddc-2006-4ced-b661-76e3fbec86a6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec130ddc-2006-4ced-b661-76e3fbec86a6
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-a42682aa-647a-4a83-a6e2-4965fb5242c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a42682aa-647a-4a83-a6e2-4965fb5242c1
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a42682aa-647a-4a83-a6e2-4965fb5242c1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a42682aa-647a-4a83-a6e2-4965fb5242c1"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-1277b9d2-7d0a-4e54-bff3-53b31bea518e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1277b9d2-7d0a-4e54-bff3-53b31bea518e
Content-Type: application/json

--- request body ---
{"handle":"qa-53eb6cb27a80","password":"****"}

--- response: 429 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1277b9d2-7d0a-4e54-bff3-53b31bea518e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-1277b9d2-7d0a-4e54-bff3-53b31bea518e"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-9008b68c-b50a-4080-8513-0a3b7b13ec1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9008b68c-b50a-4080-8513-0a3b7b13ec1c
Content-Type: application/json

--- request body ---
{"handle":"qa-4d65a32aa1ab","displayName":"QA 4d65a32aa1ab","password":"****","region":"eu"}

--- response: 429 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9008b68c-b50a-4080-8513-0a3b7b13ec1c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-9008b68c-b50a-4080-8513-0a3b7b13ec1c"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0f7efe2-2fd2-4dd2-8f4b-97438181d18f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0f7efe2-2fd2-4dd2-8f4b-97438181d18f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0f7efe2-2fd2-4dd2-8f4b-97438181d18f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e0f7efe2-2fd2-4dd2-8f4b-97438181d18f"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-2bdb13e4-5d5b-4a64-a040-54eb2b4e846c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bdb13e4-5d5b-4a64-a040-54eb2b4e846c
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bdb13e4-5d5b-4a64-a040-54eb2b4e846c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2bdb13e4-5d5b-4a64-a040-54eb2b4e846c"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-246e2540-d9bf-4138-9a27-14a4cdf4defb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-246e2540-d9bf-4138-9a27-14a4cdf4defb
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-246e2540-d9bf-4138-9a27-14a4cdf4defb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-246e2540-d9bf-4138-9a27-14a4cdf4defb"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-53eb6cb27a80
correlation: qa-52e7d39b-8dfc-4bc9-a8b2-4f5e1ba0b4bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52e7d39b-8dfc-4bc9-a8b2-4f5e1ba0b4bd
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52e7d39b-8dfc-4bc9-a8b2-4f5e1ba0b4bd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-53eb6cb27a80","correlationId":"qa-52e7d39b-8dfc-4bc9-a8b2-4f5e1ba0b4bd"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-dbb94545-c1c3-490d-928f-3e31d1e61115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbb94545-c1c3-490d-928f-3e31d1e61115
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-53eb6cb27a80","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbb94545-c1c3-490d-928f-3e31d1e61115
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-dbb94545-c1c3-490d-928f-3e31d1e61115"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-96edf8b6-862c-44cc-8375-9398cdb57c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96edf8b6-862c-44cc-8375-9398cdb57c20
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96edf8b6-862c-44cc-8375-9398cdb57c20
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-96edf8b6-862c-44cc-8375-9398cdb57c20"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee
correlation: qa-6befd854-6499-4a87-b684-c85322443227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6befd854-6499-4a87-b684-c85322443227
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6befd854-6499-4a87-b684-c85322443227
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee","correlationId":"qa-6befd854-6499-4a87-b684-c85322443227"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/messages
correlation: qa-3a287a10-057c-4112-bc24-57446d579d96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a287a10-057c-4112-bc24-57446d579d96
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a287a10-057c-4112-bc24-57446d579d96
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/messages","correlationId":"qa-3a287a10-057c-4112-bc24-57446d579d96"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/messages
correlation: qa-17a380dd-7fff-471f-8bdc-50a0af4e1aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17a380dd-7fff-471f-8bdc-50a0af4e1aed
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17a380dd-7fff-471f-8bdc-50a0af4e1aed
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/messages","correlationId":"qa-17a380dd-7fff-471f-8bdc-50a0af4e1aed"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/read
correlation: qa-b1e1ea9b-c88f-41fc-9df3-4530b7c45abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1e1ea9b-c88f-41fc-9df3-4530b7c45abd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1e1ea9b-c88f-41fc-9df3-4530b7c45abd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/read","correlationId":"qa-b1e1ea9b-c88f-41fc-9df3-4530b7c45abd"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/close
correlation: qa-57510dfe-9f4e-46a8-adcf-4ffb398e204b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57510dfe-9f4e-46a8-adcf-4ffb398e204b
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57510dfe-9f4e-46a8-adcf-4ffb398e204b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_37457bca-8ff5-43e1-abf7-f7edd46213ee/close","correlationId":"qa-57510dfe-9f4e-46a8-adcf-4ffb398e204b"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-e3b3a7b4-07c6-40c6-971e-7e39abcd0266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b3a7b4-07c6-40c6-971e-7e39abcd0266
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3b3a7b4-07c6-40c6-971e-7e39abcd0266
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-e3b3a7b4-07c6-40c6-971e-7e39abcd0266"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-eb455e8d-685b-4a44-add5-59bf411f27aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb455e8d-685b-4a44-add5-59bf411f27aa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb455e8d-685b-4a44-add5-59bf411f27aa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-eb455e8d-685b-4a44-add5-59bf411f27aa"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d0c314dd-ba6f-47a1-9180-ca797b30d7df

--- request headers ---
Accept: application/json
Idempotency-Key: qa-039cf42980884bfd8f7bc12f76a4c16f
X-Correlation-Id: qa-d0c314dd-ba6f-47a1-9180-ca797b30d7df
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0c314dd-ba6f-47a1-9180-ca797b30d7df
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-d0c314dd-ba6f-47a1-9180-ca797b30d7df"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-61f059d6-cf39-42df-93dd-57c843f8aa6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f059d6-cf39-42df-93dd-57c843f8aa6e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61f059d6-cf39-42df-93dd-57c843f8aa6e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-61f059d6-cf39-42df-93dd-57c843f8aa6e"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-0dc3029e-f8c5-40ae-b96a-569035c11ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc3029e-f8c5-40ae-b96a-569035c11ab8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dc3029e-f8c5-40ae-b96a-569035c11ab8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0dc3029e-f8c5-40ae-b96a-569035c11ab8"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-20ca5d82-0a82-4b8c-8eb1-b26220d10827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ca5d82-0a82-4b8c-8eb1-b26220d10827
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20ca5d82-0a82-4b8c-8eb1-b26220d10827
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-20ca5d82-0a82-4b8c-8eb1-b26220d10827"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-22f0b871-352f-4066-ab1c-b018eca81142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22f0b871-352f-4066-ab1c-b018eca81142
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22f0b871-352f-4066-ab1c-b018eca81142
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-22f0b871-352f-4066-ab1c-b018eca81142"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf552b43-106b-4429-824c-9def9a9a0f7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf552b43-106b-4429-824c-9def9a9a0f7e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf552b43-106b-4429-824c-9def9a9a0f7e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf552b43-106b-4429-824c-9def9a9a0f7e"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b8a88c4-61de-4acb-87d7-33a6242ddfab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8a88c4-61de-4acb-87d7-33a6242ddfab
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b8a88c4-61de-4acb-87d7-33a6242ddfab
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9b8a88c4-61de-4acb-87d7-33a6242ddfab"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-2acaa732-b24f-4312-b3ec-9c5aeaa100c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2acaa732-b24f-4312-b3ec-9c5aeaa100c3
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2acaa732-b24f-4312-b3ec-9c5aeaa100c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2acaa732-b24f-4312-b3ec-9c5aeaa100c3"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a5bb612-9763-4c6b-bd9e-a59a31423a3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a5bb612-9763-4c6b-bd9e-a59a31423a3c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a5bb612-9763-4c6b-bd9e-a59a31423a3c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3a5bb612-9763-4c6b-bd9e-a59a31423a3c"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4695b81-3587-4796-8603-82322416c1f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4695b81-3587-4796-8603-82322416c1f9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4695b81-3587-4796-8603-82322416c1f9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f4695b81-3587-4796-8603-82322416c1f9"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee7ebe5b-d9a0-48ec-bbf0-9aed9596b75a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee7ebe5b-d9a0-48ec-bbf0-9aed9596b75a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee7ebe5b-d9a0-48ec-bbf0-9aed9596b75a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee7ebe5b-d9a0-48ec-bbf0-9aed9596b75a"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-8925a1cf-a1a4-41b9-be03-be42bb7fd4e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8925a1cf-a1a4-41b9-be03-be42bb7fd4e2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8925a1cf-a1a4-41b9-be03-be42bb7fd4e2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8925a1cf-a1a4-41b9-be03-be42bb7fd4e2"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d094390-9256-4451-9d3d-27dd494b8480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d094390-9256-4451-9d3d-27dd494b8480
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d094390-9256-4451-9d3d-27dd494b8480
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6d094390-9256-4451-9d3d-27dd494b8480"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-9dbf6d2f-85d1-4efa-ad3f-6ebabad04136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dbf6d2f-85d1-4efa-ad3f-6ebabad04136
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dbf6d2f-85d1-4efa-ad3f-6ebabad04136
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9dbf6d2f-85d1-4efa-ad3f-6ebabad04136"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c798145-c065-4c3e-8404-9ff636573029

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c798145-c065-4c3e-8404-9ff636573029
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c798145-c065-4c3e-8404-9ff636573029
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3c798145-c065-4c3e-8404-9ff636573029"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd43f5c6-e22d-4cd8-9cad-726f38c1c59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd43f5c6-e22d-4cd8-9cad-726f38c1c59b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd43f5c6-e22d-4cd8-9cad-726f38c1c59b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fd43f5c6-e22d-4cd8-9cad-726f38c1c59b"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-400f4cd4-2693-4acf-bbaa-70c45911f153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-400f4cd4-2693-4acf-bbaa-70c45911f153
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-400f4cd4-2693-4acf-bbaa-70c45911f153
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-400f4cd4-2693-4acf-bbaa-70c45911f153"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-a85e8f1c-cab7-4b84-ac94-d46a3b4047dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a85e8f1c-cab7-4b84-ac94-d46a3b4047dd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a85e8f1c-cab7-4b84-ac94-d46a3b4047dd
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

{"id":"acc_a9cdb409-be20-47f3-aed2-7642a41489ed","handle":"qa-53eb6cb27a80","displayName":"QA 53eb6cb27a80","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.499578057Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-12770548-8ae1-4abb-b844-cf7a3623f576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12770548-8ae1-4abb-b844-cf7a3623f576
Content-Type: application/json

--- request body ---
{"handle":"qa-5729ece47984","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-12770548-8ae1-4abb-b844-cf7a3623f576
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14064d1f-7d39-460e-91ef-e2ffb6b9bc11"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e4811f5f-3bc6-4566-beb0-d2262fbb8ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4811f5f-3bc6-4566-beb0-d2262fbb8ed0
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e4811f5f-3bc6-4566-beb0-d2262fbb8ed0
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
correlation: qa-aa0960e6-b2e6-4ff4-a9c7-a6f620efdba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa0960e6-b2e6-4ff4-a9c7-a6f620efdba6
Content-Type: application/json

--- request body ---
{"handle":"qa-5729ece47984","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa0960e6-b2e6-4ff4-a9c7-a6f620efdba6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa0960e6-b2e6-4ff4-a9c7-a6f620efdba6"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b569d0c0-913f-4e04-8d83-a9d4a2b1ecbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b569d0c0-913f-4e04-8d83-a9d4a2b1ecbc
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b569d0c0-913f-4e04-8d83-a9d4a2b1ecbc
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
correlation: qa-cc7a46d7-574e-40d5-90d7-a68029b56ec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc7a46d7-574e-40d5-90d7-a68029b56ec3
Content-Type: application/json

--- request body ---
{"handle":"qa-53eb6cb27a80","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc7a46d7-574e-40d5-90d7-a68029b56ec3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc7a46d7-574e-40d5-90d7-a68029b56ec3"}
```
