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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-d8ecfb83-21e1-4e95-bc1d-d106409fde8b` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-c1741838-d44b-4af3-a599-28a7cb798696` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-f42a1f1f-d25e-4621-b0b3-4226a9b87326` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-d9e3f886-d2af-47a7-a85e-2e3de6feb54d` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-6d69018a-73c0-487b-8e30-f2535c23ab1a` |
| 6 | `GET /v1/accounts/me` | 200 | 24 | `qa-46b2bfbe-2337-43de-87f8-39dbc33197a3` |
| 7 | `GET /v1/accounts/me` | 200 | 15 | `qa-e7960cd9-4875-4a0b-b19e-2d166ff9cd25` |
| 8 | `GET /v1/accounts/me` | 200 | 41 | `qa-8a01ad08-b6b8-47b3-a478-1d9dc6694fb0` |
| 9 | `GET /v1/accounts/me` | 200 | 15 | `qa-4797770d-21b6-477a-9488-e13f03d4970c` |
| 10 | `GET /v1/accounts/me` | 200 | 8 | `qa-45f20a02-2eac-4547-b592-272d5949f0ab` |
| 11 | `GET /v1/accounts/me` | 200 | 21 | `qa-6493848e-4a7c-41ef-befe-fd81c3a34fac` |
| 12 | `GET /v1/accounts/me` | 200 | 23 | `qa-b85b56ec-45e0-41bd-b3d3-f6845db8fcc7` |
| 13 | `GET /v1/accounts/me` | 200 | 19 | `qa-a5120c61-6513-4817-ad2f-45bbe34fdf90` |
| 14 | `GET /v1/accounts/me` | 200 | 45 | `qa-54fe5808-1e01-4644-9cca-865f78673002` |
| 15 | `GET /v1/accounts/me` | 200 | 19 | `qa-64920561-e387-421d-b263-76870467ad67` |
| 16 | `GET /v1/accounts/me` | 200 | 19 | `qa-7c22298e-58a4-4abb-a46f-c5773cb5dadf` |
| 17 | `GET /v1/accounts/me` | 200 | 13 | `qa-644e5d55-8975-4732-b82d-8f17f6ae760e` |
| 18 | `GET /v1/accounts/me` | 200 | 14 | `qa-11e2c0bc-ef6d-4d00-978e-c86b97450477` |
| 19 | `GET /v1/accounts/me` | 200 | 14 | `qa-c8a9bd47-3704-4f70-b825-ddd88935e080` |
| 20 | `GET /v1/accounts/me` | 200 | 31 | `qa-8ce728ca-fc2e-4673-8060-8f0d86ff962b` |
| 21 | `GET /v1/accounts/me` | 200 | 28 | `qa-9b4c438e-8f04-4767-8c96-84a965018465` |
| 22 | `GET /v1/accounts/me` | 200 | 25 | `qa-4ae2c7de-5d56-475b-8ec5-8279b606a5a2` |
| 23 | `GET /v1/accounts/me` | 200 | 25 | `qa-4bd5906d-7372-44da-946a-67e09b7361d2` |
| 24 | `GET /v1/accounts/me` | 200 | 19 | `qa-0ba32eab-fce9-4863-83cd-38fa61d89196` |
| 25 | `GET /v1/accounts/me` | 200 | 7 | `qa-0e86db00-b0fa-47b0-ae17-d64ed0e3a25a` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-6aa54901-d0ee-46a6-b1d3-165bbbf2c98e` |
| 27 | `GET /v1/accounts/me` | 200 | 20 | `qa-972a1191-aa96-489d-8e19-0c08ab173fc0` |
| 28 | `GET /v1/accounts/me` | 200 | 19 | `qa-59b54763-46f8-49c5-a5f0-f40200be7161` |
| 29 | `GET /v1/accounts/me` | 200 | 19 | `qa-b717f5b4-0169-4eb2-9b38-26133d3d584d` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-79607d61-cab7-4cf8-a8f7-09b21fd72b8a` |
| 31 | `GET /v1/accounts/me` | 200 | 8 | `qa-7ba18e50-6e4b-4a82-b53c-044aee0ea6d9` |
| 32 | `GET /v1/accounts/me` | 200 | 22 | `qa-6ddc7f43-96d8-44e6-8746-890d8d033d02` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-24b75ca1-84d8-4e5d-858c-9d567d14a072` |
| 34 | `GET /v1/accounts/me` | 200 | 12 | `qa-c06b578a-f19f-4720-ae87-c284caf9f0b9` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-8167510a-5773-42c8-8496-e3b041279a9a` |
| 36 | `GET /v1/accounts/me` | 200 | 39 | `qa-594fac38-3e82-4965-a2d5-9063ad10e124` |
| 37 | `GET /v1/accounts/me` | 200 | 4 | `qa-8660dbf4-e951-4ee0-9c06-a0e7625a9b0d` |
| 38 | `GET /v1/accounts/me` | 200 | 10 | `qa-0be385e6-e2b5-42aa-bf7d-82123df43726` |
| 39 | `GET /v1/accounts/me` | 200 | 18 | `qa-df2daea1-d5bd-4b99-998b-697b21df9167` |
| 40 | `GET /v1/accounts/me` | 200 | 19 | `qa-659fe538-61ac-4fd2-9ffe-b7cb0ed047e9` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-2c6267c6-c6a7-479a-beb0-8d4669564fa0` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-e0f6c811-d291-42b2-b162-18dac1ac1700` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-b4d0db47-01c0-4076-a9b1-b9d5642a1a34` |
| 44 | `GET /v1/accounts/me` | 200 | 5 | `qa-e10bce2c-edce-4a61-b151-3d6ea954b6e4` |
| 45 | `GET /v1/accounts/me` | 200 | 11 | `qa-7e6855a1-eaf9-485f-bb2d-83b9593b3b6d` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-55eed8e8-677e-4ac0-b2ae-878e27aaa79d` |
| 47 | `GET /v1/accounts/me` | 200 | 9 | `qa-b1a05d56-3b12-4b96-95c2-9a09dee81038` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-93d3d3d5-23a7-4c71-9e28-9bceecdceb9b` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-cdad718b-ab4c-4d19-a441-a6ea9a754038` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-e36ea706-7c35-48cf-af66-e2bd8d820d07` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-41638048-41e4-4f34-af27-6e12c299647a` |
| 52 | `GET /v1/accounts/me` | 200 | 13 | `qa-bd485fb5-0368-43a6-8d6d-738d8ccd3002` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-479143ad-003b-4403-9306-a8ba16c58afa` |
| 54 | `GET /v1/accounts/me` | 200 | 30 | `qa-2b9ea799-8224-4741-b788-36473056d696` |
| 55 | `GET /v1/accounts/me` | 200 | 5 | `qa-e0cdb19b-499d-45e2-ae92-1e1aff3f587d` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-6963206f-a633-483d-bd84-a260d4b5285c` |
| 57 | `GET /v1/accounts/me` | 200 | 13 | `qa-7d7b2a48-b0ed-4f28-adc9-66b174e1470a` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-7c055475-8689-47ad-9c1a-6e8e6a0f0a3b` |
| 59 | `GET /v1/accounts/me` | 200 | 6 | `qa-a78356c7-3882-4dd3-9ae8-d3d4bdd2c3b6` |
| 60 | `GET /v1/accounts/me` | 200 | 11 | `qa-84786439-1160-46cb-9402-330566219182` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-f27318ff-2a98-4b92-a415-6993ce78e55f` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-e3bada80-cb52-4cfc-bf90-aa0e139d2a54` |
| 63 | `GET /v1/accounts/me` | 200 | 6 | `qa-452e46b2-9639-4a25-bf82-bd2844a09f23` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-2d0f70f0-7dd1-45c3-b86e-c4c6d09bcce7` |
| 65 | `POST /v1/auth/token` | 429 | 4 | `qa-a96010c3-1ae5-4651-b6c7-6f60549a6c0d` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-d8af6222-4528-46bd-a2e3-058791bd787c` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-0676c1d7-1dea-4e64-908e-faa360a1e749` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-60bdfed1-1c8f-4e72-a362-d59662cc8f03` |
| 69 | `DELETE /v1/accounts/me` | 429 | 7 | `qa-666e3253-d2bf-4975-b064-adabafff0270` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-2ba3d67b-262e-4001-9506-1a5476a4afee` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-70b5358f-68c6-42d0-8cd8-e6eaf64b8aff` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-0cbad8ed-d58b-40aa-b551-47925593f092` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-8c5f2781-e40e-449e-a783-816c5ad4e47d` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-5344b5f7-853e-4bd8-bc08-7f67648206ba` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-b949828a-c46e-4f2e-a246-c538d686ad0b` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-e478df04-a2d5-4154-95a0-9d7a6287252a` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-bbe65cda-3ad7-4e8f-8070-b9b00ca263e9` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-9cf6ed54-403e-47a8-8bed-a73b621f7b90` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-613fca48-69c1-4d62-bd2a-d3174f446563` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-53a11ad6-e74f-4369-87f0-e310357138b9` |
| 81 | `GET /v1/admin/stats` | 429 | 4 | `qa-b58be683-2248-49a2-a648-050e6c73ac74` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-5393c6c3-0c78-4f0d-a25a-389a78dc8e2c` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-dd3634f2-6a54-49bb-a07f-1c9c1fd31650` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-ace9bf68-2461-4eea-b780-4a154f073411` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-f37fd56f-23fa-4613-aabb-bdd95c54084a` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-8f4cfe2c-f48a-4cee-9c75-3352220e0a99` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-bafdba6d-cce2-4b2b-8188-a03ff0d10fe0` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-0bdb649d-5a3a-4844-bfe6-b7a178dd534c` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-93b2df9e-210d-497b-9ad7-f8b4caa16ed2` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-d7abec0d-2aab-4d1c-8b74-83ba4e5521f4` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-0ae3f4fd-2eaf-4aab-99a7-e7cb39690514` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-6b91cf03-acec-49e4-865f-906a4529c98e` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-15e5f9dc-66cf-44e7-b6eb-981165df0f72` |
| 94 | `GET /v1/accounts/me` | 429 | 17 | `qa-433042c0-6631-42d1-a8e2-f15bac4917df` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-8d4f7dae-390c-4f54-bda2-4b3a362c4d73` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-7443a1e4-cc5c-4ded-91b6-cef6793c54c8` |
| 97 | `GET /v1/accounts/me` | 429 | 6 | `qa-58be9c52-2f4e-46a3-8995-bf4387a97b2d` |
| 98 | `GET /v1/accounts/me` | 200 | 7 | `qa-eb9d46ba-240c-4753-a72d-bb5330f86a99` |
| 99 | `POST /v1/auth/token` | 200 | 10 | `qa-c2f9ee32-457c-4f1e-9c7b-c90937010798` |
| 100 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-81365850-d4b9-4882-a994-3bb4341fff8d` |
| 101 | `POST /v1/auth/token` | 401 | 3 | `qa-5b487592-b6d1-4725-be3a-2da3d0871f97` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-32d5d10b-1796-4836-ae07-d594f322f8a7` |
| 103 | `POST /v1/auth/token` | 401 | 5 | `qa-24f3b226-a7fa-4f9a-be5b-2ada23d5986e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d8ecfb83-21e1-4e95-bc1d-d106409fde8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8ecfb83-21e1-4e95-bc1d-d106409fde8b
Content-Type: application/json

--- request body ---
{"handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8ecfb83-21e1-4e95-bc1d-d106409fde8b
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
Location: /v1/accounts/qa-e1d577a7bc38
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c1741838-d44b-4af3-a599-28a7cb798696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1741838-d44b-4af3-a599-28a7cb798696
Content-Type: application/json

--- request body ---
{"handle":"qa-42af98d09f34","displayName":"QA 42af98d09f34","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1741838-d44b-4af3-a599-28a7cb798696
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
Location: /v1/accounts/qa-42af98d09f34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abebfec2-af3f-44f6-9381-3d43fc6e1727","handle":"qa-42af98d09f34","displayName":"QA 42af98d09f34","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.209022050Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f42a1f1f-d25e-4621-b0b3-4226a9b87326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42a1f1f-d25e-4621-b0b3-4226a9b87326
Content-Type: application/json

--- request body ---
{"handle":"qa-e1d577a7bc38","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f42a1f1f-d25e-4621-b0b3-4226a9b87326
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d9e3f886-d2af-47a7-a85e-2e3de6feb54d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e3f886-d2af-47a7-a85e-2e3de6feb54d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42af98d09f34","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e3f886-d2af-47a7-a85e-2e3de6feb54d
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
Location: /v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f","subject":"Error contract","status":"open","region":"eu","participants":["qa-e1d577a7bc38","qa-42af98d09f34"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.253074435Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d69018a-73c0-487b-8e30-f2535c23ab1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d69018a-73c0-487b-8e30-f2535c23ab1a
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d69018a-73c0-487b-8e30-f2535c23ab1a
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-46b2bfbe-2337-43de-87f8-39dbc33197a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b2bfbe-2337-43de-87f8-39dbc33197a3
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-46b2bfbe-2337-43de-87f8-39dbc33197a3
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7960cd9-4875-4a0b-b19e-2d166ff9cd25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7960cd9-4875-4a0b-b19e-2d166ff9cd25
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7960cd9-4875-4a0b-b19e-2d166ff9cd25
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a01ad08-b6b8-47b3-a478-1d9dc6694fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a01ad08-b6b8-47b3-a478-1d9dc6694fb0
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a01ad08-b6b8-47b3-a478-1d9dc6694fb0
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-4797770d-21b6-477a-9488-e13f03d4970c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4797770d-21b6-477a-9488-e13f03d4970c
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4797770d-21b6-477a-9488-e13f03d4970c
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-45f20a02-2eac-4547-b592-272d5949f0ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45f20a02-2eac-4547-b592-272d5949f0ab
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-45f20a02-2eac-4547-b592-272d5949f0ab
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-6493848e-4a7c-41ef-befe-fd81c3a34fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6493848e-4a7c-41ef-befe-fd81c3a34fac
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6493848e-4a7c-41ef-befe-fd81c3a34fac
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-b85b56ec-45e0-41bd-b3d3-f6845db8fcc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b85b56ec-45e0-41bd-b3d3-f6845db8fcc7
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b85b56ec-45e0-41bd-b3d3-f6845db8fcc7
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5120c61-6513-4817-ad2f-45bbe34fdf90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5120c61-6513-4817-ad2f-45bbe34fdf90
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5120c61-6513-4817-ad2f-45bbe34fdf90
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-54fe5808-1e01-4644-9cca-865f78673002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54fe5808-1e01-4644-9cca-865f78673002
Content-Type: application/json

--- response: 200 in 45 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-54fe5808-1e01-4644-9cca-865f78673002
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-64920561-e387-421d-b263-76870467ad67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64920561-e387-421d-b263-76870467ad67
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-64920561-e387-421d-b263-76870467ad67
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c22298e-58a4-4abb-a46f-c5773cb5dadf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c22298e-58a4-4abb-a46f-c5773cb5dadf
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c22298e-58a4-4abb-a46f-c5773cb5dadf
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-644e5d55-8975-4732-b82d-8f17f6ae760e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-644e5d55-8975-4732-b82d-8f17f6ae760e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-644e5d55-8975-4732-b82d-8f17f6ae760e
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-11e2c0bc-ef6d-4d00-978e-c86b97450477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e2c0bc-ef6d-4d00-978e-c86b97450477
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-11e2c0bc-ef6d-4d00-978e-c86b97450477
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8a9bd47-3704-4f70-b825-ddd88935e080

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8a9bd47-3704-4f70-b825-ddd88935e080
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8a9bd47-3704-4f70-b825-ddd88935e080
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ce728ca-fc2e-4673-8060-8f0d86ff962b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ce728ca-fc2e-4673-8060-8f0d86ff962b
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ce728ca-fc2e-4673-8060-8f0d86ff962b
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b4c438e-8f04-4767-8c96-84a965018465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b4c438e-8f04-4767-8c96-84a965018465
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b4c438e-8f04-4767-8c96-84a965018465
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ae2c7de-5d56-475b-8ec5-8279b606a5a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae2c7de-5d56-475b-8ec5-8279b606a5a2
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ae2c7de-5d56-475b-8ec5-8279b606a5a2
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bd5906d-7372-44da-946a-67e09b7361d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bd5906d-7372-44da-946a-67e09b7361d2
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bd5906d-7372-44da-946a-67e09b7361d2
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ba32eab-fce9-4863-83cd-38fa61d89196

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ba32eab-fce9-4863-83cd-38fa61d89196
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ba32eab-fce9-4863-83cd-38fa61d89196
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e86db00-b0fa-47b0-ae17-d64ed0e3a25a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e86db00-b0fa-47b0-ae17-d64ed0e3a25a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e86db00-b0fa-47b0-ae17-d64ed0e3a25a
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-6aa54901-d0ee-46a6-b1d3-165bbbf2c98e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aa54901-d0ee-46a6-b1d3-165bbbf2c98e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6aa54901-d0ee-46a6-b1d3-165bbbf2c98e
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-972a1191-aa96-489d-8e19-0c08ab173fc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972a1191-aa96-489d-8e19-0c08ab173fc0
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-972a1191-aa96-489d-8e19-0c08ab173fc0
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-59b54763-46f8-49c5-a5f0-f40200be7161

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b54763-46f8-49c5-a5f0-f40200be7161
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-59b54763-46f8-49c5-a5f0-f40200be7161
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-b717f5b4-0169-4eb2-9b38-26133d3d584d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b717f5b4-0169-4eb2-9b38-26133d3d584d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b717f5b4-0169-4eb2-9b38-26133d3d584d
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-79607d61-cab7-4cf8-a8f7-09b21fd72b8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79607d61-cab7-4cf8-a8f7-09b21fd72b8a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-79607d61-cab7-4cf8-a8f7-09b21fd72b8a
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ba18e50-6e4b-4a82-b53c-044aee0ea6d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ba18e50-6e4b-4a82-b53c-044aee0ea6d9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ba18e50-6e4b-4a82-b53c-044aee0ea6d9
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ddc7f43-96d8-44e6-8746-890d8d033d02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ddc7f43-96d8-44e6-8746-890d8d033d02
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ddc7f43-96d8-44e6-8746-890d8d033d02
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-24b75ca1-84d8-4e5d-858c-9d567d14a072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24b75ca1-84d8-4e5d-858c-9d567d14a072
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-24b75ca1-84d8-4e5d-858c-9d567d14a072
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-c06b578a-f19f-4720-ae87-c284caf9f0b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c06b578a-f19f-4720-ae87-c284caf9f0b9
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c06b578a-f19f-4720-ae87-c284caf9f0b9
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-8167510a-5773-42c8-8496-e3b041279a9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8167510a-5773-42c8-8496-e3b041279a9a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8167510a-5773-42c8-8496-e3b041279a9a
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-594fac38-3e82-4965-a2d5-9063ad10e124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-594fac38-3e82-4965-a2d5-9063ad10e124
Content-Type: application/json

--- response: 200 in 39 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-594fac38-3e82-4965-a2d5-9063ad10e124
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-8660dbf4-e951-4ee0-9c06-a0e7625a9b0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8660dbf4-e951-4ee0-9c06-a0e7625a9b0d
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8660dbf4-e951-4ee0-9c06-a0e7625a9b0d
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-0be385e6-e2b5-42aa-bf7d-82123df43726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be385e6-e2b5-42aa-bf7d-82123df43726
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-0be385e6-e2b5-42aa-bf7d-82123df43726
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-df2daea1-d5bd-4b99-998b-697b21df9167

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df2daea1-d5bd-4b99-998b-697b21df9167
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-df2daea1-d5bd-4b99-998b-697b21df9167
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-659fe538-61ac-4fd2-9ffe-b7cb0ed047e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-659fe538-61ac-4fd2-9ffe-b7cb0ed047e9
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-659fe538-61ac-4fd2-9ffe-b7cb0ed047e9
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c6267c6-c6a7-479a-beb0-8d4669564fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c6267c6-c6a7-479a-beb0-8d4669564fa0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c6267c6-c6a7-479a-beb0-8d4669564fa0
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0f6c811-d291-42b2-b162-18dac1ac1700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0f6c811-d291-42b2-b162-18dac1ac1700
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0f6c811-d291-42b2-b162-18dac1ac1700
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4d0db47-01c0-4076-a9b1-b9d5642a1a34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4d0db47-01c0-4076-a9b1-b9d5642a1a34
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4d0db47-01c0-4076-a9b1-b9d5642a1a34
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-e10bce2c-edce-4a61-b151-3d6ea954b6e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e10bce2c-edce-4a61-b151-3d6ea954b6e4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e10bce2c-edce-4a61-b151-3d6ea954b6e4
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e6855a1-eaf9-485f-bb2d-83b9593b3b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e6855a1-eaf9-485f-bb2d-83b9593b3b6d
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e6855a1-eaf9-485f-bb2d-83b9593b3b6d
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-55eed8e8-677e-4ac0-b2ae-878e27aaa79d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55eed8e8-677e-4ac0-b2ae-878e27aaa79d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-55eed8e8-677e-4ac0-b2ae-878e27aaa79d
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1a05d56-3b12-4b96-95c2-9a09dee81038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a05d56-3b12-4b96-95c2-9a09dee81038
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1a05d56-3b12-4b96-95c2-9a09dee81038
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-93d3d3d5-23a7-4c71-9e28-9bceecdceb9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d3d3d5-23a7-4c71-9e28-9bceecdceb9b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-93d3d3d5-23a7-4c71-9e28-9bceecdceb9b
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdad718b-ab4c-4d19-a441-a6ea9a754038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdad718b-ab4c-4d19-a441-a6ea9a754038
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdad718b-ab4c-4d19-a441-a6ea9a754038
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-e36ea706-7c35-48cf-af66-e2bd8d820d07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e36ea706-7c35-48cf-af66-e2bd8d820d07
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e36ea706-7c35-48cf-af66-e2bd8d820d07
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-41638048-41e4-4f34-af27-6e12c299647a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41638048-41e4-4f34-af27-6e12c299647a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-41638048-41e4-4f34-af27-6e12c299647a
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd485fb5-0368-43a6-8d6d-738d8ccd3002

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd485fb5-0368-43a6-8d6d-738d8ccd3002
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd485fb5-0368-43a6-8d6d-738d8ccd3002
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-479143ad-003b-4403-9306-a8ba16c58afa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-479143ad-003b-4403-9306-a8ba16c58afa
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-479143ad-003b-4403-9306-a8ba16c58afa
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b9ea799-8224-4741-b788-36473056d696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9ea799-8224-4741-b788-36473056d696
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b9ea799-8224-4741-b788-36473056d696
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0cdb19b-499d-45e2-ae92-1e1aff3f587d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0cdb19b-499d-45e2-ae92-1e1aff3f587d
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0cdb19b-499d-45e2-ae92-1e1aff3f587d
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-6963206f-a633-483d-bd84-a260d4b5285c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6963206f-a633-483d-bd84-a260d4b5285c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-6963206f-a633-483d-bd84-a260d4b5285c
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d7b2a48-b0ed-4f28-adc9-66b174e1470a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d7b2a48-b0ed-4f28-adc9-66b174e1470a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d7b2a48-b0ed-4f28-adc9-66b174e1470a
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c055475-8689-47ad-9c1a-6e8e6a0f0a3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c055475-8689-47ad-9c1a-6e8e6a0f0a3b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c055475-8689-47ad-9c1a-6e8e6a0f0a3b
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-a78356c7-3882-4dd3-9ae8-d3d4bdd2c3b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a78356c7-3882-4dd3-9ae8-d3d4bdd2c3b6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-a78356c7-3882-4dd3-9ae8-d3d4bdd2c3b6
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-84786439-1160-46cb-9402-330566219182

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84786439-1160-46cb-9402-330566219182
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-84786439-1160-46cb-9402-330566219182
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-f27318ff-2a98-4b92-a415-6993ce78e55f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27318ff-2a98-4b92-a415-6993ce78e55f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f27318ff-2a98-4b92-a415-6993ce78e55f
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3bada80-cb52-4cfc-bf90-aa0e139d2a54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3bada80-cb52-4cfc-bf90-aa0e139d2a54
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3bada80-cb52-4cfc-bf90-aa0e139d2a54
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-452e46b2-9639-4a25-bf82-bd2844a09f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-452e46b2-9639-4a25-bf82-bd2844a09f23
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-452e46b2-9639-4a25-bf82-bd2844a09f23
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d0f70f0-7dd1-45c3-b86e-c4c6d09bcce7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d0f70f0-7dd1-45c3-b86e-c4c6d09bcce7
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d0f70f0-7dd1-45c3-b86e-c4c6d09bcce7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2d0f70f0-7dd1-45c3-b86e-c4c6d09bcce7"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-a96010c3-1ae5-4651-b6c7-6f60549a6c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a96010c3-1ae5-4651-b6c7-6f60549a6c0d
Content-Type: application/json

--- request body ---
{"handle":"qa-e1d577a7bc38","password":"****"}

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a96010c3-1ae5-4651-b6c7-6f60549a6c0d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-a96010c3-1ae5-4651-b6c7-6f60549a6c0d"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-d8af6222-4528-46bd-a2e3-058791bd787c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8af6222-4528-46bd-a2e3-058791bd787c
Content-Type: application/json

--- request body ---
{"handle":"qa-e0baacd7b023","displayName":"QA e0baacd7b023","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8af6222-4528-46bd-a2e3-058791bd787c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-d8af6222-4528-46bd-a2e3-058791bd787c"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-0676c1d7-1dea-4e64-908e-faa360a1e749

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0676c1d7-1dea-4e64-908e-faa360a1e749
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0676c1d7-1dea-4e64-908e-faa360a1e749
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0676c1d7-1dea-4e64-908e-faa360a1e749"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-60bdfed1-1c8f-4e72-a362-d59662cc8f03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60bdfed1-1c8f-4e72-a362-d59662cc8f03
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60bdfed1-1c8f-4e72-a362-d59662cc8f03
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60bdfed1-1c8f-4e72-a362-d59662cc8f03"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-666e3253-d2bf-4975-b064-adabafff0270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666e3253-d2bf-4975-b064-adabafff0270
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-666e3253-d2bf-4975-b064-adabafff0270
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-666e3253-d2bf-4975-b064-adabafff0270"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-e1d577a7bc38
correlation: qa-2ba3d67b-262e-4001-9506-1a5476a4afee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ba3d67b-262e-4001-9506-1a5476a4afee
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ba3d67b-262e-4001-9506-1a5476a4afee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-e1d577a7bc38","correlationId":"qa-2ba3d67b-262e-4001-9506-1a5476a4afee"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-70b5358f-68c6-42d0-8cd8-e6eaf64b8aff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70b5358f-68c6-42d0-8cd8-e6eaf64b8aff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e1d577a7bc38","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70b5358f-68c6-42d0-8cd8-e6eaf64b8aff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-70b5358f-68c6-42d0-8cd8-e6eaf64b8aff"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-0cbad8ed-d58b-40aa-b551-47925593f092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cbad8ed-d58b-40aa-b551-47925593f092
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0cbad8ed-d58b-40aa-b551-47925593f092
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-0cbad8ed-d58b-40aa-b551-47925593f092"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f
correlation: qa-8c5f2781-e40e-449e-a783-816c5ad4e47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c5f2781-e40e-449e-a783-816c5ad4e47d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c5f2781-e40e-449e-a783-816c5ad4e47d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f","correlationId":"qa-8c5f2781-e40e-449e-a783-816c5ad4e47d"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/messages
correlation: qa-5344b5f7-853e-4bd8-bc08-7f67648206ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5344b5f7-853e-4bd8-bc08-7f67648206ba
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5344b5f7-853e-4bd8-bc08-7f67648206ba
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/messages","correlationId":"qa-5344b5f7-853e-4bd8-bc08-7f67648206ba"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/messages
correlation: qa-b949828a-c46e-4f2e-a246-c538d686ad0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b949828a-c46e-4f2e-a246-c538d686ad0b
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b949828a-c46e-4f2e-a246-c538d686ad0b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/messages","correlationId":"qa-b949828a-c46e-4f2e-a246-c538d686ad0b"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/read
correlation: qa-e478df04-a2d5-4154-95a0-9d7a6287252a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e478df04-a2d5-4154-95a0-9d7a6287252a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e478df04-a2d5-4154-95a0-9d7a6287252a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/read","correlationId":"qa-e478df04-a2d5-4154-95a0-9d7a6287252a"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/close
correlation: qa-bbe65cda-3ad7-4e8f-8070-b9b00ca263e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbe65cda-3ad7-4e8f-8070-b9b00ca263e9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbe65cda-3ad7-4e8f-8070-b9b00ca263e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_9a1b4bd4-fa4b-4feb-a91b-deca78c35a3f/close","correlationId":"qa-bbe65cda-3ad7-4e8f-8070-b9b00ca263e9"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-9cf6ed54-403e-47a8-8bed-a73b621f7b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cf6ed54-403e-47a8-8bed-a73b621f7b90
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cf6ed54-403e-47a8-8bed-a73b621f7b90
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-9cf6ed54-403e-47a8-8bed-a73b621f7b90"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-613fca48-69c1-4d62-bd2a-d3174f446563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-613fca48-69c1-4d62-bd2a-d3174f446563
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-613fca48-69c1-4d62-bd2a-d3174f446563
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-613fca48-69c1-4d62-bd2a-d3174f446563"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53a11ad6-e74f-4369-87f0-e310357138b9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dfb0c526638346cc8df208bc92a30a1c
X-Correlation-Id: qa-53a11ad6-e74f-4369-87f0-e310357138b9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53a11ad6-e74f-4369-87f0-e310357138b9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-53a11ad6-e74f-4369-87f0-e310357138b9"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-b58be683-2248-49a2-a648-050e6c73ac74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b58be683-2248-49a2-a648-050e6c73ac74
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b58be683-2248-49a2-a648-050e6c73ac74
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-b58be683-2248-49a2-a648-050e6c73ac74"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-5393c6c3-0c78-4f0d-a25a-389a78dc8e2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5393c6c3-0c78-4f0d-a25a-389a78dc8e2c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5393c6c3-0c78-4f0d-a25a-389a78dc8e2c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5393c6c3-0c78-4f0d-a25a-389a78dc8e2c"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd3634f2-6a54-49bb-a07f-1c9c1fd31650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd3634f2-6a54-49bb-a07f-1c9c1fd31650
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd3634f2-6a54-49bb-a07f-1c9c1fd31650
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dd3634f2-6a54-49bb-a07f-1c9c1fd31650"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-ace9bf68-2461-4eea-b780-4a154f073411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ace9bf68-2461-4eea-b780-4a154f073411
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ace9bf68-2461-4eea-b780-4a154f073411
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ace9bf68-2461-4eea-b780-4a154f073411"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-f37fd56f-23fa-4613-aabb-bdd95c54084a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f37fd56f-23fa-4613-aabb-bdd95c54084a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f37fd56f-23fa-4613-aabb-bdd95c54084a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f37fd56f-23fa-4613-aabb-bdd95c54084a"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f4cfe2c-f48a-4cee-9c75-3352220e0a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f4cfe2c-f48a-4cee-9c75-3352220e0a99
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f4cfe2c-f48a-4cee-9c75-3352220e0a99
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8f4cfe2c-f48a-4cee-9c75-3352220e0a99"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-bafdba6d-cce2-4b2b-8188-a03ff0d10fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bafdba6d-cce2-4b2b-8188-a03ff0d10fe0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bafdba6d-cce2-4b2b-8188-a03ff0d10fe0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bafdba6d-cce2-4b2b-8188-a03ff0d10fe0"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-0bdb649d-5a3a-4844-bfe6-b7a178dd534c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bdb649d-5a3a-4844-bfe6-b7a178dd534c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bdb649d-5a3a-4844-bfe6-b7a178dd534c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0bdb649d-5a3a-4844-bfe6-b7a178dd534c"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-93b2df9e-210d-497b-9ad7-f8b4caa16ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93b2df9e-210d-497b-9ad7-f8b4caa16ed2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93b2df9e-210d-497b-9ad7-f8b4caa16ed2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-93b2df9e-210d-497b-9ad7-f8b4caa16ed2"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7abec0d-2aab-4d1c-8b74-83ba4e5521f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7abec0d-2aab-4d1c-8b74-83ba4e5521f4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7abec0d-2aab-4d1c-8b74-83ba4e5521f4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7abec0d-2aab-4d1c-8b74-83ba4e5521f4"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ae3f4fd-2eaf-4aab-99a7-e7cb39690514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ae3f4fd-2eaf-4aab-99a7-e7cb39690514
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ae3f4fd-2eaf-4aab-99a7-e7cb39690514
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0ae3f4fd-2eaf-4aab-99a7-e7cb39690514"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b91cf03-acec-49e4-865f-906a4529c98e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b91cf03-acec-49e4-865f-906a4529c98e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b91cf03-acec-49e4-865f-906a4529c98e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6b91cf03-acec-49e4-865f-906a4529c98e"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-15e5f9dc-66cf-44e7-b6eb-981165df0f72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e5f9dc-66cf-44e7-b6eb-981165df0f72
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15e5f9dc-66cf-44e7-b6eb-981165df0f72
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-15e5f9dc-66cf-44e7-b6eb-981165df0f72"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-433042c0-6631-42d1-a8e2-f15bac4917df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-433042c0-6631-42d1-a8e2-f15bac4917df
Content-Type: application/json

--- response: 429 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-433042c0-6631-42d1-a8e2-f15bac4917df
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-433042c0-6631-42d1-a8e2-f15bac4917df"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d4f7dae-390c-4f54-bda2-4b3a362c4d73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d4f7dae-390c-4f54-bda2-4b3a362c4d73
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d4f7dae-390c-4f54-bda2-4b3a362c4d73
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8d4f7dae-390c-4f54-bda2-4b3a362c4d73"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-7443a1e4-cc5c-4ded-91b6-cef6793c54c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7443a1e4-cc5c-4ded-91b6-cef6793c54c8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7443a1e4-cc5c-4ded-91b6-cef6793c54c8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7443a1e4-cc5c-4ded-91b6-cef6793c54c8"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-58be9c52-2f4e-46a3-8995-bf4387a97b2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58be9c52-2f4e-46a3-8995-bf4387a97b2d
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58be9c52-2f4e-46a3-8995-bf4387a97b2d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-58be9c52-2f4e-46a3-8995-bf4387a97b2d"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb9d46ba-240c-4753-a72d-bb5330f86a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb9d46ba-240c-4753-a72d-bb5330f86a99
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb9d46ba-240c-4753-a72d-bb5330f86a99
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

{"id":"acc_7059eb23-d354-4ff3-8faa-f6f623b2a376","handle":"qa-e1d577a7bc38","displayName":"QA e1d577a7bc38","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.181781324Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-c2f9ee32-457c-4f1e-9c7b-c90937010798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2f9ee32-457c-4f1e-9c7b-c90937010798
Content-Type: application/json

--- request body ---
{"handle":"qa-42af98d09f34","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2f9ee32-457c-4f1e-9c7b-c90937010798
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abebfec2-af3f-44f6-9381-3d43fc6e1727"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81365850-d4b9-4882-a994-3bb4341fff8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81365850-d4b9-4882-a994-3bb4341fff8d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81365850-d4b9-4882-a994-3bb4341fff8d
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
correlation: qa-5b487592-b6d1-4725-be3a-2da3d0871f97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b487592-b6d1-4725-be3a-2da3d0871f97
Content-Type: application/json

--- request body ---
{"handle":"qa-42af98d09f34","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b487592-b6d1-4725-be3a-2da3d0871f97
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b487592-b6d1-4725-be3a-2da3d0871f97"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-32d5d10b-1796-4836-ae07-d594f322f8a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d5d10b-1796-4836-ae07-d594f322f8a7
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-32d5d10b-1796-4836-ae07-d594f322f8a7
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
correlation: qa-24f3b226-a7fa-4f9a-be5b-2ada23d5986e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24f3b226-a7fa-4f9a-be5b-2ada23d5986e
Content-Type: application/json

--- request body ---
{"handle":"qa-e1d577a7bc38","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-24f3b226-a7fa-4f9a-be5b-2ada23d5986e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-24f3b226-a7fa-4f9a-be5b-2ada23d5986e"}
```
