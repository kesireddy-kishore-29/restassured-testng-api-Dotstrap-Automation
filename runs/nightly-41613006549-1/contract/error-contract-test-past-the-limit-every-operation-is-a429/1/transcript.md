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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-eee06b9e-f8eb-4eb4-ad8e-c9a499df09dd` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-f6074d33-5fc2-47d9-bf9f-9cf38f6c5bad` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-b0b8c5b0-5528-4abc-a399-eb1f2cd063ac` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-0adf86a3-d3d8-44ba-a102-6476cb50ad24` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-d3ca97cf-a0fb-43b9-878b-5a2c23f0304d` |
| 6 | `GET /v1/accounts/me` | 200 | 12 | `qa-a225cdaf-be75-4ed8-8561-41bc68e03efc` |
| 7 | `GET /v1/accounts/me` | 200 | 21 | `qa-d0c0b082-eee1-4494-9e4f-83c7e3cb016c` |
| 8 | `GET /v1/accounts/me` | 200 | 18 | `qa-a81ce1c1-2562-4236-a284-fa7a81b1d312` |
| 9 | `GET /v1/accounts/me` | 200 | 16 | `qa-b906929b-ad75-48aa-8fa7-88e6e9b2c420` |
| 10 | `GET /v1/accounts/me` | 200 | 14 | `qa-d1564ac6-afe6-428d-8f6e-23c77d81eda0` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-9190c3d6-f442-4424-ae9e-79b4ce309cb9` |
| 12 | `GET /v1/accounts/me` | 200 | 9 | `qa-96642969-6729-42b2-bef6-3e1e02449c15` |
| 13 | `GET /v1/accounts/me` | 200 | 16 | `qa-7875b528-0219-456d-80df-badfa28aaa05` |
| 14 | `GET /v1/accounts/me` | 200 | 24 | `qa-5f3f07ee-f643-4788-aaae-fa780f078944` |
| 15 | `GET /v1/accounts/me` | 200 | 21 | `qa-8a141ec5-ae0c-46fa-9af4-5772f212a7a5` |
| 16 | `GET /v1/accounts/me` | 200 | 12 | `qa-91d80e97-ba4a-4fb0-ac9c-4b57038124d6` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-0e3a489c-d0c7-47d5-8cc4-074e382afc70` |
| 18 | `GET /v1/accounts/me` | 200 | 18 | `qa-512f283f-ef7c-47b9-a594-dc52d26f2b5a` |
| 19 | `GET /v1/accounts/me` | 200 | 17 | `qa-fbe53de1-e076-4770-a75e-9371d67ba694` |
| 20 | `GET /v1/accounts/me` | 200 | 15 | `qa-9c74a9bd-eb57-4758-b9f2-c069525f8769` |
| 21 | `GET /v1/accounts/me` | 200 | 12 | `qa-f6094bd8-b9ea-4458-b52d-3c064fac1f70` |
| 22 | `GET /v1/accounts/me` | 200 | 9 | `qa-0f694c42-f1e9-48b8-8f04-a1f8b1e07983` |
| 23 | `GET /v1/accounts/me` | 200 | 14 | `qa-e78c1faf-c4bd-47bc-b6c1-8bbffd47faff` |
| 24 | `GET /v1/accounts/me` | 200 | 12 | `qa-d31e0077-9e6a-4f9a-9c16-6e00fccef2d1` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-29c5755e-293e-462a-a22b-a766dca7588b` |
| 26 | `GET /v1/accounts/me` | 200 | 23 | `qa-98f00bb2-33a1-4bf6-a3fc-8fc66af8916e` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-b4e8eaa3-a9f0-4827-ae2e-ce5099970f1e` |
| 28 | `GET /v1/accounts/me` | 200 | 15 | `qa-94fdf8f2-893d-4d43-8360-d5b78bc8c2c1` |
| 29 | `GET /v1/accounts/me` | 200 | 7 | `qa-8df51949-01ee-4fe6-897b-47197759c93f` |
| 30 | `GET /v1/accounts/me` | 200 | 18 | `qa-d0b73261-a167-440e-a9a6-fca1f166fb3e` |
| 31 | `GET /v1/accounts/me` | 200 | 11 | `qa-ccd27308-013c-4419-8086-eade519c56fa` |
| 32 | `GET /v1/accounts/me` | 200 | 7 | `qa-7b08dd35-570e-418e-be44-57e7cfd64202` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-43dbfbe5-a4cd-4418-b3d8-670f941ff377` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-fdf6d406-a006-4833-b2bb-d46dedc93f23` |
| 35 | `GET /v1/accounts/me` | 200 | 23 | `qa-c0d7c8bd-9857-4047-b863-d0ae8b089475` |
| 36 | `GET /v1/accounts/me` | 200 | 8 | `qa-b054f747-44a2-4a5e-889b-bb1b6ecc4417` |
| 37 | `GET /v1/accounts/me` | 200 | 12 | `qa-ce8e8065-8143-4d6c-b4e7-99899949a7ad` |
| 38 | `GET /v1/accounts/me` | 200 | 9 | `qa-1a249a1b-9cce-4851-a698-ce987dc56adb` |
| 39 | `GET /v1/accounts/me` | 200 | 14 | `qa-5dad66dc-afd2-4fb3-ab30-23abfe7e2e80` |
| 40 | `GET /v1/accounts/me` | 200 | 3 | `qa-d803cf23-c5ff-4f6f-8d21-7d99eefbc831` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-ab7ffb59-8f31-4416-94c3-10aca5f63b5b` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-ad239059-d7e7-44e3-943c-b32e017ccbd9` |
| 43 | `GET /v1/accounts/me` | 200 | 15 | `qa-8f2fdd6b-e2cb-4640-be57-ccaec0daff31` |
| 44 | `GET /v1/accounts/me` | 200 | 10 | `qa-cb70dc4f-8f29-4a4a-ba26-0e4b1d5d7a51` |
| 45 | `GET /v1/accounts/me` | 200 | 14 | `qa-b88222f8-a741-45f7-aeef-21fcd2321dcc` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-e9821212-546d-46e6-848a-ba80fdb830af` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-33163c59-b5f5-44f7-94b8-a73ff719d97c` |
| 48 | `GET /v1/accounts/me` | 200 | 37 | `qa-f9dcb57d-8b8a-41a9-85c4-1aa1e5bfd7e6` |
| 49 | `GET /v1/accounts/me` | 200 | 16 | `qa-9494b629-166b-42b3-b9ab-73130204c055` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-facba0e8-8710-4473-8b5d-cbccf7317313` |
| 51 | `GET /v1/accounts/me` | 200 | 11 | `qa-18b43998-bc92-40a1-823b-db2a9eaa1cd6` |
| 52 | `GET /v1/accounts/me` | 200 | 12 | `qa-302a06bb-8400-4e66-8fe4-1e47c879e1b3` |
| 53 | `GET /v1/accounts/me` | 200 | 7 | `qa-381e4a8c-03d5-4f0c-bf43-270dd76d3b19` |
| 54 | `GET /v1/accounts/me` | 200 | 8 | `qa-083de819-12d6-412c-8ddd-eb0e73daa8e3` |
| 55 | `GET /v1/accounts/me` | 200 | 13 | `qa-a15eb28e-225b-4663-88ad-e323db4ac5ea` |
| 56 | `GET /v1/accounts/me` | 200 | 11 | `qa-55d3a3e1-4afb-4b45-9609-7b0ce9dbcedc` |
| 57 | `GET /v1/accounts/me` | 200 | 12 | `qa-afb34a3b-3019-43ff-b367-b75fed7c2b1e` |
| 58 | `GET /v1/accounts/me` | 200 | 14 | `qa-15a2df08-801f-4c31-9e9c-c8e1966b7b9e` |
| 59 | `GET /v1/accounts/me` | 200 | 16 | `qa-67ed1309-a026-45ec-bdf6-191b8c25305c` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-afefcd2a-faf3-4422-a010-1d59c3761a69` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-6dc68883-41c8-429b-888a-e11f1b3c4607` |
| 62 | `GET /v1/accounts/me` | 200 | 9 | `qa-e6d3c926-3c8d-4666-a9e5-24756b1932af` |
| 63 | `GET /v1/accounts/me` | 200 | 10 | `qa-095153cd-265a-443e-823e-fe23e308fdea` |
| 64 | `GET /v1/accounts/me` | 429 | 10 | `qa-d502065a-15d3-42cc-94cd-22a112de7edf` |
| 65 | `POST /v1/auth/token` | 429 | 8 | `qa-8a010aab-3f7e-4863-b884-fcf556b0a78b` |
| 66 | `POST /v1/accounts` | 429 | 3 | `qa-cd449cbc-197b-41cd-971e-2e0cfa1323bc` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-476be780-d80c-4563-8564-0ac75e953bcd` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-b4b90548-335e-4661-a70a-beaaaf1912ce` |
| 69 | `DELETE /v1/accounts/me` | 429 | 8 | `qa-5b1675e2-7fb9-4076-b425-0681be6c02cd` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 6 | `qa-6ae44187-ab31-43b7-886a-70abbd762181` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-0da13898-e530-47f8-a5b9-c0d9c607f9f7` |
| 72 | `GET /v1/conversations` | 429 | 5 | `qa-b27f3315-ea72-491d-95b4-8fe55a6f4fe5` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-4db2b02f-afef-48d8-9812-77585e5ab231` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-07ed5a7b-4de0-428f-9d3e-7c96d46d3710` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-f28f006e-b028-4e4e-beed-2693c39fe7fa` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-a18202b0-eb8f-4e3e-acf6-fccbc0715978` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 6 | `qa-3293e157-f8df-400c-ac4b-b17f12101fb6` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-40f37fbe-3210-4531-8a6b-0ffc9ea14fb2` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-c4394a2c-af80-439c-adea-17aa8236d30f` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-8e22be80-9f6d-44ec-bc22-9275d9704656` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-44bc6e41-5381-49e7-a0bf-1bfc59c6ddbd` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-b08e33ca-299d-4c56-bea0-03725f7f90db` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-62a463c8-08a3-4e6b-b5c9-658f591fec53` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-8e02e24b-2a07-4f7b-ae5b-41c386352e02` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-6d95b719-af8d-4cd7-8c7f-e605046fcf3e` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-607849ab-b8df-4c4e-9a64-312c0ecb16a7` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-326658ed-f4e4-47a8-8aa5-a79df0dbebe0` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-90f5c5e8-8e1e-41b5-a1f5-95a389cbfeda` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-f2a35951-84a7-4afd-ae73-dead36e7f2dc` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-11f41188-3472-4602-8a44-67a952fa7351` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-7d676f90-44a4-480c-b914-27cf3e0b5e79` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-08241a36-3a02-4c47-bf72-2310aa29d25c` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-9c6c783e-ae10-42a6-9dd1-db51b3abb4bf` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-3ca9bc9f-4c93-4125-9b5b-4ace4ec50c09` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-48e80358-989a-432f-ba84-896ffbc316fc` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-f336e7b5-7967-4b27-844f-19903e84b85b` |
| 97 | `GET /v1/accounts/me` | 429 | 7 | `qa-54b680a1-a7d1-4cc8-95d8-ba97419709a3` |
| 98 | `GET /v1/accounts/me` | 200 | 7 | `qa-06450859-feaf-4c59-be7d-82fad1c305e5` |
| 99 | `POST /v1/auth/token` | 200 | 7 | `qa-98f14ce4-963d-415e-befe-471436bd4a14` |
| 100 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-86194abe-7b20-4cab-8af1-b740accdb1c7` |
| 101 | `POST /v1/auth/token` | 401 | 4 | `qa-23c13c32-7753-4622-9558-fe6cbf88090e` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-5800d3b8-7234-4eb3-9471-c18e81445326` |
| 103 | `POST /v1/auth/token` | 401 | 3 | `qa-3fb954be-8b29-414c-b35b-c5251d9a2804` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eee06b9e-f8eb-4eb4-ad8e-c9a499df09dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eee06b9e-f8eb-4eb4-ad8e-c9a499df09dd
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-eee06b9e-f8eb-4eb4-ad8e-c9a499df09dd
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
Location: /v1/accounts/qa-8c3c66674ea5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f6074d33-5fc2-47d9-bf9f-9cf38f6c5bad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6074d33-5fc2-47d9-bf9f-9cf38f6c5bad
Content-Type: application/json

--- request body ---
{"handle":"qa-e10db7be3f44","displayName":"QA e10db7be3f44","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6074d33-5fc2-47d9-bf9f-9cf38f6c5bad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 9
Location: /v1/accounts/qa-e10db7be3f44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5c17fe96-ccd8-4e12-9fc3-0ef0c80ba923","handle":"qa-e10db7be3f44","displayName":"QA e10db7be3f44","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.754945768Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b0b8c5b0-5528-4abc-a399-eb1f2cd063ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0b8c5b0-5528-4abc-a399-eb1f2cd063ac
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3c66674ea5","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0b8c5b0-5528-4abc-a399-eb1f2cd063ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0adf86a3-d3d8-44ba-a102-6476cb50ad24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0adf86a3-d3d8-44ba-a102-6476cb50ad24
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e10db7be3f44","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0adf86a3-d3d8-44ba-a102-6476cb50ad24
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
Location: /v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0cbd7435-e022-4404-8167-85228f26f6b7","subject":"Error contract","status":"open","region":"eu","participants":["qa-8c3c66674ea5","qa-e10db7be3f44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.801264817Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3ca97cf-a0fb-43b9-878b-5a2c23f0304d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ca97cf-a0fb-43b9-878b-5a2c23f0304d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3ca97cf-a0fb-43b9-878b-5a2c23f0304d
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-a225cdaf-be75-4ed8-8561-41bc68e03efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a225cdaf-be75-4ed8-8561-41bc68e03efc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a225cdaf-be75-4ed8-8561-41bc68e03efc
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0c0b082-eee1-4494-9e4f-83c7e3cb016c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0c0b082-eee1-4494-9e4f-83c7e3cb016c
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0c0b082-eee1-4494-9e4f-83c7e3cb016c
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-a81ce1c1-2562-4236-a284-fa7a81b1d312

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a81ce1c1-2562-4236-a284-fa7a81b1d312
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a81ce1c1-2562-4236-a284-fa7a81b1d312
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-b906929b-ad75-48aa-8fa7-88e6e9b2c420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b906929b-ad75-48aa-8fa7-88e6e9b2c420
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b906929b-ad75-48aa-8fa7-88e6e9b2c420
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1564ac6-afe6-428d-8f6e-23c77d81eda0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1564ac6-afe6-428d-8f6e-23c77d81eda0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1564ac6-afe6-428d-8f6e-23c77d81eda0
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-9190c3d6-f442-4424-ae9e-79b4ce309cb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9190c3d6-f442-4424-ae9e-79b4ce309cb9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9190c3d6-f442-4424-ae9e-79b4ce309cb9
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-96642969-6729-42b2-bef6-3e1e02449c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96642969-6729-42b2-bef6-3e1e02449c15
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-96642969-6729-42b2-bef6-3e1e02449c15
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-7875b528-0219-456d-80df-badfa28aaa05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7875b528-0219-456d-80df-badfa28aaa05
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7875b528-0219-456d-80df-badfa28aaa05
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f3f07ee-f643-4788-aaae-fa780f078944

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f3f07ee-f643-4788-aaae-fa780f078944
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f3f07ee-f643-4788-aaae-fa780f078944
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a141ec5-ae0c-46fa-9af4-5772f212a7a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a141ec5-ae0c-46fa-9af4-5772f212a7a5
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a141ec5-ae0c-46fa-9af4-5772f212a7a5
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-91d80e97-ba4a-4fb0-ac9c-4b57038124d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91d80e97-ba4a-4fb0-ac9c-4b57038124d6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-91d80e97-ba4a-4fb0-ac9c-4b57038124d6
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e3a489c-d0c7-47d5-8cc4-074e382afc70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e3a489c-d0c7-47d5-8cc4-074e382afc70
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e3a489c-d0c7-47d5-8cc4-074e382afc70
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-512f283f-ef7c-47b9-a594-dc52d26f2b5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512f283f-ef7c-47b9-a594-dc52d26f2b5a
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-512f283f-ef7c-47b9-a594-dc52d26f2b5a
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-fbe53de1-e076-4770-a75e-9371d67ba694

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbe53de1-e076-4770-a75e-9371d67ba694
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbe53de1-e076-4770-a75e-9371d67ba694
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c74a9bd-eb57-4758-b9f2-c069525f8769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c74a9bd-eb57-4758-b9f2-c069525f8769
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c74a9bd-eb57-4758-b9f2-c069525f8769
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6094bd8-b9ea-4458-b52d-3c064fac1f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6094bd8-b9ea-4458-b52d-3c064fac1f70
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6094bd8-b9ea-4458-b52d-3c064fac1f70
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f694c42-f1e9-48b8-8f04-a1f8b1e07983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f694c42-f1e9-48b8-8f04-a1f8b1e07983
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f694c42-f1e9-48b8-8f04-a1f8b1e07983
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-e78c1faf-c4bd-47bc-b6c1-8bbffd47faff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78c1faf-c4bd-47bc-b6c1-8bbffd47faff
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78c1faf-c4bd-47bc-b6c1-8bbffd47faff
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-d31e0077-9e6a-4f9a-9c16-6e00fccef2d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d31e0077-9e6a-4f9a-9c16-6e00fccef2d1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d31e0077-9e6a-4f9a-9c16-6e00fccef2d1
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-29c5755e-293e-462a-a22b-a766dca7588b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c5755e-293e-462a-a22b-a766dca7588b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-29c5755e-293e-462a-a22b-a766dca7588b
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-98f00bb2-33a1-4bf6-a3fc-8fc66af8916e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98f00bb2-33a1-4bf6-a3fc-8fc66af8916e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f00bb2-33a1-4bf6-a3fc-8fc66af8916e
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4e8eaa3-a9f0-4827-ae2e-ce5099970f1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4e8eaa3-a9f0-4827-ae2e-ce5099970f1e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4e8eaa3-a9f0-4827-ae2e-ce5099970f1e
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-94fdf8f2-893d-4d43-8360-d5b78bc8c2c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94fdf8f2-893d-4d43-8360-d5b78bc8c2c1
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-94fdf8f2-893d-4d43-8360-d5b78bc8c2c1
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-8df51949-01ee-4fe6-897b-47197759c93f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8df51949-01ee-4fe6-897b-47197759c93f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8df51949-01ee-4fe6-897b-47197759c93f
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0b73261-a167-440e-a9a6-fca1f166fb3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0b73261-a167-440e-a9a6-fca1f166fb3e
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0b73261-a167-440e-a9a6-fca1f166fb3e
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-ccd27308-013c-4419-8086-eade519c56fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccd27308-013c-4419-8086-eade519c56fa
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccd27308-013c-4419-8086-eade519c56fa
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b08dd35-570e-418e-be44-57e7cfd64202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b08dd35-570e-418e-be44-57e7cfd64202
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b08dd35-570e-418e-be44-57e7cfd64202
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-43dbfbe5-a4cd-4418-b3d8-670f941ff377

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43dbfbe5-a4cd-4418-b3d8-670f941ff377
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-43dbfbe5-a4cd-4418-b3d8-670f941ff377
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdf6d406-a006-4833-b2bb-d46dedc93f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdf6d406-a006-4833-b2bb-d46dedc93f23
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdf6d406-a006-4833-b2bb-d46dedc93f23
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0d7c8bd-9857-4047-b863-d0ae8b089475

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0d7c8bd-9857-4047-b863-d0ae8b089475
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0d7c8bd-9857-4047-b863-d0ae8b089475
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-b054f747-44a2-4a5e-889b-bb1b6ecc4417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b054f747-44a2-4a5e-889b-bb1b6ecc4417
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b054f747-44a2-4a5e-889b-bb1b6ecc4417
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce8e8065-8143-4d6c-b4e7-99899949a7ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce8e8065-8143-4d6c-b4e7-99899949a7ad
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8e8065-8143-4d6c-b4e7-99899949a7ad
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a249a1b-9cce-4851-a698-ce987dc56adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a249a1b-9cce-4851-a698-ce987dc56adb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a249a1b-9cce-4851-a698-ce987dc56adb
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dad66dc-afd2-4fb3-ab30-23abfe7e2e80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dad66dc-afd2-4fb3-ab30-23abfe7e2e80
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dad66dc-afd2-4fb3-ab30-23abfe7e2e80
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-d803cf23-c5ff-4f6f-8d21-7d99eefbc831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d803cf23-c5ff-4f6f-8d21-7d99eefbc831
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d803cf23-c5ff-4f6f-8d21-7d99eefbc831
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab7ffb59-8f31-4416-94c3-10aca5f63b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7ffb59-8f31-4416-94c3-10aca5f63b5b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab7ffb59-8f31-4416-94c3-10aca5f63b5b
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad239059-d7e7-44e3-943c-b32e017ccbd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad239059-d7e7-44e3-943c-b32e017ccbd9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad239059-d7e7-44e3-943c-b32e017ccbd9
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f2fdd6b-e2cb-4640-be57-ccaec0daff31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f2fdd6b-e2cb-4640-be57-ccaec0daff31
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f2fdd6b-e2cb-4640-be57-ccaec0daff31
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb70dc4f-8f29-4a4a-ba26-0e4b1d5d7a51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb70dc4f-8f29-4a4a-ba26-0e4b1d5d7a51
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb70dc4f-8f29-4a4a-ba26-0e4b1d5d7a51
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-b88222f8-a741-45f7-aeef-21fcd2321dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b88222f8-a741-45f7-aeef-21fcd2321dcc
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b88222f8-a741-45f7-aeef-21fcd2321dcc
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9821212-546d-46e6-848a-ba80fdb830af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9821212-546d-46e6-848a-ba80fdb830af
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9821212-546d-46e6-848a-ba80fdb830af
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-33163c59-b5f5-44f7-94b8-a73ff719d97c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33163c59-b5f5-44f7-94b8-a73ff719d97c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-33163c59-b5f5-44f7-94b8-a73ff719d97c
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9dcb57d-8b8a-41a9-85c4-1aa1e5bfd7e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9dcb57d-8b8a-41a9-85c4-1aa1e5bfd7e6
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9dcb57d-8b8a-41a9-85c4-1aa1e5bfd7e6
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-9494b629-166b-42b3-b9ab-73130204c055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9494b629-166b-42b3-b9ab-73130204c055
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9494b629-166b-42b3-b9ab-73130204c055
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-facba0e8-8710-4473-8b5d-cbccf7317313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-facba0e8-8710-4473-8b5d-cbccf7317313
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-facba0e8-8710-4473-8b5d-cbccf7317313
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-18b43998-bc92-40a1-823b-db2a9eaa1cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b43998-bc92-40a1-823b-db2a9eaa1cd6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-18b43998-bc92-40a1-823b-db2a9eaa1cd6
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-302a06bb-8400-4e66-8fe4-1e47c879e1b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302a06bb-8400-4e66-8fe4-1e47c879e1b3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-302a06bb-8400-4e66-8fe4-1e47c879e1b3
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-381e4a8c-03d5-4f0c-bf43-270dd76d3b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-381e4a8c-03d5-4f0c-bf43-270dd76d3b19
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-381e4a8c-03d5-4f0c-bf43-270dd76d3b19
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-083de819-12d6-412c-8ddd-eb0e73daa8e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-083de819-12d6-412c-8ddd-eb0e73daa8e3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-083de819-12d6-412c-8ddd-eb0e73daa8e3
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-a15eb28e-225b-4663-88ad-e323db4ac5ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a15eb28e-225b-4663-88ad-e323db4ac5ea
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a15eb28e-225b-4663-88ad-e323db4ac5ea
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-55d3a3e1-4afb-4b45-9609-7b0ce9dbcedc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55d3a3e1-4afb-4b45-9609-7b0ce9dbcedc
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-55d3a3e1-4afb-4b45-9609-7b0ce9dbcedc
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-afb34a3b-3019-43ff-b367-b75fed7c2b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb34a3b-3019-43ff-b367-b75fed7c2b1e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-afb34a3b-3019-43ff-b367-b75fed7c2b1e
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-15a2df08-801f-4c31-9e9c-c8e1966b7b9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a2df08-801f-4c31-9e9c-c8e1966b7b9e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-15a2df08-801f-4c31-9e9c-c8e1966b7b9e
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-67ed1309-a026-45ec-bdf6-191b8c25305c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67ed1309-a026-45ec-bdf6-191b8c25305c
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-67ed1309-a026-45ec-bdf6-191b8c25305c
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-afefcd2a-faf3-4422-a010-1d59c3761a69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afefcd2a-faf3-4422-a010-1d59c3761a69
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-afefcd2a-faf3-4422-a010-1d59c3761a69
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-6dc68883-41c8-429b-888a-e11f1b3c4607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dc68883-41c8-429b-888a-e11f1b3c4607
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dc68883-41c8-429b-888a-e11f1b3c4607
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-e6d3c926-3c8d-4666-a9e5-24756b1932af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6d3c926-3c8d-4666-a9e5-24756b1932af
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6d3c926-3c8d-4666-a9e5-24756b1932af
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-095153cd-265a-443e-823e-fe23e308fdea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-095153cd-265a-443e-823e-fe23e308fdea
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-095153cd-265a-443e-823e-fe23e308fdea
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-d502065a-15d3-42cc-94cd-22a112de7edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d502065a-15d3-42cc-94cd-22a112de7edf
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d502065a-15d3-42cc-94cd-22a112de7edf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d502065a-15d3-42cc-94cd-22a112de7edf"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-8a010aab-3f7e-4863-b884-fcf556b0a78b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a010aab-3f7e-4863-b884-fcf556b0a78b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3c66674ea5","password":"****"}

--- response: 429 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a010aab-3f7e-4863-b884-fcf556b0a78b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-8a010aab-3f7e-4863-b884-fcf556b0a78b"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-cd449cbc-197b-41cd-971e-2e0cfa1323bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd449cbc-197b-41cd-971e-2e0cfa1323bc
Content-Type: application/json

--- request body ---
{"handle":"qa-7d14b6f9df5e","displayName":"QA 7d14b6f9df5e","password":"****","region":"eu"}

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd449cbc-197b-41cd-971e-2e0cfa1323bc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-cd449cbc-197b-41cd-971e-2e0cfa1323bc"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-476be780-d80c-4563-8564-0ac75e953bcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-476be780-d80c-4563-8564-0ac75e953bcd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-476be780-d80c-4563-8564-0ac75e953bcd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-476be780-d80c-4563-8564-0ac75e953bcd"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b4b90548-335e-4661-a70a-beaaaf1912ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4b90548-335e-4661-a70a-beaaaf1912ce
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4b90548-335e-4661-a70a-beaaaf1912ce
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b4b90548-335e-4661-a70a-beaaaf1912ce"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b1675e2-7fb9-4076-b425-0681be6c02cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b1675e2-7fb9-4076-b425-0681be6c02cd
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b1675e2-7fb9-4076-b425-0681be6c02cd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5b1675e2-7fb9-4076-b425-0681be6c02cd"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-8c3c66674ea5
correlation: qa-6ae44187-ab31-43b7-886a-70abbd762181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ae44187-ab31-43b7-886a-70abbd762181
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ae44187-ab31-43b7-886a-70abbd762181
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-8c3c66674ea5","correlationId":"qa-6ae44187-ab31-43b7-886a-70abbd762181"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-0da13898-e530-47f8-a5b9-c0d9c607f9f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0da13898-e530-47f8-a5b9-c0d9c607f9f7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c3c66674ea5","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0da13898-e530-47f8-a5b9-c0d9c607f9f7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-0da13898-e530-47f8-a5b9-c0d9c607f9f7"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-b27f3315-ea72-491d-95b4-8fe55a6f4fe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b27f3315-ea72-491d-95b4-8fe55a6f4fe5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b27f3315-ea72-491d-95b4-8fe55a6f4fe5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-b27f3315-ea72-491d-95b4-8fe55a6f4fe5"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7
correlation: qa-4db2b02f-afef-48d8-9812-77585e5ab231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4db2b02f-afef-48d8-9812-77585e5ab231
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4db2b02f-afef-48d8-9812-77585e5ab231
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7","correlationId":"qa-4db2b02f-afef-48d8-9812-77585e5ab231"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/messages
correlation: qa-07ed5a7b-4de0-428f-9d3e-7c96d46d3710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07ed5a7b-4de0-428f-9d3e-7c96d46d3710
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-07ed5a7b-4de0-428f-9d3e-7c96d46d3710
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/messages","correlationId":"qa-07ed5a7b-4de0-428f-9d3e-7c96d46d3710"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/messages
correlation: qa-f28f006e-b028-4e4e-beed-2693c39fe7fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f28f006e-b028-4e4e-beed-2693c39fe7fa
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f28f006e-b028-4e4e-beed-2693c39fe7fa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/messages","correlationId":"qa-f28f006e-b028-4e4e-beed-2693c39fe7fa"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/read
correlation: qa-a18202b0-eb8f-4e3e-acf6-fccbc0715978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18202b0-eb8f-4e3e-acf6-fccbc0715978
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a18202b0-eb8f-4e3e-acf6-fccbc0715978
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/read","correlationId":"qa-a18202b0-eb8f-4e3e-acf6-fccbc0715978"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/close
correlation: qa-3293e157-f8df-400c-ac4b-b17f12101fb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3293e157-f8df-400c-ac4b-b17f12101fb6
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3293e157-f8df-400c-ac4b-b17f12101fb6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_0cbd7435-e022-4404-8167-85228f26f6b7/close","correlationId":"qa-3293e157-f8df-400c-ac4b-b17f12101fb6"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-40f37fbe-3210-4531-8a6b-0ffc9ea14fb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40f37fbe-3210-4531-8a6b-0ffc9ea14fb2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40f37fbe-3210-4531-8a6b-0ffc9ea14fb2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-40f37fbe-3210-4531-8a6b-0ffc9ea14fb2"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c4394a2c-af80-439c-adea-17aa8236d30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4394a2c-af80-439c-adea-17aa8236d30f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4394a2c-af80-439c-adea-17aa8236d30f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-c4394a2c-af80-439c-adea-17aa8236d30f"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8e22be80-9f6d-44ec-bc22-9275d9704656

--- request headers ---
Accept: application/json
Idempotency-Key: qa-58ccbd31c7f14da4b4670784d9276aef
X-Correlation-Id: qa-8e22be80-9f6d-44ec-bc22-9275d9704656
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e22be80-9f6d-44ec-bc22-9275d9704656
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-8e22be80-9f6d-44ec-bc22-9275d9704656"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-44bc6e41-5381-49e7-a0bf-1bfc59c6ddbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44bc6e41-5381-49e7-a0bf-1bfc59c6ddbd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44bc6e41-5381-49e7-a0bf-1bfc59c6ddbd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-44bc6e41-5381-49e7-a0bf-1bfc59c6ddbd"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-b08e33ca-299d-4c56-bea0-03725f7f90db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b08e33ca-299d-4c56-bea0-03725f7f90db
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b08e33ca-299d-4c56-bea0-03725f7f90db
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b08e33ca-299d-4c56-bea0-03725f7f90db"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-62a463c8-08a3-4e6b-b5c9-658f591fec53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62a463c8-08a3-4e6b-b5c9-658f591fec53
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62a463c8-08a3-4e6b-b5c9-658f591fec53
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-62a463c8-08a3-4e6b-b5c9-658f591fec53"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e02e24b-2a07-4f7b-ae5b-41c386352e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e02e24b-2a07-4f7b-ae5b-41c386352e02
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e02e24b-2a07-4f7b-ae5b-41c386352e02
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8e02e24b-2a07-4f7b-ae5b-41c386352e02"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d95b719-af8d-4cd7-8c7f-e605046fcf3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d95b719-af8d-4cd7-8c7f-e605046fcf3e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d95b719-af8d-4cd7-8c7f-e605046fcf3e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6d95b719-af8d-4cd7-8c7f-e605046fcf3e"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-607849ab-b8df-4c4e-9a64-312c0ecb16a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-607849ab-b8df-4c4e-9a64-312c0ecb16a7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-607849ab-b8df-4c4e-9a64-312c0ecb16a7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-607849ab-b8df-4c4e-9a64-312c0ecb16a7"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-326658ed-f4e4-47a8-8aa5-a79df0dbebe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-326658ed-f4e4-47a8-8aa5-a79df0dbebe0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-326658ed-f4e4-47a8-8aa5-a79df0dbebe0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-326658ed-f4e4-47a8-8aa5-a79df0dbebe0"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-90f5c5e8-8e1e-41b5-a1f5-95a389cbfeda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90f5c5e8-8e1e-41b5-a1f5-95a389cbfeda
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90f5c5e8-8e1e-41b5-a1f5-95a389cbfeda
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-90f5c5e8-8e1e-41b5-a1f5-95a389cbfeda"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2a35951-84a7-4afd-ae73-dead36e7f2dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2a35951-84a7-4afd-ae73-dead36e7f2dc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2a35951-84a7-4afd-ae73-dead36e7f2dc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f2a35951-84a7-4afd-ae73-dead36e7f2dc"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-11f41188-3472-4602-8a44-67a952fa7351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11f41188-3472-4602-8a44-67a952fa7351
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11f41188-3472-4602-8a44-67a952fa7351
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-11f41188-3472-4602-8a44-67a952fa7351"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d676f90-44a4-480c-b914-27cf3e0b5e79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d676f90-44a4-480c-b914-27cf3e0b5e79
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d676f90-44a4-480c-b914-27cf3e0b5e79
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7d676f90-44a4-480c-b914-27cf3e0b5e79"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-08241a36-3a02-4c47-bf72-2310aa29d25c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08241a36-3a02-4c47-bf72-2310aa29d25c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08241a36-3a02-4c47-bf72-2310aa29d25c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-08241a36-3a02-4c47-bf72-2310aa29d25c"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c6c783e-ae10-42a6-9dd1-db51b3abb4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c6c783e-ae10-42a6-9dd1-db51b3abb4bf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c6c783e-ae10-42a6-9dd1-db51b3abb4bf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9c6c783e-ae10-42a6-9dd1-db51b3abb4bf"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ca9bc9f-4c93-4125-9b5b-4ace4ec50c09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ca9bc9f-4c93-4125-9b5b-4ace4ec50c09
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ca9bc9f-4c93-4125-9b5b-4ace4ec50c09
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3ca9bc9f-4c93-4125-9b5b-4ace4ec50c09"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-48e80358-989a-432f-ba84-896ffbc316fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48e80358-989a-432f-ba84-896ffbc316fc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48e80358-989a-432f-ba84-896ffbc316fc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-48e80358-989a-432f-ba84-896ffbc316fc"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-f336e7b5-7967-4b27-844f-19903e84b85b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f336e7b5-7967-4b27-844f-19903e84b85b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f336e7b5-7967-4b27-844f-19903e84b85b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f336e7b5-7967-4b27-844f-19903e84b85b"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-54b680a1-a7d1-4cc8-95d8-ba97419709a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54b680a1-a7d1-4cc8-95d8-ba97419709a3
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54b680a1-a7d1-4cc8-95d8-ba97419709a3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-54b680a1-a7d1-4cc8-95d8-ba97419709a3"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-06450859-feaf-4c59-be7d-82fad1c305e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06450859-feaf-4c59-be7d-82fad1c305e5
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-06450859-feaf-4c59-be7d-82fad1c305e5
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

{"id":"acc_1b24a42f-4846-42dc-bd4d-ff122a0b250b","handle":"qa-8c3c66674ea5","displayName":"QA 8c3c66674ea5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.726426775Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-98f14ce4-963d-415e-befe-471436bd4a14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98f14ce4-963d-415e-befe-471436bd4a14
Content-Type: application/json

--- request body ---
{"handle":"qa-e10db7be3f44","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f14ce4-963d-415e-befe-471436bd4a14
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5c17fe96-ccd8-4e12-9fc3-0ef0c80ba923"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-86194abe-7b20-4cab-8af1-b740accdb1c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86194abe-7b20-4cab-8af1-b740accdb1c7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-86194abe-7b20-4cab-8af1-b740accdb1c7
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
correlation: qa-23c13c32-7753-4622-9558-fe6cbf88090e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23c13c32-7753-4622-9558-fe6cbf88090e
Content-Type: application/json

--- request body ---
{"handle":"qa-e10db7be3f44","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23c13c32-7753-4622-9558-fe6cbf88090e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23c13c32-7753-4622-9558-fe6cbf88090e"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5800d3b8-7234-4eb3-9471-c18e81445326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5800d3b8-7234-4eb3-9471-c18e81445326
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5800d3b8-7234-4eb3-9471-c18e81445326
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
correlation: qa-3fb954be-8b29-414c-b35b-c5251d9a2804

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fb954be-8b29-414c-b35b-c5251d9a2804
Content-Type: application/json

--- request body ---
{"handle":"qa-8c3c66674ea5","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fb954be-8b29-414c-b35b-c5251d9a2804
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3fb954be-8b29-414c-b35b-c5251d9a2804"}
```
