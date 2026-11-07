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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-1ef254d5-2653-4869-81ff-3b70507b5052` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-212baf2a-76fb-4b41-bec6-df1d4acfbdd3` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-2760baf9-3a34-4ea8-a265-6ae99b534544` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-92220ff9-ed70-4aab-8f1d-04fba980de03` |
| 5 | `GET /v1/accounts/me` | 200 | 22 | `qa-1810390a-3823-4da6-8429-afec7fc1c845` |
| 6 | `GET /v1/accounts/me` | 200 | 18 | `qa-70576986-9fa7-4eb3-ab97-0ce56c27c7f5` |
| 7 | `GET /v1/accounts/me` | 200 | 13 | `qa-f3999c34-42b4-4133-b820-6b18b2fb7e0d` |
| 8 | `GET /v1/accounts/me` | 200 | 20 | `qa-f87d8631-0712-46a2-82f1-6ec8cc5f6277` |
| 9 | `GET /v1/accounts/me` | 200 | 21 | `qa-669c1b40-ef8f-4ce6-8295-51e95acbba2b` |
| 10 | `GET /v1/accounts/me` | 200 | 25 | `qa-bc395df6-4733-4240-91c4-3df4622473b0` |
| 11 | `GET /v1/accounts/me` | 200 | 17 | `qa-6980f332-4a96-4b09-8b44-1c19744be6af` |
| 12 | `GET /v1/accounts/me` | 200 | 13 | `qa-538c5e36-e5d3-462e-9df0-50db88618128` |
| 13 | `GET /v1/accounts/me` | 200 | 33 | `qa-05ffcc0a-728e-4fe5-9afb-7e87229335a4` |
| 14 | `GET /v1/accounts/me` | 200 | 29 | `qa-3bcfabc2-8bbe-4535-bbb0-ca0a2fec53f0` |
| 15 | `GET /v1/accounts/me` | 200 | 19 | `qa-4f25d178-2fdc-40c2-8c55-557b646282ca` |
| 16 | `GET /v1/accounts/me` | 200 | 41 | `qa-cbe26416-27b0-487c-8837-0bca54d1ebba` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-d23b2ce2-80ba-47fc-add7-8568b120a3aa` |
| 18 | `GET /v1/accounts/me` | 200 | 11 | `qa-631d3ef4-1feb-408d-b8aa-6c7dab805d66` |
| 19 | `GET /v1/accounts/me` | 200 | 21 | `qa-7eb4cfa5-42e6-4879-9973-d323e398eee8` |
| 20 | `GET /v1/accounts/me` | 200 | 10 | `qa-9e6ac6cc-caaa-464f-a8cc-67e6b2561ef0` |
| 21 | `GET /v1/accounts/me` | 200 | 12 | `qa-91cc5a88-61a2-43b1-b213-cb52b69ead9c` |
| 22 | `GET /v1/accounts/me` | 200 | 32 | `qa-dc1ed67c-07be-45b5-8cb5-31cf761f419e` |
| 23 | `GET /v1/accounts/me` | 200 | 12 | `qa-13d3ca22-d08f-4dd8-b2bb-e751269dfce6` |
| 24 | `GET /v1/accounts/me` | 200 | 16 | `qa-0b1f7dee-058b-40e2-91b6-fd06cc829866` |
| 25 | `GET /v1/accounts/me` | 200 | 16 | `qa-36e5adef-1246-4e72-a90d-64b72d41b6b8` |
| 26 | `GET /v1/accounts/me` | 200 | 19 | `qa-d56a18df-8dcd-4830-a290-c7ab0b30f48d` |
| 27 | `GET /v1/accounts/me` | 200 | 11 | `qa-16ae066d-e1ec-4ff5-8ad0-812b14ddf438` |
| 28 | `GET /v1/accounts/me` | 200 | 23 | `qa-df9bea41-4100-492c-a263-88ddba1431c9` |
| 29 | `GET /v1/accounts/me` | 200 | 15 | `qa-1063cd87-99d3-40ec-988b-72b90f8599e4` |
| 30 | `GET /v1/accounts/me` | 200 | 18 | `qa-c2aca336-602c-47db-bb85-f7a5be4dff30` |
| 31 | `GET /v1/accounts/me` | 200 | 10 | `qa-896324e8-43d7-42b7-8145-9ad7b155fa3f` |
| 32 | `GET /v1/accounts/me` | 200 | 25 | `qa-2c8b08b9-c836-42da-bb63-8220451f1daa` |
| 33 | `GET /v1/accounts/me` | 200 | 28 | `qa-6f73c618-c6a4-4963-8c72-6b9320a8eeb4` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-1747b355-83ee-41b9-b5e8-c5899209b474` |
| 35 | `GET /v1/accounts/me` | 200 | 13 | `qa-1c0bfd94-5220-4eaa-b7f5-d28c6dd7d992` |
| 36 | `GET /v1/accounts/me` | 200 | 27 | `qa-e0b98d67-bd44-4c87-953a-caf4c5d8cc69` |
| 37 | `GET /v1/accounts/me` | 200 | 21 | `qa-212cf5e7-947b-45ea-a1e9-dfd0cc9118bc` |
| 38 | `GET /v1/accounts/me` | 200 | 17 | `qa-ca9c7301-8832-4fa7-95a5-bfdbe705da1a` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-e9ecafd9-3a0a-425d-965c-64f1f6daf3f1` |
| 40 | `GET /v1/accounts/me` | 200 | 11 | `qa-dacca42d-e883-44d5-b5b1-c6946d59efa9` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-b3167c95-2616-4213-8ef7-242897e585e7` |
| 42 | `GET /v1/accounts/me` | 200 | 14 | `qa-8f12254f-ffb3-4d38-b9de-c2e5dd3b3c16` |
| 43 | `GET /v1/accounts/me` | 200 | 7 | `qa-1eae5701-04da-41e3-a29f-a07344fa247e` |
| 44 | `GET /v1/accounts/me` | 200 | 8 | `qa-da820e24-80ea-4868-be72-de4e22896786` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-08ec2356-0022-4a6f-bc86-65da2caab99b` |
| 46 | `GET /v1/accounts/me` | 200 | 9 | `qa-d0b58717-8256-46b2-b3db-9c9c1d23ead5` |
| 47 | `GET /v1/accounts/me` | 200 | 7 | `qa-a5b65a77-db5a-4e4f-9ccf-1a974b1f3f93` |
| 48 | `GET /v1/accounts/me` | 200 | 10 | `qa-851a0a10-8f1c-4067-b181-e8eddcd95adb` |
| 49 | `GET /v1/accounts/me` | 200 | 10 | `qa-f9d96cb1-1337-454f-a3d7-438d2ea26a35` |
| 50 | `GET /v1/accounts/me` | 200 | 12 | `qa-9680ea2b-ad9a-4fe8-80ff-9dc411417384` |
| 51 | `GET /v1/accounts/me` | 200 | 16 | `qa-5f9a0bc4-513b-4056-9672-b5d2b62c15fe` |
| 52 | `GET /v1/accounts/me` | 200 | 13 | `qa-d68a075d-6961-4018-bc47-4cc5f874b69e` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-13e1ab5d-11d1-4515-8268-fc2ae0277614` |
| 54 | `GET /v1/accounts/me` | 200 | 7 | `qa-9a4804d2-7a1d-49e8-8048-bc6d2ee8237e` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-e24d73e6-e938-4daf-a85b-e5d810ea35fc` |
| 56 | `GET /v1/accounts/me` | 200 | 15 | `qa-674a4927-c2d6-4e93-9d8d-9c68aae66f88` |
| 57 | `GET /v1/accounts/me` | 200 | 11 | `qa-fc5a57e5-4bc6-4c58-acd4-31ad55f88105` |
| 58 | `GET /v1/accounts/me` | 200 | 8 | `qa-68214a0a-21d4-4651-ad0a-6d5f2a192844` |
| 59 | `GET /v1/accounts/me` | 200 | 7 | `qa-139b53f3-bdd2-4f3a-a1ed-a8f378c37fa9` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-6014596a-927d-48b6-ab64-020aa6dee23a` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-aebd2f43-856c-4990-af62-b62e2fca1bfb` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-6545cf02-7152-444d-9857-8e9bf814abda` |
| 63 | `GET /v1/accounts/me` | 200 | 13 | `qa-75c5ba20-9086-42ea-b888-0e48d86ee155` |
| 64 | `GET /v1/accounts/me` | 429 | 8 | `qa-9ad568df-c1b0-4ece-97bd-690e4ec47298` |
| 65 | `POST /v1/auth/token` | 429 | 9 | `qa-05b1da9e-9150-4d71-94c1-37d60f09f786` |
| 66 | `POST /v1/accounts` | 429 | 10 | `qa-90429185-91ec-46cd-92b1-0c550c7a0a1a` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-3b1caafb-09f6-40ed-8bcc-ae9c0d6fdf62` |
| 68 | `PATCH /v1/accounts/me` | 429 | 9 | `qa-67a5ac74-0ccf-4ea0-be36-4d43b5ea25f2` |
| 69 | `DELETE /v1/accounts/me` | 429 | 12 | `qa-27754c3d-39db-400c-b85c-781b5808f51d` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 8 | `qa-bcfd0364-123e-44eb-8e0d-9fcf75ad8ecc` |
| 71 | `POST /v1/conversations` | 429 | 12 | `qa-a1dc3c15-38a4-4b71-aa93-48a35a2f7c03` |
| 72 | `GET /v1/conversations` | 429 | 37 | `qa-21c2d962-ff9e-4c22-8180-4391d343e6e3` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-f473ba4b-032f-4722-ba68-eb799e806ced` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 6 | `qa-85527b26-6eca-4680-ac74-f5163d8e7c28` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-ba107b77-bd76-4aa8-bacd-bc0519d8e5df` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-0dc28855-3914-49b7-9f3e-88007b00a0c1` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-92e3ca8e-4b2f-4628-9ab3-ecbe07d85105` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-78f009ef-dea5-48b2-8408-96ce48af3717` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-51cc1ad0-11f7-4360-96ad-fbadbcd03ff1` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-3943332a-ca3a-48cd-b238-2b6bbcc63d34` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-644ad37a-8eba-40b6-a1e5-08bc41f656e6` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-b37dab39-73a2-4c0d-8acc-117516f876d0` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-c144503a-788d-4dd4-9de9-b1dc1fb809c0` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-69f3b56b-8a65-4f07-bb28-09be1f99faef` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-6e4b53a6-eefc-4dd8-96ae-1a960a0b8c00` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-67f471d0-f136-4106-9091-219a75f04f59` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-bf733a5f-1d7f-451b-8dc7-40acde9c1b4a` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-f3c95e42-11ec-49f7-a460-a2fc5e99e3cb` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-3f7f476e-1351-404a-b0ce-8cdd34410ccd` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-79daf22f-f4b3-4fe1-a1b3-90450b00e8ef` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-348e0f32-71cd-4109-af2b-c01f2ace9389` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-9120ab73-7122-44bb-8f6d-2e062ba10a99` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-c9210b0d-8d52-4543-a14f-da8a30005a78` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-f3fbd785-5885-46a4-a305-160c98ab3f3b` |
| 95 | `GET /v1/accounts/me` | 429 | 6 | `qa-217ce63c-7563-4763-8105-6d5067688e75` |
| 96 | `GET /v1/accounts/me` | 200 | 3 | `qa-0f9da7bf-daa7-459c-9401-ec8f6f811e95` |
| 97 | `POST /v1/auth/token` | 200 | 9 | `qa-161a310e-e7e1-4ec9-bec7-a09ec667c4a2` |
| 98 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-64db0389-f4b5-48a6-ab90-959566fe45d9` |
| 99 | `POST /v1/auth/token` | 401 | 5 | `qa-6b78d4d6-8e8e-4f84-805a-993be0971324` |
| 100 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-d47a22bc-623c-4d9b-9f8f-e48353d2cac6` |
| 101 | `POST /v1/auth/token` | 401 | 2 | `qa-85fab243-647d-4424-b337-f009e50c8a9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1ef254d5-2653-4869-81ff-3b70507b5052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ef254d5-2653-4869-81ff-3b70507b5052
Content-Type: application/json

--- request body ---
{"handle":"qa-9304663b1180","displayName":"QA 9304663b1180","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ef254d5-2653-4869-81ff-3b70507b5052
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Location: /v1/accounts/qa-9304663b1180
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-212baf2a-76fb-4b41-bec6-df1d4acfbdd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-212baf2a-76fb-4b41-bec6-df1d4acfbdd3
Content-Type: application/json

--- request body ---
{"handle":"qa-9225d4456157","displayName":"QA 9225d4456157","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-212baf2a-76fb-4b41-bec6-df1d4acfbdd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Location: /v1/accounts/qa-9225d4456157
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f21253a-6c1d-4efb-a9d9-8a44861c8415","handle":"qa-9225d4456157","displayName":"QA 9225d4456157","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.575920236Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2760baf9-3a34-4ea8-a265-6ae99b534544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2760baf9-3a34-4ea8-a265-6ae99b534544
Content-Type: application/json

--- request body ---
{"handle":"qa-9304663b1180","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2760baf9-3a34-4ea8-a265-6ae99b534544
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-92220ff9-ed70-4aab-8f1d-04fba980de03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92220ff9-ed70-4aab-8f1d-04fba980de03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9225d4456157","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-92220ff9-ed70-4aab-8f1d-04fba980de03
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
Location: /v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984","subject":"Error contract","status":"open","region":"eu","participants":["qa-9304663b1180","qa-9225d4456157"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.662580434Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1810390a-3823-4da6-8429-afec7fc1c845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1810390a-3823-4da6-8429-afec7fc1c845
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1810390a-3823-4da6-8429-afec7fc1c845
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-70576986-9fa7-4eb3-ab97-0ce56c27c7f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70576986-9fa7-4eb3-ab97-0ce56c27c7f5
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-70576986-9fa7-4eb3-ab97-0ce56c27c7f5
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3999c34-42b4-4133-b820-6b18b2fb7e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3999c34-42b4-4133-b820-6b18b2fb7e0d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3999c34-42b4-4133-b820-6b18b2fb7e0d
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-f87d8631-0712-46a2-82f1-6ec8cc5f6277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f87d8631-0712-46a2-82f1-6ec8cc5f6277
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f87d8631-0712-46a2-82f1-6ec8cc5f6277
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-669c1b40-ef8f-4ce6-8295-51e95acbba2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-669c1b40-ef8f-4ce6-8295-51e95acbba2b
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-669c1b40-ef8f-4ce6-8295-51e95acbba2b
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc395df6-4733-4240-91c4-3df4622473b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc395df6-4733-4240-91c4-3df4622473b0
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc395df6-4733-4240-91c4-3df4622473b0
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-6980f332-4a96-4b09-8b44-1c19744be6af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6980f332-4a96-4b09-8b44-1c19744be6af
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6980f332-4a96-4b09-8b44-1c19744be6af
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-538c5e36-e5d3-462e-9df0-50db88618128

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-538c5e36-e5d3-462e-9df0-50db88618128
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-538c5e36-e5d3-462e-9df0-50db88618128
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-05ffcc0a-728e-4fe5-9afb-7e87229335a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ffcc0a-728e-4fe5-9afb-7e87229335a4
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-05ffcc0a-728e-4fe5-9afb-7e87229335a4
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-3bcfabc2-8bbe-4535-bbb0-ca0a2fec53f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bcfabc2-8bbe-4535-bbb0-ca0a2fec53f0
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bcfabc2-8bbe-4535-bbb0-ca0a2fec53f0
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f25d178-2fdc-40c2-8c55-557b646282ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f25d178-2fdc-40c2-8c55-557b646282ca
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f25d178-2fdc-40c2-8c55-557b646282ca
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-cbe26416-27b0-487c-8837-0bca54d1ebba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe26416-27b0-487c-8837-0bca54d1ebba
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbe26416-27b0-487c-8837-0bca54d1ebba
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-d23b2ce2-80ba-47fc-add7-8568b120a3aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23b2ce2-80ba-47fc-add7-8568b120a3aa
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d23b2ce2-80ba-47fc-add7-8568b120a3aa
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-631d3ef4-1feb-408d-b8aa-6c7dab805d66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-631d3ef4-1feb-408d-b8aa-6c7dab805d66
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-631d3ef4-1feb-408d-b8aa-6c7dab805d66
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-7eb4cfa5-42e6-4879-9973-d323e398eee8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eb4cfa5-42e6-4879-9973-d323e398eee8
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eb4cfa5-42e6-4879-9973-d323e398eee8
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e6ac6cc-caaa-464f-a8cc-67e6b2561ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e6ac6cc-caaa-464f-a8cc-67e6b2561ef0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e6ac6cc-caaa-464f-a8cc-67e6b2561ef0
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-91cc5a88-61a2-43b1-b213-cb52b69ead9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91cc5a88-61a2-43b1-b213-cb52b69ead9c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-91cc5a88-61a2-43b1-b213-cb52b69ead9c
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc1ed67c-07be-45b5-8cb5-31cf761f419e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc1ed67c-07be-45b5-8cb5-31cf761f419e
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc1ed67c-07be-45b5-8cb5-31cf761f419e
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-13d3ca22-d08f-4dd8-b2bb-e751269dfce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13d3ca22-d08f-4dd8-b2bb-e751269dfce6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-13d3ca22-d08f-4dd8-b2bb-e751269dfce6
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b1f7dee-058b-40e2-91b6-fd06cc829866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1f7dee-058b-40e2-91b6-fd06cc829866
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b1f7dee-058b-40e2-91b6-fd06cc829866
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-36e5adef-1246-4e72-a90d-64b72d41b6b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36e5adef-1246-4e72-a90d-64b72d41b6b8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-36e5adef-1246-4e72-a90d-64b72d41b6b8
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-d56a18df-8dcd-4830-a290-c7ab0b30f48d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d56a18df-8dcd-4830-a290-c7ab0b30f48d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d56a18df-8dcd-4830-a290-c7ab0b30f48d
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-16ae066d-e1ec-4ff5-8ad0-812b14ddf438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16ae066d-e1ec-4ff5-8ad0-812b14ddf438
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-16ae066d-e1ec-4ff5-8ad0-812b14ddf438
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-df9bea41-4100-492c-a263-88ddba1431c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df9bea41-4100-492c-a263-88ddba1431c9
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-df9bea41-4100-492c-a263-88ddba1431c9
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-1063cd87-99d3-40ec-988b-72b90f8599e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1063cd87-99d3-40ec-988b-72b90f8599e4
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1063cd87-99d3-40ec-988b-72b90f8599e4
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2aca336-602c-47db-bb85-f7a5be4dff30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2aca336-602c-47db-bb85-f7a5be4dff30
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2aca336-602c-47db-bb85-f7a5be4dff30
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-896324e8-43d7-42b7-8145-9ad7b155fa3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-896324e8-43d7-42b7-8145-9ad7b155fa3f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-896324e8-43d7-42b7-8145-9ad7b155fa3f
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c8b08b9-c836-42da-bb63-8220451f1daa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c8b08b9-c836-42da-bb63-8220451f1daa
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c8b08b9-c836-42da-bb63-8220451f1daa
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f73c618-c6a4-4963-8c72-6b9320a8eeb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f73c618-c6a4-4963-8c72-6b9320a8eeb4
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f73c618-c6a4-4963-8c72-6b9320a8eeb4
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-1747b355-83ee-41b9-b5e8-c5899209b474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1747b355-83ee-41b9-b5e8-c5899209b474
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1747b355-83ee-41b9-b5e8-c5899209b474
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c0bfd94-5220-4eaa-b7f5-d28c6dd7d992

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0bfd94-5220-4eaa-b7f5-d28c6dd7d992
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c0bfd94-5220-4eaa-b7f5-d28c6dd7d992
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0b98d67-bd44-4c87-953a-caf4c5d8cc69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0b98d67-bd44-4c87-953a-caf4c5d8cc69
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0b98d67-bd44-4c87-953a-caf4c5d8cc69
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-212cf5e7-947b-45ea-a1e9-dfd0cc9118bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-212cf5e7-947b-45ea-a1e9-dfd0cc9118bc
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-212cf5e7-947b-45ea-a1e9-dfd0cc9118bc
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca9c7301-8832-4fa7-95a5-bfdbe705da1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca9c7301-8832-4fa7-95a5-bfdbe705da1a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca9c7301-8832-4fa7-95a5-bfdbe705da1a
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9ecafd9-3a0a-425d-965c-64f1f6daf3f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9ecafd9-3a0a-425d-965c-64f1f6daf3f1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9ecafd9-3a0a-425d-965c-64f1f6daf3f1
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-dacca42d-e883-44d5-b5b1-c6946d59efa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dacca42d-e883-44d5-b5b1-c6946d59efa9
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-dacca42d-e883-44d5-b5b1-c6946d59efa9
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-b3167c95-2616-4213-8ef7-242897e585e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3167c95-2616-4213-8ef7-242897e585e7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3167c95-2616-4213-8ef7-242897e585e7
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f12254f-ffb3-4d38-b9de-c2e5dd3b3c16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f12254f-ffb3-4d38-b9de-c2e5dd3b3c16
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f12254f-ffb3-4d38-b9de-c2e5dd3b3c16
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-1eae5701-04da-41e3-a29f-a07344fa247e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eae5701-04da-41e3-a29f-a07344fa247e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1eae5701-04da-41e3-a29f-a07344fa247e
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-da820e24-80ea-4868-be72-de4e22896786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da820e24-80ea-4868-be72-de4e22896786
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-da820e24-80ea-4868-be72-de4e22896786
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-08ec2356-0022-4a6f-bc86-65da2caab99b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08ec2356-0022-4a6f-bc86-65da2caab99b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-08ec2356-0022-4a6f-bc86-65da2caab99b
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0b58717-8256-46b2-b3db-9c9c1d23ead5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0b58717-8256-46b2-b3db-9c9c1d23ead5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0b58717-8256-46b2-b3db-9c9c1d23ead5
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5b65a77-db5a-4e4f-9ccf-1a974b1f3f93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b65a77-db5a-4e4f-9ccf-1a974b1f3f93
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5b65a77-db5a-4e4f-9ccf-1a974b1f3f93
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-851a0a10-8f1c-4067-b181-e8eddcd95adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-851a0a10-8f1c-4067-b181-e8eddcd95adb
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-851a0a10-8f1c-4067-b181-e8eddcd95adb
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9d96cb1-1337-454f-a3d7-438d2ea26a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9d96cb1-1337-454f-a3d7-438d2ea26a35
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9d96cb1-1337-454f-a3d7-438d2ea26a35
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-9680ea2b-ad9a-4fe8-80ff-9dc411417384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9680ea2b-ad9a-4fe8-80ff-9dc411417384
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9680ea2b-ad9a-4fe8-80ff-9dc411417384
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f9a0bc4-513b-4056-9672-b5d2b62c15fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f9a0bc4-513b-4056-9672-b5d2b62c15fe
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f9a0bc4-513b-4056-9672-b5d2b62c15fe
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-d68a075d-6961-4018-bc47-4cc5f874b69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68a075d-6961-4018-bc47-4cc5f874b69e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d68a075d-6961-4018-bc47-4cc5f874b69e
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-13e1ab5d-11d1-4515-8268-fc2ae0277614

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13e1ab5d-11d1-4515-8268-fc2ae0277614
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-13e1ab5d-11d1-4515-8268-fc2ae0277614
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a4804d2-7a1d-49e8-8048-bc6d2ee8237e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a4804d2-7a1d-49e8-8048-bc6d2ee8237e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a4804d2-7a1d-49e8-8048-bc6d2ee8237e
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-e24d73e6-e938-4daf-a85b-e5d810ea35fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e24d73e6-e938-4daf-a85b-e5d810ea35fc
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e24d73e6-e938-4daf-a85b-e5d810ea35fc
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-674a4927-c2d6-4e93-9d8d-9c68aae66f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-674a4927-c2d6-4e93-9d8d-9c68aae66f88
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-674a4927-c2d6-4e93-9d8d-9c68aae66f88
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc5a57e5-4bc6-4c58-acd4-31ad55f88105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5a57e5-4bc6-4c58-acd4-31ad55f88105
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc5a57e5-4bc6-4c58-acd4-31ad55f88105
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-68214a0a-21d4-4651-ad0a-6d5f2a192844

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68214a0a-21d4-4651-ad0a-6d5f2a192844
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-68214a0a-21d4-4651-ad0a-6d5f2a192844
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-139b53f3-bdd2-4f3a-a1ed-a8f378c37fa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-139b53f3-bdd2-4f3a-a1ed-a8f378c37fa9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-139b53f3-bdd2-4f3a-a1ed-a8f378c37fa9
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-6014596a-927d-48b6-ab64-020aa6dee23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6014596a-927d-48b6-ab64-020aa6dee23a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6014596a-927d-48b6-ab64-020aa6dee23a
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-aebd2f43-856c-4990-af62-b62e2fca1bfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aebd2f43-856c-4990-af62-b62e2fca1bfb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-aebd2f43-856c-4990-af62-b62e2fca1bfb
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-6545cf02-7152-444d-9857-8e9bf814abda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6545cf02-7152-444d-9857-8e9bf814abda
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6545cf02-7152-444d-9857-8e9bf814abda
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-75c5ba20-9086-42ea-b888-0e48d86ee155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c5ba20-9086-42ea-b888-0e48d86ee155
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-75c5ba20-9086-42ea-b888-0e48d86ee155
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ad568df-c1b0-4ece-97bd-690e4ec47298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ad568df-c1b0-4ece-97bd-690e4ec47298
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ad568df-c1b0-4ece-97bd-690e4ec47298
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9ad568df-c1b0-4ece-97bd-690e4ec47298"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-05b1da9e-9150-4d71-94c1-37d60f09f786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b1da9e-9150-4d71-94c1-37d60f09f786
Content-Type: application/json

--- request body ---
{"handle":"qa-9304663b1180","password":"****"}

--- response: 429 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-05b1da9e-9150-4d71-94c1-37d60f09f786
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-05b1da9e-9150-4d71-94c1-37d60f09f786"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-90429185-91ec-46cd-92b1-0c550c7a0a1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90429185-91ec-46cd-92b1-0c550c7a0a1a
Content-Type: application/json

--- request body ---
{"handle":"qa-e4ce647f87ea","displayName":"QA e4ce647f87ea","password":"****","region":"eu"}

--- response: 429 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90429185-91ec-46cd-92b1-0c550c7a0a1a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-90429185-91ec-46cd-92b1-0c550c7a0a1a"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b1caafb-09f6-40ed-8bcc-ae9c0d6fdf62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b1caafb-09f6-40ed-8bcc-ae9c0d6fdf62
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b1caafb-09f6-40ed-8bcc-ae9c0d6fdf62
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3b1caafb-09f6-40ed-8bcc-ae9c0d6fdf62"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-67a5ac74-0ccf-4ea0-be36-4d43b5ea25f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a5ac74-0ccf-4ea0-be36-4d43b5ea25f2
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67a5ac74-0ccf-4ea0-be36-4d43b5ea25f2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-67a5ac74-0ccf-4ea0-be36-4d43b5ea25f2"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27754c3d-39db-400c-b85c-781b5808f51d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27754c3d-39db-400c-b85c-781b5808f51d
Content-Type: application/json

--- response: 429 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27754c3d-39db-400c-b85c-781b5808f51d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-27754c3d-39db-400c-b85c-781b5808f51d"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-9304663b1180
correlation: qa-bcfd0364-123e-44eb-8e0d-9fcf75ad8ecc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcfd0364-123e-44eb-8e0d-9fcf75ad8ecc
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcfd0364-123e-44eb-8e0d-9fcf75ad8ecc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-9304663b1180","correlationId":"qa-bcfd0364-123e-44eb-8e0d-9fcf75ad8ecc"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-a1dc3c15-38a4-4b71-aa93-48a35a2f7c03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1dc3c15-38a4-4b71-aa93-48a35a2f7c03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9304663b1180","subject":"Probe","message":"Hi"}

--- response: 429 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1dc3c15-38a4-4b71-aa93-48a35a2f7c03
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-a1dc3c15-38a4-4b71-aa93-48a35a2f7c03"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-21c2d962-ff9e-4c22-8180-4391d343e6e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c2d962-ff9e-4c22-8180-4391d343e6e3
Content-Type: application/json

--- response: 429 in 37 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21c2d962-ff9e-4c22-8180-4391d343e6e3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-21c2d962-ff9e-4c22-8180-4391d343e6e3"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984
correlation: qa-f473ba4b-032f-4722-ba68-eb799e806ced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f473ba4b-032f-4722-ba68-eb799e806ced
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f473ba4b-032f-4722-ba68-eb799e806ced
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984","correlationId":"qa-f473ba4b-032f-4722-ba68-eb799e806ced"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/messages
correlation: qa-85527b26-6eca-4680-ac74-f5163d8e7c28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85527b26-6eca-4680-ac74-f5163d8e7c28
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85527b26-6eca-4680-ac74-f5163d8e7c28
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/messages","correlationId":"qa-85527b26-6eca-4680-ac74-f5163d8e7c28"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/messages
correlation: qa-ba107b77-bd76-4aa8-bacd-bc0519d8e5df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba107b77-bd76-4aa8-bacd-bc0519d8e5df
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba107b77-bd76-4aa8-bacd-bc0519d8e5df
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/messages","correlationId":"qa-ba107b77-bd76-4aa8-bacd-bc0519d8e5df"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/read
correlation: qa-0dc28855-3914-49b7-9f3e-88007b00a0c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc28855-3914-49b7-9f3e-88007b00a0c1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dc28855-3914-49b7-9f3e-88007b00a0c1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/read","correlationId":"qa-0dc28855-3914-49b7-9f3e-88007b00a0c1"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/close
correlation: qa-92e3ca8e-4b2f-4628-9ab3-ecbe07d85105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e3ca8e-4b2f-4628-9ab3-ecbe07d85105
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92e3ca8e-4b2f-4628-9ab3-ecbe07d85105
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_3b3e5342-55f4-4fd3-9e3b-6bcd98950984/close","correlationId":"qa-92e3ca8e-4b2f-4628-9ab3-ecbe07d85105"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-78f009ef-dea5-48b2-8408-96ce48af3717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78f009ef-dea5-48b2-8408-96ce48af3717
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-78f009ef-dea5-48b2-8408-96ce48af3717
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-78f009ef-dea5-48b2-8408-96ce48af3717"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-51cc1ad0-11f7-4360-96ad-fbadbcd03ff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51cc1ad0-11f7-4360-96ad-fbadbcd03ff1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51cc1ad0-11f7-4360-96ad-fbadbcd03ff1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-51cc1ad0-11f7-4360-96ad-fbadbcd03ff1"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3943332a-ca3a-48cd-b238-2b6bbcc63d34

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3994bdd87202469bacaf48f54a0592e9
X-Correlation-Id: qa-3943332a-ca3a-48cd-b238-2b6bbcc63d34
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3943332a-ca3a-48cd-b238-2b6bbcc63d34
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-3943332a-ca3a-48cd-b238-2b6bbcc63d34"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-644ad37a-8eba-40b6-a1e5-08bc41f656e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-644ad37a-8eba-40b6-a1e5-08bc41f656e6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-644ad37a-8eba-40b6-a1e5-08bc41f656e6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-644ad37a-8eba-40b6-a1e5-08bc41f656e6"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-b37dab39-73a2-4c0d-8acc-117516f876d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b37dab39-73a2-4c0d-8acc-117516f876d0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b37dab39-73a2-4c0d-8acc-117516f876d0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b37dab39-73a2-4c0d-8acc-117516f876d0"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-c144503a-788d-4dd4-9de9-b1dc1fb809c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c144503a-788d-4dd4-9de9-b1dc1fb809c0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c144503a-788d-4dd4-9de9-b1dc1fb809c0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c144503a-788d-4dd4-9de9-b1dc1fb809c0"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-69f3b56b-8a65-4f07-bb28-09be1f99faef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69f3b56b-8a65-4f07-bb28-09be1f99faef
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69f3b56b-8a65-4f07-bb28-09be1f99faef
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-69f3b56b-8a65-4f07-bb28-09be1f99faef"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e4b53a6-eefc-4dd8-96ae-1a960a0b8c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4b53a6-eefc-4dd8-96ae-1a960a0b8c00
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4b53a6-eefc-4dd8-96ae-1a960a0b8c00
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6e4b53a6-eefc-4dd8-96ae-1a960a0b8c00"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-67f471d0-f136-4106-9091-219a75f04f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67f471d0-f136-4106-9091-219a75f04f59
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67f471d0-f136-4106-9091-219a75f04f59
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-67f471d0-f136-4106-9091-219a75f04f59"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf733a5f-1d7f-451b-8dc7-40acde9c1b4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf733a5f-1d7f-451b-8dc7-40acde9c1b4a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf733a5f-1d7f-451b-8dc7-40acde9c1b4a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bf733a5f-1d7f-451b-8dc7-40acde9c1b4a"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3c95e42-11ec-49f7-a460-a2fc5e99e3cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3c95e42-11ec-49f7-a460-a2fc5e99e3cb
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3c95e42-11ec-49f7-a460-a2fc5e99e3cb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f3c95e42-11ec-49f7-a460-a2fc5e99e3cb"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f7f476e-1351-404a-b0ce-8cdd34410ccd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7f476e-1351-404a-b0ce-8cdd34410ccd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f7f476e-1351-404a-b0ce-8cdd34410ccd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3f7f476e-1351-404a-b0ce-8cdd34410ccd"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-79daf22f-f4b3-4fe1-a1b3-90450b00e8ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79daf22f-f4b3-4fe1-a1b3-90450b00e8ef
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79daf22f-f4b3-4fe1-a1b3-90450b00e8ef
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-79daf22f-f4b3-4fe1-a1b3-90450b00e8ef"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-348e0f32-71cd-4109-af2b-c01f2ace9389

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-348e0f32-71cd-4109-af2b-c01f2ace9389
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-348e0f32-71cd-4109-af2b-c01f2ace9389
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-348e0f32-71cd-4109-af2b-c01f2ace9389"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-9120ab73-7122-44bb-8f6d-2e062ba10a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9120ab73-7122-44bb-8f6d-2e062ba10a99
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9120ab73-7122-44bb-8f6d-2e062ba10a99
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9120ab73-7122-44bb-8f6d-2e062ba10a99"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9210b0d-8d52-4543-a14f-da8a30005a78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9210b0d-8d52-4543-a14f-da8a30005a78
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9210b0d-8d52-4543-a14f-da8a30005a78
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c9210b0d-8d52-4543-a14f-da8a30005a78"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3fbd785-5885-46a4-a305-160c98ab3f3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3fbd785-5885-46a4-a305-160c98ab3f3b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3fbd785-5885-46a4-a305-160c98ab3f3b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f3fbd785-5885-46a4-a305-160c98ab3f3b"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-217ce63c-7563-4763-8105-6d5067688e75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217ce63c-7563-4763-8105-6d5067688e75
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-217ce63c-7563-4763-8105-6d5067688e75
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-217ce63c-7563-4763-8105-6d5067688e75"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f9da7bf-daa7-459c-9401-ec8f6f811e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f9da7bf-daa7-459c-9401-ec8f6f811e95
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f9da7bf-daa7-459c-9401-ec8f6f811e95
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

{"id":"acc_c5cf0727-f021-4ec9-b59a-58727b7e5d22","handle":"qa-9304663b1180","displayName":"QA 9304663b1180","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.513552739Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-161a310e-e7e1-4ec9-bec7-a09ec667c4a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-161a310e-e7e1-4ec9-bec7-a09ec667c4a2
Content-Type: application/json

--- request body ---
{"handle":"qa-9225d4456157","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-161a310e-e7e1-4ec9-bec7-a09ec667c4a2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f21253a-6c1d-4efb-a9d9-8a44861c8415"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64db0389-f4b5-48a6-ab90-959566fe45d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64db0389-f4b5-48a6-ab90-959566fe45d9
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64db0389-f4b5-48a6-ab90-959566fe45d9
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
correlation: qa-6b78d4d6-8e8e-4f84-805a-993be0971324

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b78d4d6-8e8e-4f84-805a-993be0971324
Content-Type: application/json

--- request body ---
{"handle":"qa-9225d4456157","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b78d4d6-8e8e-4f84-805a-993be0971324
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6b78d4d6-8e8e-4f84-805a-993be0971324"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d47a22bc-623c-4d9b-9f8f-e48353d2cac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d47a22bc-623c-4d9b-9f8f-e48353d2cac6
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d47a22bc-623c-4d9b-9f8f-e48353d2cac6
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
correlation: qa-85fab243-647d-4424-b337-f009e50c8a9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85fab243-647d-4424-b337-f009e50c8a9b
Content-Type: application/json

--- request body ---
{"handle":"qa-9304663b1180","password":"****"}

--- response: 401 in 2 ms ---
Date: Sat, 31 Oct 2026 08:31:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85fab243-647d-4424-b337-f009e50c8a9b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85fab243-647d-4424-b337-f009e50c8a9b"}
```
