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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-384e90f5-7046-4730-a056-64d0201d1f28` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-fe2c63e1-d369-470d-bf9e-d250458f1adf` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-1e697969-8cfe-4915-8a04-4f071dabb925` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-4c64076c-074b-4f28-b1d2-039bda0ee6b7` |
| 5 | `GET /v1/accounts/me` | 200 | 26 | `qa-dfe3c951-9f26-4a76-9d1b-e2549d77fa2e` |
| 6 | `GET /v1/accounts/me` | 200 | 19 | `qa-4a33a421-bbc2-427c-9549-1534dd5515b5` |
| 7 | `GET /v1/accounts/me` | 200 | 13 | `qa-710ef7f0-0ca0-45d2-881c-fb43a9a0d293` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-a6582bcc-93a9-42af-a26e-048037f66412` |
| 9 | `GET /v1/accounts/me` | 200 | 15 | `qa-7c5b5b97-b2ca-40b1-a13d-59499a27f9a9` |
| 10 | `GET /v1/accounts/me` | 200 | 10 | `qa-c590864c-42fd-4afc-8b55-e0f396101561` |
| 11 | `GET /v1/accounts/me` | 200 | 13 | `qa-a6977d3e-40ba-4ee7-aa74-1c9ad29218cb` |
| 12 | `GET /v1/accounts/me` | 200 | 14 | `qa-cc0fcf9e-4755-4b83-8798-3b7def335ba3` |
| 13 | `GET /v1/accounts/me` | 200 | 9 | `qa-aa260bce-bc89-4f55-a505-13cdacd49459` |
| 14 | `GET /v1/accounts/me` | 200 | 15 | `qa-a21e748b-144f-4b21-bc8d-6a43382afe3c` |
| 15 | `GET /v1/accounts/me` | 200 | 22 | `qa-e18bacab-94c8-4284-a47f-246551e9b154` |
| 16 | `GET /v1/accounts/me` | 200 | 14 | `qa-80abbd2b-7821-4fc0-acc5-1f9ec8d652dc` |
| 17 | `GET /v1/accounts/me` | 200 | 16 | `qa-8e1ee209-8227-4e85-8f87-fa93a1fc14ab` |
| 18 | `GET /v1/accounts/me` | 200 | 18 | `qa-ea6f0485-9458-438e-875a-0fee60a5dc31` |
| 19 | `GET /v1/accounts/me` | 200 | 16 | `qa-7514d971-9c04-4c8d-bd90-6f88f3daa748` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-db3efd15-6f73-458a-b579-a7de759b8521` |
| 21 | `GET /v1/accounts/me` | 200 | 33 | `qa-bd15883a-0b95-49fd-ab60-2845f72e93f9` |
| 22 | `GET /v1/accounts/me` | 200 | 18 | `qa-f9fa8360-9e2b-4e84-9d21-c6eda74d9a56` |
| 23 | `GET /v1/accounts/me` | 200 | 14 | `qa-e2ecd1f9-e1cd-4a49-a661-beca18cf628a` |
| 24 | `GET /v1/accounts/me` | 200 | 21 | `qa-1114ded2-9034-4826-9b97-af464f340aa1` |
| 25 | `GET /v1/accounts/me` | 200 | 14 | `qa-df937774-8f52-4afe-b28d-ded4f030d57c` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-d984218a-4ac0-4771-a182-06e651ff010f` |
| 27 | `GET /v1/accounts/me` | 200 | 3 | `qa-e64c967e-d602-499b-8313-a9ef6bf90861` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-8730eda4-2663-47dd-bba4-4a4dd95c0b2e` |
| 29 | `GET /v1/accounts/me` | 200 | 25 | `qa-2c4932c2-5cac-49dc-8cde-d783c1fe7ed4` |
| 30 | `GET /v1/accounts/me` | 200 | 4 | `qa-d38619a9-e53a-4b04-b570-61a06224ed0c` |
| 31 | `GET /v1/accounts/me` | 200 | 16 | `qa-670232fd-2113-44e2-aca5-734ee8370726` |
| 32 | `GET /v1/accounts/me` | 200 | 17 | `qa-8b69e7e0-ac8c-43f5-8339-60855871c747` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-f16f8da0-11c8-4a0b-8414-1fdb2440f1d2` |
| 34 | `GET /v1/accounts/me` | 200 | 14 | `qa-06b41c99-709f-45d2-a6f9-6bbcc9ad0488` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-8d74dec9-0e7a-43c6-85cd-c2b8ad8a50f7` |
| 36 | `GET /v1/accounts/me` | 200 | 14 | `qa-522ee27f-3b66-48e6-8d8c-66490b3bd722` |
| 37 | `GET /v1/accounts/me` | 200 | 11 | `qa-de2b25dd-8a55-42e9-8717-896a5c8c3f12` |
| 38 | `GET /v1/accounts/me` | 200 | 16 | `qa-a1b065da-ecb7-4430-be5a-32e06297ab4f` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-dd515dc5-0dc5-40a8-a288-1bd461c54e3b` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-73ceafd4-eaee-47c3-8a10-844e6c7e1a8d` |
| 41 | `GET /v1/accounts/me` | 200 | 12 | `qa-834ee866-0b39-4d4a-8aa9-17a283cee9a0` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-cf71af17-1df2-485f-8e4e-26a744cfcd71` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-7a7bd8f4-83df-4d27-b7b2-7faf6447e45f` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-794dc5c0-4972-4c87-82fd-ba100e45a85d` |
| 45 | `GET /v1/accounts/me` | 200 | 16 | `qa-15a05c87-d8c5-4819-945d-0b1981d0cf71` |
| 46 | `GET /v1/accounts/me` | 200 | 8 | `qa-49d18a26-2501-4d6d-bf43-d460c05a056c` |
| 47 | `GET /v1/accounts/me` | 200 | 1 | `qa-de3a5a7b-6c99-4627-8813-f192413377d0` |
| 48 | `GET /v1/accounts/me` | 200 | 4 | `qa-f46cf847-0094-40fe-a9b9-38c175f34f56` |
| 49 | `GET /v1/accounts/me` | 200 | 2 | `qa-f4e5b77e-15d3-4bb8-a5a8-e81420366d15` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-d5324a9e-2c7a-4ce4-97fc-caad27f6beb2` |
| 51 | `GET /v1/accounts/me` | 200 | 2 | `qa-115d0ec4-dae3-4eac-9fd2-26c523f1e2f7` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-77bd8370-48dc-4f93-91fd-75a6d1606ed5` |
| 53 | `GET /v1/accounts/me` | 200 | 7 | `qa-0b72e579-aabe-4e56-85db-9bc1388c4542` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-692638e7-c01d-44c0-aa63-08c313bda222` |
| 55 | `GET /v1/accounts/me` | 200 | 10 | `qa-f5a859ce-ee98-4c3e-915d-e36d464629aa` |
| 56 | `GET /v1/accounts/me` | 200 | 18 | `qa-c9b3fc6b-607f-426b-bdea-05ecb823da48` |
| 57 | `GET /v1/accounts/me` | 200 | 23 | `qa-0f8df723-ce9c-41e9-9f53-4cef9797deaf` |
| 58 | `GET /v1/accounts/me` | 200 | 15 | `qa-bbda77bf-aae5-4e85-a6f0-34b0ec841c42` |
| 59 | `GET /v1/accounts/me` | 200 | 9 | `qa-c4ad8adc-d623-4c29-b738-f5e8cb9897e6` |
| 60 | `GET /v1/accounts/me` | 200 | 11 | `qa-e76b522c-bfd5-4e87-b11e-675e3a7d9999` |
| 61 | `GET /v1/accounts/me` | 200 | 15 | `qa-c86443bf-6d97-47b9-8656-51fddbe03e9b` |
| 62 | `GET /v1/accounts/me` | 200 | 3 | `qa-534290b8-29c6-4662-8349-50918545f18f` |
| 63 | `GET /v1/accounts/me` | 200 | 3 | `qa-8cde9e2e-10db-4c32-8dfc-49fc42645933` |
| 64 | `GET /v1/accounts/me` | 429 | 2 | `qa-072f41cd-c10c-4146-b36c-f0803afdeed0` |
| 65 | `POST /v1/auth/token` | 429 | 3 | `qa-aee5c864-fe95-40de-bbb6-df4cdef09d7a` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-e86b3fd9-818e-4cda-b886-a11901491153` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-9354f23f-5f99-44fb-8f86-be3c8180a268` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-9509c72a-2062-4f9d-a418-b09ddd1667b5` |
| 69 | `DELETE /v1/accounts/me` | 429 | 9 | `qa-884a9c76-b753-41a9-90ef-32eecfe37203` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-1465c20e-c97f-4962-a045-7b113071421c` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-14c19819-3d87-4213-b174-b03bc54f8b09` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-25ff5f12-ed05-4734-bcc8-cbe8b48a824d` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-51edbc50-b28f-4fb6-b829-d1f619a105b1` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-2ed308ab-78e8-463f-ba6b-d330e7052e52` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-abae18ee-64ae-4571-8ab4-e475512924a5` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-fc829d15-55d3-491c-a156-96539d1220a1` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-00f1d775-c27d-4fa9-9f3f-203c6c58ad7b` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-2f74c50d-a829-46fe-ac06-a022cf671a7f` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-a096e1d2-14bc-4658-bb13-477732909614` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-3b230024-5778-4505-8f39-9a6083901148` |
| 81 | `GET /v1/admin/stats` | 429 | 2 | `qa-76cc307d-82b1-47a5-b9f7-659aae04ec43` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-cccb8e65-7732-4106-8fe8-1e8def4bb1c9` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-bcf49ce7-07d1-4434-a9a0-8bd0b1466b9c` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-3a7197ec-37a5-4f55-8546-aa530c242a67` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-7d2cb9e8-b4d4-455a-8ed8-86bdd5e7c390` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-3a6e1f59-c38c-473b-aab5-0a0a7fbd9b70` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-0fa7a42c-a6e7-480d-9df7-8ffe4070cb86` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-90b505b4-043c-4c09-9e45-697591c64919` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-dfcd1fc9-343e-499d-b860-3b540c29bc11` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-13b59942-3681-4c3b-bd20-56e6cca06a93` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-0f28afae-8ef1-4bdc-93d7-d5f1e4cb5062` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-21c1ef10-c914-4923-acec-e06c32f2e773` |
| 93 | `GET /v1/accounts/me` | 429 | 5 | `qa-0fa571e4-0b23-4981-b1b9-07ccfee5e02b` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-29462dfd-d821-4fef-90d0-60057a49d926` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-03287b71-52b3-45f5-8e0f-360d93902484` |
| 96 | `GET /v1/accounts/me` | 429 | 6 | `qa-3797e197-9764-4107-bd53-65147aa31d09` |
| 97 | `GET /v1/accounts/me` | 429 | 4 | `qa-2fa15689-a963-4522-a624-f3e3ac554614` |
| 98 | `GET /v1/accounts/me` | 200 | 5 | `qa-dd035a2e-6663-4535-bc51-12feb8322257` |
| 99 | `POST /v1/auth/token` | 200 | 7 | `qa-c2093630-5187-4ca8-8f53-1339f3aa5595` |
| 100 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b4bbf91d-8d23-4897-8901-8aeffecb6e8e` |
| 101 | `POST /v1/auth/token` | 401 | 3 | `qa-704017d7-c7a5-4726-8dd1-6601ce44115c` |
| 102 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e9d96ec4-031d-456c-8c75-f38460d852d6` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-778710c3-acfb-4153-b616-d72b046af098` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-384e90f5-7046-4730-a056-64d0201d1f28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-384e90f5-7046-4730-a056-64d0201d1f28
Content-Type: application/json

--- request body ---
{"handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-384e90f5-7046-4730-a056-64d0201d1f28
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
Location: /v1/accounts/qa-593b77a2608e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fe2c63e1-d369-470d-bf9e-d250458f1adf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe2c63e1-d369-470d-bf9e-d250458f1adf
Content-Type: application/json

--- request body ---
{"handle":"qa-9d26c83c906e","displayName":"QA 9d26c83c906e","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe2c63e1-d369-470d-bf9e-d250458f1adf
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
Location: /v1/accounts/qa-9d26c83c906e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_698db303-f619-46ec-8674-57f37bd6e417","handle":"qa-9d26c83c906e","displayName":"QA 9d26c83c906e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.619998781Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1e697969-8cfe-4915-8a04-4f071dabb925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e697969-8cfe-4915-8a04-4f071dabb925
Content-Type: application/json

--- request body ---
{"handle":"qa-593b77a2608e","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e697969-8cfe-4915-8a04-4f071dabb925
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4c64076c-074b-4f28-b1d2-039bda0ee6b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c64076c-074b-4f28-b1d2-039bda0ee6b7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9d26c83c906e","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c64076c-074b-4f28-b1d2-039bda0ee6b7
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
Location: /v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6569c152-b333-4649-8c71-209d05989a29","subject":"Error contract","status":"open","region":"eu","participants":["qa-593b77a2608e","qa-9d26c83c906e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.672065291Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfe3c951-9f26-4a76-9d1b-e2549d77fa2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfe3c951-9f26-4a76-9d1b-e2549d77fa2e
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfe3c951-9f26-4a76-9d1b-e2549d77fa2e
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a33a421-bbc2-427c-9549-1534dd5515b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a33a421-bbc2-427c-9549-1534dd5515b5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a33a421-bbc2-427c-9549-1534dd5515b5
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-710ef7f0-0ca0-45d2-881c-fb43a9a0d293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-710ef7f0-0ca0-45d2-881c-fb43a9a0d293
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-710ef7f0-0ca0-45d2-881c-fb43a9a0d293
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6582bcc-93a9-42af-a26e-048037f66412

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6582bcc-93a9-42af-a26e-048037f66412
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6582bcc-93a9-42af-a26e-048037f66412
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c5b5b97-b2ca-40b1-a13d-59499a27f9a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5b5b97-b2ca-40b1-a13d-59499a27f9a9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5b5b97-b2ca-40b1-a13d-59499a27f9a9
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-c590864c-42fd-4afc-8b55-e0f396101561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c590864c-42fd-4afc-8b55-e0f396101561
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-c590864c-42fd-4afc-8b55-e0f396101561
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6977d3e-40ba-4ee7-aa74-1c9ad29218cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6977d3e-40ba-4ee7-aa74-1c9ad29218cb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6977d3e-40ba-4ee7-aa74-1c9ad29218cb
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc0fcf9e-4755-4b83-8798-3b7def335ba3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc0fcf9e-4755-4b83-8798-3b7def335ba3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc0fcf9e-4755-4b83-8798-3b7def335ba3
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa260bce-bc89-4f55-a505-13cdacd49459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa260bce-bc89-4f55-a505-13cdacd49459
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa260bce-bc89-4f55-a505-13cdacd49459
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-a21e748b-144f-4b21-bc8d-6a43382afe3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a21e748b-144f-4b21-bc8d-6a43382afe3c
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-a21e748b-144f-4b21-bc8d-6a43382afe3c
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-e18bacab-94c8-4284-a47f-246551e9b154

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e18bacab-94c8-4284-a47f-246551e9b154
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e18bacab-94c8-4284-a47f-246551e9b154
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-80abbd2b-7821-4fc0-acc5-1f9ec8d652dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80abbd2b-7821-4fc0-acc5-1f9ec8d652dc
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-80abbd2b-7821-4fc0-acc5-1f9ec8d652dc
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e1ee209-8227-4e85-8f87-fa93a1fc14ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e1ee209-8227-4e85-8f87-fa93a1fc14ab
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e1ee209-8227-4e85-8f87-fa93a1fc14ab
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea6f0485-9458-438e-875a-0fee60a5dc31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea6f0485-9458-438e-875a-0fee60a5dc31
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea6f0485-9458-438e-875a-0fee60a5dc31
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-7514d971-9c04-4c8d-bd90-6f88f3daa748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7514d971-9c04-4c8d-bd90-6f88f3daa748
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7514d971-9c04-4c8d-bd90-6f88f3daa748
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-db3efd15-6f73-458a-b579-a7de759b8521

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db3efd15-6f73-458a-b579-a7de759b8521
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-db3efd15-6f73-458a-b579-a7de759b8521
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd15883a-0b95-49fd-ab60-2845f72e93f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd15883a-0b95-49fd-ab60-2845f72e93f9
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd15883a-0b95-49fd-ab60-2845f72e93f9
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9fa8360-9e2b-4e84-9d21-c6eda74d9a56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9fa8360-9e2b-4e84-9d21-c6eda74d9a56
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9fa8360-9e2b-4e84-9d21-c6eda74d9a56
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2ecd1f9-e1cd-4a49-a661-beca18cf628a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2ecd1f9-e1cd-4a49-a661-beca18cf628a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2ecd1f9-e1cd-4a49-a661-beca18cf628a
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-1114ded2-9034-4826-9b97-af464f340aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1114ded2-9034-4826-9b97-af464f340aa1
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-1114ded2-9034-4826-9b97-af464f340aa1
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-df937774-8f52-4afe-b28d-ded4f030d57c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df937774-8f52-4afe-b28d-ded4f030d57c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-df937774-8f52-4afe-b28d-ded4f030d57c
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-d984218a-4ac0-4771-a182-06e651ff010f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d984218a-4ac0-4771-a182-06e651ff010f
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d984218a-4ac0-4771-a182-06e651ff010f
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-e64c967e-d602-499b-8313-a9ef6bf90861

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e64c967e-d602-499b-8313-a9ef6bf90861
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e64c967e-d602-499b-8313-a9ef6bf90861
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-8730eda4-2663-47dd-bba4-4a4dd95c0b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8730eda4-2663-47dd-bba4-4a4dd95c0b2e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8730eda4-2663-47dd-bba4-4a4dd95c0b2e
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c4932c2-5cac-49dc-8cde-d783c1fe7ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c4932c2-5cac-49dc-8cde-d783c1fe7ed4
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c4932c2-5cac-49dc-8cde-d783c1fe7ed4
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-d38619a9-e53a-4b04-b570-61a06224ed0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d38619a9-e53a-4b04-b570-61a06224ed0c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d38619a9-e53a-4b04-b570-61a06224ed0c
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-670232fd-2113-44e2-aca5-734ee8370726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-670232fd-2113-44e2-aca5-734ee8370726
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-670232fd-2113-44e2-aca5-734ee8370726
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b69e7e0-ac8c-43f5-8339-60855871c747

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b69e7e0-ac8c-43f5-8339-60855871c747
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b69e7e0-ac8c-43f5-8339-60855871c747
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-f16f8da0-11c8-4a0b-8414-1fdb2440f1d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f16f8da0-11c8-4a0b-8414-1fdb2440f1d2
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f16f8da0-11c8-4a0b-8414-1fdb2440f1d2
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-06b41c99-709f-45d2-a6f9-6bbcc9ad0488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b41c99-709f-45d2-a6f9-6bbcc9ad0488
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-06b41c99-709f-45d2-a6f9-6bbcc9ad0488
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d74dec9-0e7a-43c6-85cd-c2b8ad8a50f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d74dec9-0e7a-43c6-85cd-c2b8ad8a50f7
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d74dec9-0e7a-43c6-85cd-c2b8ad8a50f7
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-522ee27f-3b66-48e6-8d8c-66490b3bd722

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-522ee27f-3b66-48e6-8d8c-66490b3bd722
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-522ee27f-3b66-48e6-8d8c-66490b3bd722
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-de2b25dd-8a55-42e9-8717-896a5c8c3f12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de2b25dd-8a55-42e9-8717-896a5c8c3f12
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-de2b25dd-8a55-42e9-8717-896a5c8c3f12
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1b065da-ecb7-4430-be5a-32e06297ab4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1b065da-ecb7-4430-be5a-32e06297ab4f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1b065da-ecb7-4430-be5a-32e06297ab4f
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd515dc5-0dc5-40a8-a288-1bd461c54e3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd515dc5-0dc5-40a8-a288-1bd461c54e3b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd515dc5-0dc5-40a8-a288-1bd461c54e3b
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-73ceafd4-eaee-47c3-8a10-844e6c7e1a8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ceafd4-eaee-47c3-8a10-844e6c7e1a8d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-73ceafd4-eaee-47c3-8a10-844e6c7e1a8d
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-834ee866-0b39-4d4a-8aa9-17a283cee9a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-834ee866-0b39-4d4a-8aa9-17a283cee9a0
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-834ee866-0b39-4d4a-8aa9-17a283cee9a0
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf71af17-1df2-485f-8e4e-26a744cfcd71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf71af17-1df2-485f-8e4e-26a744cfcd71
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf71af17-1df2-485f-8e4e-26a744cfcd71
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a7bd8f4-83df-4d27-b7b2-7faf6447e45f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a7bd8f4-83df-4d27-b7b2-7faf6447e45f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a7bd8f4-83df-4d27-b7b2-7faf6447e45f
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-794dc5c0-4972-4c87-82fd-ba100e45a85d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-794dc5c0-4972-4c87-82fd-ba100e45a85d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-794dc5c0-4972-4c87-82fd-ba100e45a85d
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-15a05c87-d8c5-4819-945d-0b1981d0cf71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a05c87-d8c5-4819-945d-0b1981d0cf71
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-15a05c87-d8c5-4819-945d-0b1981d0cf71
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-49d18a26-2501-4d6d-bf43-d460c05a056c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49d18a26-2501-4d6d-bf43-d460c05a056c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-49d18a26-2501-4d6d-bf43-d460c05a056c
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-de3a5a7b-6c99-4627-8813-f192413377d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de3a5a7b-6c99-4627-8813-f192413377d0
Content-Type: application/json

--- response: 200 in 1 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-de3a5a7b-6c99-4627-8813-f192413377d0
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f46cf847-0094-40fe-a9b9-38c175f34f56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46cf847-0094-40fe-a9b9-38c175f34f56
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46cf847-0094-40fe-a9b9-38c175f34f56
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4e5b77e-15d3-4bb8-a5a8-e81420366d15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4e5b77e-15d3-4bb8-a5a8-e81420366d15
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4e5b77e-15d3-4bb8-a5a8-e81420366d15
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5324a9e-2c7a-4ce4-97fc-caad27f6beb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5324a9e-2c7a-4ce4-97fc-caad27f6beb2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5324a9e-2c7a-4ce4-97fc-caad27f6beb2
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-115d0ec4-dae3-4eac-9fd2-26c523f1e2f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-115d0ec4-dae3-4eac-9fd2-26c523f1e2f7
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-115d0ec4-dae3-4eac-9fd2-26c523f1e2f7
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-77bd8370-48dc-4f93-91fd-75a6d1606ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77bd8370-48dc-4f93-91fd-75a6d1606ed5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-77bd8370-48dc-4f93-91fd-75a6d1606ed5
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b72e579-aabe-4e56-85db-9bc1388c4542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b72e579-aabe-4e56-85db-9bc1388c4542
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b72e579-aabe-4e56-85db-9bc1388c4542
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-692638e7-c01d-44c0-aa63-08c313bda222

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-692638e7-c01d-44c0-aa63-08c313bda222
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-692638e7-c01d-44c0-aa63-08c313bda222
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5a859ce-ee98-4c3e-915d-e36d464629aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5a859ce-ee98-4c3e-915d-e36d464629aa
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5a859ce-ee98-4c3e-915d-e36d464629aa
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9b3fc6b-607f-426b-bdea-05ecb823da48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9b3fc6b-607f-426b-bdea-05ecb823da48
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9b3fc6b-607f-426b-bdea-05ecb823da48
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f8df723-ce9c-41e9-9f53-4cef9797deaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f8df723-ce9c-41e9-9f53-4cef9797deaf
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f8df723-ce9c-41e9-9f53-4cef9797deaf
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbda77bf-aae5-4e85-a6f0-34b0ec841c42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbda77bf-aae5-4e85-a6f0-34b0ec841c42
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbda77bf-aae5-4e85-a6f0-34b0ec841c42
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4ad8adc-d623-4c29-b738-f5e8cb9897e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ad8adc-d623-4c29-b738-f5e8cb9897e6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4ad8adc-d623-4c29-b738-f5e8cb9897e6
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-e76b522c-bfd5-4e87-b11e-675e3a7d9999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e76b522c-bfd5-4e87-b11e-675e3a7d9999
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-e76b522c-bfd5-4e87-b11e-675e3a7d9999
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-c86443bf-6d97-47b9-8656-51fddbe03e9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86443bf-6d97-47b9-8656-51fddbe03e9b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c86443bf-6d97-47b9-8656-51fddbe03e9b
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-534290b8-29c6-4662-8349-50918545f18f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-534290b8-29c6-4662-8349-50918545f18f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-534290b8-29c6-4662-8349-50918545f18f
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cde9e2e-10db-4c32-8dfc-49fc42645933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cde9e2e-10db-4c32-8dfc-49fc42645933
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cde9e2e-10db-4c32-8dfc-49fc42645933
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-072f41cd-c10c-4146-b36c-f0803afdeed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072f41cd-c10c-4146-b36c-f0803afdeed0
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-072f41cd-c10c-4146-b36c-f0803afdeed0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-072f41cd-c10c-4146-b36c-f0803afdeed0"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-aee5c864-fe95-40de-bbb6-df4cdef09d7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aee5c864-fe95-40de-bbb6-df4cdef09d7a
Content-Type: application/json

--- request body ---
{"handle":"qa-593b77a2608e","password":"****"}

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aee5c864-fe95-40de-bbb6-df4cdef09d7a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-aee5c864-fe95-40de-bbb6-df4cdef09d7a"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-e86b3fd9-818e-4cda-b886-a11901491153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e86b3fd9-818e-4cda-b886-a11901491153
Content-Type: application/json

--- request body ---
{"handle":"qa-afd739180d7a","displayName":"QA afd739180d7a","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e86b3fd9-818e-4cda-b886-a11901491153
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-e86b3fd9-818e-4cda-b886-a11901491153"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-9354f23f-5f99-44fb-8f86-be3c8180a268

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9354f23f-5f99-44fb-8f86-be3c8180a268
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9354f23f-5f99-44fb-8f86-be3c8180a268
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9354f23f-5f99-44fb-8f86-be3c8180a268"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-9509c72a-2062-4f9d-a418-b09ddd1667b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9509c72a-2062-4f9d-a418-b09ddd1667b5
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9509c72a-2062-4f9d-a418-b09ddd1667b5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9509c72a-2062-4f9d-a418-b09ddd1667b5"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-884a9c76-b753-41a9-90ef-32eecfe37203

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-884a9c76-b753-41a9-90ef-32eecfe37203
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-884a9c76-b753-41a9-90ef-32eecfe37203
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-884a9c76-b753-41a9-90ef-32eecfe37203"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-593b77a2608e
correlation: qa-1465c20e-c97f-4962-a045-7b113071421c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1465c20e-c97f-4962-a045-7b113071421c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1465c20e-c97f-4962-a045-7b113071421c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-593b77a2608e","correlationId":"qa-1465c20e-c97f-4962-a045-7b113071421c"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-14c19819-3d87-4213-b174-b03bc54f8b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14c19819-3d87-4213-b174-b03bc54f8b09
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-593b77a2608e","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14c19819-3d87-4213-b174-b03bc54f8b09
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-14c19819-3d87-4213-b174-b03bc54f8b09"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-25ff5f12-ed05-4734-bcc8-cbe8b48a824d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ff5f12-ed05-4734-bcc8-cbe8b48a824d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-25ff5f12-ed05-4734-bcc8-cbe8b48a824d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-25ff5f12-ed05-4734-bcc8-cbe8b48a824d"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29
correlation: qa-51edbc50-b28f-4fb6-b829-d1f619a105b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51edbc50-b28f-4fb6-b829-d1f619a105b1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51edbc50-b28f-4fb6-b829-d1f619a105b1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29","correlationId":"qa-51edbc50-b28f-4fb6-b829-d1f619a105b1"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/messages
correlation: qa-2ed308ab-78e8-463f-ba6b-d330e7052e52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ed308ab-78e8-463f-ba6b-d330e7052e52
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ed308ab-78e8-463f-ba6b-d330e7052e52
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/messages","correlationId":"qa-2ed308ab-78e8-463f-ba6b-d330e7052e52"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/messages
correlation: qa-abae18ee-64ae-4571-8ab4-e475512924a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abae18ee-64ae-4571-8ab4-e475512924a5
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abae18ee-64ae-4571-8ab4-e475512924a5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/messages","correlationId":"qa-abae18ee-64ae-4571-8ab4-e475512924a5"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/read
correlation: qa-fc829d15-55d3-491c-a156-96539d1220a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc829d15-55d3-491c-a156-96539d1220a1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc829d15-55d3-491c-a156-96539d1220a1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/read","correlationId":"qa-fc829d15-55d3-491c-a156-96539d1220a1"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/close
correlation: qa-00f1d775-c27d-4fa9-9f3f-203c6c58ad7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00f1d775-c27d-4fa9-9f3f-203c6c58ad7b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00f1d775-c27d-4fa9-9f3f-203c6c58ad7b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_6569c152-b333-4649-8c71-209d05989a29/close","correlationId":"qa-00f1d775-c27d-4fa9-9f3f-203c6c58ad7b"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-2f74c50d-a829-46fe-ac06-a022cf671a7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f74c50d-a829-46fe-ac06-a022cf671a7f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f74c50d-a829-46fe-ac06-a022cf671a7f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-2f74c50d-a829-46fe-ac06-a022cf671a7f"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a096e1d2-14bc-4658-bb13-477732909614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a096e1d2-14bc-4658-bb13-477732909614
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a096e1d2-14bc-4658-bb13-477732909614
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-a096e1d2-14bc-4658-bb13-477732909614"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3b230024-5778-4505-8f39-9a6083901148

--- request headers ---
Accept: application/json
Idempotency-Key: qa-b0b0f105a93343cfa3912d5fba09dff5
X-Correlation-Id: qa-3b230024-5778-4505-8f39-9a6083901148
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b230024-5778-4505-8f39-9a6083901148
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-3b230024-5778-4505-8f39-9a6083901148"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-76cc307d-82b1-47a5-b9f7-659aae04ec43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76cc307d-82b1-47a5-b9f7-659aae04ec43
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Sun, 22 Nov 2026 09:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76cc307d-82b1-47a5-b9f7-659aae04ec43
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-76cc307d-82b1-47a5-b9f7-659aae04ec43"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-cccb8e65-7732-4106-8fe8-1e8def4bb1c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cccb8e65-7732-4106-8fe8-1e8def4bb1c9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cccb8e65-7732-4106-8fe8-1e8def4bb1c9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cccb8e65-7732-4106-8fe8-1e8def4bb1c9"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcf49ce7-07d1-4434-a9a0-8bd0b1466b9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf49ce7-07d1-4434-a9a0-8bd0b1466b9c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcf49ce7-07d1-4434-a9a0-8bd0b1466b9c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bcf49ce7-07d1-4434-a9a0-8bd0b1466b9c"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a7197ec-37a5-4f55-8546-aa530c242a67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a7197ec-37a5-4f55-8546-aa530c242a67
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a7197ec-37a5-4f55-8546-aa530c242a67
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3a7197ec-37a5-4f55-8546-aa530c242a67"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d2cb9e8-b4d4-455a-8ed8-86bdd5e7c390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d2cb9e8-b4d4-455a-8ed8-86bdd5e7c390
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d2cb9e8-b4d4-455a-8ed8-86bdd5e7c390
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7d2cb9e8-b4d4-455a-8ed8-86bdd5e7c390"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a6e1f59-c38c-473b-aab5-0a0a7fbd9b70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a6e1f59-c38c-473b-aab5-0a0a7fbd9b70
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a6e1f59-c38c-473b-aab5-0a0a7fbd9b70
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3a6e1f59-c38c-473b-aab5-0a0a7fbd9b70"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fa7a42c-a6e7-480d-9df7-8ffe4070cb86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fa7a42c-a6e7-480d-9df7-8ffe4070cb86
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fa7a42c-a6e7-480d-9df7-8ffe4070cb86
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0fa7a42c-a6e7-480d-9df7-8ffe4070cb86"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-90b505b4-043c-4c09-9e45-697591c64919

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90b505b4-043c-4c09-9e45-697591c64919
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90b505b4-043c-4c09-9e45-697591c64919
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-90b505b4-043c-4c09-9e45-697591c64919"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfcd1fc9-343e-499d-b860-3b540c29bc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfcd1fc9-343e-499d-b860-3b540c29bc11
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfcd1fc9-343e-499d-b860-3b540c29bc11
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dfcd1fc9-343e-499d-b860-3b540c29bc11"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-13b59942-3681-4c3b-bd20-56e6cca06a93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b59942-3681-4c3b-bd20-56e6cca06a93
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13b59942-3681-4c3b-bd20-56e6cca06a93
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-13b59942-3681-4c3b-bd20-56e6cca06a93"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f28afae-8ef1-4bdc-93d7-d5f1e4cb5062

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f28afae-8ef1-4bdc-93d7-d5f1e4cb5062
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f28afae-8ef1-4bdc-93d7-d5f1e4cb5062
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0f28afae-8ef1-4bdc-93d7-d5f1e4cb5062"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-21c1ef10-c914-4923-acec-e06c32f2e773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c1ef10-c914-4923-acec-e06c32f2e773
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21c1ef10-c914-4923-acec-e06c32f2e773
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-21c1ef10-c914-4923-acec-e06c32f2e773"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-0fa571e4-0b23-4981-b1b9-07ccfee5e02b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fa571e4-0b23-4981-b1b9-07ccfee5e02b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0fa571e4-0b23-4981-b1b9-07ccfee5e02b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0fa571e4-0b23-4981-b1b9-07ccfee5e02b"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-29462dfd-d821-4fef-90d0-60057a49d926

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29462dfd-d821-4fef-90d0-60057a49d926
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29462dfd-d821-4fef-90d0-60057a49d926
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-29462dfd-d821-4fef-90d0-60057a49d926"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-03287b71-52b3-45f5-8e0f-360d93902484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03287b71-52b3-45f5-8e0f-360d93902484
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03287b71-52b3-45f5-8e0f-360d93902484
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-03287b71-52b3-45f5-8e0f-360d93902484"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-3797e197-9764-4107-bd53-65147aa31d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3797e197-9764-4107-bd53-65147aa31d09
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3797e197-9764-4107-bd53-65147aa31d09
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3797e197-9764-4107-bd53-65147aa31d09"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fa15689-a963-4522-a624-f3e3ac554614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa15689-a963-4522-a624-f3e3ac554614
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fa15689-a963-4522-a624-f3e3ac554614
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2fa15689-a963-4522-a624-f3e3ac554614"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd035a2e-6663-4535-bc51-12feb8322257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd035a2e-6663-4535-bc51-12feb8322257
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd035a2e-6663-4535-bc51-12feb8322257
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

{"id":"acc_0b030a52-7bdf-4be1-a63b-4f64406f657a","handle":"qa-593b77a2608e","displayName":"QA 593b77a2608e","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.585732469Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-c2093630-5187-4ca8-8f53-1339f3aa5595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2093630-5187-4ca8-8f53-1339f3aa5595
Content-Type: application/json

--- request body ---
{"handle":"qa-9d26c83c906e","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2093630-5187-4ca8-8f53-1339f3aa5595
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_698db303-f619-46ec-8674-57f37bd6e417"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4bbf91d-8d23-4897-8901-8aeffecb6e8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4bbf91d-8d23-4897-8901-8aeffecb6e8e
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4bbf91d-8d23-4897-8901-8aeffecb6e8e
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
correlation: qa-704017d7-c7a5-4726-8dd1-6601ce44115c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-704017d7-c7a5-4726-8dd1-6601ce44115c
Content-Type: application/json

--- request body ---
{"handle":"qa-9d26c83c906e","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-704017d7-c7a5-4726-8dd1-6601ce44115c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-704017d7-c7a5-4726-8dd1-6601ce44115c"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e9d96ec4-031d-456c-8c75-f38460d852d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9d96ec4-031d-456c-8c75-f38460d852d6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e9d96ec4-031d-456c-8c75-f38460d852d6
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
correlation: qa-778710c3-acfb-4153-b616-d72b046af098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-778710c3-acfb-4153-b616-d72b046af098
Content-Type: application/json

--- request body ---
{"handle":"qa-593b77a2608e","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-778710c3-acfb-4153-b616-d72b046af098
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-778710c3-acfb-4153-b616-d72b046af098"}
```
