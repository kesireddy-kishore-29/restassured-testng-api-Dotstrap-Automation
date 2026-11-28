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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-2b48e705-f625-4380-b134-fb654a16473c` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-d511e3fd-7c59-4dca-8bf2-712911f7f7a3` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-ed2dde5b-fafd-4ab8-963c-2f10ef48243f` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-5401c811-abfc-45d0-983a-7afa43a16226` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-aa445eca-9eab-4480-9862-76c046e7ebcf` |
| 6 | `GET /v1/accounts/me` | 200 | 18 | `qa-4c986c12-fd58-453c-b442-e5d8cbde1b9b` |
| 7 | `GET /v1/accounts/me` | 200 | 23 | `qa-1154ee41-7e42-460c-9684-50b4020b78bd` |
| 8 | `GET /v1/accounts/me` | 200 | 45 | `qa-a7b93b87-f20a-47a3-bf04-e27acc5d08ad` |
| 9 | `GET /v1/accounts/me` | 200 | 29 | `qa-653e2947-9244-4fc4-b0ba-fd3ab645ce0b` |
| 10 | `GET /v1/accounts/me` | 200 | 14 | `qa-1bc57ad1-b32d-40b9-99c4-25319bfea59c` |
| 11 | `GET /v1/accounts/me` | 200 | 16 | `qa-a0ae2c4f-ff33-481f-82e7-0c1474c3ec64` |
| 12 | `GET /v1/accounts/me` | 200 | 19 | `qa-8f0aad03-66c5-4674-8e72-e02a20314d10` |
| 13 | `GET /v1/accounts/me` | 200 | 28 | `qa-2d85f642-da85-4463-b8a1-6d4b77a9fac8` |
| 14 | `GET /v1/accounts/me` | 200 | 24 | `qa-44b937dc-f4ed-4cec-9965-8b3be836b6bf` |
| 15 | `GET /v1/accounts/me` | 200 | 20 | `qa-fb06eab1-28aa-4fde-8dd4-fe55f88ab6d7` |
| 16 | `GET /v1/accounts/me` | 200 | 31 | `qa-7ae0c763-f99c-4a76-acd9-ab568e75148d` |
| 17 | `GET /v1/accounts/me` | 200 | 16 | `qa-69e19e91-6876-4522-bacd-38c929a35347` |
| 18 | `GET /v1/accounts/me` | 200 | 20 | `qa-7b2608b5-6a41-4966-ac34-f9d09e9c349f` |
| 19 | `GET /v1/accounts/me` | 200 | 30 | `qa-e5449735-f588-47c2-a49b-d90d4e4589cb` |
| 20 | `GET /v1/accounts/me` | 200 | 40 | `qa-9849b1fb-1c1c-43e0-90b5-6fe7f2b117b5` |
| 21 | `GET /v1/accounts/me` | 200 | 18 | `qa-18cd5fc7-973d-4241-b05b-a4c6eecc8f08` |
| 22 | `GET /v1/accounts/me` | 200 | 17 | `qa-e0c9f3d3-b7ac-4e77-913f-85c319676fa2` |
| 23 | `GET /v1/accounts/me` | 200 | 21 | `qa-a0d20ad1-5bef-4241-9838-817ca6749a74` |
| 24 | `GET /v1/accounts/me` | 200 | 17 | `qa-11dfa7de-d550-4fbb-ae38-9c78de8652b0` |
| 25 | `GET /v1/accounts/me` | 200 | 14 | `qa-a38b16e3-9012-4dbb-9be5-4b50c0e2531a` |
| 26 | `GET /v1/accounts/me` | 200 | 23 | `qa-72182d03-9ef9-486e-b9ef-0eeacc05ced6` |
| 27 | `GET /v1/accounts/me` | 200 | 15 | `qa-3a92a81a-e978-400f-b250-4151ff30b658` |
| 28 | `GET /v1/accounts/me` | 200 | 26 | `qa-288c5fac-10f8-4fbd-babb-b2fe9d76cac8` |
| 29 | `GET /v1/accounts/me` | 200 | 12 | `qa-9bdf2204-3b7d-4d58-a503-3ddf640b0a9f` |
| 30 | `GET /v1/accounts/me` | 200 | 25 | `qa-1136e8ed-b982-48cb-8afa-1b9b043afeb7` |
| 31 | `GET /v1/accounts/me` | 200 | 48 | `qa-c3c001f5-29fb-4d02-80e1-a1c1411294fb` |
| 32 | `GET /v1/accounts/me` | 200 | 40 | `qa-65642dcf-9532-4260-9e72-9eb3b9b0f59a` |
| 33 | `GET /v1/accounts/me` | 200 | 21 | `qa-5da61adc-487c-4dc4-a06b-c11d3bc4b0b8` |
| 34 | `GET /v1/accounts/me` | 200 | 30 | `qa-f3b60e0f-98d4-4d42-9aae-4a7a0815bac4` |
| 35 | `GET /v1/accounts/me` | 200 | 29 | `qa-3bcd2444-d9cf-4074-aa09-8b3b43c9d856` |
| 36 | `GET /v1/accounts/me` | 200 | 13 | `qa-024b2e6b-5841-4345-81b6-17b67d757f6b` |
| 37 | `GET /v1/accounts/me` | 200 | 38 | `qa-33a3cbf1-0888-48a9-b9eb-2c5a343861d1` |
| 38 | `GET /v1/accounts/me` | 200 | 12 | `qa-f285fd95-3c03-4abe-a618-f5fc50f58fdc` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-ac90d5fc-ee0f-4eea-9bc3-ac7e37c1395d` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-f3b965fe-cf1d-4aff-82d8-1cc6a2b4d363` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-5ec551a3-1117-4da1-99d9-3638eb98f697` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-d2e635e5-8666-4706-b8e3-5304469129dc` |
| 43 | `GET /v1/accounts/me` | 200 | 11 | `qa-e2f07d75-336e-4bb7-8491-baabcd6fbf3a` |
| 44 | `GET /v1/accounts/me` | 200 | 14 | `qa-e476e43f-da7b-4eb4-85fb-d16b24b92efa` |
| 45 | `GET /v1/accounts/me` | 200 | 13 | `qa-3e06a07e-8520-4a05-8ef4-6094b4c84dae` |
| 46 | `GET /v1/accounts/me` | 200 | 21 | `qa-8c0a1973-c9fa-404e-af04-cc2e865409ea` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-6b927dca-60ff-4dd0-bc6b-b7e1d2597d06` |
| 48 | `GET /v1/accounts/me` | 200 | 16 | `qa-187d32d6-451f-4549-adaa-440e8f576560` |
| 49 | `GET /v1/accounts/me` | 200 | 13 | `qa-ca864056-b987-450a-823b-fc594aa45819` |
| 50 | `GET /v1/accounts/me` | 200 | 12 | `qa-37d2378c-ca11-457b-a2c0-2b7a6617ca20` |
| 51 | `GET /v1/accounts/me` | 200 | 9 | `qa-d41e27b7-67b5-45f9-956f-6f881f854ad6` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-22b0ceed-df14-4214-8d0b-7a912fb0de24` |
| 53 | `GET /v1/accounts/me` | 200 | 12 | `qa-2e5b9644-042b-4c86-88a4-9fad50f95f3e` |
| 54 | `GET /v1/accounts/me` | 200 | 18 | `qa-e77f5e01-1962-4a4d-95b5-c035d22fe7c9` |
| 55 | `GET /v1/accounts/me` | 200 | 15 | `qa-0873c4dd-5a1e-416a-9d54-2f25b617c41a` |
| 56 | `GET /v1/accounts/me` | 200 | 13 | `qa-0d7d69c4-3898-41b1-b697-719d99391f10` |
| 57 | `GET /v1/accounts/me` | 200 | 11 | `qa-35e9a14a-7244-4d8c-bfd7-8bcdfb333d98` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-b1364e18-de11-4b00-bac8-0ccffc885162` |
| 59 | `GET /v1/accounts/me` | 200 | 15 | `qa-764c2464-d774-4842-aba4-254b60a238c9` |
| 60 | `GET /v1/accounts/me` | 200 | 12 | `qa-c341c8d5-9150-4a30-b071-fcba2158def2` |
| 61 | `GET /v1/accounts/me` | 200 | 12 | `qa-3bfe96ad-d3bf-4890-93c8-b9ddb30bf26d` |
| 62 | `GET /v1/accounts/me` | 200 | 11 | `qa-9a645ff8-5291-414d-94cc-57c39040d613` |
| 63 | `GET /v1/accounts/me` | 200 | 17 | `qa-620dda6e-2fa0-427a-93ef-aa0ff8016bbb` |
| 64 | `GET /v1/accounts/me` | 429 | 12 | `qa-214b51f4-af94-4fed-9372-3f0dfd3e038a` |
| 65 | `POST /v1/auth/token` | 429 | 14 | `qa-32aa6b4f-30ab-4974-a06e-e4fc925d4be7` |
| 66 | `POST /v1/accounts` | 429 | 8 | `qa-3b2302e0-cee1-4899-a66f-871f72b915c3` |
| 67 | `GET /v1/accounts/me` | 429 | 10 | `qa-2b291a24-1c74-4767-83ee-da5a10059c7e` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-c2794d01-c2f8-4af9-a523-a6fd92d06ac2` |
| 69 | `DELETE /v1/accounts/me` | 429 | 5 | `qa-8bc426ce-3a58-4905-b7b5-bbe6a65e5c5e` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-f2c9a42a-42a1-41f0-a35d-674c4fd4b348` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-20b7d681-36f7-440d-9894-ba00f30d81e5` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-106ba728-061f-46fd-a8af-8f915e7a48f7` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-a8df5980-8149-4bfa-be3c-f0009c792df6` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-cee01819-fb25-414a-846c-17e3831e4ae9` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-b068163f-6a07-4f5a-8be7-9883c78eaa1c` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-493fdaf4-aa49-44c2-89e7-1bc1dabdbc12` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-5eeaeb64-1deb-4dd8-9f76-4deaeef6767d` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-88524043-16e7-471f-a3e0-20184feb8007` |
| 79 | `GET /v1/credits/ledger` | 429 | 7 | `qa-c9a83e4b-5eb6-4606-80fd-90232130088b` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-fccf40f3-e257-4b07-b189-5ddf98486b93` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-a4914cd9-f6ff-4779-8498-5e6896702572` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-53703f23-c5bb-496c-a722-4821b74a7a2b` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-2b31299e-b1b9-4efc-9c6d-c783bbd56053` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-479b3517-a436-4eed-81de-661c851e45e0` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-57810778-93d3-4c5b-8d8d-63195b8c293e` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-b16a5f09-a47e-4cd7-bbdc-66f28d746986` |
| 87 | `GET /v1/accounts/me` | 429 | 4 | `qa-2ec372bc-cb44-40df-8754-68b23a52f8fb` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-cec2d621-a847-474e-ac35-ee4cf20c761c` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-d23839c1-37af-419a-8e92-bbc092d64f8d` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-a9e61298-f634-43c6-a6f6-244e4a89ba76` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-9f38f61e-0642-4c3e-8411-4de4930d48f6` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-0a370076-e28b-4755-b107-6b679032ec25` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-a5163bc2-b4ca-42ae-ba34-99b9ba1c2359` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-2c7b5dd9-fdd1-46f3-99ec-e52e80f34b76` |
| 95 | `GET /v1/accounts/me` | 429 | 5 | `qa-df777798-8aeb-417c-8381-d0998ebb6cc5` |
| 96 | `GET /v1/accounts/me` | 200 | 4 | `qa-bd213af1-a234-425f-ab4a-1f481f540d8a` |
| 97 | `POST /v1/auth/token` | 200 | 14 | `qa-c96ee6ea-f6ab-4796-9f98-3efd6002affd` |
| 98 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d6f19f8a-3308-45f3-9c7a-40d66bf1488a` |
| 99 | `POST /v1/auth/token` | 401 | 9 | `qa-f94a3c70-8b34-4712-8179-a98fc2977cb1` |
| 100 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ba2e8b7b-2ce2-4312-85d5-99b65ab2a3b4` |
| 101 | `POST /v1/auth/token` | 401 | 5 | `qa-2ba0f410-f70f-46b7-99a8-3bdb2a0e433e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2b48e705-f625-4380-b134-fb654a16473c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b48e705-f625-4380-b134-fb654a16473c
Content-Type: application/json

--- request body ---
{"handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b48e705-f625-4380-b134-fb654a16473c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Location: /v1/accounts/qa-52cc8344d509
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d511e3fd-7c59-4dca-8bf2-712911f7f7a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d511e3fd-7c59-4dca-8bf2-712911f7f7a3
Content-Type: application/json

--- request body ---
{"handle":"qa-fabacc48368a","displayName":"QA fabacc48368a","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d511e3fd-7c59-4dca-8bf2-712911f7f7a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Location: /v1/accounts/qa-fabacc48368a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d23824a-f6da-4986-8cc7-e5afde903c82","handle":"qa-fabacc48368a","displayName":"QA fabacc48368a","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.171008480Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed2dde5b-fafd-4ab8-963c-2f10ef48243f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2dde5b-fafd-4ab8-963c-2f10ef48243f
Content-Type: application/json

--- request body ---
{"handle":"qa-52cc8344d509","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed2dde5b-fafd-4ab8-963c-2f10ef48243f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4196cc81-717f-4458-ae19-7487831a7f4e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5401c811-abfc-45d0-983a-7afa43a16226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5401c811-abfc-45d0-983a-7afa43a16226
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fabacc48368a","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-5401c811-abfc-45d0-983a-7afa43a16226
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
Location: /v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692","subject":"Error contract","status":"open","region":"eu","participants":["qa-52cc8344d509","qa-fabacc48368a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.307958961Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa445eca-9eab-4480-9862-76c046e7ebcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa445eca-9eab-4480-9862-76c046e7ebcf
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa445eca-9eab-4480-9862-76c046e7ebcf
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c986c12-fd58-453c-b442-e5d8cbde1b9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c986c12-fd58-453c-b442-e5d8cbde1b9b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c986c12-fd58-453c-b442-e5d8cbde1b9b
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-1154ee41-7e42-460c-9684-50b4020b78bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1154ee41-7e42-460c-9684-50b4020b78bd
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1154ee41-7e42-460c-9684-50b4020b78bd
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7b93b87-f20a-47a3-bf04-e27acc5d08ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b93b87-f20a-47a3-bf04-e27acc5d08ad
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7b93b87-f20a-47a3-bf04-e27acc5d08ad
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-653e2947-9244-4fc4-b0ba-fd3ab645ce0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-653e2947-9244-4fc4-b0ba-fd3ab645ce0b
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-653e2947-9244-4fc4-b0ba-fd3ab645ce0b
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bc57ad1-b32d-40b9-99c4-25319bfea59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bc57ad1-b32d-40b9-99c4-25319bfea59c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bc57ad1-b32d-40b9-99c4-25319bfea59c
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0ae2c4f-ff33-481f-82e7-0c1474c3ec64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0ae2c4f-ff33-481f-82e7-0c1474c3ec64
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0ae2c4f-ff33-481f-82e7-0c1474c3ec64
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f0aad03-66c5-4674-8e72-e02a20314d10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f0aad03-66c5-4674-8e72-e02a20314d10
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f0aad03-66c5-4674-8e72-e02a20314d10
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d85f642-da85-4463-b8a1-6d4b77a9fac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d85f642-da85-4463-b8a1-6d4b77a9fac8
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d85f642-da85-4463-b8a1-6d4b77a9fac8
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-44b937dc-f4ed-4cec-9965-8b3be836b6bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44b937dc-f4ed-4cec-9965-8b3be836b6bf
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-44b937dc-f4ed-4cec-9965-8b3be836b6bf
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb06eab1-28aa-4fde-8dd4-fe55f88ab6d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb06eab1-28aa-4fde-8dd4-fe55f88ab6d7
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb06eab1-28aa-4fde-8dd4-fe55f88ab6d7
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ae0c763-f99c-4a76-acd9-ab568e75148d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ae0c763-f99c-4a76-acd9-ab568e75148d
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ae0c763-f99c-4a76-acd9-ab568e75148d
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-69e19e91-6876-4522-bacd-38c929a35347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69e19e91-6876-4522-bacd-38c929a35347
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-69e19e91-6876-4522-bacd-38c929a35347
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b2608b5-6a41-4966-ac34-f9d09e9c349f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b2608b5-6a41-4966-ac34-f9d09e9c349f
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b2608b5-6a41-4966-ac34-f9d09e9c349f
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5449735-f588-47c2-a49b-d90d4e4589cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5449735-f588-47c2-a49b-d90d4e4589cb
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5449735-f588-47c2-a49b-d90d4e4589cb
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-9849b1fb-1c1c-43e0-90b5-6fe7f2b117b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9849b1fb-1c1c-43e0-90b5-6fe7f2b117b5
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9849b1fb-1c1c-43e0-90b5-6fe7f2b117b5
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-18cd5fc7-973d-4241-b05b-a4c6eecc8f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18cd5fc7-973d-4241-b05b-a4c6eecc8f08
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-18cd5fc7-973d-4241-b05b-a4c6eecc8f08
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0c9f3d3-b7ac-4e77-913f-85c319676fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0c9f3d3-b7ac-4e77-913f-85c319676fa2
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0c9f3d3-b7ac-4e77-913f-85c319676fa2
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0d20ad1-5bef-4241-9838-817ca6749a74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d20ad1-5bef-4241-9838-817ca6749a74
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0d20ad1-5bef-4241-9838-817ca6749a74
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-11dfa7de-d550-4fbb-ae38-9c78de8652b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11dfa7de-d550-4fbb-ae38-9c78de8652b0
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-11dfa7de-d550-4fbb-ae38-9c78de8652b0
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-a38b16e3-9012-4dbb-9be5-4b50c0e2531a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a38b16e3-9012-4dbb-9be5-4b50c0e2531a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a38b16e3-9012-4dbb-9be5-4b50c0e2531a
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-72182d03-9ef9-486e-b9ef-0eeacc05ced6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72182d03-9ef9-486e-b9ef-0eeacc05ced6
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-72182d03-9ef9-486e-b9ef-0eeacc05ced6
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a92a81a-e978-400f-b250-4151ff30b658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a92a81a-e978-400f-b250-4151ff30b658
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a92a81a-e978-400f-b250-4151ff30b658
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-288c5fac-10f8-4fbd-babb-b2fe9d76cac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-288c5fac-10f8-4fbd-babb-b2fe9d76cac8
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-288c5fac-10f8-4fbd-babb-b2fe9d76cac8
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-9bdf2204-3b7d-4d58-a503-3ddf640b0a9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bdf2204-3b7d-4d58-a503-3ddf640b0a9f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bdf2204-3b7d-4d58-a503-3ddf640b0a9f
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-1136e8ed-b982-48cb-8afa-1b9b043afeb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1136e8ed-b982-48cb-8afa-1b9b043afeb7
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-1136e8ed-b982-48cb-8afa-1b9b043afeb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3c001f5-29fb-4d02-80e1-a1c1411294fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3c001f5-29fb-4d02-80e1-a1c1411294fb
Content-Type: application/json

--- response: 200 in 48 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3c001f5-29fb-4d02-80e1-a1c1411294fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-65642dcf-9532-4260-9e72-9eb3b9b0f59a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65642dcf-9532-4260-9e72-9eb3b9b0f59a
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-65642dcf-9532-4260-9e72-9eb3b9b0f59a
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-5da61adc-487c-4dc4-a06b-c11d3bc4b0b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da61adc-487c-4dc4-a06b-c11d3bc4b0b8
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da61adc-487c-4dc4-a06b-c11d3bc4b0b8
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3b60e0f-98d4-4d42-9aae-4a7a0815bac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3b60e0f-98d4-4d42-9aae-4a7a0815bac4
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3b60e0f-98d4-4d42-9aae-4a7a0815bac4
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-3bcd2444-d9cf-4074-aa09-8b3b43c9d856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bcd2444-d9cf-4074-aa09-8b3b43c9d856
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bcd2444-d9cf-4074-aa09-8b3b43c9d856
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-024b2e6b-5841-4345-81b6-17b67d757f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-024b2e6b-5841-4345-81b6-17b67d757f6b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-024b2e6b-5841-4345-81b6-17b67d757f6b
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-33a3cbf1-0888-48a9-b9eb-2c5a343861d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a3cbf1-0888-48a9-b9eb-2c5a343861d1
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-33a3cbf1-0888-48a9-b9eb-2c5a343861d1
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-f285fd95-3c03-4abe-a618-f5fc50f58fdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f285fd95-3c03-4abe-a618-f5fc50f58fdc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f285fd95-3c03-4abe-a618-f5fc50f58fdc
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac90d5fc-ee0f-4eea-9bc3-ac7e37c1395d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac90d5fc-ee0f-4eea-9bc3-ac7e37c1395d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac90d5fc-ee0f-4eea-9bc3-ac7e37c1395d
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3b965fe-cf1d-4aff-82d8-1cc6a2b4d363

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3b965fe-cf1d-4aff-82d8-1cc6a2b4d363
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3b965fe-cf1d-4aff-82d8-1cc6a2b4d363
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ec551a3-1117-4da1-99d9-3638eb98f697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ec551a3-1117-4da1-99d9-3638eb98f697
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ec551a3-1117-4da1-99d9-3638eb98f697
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2e635e5-8666-4706-b8e3-5304469129dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2e635e5-8666-4706-b8e3-5304469129dc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2e635e5-8666-4706-b8e3-5304469129dc
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2f07d75-336e-4bb7-8491-baabcd6fbf3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2f07d75-336e-4bb7-8491-baabcd6fbf3a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2f07d75-336e-4bb7-8491-baabcd6fbf3a
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-e476e43f-da7b-4eb4-85fb-d16b24b92efa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e476e43f-da7b-4eb4-85fb-d16b24b92efa
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e476e43f-da7b-4eb4-85fb-d16b24b92efa
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e06a07e-8520-4a05-8ef4-6094b4c84dae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e06a07e-8520-4a05-8ef4-6094b4c84dae
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e06a07e-8520-4a05-8ef4-6094b4c84dae
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c0a1973-c9fa-404e-af04-cc2e865409ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c0a1973-c9fa-404e-af04-cc2e865409ea
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c0a1973-c9fa-404e-af04-cc2e865409ea
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b927dca-60ff-4dd0-bc6b-b7e1d2597d06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b927dca-60ff-4dd0-bc6b-b7e1d2597d06
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b927dca-60ff-4dd0-bc6b-b7e1d2597d06
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-187d32d6-451f-4549-adaa-440e8f576560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-187d32d6-451f-4549-adaa-440e8f576560
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-187d32d6-451f-4549-adaa-440e8f576560
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca864056-b987-450a-823b-fc594aa45819

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca864056-b987-450a-823b-fc594aa45819
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca864056-b987-450a-823b-fc594aa45819
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-37d2378c-ca11-457b-a2c0-2b7a6617ca20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d2378c-ca11-457b-a2c0-2b7a6617ca20
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-37d2378c-ca11-457b-a2c0-2b7a6617ca20
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-d41e27b7-67b5-45f9-956f-6f881f854ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d41e27b7-67b5-45f9-956f-6f881f854ad6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d41e27b7-67b5-45f9-956f-6f881f854ad6
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-22b0ceed-df14-4214-8d0b-7a912fb0de24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b0ceed-df14-4214-8d0b-7a912fb0de24
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-22b0ceed-df14-4214-8d0b-7a912fb0de24
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e5b9644-042b-4c86-88a4-9fad50f95f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e5b9644-042b-4c86-88a4-9fad50f95f3e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e5b9644-042b-4c86-88a4-9fad50f95f3e
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-e77f5e01-1962-4a4d-95b5-c035d22fe7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e77f5e01-1962-4a4d-95b5-c035d22fe7c9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e77f5e01-1962-4a4d-95b5-c035d22fe7c9
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-0873c4dd-5a1e-416a-9d54-2f25b617c41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0873c4dd-5a1e-416a-9d54-2f25b617c41a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0873c4dd-5a1e-416a-9d54-2f25b617c41a
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d7d69c4-3898-41b1-b697-719d99391f10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d7d69c4-3898-41b1-b697-719d99391f10
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d7d69c4-3898-41b1-b697-719d99391f10
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-35e9a14a-7244-4d8c-bfd7-8bcdfb333d98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e9a14a-7244-4d8c-bfd7-8bcdfb333d98
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-35e9a14a-7244-4d8c-bfd7-8bcdfb333d98
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1364e18-de11-4b00-bac8-0ccffc885162

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1364e18-de11-4b00-bac8-0ccffc885162
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1364e18-de11-4b00-bac8-0ccffc885162
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-764c2464-d774-4842-aba4-254b60a238c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-764c2464-d774-4842-aba4-254b60a238c9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-764c2464-d774-4842-aba4-254b60a238c9
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-c341c8d5-9150-4a30-b071-fcba2158def2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c341c8d5-9150-4a30-b071-fcba2158def2
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c341c8d5-9150-4a30-b071-fcba2158def2
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-3bfe96ad-d3bf-4890-93c8-b9ddb30bf26d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bfe96ad-d3bf-4890-93c8-b9ddb30bf26d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bfe96ad-d3bf-4890-93c8-b9ddb30bf26d
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a645ff8-5291-414d-94cc-57c39040d613

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a645ff8-5291-414d-94cc-57c39040d613
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a645ff8-5291-414d-94cc-57c39040d613
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-620dda6e-2fa0-427a-93ef-aa0ff8016bbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620dda6e-2fa0-427a-93ef-aa0ff8016bbb
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-620dda6e-2fa0-427a-93ef-aa0ff8016bbb
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-214b51f4-af94-4fed-9372-3f0dfd3e038a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-214b51f4-af94-4fed-9372-3f0dfd3e038a
Content-Type: application/json

--- response: 429 in 12 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-214b51f4-af94-4fed-9372-3f0dfd3e038a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-214b51f4-af94-4fed-9372-3f0dfd3e038a"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-32aa6b4f-30ab-4974-a06e-e4fc925d4be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32aa6b4f-30ab-4974-a06e-e4fc925d4be7
Content-Type: application/json

--- request body ---
{"handle":"qa-52cc8344d509","password":"****"}

--- response: 429 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32aa6b4f-30ab-4974-a06e-e4fc925d4be7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-32aa6b4f-30ab-4974-a06e-e4fc925d4be7"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-3b2302e0-cee1-4899-a66f-871f72b915c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b2302e0-cee1-4899-a66f-871f72b915c3
Content-Type: application/json

--- request body ---
{"handle":"qa-8315a4ca37a5","displayName":"QA 8315a4ca37a5","password":"****","region":"eu"}

--- response: 429 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b2302e0-cee1-4899-a66f-871f72b915c3
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
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts","correlationId":"qa-3b2302e0-cee1-4899-a66f-871f72b915c3"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b291a24-1c74-4767-83ee-da5a10059c7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b291a24-1c74-4767-83ee-da5a10059c7e
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b291a24-1c74-4767-83ee-da5a10059c7e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2b291a24-1c74-4767-83ee-da5a10059c7e"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c2794d01-c2f8-4af9-a523-a6fd92d06ac2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2794d01-c2f8-4af9-a523-a6fd92d06ac2
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2794d01-c2f8-4af9-a523-a6fd92d06ac2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c2794d01-c2f8-4af9-a523-a6fd92d06ac2"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8bc426ce-3a58-4905-b7b5-bbe6a65e5c5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bc426ce-3a58-4905-b7b5-bbe6a65e5c5e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bc426ce-3a58-4905-b7b5-bbe6a65e5c5e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8bc426ce-3a58-4905-b7b5-bbe6a65e5c5e"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-52cc8344d509
correlation: qa-f2c9a42a-42a1-41f0-a35d-674c4fd4b348

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c9a42a-42a1-41f0-a35d-674c4fd4b348
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2c9a42a-42a1-41f0-a35d-674c4fd4b348
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-52cc8344d509","correlationId":"qa-f2c9a42a-42a1-41f0-a35d-674c4fd4b348"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-20b7d681-36f7-440d-9894-ba00f30d81e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b7d681-36f7-440d-9894-ba00f30d81e5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-52cc8344d509","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20b7d681-36f7-440d-9894-ba00f30d81e5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-20b7d681-36f7-440d-9894-ba00f30d81e5"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-106ba728-061f-46fd-a8af-8f915e7a48f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-106ba728-061f-46fd-a8af-8f915e7a48f7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-106ba728-061f-46fd-a8af-8f915e7a48f7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-106ba728-061f-46fd-a8af-8f915e7a48f7"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692
correlation: qa-a8df5980-8149-4bfa-be3c-f0009c792df6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8df5980-8149-4bfa-be3c-f0009c792df6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8df5980-8149-4bfa-be3c-f0009c792df6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692","correlationId":"qa-a8df5980-8149-4bfa-be3c-f0009c792df6"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/messages
correlation: qa-cee01819-fb25-414a-846c-17e3831e4ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cee01819-fb25-414a-846c-17e3831e4ae9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cee01819-fb25-414a-846c-17e3831e4ae9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/messages","correlationId":"qa-cee01819-fb25-414a-846c-17e3831e4ae9"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/messages
correlation: qa-b068163f-6a07-4f5a-8be7-9883c78eaa1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b068163f-6a07-4f5a-8be7-9883c78eaa1c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b068163f-6a07-4f5a-8be7-9883c78eaa1c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/messages","correlationId":"qa-b068163f-6a07-4f5a-8be7-9883c78eaa1c"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/read
correlation: qa-493fdaf4-aa49-44c2-89e7-1bc1dabdbc12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-493fdaf4-aa49-44c2-89e7-1bc1dabdbc12
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-493fdaf4-aa49-44c2-89e7-1bc1dabdbc12
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/read","correlationId":"qa-493fdaf4-aa49-44c2-89e7-1bc1dabdbc12"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/close
correlation: qa-5eeaeb64-1deb-4dd8-9f76-4deaeef6767d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5eeaeb64-1deb-4dd8-9f76-4deaeef6767d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5eeaeb64-1deb-4dd8-9f76-4deaeef6767d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_16dc36d2-a0e5-4c7e-83b9-45599f87b692/close","correlationId":"qa-5eeaeb64-1deb-4dd8-9f76-4deaeef6767d"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-88524043-16e7-471f-a3e0-20184feb8007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88524043-16e7-471f-a3e0-20184feb8007
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88524043-16e7-471f-a3e0-20184feb8007
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-88524043-16e7-471f-a3e0-20184feb8007"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c9a83e4b-5eb6-4606-80fd-90232130088b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9a83e4b-5eb6-4606-80fd-90232130088b
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9a83e4b-5eb6-4606-80fd-90232130088b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-c9a83e4b-5eb6-4606-80fd-90232130088b"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fccf40f3-e257-4b07-b189-5ddf98486b93

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fdc36e208a154466aeccd810347526d5
X-Correlation-Id: qa-fccf40f3-e257-4b07-b189-5ddf98486b93
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fccf40f3-e257-4b07-b189-5ddf98486b93
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-fccf40f3-e257-4b07-b189-5ddf98486b93"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-a4914cd9-f6ff-4779-8498-5e6896702572

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4914cd9-f6ff-4779-8498-5e6896702572
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4914cd9-f6ff-4779-8498-5e6896702572
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-a4914cd9-f6ff-4779-8498-5e6896702572"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-53703f23-c5bb-496c-a722-4821b74a7a2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53703f23-c5bb-496c-a722-4821b74a7a2b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53703f23-c5bb-496c-a722-4821b74a7a2b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-53703f23-c5bb-496c-a722-4821b74a7a2b"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b31299e-b1b9-4efc-9c6d-c783bbd56053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b31299e-b1b9-4efc-9c6d-c783bbd56053
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b31299e-b1b9-4efc-9c6d-c783bbd56053
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2b31299e-b1b9-4efc-9c6d-c783bbd56053"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-479b3517-a436-4eed-81de-661c851e45e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479b3517-a436-4eed-81de-661c851e45e0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-479b3517-a436-4eed-81de-661c851e45e0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-479b3517-a436-4eed-81de-661c851e45e0"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-57810778-93d3-4c5b-8d8d-63195b8c293e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57810778-93d3-4c5b-8d8d-63195b8c293e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57810778-93d3-4c5b-8d8d-63195b8c293e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-57810778-93d3-4c5b-8d8d-63195b8c293e"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-b16a5f09-a47e-4cd7-bbdc-66f28d746986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16a5f09-a47e-4cd7-bbdc-66f28d746986
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b16a5f09-a47e-4cd7-bbdc-66f28d746986
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b16a5f09-a47e-4cd7-bbdc-66f28d746986"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-2ec372bc-cb44-40df-8754-68b23a52f8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ec372bc-cb44-40df-8754-68b23a52f8fb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ec372bc-cb44-40df-8754-68b23a52f8fb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2ec372bc-cb44-40df-8754-68b23a52f8fb"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-cec2d621-a847-474e-ac35-ee4cf20c761c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cec2d621-a847-474e-ac35-ee4cf20c761c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cec2d621-a847-474e-ac35-ee4cf20c761c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cec2d621-a847-474e-ac35-ee4cf20c761c"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-d23839c1-37af-419a-8e92-bbc092d64f8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d23839c1-37af-419a-8e92-bbc092d64f8d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d23839c1-37af-419a-8e92-bbc092d64f8d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d23839c1-37af-419a-8e92-bbc092d64f8d"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9e61298-f634-43c6-a6f6-244e4a89ba76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9e61298-f634-43c6-a6f6-244e4a89ba76
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9e61298-f634-43c6-a6f6-244e4a89ba76
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a9e61298-f634-43c6-a6f6-244e4a89ba76"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f38f61e-0642-4c3e-8411-4de4930d48f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f38f61e-0642-4c3e-8411-4de4930d48f6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f38f61e-0642-4c3e-8411-4de4930d48f6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9f38f61e-0642-4c3e-8411-4de4930d48f6"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a370076-e28b-4755-b107-6b679032ec25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a370076-e28b-4755-b107-6b679032ec25
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a370076-e28b-4755-b107-6b679032ec25
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0a370076-e28b-4755-b107-6b679032ec25"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5163bc2-b4ca-42ae-ba34-99b9ba1c2359

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5163bc2-b4ca-42ae-ba34-99b9ba1c2359
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5163bc2-b4ca-42ae-ba34-99b9ba1c2359
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a5163bc2-b4ca-42ae-ba34-99b9ba1c2359"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c7b5dd9-fdd1-46f3-99ec-e52e80f34b76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c7b5dd9-fdd1-46f3-99ec-e52e80f34b76
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c7b5dd9-fdd1-46f3-99ec-e52e80f34b76
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2c7b5dd9-fdd1-46f3-99ec-e52e80f34b76"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-df777798-8aeb-417c-8381-d0998ebb6cc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df777798-8aeb-417c-8381-d0998ebb6cc5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df777798-8aeb-417c-8381-d0998ebb6cc5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-df777798-8aeb-417c-8381-d0998ebb6cc5"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd213af1-a234-425f-ab4a-1f481f540d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd213af1-a234-425f-ab4a-1f481f540d8a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd213af1-a234-425f-ab4a-1f481f540d8a
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

{"id":"acc_4196cc81-717f-4458-ae19-7487831a7f4e","handle":"qa-52cc8344d509","displayName":"QA 52cc8344d509","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.106153128Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-c96ee6ea-f6ab-4796-9f98-3efd6002affd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c96ee6ea-f6ab-4796-9f98-3efd6002affd
Content-Type: application/json

--- request body ---
{"handle":"qa-fabacc48368a","password":"****"}

--- response: 200 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-c96ee6ea-f6ab-4796-9f98-3efd6002affd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d23824a-f6da-4986-8cc7-e5afde903c82"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d6f19f8a-3308-45f3-9c7a-40d66bf1488a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6f19f8a-3308-45f3-9c7a-40d66bf1488a
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d6f19f8a-3308-45f3-9c7a-40d66bf1488a
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
correlation: qa-f94a3c70-8b34-4712-8179-a98fc2977cb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94a3c70-8b34-4712-8179-a98fc2977cb1
Content-Type: application/json

--- request body ---
{"handle":"qa-fabacc48368a","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f94a3c70-8b34-4712-8179-a98fc2977cb1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f94a3c70-8b34-4712-8179-a98fc2977cb1"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba2e8b7b-2ce2-4312-85d5-99b65ab2a3b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba2e8b7b-2ce2-4312-85d5-99b65ab2a3b4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba2e8b7b-2ce2-4312-85d5-99b65ab2a3b4
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
correlation: qa-2ba0f410-f70f-46b7-99a8-3bdb2a0e433e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba0f410-f70f-46b7-99a8-3bdb2a0e433e
Content-Type: application/json

--- request body ---
{"handle":"qa-52cc8344d509","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ba0f410-f70f-46b7-99a8-3bdb2a0e433e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ba0f410-f70f-46b7-99a8-3bdb2a0e433e"}
```
