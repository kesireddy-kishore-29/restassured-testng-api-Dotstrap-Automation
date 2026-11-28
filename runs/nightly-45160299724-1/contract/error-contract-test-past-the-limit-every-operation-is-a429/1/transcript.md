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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-906aac68-ca2b-4ce6-8cb7-662ee8963a4b` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-edcd7fd5-d9f5-4866-9208-be7a3e753855` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-8e636355-1456-4944-bc3e-6ea993b7398a` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-f6697a72-33cc-4ae8-b3d6-87b00fba92c9` |
| 5 | `GET /v1/accounts/me` | 200 | 20 | `qa-8181ee19-a54c-4c8e-ad01-d91538cb064d` |
| 6 | `GET /v1/accounts/me` | 200 | 27 | `qa-f52a1e92-9246-4854-bbd1-21a502d6f960` |
| 7 | `GET /v1/accounts/me` | 200 | 27 | `qa-890905c7-61f9-404c-a026-d258c36f1828` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-509a2a2c-6d8b-4554-adf5-75235b03911f` |
| 9 | `GET /v1/accounts/me` | 200 | 28 | `qa-a67b4301-9b7a-4a0a-9651-d032e97dc8fa` |
| 10 | `GET /v1/accounts/me` | 200 | 16 | `qa-c790d775-26fc-4876-a1c3-ede925de6ccb` |
| 11 | `GET /v1/accounts/me` | 200 | 20 | `qa-9cb48301-0fc8-4440-ae4d-6134f1299867` |
| 12 | `GET /v1/accounts/me` | 200 | 5 | `qa-8122d4cb-90f5-4033-94f4-bc595a84def4` |
| 13 | `GET /v1/accounts/me` | 200 | 25 | `qa-ae4024ce-5cc2-4955-b84c-b7195dcc77b5` |
| 14 | `GET /v1/accounts/me` | 200 | 28 | `qa-46310eb6-b446-4443-a314-f34ea02000f7` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-a4daef2d-8844-4467-9163-392a626bc5b3` |
| 16 | `GET /v1/accounts/me` | 200 | 16 | `qa-0f71d002-ba85-4883-aa7b-1d8fd8780971` |
| 17 | `GET /v1/accounts/me` | 200 | 25 | `qa-0e0f63cf-626a-43c7-8908-99670c339db8` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-cbfbb86f-fbeb-4ba5-bcab-95b1ae9f82ce` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-6458504e-c6ed-4246-a102-02d0141a1d08` |
| 20 | `GET /v1/accounts/me` | 200 | 15 | `qa-42124e22-8fcc-42ca-9c86-c3fb07cc7109` |
| 21 | `GET /v1/accounts/me` | 200 | 13 | `qa-1be672b2-d0e8-447a-a066-cc1a7de0a5c7` |
| 22 | `GET /v1/accounts/me` | 200 | 24 | `qa-0bb2c7fd-43f9-4c17-8c0e-359d4840664a` |
| 23 | `GET /v1/accounts/me` | 200 | 17 | `qa-dc8dd601-56a1-4ce5-a3be-8e5a70ffd8be` |
| 24 | `GET /v1/accounts/me` | 200 | 7 | `qa-962b3fc2-199d-44a6-bc13-8ee6be5dfca8` |
| 25 | `GET /v1/accounts/me` | 200 | 16 | `qa-ce5a66d5-3673-41e3-a8da-76090a1d530d` |
| 26 | `GET /v1/accounts/me` | 200 | 17 | `qa-c0f0c1ce-9e4c-4931-960a-c9f5d747f798` |
| 27 | `GET /v1/accounts/me` | 200 | 11 | `qa-79ff6276-f787-4ed2-86df-ad4eba742336` |
| 28 | `GET /v1/accounts/me` | 200 | 14 | `qa-bc3e82bb-e54c-4108-b279-3092e5aa36f3` |
| 29 | `GET /v1/accounts/me` | 200 | 77 | `qa-0805cb10-820d-4d6f-a337-2ae92a2fd24e` |
| 30 | `GET /v1/accounts/me` | 200 | 11 | `qa-ecd42c14-a89c-4ebd-b205-1ebb83e60546` |
| 31 | `GET /v1/accounts/me` | 200 | 13 | `qa-b31c3baa-e3f0-4057-acaf-e73a50bb60d3` |
| 32 | `GET /v1/accounts/me` | 200 | 16 | `qa-5346b79e-837f-413c-bf16-6ca2c17fff7f` |
| 33 | `GET /v1/accounts/me` | 200 | 18 | `qa-e0e804fd-229c-4ff5-ba17-64395bc18486` |
| 34 | `GET /v1/accounts/me` | 200 | 20 | `qa-2b76549d-8109-4daf-b75a-1cc6365fb930` |
| 35 | `GET /v1/accounts/me` | 200 | 25 | `qa-79e37cc3-4b72-4491-b398-a687610a1d9e` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-bb565024-a81c-49b4-a1fd-8044138abffe` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-2bfba097-8f09-49b6-a502-17bf4a3f7e49` |
| 38 | `GET /v1/accounts/me` | 200 | 15 | `qa-a86cd008-0eda-4d1e-9ae3-57ff6d5871ee` |
| 39 | `GET /v1/accounts/me` | 200 | 18 | `qa-1b14ee19-e6c8-489a-ae73-9062e1ae1531` |
| 40 | `GET /v1/accounts/me` | 200 | 17 | `qa-a8515cad-6824-458d-941e-517be9b634a1` |
| 41 | `GET /v1/accounts/me` | 200 | 11 | `qa-47b29323-177d-401b-ac78-8a19ca0a7d86` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-553c17b8-7b1a-41ff-bd60-a2e95355a2af` |
| 43 | `GET /v1/accounts/me` | 200 | 10 | `qa-54663c10-46be-4ebb-a315-15bc042da072` |
| 44 | `GET /v1/accounts/me` | 200 | 13 | `qa-334b61dc-61b8-4b8d-86ba-11df7e4dbd37` |
| 45 | `GET /v1/accounts/me` | 200 | 12 | `qa-b453b5f4-c7ef-40c3-9206-d730cfed8497` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-6c89c264-bd95-49ae-886d-f35e7195b1ab` |
| 47 | `GET /v1/accounts/me` | 200 | 12 | `qa-0602340f-eaa1-46e5-bfd7-c09c4456c379` |
| 48 | `GET /v1/accounts/me` | 200 | 19 | `qa-64825007-4716-4c02-b7ba-a6d313aea65e` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-495eed63-1c23-448b-9d4c-c0ffdbc7bdd8` |
| 50 | `GET /v1/accounts/me` | 200 | 19 | `qa-0402f682-b5bc-4adf-aba0-eb0f671d5d09` |
| 51 | `GET /v1/accounts/me` | 200 | 18 | `qa-5c053f7a-2aeb-4d57-9f65-38a4cf219661` |
| 52 | `GET /v1/accounts/me` | 200 | 21 | `qa-7fcdbea3-5a51-414b-8afd-dc873d107f08` |
| 53 | `GET /v1/accounts/me` | 200 | 18 | `qa-7058dd5d-68ca-46fc-81d0-ca3ed78ae0e6` |
| 54 | `GET /v1/accounts/me` | 200 | 23 | `qa-9ca9247e-0fc7-4f51-9b1b-b5a31b0a2676` |
| 55 | `GET /v1/accounts/me` | 200 | 13 | `qa-326ecaa2-6388-4900-99ae-d5a2ed6ba211` |
| 56 | `GET /v1/accounts/me` | 200 | 12 | `qa-2e359a96-0473-4ffd-9a57-fe096281560a` |
| 57 | `GET /v1/accounts/me` | 200 | 10 | `qa-ec1c5f67-5c1e-459a-8513-00db204d67e8` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-ab14fc58-c62d-4733-8683-424fa894c803` |
| 59 | `GET /v1/accounts/me` | 200 | 10 | `qa-7560bb03-68bc-477f-9f90-fa67146bcc11` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-f1b267b6-4cc2-467e-af3b-c1fd468a569f` |
| 61 | `GET /v1/accounts/me` | 200 | 9 | `qa-5172f6b9-421f-4a04-aa93-1c4fd8763dd2` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-710ddeef-cc30-471d-915a-c7cf638254c5` |
| 63 | `GET /v1/accounts/me` | 200 | 7 | `qa-df4c46fe-1973-4e46-893b-47e3ac934b25` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-7ebfef5c-5033-4462-bdf5-d919d3b62448` |
| 65 | `POST /v1/auth/token` | 429 | 5 | `qa-d373fe22-7e90-4121-bb9e-5fa266573ca3` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-26c792d3-03af-48f4-bf02-1783838dc9c3` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-f701de3b-a05d-4f1a-8cfc-05829b7879e8` |
| 68 | `PATCH /v1/accounts/me` | 429 | 5 | `qa-cd2991ba-3923-4496-b10a-31018b7aa8ed` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-f4b005ae-ff9d-466b-aeca-9530e3dbc5df` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-353736c7-a76d-4f8a-8962-a0584ab95219` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-2a6b8453-d94e-4d30-87ab-f204d2cd0657` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-c8e06237-9f38-4db0-8f1c-add29cf442f4` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-73e525e3-58dd-4a23-b3a5-18b4634b44aa` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 3 | `qa-32e16581-c324-454b-84fd-70c428aadbda` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-5c48b699-6720-4741-8be9-5b77c4fd45a7` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-81d4d98f-c1e7-40af-8def-d1389d79b1df` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-8bf5bfea-b012-4427-95cf-2bbed40b3380` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-aeb9d3ae-2eed-4425-bde3-4a4abde9c3e9` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-34632cf3-aa9d-4a14-bb48-195810c2c363` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-74164777-d1ce-4b05-aab2-9e6d6fded913` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-b948d5a8-e173-4ea3-965b-5a266d9962c9` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-6ed8fbea-e747-40ce-b87f-c13e25157c66` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-0eb58d94-2fbd-44d5-b000-a0953e8bbe45` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-5bdb1de5-d671-45e3-83e9-43edb726c30f` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-27a1662c-91e4-4be1-927e-51211290424d` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-c8a0b501-4bdd-4f34-9bc4-a5ceb1c16c6a` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-27f544b4-4ad1-4b57-a8e3-cc1275a4fab3` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-ee96d860-5495-40b5-b222-42a26eb7a9f8` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-b92fa8bf-c4f4-4db9-9d77-b6f75ece68e7` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-d9241540-7cfe-46e6-ae84-77adce4be0bb` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-17642825-4a86-4752-b742-696508a9b19e` |
| 92 | `GET /v1/accounts/me` | 429 | 5 | `qa-8adf3006-7437-495e-8758-031fd7aff505` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-c3f5f418-798a-441b-a9da-a7d1fea470f3` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-1944256e-fe92-44cf-b9b7-b0bfadee29bd` |
| 95 | `GET /v1/accounts/me` | 429 | 6 | `qa-4e923562-4541-4b8f-a989-2541b50e0dd9` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-c3bee94b-035c-4b01-bcf5-446c1e35166c` |
| 97 | `GET /v1/accounts/me` | 200 | 5 | `qa-7a48bf8b-7381-4b61-ac5b-e42b5f6af153` |
| 98 | `POST /v1/auth/token` | 200 | 8 | `qa-378a4492-7f26-4abb-8c62-f6b268788c4a` |
| 99 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-25ca5450-054e-4678-b97d-56afb9af1b14` |
| 100 | `POST /v1/auth/token` | 401 | 6 | `qa-c29c2433-26fc-4fb3-ad18-5cdcae55740c` |
| 101 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-044cf9b5-ca17-4b8b-b180-c0d6600ccca5` |
| 102 | `POST /v1/auth/token` | 401 | 5 | `qa-2b2f1991-03f9-4e23-933f-9115b048402c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-906aac68-ca2b-4ce6-8cb7-662ee8963a4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-906aac68-ca2b-4ce6-8cb7-662ee8963a4b
Content-Type: application/json

--- request body ---
{"handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-906aac68-ca2b-4ce6-8cb7-662ee8963a4b
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
Location: /v1/accounts/qa-f0daf2c10a45
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-edcd7fd5-d9f5-4866-9208-be7a3e753855

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edcd7fd5-d9f5-4866-9208-be7a3e753855
Content-Type: application/json

--- request body ---
{"handle":"qa-9c29a5460cf7","displayName":"QA 9c29a5460cf7","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-edcd7fd5-d9f5-4866-9208-be7a3e753855
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
Location: /v1/accounts/qa-9c29a5460cf7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92f186ad-0b67-428a-8104-90e119e99904","handle":"qa-9c29a5460cf7","displayName":"QA 9c29a5460cf7","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.193774732Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8e636355-1456-4944-bc3e-6ea993b7398a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e636355-1456-4944-bc3e-6ea993b7398a
Content-Type: application/json

--- request body ---
{"handle":"qa-f0daf2c10a45","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e636355-1456-4944-bc3e-6ea993b7398a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f6697a72-33cc-4ae8-b3d6-87b00fba92c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6697a72-33cc-4ae8-b3d6-87b00fba92c9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c29a5460cf7","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6697a72-33cc-4ae8-b3d6-87b00fba92c9
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
Location: /v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0","subject":"Error contract","status":"open","region":"eu","participants":["qa-f0daf2c10a45","qa-9c29a5460cf7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.267496484Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-8181ee19-a54c-4c8e-ad01-d91538cb064d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8181ee19-a54c-4c8e-ad01-d91538cb064d
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8181ee19-a54c-4c8e-ad01-d91538cb064d
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-f52a1e92-9246-4854-bbd1-21a502d6f960

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f52a1e92-9246-4854-bbd1-21a502d6f960
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f52a1e92-9246-4854-bbd1-21a502d6f960
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-890905c7-61f9-404c-a026-d258c36f1828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-890905c7-61f9-404c-a026-d258c36f1828
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-890905c7-61f9-404c-a026-d258c36f1828
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-509a2a2c-6d8b-4554-adf5-75235b03911f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-509a2a2c-6d8b-4554-adf5-75235b03911f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-509a2a2c-6d8b-4554-adf5-75235b03911f
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a67b4301-9b7a-4a0a-9651-d032e97dc8fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a67b4301-9b7a-4a0a-9651-d032e97dc8fa
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a67b4301-9b7a-4a0a-9651-d032e97dc8fa
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-c790d775-26fc-4876-a1c3-ede925de6ccb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c790d775-26fc-4876-a1c3-ede925de6ccb
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c790d775-26fc-4876-a1c3-ede925de6ccb
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cb48301-0fc8-4440-ae4d-6134f1299867

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cb48301-0fc8-4440-ae4d-6134f1299867
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cb48301-0fc8-4440-ae4d-6134f1299867
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-8122d4cb-90f5-4033-94f4-bc595a84def4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8122d4cb-90f5-4033-94f4-bc595a84def4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8122d4cb-90f5-4033-94f4-bc595a84def4
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae4024ce-5cc2-4955-b84c-b7195dcc77b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae4024ce-5cc2-4955-b84c-b7195dcc77b5
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae4024ce-5cc2-4955-b84c-b7195dcc77b5
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-46310eb6-b446-4443-a314-f34ea02000f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46310eb6-b446-4443-a314-f34ea02000f7
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-46310eb6-b446-4443-a314-f34ea02000f7
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4daef2d-8844-4467-9163-392a626bc5b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4daef2d-8844-4467-9163-392a626bc5b3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4daef2d-8844-4467-9163-392a626bc5b3
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f71d002-ba85-4883-aa7b-1d8fd8780971

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f71d002-ba85-4883-aa7b-1d8fd8780971
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f71d002-ba85-4883-aa7b-1d8fd8780971
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e0f63cf-626a-43c7-8908-99670c339db8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e0f63cf-626a-43c7-8908-99670c339db8
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e0f63cf-626a-43c7-8908-99670c339db8
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbfbb86f-fbeb-4ba5-bcab-95b1ae9f82ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbfbb86f-fbeb-4ba5-bcab-95b1ae9f82ce
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbfbb86f-fbeb-4ba5-bcab-95b1ae9f82ce
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-6458504e-c6ed-4246-a102-02d0141a1d08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6458504e-c6ed-4246-a102-02d0141a1d08
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6458504e-c6ed-4246-a102-02d0141a1d08
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-42124e22-8fcc-42ca-9c86-c3fb07cc7109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42124e22-8fcc-42ca-9c86-c3fb07cc7109
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-42124e22-8fcc-42ca-9c86-c3fb07cc7109
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-1be672b2-d0e8-447a-a066-cc1a7de0a5c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1be672b2-d0e8-447a-a066-cc1a7de0a5c7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1be672b2-d0e8-447a-a066-cc1a7de0a5c7
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bb2c7fd-43f9-4c17-8c0e-359d4840664a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bb2c7fd-43f9-4c17-8c0e-359d4840664a
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bb2c7fd-43f9-4c17-8c0e-359d4840664a
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc8dd601-56a1-4ce5-a3be-8e5a70ffd8be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc8dd601-56a1-4ce5-a3be-8e5a70ffd8be
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc8dd601-56a1-4ce5-a3be-8e5a70ffd8be
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-962b3fc2-199d-44a6-bc13-8ee6be5dfca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-962b3fc2-199d-44a6-bc13-8ee6be5dfca8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-962b3fc2-199d-44a6-bc13-8ee6be5dfca8
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce5a66d5-3673-41e3-a8da-76090a1d530d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5a66d5-3673-41e3-a8da-76090a1d530d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce5a66d5-3673-41e3-a8da-76090a1d530d
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0f0c1ce-9e4c-4931-960a-c9f5d747f798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0f0c1ce-9e4c-4931-960a-c9f5d747f798
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0f0c1ce-9e4c-4931-960a-c9f5d747f798
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-79ff6276-f787-4ed2-86df-ad4eba742336

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79ff6276-f787-4ed2-86df-ad4eba742336
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-79ff6276-f787-4ed2-86df-ad4eba742336
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc3e82bb-e54c-4108-b279-3092e5aa36f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc3e82bb-e54c-4108-b279-3092e5aa36f3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc3e82bb-e54c-4108-b279-3092e5aa36f3
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-0805cb10-820d-4d6f-a337-2ae92a2fd24e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0805cb10-820d-4d6f-a337-2ae92a2fd24e
Content-Type: application/json

--- response: 200 in 77 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0805cb10-820d-4d6f-a337-2ae92a2fd24e
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecd42c14-a89c-4ebd-b205-1ebb83e60546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecd42c14-a89c-4ebd-b205-1ebb83e60546
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecd42c14-a89c-4ebd-b205-1ebb83e60546
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-b31c3baa-e3f0-4057-acaf-e73a50bb60d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b31c3baa-e3f0-4057-acaf-e73a50bb60d3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b31c3baa-e3f0-4057-acaf-e73a50bb60d3
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-5346b79e-837f-413c-bf16-6ca2c17fff7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5346b79e-837f-413c-bf16-6ca2c17fff7f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5346b79e-837f-413c-bf16-6ca2c17fff7f
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0e804fd-229c-4ff5-ba17-64395bc18486

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0e804fd-229c-4ff5-ba17-64395bc18486
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0e804fd-229c-4ff5-ba17-64395bc18486
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b76549d-8109-4daf-b75a-1cc6365fb930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b76549d-8109-4daf-b75a-1cc6365fb930
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b76549d-8109-4daf-b75a-1cc6365fb930
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-79e37cc3-4b72-4491-b398-a687610a1d9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79e37cc3-4b72-4491-b398-a687610a1d9e
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-79e37cc3-4b72-4491-b398-a687610a1d9e
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb565024-a81c-49b4-a1fd-8044138abffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb565024-a81c-49b4-a1fd-8044138abffe
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb565024-a81c-49b4-a1fd-8044138abffe
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bfba097-8f09-49b6-a502-17bf4a3f7e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bfba097-8f09-49b6-a502-17bf4a3f7e49
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bfba097-8f09-49b6-a502-17bf4a3f7e49
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-a86cd008-0eda-4d1e-9ae3-57ff6d5871ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a86cd008-0eda-4d1e-9ae3-57ff6d5871ee
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a86cd008-0eda-4d1e-9ae3-57ff6d5871ee
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b14ee19-e6c8-489a-ae73-9062e1ae1531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b14ee19-e6c8-489a-ae73-9062e1ae1531
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b14ee19-e6c8-489a-ae73-9062e1ae1531
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8515cad-6824-458d-941e-517be9b634a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8515cad-6824-458d-941e-517be9b634a1
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8515cad-6824-458d-941e-517be9b634a1
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-47b29323-177d-401b-ac78-8a19ca0a7d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b29323-177d-401b-ac78-8a19ca0a7d86
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-47b29323-177d-401b-ac78-8a19ca0a7d86
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-553c17b8-7b1a-41ff-bd60-a2e95355a2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-553c17b8-7b1a-41ff-bd60-a2e95355a2af
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-553c17b8-7b1a-41ff-bd60-a2e95355a2af
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-54663c10-46be-4ebb-a315-15bc042da072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54663c10-46be-4ebb-a315-15bc042da072
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-54663c10-46be-4ebb-a315-15bc042da072
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-334b61dc-61b8-4b8d-86ba-11df7e4dbd37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-334b61dc-61b8-4b8d-86ba-11df7e4dbd37
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-334b61dc-61b8-4b8d-86ba-11df7e4dbd37
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-b453b5f4-c7ef-40c3-9206-d730cfed8497

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b453b5f4-c7ef-40c3-9206-d730cfed8497
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b453b5f4-c7ef-40c3-9206-d730cfed8497
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c89c264-bd95-49ae-886d-f35e7195b1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c89c264-bd95-49ae-886d-f35e7195b1ab
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c89c264-bd95-49ae-886d-f35e7195b1ab
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-0602340f-eaa1-46e5-bfd7-c09c4456c379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0602340f-eaa1-46e5-bfd7-c09c4456c379
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0602340f-eaa1-46e5-bfd7-c09c4456c379
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-64825007-4716-4c02-b7ba-a6d313aea65e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64825007-4716-4c02-b7ba-a6d313aea65e
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-64825007-4716-4c02-b7ba-a6d313aea65e
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-495eed63-1c23-448b-9d4c-c0ffdbc7bdd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-495eed63-1c23-448b-9d4c-c0ffdbc7bdd8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-495eed63-1c23-448b-9d4c-c0ffdbc7bdd8
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-0402f682-b5bc-4adf-aba0-eb0f671d5d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0402f682-b5bc-4adf-aba0-eb0f671d5d09
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-0402f682-b5bc-4adf-aba0-eb0f671d5d09
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c053f7a-2aeb-4d57-9f65-38a4cf219661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c053f7a-2aeb-4d57-9f65-38a4cf219661
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c053f7a-2aeb-4d57-9f65-38a4cf219661
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-7fcdbea3-5a51-414b-8afd-dc873d107f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fcdbea3-5a51-414b-8afd-dc873d107f08
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fcdbea3-5a51-414b-8afd-dc873d107f08
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-7058dd5d-68ca-46fc-81d0-ca3ed78ae0e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7058dd5d-68ca-46fc-81d0-ca3ed78ae0e6
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7058dd5d-68ca-46fc-81d0-ca3ed78ae0e6
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ca9247e-0fc7-4f51-9b1b-b5a31b0a2676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca9247e-0fc7-4f51-9b1b-b5a31b0a2676
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ca9247e-0fc7-4f51-9b1b-b5a31b0a2676
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-326ecaa2-6388-4900-99ae-d5a2ed6ba211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-326ecaa2-6388-4900-99ae-d5a2ed6ba211
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-326ecaa2-6388-4900-99ae-d5a2ed6ba211
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e359a96-0473-4ffd-9a57-fe096281560a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e359a96-0473-4ffd-9a57-fe096281560a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e359a96-0473-4ffd-9a57-fe096281560a
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec1c5f67-5c1e-459a-8513-00db204d67e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec1c5f67-5c1e-459a-8513-00db204d67e8
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec1c5f67-5c1e-459a-8513-00db204d67e8
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab14fc58-c62d-4733-8683-424fa894c803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab14fc58-c62d-4733-8683-424fa894c803
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab14fc58-c62d-4733-8683-424fa894c803
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-7560bb03-68bc-477f-9f90-fa67146bcc11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7560bb03-68bc-477f-9f90-fa67146bcc11
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-7560bb03-68bc-477f-9f90-fa67146bcc11
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1b267b6-4cc2-467e-af3b-c1fd468a569f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b267b6-4cc2-467e-af3b-c1fd468a569f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b267b6-4cc2-467e-af3b-c1fd468a569f
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-5172f6b9-421f-4a04-aa93-1c4fd8763dd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5172f6b9-421f-4a04-aa93-1c4fd8763dd2
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5172f6b9-421f-4a04-aa93-1c4fd8763dd2
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-710ddeef-cc30-471d-915a-c7cf638254c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-710ddeef-cc30-471d-915a-c7cf638254c5
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-710ddeef-cc30-471d-915a-c7cf638254c5
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-df4c46fe-1973-4e46-893b-47e3ac934b25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df4c46fe-1973-4e46-893b-47e3ac934b25
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-df4c46fe-1973-4e46-893b-47e3ac934b25
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ebfef5c-5033-4462-bdf5-d919d3b62448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ebfef5c-5033-4462-bdf5-d919d3b62448
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ebfef5c-5033-4462-bdf5-d919d3b62448
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7ebfef5c-5033-4462-bdf5-d919d3b62448"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-d373fe22-7e90-4121-bb9e-5fa266573ca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d373fe22-7e90-4121-bb9e-5fa266573ca3
Content-Type: application/json

--- request body ---
{"handle":"qa-f0daf2c10a45","password":"****"}

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d373fe22-7e90-4121-bb9e-5fa266573ca3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-d373fe22-7e90-4121-bb9e-5fa266573ca3"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-26c792d3-03af-48f4-bf02-1783838dc9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26c792d3-03af-48f4-bf02-1783838dc9c3
Content-Type: application/json

--- request body ---
{"handle":"qa-c9e8347ffb2b","displayName":"QA c9e8347ffb2b","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26c792d3-03af-48f4-bf02-1783838dc9c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-26c792d3-03af-48f4-bf02-1783838dc9c3"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-f701de3b-a05d-4f1a-8cfc-05829b7879e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f701de3b-a05d-4f1a-8cfc-05829b7879e8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f701de3b-a05d-4f1a-8cfc-05829b7879e8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f701de3b-a05d-4f1a-8cfc-05829b7879e8"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cd2991ba-3923-4496-b10a-31018b7aa8ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd2991ba-3923-4496-b10a-31018b7aa8ed
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd2991ba-3923-4496-b10a-31018b7aa8ed
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cd2991ba-3923-4496-b10a-31018b7aa8ed"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4b005ae-ff9d-466b-aeca-9530e3dbc5df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4b005ae-ff9d-466b-aeca-9530e3dbc5df
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4b005ae-ff9d-466b-aeca-9530e3dbc5df
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f4b005ae-ff9d-466b-aeca-9530e3dbc5df"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-f0daf2c10a45
correlation: qa-353736c7-a76d-4f8a-8962-a0584ab95219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-353736c7-a76d-4f8a-8962-a0584ab95219
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-353736c7-a76d-4f8a-8962-a0584ab95219
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-f0daf2c10a45","correlationId":"qa-353736c7-a76d-4f8a-8962-a0584ab95219"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-2a6b8453-d94e-4d30-87ab-f204d2cd0657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a6b8453-d94e-4d30-87ab-f204d2cd0657
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f0daf2c10a45","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a6b8453-d94e-4d30-87ab-f204d2cd0657
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-2a6b8453-d94e-4d30-87ab-f204d2cd0657"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-c8e06237-9f38-4db0-8f1c-add29cf442f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8e06237-9f38-4db0-8f1c-add29cf442f4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8e06237-9f38-4db0-8f1c-add29cf442f4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-c8e06237-9f38-4db0-8f1c-add29cf442f4"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0
correlation: qa-73e525e3-58dd-4a23-b3a5-18b4634b44aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73e525e3-58dd-4a23-b3a5-18b4634b44aa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73e525e3-58dd-4a23-b3a5-18b4634b44aa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0","correlationId":"qa-73e525e3-58dd-4a23-b3a5-18b4634b44aa"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/messages
correlation: qa-32e16581-c324-454b-84fd-70c428aadbda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32e16581-c324-454b-84fd-70c428aadbda
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32e16581-c324-454b-84fd-70c428aadbda
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/messages","correlationId":"qa-32e16581-c324-454b-84fd-70c428aadbda"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/messages
correlation: qa-5c48b699-6720-4741-8be9-5b77c4fd45a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c48b699-6720-4741-8be9-5b77c4fd45a7
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c48b699-6720-4741-8be9-5b77c4fd45a7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/messages","correlationId":"qa-5c48b699-6720-4741-8be9-5b77c4fd45a7"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/read
correlation: qa-81d4d98f-c1e7-40af-8def-d1389d79b1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81d4d98f-c1e7-40af-8def-d1389d79b1df
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81d4d98f-c1e7-40af-8def-d1389d79b1df
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/read","correlationId":"qa-81d4d98f-c1e7-40af-8def-d1389d79b1df"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/close
correlation: qa-8bf5bfea-b012-4427-95cf-2bbed40b3380

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf5bfea-b012-4427-95cf-2bbed40b3380
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bf5bfea-b012-4427-95cf-2bbed40b3380
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_2a1e10c0-95fa-4a95-b6a7-6a278c0ccaa0/close","correlationId":"qa-8bf5bfea-b012-4427-95cf-2bbed40b3380"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-aeb9d3ae-2eed-4425-bde3-4a4abde9c3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeb9d3ae-2eed-4425-bde3-4a4abde9c3e9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aeb9d3ae-2eed-4425-bde3-4a4abde9c3e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-aeb9d3ae-2eed-4425-bde3-4a4abde9c3e9"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-34632cf3-aa9d-4a14-bb48-195810c2c363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34632cf3-aa9d-4a14-bb48-195810c2c363
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34632cf3-aa9d-4a14-bb48-195810c2c363
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-34632cf3-aa9d-4a14-bb48-195810c2c363"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-74164777-d1ce-4b05-aab2-9e6d6fded913

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c667fd65046d4689b04d3c47f90aec6e
X-Correlation-Id: qa-74164777-d1ce-4b05-aab2-9e6d6fded913
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74164777-d1ce-4b05-aab2-9e6d6fded913
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-74164777-d1ce-4b05-aab2-9e6d6fded913"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-b948d5a8-e173-4ea3-965b-5a266d9962c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b948d5a8-e173-4ea3-965b-5a266d9962c9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b948d5a8-e173-4ea3-965b-5a266d9962c9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-b948d5a8-e173-4ea3-965b-5a266d9962c9"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ed8fbea-e747-40ce-b87f-c13e25157c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ed8fbea-e747-40ce-b87f-c13e25157c66
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ed8fbea-e747-40ce-b87f-c13e25157c66
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ed8fbea-e747-40ce-b87f-c13e25157c66"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-0eb58d94-2fbd-44d5-b000-a0953e8bbe45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb58d94-2fbd-44d5-b000-a0953e8bbe45
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0eb58d94-2fbd-44d5-b000-a0953e8bbe45
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0eb58d94-2fbd-44d5-b000-a0953e8bbe45"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-5bdb1de5-d671-45e3-83e9-43edb726c30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bdb1de5-d671-45e3-83e9-43edb726c30f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bdb1de5-d671-45e3-83e9-43edb726c30f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5bdb1de5-d671-45e3-83e9-43edb726c30f"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-27a1662c-91e4-4be1-927e-51211290424d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27a1662c-91e4-4be1-927e-51211290424d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27a1662c-91e4-4be1-927e-51211290424d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-27a1662c-91e4-4be1-927e-51211290424d"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8a0b501-4bdd-4f34-9bc4-a5ceb1c16c6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a0b501-4bdd-4f34-9bc4-a5ceb1c16c6a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8a0b501-4bdd-4f34-9bc4-a5ceb1c16c6a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c8a0b501-4bdd-4f34-9bc4-a5ceb1c16c6a"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-27f544b4-4ad1-4b57-a8e3-cc1275a4fab3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27f544b4-4ad1-4b57-a8e3-cc1275a4fab3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27f544b4-4ad1-4b57-a8e3-cc1275a4fab3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-27f544b4-4ad1-4b57-a8e3-cc1275a4fab3"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee96d860-5495-40b5-b222-42a26eb7a9f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee96d860-5495-40b5-b222-42a26eb7a9f8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee96d860-5495-40b5-b222-42a26eb7a9f8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee96d860-5495-40b5-b222-42a26eb7a9f8"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-b92fa8bf-c4f4-4db9-9d77-b6f75ece68e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b92fa8bf-c4f4-4db9-9d77-b6f75ece68e7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b92fa8bf-c4f4-4db9-9d77-b6f75ece68e7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b92fa8bf-c4f4-4db9-9d77-b6f75ece68e7"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9241540-7cfe-46e6-ae84-77adce4be0bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9241540-7cfe-46e6-ae84-77adce4be0bb
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9241540-7cfe-46e6-ae84-77adce4be0bb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d9241540-7cfe-46e6-ae84-77adce4be0bb"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-17642825-4a86-4752-b742-696508a9b19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17642825-4a86-4752-b742-696508a9b19e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17642825-4a86-4752-b742-696508a9b19e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-17642825-4a86-4752-b742-696508a9b19e"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-8adf3006-7437-495e-8758-031fd7aff505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8adf3006-7437-495e-8758-031fd7aff505
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8adf3006-7437-495e-8758-031fd7aff505
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8adf3006-7437-495e-8758-031fd7aff505"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3f5f418-798a-441b-a9da-a7d1fea470f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f5f418-798a-441b-a9da-a7d1fea470f3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3f5f418-798a-441b-a9da-a7d1fea470f3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c3f5f418-798a-441b-a9da-a7d1fea470f3"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-1944256e-fe92-44cf-b9b7-b0bfadee29bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1944256e-fe92-44cf-b9b7-b0bfadee29bd
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1944256e-fe92-44cf-b9b7-b0bfadee29bd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1944256e-fe92-44cf-b9b7-b0bfadee29bd"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e923562-4541-4b8f-a989-2541b50e0dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e923562-4541-4b8f-a989-2541b50e0dd9
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4e923562-4541-4b8f-a989-2541b50e0dd9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4e923562-4541-4b8f-a989-2541b50e0dd9"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3bee94b-035c-4b01-bcf5-446c1e35166c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3bee94b-035c-4b01-bcf5-446c1e35166c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3bee94b-035c-4b01-bcf5-446c1e35166c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c3bee94b-035c-4b01-bcf5-446c1e35166c"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a48bf8b-7381-4b61-ac5b-e42b5f6af153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a48bf8b-7381-4b61-ac5b-e42b5f6af153
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a48bf8b-7381-4b61-ac5b-e42b5f6af153
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

{"id":"acc_c14ce14a-8182-4b94-b5e8-a69cae907322","handle":"qa-f0daf2c10a45","displayName":"QA f0daf2c10a45","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.102797212Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-378a4492-7f26-4abb-8c62-f6b268788c4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378a4492-7f26-4abb-8c62-f6b268788c4a
Content-Type: application/json

--- request body ---
{"handle":"qa-9c29a5460cf7","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-378a4492-7f26-4abb-8c62-f6b268788c4a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92f186ad-0b67-428a-8104-90e119e99904"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25ca5450-054e-4678-b97d-56afb9af1b14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25ca5450-054e-4678-b97d-56afb9af1b14
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25ca5450-054e-4678-b97d-56afb9af1b14
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
correlation: qa-c29c2433-26fc-4fb3-ad18-5cdcae55740c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c29c2433-26fc-4fb3-ad18-5cdcae55740c
Content-Type: application/json

--- request body ---
{"handle":"qa-9c29a5460cf7","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c29c2433-26fc-4fb3-ad18-5cdcae55740c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c29c2433-26fc-4fb3-ad18-5cdcae55740c"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-044cf9b5-ca17-4b8b-b180-c0d6600ccca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-044cf9b5-ca17-4b8b-b180-c0d6600ccca5
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-044cf9b5-ca17-4b8b-b180-c0d6600ccca5
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
correlation: qa-2b2f1991-03f9-4e23-933f-9115b048402c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b2f1991-03f9-4e23-933f-9115b048402c
Content-Type: application/json

--- request body ---
{"handle":"qa-f0daf2c10a45","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 23 Nov 2026 10:55:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b2f1991-03f9-4e23-933f-9115b048402c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b2f1991-03f9-4e23-933f-9115b048402c"}
```
