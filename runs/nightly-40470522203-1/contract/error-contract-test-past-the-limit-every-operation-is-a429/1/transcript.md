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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-b39f1e52-2da8-4da2-bffb-2e8de6bb597f` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-38aed88d-5e4d-4afb-ad70-f5d454e9683c` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-3f3fd586-e535-4ba8-a7d3-e6a77f9d3aed` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-ef7f201b-91d6-4bfa-a13d-65981d4c0e7f` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-a6b0a3a4-efb7-4fcd-bd70-8998122e71f9` |
| 6 | `GET /v1/accounts/me` | 200 | 14 | `qa-e28ab3b9-57fe-43ca-bc59-92ee9cc6eded` |
| 7 | `GET /v1/accounts/me` | 200 | 19 | `qa-01dfb961-c50f-4f73-bbab-51c64211fddb` |
| 8 | `GET /v1/accounts/me` | 200 | 14 | `qa-34455b68-e2c1-4e08-b4b1-8abb89dc2b2b` |
| 9 | `GET /v1/accounts/me` | 200 | 25 | `qa-b4f05ffe-912e-4d03-a9f5-ef84d0d6c3e3` |
| 10 | `GET /v1/accounts/me` | 200 | 21 | `qa-a774ce83-7e49-45e4-a900-74df885121b9` |
| 11 | `GET /v1/accounts/me` | 200 | 25 | `qa-c30f1f2a-1f7c-4b43-ad3e-1ae788068e81` |
| 12 | `GET /v1/accounts/me` | 200 | 18 | `qa-05ba75d7-5dac-4215-a6c5-e4444efde342` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-1abcd0a9-e6e7-4b86-a18e-6b31ac8f2888` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-81823d67-93af-4894-864b-77a793f86174` |
| 15 | `GET /v1/accounts/me` | 200 | 15 | `qa-1993d47d-f221-4ac6-918b-9a8998027bcf` |
| 16 | `GET /v1/accounts/me` | 200 | 17 | `qa-6a471a07-ccf5-447d-b9ff-004e1e217b4b` |
| 17 | `GET /v1/accounts/me` | 200 | 23 | `qa-a3aa687f-a522-48e6-9756-0f85046cd9af` |
| 18 | `GET /v1/accounts/me` | 200 | 27 | `qa-c92cb6aa-8a95-40fd-85c0-bf3250d05511` |
| 19 | `GET /v1/accounts/me` | 200 | 17 | `qa-f4514ea4-666c-4334-87f5-57720045b109` |
| 20 | `GET /v1/accounts/me` | 200 | 13 | `qa-5fc5ecdb-536d-4d50-b335-2c69910fe82c` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-e6155615-9a54-446d-8676-a5dfe6f94fed` |
| 22 | `GET /v1/accounts/me` | 200 | 19 | `qa-d81480dc-4acf-4b35-b4f6-335c6d63c6f6` |
| 23 | `GET /v1/accounts/me` | 200 | 21 | `qa-2d67d6a3-61be-4a3c-9128-2e5373c19ae0` |
| 24 | `GET /v1/accounts/me` | 200 | 26 | `qa-5bbd88d9-bbdc-4b09-a932-25f8b9b6a23a` |
| 25 | `GET /v1/accounts/me` | 200 | 29 | `qa-9ca2b87a-3850-4499-956a-3e830709eebc` |
| 26 | `GET /v1/accounts/me` | 200 | 17 | `qa-c03f26ed-6947-4884-91c6-cb552de1aac4` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-b2725d5e-7fce-42b0-9273-ddcea14171ae` |
| 28 | `GET /v1/accounts/me` | 200 | 16 | `qa-1d677908-2633-4fd7-a4c6-ab9b69d10876` |
| 29 | `GET /v1/accounts/me` | 200 | 13 | `qa-dfda4a81-c328-4e34-be57-30cfa2a13994` |
| 30 | `GET /v1/accounts/me` | 200 | 20 | `qa-becd91c2-048c-4a76-929f-1e164f11ba1a` |
| 31 | `GET /v1/accounts/me` | 200 | 21 | `qa-f684f9b9-c2f8-42fb-a393-2a44350535b2` |
| 32 | `GET /v1/accounts/me` | 200 | 31 | `qa-ed673f37-b9bc-4590-bad6-6ca224b04d13` |
| 33 | `GET /v1/accounts/me` | 200 | 28 | `qa-343f7110-a9ee-40c6-aaa0-dbe07b3c41ae` |
| 34 | `GET /v1/accounts/me` | 200 | 14 | `qa-250da14f-2411-4e61-a70c-4bdf116580b0` |
| 35 | `GET /v1/accounts/me` | 200 | 13 | `qa-aa0e9a53-e327-4653-a39f-9e13dbcb4dbc` |
| 36 | `GET /v1/accounts/me` | 200 | 18 | `qa-6ab2e177-f94b-419b-a1c7-1d1b210e8de8` |
| 37 | `GET /v1/accounts/me` | 200 | 16 | `qa-445e902b-a0b6-452d-88e4-0f0860c0ae60` |
| 38 | `GET /v1/accounts/me` | 200 | 17 | `qa-6d7b7a53-9eac-4429-b86c-b0d99dd43bf7` |
| 39 | `GET /v1/accounts/me` | 200 | 22 | `qa-5e0ead55-e6f8-4409-9c80-66cafbfa9c5b` |
| 40 | `GET /v1/accounts/me` | 200 | 25 | `qa-9c802b41-202b-43cf-b30c-9246cb796482` |
| 41 | `GET /v1/accounts/me` | 200 | 39 | `qa-c156c035-9989-45cc-99c6-c64634ca9cc8` |
| 42 | `GET /v1/accounts/me` | 200 | 11 | `qa-5a419e8f-f316-462c-aeaa-2fa74a4e296a` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-6d8e61c9-754e-4b91-97e7-73aa66756d7c` |
| 44 | `GET /v1/accounts/me` | 200 | 18 | `qa-418d4287-bc1f-42a2-8630-d7f6689d6c98` |
| 45 | `GET /v1/accounts/me` | 200 | 14 | `qa-311974a1-1a0b-48d9-ac21-26064ca69b45` |
| 46 | `GET /v1/accounts/me` | 200 | 15 | `qa-18c95d67-2467-4155-9710-aa8973ef70c9` |
| 47 | `GET /v1/accounts/me` | 200 | 15 | `qa-535a31af-fb1b-4264-acc4-16e99eff506e` |
| 48 | `GET /v1/accounts/me` | 200 | 17 | `qa-01fbbc80-627d-4601-a41e-b300f71fa216` |
| 49 | `GET /v1/accounts/me` | 200 | 19 | `qa-00c76ecb-4f80-480c-8b92-c62fdde79ec5` |
| 50 | `GET /v1/accounts/me` | 200 | 14 | `qa-5c6b6938-a192-4c3e-9d77-d29fbe6e5f00` |
| 51 | `GET /v1/accounts/me` | 200 | 14 | `qa-37cfad57-81ed-416b-8a3b-96d18b557007` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-a784500f-2667-4da5-b9ec-aa02044552aa` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-8b43e0d4-5dec-4270-91d1-d5bacb6e5638` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-52242f5e-2553-4554-9f07-3bc77467d5d7` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-6dd46955-f219-4152-b820-5884fd3d819a` |
| 56 | `GET /v1/accounts/me` | 200 | 13 | `qa-25c645da-890a-4eef-a5b2-f7cbb3d5ba84` |
| 57 | `GET /v1/accounts/me` | 200 | 12 | `qa-62bc5ae2-fa49-4e1e-b3ad-a2fa158e5d54` |
| 58 | `GET /v1/accounts/me` | 200 | 36 | `qa-e2d455fd-f198-4f37-a8ba-802ae6e610ff` |
| 59 | `GET /v1/accounts/me` | 200 | 14 | `qa-87014dc1-ad8f-4c53-98a5-85a5d6531e08` |
| 60 | `GET /v1/accounts/me` | 200 | 18 | `qa-f217da5b-8a99-4731-889a-9534edf796e0` |
| 61 | `GET /v1/accounts/me` | 200 | 12 | `qa-5d33adab-e9b5-409e-9448-72e4e38890fe` |
| 62 | `GET /v1/accounts/me` | 200 | 14 | `qa-9fdb1e08-182b-49fd-aef4-8b1ae3ec2b54` |
| 63 | `GET /v1/accounts/me` | 200 | 6 | `qa-461e4bba-01de-4caa-b918-77432d7a5a5e` |
| 64 | `GET /v1/accounts/me` | 429 | 14 | `qa-d748590e-13ac-4c89-8784-8608cb111c3a` |
| 65 | `POST /v1/auth/token` | 429 | 9 | `qa-23478f9f-dc84-4742-83ad-850787223853` |
| 66 | `POST /v1/accounts` | 429 | 3 | `qa-7e86afba-1f9b-4f56-8304-310e8a091c77` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-dfd3648c-df0a-47f3-b48a-7397154155c0` |
| 68 | `PATCH /v1/accounts/me` | 429 | 3 | `qa-cc81ede6-9276-40dc-ba7c-f09a78c77c30` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-ed3bcb70-efb5-469d-95e1-8ae369c431a8` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-667eab04-eb06-4158-944e-9a203c07f72e` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-a6639910-a876-42bd-85f1-03c701bc1db1` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-16145f5e-4d04-43ad-9308-3f6323afe42a` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-d76c9481-8fe2-49b8-85dd-36cb2f604a02` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-5fe34870-d842-439f-b7b5-f8cacf11686b` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-2b23f7c8-f74e-42e4-bdf3-1c3616461019` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-68ee7038-bde6-4c8f-855c-e3abbcd248d6` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-d9892322-a0e3-43eb-af44-844fbf9bedbf` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-f6f8b47b-1958-4362-be1b-1dc03db637bc` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-c5bfa184-b3d0-4ee5-9eec-9f0a69241672` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-7175a83a-b36d-40ee-827f-eb2570566f06` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-e0190a88-8150-45dd-9b6e-95b69819f1ec` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-b82d6214-533c-463a-adf9-7f0f791187af` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-d66a756d-1503-4ccc-a9d9-2a701a170cf1` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-a910c57d-43b3-437e-8d56-52942a709d6c` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-ae938161-d345-47ed-85ba-165b480f508e` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-55c1e116-417c-4c53-ab51-77d7f202cce3` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-035bcebc-e0cb-4103-b3b5-8e43538f9945` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-23896736-7b72-45e7-b28d-0d84e1f24fc8` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-c9e4afc8-92a3-452d-a974-1091dca5427d` |
| 90 | `GET /v1/accounts/me` | 429 | 5 | `qa-ae455d86-6b38-426b-8b19-ce61c5cb0a08` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-b0780ced-3afe-4e2c-9a3d-1c2c42bf469f` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-a912233f-2d65-4b72-bba4-3ec4958b5cc2` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-cf01f79a-1bb2-41ba-b7a2-d0a24644176b` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-d4841900-83ef-4417-8892-2e14c1fb4f60` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-3b23c4d0-67f8-44aa-afe8-e2e362a605de` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-40c99acf-d287-4fe7-98b7-0fafa1c88d2a` |
| 97 | `GET /v1/accounts/me` | 200 | 4 | `qa-45ffd963-49ec-4a11-8e02-60709d7d3418` |
| 98 | `POST /v1/auth/token` | 200 | 17 | `qa-4331b26f-4cab-45d3-aa76-2f0ba04c8678` |
| 99 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ae6c0a3b-8215-4099-8740-3512f6666426` |
| 100 | `POST /v1/auth/token` | 401 | 8 | `qa-f4cad513-33a7-4dc1-bbc1-2078faa83502` |
| 101 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f1e37617-8c4b-4482-bbfe-e0ef39292dc9` |
| 102 | `POST /v1/auth/token` | 401 | 11 | `qa-754f0241-3174-4a48-b68e-2d4e22784145` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b39f1e52-2da8-4da2-bffb-2e8de6bb597f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b39f1e52-2da8-4da2-bffb-2e8de6bb597f
Content-Type: application/json

--- request body ---
{"handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b39f1e52-2da8-4da2-bffb-2e8de6bb597f
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
Location: /v1/accounts/qa-dbee2d3e99bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-38aed88d-5e4d-4afb-ad70-f5d454e9683c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38aed88d-5e4d-4afb-ad70-f5d454e9683c
Content-Type: application/json

--- request body ---
{"handle":"qa-a14724c7cb36","displayName":"QA a14724c7cb36","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-38aed88d-5e4d-4afb-ad70-f5d454e9683c
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
Location: /v1/accounts/qa-a14724c7cb36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_084f19be-e0a7-46ed-a471-613d168bae42","handle":"qa-a14724c7cb36","displayName":"QA a14724c7cb36","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.486065398Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f3fd586-e535-4ba8-a7d3-e6a77f9d3aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f3fd586-e535-4ba8-a7d3-e6a77f9d3aed
Content-Type: application/json

--- request body ---
{"handle":"qa-dbee2d3e99bb","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f3fd586-e535-4ba8-a7d3-e6a77f9d3aed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df350688-2103-48d7-9b3a-b909e1316d97"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ef7f201b-91d6-4bfa-a13d-65981d4c0e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef7f201b-91d6-4bfa-a13d-65981d4c0e7f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a14724c7cb36","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef7f201b-91d6-4bfa-a13d-65981d4c0e7f
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
Location: /v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff","subject":"Error contract","status":"open","region":"eu","participants":["qa-dbee2d3e99bb","qa-a14724c7cb36"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.609092256Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6b0a3a4-efb7-4fcd-bd70-8998122e71f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6b0a3a4-efb7-4fcd-bd70-8998122e71f9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6b0a3a4-efb7-4fcd-bd70-8998122e71f9
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e28ab3b9-57fe-43ca-bc59-92ee9cc6eded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e28ab3b9-57fe-43ca-bc59-92ee9cc6eded
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e28ab3b9-57fe-43ca-bc59-92ee9cc6eded
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-01dfb961-c50f-4f73-bbab-51c64211fddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01dfb961-c50f-4f73-bbab-51c64211fddb
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-01dfb961-c50f-4f73-bbab-51c64211fddb
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-34455b68-e2c1-4e08-b4b1-8abb89dc2b2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34455b68-e2c1-4e08-b4b1-8abb89dc2b2b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-34455b68-e2c1-4e08-b4b1-8abb89dc2b2b
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4f05ffe-912e-4d03-a9f5-ef84d0d6c3e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4f05ffe-912e-4d03-a9f5-ef84d0d6c3e3
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4f05ffe-912e-4d03-a9f5-ef84d0d6c3e3
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-a774ce83-7e49-45e4-a900-74df885121b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a774ce83-7e49-45e4-a900-74df885121b9
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a774ce83-7e49-45e4-a900-74df885121b9
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-c30f1f2a-1f7c-4b43-ad3e-1ae788068e81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c30f1f2a-1f7c-4b43-ad3e-1ae788068e81
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c30f1f2a-1f7c-4b43-ad3e-1ae788068e81
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-05ba75d7-5dac-4215-a6c5-e4444efde342

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05ba75d7-5dac-4215-a6c5-e4444efde342
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-05ba75d7-5dac-4215-a6c5-e4444efde342
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-1abcd0a9-e6e7-4b86-a18e-6b31ac8f2888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1abcd0a9-e6e7-4b86-a18e-6b31ac8f2888
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1abcd0a9-e6e7-4b86-a18e-6b31ac8f2888
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-81823d67-93af-4894-864b-77a793f86174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81823d67-93af-4894-864b-77a793f86174
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-81823d67-93af-4894-864b-77a793f86174
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-1993d47d-f221-4ac6-918b-9a8998027bcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1993d47d-f221-4ac6-918b-9a8998027bcf
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1993d47d-f221-4ac6-918b-9a8998027bcf
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a471a07-ccf5-447d-b9ff-004e1e217b4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a471a07-ccf5-447d-b9ff-004e1e217b4b
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a471a07-ccf5-447d-b9ff-004e1e217b4b
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3aa687f-a522-48e6-9756-0f85046cd9af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3aa687f-a522-48e6-9756-0f85046cd9af
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3aa687f-a522-48e6-9756-0f85046cd9af
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-c92cb6aa-8a95-40fd-85c0-bf3250d05511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c92cb6aa-8a95-40fd-85c0-bf3250d05511
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c92cb6aa-8a95-40fd-85c0-bf3250d05511
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4514ea4-666c-4334-87f5-57720045b109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4514ea4-666c-4334-87f5-57720045b109
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4514ea4-666c-4334-87f5-57720045b109
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-5fc5ecdb-536d-4d50-b335-2c69910fe82c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc5ecdb-536d-4d50-b335-2c69910fe82c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fc5ecdb-536d-4d50-b335-2c69910fe82c
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-e6155615-9a54-446d-8676-a5dfe6f94fed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6155615-9a54-446d-8676-a5dfe6f94fed
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6155615-9a54-446d-8676-a5dfe6f94fed
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-d81480dc-4acf-4b35-b4f6-335c6d63c6f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d81480dc-4acf-4b35-b4f6-335c6d63c6f6
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d81480dc-4acf-4b35-b4f6-335c6d63c6f6
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d67d6a3-61be-4a3c-9128-2e5373c19ae0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d67d6a3-61be-4a3c-9128-2e5373c19ae0
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d67d6a3-61be-4a3c-9128-2e5373c19ae0
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-5bbd88d9-bbdc-4b09-a932-25f8b9b6a23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bbd88d9-bbdc-4b09-a932-25f8b9b6a23a
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bbd88d9-bbdc-4b09-a932-25f8b9b6a23a
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ca2b87a-3850-4499-956a-3e830709eebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ca2b87a-3850-4499-956a-3e830709eebc
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ca2b87a-3850-4499-956a-3e830709eebc
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-c03f26ed-6947-4884-91c6-cb552de1aac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c03f26ed-6947-4884-91c6-cb552de1aac4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c03f26ed-6947-4884-91c6-cb552de1aac4
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2725d5e-7fce-42b0-9273-ddcea14171ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2725d5e-7fce-42b0-9273-ddcea14171ae
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2725d5e-7fce-42b0-9273-ddcea14171ae
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d677908-2633-4fd7-a4c6-ab9b69d10876

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d677908-2633-4fd7-a4c6-ab9b69d10876
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d677908-2633-4fd7-a4c6-ab9b69d10876
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfda4a81-c328-4e34-be57-30cfa2a13994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfda4a81-c328-4e34-be57-30cfa2a13994
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfda4a81-c328-4e34-be57-30cfa2a13994
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-becd91c2-048c-4a76-929f-1e164f11ba1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-becd91c2-048c-4a76-929f-1e164f11ba1a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-becd91c2-048c-4a76-929f-1e164f11ba1a
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-f684f9b9-c2f8-42fb-a393-2a44350535b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f684f9b9-c2f8-42fb-a393-2a44350535b2
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f684f9b9-c2f8-42fb-a393-2a44350535b2
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed673f37-b9bc-4590-bad6-6ca224b04d13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed673f37-b9bc-4590-bad6-6ca224b04d13
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed673f37-b9bc-4590-bad6-6ca224b04d13
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-343f7110-a9ee-40c6-aaa0-dbe07b3c41ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-343f7110-a9ee-40c6-aaa0-dbe07b3c41ae
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-343f7110-a9ee-40c6-aaa0-dbe07b3c41ae
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-250da14f-2411-4e61-a70c-4bdf116580b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-250da14f-2411-4e61-a70c-4bdf116580b0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-250da14f-2411-4e61-a70c-4bdf116580b0
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-aa0e9a53-e327-4653-a39f-9e13dbcb4dbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa0e9a53-e327-4653-a39f-9e13dbcb4dbc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa0e9a53-e327-4653-a39f-9e13dbcb4dbc
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ab2e177-f94b-419b-a1c7-1d1b210e8de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ab2e177-f94b-419b-a1c7-1d1b210e8de8
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ab2e177-f94b-419b-a1c7-1d1b210e8de8
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-445e902b-a0b6-452d-88e4-0f0860c0ae60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-445e902b-a0b6-452d-88e4-0f0860c0ae60
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-445e902b-a0b6-452d-88e4-0f0860c0ae60
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d7b7a53-9eac-4429-b86c-b0d99dd43bf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7b7a53-9eac-4429-b86c-b0d99dd43bf7
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d7b7a53-9eac-4429-b86c-b0d99dd43bf7
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e0ead55-e6f8-4409-9c80-66cafbfa9c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e0ead55-e6f8-4409-9c80-66cafbfa9c5b
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e0ead55-e6f8-4409-9c80-66cafbfa9c5b
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c802b41-202b-43cf-b30c-9246cb796482

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c802b41-202b-43cf-b30c-9246cb796482
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c802b41-202b-43cf-b30c-9246cb796482
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-c156c035-9989-45cc-99c6-c64634ca9cc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c156c035-9989-45cc-99c6-c64634ca9cc8
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c156c035-9989-45cc-99c6-c64634ca9cc8
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a419e8f-f316-462c-aeaa-2fa74a4e296a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a419e8f-f316-462c-aeaa-2fa74a4e296a
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a419e8f-f316-462c-aeaa-2fa74a4e296a
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d8e61c9-754e-4b91-97e7-73aa66756d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d8e61c9-754e-4b91-97e7-73aa66756d7c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d8e61c9-754e-4b91-97e7-73aa66756d7c
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-418d4287-bc1f-42a2-8630-d7f6689d6c98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-418d4287-bc1f-42a2-8630-d7f6689d6c98
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-418d4287-bc1f-42a2-8630-d7f6689d6c98
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-311974a1-1a0b-48d9-ac21-26064ca69b45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-311974a1-1a0b-48d9-ac21-26064ca69b45
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-311974a1-1a0b-48d9-ac21-26064ca69b45
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-18c95d67-2467-4155-9710-aa8973ef70c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18c95d67-2467-4155-9710-aa8973ef70c9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-18c95d67-2467-4155-9710-aa8973ef70c9
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-535a31af-fb1b-4264-acc4-16e99eff506e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-535a31af-fb1b-4264-acc4-16e99eff506e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-535a31af-fb1b-4264-acc4-16e99eff506e
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-01fbbc80-627d-4601-a41e-b300f71fa216

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01fbbc80-627d-4601-a41e-b300f71fa216
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-01fbbc80-627d-4601-a41e-b300f71fa216
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-00c76ecb-4f80-480c-8b92-c62fdde79ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00c76ecb-4f80-480c-8b92-c62fdde79ec5
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-00c76ecb-4f80-480c-8b92-c62fdde79ec5
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c6b6938-a192-4c3e-9d77-d29fbe6e5f00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c6b6938-a192-4c3e-9d77-d29fbe6e5f00
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c6b6938-a192-4c3e-9d77-d29fbe6e5f00
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-37cfad57-81ed-416b-8a3b-96d18b557007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37cfad57-81ed-416b-8a3b-96d18b557007
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-37cfad57-81ed-416b-8a3b-96d18b557007
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-a784500f-2667-4da5-b9ec-aa02044552aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a784500f-2667-4da5-b9ec-aa02044552aa
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a784500f-2667-4da5-b9ec-aa02044552aa
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b43e0d4-5dec-4270-91d1-d5bacb6e5638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b43e0d4-5dec-4270-91d1-d5bacb6e5638
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b43e0d4-5dec-4270-91d1-d5bacb6e5638
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-52242f5e-2553-4554-9f07-3bc77467d5d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52242f5e-2553-4554-9f07-3bc77467d5d7
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-52242f5e-2553-4554-9f07-3bc77467d5d7
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-6dd46955-f219-4152-b820-5884fd3d819a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd46955-f219-4152-b820-5884fd3d819a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6dd46955-f219-4152-b820-5884fd3d819a
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-25c645da-890a-4eef-a5b2-f7cbb3d5ba84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c645da-890a-4eef-a5b2-f7cbb3d5ba84
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-25c645da-890a-4eef-a5b2-f7cbb3d5ba84
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-62bc5ae2-fa49-4e1e-b3ad-a2fa158e5d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62bc5ae2-fa49-4e1e-b3ad-a2fa158e5d54
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-62bc5ae2-fa49-4e1e-b3ad-a2fa158e5d54
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2d455fd-f198-4f37-a8ba-802ae6e610ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d455fd-f198-4f37-a8ba-802ae6e610ff
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2d455fd-f198-4f37-a8ba-802ae6e610ff
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-87014dc1-ad8f-4c53-98a5-85a5d6531e08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87014dc1-ad8f-4c53-98a5-85a5d6531e08
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-87014dc1-ad8f-4c53-98a5-85a5d6531e08
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-f217da5b-8a99-4731-889a-9534edf796e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f217da5b-8a99-4731-889a-9534edf796e0
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-f217da5b-8a99-4731-889a-9534edf796e0
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d33adab-e9b5-409e-9448-72e4e38890fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d33adab-e9b5-409e-9448-72e4e38890fe
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d33adab-e9b5-409e-9448-72e4e38890fe
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fdb1e08-182b-49fd-aef4-8b1ae3ec2b54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fdb1e08-182b-49fd-aef4-8b1ae3ec2b54
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fdb1e08-182b-49fd-aef4-8b1ae3ec2b54
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-461e4bba-01de-4caa-b918-77432d7a5a5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-461e4bba-01de-4caa-b918-77432d7a5a5e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-461e4bba-01de-4caa-b918-77432d7a5a5e
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-d748590e-13ac-4c89-8784-8608cb111c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d748590e-13ac-4c89-8784-8608cb111c3a
Content-Type: application/json

--- response: 429 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d748590e-13ac-4c89-8784-8608cb111c3a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d748590e-13ac-4c89-8784-8608cb111c3a"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-23478f9f-dc84-4742-83ad-850787223853

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23478f9f-dc84-4742-83ad-850787223853
Content-Type: application/json

--- request body ---
{"handle":"qa-dbee2d3e99bb","password":"****"}

--- response: 429 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23478f9f-dc84-4742-83ad-850787223853
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-23478f9f-dc84-4742-83ad-850787223853"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-7e86afba-1f9b-4f56-8304-310e8a091c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e86afba-1f9b-4f56-8304-310e8a091c77
Content-Type: application/json

--- request body ---
{"handle":"qa-3f87060a36e6","displayName":"QA 3f87060a36e6","password":"****","region":"eu"}

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e86afba-1f9b-4f56-8304-310e8a091c77
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-7e86afba-1f9b-4f56-8304-310e8a091c77"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfd3648c-df0a-47f3-b48a-7397154155c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfd3648c-df0a-47f3-b48a-7397154155c0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfd3648c-df0a-47f3-b48a-7397154155c0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dfd3648c-df0a-47f3-b48a-7397154155c0"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cc81ede6-9276-40dc-ba7c-f09a78c77c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc81ede6-9276-40dc-ba7c-f09a78c77c30
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc81ede6-9276-40dc-ba7c-f09a78c77c30
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cc81ede6-9276-40dc-ba7c-f09a78c77c30"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ed3bcb70-efb5-469d-95e1-8ae369c431a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed3bcb70-efb5-469d-95e1-8ae369c431a8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed3bcb70-efb5-469d-95e1-8ae369c431a8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ed3bcb70-efb5-469d-95e1-8ae369c431a8"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-dbee2d3e99bb
correlation: qa-667eab04-eb06-4158-944e-9a203c07f72e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-667eab04-eb06-4158-944e-9a203c07f72e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-667eab04-eb06-4158-944e-9a203c07f72e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-dbee2d3e99bb","correlationId":"qa-667eab04-eb06-4158-944e-9a203c07f72e"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-a6639910-a876-42bd-85f1-03c701bc1db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6639910-a876-42bd-85f1-03c701bc1db1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dbee2d3e99bb","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6639910-a876-42bd-85f1-03c701bc1db1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-a6639910-a876-42bd-85f1-03c701bc1db1"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-16145f5e-4d04-43ad-9308-3f6323afe42a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16145f5e-4d04-43ad-9308-3f6323afe42a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16145f5e-4d04-43ad-9308-3f6323afe42a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-16145f5e-4d04-43ad-9308-3f6323afe42a"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff
correlation: qa-d76c9481-8fe2-49b8-85dd-36cb2f604a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d76c9481-8fe2-49b8-85dd-36cb2f604a02
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d76c9481-8fe2-49b8-85dd-36cb2f604a02
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff","correlationId":"qa-d76c9481-8fe2-49b8-85dd-36cb2f604a02"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/messages
correlation: qa-5fe34870-d842-439f-b7b5-f8cacf11686b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fe34870-d842-439f-b7b5-f8cacf11686b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5fe34870-d842-439f-b7b5-f8cacf11686b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/messages","correlationId":"qa-5fe34870-d842-439f-b7b5-f8cacf11686b"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/messages
correlation: qa-2b23f7c8-f74e-42e4-bdf3-1c3616461019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b23f7c8-f74e-42e4-bdf3-1c3616461019
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b23f7c8-f74e-42e4-bdf3-1c3616461019
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/messages","correlationId":"qa-2b23f7c8-f74e-42e4-bdf3-1c3616461019"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/read
correlation: qa-68ee7038-bde6-4c8f-855c-e3abbcd248d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ee7038-bde6-4c8f-855c-e3abbcd248d6
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68ee7038-bde6-4c8f-855c-e3abbcd248d6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/read","correlationId":"qa-68ee7038-bde6-4c8f-855c-e3abbcd248d6"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/close
correlation: qa-d9892322-a0e3-43eb-af44-844fbf9bedbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9892322-a0e3-43eb-af44-844fbf9bedbf
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9892322-a0e3-43eb-af44-844fbf9bedbf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_c0168a2e-9135-4de3-8d8a-fe39699472ff/close","correlationId":"qa-d9892322-a0e3-43eb-af44-844fbf9bedbf"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-f6f8b47b-1958-4362-be1b-1dc03db637bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6f8b47b-1958-4362-be1b-1dc03db637bc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6f8b47b-1958-4362-be1b-1dc03db637bc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-f6f8b47b-1958-4362-be1b-1dc03db637bc"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-c5bfa184-b3d0-4ee5-9eec-9f0a69241672

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5bfa184-b3d0-4ee5-9eec-9f0a69241672
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5bfa184-b3d0-4ee5-9eec-9f0a69241672
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-c5bfa184-b3d0-4ee5-9eec-9f0a69241672"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7175a83a-b36d-40ee-827f-eb2570566f06

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3fff3119c92b4e8396bb6b6cbffd6608
X-Correlation-Id: qa-7175a83a-b36d-40ee-827f-eb2570566f06
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7175a83a-b36d-40ee-827f-eb2570566f06
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-7175a83a-b36d-40ee-827f-eb2570566f06"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-e0190a88-8150-45dd-9b6e-95b69819f1ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0190a88-8150-45dd-9b6e-95b69819f1ec
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0190a88-8150-45dd-9b6e-95b69819f1ec
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-e0190a88-8150-45dd-9b6e-95b69819f1ec"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-b82d6214-533c-463a-adf9-7f0f791187af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b82d6214-533c-463a-adf9-7f0f791187af
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b82d6214-533c-463a-adf9-7f0f791187af
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b82d6214-533c-463a-adf9-7f0f791187af"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-d66a756d-1503-4ccc-a9d9-2a701a170cf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d66a756d-1503-4ccc-a9d9-2a701a170cf1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d66a756d-1503-4ccc-a9d9-2a701a170cf1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d66a756d-1503-4ccc-a9d9-2a701a170cf1"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-a910c57d-43b3-437e-8d56-52942a709d6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a910c57d-43b3-437e-8d56-52942a709d6c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a910c57d-43b3-437e-8d56-52942a709d6c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a910c57d-43b3-437e-8d56-52942a709d6c"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae938161-d345-47ed-85ba-165b480f508e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae938161-d345-47ed-85ba-165b480f508e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae938161-d345-47ed-85ba-165b480f508e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ae938161-d345-47ed-85ba-165b480f508e"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-55c1e116-417c-4c53-ab51-77d7f202cce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55c1e116-417c-4c53-ab51-77d7f202cce3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55c1e116-417c-4c53-ab51-77d7f202cce3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-55c1e116-417c-4c53-ab51-77d7f202cce3"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-035bcebc-e0cb-4103-b3b5-8e43538f9945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-035bcebc-e0cb-4103-b3b5-8e43538f9945
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-035bcebc-e0cb-4103-b3b5-8e43538f9945
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-035bcebc-e0cb-4103-b3b5-8e43538f9945"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-23896736-7b72-45e7-b28d-0d84e1f24fc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23896736-7b72-45e7-b28d-0d84e1f24fc8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23896736-7b72-45e7-b28d-0d84e1f24fc8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-23896736-7b72-45e7-b28d-0d84e1f24fc8"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9e4afc8-92a3-452d-a974-1091dca5427d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9e4afc8-92a3-452d-a974-1091dca5427d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9e4afc8-92a3-452d-a974-1091dca5427d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c9e4afc8-92a3-452d-a974-1091dca5427d"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae455d86-6b38-426b-8b19-ce61c5cb0a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae455d86-6b38-426b-8b19-ce61c5cb0a08
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae455d86-6b38-426b-8b19-ce61c5cb0a08
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ae455d86-6b38-426b-8b19-ce61c5cb0a08"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0780ced-3afe-4e2c-9a3d-1c2c42bf469f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0780ced-3afe-4e2c-9a3d-1c2c42bf469f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0780ced-3afe-4e2c-9a3d-1c2c42bf469f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0780ced-3afe-4e2c-9a3d-1c2c42bf469f"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-a912233f-2d65-4b72-bba4-3ec4958b5cc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a912233f-2d65-4b72-bba4-3ec4958b5cc2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a912233f-2d65-4b72-bba4-3ec4958b5cc2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a912233f-2d65-4b72-bba4-3ec4958b5cc2"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf01f79a-1bb2-41ba-b7a2-d0a24644176b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf01f79a-1bb2-41ba-b7a2-d0a24644176b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf01f79a-1bb2-41ba-b7a2-d0a24644176b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf01f79a-1bb2-41ba-b7a2-d0a24644176b"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4841900-83ef-4417-8892-2e14c1fb4f60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4841900-83ef-4417-8892-2e14c1fb4f60
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4841900-83ef-4417-8892-2e14c1fb4f60
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d4841900-83ef-4417-8892-2e14c1fb4f60"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b23c4d0-67f8-44aa-afe8-e2e362a605de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b23c4d0-67f8-44aa-afe8-e2e362a605de
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 27 Oct 2026 08:00:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b23c4d0-67f8-44aa-afe8-e2e362a605de
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3b23c4d0-67f8-44aa-afe8-e2e362a605de"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-40c99acf-d287-4fe7-98b7-0fafa1c88d2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c99acf-d287-4fe7-98b7-0fafa1c88d2a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40c99acf-d287-4fe7-98b7-0fafa1c88d2a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-40c99acf-d287-4fe7-98b7-0fafa1c88d2a"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-45ffd963-49ec-4a11-8e02-60709d7d3418

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45ffd963-49ec-4a11-8e02-60709d7d3418
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 27 Oct 2026 08:00:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-45ffd963-49ec-4a11-8e02-60709d7d3418
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

{"id":"acc_df350688-2103-48d7-9b3a-b909e1316d97","handle":"qa-dbee2d3e99bb","displayName":"QA dbee2d3e99bb","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.421991970Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-4331b26f-4cab-45d3-aa76-2f0ba04c8678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4331b26f-4cab-45d3-aa76-2f0ba04c8678
Content-Type: application/json

--- request body ---
{"handle":"qa-a14724c7cb36","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4331b26f-4cab-45d3-aa76-2f0ba04c8678
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_084f19be-e0a7-46ed-a471-613d168bae42"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae6c0a3b-8215-4099-8740-3512f6666426

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae6c0a3b-8215-4099-8740-3512f6666426
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae6c0a3b-8215-4099-8740-3512f6666426
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
correlation: qa-f4cad513-33a7-4dc1-bbc1-2078faa83502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4cad513-33a7-4dc1-bbc1-2078faa83502
Content-Type: application/json

--- request body ---
{"handle":"qa-a14724c7cb36","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4cad513-33a7-4dc1-bbc1-2078faa83502
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4cad513-33a7-4dc1-bbc1-2078faa83502"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1e37617-8c4b-4482-bbfe-e0ef39292dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1e37617-8c4b-4482-bbfe-e0ef39292dc9
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1e37617-8c4b-4482-bbfe-e0ef39292dc9
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
correlation: qa-754f0241-3174-4a48-b68e-2d4e22784145

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-754f0241-3174-4a48-b68e-2d4e22784145
Content-Type: application/json

--- request body ---
{"handle":"qa-dbee2d3e99bb","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-754f0241-3174-4a48-b68e-2d4e22784145
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-754f0241-3174-4a48-b68e-2d4e22784145"}
```
