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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-5e8bbc06-5425-4efb-8241-8489c7486847` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-b359a6b9-0cb5-47bc-a666-79482ac84cec` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-9415ff54-6225-4fe8-8517-b33fb3603459` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-c5e1ee23-25ae-4cf4-a487-bbd36af3b728` |
| 5 | `GET /v1/accounts/me` | 200 | 29 | `qa-c475aa7f-dd24-423f-a0ae-1bbc41c25c7c` |
| 6 | `GET /v1/accounts/me` | 200 | 39 | `qa-af4a3883-bb98-44f7-9f2a-a24efdfcba67` |
| 7 | `GET /v1/accounts/me` | 200 | 22 | `qa-29ad5ec4-eebb-448b-8b23-4e8581459d37` |
| 8 | `GET /v1/accounts/me` | 200 | 24 | `qa-62a8ceda-c343-4994-bf85-111c766a4779` |
| 9 | `GET /v1/accounts/me` | 200 | 12 | `qa-f6ae223a-f35e-4f72-ab9e-ba33b1a915fa` |
| 10 | `GET /v1/accounts/me` | 200 | 10 | `qa-5db05c5d-7078-4aeb-a5e2-081dccd7e7e0` |
| 11 | `GET /v1/accounts/me` | 200 | 17 | `qa-98cb7123-3ef3-4cde-ab91-f5f7f23925bd` |
| 12 | `GET /v1/accounts/me` | 200 | 20 | `qa-d96a2661-8a71-4c31-8b74-0334ec95fa45` |
| 13 | `GET /v1/accounts/me` | 200 | 13 | `qa-fefad8c8-a02f-4e5f-9ea8-166888f8a5d3` |
| 14 | `GET /v1/accounts/me` | 200 | 15 | `qa-919a5b7a-25c6-4ca3-bc4a-3a848990b1b2` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-a93f96c8-7585-4287-8928-3e7cdea742d6` |
| 16 | `GET /v1/accounts/me` | 200 | 7 | `qa-84befc93-3e19-4a72-92bd-d07ac11dd85c` |
| 17 | `GET /v1/accounts/me` | 200 | 5 | `qa-57af3c5e-f3a6-4463-a7c3-e9ff7fef56e9` |
| 18 | `GET /v1/accounts/me` | 200 | 11 | `qa-b9c2f3e2-9a15-4d50-8afd-ffa3f138e5b8` |
| 19 | `GET /v1/accounts/me` | 200 | 28 | `qa-01810c8a-4dbb-4eff-aaf4-37f55b466f3e` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-62d4e39a-fafe-4dee-ab89-9f0d20c40e95` |
| 21 | `GET /v1/accounts/me` | 200 | 15 | `qa-edcb8eb3-d958-4f3c-a242-72e0b77bd136` |
| 22 | `GET /v1/accounts/me` | 200 | 15 | `qa-a111ece5-ad4b-462c-89fb-95ea8f942996` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-4105a3fb-844e-4574-98d9-daaf5565ca7d` |
| 24 | `GET /v1/accounts/me` | 200 | 20 | `qa-999c6335-3abe-4ab1-b996-58d2b7253c23` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-6204f7b1-f3be-41f9-9627-33c6bfb9a39d` |
| 26 | `GET /v1/accounts/me` | 200 | 20 | `qa-f5538649-d47c-43ef-a35a-fbafc4061a5f` |
| 27 | `GET /v1/accounts/me` | 200 | 27 | `qa-e47cfd7d-4c2e-4bd9-b0b7-ffc30a8ebb72` |
| 28 | `GET /v1/accounts/me` | 200 | 19 | `qa-6364d381-7903-4a55-945e-e0f72030408f` |
| 29 | `GET /v1/accounts/me` | 200 | 30 | `qa-227d5bae-fdeb-4af0-bdaa-878e39a172f7` |
| 30 | `GET /v1/accounts/me` | 200 | 24 | `qa-05d9b34c-b403-4a9f-8d50-3a9f9f2fa739` |
| 31 | `GET /v1/accounts/me` | 200 | 16 | `qa-0d19ea0b-8128-40cb-9c9c-ff13308f738b` |
| 32 | `GET /v1/accounts/me` | 200 | 9 | `qa-07d5a72c-c709-45de-b04d-e6e3e204058e` |
| 33 | `GET /v1/accounts/me` | 200 | 10 | `qa-916721d9-8f6c-4edb-98b4-ad05733e1ba2` |
| 34 | `GET /v1/accounts/me` | 200 | 10 | `qa-f1af6af1-2d8c-480d-9377-3cbfb3946c19` |
| 35 | `GET /v1/accounts/me` | 200 | 35 | `qa-5a4dbdf6-76ec-4c33-8737-930a38dc8762` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-400d35f7-0bc9-4056-8381-b7e20b5ccc42` |
| 37 | `GET /v1/accounts/me` | 200 | 8 | `qa-04b24151-eeb6-42ec-b1bc-f78406695fa8` |
| 38 | `GET /v1/accounts/me` | 200 | 25 | `qa-03cb0340-3a9b-47b8-b194-efee39b308a2` |
| 39 | `GET /v1/accounts/me` | 200 | 11 | `qa-295a65ca-5bb7-4bf3-831d-c89bd3f97186` |
| 40 | `GET /v1/accounts/me` | 200 | 17 | `qa-05563230-139a-4366-9a16-6f065591b988` |
| 41 | `GET /v1/accounts/me` | 200 | 19 | `qa-50ea17ea-578b-4602-8d50-5ab4d1348d9c` |
| 42 | `GET /v1/accounts/me` | 200 | 10 | `qa-1cf63bf1-9152-420d-8875-d3bfacdcbe06` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-ce41a483-fea0-4d39-bdbc-922441361a05` |
| 44 | `GET /v1/accounts/me` | 200 | 14 | `qa-91267f01-8c73-4677-bd6e-2ef92893f785` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-311ee497-7ee5-42fe-a2b7-7c4833938e1c` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-b0a74aab-58fe-4378-bca6-eee520ce4ed3` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-16532279-23be-415c-981e-6b140bc55f9b` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-056f13ca-63c2-42bb-a7da-5b6bb30be37c` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-438b34d5-06fe-4192-8a1c-4d063d3857d5` |
| 50 | `GET /v1/accounts/me` | 200 | 9 | `qa-b8a3af12-6438-475d-8de5-20c20c49540c` |
| 51 | `GET /v1/accounts/me` | 200 | 38 | `qa-a2899a0a-813f-4208-9672-d8c186425894` |
| 52 | `GET /v1/accounts/me` | 200 | 13 | `qa-86c20245-975e-4b41-af57-5f0bfe7bcc6d` |
| 53 | `GET /v1/accounts/me` | 200 | 15 | `qa-fdd1ef2a-0800-43cc-8a77-aa7acb13884c` |
| 54 | `GET /v1/accounts/me` | 200 | 16 | `qa-5669a247-a8b1-49da-98b7-105dfa7639c6` |
| 55 | `GET /v1/accounts/me` | 200 | 14 | `qa-564acbaa-6bad-4686-881b-500650fd657b` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-c3786f55-2dd5-4bd9-bbee-03be301c74c5` |
| 57 | `GET /v1/accounts/me` | 200 | 14 | `qa-d2d93cd3-29c9-4cf9-a3bd-f7c454cb8b9e` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-218e0921-e53d-4488-b2f1-a226152d9116` |
| 59 | `GET /v1/accounts/me` | 200 | 10 | `qa-5fb2a8d6-a2c7-4363-87af-46441d2dc9b2` |
| 60 | `GET /v1/accounts/me` | 200 | 10 | `qa-7db20eba-5ee1-4288-8e8f-fc145c1ecb63` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-4dd03a7e-eed5-4c70-a442-83cfb76e7533` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-1c49a1a9-ce41-46c8-b744-cf7679e9e57c` |
| 63 | `GET /v1/accounts/me` | 200 | 5 | `qa-5528e222-90fe-4b2e-b0ed-f7e5882eab75` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-aacb02eb-a34f-4454-8dd2-4689ed93731c` |
| 65 | `POST /v1/auth/token` | 429 | 4 | `qa-e68950f6-db00-4e70-b4af-7798f599bc97` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-072b91e1-65f6-45f3-8b38-6faf2e48fb61` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-c3a571b8-c548-44c0-bdb7-ba4fb4955c20` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-e81613e2-514e-4465-8a91-9ff0d9404d30` |
| 69 | `DELETE /v1/accounts/me` | 429 | 3 | `qa-be31a6a9-de44-4d35-88ae-c4b6c3eea95a` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 3 | `qa-0b29f419-ff36-42fa-84a0-f06fcd3f1a22` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-7528eaf2-4040-4291-bc43-91afb41ccae9` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-73b1f8e3-ad2c-4bc2-bb56-9d66750a6e69` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-7f1c26f6-d9e4-40a3-92c6-869652501608` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-d2138850-04ba-422e-bff4-231cb7c3791f` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-08b66b29-4e1a-43bd-bb98-bbe11be25540` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-bac6b31d-3b10-44a9-b0c0-f03beda99c52` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-23491c15-9e84-4b20-bb29-c20e779ee4c6` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-3e9eb5f7-0db3-4d62-9522-bbcecbc01046` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-d2ef66c7-4531-41f4-bf64-9d42891d4953` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-8c49778b-4ea9-426d-ab28-b11f82a91c13` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-8975c13e-2697-4a44-ac00-376a6726dc19` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-babecc13-562e-49a8-8002-2533867720f6` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-e736022b-af20-484d-acec-4fc00c92afb6` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-8464b7d0-bb72-4370-8c05-675d07b799d2` |
| 85 | `GET /v1/accounts/me` | 429 | 2 | `qa-eb005658-7b84-45ff-a7a3-abd00acc5118` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-ff4b675d-8f51-4460-be9f-31dfa1311f54` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-bda717f6-ecc4-4fa0-a4ef-109d3c7604f4` |
| 88 | `GET /v1/accounts/me` | 429 | 8 | `qa-394b6119-a7a0-41d6-9d58-c809e052cd35` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-63b4a78a-de89-433c-9c69-2c99cf6108f0` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-50647d37-976e-4299-b5ca-5f0baf10bfcf` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-68e52229-afdf-4a41-ba62-0b5f933c8352` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-4668c57b-dd36-4c0c-a5dc-00751f272651` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-374a7fd4-9e23-4ca4-a9ec-874de36572d1` |
| 94 | `GET /v1/accounts/me` | 429 | 6 | `qa-954f495b-fe5b-401c-a13a-537c0fa2610b` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-f3f3146d-0a58-4c71-8d99-6f15a7628c04` |
| 96 | `GET /v1/accounts/me` | 429 | 6 | `qa-980b0c55-b074-4c29-9e73-2bd2e7466344` |
| 97 | `GET /v1/accounts/me` | 429 | 4 | `qa-0be61396-9062-437c-8aa2-4cc24bd3d5e7` |
| 98 | `GET /v1/accounts/me` | 200 | 4 | `qa-a8b3aecb-28bb-4fe4-b9b7-86a13bc43d9f` |
| 99 | `POST /v1/auth/token` | 200 | 8 | `qa-336d8c33-7bd5-47bf-b73b-f052272dcd18` |
| 100 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5ed55699-c2eb-419c-94c4-4d1c3c1b4b15` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-666865eb-96f8-466d-8e27-16305a272aff` |
| 102 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-daf1ce46-fe5c-4a94-ad68-954c420a490c` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-114dd6de-4e9a-42b9-b2cd-5a1074e4ffa7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e8bbc06-5425-4efb-8241-8489c7486847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e8bbc06-5425-4efb-8241-8489c7486847
Content-Type: application/json

--- request body ---
{"handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e8bbc06-5425-4efb-8241-8489c7486847
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Location: /v1/accounts/qa-02b8c25b4620
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b359a6b9-0cb5-47bc-a666-79482ac84cec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b359a6b9-0cb5-47bc-a666-79482ac84cec
Content-Type: application/json

--- request body ---
{"handle":"qa-3048b3529db8","displayName":"QA 3048b3529db8","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b359a6b9-0cb5-47bc-a666-79482ac84cec
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
Location: /v1/accounts/qa-3048b3529db8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_939e5eba-d030-400b-ad48-da8bcc779871","handle":"qa-3048b3529db8","displayName":"QA 3048b3529db8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.976960862Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9415ff54-6225-4fe8-8517-b33fb3603459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9415ff54-6225-4fe8-8517-b33fb3603459
Content-Type: application/json

--- request body ---
{"handle":"qa-02b8c25b4620","password":"****"}

--- response: 200 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9415ff54-6225-4fe8-8517-b33fb3603459
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c5e1ee23-25ae-4cf4-a487-bbd36af3b728

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5e1ee23-25ae-4cf4-a487-bbd36af3b728
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3048b3529db8","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5e1ee23-25ae-4cf4-a487-bbd36af3b728
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
Location: /v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d","subject":"Error contract","status":"open","region":"eu","participants":["qa-02b8c25b4620","qa-3048b3529db8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.067599148Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c475aa7f-dd24-423f-a0ae-1bbc41c25c7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c475aa7f-dd24-423f-a0ae-1bbc41c25c7c
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c475aa7f-dd24-423f-a0ae-1bbc41c25c7c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-af4a3883-bb98-44f7-9f2a-a24efdfcba67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af4a3883-bb98-44f7-9f2a-a24efdfcba67
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-af4a3883-bb98-44f7-9f2a-a24efdfcba67
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-29ad5ec4-eebb-448b-8b23-4e8581459d37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29ad5ec4-eebb-448b-8b23-4e8581459d37
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-29ad5ec4-eebb-448b-8b23-4e8581459d37
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-62a8ceda-c343-4994-bf85-111c766a4779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a8ceda-c343-4994-bf85-111c766a4779
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-62a8ceda-c343-4994-bf85-111c766a4779
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6ae223a-f35e-4f72-ab9e-ba33b1a915fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6ae223a-f35e-4f72-ab9e-ba33b1a915fa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6ae223a-f35e-4f72-ab9e-ba33b1a915fa
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-5db05c5d-7078-4aeb-a5e2-081dccd7e7e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5db05c5d-7078-4aeb-a5e2-081dccd7e7e0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5db05c5d-7078-4aeb-a5e2-081dccd7e7e0
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-98cb7123-3ef3-4cde-ab91-f5f7f23925bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98cb7123-3ef3-4cde-ab91-f5f7f23925bd
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-98cb7123-3ef3-4cde-ab91-f5f7f23925bd
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-d96a2661-8a71-4c31-8b74-0334ec95fa45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96a2661-8a71-4c31-8b74-0334ec95fa45
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d96a2661-8a71-4c31-8b74-0334ec95fa45
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-fefad8c8-a02f-4e5f-9ea8-166888f8a5d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fefad8c8-a02f-4e5f-9ea8-166888f8a5d3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fefad8c8-a02f-4e5f-9ea8-166888f8a5d3
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-919a5b7a-25c6-4ca3-bc4a-3a848990b1b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-919a5b7a-25c6-4ca3-bc4a-3a848990b1b2
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-919a5b7a-25c6-4ca3-bc4a-3a848990b1b2
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-a93f96c8-7585-4287-8928-3e7cdea742d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a93f96c8-7585-4287-8928-3e7cdea742d6
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a93f96c8-7585-4287-8928-3e7cdea742d6
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-84befc93-3e19-4a72-92bd-d07ac11dd85c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84befc93-3e19-4a72-92bd-d07ac11dd85c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-84befc93-3e19-4a72-92bd-d07ac11dd85c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-57af3c5e-f3a6-4463-a7c3-e9ff7fef56e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57af3c5e-f3a6-4463-a7c3-e9ff7fef56e9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-57af3c5e-f3a6-4463-a7c3-e9ff7fef56e9
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9c2f3e2-9a15-4d50-8afd-ffa3f138e5b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9c2f3e2-9a15-4d50-8afd-ffa3f138e5b8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9c2f3e2-9a15-4d50-8afd-ffa3f138e5b8
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-01810c8a-4dbb-4eff-aaf4-37f55b466f3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01810c8a-4dbb-4eff-aaf4-37f55b466f3e
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-01810c8a-4dbb-4eff-aaf4-37f55b466f3e
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-62d4e39a-fafe-4dee-ab89-9f0d20c40e95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62d4e39a-fafe-4dee-ab89-9f0d20c40e95
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-62d4e39a-fafe-4dee-ab89-9f0d20c40e95
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-edcb8eb3-d958-4f3c-a242-72e0b77bd136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edcb8eb3-d958-4f3c-a242-72e0b77bd136
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-edcb8eb3-d958-4f3c-a242-72e0b77bd136
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-a111ece5-ad4b-462c-89fb-95ea8f942996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a111ece5-ad4b-462c-89fb-95ea8f942996
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a111ece5-ad4b-462c-89fb-95ea8f942996
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-4105a3fb-844e-4574-98d9-daaf5565ca7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4105a3fb-844e-4574-98d9-daaf5565ca7d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4105a3fb-844e-4574-98d9-daaf5565ca7d
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-999c6335-3abe-4ab1-b996-58d2b7253c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999c6335-3abe-4ab1-b996-58d2b7253c23
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-999c6335-3abe-4ab1-b996-58d2b7253c23
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-6204f7b1-f3be-41f9-9627-33c6bfb9a39d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6204f7b1-f3be-41f9-9627-33c6bfb9a39d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6204f7b1-f3be-41f9-9627-33c6bfb9a39d
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5538649-d47c-43ef-a35a-fbafc4061a5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5538649-d47c-43ef-a35a-fbafc4061a5f
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5538649-d47c-43ef-a35a-fbafc4061a5f
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-e47cfd7d-4c2e-4bd9-b0b7-ffc30a8ebb72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e47cfd7d-4c2e-4bd9-b0b7-ffc30a8ebb72
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e47cfd7d-4c2e-4bd9-b0b7-ffc30a8ebb72
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-6364d381-7903-4a55-945e-e0f72030408f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6364d381-7903-4a55-945e-e0f72030408f
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-6364d381-7903-4a55-945e-e0f72030408f
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-227d5bae-fdeb-4af0-bdaa-878e39a172f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227d5bae-fdeb-4af0-bdaa-878e39a172f7
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-227d5bae-fdeb-4af0-bdaa-878e39a172f7
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-05d9b34c-b403-4a9f-8d50-3a9f9f2fa739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d9b34c-b403-4a9f-8d50-3a9f9f2fa739
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-05d9b34c-b403-4a9f-8d50-3a9f9f2fa739
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d19ea0b-8128-40cb-9c9c-ff13308f738b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d19ea0b-8128-40cb-9c9c-ff13308f738b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d19ea0b-8128-40cb-9c9c-ff13308f738b
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-07d5a72c-c709-45de-b04d-e6e3e204058e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d5a72c-c709-45de-b04d-e6e3e204058e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-07d5a72c-c709-45de-b04d-e6e3e204058e
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-916721d9-8f6c-4edb-98b4-ad05733e1ba2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-916721d9-8f6c-4edb-98b4-ad05733e1ba2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-916721d9-8f6c-4edb-98b4-ad05733e1ba2
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-f1af6af1-2d8c-480d-9377-3cbfb3946c19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1af6af1-2d8c-480d-9377-3cbfb3946c19
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1af6af1-2d8c-480d-9377-3cbfb3946c19
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a4dbdf6-76ec-4c33-8737-930a38dc8762

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a4dbdf6-76ec-4c33-8737-930a38dc8762
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a4dbdf6-76ec-4c33-8737-930a38dc8762
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-400d35f7-0bc9-4056-8381-b7e20b5ccc42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-400d35f7-0bc9-4056-8381-b7e20b5ccc42
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-400d35f7-0bc9-4056-8381-b7e20b5ccc42
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-04b24151-eeb6-42ec-b1bc-f78406695fa8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b24151-eeb6-42ec-b1bc-f78406695fa8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-04b24151-eeb6-42ec-b1bc-f78406695fa8
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-03cb0340-3a9b-47b8-b194-efee39b308a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03cb0340-3a9b-47b8-b194-efee39b308a2
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-03cb0340-3a9b-47b8-b194-efee39b308a2
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-295a65ca-5bb7-4bf3-831d-c89bd3f97186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-295a65ca-5bb7-4bf3-831d-c89bd3f97186
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-295a65ca-5bb7-4bf3-831d-c89bd3f97186
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-05563230-139a-4366-9a16-6f065591b988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05563230-139a-4366-9a16-6f065591b988
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-05563230-139a-4366-9a16-6f065591b988
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-50ea17ea-578b-4602-8d50-5ab4d1348d9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50ea17ea-578b-4602-8d50-5ab4d1348d9c
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-50ea17ea-578b-4602-8d50-5ab4d1348d9c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cf63bf1-9152-420d-8875-d3bfacdcbe06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf63bf1-9152-420d-8875-d3bfacdcbe06
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf63bf1-9152-420d-8875-d3bfacdcbe06
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce41a483-fea0-4d39-bdbc-922441361a05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce41a483-fea0-4d39-bdbc-922441361a05
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce41a483-fea0-4d39-bdbc-922441361a05
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-91267f01-8c73-4677-bd6e-2ef92893f785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91267f01-8c73-4677-bd6e-2ef92893f785
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-91267f01-8c73-4677-bd6e-2ef92893f785
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-311ee497-7ee5-42fe-a2b7-7c4833938e1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311ee497-7ee5-42fe-a2b7-7c4833938e1c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-311ee497-7ee5-42fe-a2b7-7c4833938e1c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0a74aab-58fe-4378-bca6-eee520ce4ed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a74aab-58fe-4378-bca6-eee520ce4ed3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a74aab-58fe-4378-bca6-eee520ce4ed3
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-16532279-23be-415c-981e-6b140bc55f9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16532279-23be-415c-981e-6b140bc55f9b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-16532279-23be-415c-981e-6b140bc55f9b
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-056f13ca-63c2-42bb-a7da-5b6bb30be37c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-056f13ca-63c2-42bb-a7da-5b6bb30be37c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-056f13ca-63c2-42bb-a7da-5b6bb30be37c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-438b34d5-06fe-4192-8a1c-4d063d3857d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438b34d5-06fe-4192-8a1c-4d063d3857d5
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-438b34d5-06fe-4192-8a1c-4d063d3857d5
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8a3af12-6438-475d-8de5-20c20c49540c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a3af12-6438-475d-8de5-20c20c49540c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8a3af12-6438-475d-8de5-20c20c49540c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2899a0a-813f-4208-9672-d8c186425894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2899a0a-813f-4208-9672-d8c186425894
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2899a0a-813f-4208-9672-d8c186425894
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-86c20245-975e-4b41-af57-5f0bfe7bcc6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c20245-975e-4b41-af57-5f0bfe7bcc6d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c20245-975e-4b41-af57-5f0bfe7bcc6d
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdd1ef2a-0800-43cc-8a77-aa7acb13884c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdd1ef2a-0800-43cc-8a77-aa7acb13884c
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdd1ef2a-0800-43cc-8a77-aa7acb13884c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-5669a247-a8b1-49da-98b7-105dfa7639c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5669a247-a8b1-49da-98b7-105dfa7639c6
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5669a247-a8b1-49da-98b7-105dfa7639c6
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-564acbaa-6bad-4686-881b-500650fd657b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-564acbaa-6bad-4686-881b-500650fd657b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-564acbaa-6bad-4686-881b-500650fd657b
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3786f55-2dd5-4bd9-bbee-03be301c74c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3786f55-2dd5-4bd9-bbee-03be301c74c5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3786f55-2dd5-4bd9-bbee-03be301c74c5
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2d93cd3-29c9-4cf9-a3bd-f7c454cb8b9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2d93cd3-29c9-4cf9-a3bd-f7c454cb8b9e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2d93cd3-29c9-4cf9-a3bd-f7c454cb8b9e
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-218e0921-e53d-4488-b2f1-a226152d9116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-218e0921-e53d-4488-b2f1-a226152d9116
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-218e0921-e53d-4488-b2f1-a226152d9116
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-5fb2a8d6-a2c7-4363-87af-46441d2dc9b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fb2a8d6-a2c7-4363-87af-46441d2dc9b2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fb2a8d6-a2c7-4363-87af-46441d2dc9b2
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-7db20eba-5ee1-4288-8e8f-fc145c1ecb63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7db20eba-5ee1-4288-8e8f-fc145c1ecb63
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7db20eba-5ee1-4288-8e8f-fc145c1ecb63
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-4dd03a7e-eed5-4c70-a442-83cfb76e7533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dd03a7e-eed5-4c70-a442-83cfb76e7533
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dd03a7e-eed5-4c70-a442-83cfb76e7533
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c49a1a9-ce41-46c8-b744-cf7679e9e57c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c49a1a9-ce41-46c8-b744-cf7679e9e57c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c49a1a9-ce41-46c8-b744-cf7679e9e57c
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-5528e222-90fe-4b2e-b0ed-f7e5882eab75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5528e222-90fe-4b2e-b0ed-f7e5882eab75
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5528e222-90fe-4b2e-b0ed-f7e5882eab75
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-aacb02eb-a34f-4454-8dd2-4689ed93731c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aacb02eb-a34f-4454-8dd2-4689ed93731c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aacb02eb-a34f-4454-8dd2-4689ed93731c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-aacb02eb-a34f-4454-8dd2-4689ed93731c"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-e68950f6-db00-4e70-b4af-7798f599bc97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e68950f6-db00-4e70-b4af-7798f599bc97
Content-Type: application/json

--- request body ---
{"handle":"qa-02b8c25b4620","password":"****"}

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e68950f6-db00-4e70-b4af-7798f599bc97
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-e68950f6-db00-4e70-b4af-7798f599bc97"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-072b91e1-65f6-45f3-8b38-6faf2e48fb61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072b91e1-65f6-45f3-8b38-6faf2e48fb61
Content-Type: application/json

--- request body ---
{"handle":"qa-f156034c234a","displayName":"QA f156034c234a","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-072b91e1-65f6-45f3-8b38-6faf2e48fb61
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-072b91e1-65f6-45f3-8b38-6faf2e48fb61"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3a571b8-c548-44c0-bdb7-ba4fb4955c20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3a571b8-c548-44c0-bdb7-ba4fb4955c20
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3a571b8-c548-44c0-bdb7-ba4fb4955c20
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c3a571b8-c548-44c0-bdb7-ba4fb4955c20"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-e81613e2-514e-4465-8a91-9ff0d9404d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e81613e2-514e-4465-8a91-9ff0d9404d30
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e81613e2-514e-4465-8a91-9ff0d9404d30
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e81613e2-514e-4465-8a91-9ff0d9404d30"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be31a6a9-de44-4d35-88ae-c4b6c3eea95a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be31a6a9-de44-4d35-88ae-c4b6c3eea95a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be31a6a9-de44-4d35-88ae-c4b6c3eea95a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-be31a6a9-de44-4d35-88ae-c4b6c3eea95a"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-02b8c25b4620
correlation: qa-0b29f419-ff36-42fa-84a0-f06fcd3f1a22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b29f419-ff36-42fa-84a0-f06fcd3f1a22
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b29f419-ff36-42fa-84a0-f06fcd3f1a22
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-02b8c25b4620","correlationId":"qa-0b29f419-ff36-42fa-84a0-f06fcd3f1a22"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-7528eaf2-4040-4291-bc43-91afb41ccae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7528eaf2-4040-4291-bc43-91afb41ccae9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-02b8c25b4620","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7528eaf2-4040-4291-bc43-91afb41ccae9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-7528eaf2-4040-4291-bc43-91afb41ccae9"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-73b1f8e3-ad2c-4bc2-bb56-9d66750a6e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b1f8e3-ad2c-4bc2-bb56-9d66750a6e69
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73b1f8e3-ad2c-4bc2-bb56-9d66750a6e69
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-73b1f8e3-ad2c-4bc2-bb56-9d66750a6e69"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d
correlation: qa-7f1c26f6-d9e4-40a3-92c6-869652501608

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1c26f6-d9e4-40a3-92c6-869652501608
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f1c26f6-d9e4-40a3-92c6-869652501608
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d","correlationId":"qa-7f1c26f6-d9e4-40a3-92c6-869652501608"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/messages
correlation: qa-d2138850-04ba-422e-bff4-231cb7c3791f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2138850-04ba-422e-bff4-231cb7c3791f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2138850-04ba-422e-bff4-231cb7c3791f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/messages","correlationId":"qa-d2138850-04ba-422e-bff4-231cb7c3791f"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/messages
correlation: qa-08b66b29-4e1a-43bd-bb98-bbe11be25540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08b66b29-4e1a-43bd-bb98-bbe11be25540
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08b66b29-4e1a-43bd-bb98-bbe11be25540
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/messages","correlationId":"qa-08b66b29-4e1a-43bd-bb98-bbe11be25540"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/read
correlation: qa-bac6b31d-3b10-44a9-b0c0-f03beda99c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac6b31d-3b10-44a9-b0c0-f03beda99c52
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bac6b31d-3b10-44a9-b0c0-f03beda99c52
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/read","correlationId":"qa-bac6b31d-3b10-44a9-b0c0-f03beda99c52"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/close
correlation: qa-23491c15-9e84-4b20-bb29-c20e779ee4c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23491c15-9e84-4b20-bb29-c20e779ee4c6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23491c15-9e84-4b20-bb29-c20e779ee4c6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_edbb9fef-09c8-4f76-8f69-c3cd4d116c7d/close","correlationId":"qa-23491c15-9e84-4b20-bb29-c20e779ee4c6"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-3e9eb5f7-0db3-4d62-9522-bbcecbc01046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e9eb5f7-0db3-4d62-9522-bbcecbc01046
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e9eb5f7-0db3-4d62-9522-bbcecbc01046
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-3e9eb5f7-0db3-4d62-9522-bbcecbc01046"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-d2ef66c7-4531-41f4-bf64-9d42891d4953

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2ef66c7-4531-41f4-bf64-9d42891d4953
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2ef66c7-4531-41f4-bf64-9d42891d4953
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-d2ef66c7-4531-41f4-bf64-9d42891d4953"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8c49778b-4ea9-426d-ab28-b11f82a91c13

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e784ef9905414c7ca1a7f03ab24bfd8f
X-Correlation-Id: qa-8c49778b-4ea9-426d-ab28-b11f82a91c13
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c49778b-4ea9-426d-ab28-b11f82a91c13
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-8c49778b-4ea9-426d-ab28-b11f82a91c13"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-8975c13e-2697-4a44-ac00-376a6726dc19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8975c13e-2697-4a44-ac00-376a6726dc19
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8975c13e-2697-4a44-ac00-376a6726dc19
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-8975c13e-2697-4a44-ac00-376a6726dc19"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-babecc13-562e-49a8-8002-2533867720f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-babecc13-562e-49a8-8002-2533867720f6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-babecc13-562e-49a8-8002-2533867720f6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-babecc13-562e-49a8-8002-2533867720f6"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-e736022b-af20-484d-acec-4fc00c92afb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e736022b-af20-484d-acec-4fc00c92afb6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e736022b-af20-484d-acec-4fc00c92afb6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e736022b-af20-484d-acec-4fc00c92afb6"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-8464b7d0-bb72-4370-8c05-675d07b799d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8464b7d0-bb72-4370-8c05-675d07b799d2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8464b7d0-bb72-4370-8c05-675d07b799d2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8464b7d0-bb72-4370-8c05-675d07b799d2"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb005658-7b84-45ff-a7a3-abd00acc5118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb005658-7b84-45ff-a7a3-abd00acc5118
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 18 Nov 2026 10:19:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb005658-7b84-45ff-a7a3-abd00acc5118
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb005658-7b84-45ff-a7a3-abd00acc5118"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff4b675d-8f51-4460-be9f-31dfa1311f54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff4b675d-8f51-4460-be9f-31dfa1311f54
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff4b675d-8f51-4460-be9f-31dfa1311f54
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ff4b675d-8f51-4460-be9f-31dfa1311f54"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-bda717f6-ecc4-4fa0-a4ef-109d3c7604f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda717f6-ecc4-4fa0-a4ef-109d3c7604f4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bda717f6-ecc4-4fa0-a4ef-109d3c7604f4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bda717f6-ecc4-4fa0-a4ef-109d3c7604f4"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-394b6119-a7a0-41d6-9d58-c809e052cd35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-394b6119-a7a0-41d6-9d58-c809e052cd35
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-394b6119-a7a0-41d6-9d58-c809e052cd35
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-394b6119-a7a0-41d6-9d58-c809e052cd35"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-63b4a78a-de89-433c-9c69-2c99cf6108f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b4a78a-de89-433c-9c69-2c99cf6108f0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63b4a78a-de89-433c-9c69-2c99cf6108f0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-63b4a78a-de89-433c-9c69-2c99cf6108f0"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-50647d37-976e-4299-b5ca-5f0baf10bfcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50647d37-976e-4299-b5ca-5f0baf10bfcf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50647d37-976e-4299-b5ca-5f0baf10bfcf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-50647d37-976e-4299-b5ca-5f0baf10bfcf"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-68e52229-afdf-4a41-ba62-0b5f933c8352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68e52229-afdf-4a41-ba62-0b5f933c8352
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68e52229-afdf-4a41-ba62-0b5f933c8352
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-68e52229-afdf-4a41-ba62-0b5f933c8352"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-4668c57b-dd36-4c0c-a5dc-00751f272651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4668c57b-dd36-4c0c-a5dc-00751f272651
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4668c57b-dd36-4c0c-a5dc-00751f272651
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4668c57b-dd36-4c0c-a5dc-00751f272651"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-374a7fd4-9e23-4ca4-a9ec-874de36572d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374a7fd4-9e23-4ca4-a9ec-874de36572d1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-374a7fd4-9e23-4ca4-a9ec-874de36572d1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-374a7fd4-9e23-4ca4-a9ec-874de36572d1"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-954f495b-fe5b-401c-a13a-537c0fa2610b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-954f495b-fe5b-401c-a13a-537c0fa2610b
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-954f495b-fe5b-401c-a13a-537c0fa2610b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-954f495b-fe5b-401c-a13a-537c0fa2610b"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3f3146d-0a58-4c71-8d99-6f15a7628c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f3146d-0a58-4c71-8d99-6f15a7628c04
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 18 Nov 2026 10:20:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3f3146d-0a58-4c71-8d99-6f15a7628c04
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f3f3146d-0a58-4c71-8d99-6f15a7628c04"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-980b0c55-b074-4c29-9e73-2bd2e7466344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980b0c55-b074-4c29-9e73-2bd2e7466344
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 18 Nov 2026 10:20:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-980b0c55-b074-4c29-9e73-2bd2e7466344
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-980b0c55-b074-4c29-9e73-2bd2e7466344"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-0be61396-9062-437c-8aa2-4cc24bd3d5e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be61396-9062-437c-8aa2-4cc24bd3d5e7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0be61396-9062-437c-8aa2-4cc24bd3d5e7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0be61396-9062-437c-8aa2-4cc24bd3d5e7"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8b3aecb-28bb-4fe4-b9b7-86a13bc43d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8b3aecb-28bb-4fe4-b9b7-86a13bc43d9f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8b3aecb-28bb-4fe4-b9b7-86a13bc43d9f
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

{"id":"acc_0b930b4d-a2ac-42bb-8485-96c8636a12d4","handle":"qa-02b8c25b4620","displayName":"QA 02b8c25b4620","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.933446895Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-336d8c33-7bd5-47bf-b73b-f052272dcd18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-336d8c33-7bd5-47bf-b73b-f052272dcd18
Content-Type: application/json

--- request body ---
{"handle":"qa-3048b3529db8","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-336d8c33-7bd5-47bf-b73b-f052272dcd18
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_939e5eba-d030-400b-ad48-da8bcc779871"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5ed55699-c2eb-419c-94c4-4d1c3c1b4b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed55699-c2eb-419c-94c4-4d1c3c1b4b15
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5ed55699-c2eb-419c-94c4-4d1c3c1b4b15
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
correlation: qa-666865eb-96f8-466d-8e27-16305a272aff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666865eb-96f8-466d-8e27-16305a272aff
Content-Type: application/json

--- request body ---
{"handle":"qa-3048b3529db8","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-666865eb-96f8-466d-8e27-16305a272aff
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-666865eb-96f8-466d-8e27-16305a272aff"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-daf1ce46-fe5c-4a94-ad68-954c420a490c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daf1ce46-fe5c-4a94-ad68-954c420a490c
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-daf1ce46-fe5c-4a94-ad68-954c420a490c
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
correlation: qa-114dd6de-4e9a-42b9-b2cd-5a1074e4ffa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-114dd6de-4e9a-42b9-b2cd-5a1074e4ffa7
Content-Type: application/json

--- request body ---
{"handle":"qa-02b8c25b4620","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:20:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-114dd6de-4e9a-42b9-b2cd-5a1074e4ffa7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-114dd6de-4e9a-42b9-b2cd-5a1074e4ffa7"}
```
