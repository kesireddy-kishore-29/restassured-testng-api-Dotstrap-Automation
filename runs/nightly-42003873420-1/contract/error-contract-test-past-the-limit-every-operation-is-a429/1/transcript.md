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
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-7c5612db-5e58-4589-908e-45b51a0e912d` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-8bd1c720-83f3-457d-815f-98cc3156fd25` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-fc86b08b-6eba-487d-99f9-5a17120a9f0a` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-1c87760d-3f85-42cb-b4cc-a44931a02499` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-bddf809b-a151-4c9e-bd7f-3c9bfbffa13c` |
| 6 | `GET /v1/accounts/me` | 200 | 24 | `qa-431441d4-2f26-4f27-b15a-d3862918ff18` |
| 7 | `GET /v1/accounts/me` | 200 | 29 | `qa-9c7379c7-70e5-434c-a467-e5fae00b1353` |
| 8 | `GET /v1/accounts/me` | 200 | 25 | `qa-35630479-e42f-483c-8dc9-52d17ccecabc` |
| 9 | `GET /v1/accounts/me` | 200 | 16 | `qa-f7b55c4e-49ac-4bab-8da3-4397640ec4e9` |
| 10 | `GET /v1/accounts/me` | 200 | 36 | `qa-a55cfb62-c1fe-4213-96ca-dac5b0773039` |
| 11 | `GET /v1/accounts/me` | 200 | 17 | `qa-4b728ccb-5a53-4705-ad1d-3dcd006c01d8` |
| 12 | `GET /v1/accounts/me` | 200 | 20 | `qa-992fa872-9e82-4f80-b2b3-e4b36550f039` |
| 13 | `GET /v1/accounts/me` | 200 | 19 | `qa-3adb6e7a-2a46-4ca6-a8f1-a892e2d86205` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-4282273c-68db-4759-8ad5-3c4ae458469a` |
| 15 | `GET /v1/accounts/me` | 200 | 12 | `qa-1012107e-a679-4d96-9840-06d9c2be72c2` |
| 16 | `GET /v1/accounts/me` | 200 | 19 | `qa-70da2109-c40f-41fb-a95c-e131a3da05a8` |
| 17 | `GET /v1/accounts/me` | 200 | 29 | `qa-9419bc7c-9a60-47a6-bd42-0ca4cdae6850` |
| 18 | `GET /v1/accounts/me` | 200 | 23 | `qa-a752dbfe-d9b2-43e4-a961-40b33ce2c5b1` |
| 19 | `GET /v1/accounts/me` | 200 | 17 | `qa-67b87209-e03d-4314-b78d-e7a0857e8b62` |
| 20 | `GET /v1/accounts/me` | 200 | 18 | `qa-b80d998f-9423-4048-8c2d-00ea89347d65` |
| 21 | `GET /v1/accounts/me` | 200 | 20 | `qa-d99dd1ab-86a4-4489-a075-b3dbc3c30662` |
| 22 | `GET /v1/accounts/me` | 200 | 11 | `qa-6e6624a3-c30b-408b-89bb-66c8fe0e5405` |
| 23 | `GET /v1/accounts/me` | 200 | 31 | `qa-84319f8a-6eb7-4b15-a70c-6f9b1247fb2e` |
| 24 | `GET /v1/accounts/me` | 200 | 25 | `qa-78041953-0b09-4d2b-8357-346be5b35a6b` |
| 25 | `GET /v1/accounts/me` | 200 | 12 | `qa-e9037672-e200-4f9a-ba75-0e6ddce9a3b2` |
| 26 | `GET /v1/accounts/me` | 200 | 12 | `qa-b9411e0b-b10b-43f4-93bb-abaf46e5c4de` |
| 27 | `GET /v1/accounts/me` | 200 | 14 | `qa-afdce067-5015-4a87-979f-322202e6a083` |
| 28 | `GET /v1/accounts/me` | 200 | 29 | `qa-ef1c35fd-2238-4b95-8687-968965e96798` |
| 29 | `GET /v1/accounts/me` | 200 | 11 | `qa-91fbbda6-9341-4dba-803d-dd1b9867b902` |
| 30 | `GET /v1/accounts/me` | 200 | 13 | `qa-802dbd82-b8de-4375-ace9-8fd91b2e41f5` |
| 31 | `GET /v1/accounts/me` | 200 | 64 | `qa-692a3f12-7161-45f3-a377-4f395631ae90` |
| 32 | `GET /v1/accounts/me` | 200 | 25 | `qa-92e7ac35-b603-42e9-bac0-81c041351ca3` |
| 33 | `GET /v1/accounts/me` | 200 | 24 | `qa-be1db011-4b9e-4555-8027-b4ff454d5cc9` |
| 34 | `GET /v1/accounts/me` | 200 | 17 | `qa-6c0d4037-09e3-47a3-b8f2-b5d510b15f89` |
| 35 | `GET /v1/accounts/me` | 200 | 18 | `qa-7f281bae-ff6f-4782-95b7-799a2d7db7e9` |
| 36 | `GET /v1/accounts/me` | 200 | 18 | `qa-6c35f5e9-0f84-4c3c-8136-d256cc566a4b` |
| 37 | `GET /v1/accounts/me` | 200 | 11 | `qa-88bbe719-e3f6-4774-9343-cbfb837bdff3` |
| 38 | `GET /v1/accounts/me` | 200 | 17 | `qa-ab8b865e-da8c-487d-a0a3-050a45106f3a` |
| 39 | `GET /v1/accounts/me` | 200 | 16 | `qa-d97cda3a-1c2f-4dc5-b919-2d611c61847c` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-4d0208a7-ecfa-4181-9d0c-6db07b4ee7fb` |
| 41 | `GET /v1/accounts/me` | 200 | 11 | `qa-91aee17a-2787-4f59-af33-8af342675566` |
| 42 | `GET /v1/accounts/me` | 200 | 15 | `qa-e49ac284-5a58-4c7d-8c72-da4c671e2243` |
| 43 | `GET /v1/accounts/me` | 200 | 15 | `qa-1a731ab5-0a08-463a-9617-081edf44f7a0` |
| 44 | `GET /v1/accounts/me` | 200 | 11 | `qa-1306f31b-5697-4515-8603-ab68e48497a1` |
| 45 | `GET /v1/accounts/me` | 200 | 3 | `qa-9286e2dc-28d4-46bf-b1a9-b5bdadffa492` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-6527390b-f8a7-4b24-b049-cdb54285ef98` |
| 47 | `GET /v1/accounts/me` | 200 | 11 | `qa-8e6fbd6f-ce9b-4e3a-967c-2b3f95dc2ee5` |
| 48 | `GET /v1/accounts/me` | 200 | 8 | `qa-54b648f8-53cf-4805-b73c-5265ff7f380d` |
| 49 | `GET /v1/accounts/me` | 200 | 9 | `qa-67a96926-27f1-4661-92ae-c62ad55f7076` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-0983a679-cb57-4dca-a842-d3b66d561e88` |
| 51 | `GET /v1/accounts/me` | 200 | 9 | `qa-0cc39030-00ae-4b60-b320-ae8d7ec52cea` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-311784aa-eab2-431c-8498-215b7e1a12b1` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-1e273be2-0778-4b87-9029-367dc37a0e56` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-9bf89e9a-0e19-4bb3-b189-5269010d21ae` |
| 55 | `GET /v1/accounts/me` | 200 | 10 | `qa-48b91e68-8691-4c7c-8edb-336840ddac03` |
| 56 | `GET /v1/accounts/me` | 200 | 9 | `qa-1c69d277-ca71-469f-85a4-825a2940f4b4` |
| 57 | `GET /v1/accounts/me` | 200 | 8 | `qa-e7098c7b-83f4-4198-9724-5e74832322a2` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-d92cd80d-9856-46f0-a196-be94404cfef4` |
| 59 | `GET /v1/accounts/me` | 200 | 14 | `qa-68f159e2-c561-4966-b0aa-22ddd0da5e6f` |
| 60 | `GET /v1/accounts/me` | 200 | 17 | `qa-e1ae9949-eb00-4e42-a942-ec0f8b53374a` |
| 61 | `GET /v1/accounts/me` | 200 | 10 | `qa-69b859e6-5a77-49e5-95f6-f7e84bda221b` |
| 62 | `GET /v1/accounts/me` | 200 | 13 | `qa-18d6c9ba-e6e6-4529-9f3f-04f9dccd9ffb` |
| 63 | `GET /v1/accounts/me` | 200 | 6 | `qa-ad0cc159-b90a-4344-9cdd-e4a16ea566c2` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-3b70962d-3855-43fe-8ad7-d2a5dea147e3` |
| 65 | `POST /v1/auth/token` | 429 | 7 | `qa-a663de40-9aea-495a-93c0-c615b5426586` |
| 66 | `POST /v1/accounts` | 429 | 8 | `qa-4d62f5dd-f234-4f29-ba58-4913bb717314` |
| 67 | `GET /v1/accounts/me` | 429 | 11 | `qa-812d288f-c6ff-45c2-9c73-12ec445c3d11` |
| 68 | `PATCH /v1/accounts/me` | 429 | 7 | `qa-243b81bc-223d-4181-a6de-5cf45e295a2b` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-ae91b6c8-1c76-4056-8ecf-4a14c9620e99` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-6a05971d-24cc-4422-82bd-756ed838c42b` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-f4275839-4b84-434a-88b7-035b8a3d1400` |
| 72 | `GET /v1/conversations` | 429 | 5 | `qa-328ee8b9-7136-42ed-b0bf-2bebe3552c18` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-c68872cc-6182-40f6-80b9-908bf97f7570` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-b53f36fb-ff17-4b37-bace-89d2af6cbd87` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 5 | `qa-09e22ee9-ee12-4fa1-830d-5d3b75618acd` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 6 | `qa-60324d58-8dd4-44f4-9785-9262063fee47` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-d6af21f6-64d2-4f61-aac6-670d955a37e2` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-70e9a281-24cf-4397-9fea-76f2368c5b9c` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-9073da38-37df-45ba-93d6-94daf9a70a02` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-695791bc-6bce-4606-b676-1ed46e6929cb` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-4383d97c-7559-4923-8635-05d5e80f54be` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-3e930e1a-58c3-4643-bd01-191236e633e9` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-8cf325c3-a535-4b1f-a91a-58dc717bcd24` |
| 84 | `GET /v1/accounts/me` | 429 | 4 | `qa-734e8312-05b5-4ebf-9bfd-c8573af247d7` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-39c5eaa7-b61a-40c9-bafe-122b756079b7` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-e4532adf-5da2-4af1-a1b3-0da7b33d77b2` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-2bb06c56-d98f-4ce1-b3a2-7b9a435dd59a` |
| 88 | `GET /v1/accounts/me` | 429 | 5 | `qa-6eebd7ef-a6d1-44b7-8f55-9f0376d448ed` |
| 89 | `GET /v1/accounts/me` | 429 | 21 | `qa-29942ec9-fedb-486b-aca6-5f928826f9c3` |
| 90 | `GET /v1/accounts/me` | 429 | 6 | `qa-18e73584-73a9-4e5f-aa3e-a68a0c280577` |
| 91 | `GET /v1/accounts/me` | 429 | 6 | `qa-6ceba361-5727-4b72-8879-78d3a7396eff` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-477eb737-94f7-4a9d-87f1-4d682d00615c` |
| 93 | `GET /v1/accounts/me` | 429 | 5 | `qa-c5959b0d-de79-4df2-97d5-b290b1676525` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-c8a7ef62-17ec-4d51-9810-f4a0f6906cb0` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-94d46a3e-7178-4d64-813c-22bf38656d27` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-df1069cc-70fa-4b40-8922-bbc5e29d66ab` |
| 97 | `GET /v1/accounts/me` | 200 | 6 | `qa-6d54ab62-a0a1-4708-835a-51145114c352` |
| 98 | `POST /v1/auth/token` | 200 | 9 | `qa-4fbe4bce-c14c-4f99-8cd3-e4af4fefb7d6` |
| 99 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-7834140e-609a-4a3a-8bd2-2f1231f64724` |
| 100 | `POST /v1/auth/token` | 401 | 3 | `qa-8af38e35-5c0b-4b32-ad47-e8b764d8d7a0` |
| 101 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e15700ef-b3dc-4696-85c1-d8bae9bbb676` |
| 102 | `POST /v1/auth/token` | 401 | 3 | `qa-204904f1-9e44-44e3-a310-60fb001c2fd6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c5612db-5e58-4589-908e-45b51a0e912d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5612db-5e58-4589-908e-45b51a0e912d
Content-Type: application/json

--- request body ---
{"handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5612db-5e58-4589-908e-45b51a0e912d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Location: /v1/accounts/qa-d0541d99faee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8bd1c720-83f3-457d-815f-98cc3156fd25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd1c720-83f3-457d-815f-98cc3156fd25
Content-Type: application/json

--- request body ---
{"handle":"qa-5d1a1fbe9d7e","displayName":"QA 5d1a1fbe9d7e","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bd1c720-83f3-457d-815f-98cc3156fd25
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
Location: /v1/accounts/qa-5d1a1fbe9d7e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9978042e-95e6-4cdd-8d59-4cee53d5202d","handle":"qa-5d1a1fbe9d7e","displayName":"QA 5d1a1fbe9d7e","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.758670013Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fc86b08b-6eba-487d-99f9-5a17120a9f0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc86b08b-6eba-487d-99f9-5a17120a9f0a
Content-Type: application/json

--- request body ---
{"handle":"qa-d0541d99faee","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc86b08b-6eba-487d-99f9-5a17120a9f0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1c87760d-3f85-42cb-b4cc-a44931a02499

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c87760d-3f85-42cb-b4cc-a44931a02499
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5d1a1fbe9d7e","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c87760d-3f85-42cb-b4cc-a44931a02499
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
Location: /v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ada009d9-76c2-412c-a33a-4525f5ac848e","subject":"Error contract","status":"open","region":"eu","participants":["qa-d0541d99faee","qa-5d1a1fbe9d7e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.835969735Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bddf809b-a151-4c9e-bd7f-3c9bfbffa13c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bddf809b-a151-4c9e-bd7f-3c9bfbffa13c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-bddf809b-a151-4c9e-bd7f-3c9bfbffa13c
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-431441d4-2f26-4f27-b15a-d3862918ff18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431441d4-2f26-4f27-b15a-d3862918ff18
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-431441d4-2f26-4f27-b15a-d3862918ff18
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c7379c7-70e5-434c-a467-e5fae00b1353

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c7379c7-70e5-434c-a467-e5fae00b1353
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c7379c7-70e5-434c-a467-e5fae00b1353
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-35630479-e42f-483c-8dc9-52d17ccecabc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35630479-e42f-483c-8dc9-52d17ccecabc
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-35630479-e42f-483c-8dc9-52d17ccecabc
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7b55c4e-49ac-4bab-8da3-4397640ec4e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7b55c4e-49ac-4bab-8da3-4397640ec4e9
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7b55c4e-49ac-4bab-8da3-4397640ec4e9
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-a55cfb62-c1fe-4213-96ca-dac5b0773039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55cfb62-c1fe-4213-96ca-dac5b0773039
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a55cfb62-c1fe-4213-96ca-dac5b0773039
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b728ccb-5a53-4705-ad1d-3dcd006c01d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b728ccb-5a53-4705-ad1d-3dcd006c01d8
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b728ccb-5a53-4705-ad1d-3dcd006c01d8
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-992fa872-9e82-4f80-b2b3-e4b36550f039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-992fa872-9e82-4f80-b2b3-e4b36550f039
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-992fa872-9e82-4f80-b2b3-e4b36550f039
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-3adb6e7a-2a46-4ca6-a8f1-a892e2d86205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3adb6e7a-2a46-4ca6-a8f1-a892e2d86205
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3adb6e7a-2a46-4ca6-a8f1-a892e2d86205
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-4282273c-68db-4759-8ad5-3c4ae458469a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4282273c-68db-4759-8ad5-3c4ae458469a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4282273c-68db-4759-8ad5-3c4ae458469a
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-1012107e-a679-4d96-9840-06d9c2be72c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1012107e-a679-4d96-9840-06d9c2be72c2
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1012107e-a679-4d96-9840-06d9c2be72c2
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-70da2109-c40f-41fb-a95c-e131a3da05a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70da2109-c40f-41fb-a95c-e131a3da05a8
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-70da2109-c40f-41fb-a95c-e131a3da05a8
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-9419bc7c-9a60-47a6-bd42-0ca4cdae6850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9419bc7c-9a60-47a6-bd42-0ca4cdae6850
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9419bc7c-9a60-47a6-bd42-0ca4cdae6850
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-a752dbfe-d9b2-43e4-a961-40b33ce2c5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a752dbfe-d9b2-43e4-a961-40b33ce2c5b1
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a752dbfe-d9b2-43e4-a961-40b33ce2c5b1
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-67b87209-e03d-4314-b78d-e7a0857e8b62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67b87209-e03d-4314-b78d-e7a0857e8b62
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-67b87209-e03d-4314-b78d-e7a0857e8b62
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b80d998f-9423-4048-8c2d-00ea89347d65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b80d998f-9423-4048-8c2d-00ea89347d65
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b80d998f-9423-4048-8c2d-00ea89347d65
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-d99dd1ab-86a4-4489-a075-b3dbc3c30662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d99dd1ab-86a4-4489-a075-b3dbc3c30662
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d99dd1ab-86a4-4489-a075-b3dbc3c30662
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e6624a3-c30b-408b-89bb-66c8fe0e5405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e6624a3-c30b-408b-89bb-66c8fe0e5405
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e6624a3-c30b-408b-89bb-66c8fe0e5405
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-84319f8a-6eb7-4b15-a70c-6f9b1247fb2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84319f8a-6eb7-4b15-a70c-6f9b1247fb2e
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-84319f8a-6eb7-4b15-a70c-6f9b1247fb2e
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-78041953-0b09-4d2b-8357-346be5b35a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78041953-0b09-4d2b-8357-346be5b35a6b
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-78041953-0b09-4d2b-8357-346be5b35a6b
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9037672-e200-4f9a-ba75-0e6ddce9a3b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9037672-e200-4f9a-ba75-0e6ddce9a3b2
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9037672-e200-4f9a-ba75-0e6ddce9a3b2
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-b9411e0b-b10b-43f4-93bb-abaf46e5c4de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9411e0b-b10b-43f4-93bb-abaf46e5c4de
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9411e0b-b10b-43f4-93bb-abaf46e5c4de
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-afdce067-5015-4a87-979f-322202e6a083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afdce067-5015-4a87-979f-322202e6a083
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-afdce067-5015-4a87-979f-322202e6a083
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef1c35fd-2238-4b95-8687-968965e96798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef1c35fd-2238-4b95-8687-968965e96798
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef1c35fd-2238-4b95-8687-968965e96798
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-91fbbda6-9341-4dba-803d-dd1b9867b902

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fbbda6-9341-4dba-803d-dd1b9867b902
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-91fbbda6-9341-4dba-803d-dd1b9867b902
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-802dbd82-b8de-4375-ace9-8fd91b2e41f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-802dbd82-b8de-4375-ace9-8fd91b2e41f5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-802dbd82-b8de-4375-ace9-8fd91b2e41f5
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-692a3f12-7161-45f3-a377-4f395631ae90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-692a3f12-7161-45f3-a377-4f395631ae90
Content-Type: application/json

--- response: 200 in 64 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-692a3f12-7161-45f3-a377-4f395631ae90
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-92e7ac35-b603-42e9-bac0-81c041351ca3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e7ac35-b603-42e9-bac0-81c041351ca3
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-92e7ac35-b603-42e9-bac0-81c041351ca3
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-be1db011-4b9e-4555-8027-b4ff454d5cc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be1db011-4b9e-4555-8027-b4ff454d5cc9
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-be1db011-4b9e-4555-8027-b4ff454d5cc9
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c0d4037-09e3-47a3-b8f2-b5d510b15f89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c0d4037-09e3-47a3-b8f2-b5d510b15f89
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c0d4037-09e3-47a3-b8f2-b5d510b15f89
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f281bae-ff6f-4782-95b7-799a2d7db7e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f281bae-ff6f-4782-95b7-799a2d7db7e9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f281bae-ff6f-4782-95b7-799a2d7db7e9
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c35f5e9-0f84-4c3c-8136-d256cc566a4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c35f5e9-0f84-4c3c-8136-d256cc566a4b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c35f5e9-0f84-4c3c-8136-d256cc566a4b
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-88bbe719-e3f6-4774-9343-cbfb837bdff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88bbe719-e3f6-4774-9343-cbfb837bdff3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-88bbe719-e3f6-4774-9343-cbfb837bdff3
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab8b865e-da8c-487d-a0a3-050a45106f3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab8b865e-da8c-487d-a0a3-050a45106f3a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab8b865e-da8c-487d-a0a3-050a45106f3a
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-d97cda3a-1c2f-4dc5-b919-2d611c61847c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d97cda3a-1c2f-4dc5-b919-2d611c61847c
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d97cda3a-1c2f-4dc5-b919-2d611c61847c
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d0208a7-ecfa-4181-9d0c-6db07b4ee7fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d0208a7-ecfa-4181-9d0c-6db07b4ee7fb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d0208a7-ecfa-4181-9d0c-6db07b4ee7fb
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-91aee17a-2787-4f59-af33-8af342675566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91aee17a-2787-4f59-af33-8af342675566
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-91aee17a-2787-4f59-af33-8af342675566
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-e49ac284-5a58-4c7d-8c72-da4c671e2243

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e49ac284-5a58-4c7d-8c72-da4c671e2243
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e49ac284-5a58-4c7d-8c72-da4c671e2243
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a731ab5-0a08-463a-9617-081edf44f7a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a731ab5-0a08-463a-9617-081edf44f7a0
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a731ab5-0a08-463a-9617-081edf44f7a0
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-1306f31b-5697-4515-8603-ab68e48497a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1306f31b-5697-4515-8603-ab68e48497a1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1306f31b-5697-4515-8603-ab68e48497a1
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-9286e2dc-28d4-46bf-b1a9-b5bdadffa492

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9286e2dc-28d4-46bf-b1a9-b5bdadffa492
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9286e2dc-28d4-46bf-b1a9-b5bdadffa492
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-6527390b-f8a7-4b24-b049-cdb54285ef98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6527390b-f8a7-4b24-b049-cdb54285ef98
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6527390b-f8a7-4b24-b049-cdb54285ef98
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e6fbd6f-ce9b-4e3a-967c-2b3f95dc2ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e6fbd6f-ce9b-4e3a-967c-2b3f95dc2ee5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e6fbd6f-ce9b-4e3a-967c-2b3f95dc2ee5
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-54b648f8-53cf-4805-b73c-5265ff7f380d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54b648f8-53cf-4805-b73c-5265ff7f380d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-54b648f8-53cf-4805-b73c-5265ff7f380d
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-67a96926-27f1-4661-92ae-c62ad55f7076

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a96926-27f1-4661-92ae-c62ad55f7076
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-67a96926-27f1-4661-92ae-c62ad55f7076
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-0983a679-cb57-4dca-a842-d3b66d561e88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0983a679-cb57-4dca-a842-d3b66d561e88
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0983a679-cb57-4dca-a842-d3b66d561e88
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0cc39030-00ae-4b60-b320-ae8d7ec52cea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cc39030-00ae-4b60-b320-ae8d7ec52cea
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cc39030-00ae-4b60-b320-ae8d7ec52cea
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-311784aa-eab2-431c-8498-215b7e1a12b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311784aa-eab2-431c-8498-215b7e1a12b1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-311784aa-eab2-431c-8498-215b7e1a12b1
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e273be2-0778-4b87-9029-367dc37a0e56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e273be2-0778-4b87-9029-367dc37a0e56
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e273be2-0778-4b87-9029-367dc37a0e56
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-9bf89e9a-0e19-4bb3-b189-5269010d21ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bf89e9a-0e19-4bb3-b189-5269010d21ae
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bf89e9a-0e19-4bb3-b189-5269010d21ae
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-48b91e68-8691-4c7c-8edb-336840ddac03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b91e68-8691-4c7c-8edb-336840ddac03
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-48b91e68-8691-4c7c-8edb-336840ddac03
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c69d277-ca71-469f-85a4-825a2940f4b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c69d277-ca71-469f-85a4-825a2940f4b4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c69d277-ca71-469f-85a4-825a2940f4b4
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7098c7b-83f4-4198-9724-5e74832322a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7098c7b-83f4-4198-9724-5e74832322a2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7098c7b-83f4-4198-9724-5e74832322a2
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-d92cd80d-9856-46f0-a196-be94404cfef4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d92cd80d-9856-46f0-a196-be94404cfef4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d92cd80d-9856-46f0-a196-be94404cfef4
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-68f159e2-c561-4966-b0aa-22ddd0da5e6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f159e2-c561-4966-b0aa-22ddd0da5e6f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-68f159e2-c561-4966-b0aa-22ddd0da5e6f
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1ae9949-eb00-4e42-a942-ec0f8b53374a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1ae9949-eb00-4e42-a942-ec0f8b53374a
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1ae9949-eb00-4e42-a942-ec0f8b53374a
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-69b859e6-5a77-49e5-95f6-f7e84bda221b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69b859e6-5a77-49e5-95f6-f7e84bda221b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-69b859e6-5a77-49e5-95f6-f7e84bda221b
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-18d6c9ba-e6e6-4529-9f3f-04f9dccd9ffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d6c9ba-e6e6-4529-9f3f-04f9dccd9ffb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-18d6c9ba-e6e6-4529-9f3f-04f9dccd9ffb
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad0cc159-b90a-4344-9cdd-e4a16ea566c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad0cc159-b90a-4344-9cdd-e4a16ea566c2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad0cc159-b90a-4344-9cdd-e4a16ea566c2
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b70962d-3855-43fe-8ad7-d2a5dea147e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b70962d-3855-43fe-8ad7-d2a5dea147e3
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b70962d-3855-43fe-8ad7-d2a5dea147e3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3b70962d-3855-43fe-8ad7-d2a5dea147e3"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-a663de40-9aea-495a-93c0-c615b5426586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a663de40-9aea-495a-93c0-c615b5426586
Content-Type: application/json

--- request body ---
{"handle":"qa-d0541d99faee","password":"****"}

--- response: 429 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a663de40-9aea-495a-93c0-c615b5426586
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-a663de40-9aea-495a-93c0-c615b5426586"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-4d62f5dd-f234-4f29-ba58-4913bb717314

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d62f5dd-f234-4f29-ba58-4913bb717314
Content-Type: application/json

--- request body ---
{"handle":"qa-af613b5fac8f","displayName":"QA af613b5fac8f","password":"****","region":"eu"}

--- response: 429 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d62f5dd-f234-4f29-ba58-4913bb717314
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-4d62f5dd-f234-4f29-ba58-4913bb717314"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-812d288f-c6ff-45c2-9c73-12ec445c3d11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-812d288f-c6ff-45c2-9c73-12ec445c3d11
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-812d288f-c6ff-45c2-9c73-12ec445c3d11
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-812d288f-c6ff-45c2-9c73-12ec445c3d11"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-243b81bc-223d-4181-a6de-5cf45e295a2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-243b81bc-223d-4181-a6de-5cf45e295a2b
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-243b81bc-223d-4181-a6de-5cf45e295a2b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-243b81bc-223d-4181-a6de-5cf45e295a2b"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae91b6c8-1c76-4056-8ecf-4a14c9620e99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae91b6c8-1c76-4056-8ecf-4a14c9620e99
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae91b6c8-1c76-4056-8ecf-4a14c9620e99
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ae91b6c8-1c76-4056-8ecf-4a14c9620e99"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-d0541d99faee
correlation: qa-6a05971d-24cc-4422-82bd-756ed838c42b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a05971d-24cc-4422-82bd-756ed838c42b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a05971d-24cc-4422-82bd-756ed838c42b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-d0541d99faee","correlationId":"qa-6a05971d-24cc-4422-82bd-756ed838c42b"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-f4275839-4b84-434a-88b7-035b8a3d1400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4275839-4b84-434a-88b7-035b8a3d1400
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d0541d99faee","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4275839-4b84-434a-88b7-035b8a3d1400
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-f4275839-4b84-434a-88b7-035b8a3d1400"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-328ee8b9-7136-42ed-b0bf-2bebe3552c18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-328ee8b9-7136-42ed-b0bf-2bebe3552c18
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-328ee8b9-7136-42ed-b0bf-2bebe3552c18
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-328ee8b9-7136-42ed-b0bf-2bebe3552c18"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e
correlation: qa-c68872cc-6182-40f6-80b9-908bf97f7570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c68872cc-6182-40f6-80b9-908bf97f7570
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c68872cc-6182-40f6-80b9-908bf97f7570
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e","correlationId":"qa-c68872cc-6182-40f6-80b9-908bf97f7570"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/messages
correlation: qa-b53f36fb-ff17-4b37-bace-89d2af6cbd87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53f36fb-ff17-4b37-bace-89d2af6cbd87
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b53f36fb-ff17-4b37-bace-89d2af6cbd87
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/messages","correlationId":"qa-b53f36fb-ff17-4b37-bace-89d2af6cbd87"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/messages
correlation: qa-09e22ee9-ee12-4fa1-830d-5d3b75618acd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e22ee9-ee12-4fa1-830d-5d3b75618acd
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09e22ee9-ee12-4fa1-830d-5d3b75618acd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/messages","correlationId":"qa-09e22ee9-ee12-4fa1-830d-5d3b75618acd"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/read
correlation: qa-60324d58-8dd4-44f4-9785-9262063fee47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60324d58-8dd4-44f4-9785-9262063fee47
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60324d58-8dd4-44f4-9785-9262063fee47
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/read","correlationId":"qa-60324d58-8dd4-44f4-9785-9262063fee47"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/close
correlation: qa-d6af21f6-64d2-4f61-aac6-670d955a37e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6af21f6-64d2-4f61-aac6-670d955a37e2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6af21f6-64d2-4f61-aac6-670d955a37e2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_ada009d9-76c2-412c-a33a-4525f5ac848e/close","correlationId":"qa-d6af21f6-64d2-4f61-aac6-670d955a37e2"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-70e9a281-24cf-4397-9fea-76f2368c5b9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70e9a281-24cf-4397-9fea-76f2368c5b9c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70e9a281-24cf-4397-9fea-76f2368c5b9c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-70e9a281-24cf-4397-9fea-76f2368c5b9c"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-9073da38-37df-45ba-93d6-94daf9a70a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9073da38-37df-45ba-93d6-94daf9a70a02
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9073da38-37df-45ba-93d6-94daf9a70a02
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-9073da38-37df-45ba-93d6-94daf9a70a02"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-695791bc-6bce-4606-b676-1ed46e6929cb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9ae4976773b34cbaaa318d7c1b41c006
X-Correlation-Id: qa-695791bc-6bce-4606-b676-1ed46e6929cb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-695791bc-6bce-4606-b676-1ed46e6929cb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-695791bc-6bce-4606-b676-1ed46e6929cb"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-4383d97c-7559-4923-8635-05d5e80f54be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4383d97c-7559-4923-8635-05d5e80f54be
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4383d97c-7559-4923-8635-05d5e80f54be
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-4383d97c-7559-4923-8635-05d5e80f54be"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e930e1a-58c3-4643-bd01-191236e633e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e930e1a-58c3-4643-bd01-191236e633e9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e930e1a-58c3-4643-bd01-191236e633e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3e930e1a-58c3-4643-bd01-191236e633e9"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cf325c3-a535-4b1f-a91a-58dc717bcd24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cf325c3-a535-4b1f-a91a-58dc717bcd24
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 05 Nov 2026 09:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8cf325c3-a535-4b1f-a91a-58dc717bcd24
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8cf325c3-a535-4b1f-a91a-58dc717bcd24"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-734e8312-05b5-4ebf-9bfd-c8573af247d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734e8312-05b5-4ebf-9bfd-c8573af247d7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-734e8312-05b5-4ebf-9bfd-c8573af247d7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-734e8312-05b5-4ebf-9bfd-c8573af247d7"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-39c5eaa7-b61a-40c9-bafe-122b756079b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39c5eaa7-b61a-40c9-bafe-122b756079b7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39c5eaa7-b61a-40c9-bafe-122b756079b7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39c5eaa7-b61a-40c9-bafe-122b756079b7"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4532adf-5da2-4af1-a1b3-0da7b33d77b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4532adf-5da2-4af1-a1b3-0da7b33d77b2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4532adf-5da2-4af1-a1b3-0da7b33d77b2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e4532adf-5da2-4af1-a1b3-0da7b33d77b2"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bb06c56-d98f-4ce1-b3a2-7b9a435dd59a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb06c56-d98f-4ce1-b3a2-7b9a435dd59a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bb06c56-d98f-4ce1-b3a2-7b9a435dd59a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2bb06c56-d98f-4ce1-b3a2-7b9a435dd59a"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eebd7ef-a6d1-44b7-8f55-9f0376d448ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eebd7ef-a6d1-44b7-8f55-9f0376d448ed
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:38:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6eebd7ef-a6d1-44b7-8f55-9f0376d448ed
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6eebd7ef-a6d1-44b7-8f55-9f0376d448ed"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-29942ec9-fedb-486b-aca6-5f928826f9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29942ec9-fedb-486b-aca6-5f928826f9c3
Content-Type: application/json

--- response: 429 in 21 ms ---
Date: Thu, 05 Nov 2026 09:38:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29942ec9-fedb-486b-aca6-5f928826f9c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-29942ec9-fedb-486b-aca6-5f928826f9c3"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-18e73584-73a9-4e5f-aa3e-a68a0c280577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18e73584-73a9-4e5f-aa3e-a68a0c280577
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 05 Nov 2026 09:38:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18e73584-73a9-4e5f-aa3e-a68a0c280577
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-18e73584-73a9-4e5f-aa3e-a68a0c280577"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ceba361-5727-4b72-8879-78d3a7396eff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ceba361-5727-4b72-8879-78d3a7396eff
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 05 Nov 2026 09:38:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ceba361-5727-4b72-8879-78d3a7396eff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ceba361-5727-4b72-8879-78d3a7396eff"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-477eb737-94f7-4a9d-87f1-4d682d00615c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-477eb737-94f7-4a9d-87f1-4d682d00615c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-477eb737-94f7-4a9d-87f1-4d682d00615c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-477eb737-94f7-4a9d-87f1-4d682d00615c"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5959b0d-de79-4df2-97d5-b290b1676525

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5959b0d-de79-4df2-97d5-b290b1676525
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:38:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5959b0d-de79-4df2-97d5-b290b1676525
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c5959b0d-de79-4df2-97d5-b290b1676525"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8a7ef62-17ec-4d51-9810-f4a0f6906cb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a7ef62-17ec-4d51-9810-f4a0f6906cb0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8a7ef62-17ec-4d51-9810-f4a0f6906cb0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c8a7ef62-17ec-4d51-9810-f4a0f6906cb0"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-94d46a3e-7178-4d64-813c-22bf38656d27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94d46a3e-7178-4d64-813c-22bf38656d27
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94d46a3e-7178-4d64-813c-22bf38656d27
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-94d46a3e-7178-4d64-813c-22bf38656d27"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-df1069cc-70fa-4b40-8922-bbc5e29d66ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df1069cc-70fa-4b40-8922-bbc5e29d66ab
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:38:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df1069cc-70fa-4b40-8922-bbc5e29d66ab
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-df1069cc-70fa-4b40-8922-bbc5e29d66ab"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d54ab62-a0a1-4708-835a-51145114c352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d54ab62-a0a1-4708-835a-51145114c352
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d54ab62-a0a1-4708-835a-51145114c352
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

{"id":"acc_c953ce3a-5624-43ec-80b9-fbf042995cb2","handle":"qa-d0541d99faee","displayName":"QA d0541d99faee","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.708465344Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-4fbe4bce-c14c-4f99-8cd3-e4af4fefb7d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fbe4bce-c14c-4f99-8cd3-e4af4fefb7d6
Content-Type: application/json

--- request body ---
{"handle":"qa-5d1a1fbe9d7e","password":"****"}

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fbe4bce-c14c-4f99-8cd3-e4af4fefb7d6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9978042e-95e6-4cdd-8d59-4cee53d5202d"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7834140e-609a-4a3a-8bd2-2f1231f64724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7834140e-609a-4a3a-8bd2-2f1231f64724
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7834140e-609a-4a3a-8bd2-2f1231f64724
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
correlation: qa-8af38e35-5c0b-4b32-ad47-e8b764d8d7a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af38e35-5c0b-4b32-ad47-e8b764d8d7a0
Content-Type: application/json

--- request body ---
{"handle":"qa-5d1a1fbe9d7e","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8af38e35-5c0b-4b32-ad47-e8b764d8d7a0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8af38e35-5c0b-4b32-ad47-e8b764d8d7a0"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e15700ef-b3dc-4696-85c1-d8bae9bbb676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e15700ef-b3dc-4696-85c1-d8bae9bbb676
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e15700ef-b3dc-4696-85c1-d8bae9bbb676
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
correlation: qa-204904f1-9e44-44e3-a310-60fb001c2fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-204904f1-9e44-44e3-a310-60fb001c2fd6
Content-Type: application/json

--- request body ---
{"handle":"qa-d0541d99faee","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-204904f1-9e44-44e3-a310-60fb001c2fd6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-204904f1-9e44-44e3-a310-60fb001c2fd6"}
```
