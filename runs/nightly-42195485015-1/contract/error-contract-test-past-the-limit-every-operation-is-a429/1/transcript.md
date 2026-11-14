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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-7a4b174c-4269-41d5-98d9-4518b5083dba` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-fe76907e-137d-4d2e-8caa-081ae61b1542` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-bc89a3cb-b959-4aa7-8026-a7d98116a484` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-ee1b54c9-044a-43ce-9db2-4b841461e110` |
| 5 | `GET /v1/accounts/me` | 200 | 25 | `qa-a3710683-b321-4f09-8cee-9f1600a65922` |
| 6 | `GET /v1/accounts/me` | 200 | 25 | `qa-014f52ac-d26f-4131-984e-689fdd13fa5b` |
| 7 | `GET /v1/accounts/me` | 200 | 14 | `qa-8c9ceda4-cb68-4083-b94b-29fbfea32d2d` |
| 8 | `GET /v1/accounts/me` | 200 | 20 | `qa-5ab0ef8a-102e-4e4b-b894-a3f48c6a989c` |
| 9 | `GET /v1/accounts/me` | 200 | 23 | `qa-1e925c32-846c-49a3-8f9e-47c5cc09c4e6` |
| 10 | `GET /v1/accounts/me` | 200 | 12 | `qa-9f13b95a-914e-4c0c-bc1e-69c6920fb4d4` |
| 11 | `GET /v1/accounts/me` | 200 | 18 | `qa-2f3cd23d-d32c-40f3-859f-5370d8aca12f` |
| 12 | `GET /v1/accounts/me` | 200 | 20 | `qa-dc66060d-a0fa-4bda-b7b8-5c82c6bf8365` |
| 13 | `GET /v1/accounts/me` | 200 | 24 | `qa-d6d5b749-1db3-4cbf-b7f8-22d2c900b271` |
| 14 | `GET /v1/accounts/me` | 200 | 31 | `qa-1a5cfc02-dd8f-4870-ab57-68497ccde440` |
| 15 | `GET /v1/accounts/me` | 200 | 26 | `qa-27229e1b-66cf-4ebb-9e2a-fe4ad270d76b` |
| 16 | `GET /v1/accounts/me` | 200 | 22 | `qa-4357799d-2323-4c43-bdb4-4d836a58030d` |
| 17 | `GET /v1/accounts/me` | 200 | 21 | `qa-eee9358f-c683-40b9-bcdd-d6c4ea2a7266` |
| 18 | `GET /v1/accounts/me` | 200 | 24 | `qa-7097c3b8-b8ae-4207-9246-a36ee590c344` |
| 19 | `GET /v1/accounts/me` | 200 | 41 | `qa-7937eee5-b042-42cb-a9bb-57d82fed873f` |
| 20 | `GET /v1/accounts/me` | 200 | 19 | `qa-45fb4986-e21f-4ec4-9c5c-82dffeed132d` |
| 21 | `GET /v1/accounts/me` | 200 | 20 | `qa-a7294ecd-fe7f-4716-9cb1-12478e93a9a6` |
| 22 | `GET /v1/accounts/me` | 200 | 7 | `qa-20926225-fecc-4b76-8cb8-6685e29d10c6` |
| 23 | `GET /v1/accounts/me` | 200 | 55 | `qa-b6d92740-317f-49f9-900f-8a9e10350e96` |
| 24 | `GET /v1/accounts/me` | 200 | 49 | `qa-26bfcd4f-f48d-4091-8755-a0e1b9c222ac` |
| 25 | `GET /v1/accounts/me` | 200 | 32 | `qa-853b8abf-55d7-4910-bff2-42304ee2133d` |
| 26 | `GET /v1/accounts/me` | 200 | 30 | `qa-6a67c802-0bd9-4a89-b185-df6a0e43b6ed` |
| 27 | `GET /v1/accounts/me` | 200 | 22 | `qa-0f831165-6691-4b46-acf3-272fbf785d8b` |
| 28 | `GET /v1/accounts/me` | 200 | 24 | `qa-f7b1d9a7-2be2-49ca-a6e8-efc7959b2981` |
| 29 | `GET /v1/accounts/me` | 200 | 22 | `qa-04e4382b-dff6-4b10-a8ba-9c6917b1eb35` |
| 30 | `GET /v1/accounts/me` | 200 | 29 | `qa-5644ad1d-d7dd-42e0-9edd-c83fc6182748` |
| 31 | `GET /v1/accounts/me` | 200 | 18 | `qa-1f350d03-beb9-46cf-997b-cb139db41424` |
| 32 | `GET /v1/accounts/me` | 200 | 23 | `qa-b0540a7c-2af7-4c7d-8d26-ce7979797637` |
| 33 | `GET /v1/accounts/me` | 200 | 25 | `qa-7a46a999-7caa-4ae5-97d4-eeeabe77aaa2` |
| 34 | `GET /v1/accounts/me` | 200 | 10 | `qa-80e590e8-835a-43d8-8ce0-e0753ba5a26a` |
| 35 | `GET /v1/accounts/me` | 200 | 18 | `qa-6b8a5f3b-4649-4919-87cf-76f5b798f51a` |
| 36 | `GET /v1/accounts/me` | 200 | 26 | `qa-04b754a9-368e-4c48-b9d8-139582da001f` |
| 37 | `GET /v1/accounts/me` | 200 | 31 | `qa-014e6040-5da7-4a1f-ae29-70f6811823f5` |
| 38 | `GET /v1/accounts/me` | 200 | 13 | `qa-cfb8eac3-759e-4f5a-bfd8-92c31157df2b` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-5ea3d977-b387-42ae-b7c7-8b08c451f604` |
| 40 | `GET /v1/accounts/me` | 200 | 15 | `qa-6ee93f82-8d93-489a-a2cc-abe38e41b963` |
| 41 | `GET /v1/accounts/me` | 200 | 18 | `qa-17220642-628c-4794-a069-853345abdf14` |
| 42 | `GET /v1/accounts/me` | 200 | 13 | `qa-cecf9fbb-d2c8-4663-a46a-2e74b18cbad1` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-64b03276-54f4-47c2-bc00-67836854da3f` |
| 44 | `GET /v1/accounts/me` | 200 | 20 | `qa-1133fab2-3c59-467e-a4ac-cd3181ae05e4` |
| 45 | `GET /v1/accounts/me` | 200 | 19 | `qa-92eccf36-8902-4646-a82b-ba4fc27a0f04` |
| 46 | `GET /v1/accounts/me` | 200 | 16 | `qa-421d7419-ccee-4aea-8956-dafbd61a4ce7` |
| 47 | `GET /v1/accounts/me` | 200 | 22 | `qa-f5b3f90f-d2fd-45d6-a01c-aaa4ff091098` |
| 48 | `GET /v1/accounts/me` | 200 | 16 | `qa-0b76174f-7bcf-4486-a564-b5419dbbe130` |
| 49 | `GET /v1/accounts/me` | 200 | 17 | `qa-08c42a15-83ca-4cb5-bcc4-1efb78559c04` |
| 50 | `GET /v1/accounts/me` | 200 | 26 | `qa-dd7284aa-e1dc-4ccc-9333-59ff53b326ec` |
| 51 | `GET /v1/accounts/me` | 200 | 28 | `qa-97172bb9-6079-40a6-a0d1-738ad02a2d70` |
| 52 | `GET /v1/accounts/me` | 200 | 19 | `qa-c60ec964-308f-4f12-b3b5-c7b7e8d9707f` |
| 53 | `GET /v1/accounts/me` | 200 | 7 | `qa-79e590b5-9112-4348-8630-d2b24a11cbe9` |
| 54 | `GET /v1/accounts/me` | 200 | 33 | `qa-6b68b989-8ec1-465d-a737-af0ddac7b8ac` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-89383213-a3d6-4cff-b216-a3a6c675fa3b` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-de07170c-3e45-4577-b2a4-b9df5b1bbc01` |
| 57 | `GET /v1/accounts/me` | 200 | 14 | `qa-d817e116-4c28-431e-880a-85079bca0098` |
| 58 | `GET /v1/accounts/me` | 200 | 11 | `qa-2d338314-ea66-4458-98fe-31b2978484e5` |
| 59 | `GET /v1/accounts/me` | 200 | 7 | `qa-15719dce-fb9e-46a3-a98a-664315d2dace` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-6ec48bb9-894f-4a4f-ae09-17c8957e5b71` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-d4d23d15-184d-47f3-ad7c-15a35c6c3ef6` |
| 62 | `GET /v1/accounts/me` | 200 | 10 | `qa-bec5c35a-ec68-439c-9dcf-3ceaeb4482dc` |
| 63 | `GET /v1/accounts/me` | 200 | 12 | `qa-b1fad3b4-d2ce-46ba-92fb-2e6d51a7b7e4` |
| 64 | `GET /v1/accounts/me` | 429 | 11 | `qa-fa451483-ca9b-43d7-a480-72d38dd980b6` |
| 65 | `POST /v1/auth/token` | 429 | 6 | `qa-0a005ce3-7b44-4d5b-b243-545f11b9a92a` |
| 66 | `POST /v1/accounts` | 429 | 5 | `qa-861d9ce5-a254-4039-9055-9bdbc7052c2d` |
| 67 | `GET /v1/accounts/me` | 429 | 9 | `qa-301b12aa-b217-401c-be06-103432328269` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-77e9435c-d931-4e75-a1c5-11e02a7d11cc` |
| 69 | `DELETE /v1/accounts/me` | 429 | 6 | `qa-ec2b8f55-e1fd-4008-b606-05c693b397e3` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-44f9a1ea-2953-402c-957f-b00b246e093e` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-ea0aed8b-656b-4bc9-906a-fbb8fddd44a4` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-7df705c6-e339-4579-a2ef-d323c78a3134` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-954c3de2-d4b2-402f-bb53-6c3e06ecf30d` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 5 | `qa-59244aba-151f-44b2-84c1-e82e8d585f2e` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 5 | `qa-a1c690eb-0f16-4c3e-a60d-6bacee10cb52` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-1279329c-e84c-4395-b4a0-9df926ee6a21` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-40dadd77-a09d-4f39-b8f2-ba92826abe3e` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-caaf931d-44ae-42b2-835d-e2d568d62c8f` |
| 79 | `GET /v1/credits/ledger` | 429 | 5 | `qa-a0e33e7a-5504-435c-9163-fa7f76597b70` |
| 80 | `POST /v1/credits/purchases` | 429 | 4 | `qa-0dce4f04-b6f5-4120-8969-dda5bebd1001` |
| 81 | `GET /v1/admin/stats` | 429 | 5 | `qa-4cabfb7a-e378-4475-9b81-5f1b9f09833c` |
| 82 | `GET /v1/accounts/me` | 429 | 5 | `qa-734335a1-b868-4a53-92ad-194a186b2946` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-f7d87554-1786-4ee6-bb45-33edc9527463` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-6b8f29ed-f52d-45de-9580-0a80a0dc2724` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-361050c5-b7f6-4358-a0d4-45577eeb323c` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-ecf828f6-73de-4855-9057-ae6b36dff242` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-835ac06e-9967-46ad-abda-53e8ac8f6871` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-508c17ad-c61f-4186-a18e-40fe3f6ba7a1` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-f48dd5f4-e1a8-4929-b6d2-95a9a79dc0d1` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-b0df6bbc-7377-41f9-9015-5823d255f14a` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-d42387ad-a65d-428f-b9ec-33890f0101a8` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-b7d25dbf-7c1e-41cb-a356-6835ef318ffd` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-cf2c246f-5944-403e-9783-4dde7b3781ba` |
| 94 | `GET /v1/accounts/me` | 429 | 6 | `qa-eb044a20-2801-4ece-b64c-f9f393153851` |
| 95 | `GET /v1/accounts/me` | 429 | 5 | `qa-858d9bbf-9f5b-4749-879c-6f6c4129b889` |
| 96 | `GET /v1/accounts/me` | 200 | 4 | `qa-e4cefae6-dbf1-4414-9096-9fb22432fd3a` |
| 97 | `POST /v1/auth/token` | 200 | 11 | `qa-0b772b6b-40d1-4f73-949a-1753f2154820` |
| 98 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-b9e53245-8206-472a-9ac1-04d305108ccf` |
| 99 | `POST /v1/auth/token` | 401 | 6 | `qa-e87f6841-b7a7-4918-bdb8-85a96ffc9ecc` |
| 100 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-58fb90e6-8811-4168-af6f-91f62f6479a0` |
| 101 | `POST /v1/auth/token` | 401 | 5 | `qa-378a4930-720b-4237-b5bf-c322ae501c53` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7a4b174c-4269-41d5-98d9-4518b5083dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a4b174c-4269-41d5-98d9-4518b5083dba
Content-Type: application/json

--- request body ---
{"handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a4b174c-4269-41d5-98d9-4518b5083dba
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
Location: /v1/accounts/qa-fd1f7a740890
X-Served-Region: eu
Content-Length: 181

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fe76907e-137d-4d2e-8caa-081ae61b1542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe76907e-137d-4d2e-8caa-081ae61b1542
Content-Type: application/json

--- request body ---
{"handle":"qa-ec12b6a00b17","displayName":"QA ec12b6a00b17","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe76907e-137d-4d2e-8caa-081ae61b1542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Location: /v1/accounts/qa-ec12b6a00b17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_03b1c0e0-f79f-409b-83bc-403c4b487297","handle":"qa-ec12b6a00b17","displayName":"QA ec12b6a00b17","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.365159577Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bc89a3cb-b959-4aa7-8026-a7d98116a484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc89a3cb-b959-4aa7-8026-a7d98116a484
Content-Type: application/json

--- request body ---
{"handle":"qa-fd1f7a740890","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc89a3cb-b959-4aa7-8026-a7d98116a484
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_387af301-ff2b-4b3e-b133-2365c40f3162"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ee1b54c9-044a-43ce-9db2-4b841461e110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee1b54c9-044a-43ce-9db2-4b841461e110
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ec12b6a00b17","subject":"Error contract","message":"Hi"}

--- response: 201 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee1b54c9-044a-43ce-9db2-4b841461e110
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
Location: /v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2a09749a-136a-4511-abc7-35f9c62f2358","subject":"Error contract","status":"open","region":"eu","participants":["qa-fd1f7a740890","qa-ec12b6a00b17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.479789965Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3710683-b321-4f09-8cee-9f1600a65922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3710683-b321-4f09-8cee-9f1600a65922
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3710683-b321-4f09-8cee-9f1600a65922
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-014f52ac-d26f-4131-984e-689fdd13fa5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-014f52ac-d26f-4131-984e-689fdd13fa5b
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-014f52ac-d26f-4131-984e-689fdd13fa5b
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c9ceda4-cb68-4083-b94b-29fbfea32d2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9ceda4-cb68-4083-b94b-29fbfea32d2d
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c9ceda4-cb68-4083-b94b-29fbfea32d2d
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ab0ef8a-102e-4e4b-b894-a3f48c6a989c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ab0ef8a-102e-4e4b-b894-a3f48c6a989c
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ab0ef8a-102e-4e4b-b894-a3f48c6a989c
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e925c32-846c-49a3-8f9e-47c5cc09c4e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e925c32-846c-49a3-8f9e-47c5cc09c4e6
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e925c32-846c-49a3-8f9e-47c5cc09c4e6
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f13b95a-914e-4c0c-bc1e-69c6920fb4d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f13b95a-914e-4c0c-bc1e-69c6920fb4d4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f13b95a-914e-4c0c-bc1e-69c6920fb4d4
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f3cd23d-d32c-40f3-859f-5370d8aca12f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f3cd23d-d32c-40f3-859f-5370d8aca12f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f3cd23d-d32c-40f3-859f-5370d8aca12f
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc66060d-a0fa-4bda-b7b8-5c82c6bf8365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc66060d-a0fa-4bda-b7b8-5c82c6bf8365
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc66060d-a0fa-4bda-b7b8-5c82c6bf8365
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6d5b749-1db3-4cbf-b7f8-22d2c900b271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6d5b749-1db3-4cbf-b7f8-22d2c900b271
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6d5b749-1db3-4cbf-b7f8-22d2c900b271
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a5cfc02-dd8f-4870-ab57-68497ccde440

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a5cfc02-dd8f-4870-ab57-68497ccde440
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a5cfc02-dd8f-4870-ab57-68497ccde440
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-27229e1b-66cf-4ebb-9e2a-fe4ad270d76b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27229e1b-66cf-4ebb-9e2a-fe4ad270d76b
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-27229e1b-66cf-4ebb-9e2a-fe4ad270d76b
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-4357799d-2323-4c43-bdb4-4d836a58030d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4357799d-2323-4c43-bdb4-4d836a58030d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4357799d-2323-4c43-bdb4-4d836a58030d
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-eee9358f-c683-40b9-bcdd-d6c4ea2a7266

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eee9358f-c683-40b9-bcdd-d6c4ea2a7266
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-eee9358f-c683-40b9-bcdd-d6c4ea2a7266
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-7097c3b8-b8ae-4207-9246-a36ee590c344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7097c3b8-b8ae-4207-9246-a36ee590c344
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7097c3b8-b8ae-4207-9246-a36ee590c344
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-7937eee5-b042-42cb-a9bb-57d82fed873f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7937eee5-b042-42cb-a9bb-57d82fed873f
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7937eee5-b042-42cb-a9bb-57d82fed873f
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-45fb4986-e21f-4ec4-9c5c-82dffeed132d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45fb4986-e21f-4ec4-9c5c-82dffeed132d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-45fb4986-e21f-4ec4-9c5c-82dffeed132d
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7294ecd-fe7f-4716-9cb1-12478e93a9a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7294ecd-fe7f-4716-9cb1-12478e93a9a6
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7294ecd-fe7f-4716-9cb1-12478e93a9a6
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-20926225-fecc-4b76-8cb8-6685e29d10c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20926225-fecc-4b76-8cb8-6685e29d10c6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-20926225-fecc-4b76-8cb8-6685e29d10c6
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6d92740-317f-49f9-900f-8a9e10350e96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6d92740-317f-49f9-900f-8a9e10350e96
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6d92740-317f-49f9-900f-8a9e10350e96
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-26bfcd4f-f48d-4091-8755-a0e1b9c222ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26bfcd4f-f48d-4091-8755-a0e1b9c222ac
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-26bfcd4f-f48d-4091-8755-a0e1b9c222ac
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-853b8abf-55d7-4910-bff2-42304ee2133d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853b8abf-55d7-4910-bff2-42304ee2133d
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-853b8abf-55d7-4910-bff2-42304ee2133d
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a67c802-0bd9-4a89-b185-df6a0e43b6ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a67c802-0bd9-4a89-b185-df6a0e43b6ed
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a67c802-0bd9-4a89-b185-df6a0e43b6ed
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f831165-6691-4b46-acf3-272fbf785d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f831165-6691-4b46-acf3-272fbf785d8b
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f831165-6691-4b46-acf3-272fbf785d8b
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7b1d9a7-2be2-49ca-a6e8-efc7959b2981

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7b1d9a7-2be2-49ca-a6e8-efc7959b2981
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7b1d9a7-2be2-49ca-a6e8-efc7959b2981
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-04e4382b-dff6-4b10-a8ba-9c6917b1eb35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04e4382b-dff6-4b10-a8ba-9c6917b1eb35
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-04e4382b-dff6-4b10-a8ba-9c6917b1eb35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-5644ad1d-d7dd-42e0-9edd-c83fc6182748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5644ad1d-d7dd-42e0-9edd-c83fc6182748
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5644ad1d-d7dd-42e0-9edd-c83fc6182748
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f350d03-beb9-46cf-997b-cb139db41424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f350d03-beb9-46cf-997b-cb139db41424
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f350d03-beb9-46cf-997b-cb139db41424
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0540a7c-2af7-4c7d-8d26-ce7979797637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0540a7c-2af7-4c7d-8d26-ce7979797637
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0540a7c-2af7-4c7d-8d26-ce7979797637
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a46a999-7caa-4ae5-97d4-eeeabe77aaa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a46a999-7caa-4ae5-97d4-eeeabe77aaa2
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a46a999-7caa-4ae5-97d4-eeeabe77aaa2
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-80e590e8-835a-43d8-8ce0-e0753ba5a26a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80e590e8-835a-43d8-8ce0-e0753ba5a26a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-80e590e8-835a-43d8-8ce0-e0753ba5a26a
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b8a5f3b-4649-4919-87cf-76f5b798f51a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8a5f3b-4649-4919-87cf-76f5b798f51a
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b8a5f3b-4649-4919-87cf-76f5b798f51a
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-04b754a9-368e-4c48-b9d8-139582da001f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04b754a9-368e-4c48-b9d8-139582da001f
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-04b754a9-368e-4c48-b9d8-139582da001f
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-014e6040-5da7-4a1f-ae29-70f6811823f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-014e6040-5da7-4a1f-ae29-70f6811823f5
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-014e6040-5da7-4a1f-ae29-70f6811823f5
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-cfb8eac3-759e-4f5a-bfd8-92c31157df2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfb8eac3-759e-4f5a-bfd8-92c31157df2b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfb8eac3-759e-4f5a-bfd8-92c31157df2b
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ea3d977-b387-42ae-b7c7-8b08c451f604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ea3d977-b387-42ae-b7c7-8b08c451f604
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ea3d977-b387-42ae-b7c7-8b08c451f604
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ee93f82-8d93-489a-a2cc-abe38e41b963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ee93f82-8d93-489a-a2cc-abe38e41b963
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ee93f82-8d93-489a-a2cc-abe38e41b963
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-17220642-628c-4794-a069-853345abdf14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17220642-628c-4794-a069-853345abdf14
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-17220642-628c-4794-a069-853345abdf14
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-cecf9fbb-d2c8-4663-a46a-2e74b18cbad1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cecf9fbb-d2c8-4663-a46a-2e74b18cbad1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cecf9fbb-d2c8-4663-a46a-2e74b18cbad1
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-64b03276-54f4-47c2-bc00-67836854da3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b03276-54f4-47c2-bc00-67836854da3f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b03276-54f4-47c2-bc00-67836854da3f
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-1133fab2-3c59-467e-a4ac-cd3181ae05e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1133fab2-3c59-467e-a4ac-cd3181ae05e4
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-1133fab2-3c59-467e-a4ac-cd3181ae05e4
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-92eccf36-8902-4646-a82b-ba4fc27a0f04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92eccf36-8902-4646-a82b-ba4fc27a0f04
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-92eccf36-8902-4646-a82b-ba4fc27a0f04
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-421d7419-ccee-4aea-8956-dafbd61a4ce7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-421d7419-ccee-4aea-8956-dafbd61a4ce7
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-421d7419-ccee-4aea-8956-dafbd61a4ce7
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5b3f90f-d2fd-45d6-a01c-aaa4ff091098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5b3f90f-d2fd-45d6-a01c-aaa4ff091098
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5b3f90f-d2fd-45d6-a01c-aaa4ff091098
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b76174f-7bcf-4486-a564-b5419dbbe130

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b76174f-7bcf-4486-a564-b5419dbbe130
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b76174f-7bcf-4486-a564-b5419dbbe130
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-08c42a15-83ca-4cb5-bcc4-1efb78559c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08c42a15-83ca-4cb5-bcc4-1efb78559c04
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-08c42a15-83ca-4cb5-bcc4-1efb78559c04
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd7284aa-e1dc-4ccc-9333-59ff53b326ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd7284aa-e1dc-4ccc-9333-59ff53b326ec
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd7284aa-e1dc-4ccc-9333-59ff53b326ec
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-97172bb9-6079-40a6-a0d1-738ad02a2d70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97172bb9-6079-40a6-a0d1-738ad02a2d70
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-97172bb9-6079-40a6-a0d1-738ad02a2d70
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-c60ec964-308f-4f12-b3b5-c7b7e8d9707f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c60ec964-308f-4f12-b3b5-c7b7e8d9707f
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c60ec964-308f-4f12-b3b5-c7b7e8d9707f
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-79e590b5-9112-4348-8630-d2b24a11cbe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79e590b5-9112-4348-8630-d2b24a11cbe9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-79e590b5-9112-4348-8630-d2b24a11cbe9
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b68b989-8ec1-465d-a737-af0ddac7b8ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b68b989-8ec1-465d-a737-af0ddac7b8ac
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b68b989-8ec1-465d-a737-af0ddac7b8ac
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-89383213-a3d6-4cff-b216-a3a6c675fa3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89383213-a3d6-4cff-b216-a3a6c675fa3b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-89383213-a3d6-4cff-b216-a3a6c675fa3b
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-de07170c-3e45-4577-b2a4-b9df5b1bbc01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de07170c-3e45-4577-b2a4-b9df5b1bbc01
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-de07170c-3e45-4577-b2a4-b9df5b1bbc01
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-d817e116-4c28-431e-880a-85079bca0098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d817e116-4c28-431e-880a-85079bca0098
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d817e116-4c28-431e-880a-85079bca0098
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d338314-ea66-4458-98fe-31b2978484e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d338314-ea66-4458-98fe-31b2978484e5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d338314-ea66-4458-98fe-31b2978484e5
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-15719dce-fb9e-46a3-a98a-664315d2dace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15719dce-fb9e-46a3-a98a-664315d2dace
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-15719dce-fb9e-46a3-a98a-664315d2dace
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ec48bb9-894f-4a4f-ae09-17c8957e5b71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ec48bb9-894f-4a4f-ae09-17c8957e5b71
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ec48bb9-894f-4a4f-ae09-17c8957e5b71
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4d23d15-184d-47f3-ad7c-15a35c6c3ef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4d23d15-184d-47f3-ad7c-15a35c6c3ef6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4d23d15-184d-47f3-ad7c-15a35c6c3ef6
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-bec5c35a-ec68-439c-9dcf-3ceaeb4482dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec5c35a-ec68-439c-9dcf-3ceaeb4482dc
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bec5c35a-ec68-439c-9dcf-3ceaeb4482dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1fad3b4-d2ce-46ba-92fb-2e6d51a7b7e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1fad3b4-d2ce-46ba-92fb-2e6d51a7b7e4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1fad3b4-d2ce-46ba-92fb-2e6d51a7b7e4
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa451483-ca9b-43d7-a480-72d38dd980b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa451483-ca9b-43d7-a480-72d38dd980b6
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fa451483-ca9b-43d7-a480-72d38dd980b6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fa451483-ca9b-43d7-a480-72d38dd980b6"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-0a005ce3-7b44-4d5b-b243-545f11b9a92a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a005ce3-7b44-4d5b-b243-545f11b9a92a
Content-Type: application/json

--- request body ---
{"handle":"qa-fd1f7a740890","password":"****"}

--- response: 429 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a005ce3-7b44-4d5b-b243-545f11b9a92a
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
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/auth/token","correlationId":"qa-0a005ce3-7b44-4d5b-b243-545f11b9a92a"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-861d9ce5-a254-4039-9055-9bdbc7052c2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-861d9ce5-a254-4039-9055-9bdbc7052c2d
Content-Type: application/json

--- request body ---
{"handle":"qa-cb2200686b38","displayName":"QA cb2200686b38","password":"****","region":"eu"}

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-861d9ce5-a254-4039-9055-9bdbc7052c2d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts","correlationId":"qa-861d9ce5-a254-4039-9055-9bdbc7052c2d"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-301b12aa-b217-401c-be06-103432328269

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-301b12aa-b217-401c-be06-103432328269
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-301b12aa-b217-401c-be06-103432328269
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-301b12aa-b217-401c-be06-103432328269"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-77e9435c-d931-4e75-a1c5-11e02a7d11cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e9435c-d931-4e75-a1c5-11e02a7d11cc
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77e9435c-d931-4e75-a1c5-11e02a7d11cc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-77e9435c-d931-4e75-a1c5-11e02a7d11cc"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec2b8f55-e1fd-4008-b606-05c693b397e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec2b8f55-e1fd-4008-b606-05c693b397e3
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec2b8f55-e1fd-4008-b606-05c693b397e3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ec2b8f55-e1fd-4008-b606-05c693b397e3"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-fd1f7a740890
correlation: qa-44f9a1ea-2953-402c-957f-b00b246e093e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44f9a1ea-2953-402c-957f-b00b246e093e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44f9a1ea-2953-402c-957f-b00b246e093e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-fd1f7a740890","correlationId":"qa-44f9a1ea-2953-402c-957f-b00b246e093e"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-ea0aed8b-656b-4bc9-906a-fbb8fddd44a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea0aed8b-656b-4bc9-906a-fbb8fddd44a4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fd1f7a740890","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea0aed8b-656b-4bc9-906a-fbb8fddd44a4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-ea0aed8b-656b-4bc9-906a-fbb8fddd44a4"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-7df705c6-e339-4579-a2ef-d323c78a3134

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7df705c6-e339-4579-a2ef-d323c78a3134
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7df705c6-e339-4579-a2ef-d323c78a3134
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-7df705c6-e339-4579-a2ef-d323c78a3134"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358
correlation: qa-954c3de2-d4b2-402f-bb53-6c3e06ecf30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-954c3de2-d4b2-402f-bb53-6c3e06ecf30d
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-954c3de2-d4b2-402f-bb53-6c3e06ecf30d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358","correlationId":"qa-954c3de2-d4b2-402f-bb53-6c3e06ecf30d"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/messages
correlation: qa-59244aba-151f-44b2-84c1-e82e8d585f2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59244aba-151f-44b2-84c1-e82e8d585f2e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59244aba-151f-44b2-84c1-e82e8d585f2e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/messages","correlationId":"qa-59244aba-151f-44b2-84c1-e82e8d585f2e"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/messages
correlation: qa-a1c690eb-0f16-4c3e-a60d-6bacee10cb52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c690eb-0f16-4c3e-a60d-6bacee10cb52
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1c690eb-0f16-4c3e-a60d-6bacee10cb52
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/messages","correlationId":"qa-a1c690eb-0f16-4c3e-a60d-6bacee10cb52"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/read
correlation: qa-1279329c-e84c-4395-b4a0-9df926ee6a21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1279329c-e84c-4395-b4a0-9df926ee6a21
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1279329c-e84c-4395-b4a0-9df926ee6a21
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/read","correlationId":"qa-1279329c-e84c-4395-b4a0-9df926ee6a21"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/close
correlation: qa-40dadd77-a09d-4f39-b8f2-ba92826abe3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40dadd77-a09d-4f39-b8f2-ba92826abe3e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40dadd77-a09d-4f39-b8f2-ba92826abe3e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_2a09749a-136a-4511-abc7-35f9c62f2358/close","correlationId":"qa-40dadd77-a09d-4f39-b8f2-ba92826abe3e"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-caaf931d-44ae-42b2-835d-e2d568d62c8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caaf931d-44ae-42b2-835d-e2d568d62c8f
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-caaf931d-44ae-42b2-835d-e2d568d62c8f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-caaf931d-44ae-42b2-835d-e2d568d62c8f"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-a0e33e7a-5504-435c-9163-fa7f76597b70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e33e7a-5504-435c-9163-fa7f76597b70
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0e33e7a-5504-435c-9163-fa7f76597b70
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-a0e33e7a-5504-435c-9163-fa7f76597b70"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-0dce4f04-b6f5-4120-8969-dda5bebd1001

--- request headers ---
Accept: application/json
Idempotency-Key: qa-afc7413ecaa9492db7e24fb1be10bbde
X-Correlation-Id: qa-0dce4f04-b6f5-4120-8969-dda5bebd1001
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0dce4f04-b6f5-4120-8969-dda5bebd1001
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-0dce4f04-b6f5-4120-8969-dda5bebd1001"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-4cabfb7a-e378-4475-9b81-5f1b9f09833c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cabfb7a-e378-4475-9b81-5f1b9f09833c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cabfb7a-e378-4475-9b81-5f1b9f09833c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-4cabfb7a-e378-4475-9b81-5f1b9f09833c"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-734335a1-b868-4a53-92ad-194a186b2946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734335a1-b868-4a53-92ad-194a186b2946
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-734335a1-b868-4a53-92ad-194a186b2946
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-734335a1-b868-4a53-92ad-194a186b2946"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7d87554-1786-4ee6-bb45-33edc9527463

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7d87554-1786-4ee6-bb45-33edc9527463
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7d87554-1786-4ee6-bb45-33edc9527463
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f7d87554-1786-4ee6-bb45-33edc9527463"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b8f29ed-f52d-45de-9580-0a80a0dc2724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b8f29ed-f52d-45de-9580-0a80a0dc2724
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b8f29ed-f52d-45de-9580-0a80a0dc2724
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6b8f29ed-f52d-45de-9580-0a80a0dc2724"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-361050c5-b7f6-4358-a0d4-45577eeb323c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-361050c5-b7f6-4358-a0d4-45577eeb323c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-361050c5-b7f6-4358-a0d4-45577eeb323c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-361050c5-b7f6-4358-a0d4-45577eeb323c"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecf828f6-73de-4855-9057-ae6b36dff242

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecf828f6-73de-4855-9057-ae6b36dff242
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecf828f6-73de-4855-9057-ae6b36dff242
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ecf828f6-73de-4855-9057-ae6b36dff242"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-835ac06e-9967-46ad-abda-53e8ac8f6871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-835ac06e-9967-46ad-abda-53e8ac8f6871
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-835ac06e-9967-46ad-abda-53e8ac8f6871
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-835ac06e-9967-46ad-abda-53e8ac8f6871"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-508c17ad-c61f-4186-a18e-40fe3f6ba7a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-508c17ad-c61f-4186-a18e-40fe3f6ba7a1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-508c17ad-c61f-4186-a18e-40fe3f6ba7a1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-508c17ad-c61f-4186-a18e-40fe3f6ba7a1"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-f48dd5f4-e1a8-4929-b6d2-95a9a79dc0d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f48dd5f4-e1a8-4929-b6d2-95a9a79dc0d1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f48dd5f4-e1a8-4929-b6d2-95a9a79dc0d1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f48dd5f4-e1a8-4929-b6d2-95a9a79dc0d1"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0df6bbc-7377-41f9-9015-5823d255f14a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0df6bbc-7377-41f9-9015-5823d255f14a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 06 Nov 2026 09:30:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0df6bbc-7377-41f9-9015-5823d255f14a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0df6bbc-7377-41f9-9015-5823d255f14a"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-d42387ad-a65d-428f-b9ec-33890f0101a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d42387ad-a65d-428f-b9ec-33890f0101a8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d42387ad-a65d-428f-b9ec-33890f0101a8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d42387ad-a65d-428f-b9ec-33890f0101a8"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7d25dbf-7c1e-41cb-a356-6835ef318ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7d25dbf-7c1e-41cb-a356-6835ef318ffd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7d25dbf-7c1e-41cb-a356-6835ef318ffd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b7d25dbf-7c1e-41cb-a356-6835ef318ffd"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf2c246f-5944-403e-9783-4dde7b3781ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf2c246f-5944-403e-9783-4dde7b3781ba
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf2c246f-5944-403e-9783-4dde7b3781ba
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf2c246f-5944-403e-9783-4dde7b3781ba"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb044a20-2801-4ece-b64c-f9f393153851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb044a20-2801-4ece-b64c-f9f393153851
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb044a20-2801-4ece-b64c-f9f393153851
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb044a20-2801-4ece-b64c-f9f393153851"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-858d9bbf-9f5b-4749-879c-6f6c4129b889

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-858d9bbf-9f5b-4749-879c-6f6c4129b889
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-858d9bbf-9f5b-4749-879c-6f6c4129b889
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-858d9bbf-9f5b-4749-879c-6f6c4129b889"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4cefae6-dbf1-4414-9096-9fb22432fd3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4cefae6-dbf1-4414-9096-9fb22432fd3a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4cefae6-dbf1-4414-9096-9fb22432fd3a
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

{"id":"acc_387af301-ff2b-4b3e-b133-2365c40f3162","handle":"qa-fd1f7a740890","displayName":"QA fd1f7a740890","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.317365731Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-0b772b6b-40d1-4f73-949a-1753f2154820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b772b6b-40d1-4f73-949a-1753f2154820
Content-Type: application/json

--- request body ---
{"handle":"qa-ec12b6a00b17","password":"****"}

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b772b6b-40d1-4f73-949a-1753f2154820
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_03b1c0e0-f79f-409b-83bc-403c4b487297"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9e53245-8206-472a-9ac1-04d305108ccf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9e53245-8206-472a-9ac1-04d305108ccf
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b9e53245-8206-472a-9ac1-04d305108ccf
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
correlation: qa-e87f6841-b7a7-4918-bdb8-85a96ffc9ecc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e87f6841-b7a7-4918-bdb8-85a96ffc9ecc
Content-Type: application/json

--- request body ---
{"handle":"qa-ec12b6a00b17","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e87f6841-b7a7-4918-bdb8-85a96ffc9ecc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e87f6841-b7a7-4918-bdb8-85a96ffc9ecc"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58fb90e6-8811-4168-af6f-91f62f6479a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58fb90e6-8811-4168-af6f-91f62f6479a0
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58fb90e6-8811-4168-af6f-91f62f6479a0
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
correlation: qa-378a4930-720b-4237-b5bf-c322ae501c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378a4930-720b-4237-b5bf-c322ae501c53
Content-Type: application/json

--- request body ---
{"handle":"qa-fd1f7a740890","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-378a4930-720b-4237-b5bf-c322ae501c53
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-378a4930-720b-4237-b5bf-c322ae501c53"}
```
