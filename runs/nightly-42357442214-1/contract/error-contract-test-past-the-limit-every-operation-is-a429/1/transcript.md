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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-9ff34e57-484a-4113-ad6f-1780c89878c1` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-9f7a7791-1f4b-47e0-a3fa-d00183e6c170` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-bbcaeff7-6614-469e-8ec6-5155eae87b45` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-bfa71cec-4c63-4b59-887d-42da99bfaf1c` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-9c2eae6d-4c87-4cbf-98fd-9bd6ff81f206` |
| 6 | `GET /v1/accounts/me` | 200 | 24 | `qa-03daa8e7-3b87-4e08-b76b-3b80c3d1d763` |
| 7 | `GET /v1/accounts/me` | 200 | 19 | `qa-9ee7b97d-cfb7-42f9-a7d5-cd5638bf5892` |
| 8 | `GET /v1/accounts/me` | 200 | 17 | `qa-e08a8125-af86-447e-a973-d28e5f1b1ec6` |
| 9 | `GET /v1/accounts/me` | 200 | 16 | `qa-0254ea63-b479-4ba9-921f-1eabecdadc7b` |
| 10 | `GET /v1/accounts/me` | 200 | 6 | `qa-65f9610e-9dac-495c-8fde-c1ebd4125c38` |
| 11 | `GET /v1/accounts/me` | 200 | 8 | `qa-14728ff3-fce6-4892-94cf-2409180496a8` |
| 12 | `GET /v1/accounts/me` | 200 | 19 | `qa-09f5bf51-2960-47f0-95d4-7fc10bbb5208` |
| 13 | `GET /v1/accounts/me` | 200 | 28 | `qa-e1a8dd46-d09c-43c2-821e-67fea06dec37` |
| 14 | `GET /v1/accounts/me` | 200 | 14 | `qa-2a021b16-76d6-4c3e-a3d0-604e277c7d4a` |
| 15 | `GET /v1/accounts/me` | 200 | 19 | `qa-13065adf-bd9a-4962-8566-69386495a8a0` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-0b2c815a-b61f-4f99-be31-e9e275817a50` |
| 17 | `GET /v1/accounts/me` | 200 | 19 | `qa-fe4a55cd-f3a4-4620-bf4a-19cd56b4e67f` |
| 18 | `GET /v1/accounts/me` | 200 | 14 | `qa-7b9802e2-8a16-4fc5-beb4-a2e90144b0fc` |
| 19 | `GET /v1/accounts/me` | 200 | 19 | `qa-cb82a9b3-fcc7-46f9-b077-b6372c56979c` |
| 20 | `GET /v1/accounts/me` | 200 | 18 | `qa-77c5b782-b9ad-4c82-9c3e-80afa3e3cfb0` |
| 21 | `GET /v1/accounts/me` | 200 | 9 | `qa-93ca231b-5c35-49ed-9f2e-bcd2fd0e1f94` |
| 22 | `GET /v1/accounts/me` | 200 | 24 | `qa-a36beabb-e929-4161-8585-de9ee0f158f8` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-02f64e18-4cfe-4322-9ce1-a28ea394be47` |
| 24 | `GET /v1/accounts/me` | 200 | 26 | `qa-a08e5ea5-6754-439d-8b8a-c510ad097fb3` |
| 25 | `GET /v1/accounts/me` | 200 | 33 | `qa-217e08cd-c843-4ac7-ab19-692fd6c92d88` |
| 26 | `GET /v1/accounts/me` | 200 | 22 | `qa-f862088a-6027-4c35-bea8-81651de7b644` |
| 27 | `GET /v1/accounts/me` | 200 | 21 | `qa-86ab01c4-d2c9-4217-b328-39c76055e4f5` |
| 28 | `GET /v1/accounts/me` | 200 | 15 | `qa-e0819c96-043d-4c55-b23c-f1727a0b1e03` |
| 29 | `GET /v1/accounts/me` | 200 | 19 | `qa-71b7353e-e0f7-44d9-8381-d42942ade3ad` |
| 30 | `GET /v1/accounts/me` | 200 | 38 | `qa-80887b72-f12c-4215-9826-0b407987553f` |
| 31 | `GET /v1/accounts/me` | 200 | 18 | `qa-dcd96a87-2c1d-49e5-86be-2d893180aa2f` |
| 32 | `GET /v1/accounts/me` | 200 | 29 | `qa-aedb9aa1-4f6f-4640-bad2-7e417547d5d9` |
| 33 | `GET /v1/accounts/me` | 200 | 23 | `qa-a7301820-abb6-4741-8458-d509eaf0e528` |
| 34 | `GET /v1/accounts/me` | 200 | 16 | `qa-e5be0e1c-46e6-4c16-a31d-29356f0e3341` |
| 35 | `GET /v1/accounts/me` | 200 | 5 | `qa-d5bcb0d2-4d16-4c11-bb9b-431a8c93683c` |
| 36 | `GET /v1/accounts/me` | 200 | 14 | `qa-dd7a7315-b969-474f-80b2-876f6b3c42c3` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-eddf0abb-16b9-4675-9dc5-959780316b57` |
| 38 | `GET /v1/accounts/me` | 200 | 12 | `qa-59f02a09-d920-4e31-a1c1-d61fb14d86b8` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-076d8cc2-4bd6-40c0-81b5-d4d048e27f17` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-8ee91741-f0da-49aa-a9ec-cf128ea69add` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-0c3ea087-bcc9-4d98-8701-4cdbaa900d0d` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-19799684-05a8-428d-aa83-18215d1448d4` |
| 43 | `GET /v1/accounts/me` | 200 | 6 | `qa-fc2082b4-1d1a-4d4e-a615-159463ad47d9` |
| 44 | `GET /v1/accounts/me` | 200 | 6 | `qa-7a9b9107-6cf5-4941-82d2-fe518acdb5b1` |
| 45 | `GET /v1/accounts/me` | 200 | 9 | `qa-6e50b5cd-ad19-43a8-a323-10c20e1dd055` |
| 46 | `GET /v1/accounts/me` | 200 | 3 | `qa-3cc92c02-3690-4237-bf35-0e3ee209483a` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-30662694-2dd3-4fe9-b17b-cc0bf62756a7` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-5f6c0d69-4e89-4dd9-b4e7-73f0a23c6384` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-0d6e341c-7f7f-4c85-baa6-5bc45acec090` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-6b72aa6c-8b39-4927-b665-9a8ec0232fc1` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-b7cb03db-3602-4c2b-a012-4a6469a6ec12` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-5f562efc-a438-45ca-bb79-b39b5591f869` |
| 53 | `GET /v1/accounts/me` | 200 | 12 | `qa-6f4c0a79-d5db-4f95-a751-510bc16328fa` |
| 54 | `GET /v1/accounts/me` | 200 | 7 | `qa-745f03b4-1d56-40fa-b6b6-ebd4995f189a` |
| 55 | `GET /v1/accounts/me` | 200 | 14 | `qa-570f84e2-7f52-4cbb-9fc3-474eeaec9a2c` |
| 56 | `GET /v1/accounts/me` | 200 | 11 | `qa-d689ae8d-a8c8-4aa9-9ea7-f3508bad4c06` |
| 57 | `GET /v1/accounts/me` | 200 | 11 | `qa-86bf159a-83bd-4263-86a3-f7191ab7aa6b` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-64149629-3340-4288-8b5b-02df5bde0fc4` |
| 59 | `GET /v1/accounts/me` | 200 | 10 | `qa-4dc669ee-c845-4af1-8054-58fd32f19c9b` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-abcb8701-2158-45d8-96b2-df7572eea7a7` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-34632ed1-aebc-4714-80c3-cd25831751a1` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-00f61694-f615-4ee4-a50c-b6eec8b2149d` |
| 63 | `GET /v1/accounts/me` | 200 | 5 | `qa-1b270b74-d36f-4f79-a831-85cb15738671` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-33c7925a-7dc2-4c76-a756-d22c1d6814fa` |
| 65 | `POST /v1/auth/token` | 429 | 4 | `qa-e70a99a3-c47e-4abf-841c-370ccc2d305f` |
| 66 | `POST /v1/accounts` | 429 | 5 | `qa-d00ea069-9aed-4ad2-8c97-1f28ee77d257` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-2b4d2e31-e5be-4902-8c45-afd60c0384e8` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-18453781-eea3-48f0-9448-5cd9fd3c2c3d` |
| 69 | `DELETE /v1/accounts/me` | 429 | 6 | `qa-de6f7f75-dda9-4c27-a40c-336ee967a0ea` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 8 | `qa-676fc1ed-b355-4a9b-969a-81db91870681` |
| 71 | `POST /v1/conversations` | 429 | 10 | `qa-01c80fd9-db9d-4e9d-b909-37d14024ef15` |
| 72 | `GET /v1/conversations` | 429 | 6 | `qa-892e39df-ba38-4b51-ac81-7bf30d64ee03` |
| 73 | `GET /v1/conversations/{id}` | 429 | 6 | `qa-cfc8a558-4714-486a-8e85-8ef6018c90c8` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-f2799b24-d937-41c2-91bf-872ec6398375` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-ce2a112b-5f1d-41b5-908a-d6abdbdaf8ce` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-54ca07a0-6aae-44eb-b3ac-ea17f23f2ac8` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-84fbd01a-13b5-4007-a6da-345369f40bfa` |
| 78 | `GET /v1/credits/balance` | 429 | 7 | `qa-60abd70c-2dad-41d5-9e49-c69b233b82ea` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-09859e4e-eac1-4614-b0e1-43280ec36ac7` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-fff72567-2f8b-418c-82fa-622e6133da1a` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-7732eafe-5e58-43cc-b8a8-c5497903de05` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-8b1633c9-b99b-48a5-9009-2ca7581ebee1` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-ffbd9a72-aa5e-46f5-a54a-0d65b555fa42` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-2fea0104-d0df-4e1a-afff-c359fbbac7f9` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-dc79d306-31a4-46e1-96f0-7aa2a02fff53` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-46a39505-8c7b-455f-aac4-662518566ed3` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-74be0b85-1a5f-4991-810a-c57f1e16c362` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-d993a81e-1f59-400a-b5ce-3d2097a740ed` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-7de384c2-fc67-4806-8aa8-6f40e93a0653` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-ec1a3895-1173-40a1-b511-7ebdcd900562` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-e9c1ad51-0507-440f-ae16-b9a10b3b7b2d` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-3bef1962-bb23-4dad-a8dd-01b98b2391be` |
| 93 | `GET /v1/accounts/me` | 429 | 8 | `qa-668f7a15-e723-4577-ba5a-2cdf64045c23` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-ab4ee37b-581d-4542-b6e6-985d30d1f3e1` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-6f2f1170-d3b6-4a45-95c2-ab052a9330d0` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-2027c1d4-f022-4ce6-b89b-440413f6febd` |
| 97 | `GET /v1/accounts/me` | 429 | 5 | `qa-3263c223-6a74-4f05-99ee-779245b48ee5` |
| 98 | `GET /v1/accounts/me` | 200 | 8 | `qa-47028ad5-2e46-42f0-851c-2fc6ce19aae8` |
| 99 | `POST /v1/auth/token` | 200 | 9 | `qa-90f64483-8707-49bb-add0-0e9b8464eace` |
| 100 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-b48278b2-f8f3-4519-895f-c81c7d7e225a` |
| 101 | `POST /v1/auth/token` | 401 | 5 | `qa-a4db3923-0317-4c37-9b67-d5538cf93a27` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-3ffaf17f-2f86-4cef-82e9-7ef920c13e89` |
| 103 | `POST /v1/auth/token` | 401 | 2 | `qa-6a5e530e-540e-4611-9086-b6856085c2e8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ff34e57-484a-4113-ad6f-1780c89878c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ff34e57-484a-4113-ad6f-1780c89878c1
Content-Type: application/json

--- request body ---
{"handle":"qa-6abce7271396","displayName":"QA 6abce7271396","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ff34e57-484a-4113-ad6f-1780c89878c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Location: /v1/accounts/qa-6abce7271396
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9f7a7791-1f4b-47e0-a3fa-d00183e6c170

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f7a7791-1f4b-47e0-a3fa-d00183e6c170
Content-Type: application/json

--- request body ---
{"handle":"qa-7341e00cd2a7","displayName":"QA 7341e00cd2a7","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f7a7791-1f4b-47e0-a3fa-d00183e6c170
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Location: /v1/accounts/qa-7341e00cd2a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_feef2a05-ea96-4adf-a20f-25e607588ba2","handle":"qa-7341e00cd2a7","displayName":"QA 7341e00cd2a7","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.818727336Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bbcaeff7-6614-469e-8ec6-5155eae87b45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbcaeff7-6614-469e-8ec6-5155eae87b45
Content-Type: application/json

--- request body ---
{"handle":"qa-6abce7271396","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbcaeff7-6614-469e-8ec6-5155eae87b45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bfa71cec-4c63-4b59-887d-42da99bfaf1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa71cec-4c63-4b59-887d-42da99bfaf1c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7341e00cd2a7","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa71cec-4c63-4b59-887d-42da99bfaf1c
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
Location: /v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c","subject":"Error contract","status":"open","region":"eu","participants":["qa-6abce7271396","qa-7341e00cd2a7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.868649110Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c2eae6d-4c87-4cbf-98fd-9bd6ff81f206

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2eae6d-4c87-4cbf-98fd-9bd6ff81f206
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c2eae6d-4c87-4cbf-98fd-9bd6ff81f206
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-03daa8e7-3b87-4e08-b76b-3b80c3d1d763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03daa8e7-3b87-4e08-b76b-3b80c3d1d763
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-03daa8e7-3b87-4e08-b76b-3b80c3d1d763
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ee7b97d-cfb7-42f9-a7d5-cd5638bf5892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee7b97d-cfb7-42f9-a7d5-cd5638bf5892
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ee7b97d-cfb7-42f9-a7d5-cd5638bf5892
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-e08a8125-af86-447e-a973-d28e5f1b1ec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e08a8125-af86-447e-a973-d28e5f1b1ec6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e08a8125-af86-447e-a973-d28e5f1b1ec6
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-0254ea63-b479-4ba9-921f-1eabecdadc7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0254ea63-b479-4ba9-921f-1eabecdadc7b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0254ea63-b479-4ba9-921f-1eabecdadc7b
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-65f9610e-9dac-495c-8fde-c1ebd4125c38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f9610e-9dac-495c-8fde-c1ebd4125c38
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-65f9610e-9dac-495c-8fde-c1ebd4125c38
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-14728ff3-fce6-4892-94cf-2409180496a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14728ff3-fce6-4892-94cf-2409180496a8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-14728ff3-fce6-4892-94cf-2409180496a8
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-09f5bf51-2960-47f0-95d4-7fc10bbb5208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f5bf51-2960-47f0-95d4-7fc10bbb5208
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f5bf51-2960-47f0-95d4-7fc10bbb5208
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1a8dd46-d09c-43c2-821e-67fea06dec37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1a8dd46-d09c-43c2-821e-67fea06dec37
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1a8dd46-d09c-43c2-821e-67fea06dec37
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a021b16-76d6-4c3e-a3d0-604e277c7d4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a021b16-76d6-4c3e-a3d0-604e277c7d4a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a021b16-76d6-4c3e-a3d0-604e277c7d4a
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-13065adf-bd9a-4962-8566-69386495a8a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13065adf-bd9a-4962-8566-69386495a8a0
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-13065adf-bd9a-4962-8566-69386495a8a0
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b2c815a-b61f-4f99-be31-e9e275817a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2c815a-b61f-4f99-be31-e9e275817a50
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b2c815a-b61f-4f99-be31-e9e275817a50
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe4a55cd-f3a4-4620-bf4a-19cd56b4e67f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe4a55cd-f3a4-4620-bf4a-19cd56b4e67f
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe4a55cd-f3a4-4620-bf4a-19cd56b4e67f
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b9802e2-8a16-4fc5-beb4-a2e90144b0fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b9802e2-8a16-4fc5-beb4-a2e90144b0fc
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b9802e2-8a16-4fc5-beb4-a2e90144b0fc
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb82a9b3-fcc7-46f9-b077-b6372c56979c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb82a9b3-fcc7-46f9-b077-b6372c56979c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb82a9b3-fcc7-46f9-b077-b6372c56979c
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-77c5b782-b9ad-4c82-9c3e-80afa3e3cfb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77c5b782-b9ad-4c82-9c3e-80afa3e3cfb0
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-77c5b782-b9ad-4c82-9c3e-80afa3e3cfb0
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-93ca231b-5c35-49ed-9f2e-bcd2fd0e1f94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93ca231b-5c35-49ed-9f2e-bcd2fd0e1f94
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-93ca231b-5c35-49ed-9f2e-bcd2fd0e1f94
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-a36beabb-e929-4161-8585-de9ee0f158f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36beabb-e929-4161-8585-de9ee0f158f8
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a36beabb-e929-4161-8585-de9ee0f158f8
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-02f64e18-4cfe-4322-9ce1-a28ea394be47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02f64e18-4cfe-4322-9ce1-a28ea394be47
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-02f64e18-4cfe-4322-9ce1-a28ea394be47
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-a08e5ea5-6754-439d-8b8a-c510ad097fb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a08e5ea5-6754-439d-8b8a-c510ad097fb3
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a08e5ea5-6754-439d-8b8a-c510ad097fb3
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-217e08cd-c843-4ac7-ab19-692fd6c92d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-217e08cd-c843-4ac7-ab19-692fd6c92d88
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-217e08cd-c843-4ac7-ab19-692fd6c92d88
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-f862088a-6027-4c35-bea8-81651de7b644

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f862088a-6027-4c35-bea8-81651de7b644
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f862088a-6027-4c35-bea8-81651de7b644
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-86ab01c4-d2c9-4217-b328-39c76055e4f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ab01c4-d2c9-4217-b328-39c76055e4f5
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-86ab01c4-d2c9-4217-b328-39c76055e4f5
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0819c96-043d-4c55-b23c-f1727a0b1e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0819c96-043d-4c55-b23c-f1727a0b1e03
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0819c96-043d-4c55-b23c-f1727a0b1e03
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-71b7353e-e0f7-44d9-8381-d42942ade3ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71b7353e-e0f7-44d9-8381-d42942ade3ad
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-71b7353e-e0f7-44d9-8381-d42942ade3ad
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-80887b72-f12c-4215-9826-0b407987553f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80887b72-f12c-4215-9826-0b407987553f
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-80887b72-f12c-4215-9826-0b407987553f
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcd96a87-2c1d-49e5-86be-2d893180aa2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcd96a87-2c1d-49e5-86be-2d893180aa2f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcd96a87-2c1d-49e5-86be-2d893180aa2f
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-aedb9aa1-4f6f-4640-bad2-7e417547d5d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aedb9aa1-4f6f-4640-bad2-7e417547d5d9
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-aedb9aa1-4f6f-4640-bad2-7e417547d5d9
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7301820-abb6-4741-8458-d509eaf0e528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7301820-abb6-4741-8458-d509eaf0e528
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7301820-abb6-4741-8458-d509eaf0e528
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5be0e1c-46e6-4c16-a31d-29356f0e3341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5be0e1c-46e6-4c16-a31d-29356f0e3341
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5be0e1c-46e6-4c16-a31d-29356f0e3341
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5bcb0d2-4d16-4c11-bb9b-431a8c93683c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5bcb0d2-4d16-4c11-bb9b-431a8c93683c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5bcb0d2-4d16-4c11-bb9b-431a8c93683c
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd7a7315-b969-474f-80b2-876f6b3c42c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd7a7315-b969-474f-80b2-876f6b3c42c3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd7a7315-b969-474f-80b2-876f6b3c42c3
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-eddf0abb-16b9-4675-9dc5-959780316b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eddf0abb-16b9-4675-9dc5-959780316b57
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-eddf0abb-16b9-4675-9dc5-959780316b57
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-59f02a09-d920-4e31-a1c1-d61fb14d86b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59f02a09-d920-4e31-a1c1-d61fb14d86b8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-59f02a09-d920-4e31-a1c1-d61fb14d86b8
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-076d8cc2-4bd6-40c0-81b5-d4d048e27f17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-076d8cc2-4bd6-40c0-81b5-d4d048e27f17
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-076d8cc2-4bd6-40c0-81b5-d4d048e27f17
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ee91741-f0da-49aa-a9ec-cf128ea69add

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ee91741-f0da-49aa-a9ec-cf128ea69add
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ee91741-f0da-49aa-a9ec-cf128ea69add
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c3ea087-bcc9-4d98-8701-4cdbaa900d0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c3ea087-bcc9-4d98-8701-4cdbaa900d0d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c3ea087-bcc9-4d98-8701-4cdbaa900d0d
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-19799684-05a8-428d-aa83-18215d1448d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19799684-05a8-428d-aa83-18215d1448d4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-19799684-05a8-428d-aa83-18215d1448d4
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc2082b4-1d1a-4d4e-a615-159463ad47d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc2082b4-1d1a-4d4e-a615-159463ad47d9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc2082b4-1d1a-4d4e-a615-159463ad47d9
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a9b9107-6cf5-4941-82d2-fe518acdb5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a9b9107-6cf5-4941-82d2-fe518acdb5b1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a9b9107-6cf5-4941-82d2-fe518acdb5b1
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e50b5cd-ad19-43a8-a323-10c20e1dd055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e50b5cd-ad19-43a8-a323-10c20e1dd055
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e50b5cd-ad19-43a8-a323-10c20e1dd055
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-3cc92c02-3690-4237-bf35-0e3ee209483a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cc92c02-3690-4237-bf35-0e3ee209483a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cc92c02-3690-4237-bf35-0e3ee209483a
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-30662694-2dd3-4fe9-b17b-cc0bf62756a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30662694-2dd3-4fe9-b17b-cc0bf62756a7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-30662694-2dd3-4fe9-b17b-cc0bf62756a7
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f6c0d69-4e89-4dd9-b4e7-73f0a23c6384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f6c0d69-4e89-4dd9-b4e7-73f0a23c6384
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f6c0d69-4e89-4dd9-b4e7-73f0a23c6384
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d6e341c-7f7f-4c85-baa6-5bc45acec090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d6e341c-7f7f-4c85-baa6-5bc45acec090
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d6e341c-7f7f-4c85-baa6-5bc45acec090
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b72aa6c-8b39-4927-b665-9a8ec0232fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b72aa6c-8b39-4927-b665-9a8ec0232fc1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b72aa6c-8b39-4927-b665-9a8ec0232fc1
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7cb03db-3602-4c2b-a012-4a6469a6ec12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7cb03db-3602-4c2b-a012-4a6469a6ec12
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7cb03db-3602-4c2b-a012-4a6469a6ec12
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f562efc-a438-45ca-bb79-b39b5591f869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f562efc-a438-45ca-bb79-b39b5591f869
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f562efc-a438-45ca-bb79-b39b5591f869
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f4c0a79-d5db-4f95-a751-510bc16328fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f4c0a79-d5db-4f95-a751-510bc16328fa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f4c0a79-d5db-4f95-a751-510bc16328fa
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-745f03b4-1d56-40fa-b6b6-ebd4995f189a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745f03b4-1d56-40fa-b6b6-ebd4995f189a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-745f03b4-1d56-40fa-b6b6-ebd4995f189a
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-570f84e2-7f52-4cbb-9fc3-474eeaec9a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-570f84e2-7f52-4cbb-9fc3-474eeaec9a2c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-570f84e2-7f52-4cbb-9fc3-474eeaec9a2c
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-d689ae8d-a8c8-4aa9-9ea7-f3508bad4c06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d689ae8d-a8c8-4aa9-9ea7-f3508bad4c06
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d689ae8d-a8c8-4aa9-9ea7-f3508bad4c06
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-86bf159a-83bd-4263-86a3-f7191ab7aa6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86bf159a-83bd-4263-86a3-f7191ab7aa6b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-86bf159a-83bd-4263-86a3-f7191ab7aa6b
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-64149629-3340-4288-8b5b-02df5bde0fc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64149629-3340-4288-8b5b-02df5bde0fc4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-64149629-3340-4288-8b5b-02df5bde0fc4
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-4dc669ee-c845-4af1-8054-58fd32f19c9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dc669ee-c845-4af1-8054-58fd32f19c9b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dc669ee-c845-4af1-8054-58fd32f19c9b
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-abcb8701-2158-45d8-96b2-df7572eea7a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abcb8701-2158-45d8-96b2-df7572eea7a7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-abcb8701-2158-45d8-96b2-df7572eea7a7
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-34632ed1-aebc-4714-80c3-cd25831751a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34632ed1-aebc-4714-80c3-cd25831751a1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-34632ed1-aebc-4714-80c3-cd25831751a1
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-00f61694-f615-4ee4-a50c-b6eec8b2149d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00f61694-f615-4ee4-a50c-b6eec8b2149d
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-00f61694-f615-4ee4-a50c-b6eec8b2149d
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b270b74-d36f-4f79-a831-85cb15738671

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b270b74-d36f-4f79-a831-85cb15738671
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b270b74-d36f-4f79-a831-85cb15738671
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-33c7925a-7dc2-4c76-a756-d22c1d6814fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c7925a-7dc2-4c76-a756-d22c1d6814fa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33c7925a-7dc2-4c76-a756-d22c1d6814fa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-33c7925a-7dc2-4c76-a756-d22c1d6814fa"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-e70a99a3-c47e-4abf-841c-370ccc2d305f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e70a99a3-c47e-4abf-841c-370ccc2d305f
Content-Type: application/json

--- request body ---
{"handle":"qa-6abce7271396","password":"****"}

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e70a99a3-c47e-4abf-841c-370ccc2d305f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-e70a99a3-c47e-4abf-841c-370ccc2d305f"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-d00ea069-9aed-4ad2-8c97-1f28ee77d257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d00ea069-9aed-4ad2-8c97-1f28ee77d257
Content-Type: application/json

--- request body ---
{"handle":"qa-bdf5cf908d14","displayName":"QA bdf5cf908d14","password":"****","region":"eu"}

--- response: 429 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d00ea069-9aed-4ad2-8c97-1f28ee77d257
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-d00ea069-9aed-4ad2-8c97-1f28ee77d257"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b4d2e31-e5be-4902-8c45-afd60c0384e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4d2e31-e5be-4902-8c45-afd60c0384e8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b4d2e31-e5be-4902-8c45-afd60c0384e8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2b4d2e31-e5be-4902-8c45-afd60c0384e8"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-18453781-eea3-48f0-9448-5cd9fd3c2c3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18453781-eea3-48f0-9448-5cd9fd3c2c3d
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18453781-eea3-48f0-9448-5cd9fd3c2c3d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-18453781-eea3-48f0-9448-5cd9fd3c2c3d"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de6f7f75-dda9-4c27-a40c-336ee967a0ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de6f7f75-dda9-4c27-a40c-336ee967a0ea
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de6f7f75-dda9-4c27-a40c-336ee967a0ea
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-de6f7f75-dda9-4c27-a40c-336ee967a0ea"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-6abce7271396
correlation: qa-676fc1ed-b355-4a9b-969a-81db91870681

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-676fc1ed-b355-4a9b-969a-81db91870681
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-676fc1ed-b355-4a9b-969a-81db91870681
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-6abce7271396","correlationId":"qa-676fc1ed-b355-4a9b-969a-81db91870681"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-01c80fd9-db9d-4e9d-b909-37d14024ef15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01c80fd9-db9d-4e9d-b909-37d14024ef15
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6abce7271396","subject":"Probe","message":"Hi"}

--- response: 429 in 10 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01c80fd9-db9d-4e9d-b909-37d14024ef15
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-01c80fd9-db9d-4e9d-b909-37d14024ef15"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-892e39df-ba38-4b51-ac81-7bf30d64ee03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-892e39df-ba38-4b51-ac81-7bf30d64ee03
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-892e39df-ba38-4b51-ac81-7bf30d64ee03
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-892e39df-ba38-4b51-ac81-7bf30d64ee03"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c
correlation: qa-cfc8a558-4714-486a-8e85-8ef6018c90c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc8a558-4714-486a-8e85-8ef6018c90c8
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfc8a558-4714-486a-8e85-8ef6018c90c8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c","correlationId":"qa-cfc8a558-4714-486a-8e85-8ef6018c90c8"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/messages
correlation: qa-f2799b24-d937-41c2-91bf-872ec6398375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2799b24-d937-41c2-91bf-872ec6398375
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2799b24-d937-41c2-91bf-872ec6398375
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/messages","correlationId":"qa-f2799b24-d937-41c2-91bf-872ec6398375"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/messages
correlation: qa-ce2a112b-5f1d-41b5-908a-d6abdbdaf8ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce2a112b-5f1d-41b5-908a-d6abdbdaf8ce
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce2a112b-5f1d-41b5-908a-d6abdbdaf8ce
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/messages","correlationId":"qa-ce2a112b-5f1d-41b5-908a-d6abdbdaf8ce"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/read
correlation: qa-54ca07a0-6aae-44eb-b3ac-ea17f23f2ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54ca07a0-6aae-44eb-b3ac-ea17f23f2ac8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54ca07a0-6aae-44eb-b3ac-ea17f23f2ac8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/read","correlationId":"qa-54ca07a0-6aae-44eb-b3ac-ea17f23f2ac8"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/close
correlation: qa-84fbd01a-13b5-4007-a6da-345369f40bfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84fbd01a-13b5-4007-a6da-345369f40bfa
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84fbd01a-13b5-4007-a6da-345369f40bfa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_1e33680d-3c48-4a3c-9b57-4b298b3fed5c/close","correlationId":"qa-84fbd01a-13b5-4007-a6da-345369f40bfa"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-60abd70c-2dad-41d5-9e49-c69b233b82ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60abd70c-2dad-41d5-9e49-c69b233b82ea
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60abd70c-2dad-41d5-9e49-c69b233b82ea
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-60abd70c-2dad-41d5-9e49-c69b233b82ea"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-09859e4e-eac1-4614-b0e1-43280ec36ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09859e4e-eac1-4614-b0e1-43280ec36ac7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09859e4e-eac1-4614-b0e1-43280ec36ac7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-09859e4e-eac1-4614-b0e1-43280ec36ac7"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fff72567-2f8b-418c-82fa-622e6133da1a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1669b80981d64953953fcb518e1f2350
X-Correlation-Id: qa-fff72567-2f8b-418c-82fa-622e6133da1a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fff72567-2f8b-418c-82fa-622e6133da1a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-fff72567-2f8b-418c-82fa-622e6133da1a"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-7732eafe-5e58-43cc-b8a8-c5497903de05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7732eafe-5e58-43cc-b8a8-c5497903de05
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7732eafe-5e58-43cc-b8a8-c5497903de05
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-7732eafe-5e58-43cc-b8a8-c5497903de05"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b1633c9-b99b-48a5-9009-2ca7581ebee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b1633c9-b99b-48a5-9009-2ca7581ebee1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b1633c9-b99b-48a5-9009-2ca7581ebee1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8b1633c9-b99b-48a5-9009-2ca7581ebee1"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffbd9a72-aa5e-46f5-a54a-0d65b555fa42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffbd9a72-aa5e-46f5-a54a-0d65b555fa42
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffbd9a72-aa5e-46f5-a54a-0d65b555fa42
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ffbd9a72-aa5e-46f5-a54a-0d65b555fa42"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fea0104-d0df-4e1a-afff-c359fbbac7f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fea0104-d0df-4e1a-afff-c359fbbac7f9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fea0104-d0df-4e1a-afff-c359fbbac7f9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2fea0104-d0df-4e1a-afff-c359fbbac7f9"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc79d306-31a4-46e1-96f0-7aa2a02fff53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc79d306-31a4-46e1-96f0-7aa2a02fff53
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc79d306-31a4-46e1-96f0-7aa2a02fff53
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dc79d306-31a4-46e1-96f0-7aa2a02fff53"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-46a39505-8c7b-455f-aac4-662518566ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46a39505-8c7b-455f-aac4-662518566ed3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46a39505-8c7b-455f-aac4-662518566ed3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-46a39505-8c7b-455f-aac4-662518566ed3"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-74be0b85-1a5f-4991-810a-c57f1e16c362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74be0b85-1a5f-4991-810a-c57f1e16c362
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74be0b85-1a5f-4991-810a-c57f1e16c362
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-74be0b85-1a5f-4991-810a-c57f1e16c362"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-d993a81e-1f59-400a-b5ce-3d2097a740ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d993a81e-1f59-400a-b5ce-3d2097a740ed
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d993a81e-1f59-400a-b5ce-3d2097a740ed
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d993a81e-1f59-400a-b5ce-3d2097a740ed"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-7de384c2-fc67-4806-8aa8-6f40e93a0653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7de384c2-fc67-4806-8aa8-6f40e93a0653
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7de384c2-fc67-4806-8aa8-6f40e93a0653
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7de384c2-fc67-4806-8aa8-6f40e93a0653"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec1a3895-1173-40a1-b511-7ebdcd900562

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec1a3895-1173-40a1-b511-7ebdcd900562
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec1a3895-1173-40a1-b511-7ebdcd900562
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ec1a3895-1173-40a1-b511-7ebdcd900562"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9c1ad51-0507-440f-ae16-b9a10b3b7b2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9c1ad51-0507-440f-ae16-b9a10b3b7b2d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9c1ad51-0507-440f-ae16-b9a10b3b7b2d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e9c1ad51-0507-440f-ae16-b9a10b3b7b2d"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-3bef1962-bb23-4dad-a8dd-01b98b2391be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bef1962-bb23-4dad-a8dd-01b98b2391be
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 07 Nov 2026 08:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bef1962-bb23-4dad-a8dd-01b98b2391be
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3bef1962-bb23-4dad-a8dd-01b98b2391be"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-668f7a15-e723-4577-ba5a-2cdf64045c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-668f7a15-e723-4577-ba5a-2cdf64045c23
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sat, 07 Nov 2026 08:55:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-668f7a15-e723-4577-ba5a-2cdf64045c23
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-668f7a15-e723-4577-ba5a-2cdf64045c23"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab4ee37b-581d-4542-b6e6-985d30d1f3e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab4ee37b-581d-4542-b6e6-985d30d1f3e1
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab4ee37b-581d-4542-b6e6-985d30d1f3e1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ab4ee37b-581d-4542-b6e6-985d30d1f3e1"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f2f1170-d3b6-4a45-95c2-ab052a9330d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f2f1170-d3b6-4a45-95c2-ab052a9330d0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f2f1170-d3b6-4a45-95c2-ab052a9330d0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6f2f1170-d3b6-4a45-95c2-ab052a9330d0"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-2027c1d4-f022-4ce6-b89b-440413f6febd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2027c1d4-f022-4ce6-b89b-440413f6febd
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2027c1d4-f022-4ce6-b89b-440413f6febd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2027c1d4-f022-4ce6-b89b-440413f6febd"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-3263c223-6a74-4f05-99ee-779245b48ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3263c223-6a74-4f05-99ee-779245b48ee5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3263c223-6a74-4f05-99ee-779245b48ee5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3263c223-6a74-4f05-99ee-779245b48ee5"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-47028ad5-2e46-42f0-851c-2fc6ce19aae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47028ad5-2e46-42f0-851c-2fc6ce19aae8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:55:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-47028ad5-2e46-42f0-851c-2fc6ce19aae8
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

{"id":"acc_0b68b162-9d45-4092-a49a-2eafb1e69ad3","handle":"qa-6abce7271396","displayName":"QA 6abce7271396","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.787100403Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-90f64483-8707-49bb-add0-0e9b8464eace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f64483-8707-49bb-add0-0e9b8464eace
Content-Type: application/json

--- request body ---
{"handle":"qa-7341e00cd2a7","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-90f64483-8707-49bb-add0-0e9b8464eace
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_feef2a05-ea96-4adf-a20f-25e607588ba2"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b48278b2-f8f3-4519-895f-c81c7d7e225a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b48278b2-f8f3-4519-895f-c81c7d7e225a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 07 Nov 2026 08:55:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b48278b2-f8f3-4519-895f-c81c7d7e225a
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
correlation: qa-a4db3923-0317-4c37-9b67-d5538cf93a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4db3923-0317-4c37-9b67-d5538cf93a27
Content-Type: application/json

--- request body ---
{"handle":"qa-7341e00cd2a7","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:55:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4db3923-0317-4c37-9b67-d5538cf93a27
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4db3923-0317-4c37-9b67-d5538cf93a27"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ffaf17f-2f86-4cef-82e9-7ef920c13e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ffaf17f-2f86-4cef-82e9-7ef920c13e89
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sat, 07 Nov 2026 08:55:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ffaf17f-2f86-4cef-82e9-7ef920c13e89
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
correlation: qa-6a5e530e-540e-4611-9086-b6856085c2e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5e530e-540e-4611-9086-b6856085c2e8
Content-Type: application/json

--- request body ---
{"handle":"qa-6abce7271396","password":"****"}

--- response: 401 in 2 ms ---
Date: Sat, 07 Nov 2026 08:55:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a5e530e-540e-4611-9086-b6856085c2e8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6a5e530e-540e-4611-9086-b6856085c2e8"}
```
