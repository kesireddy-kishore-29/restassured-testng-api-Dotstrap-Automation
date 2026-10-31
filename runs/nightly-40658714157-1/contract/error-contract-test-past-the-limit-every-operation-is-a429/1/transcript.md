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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-4acd29a7-7320-47c9-b97d-25168ed2f653` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-c343f641-fdea-4333-8ca5-fd8062c2fa30` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-483f8168-f370-418d-a92d-c197bb10641e` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-2395f77c-3767-4b23-b273-63611fd6601c` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-02298e47-2021-4d3c-9cf5-470ea3dda928` |
| 6 | `GET /v1/accounts/me` | 200 | 26 | `qa-c1816589-5edc-45ae-8769-1777213e1900` |
| 7 | `GET /v1/accounts/me` | 200 | 22 | `qa-d83675fd-d1d0-44c8-a8e9-8f3ff8b7fda1` |
| 8 | `GET /v1/accounts/me` | 200 | 46 | `qa-372affea-2e37-4697-88b8-ab6a7cb15a7c` |
| 9 | `GET /v1/accounts/me` | 200 | 26 | `qa-7644fd0f-cf10-418e-97f8-1b50b71f4e4c` |
| 10 | `GET /v1/accounts/me` | 200 | 9 | `qa-1367906a-6ee6-4e2d-9a52-5c07ed53505b` |
| 11 | `GET /v1/accounts/me` | 200 | 8 | `qa-41575de5-76fa-428a-9ea1-cc45ccf3a175` |
| 12 | `GET /v1/accounts/me` | 200 | 10 | `qa-24134b5a-915d-450e-a4d5-2a1837a930f0` |
| 13 | `GET /v1/accounts/me` | 200 | 13 | `qa-01aa51e7-6565-4f43-8058-2b16861e8b93` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-1029a071-e870-428e-afdb-6bb65ea27531` |
| 15 | `GET /v1/accounts/me` | 200 | 24 | `qa-cd8550ec-4faf-4d51-b5c6-4d0f0d966217` |
| 16 | `GET /v1/accounts/me` | 200 | 17 | `qa-50870f31-a4c8-4e6b-b5c3-e16ce92a342d` |
| 17 | `GET /v1/accounts/me` | 200 | 11 | `qa-c084c1b5-dde2-46dd-89e0-301a967b90e8` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-b1702384-dac0-40fd-b09b-81ca744e30ff` |
| 19 | `GET /v1/accounts/me` | 200 | 11 | `qa-d347632f-3dae-4459-beb4-86c681848f29` |
| 20 | `GET /v1/accounts/me` | 200 | 12 | `qa-d6a23302-c00f-4bdc-9082-330c6af2b574` |
| 21 | `GET /v1/accounts/me` | 200 | 7 | `qa-b54b8fed-13c6-441a-9a8d-1f2d396ec627` |
| 22 | `GET /v1/accounts/me` | 200 | 10 | `qa-350d41cb-4423-43bc-aa5a-2ded944b74e4` |
| 23 | `GET /v1/accounts/me` | 200 | 14 | `qa-2773aa1a-5359-43af-97df-54436e39da0f` |
| 24 | `GET /v1/accounts/me` | 200 | 14 | `qa-ac1d3a77-c5d8-4952-9da5-61a04f851516` |
| 25 | `GET /v1/accounts/me` | 200 | 24 | `qa-2466e8f0-4a3b-44f6-987f-31ad4d89b5cc` |
| 26 | `GET /v1/accounts/me` | 200 | 17 | `qa-b59d8884-1033-4b3b-a282-823aa5414970` |
| 27 | `GET /v1/accounts/me` | 200 | 16 | `qa-db33ceba-9c6b-4fc5-81d0-54e1e98bd5eb` |
| 28 | `GET /v1/accounts/me` | 200 | 6 | `qa-03ecd9d1-bfbc-4095-86dd-bb5086c22d89` |
| 29 | `GET /v1/accounts/me` | 200 | 12 | `qa-ff31ad8a-eea1-4936-a95a-11d9aced70aa` |
| 30 | `GET /v1/accounts/me` | 200 | 10 | `qa-726469a7-08e7-4fd1-9cf5-de5db87b57d4` |
| 31 | `GET /v1/accounts/me` | 200 | 16 | `qa-8b76587d-3406-4140-8424-172ea76d0a99` |
| 32 | `GET /v1/accounts/me` | 200 | 18 | `qa-4d20bfd2-48e0-44a9-a09f-2e82083e66c1` |
| 33 | `GET /v1/accounts/me` | 200 | 43 | `qa-15cdbdd2-2bff-4559-bc4a-4cedafc8f503` |
| 34 | `GET /v1/accounts/me` | 200 | 14 | `qa-32b7af06-1498-48b6-8ade-2884c3049a35` |
| 35 | `GET /v1/accounts/me` | 200 | 30 | `qa-a73d2d39-09dc-4e00-9cf5-5790810293a8` |
| 36 | `GET /v1/accounts/me` | 200 | 13 | `qa-e7bdc500-cbcd-4fea-83ed-4bbfd7d3dc1d` |
| 37 | `GET /v1/accounts/me` | 200 | 11 | `qa-0520dbac-55b5-42ce-90f4-9a9f40676ea3` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-954528e4-9e58-4dfc-8153-dc20a44d738a` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-5a0ecc61-5bdc-49bb-90c0-ac6e2c799557` |
| 40 | `GET /v1/accounts/me` | 200 | 2 | `qa-a00780b4-91b6-4c65-a3e9-2e05ac431270` |
| 41 | `GET /v1/accounts/me` | 200 | 4 | `qa-58a70566-0a31-4fa7-bebf-8f62f9daf65f` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-edc2c16b-82e6-4f94-94a2-047586d1542c` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-9ee6f92a-2bae-4e89-9724-be49d7883bfa` |
| 44 | `GET /v1/accounts/me` | 200 | 18 | `qa-eadb90ee-b7bd-4486-81fb-307af4aa27f7` |
| 45 | `GET /v1/accounts/me` | 200 | 3 | `qa-a1263478-d0c5-426f-9c18-ddca32b500db` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-df0141fa-668e-4d6f-a520-c6929f8ac733` |
| 47 | `GET /v1/accounts/me` | 200 | 6 | `qa-b0b496d8-1c55-43a2-b32c-060c7298b106` |
| 48 | `GET /v1/accounts/me` | 200 | 9 | `qa-cd3e7368-6c4b-4433-86ca-e39ff283f396` |
| 49 | `GET /v1/accounts/me` | 200 | 12 | `qa-d8413b7f-fa58-4725-9d2e-689df895c921` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-24a6522f-be04-4324-95d2-8cf9ef298625` |
| 51 | `GET /v1/accounts/me` | 200 | 3 | `qa-b40abb97-4e84-450c-b0af-5d1d9e86c295` |
| 52 | `GET /v1/accounts/me` | 200 | 12 | `qa-965a3fc3-bfce-44cd-8dbe-94ff8ff27349` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-bb8f61ce-d5a9-4791-9059-4f9c080d31d3` |
| 54 | `GET /v1/accounts/me` | 200 | 9 | `qa-f683444b-f469-4202-b760-12871830335b` |
| 55 | `GET /v1/accounts/me` | 200 | 3 | `qa-76ee1797-b7a8-4071-a68c-661b3e831598` |
| 56 | `GET /v1/accounts/me` | 200 | 15 | `qa-454db135-3be5-4c53-983c-aea24398cdff` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-148277df-2011-47e2-bf16-d77b2f30faba` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-1390118e-ff39-48ab-bff0-6682b69bab9c` |
| 59 | `GET /v1/accounts/me` | 200 | 8 | `qa-34a17fe7-57dc-497f-bc1a-69659c0bcaa9` |
| 60 | `GET /v1/accounts/me` | 200 | 20 | `qa-f36bcdb5-83f2-4d97-9c27-ef3b2dd8b05d` |
| 61 | `GET /v1/accounts/me` | 200 | 18 | `qa-5b218da0-e814-4409-81c0-615edbf48aec` |
| 62 | `GET /v1/accounts/me` | 200 | 13 | `qa-3322f424-93eb-4846-9ed0-d3820917f7ab` |
| 63 | `GET /v1/accounts/me` | 200 | 4 | `qa-4dd698ed-eb49-4f4c-99a3-9d10762e51ea` |
| 64 | `GET /v1/accounts/me` | 429 | 7 | `qa-e2e94578-60cb-47d1-b7e7-91a783f458ae` |
| 65 | `POST /v1/auth/token` | 429 | 11 | `qa-13b08315-67e4-49fc-8211-bafb77024948` |
| 66 | `POST /v1/accounts` | 429 | 7 | `qa-402739d5-7c8d-4182-9e6d-dce36e738657` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-d2efe322-1aea-4197-a3e7-40dbe912a75c` |
| 68 | `PATCH /v1/accounts/me` | 429 | 5 | `qa-7449e3a3-9286-48af-9422-f5702d39aca7` |
| 69 | `DELETE /v1/accounts/me` | 429 | 3 | `qa-c759ae47-20b1-45b2-8e0f-88bfc506a2ed` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 2 | `qa-b73111e4-4459-4398-9a84-10e6ae00a5cf` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-a7b07f2c-6e36-42a3-93aa-5b53c34f9f09` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-0e751390-33fe-418f-92e5-cf7587221554` |
| 73 | `GET /v1/conversations/{id}` | 429 | 13 | `qa-9be6fb46-276a-4c25-9b94-44fd097fc02a` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-276bd3ae-ba13-4e2e-8939-2438cc0a3286` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-964de31a-29a7-4cbc-ad47-37d1fbcd97e1` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-e9b9b91a-e61d-4c1f-b9f7-7673b6cc939d` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-005766b4-1fd6-443f-bd36-37a136deb90e` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-c78aa712-f5f9-4ee7-a9c3-f4683de32bf0` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-f2d79f55-8de3-4ca7-b17d-0f3ce623d9fe` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-513f21c1-eeb9-411f-b9a6-03b8c19ca9f4` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-1abe26dc-c2d6-44d0-a13f-fe63969ab43b` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-b623a25d-5a26-4e2e-bf8e-705d3c36e50b` |
| 83 | `GET /v1/accounts/me` | 429 | 4 | `qa-20ad0762-cf11-49dc-b41e-0d59c8334fd6` |
| 84 | `GET /v1/accounts/me` | 429 | 2 | `qa-a0a4258b-77ae-4bb1-a4d4-2ad964ef3a7a` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-69c9f57b-a9b7-491c-b3cf-e04223c94b91` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-68f6c24a-97d4-44e6-81c2-067afab85fcc` |
| 87 | `GET /v1/accounts/me` | 429 | 2 | `qa-fba429db-7481-4a82-a115-338ba3a0b851` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-c974eebc-3d04-443c-b054-657215b557d9` |
| 89 | `GET /v1/accounts/me` | 429 | 2 | `qa-f31f8a87-343c-4c1a-b327-0865a6518928` |
| 90 | `GET /v1/accounts/me` | 429 | 2 | `qa-239a72f8-75bf-4b3e-8c4a-7ece6de23962` |
| 91 | `GET /v1/accounts/me` | 429 | 1 | `qa-b0366a57-9a62-4cb1-b8b8-c73745173d51` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-b164e6ec-f51c-4b05-9de2-c2b3a919a7df` |
| 93 | `GET /v1/accounts/me` | 429 | 5 | `qa-82e6222d-827a-4d11-9984-24428172e74a` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-256abcb1-e343-4069-bd1e-9aedf8096bb7` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-7a9c4f17-6975-4377-bb12-17b6fcc04f2a` |
| 96 | `GET /v1/accounts/me` | 429 | 3 | `qa-ade02cee-cd5d-4680-8ef7-05942a42ba29` |
| 97 | `GET /v1/accounts/me` | 429 | 6 | `qa-a9bc209d-16f6-446b-b46b-f09cc87e1101` |
| 98 | `GET /v1/accounts/me` | 200 | 5 | `qa-9cd539c2-126f-4acd-a0cd-569592d7bc92` |
| 99 | `POST /v1/auth/token` | 200 | 6 | `qa-d654ca5f-2797-4efd-b080-d6f9e39578a3` |
| 100 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-db18dede-4215-447d-9a59-cf8241405e8e` |
| 101 | `POST /v1/auth/token` | 401 | 6 | `qa-90094639-1758-4c40-87bb-90b8d002903b` |
| 102 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-24ad240b-3f45-499d-ad48-0ef1ecab2f23` |
| 103 | `POST /v1/auth/token` | 401 | 2 | `qa-bf85c866-e1c0-47d9-aeb8-5094610284d1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4acd29a7-7320-47c9-b97d-25168ed2f653

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4acd29a7-7320-47c9-b97d-25168ed2f653
Content-Type: application/json

--- request body ---
{"handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4acd29a7-7320-47c9-b97d-25168ed2f653
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 9
Location: /v1/accounts/qa-cd75009cfe46
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c343f641-fdea-4333-8ca5-fd8062c2fa30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c343f641-fdea-4333-8ca5-fd8062c2fa30
Content-Type: application/json

--- request body ---
{"handle":"qa-e2f3dc1b3ea6","displayName":"QA e2f3dc1b3ea6","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c343f641-fdea-4333-8ca5-fd8062c2fa30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 9
Location: /v1/accounts/qa-e2f3dc1b3ea6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_35869014-2b70-4473-98a0-dc05bcff6e23","handle":"qa-e2f3dc1b3ea6","displayName":"QA e2f3dc1b3ea6","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.545634724Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-483f8168-f370-418d-a92d-c197bb10641e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-483f8168-f370-418d-a92d-c197bb10641e
Content-Type: application/json

--- request body ---
{"handle":"qa-cd75009cfe46","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-483f8168-f370-418d-a92d-c197bb10641e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50c678a9-62b3-414c-b555-f1101a613e04"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2395f77c-3767-4b23-b273-63611fd6601c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2395f77c-3767-4b23-b273-63611fd6601c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e2f3dc1b3ea6","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2395f77c-3767-4b23-b273-63611fd6601c
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
Location: /v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_950c21d1-f205-48f1-abf7-ebf54e531184","subject":"Error contract","status":"open","region":"eu","participants":["qa-cd75009cfe46","qa-e2f3dc1b3ea6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.592080326Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-02298e47-2021-4d3c-9cf5-470ea3dda928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02298e47-2021-4d3c-9cf5-470ea3dda928
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-02298e47-2021-4d3c-9cf5-470ea3dda928
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-c1816589-5edc-45ae-8769-1777213e1900

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1816589-5edc-45ae-8769-1777213e1900
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1816589-5edc-45ae-8769-1777213e1900
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-d83675fd-d1d0-44c8-a8e9-8f3ff8b7fda1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d83675fd-d1d0-44c8-a8e9-8f3ff8b7fda1
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d83675fd-d1d0-44c8-a8e9-8f3ff8b7fda1
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-372affea-2e37-4697-88b8-ab6a7cb15a7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-372affea-2e37-4697-88b8-ab6a7cb15a7c
Content-Type: application/json

--- response: 200 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-372affea-2e37-4697-88b8-ab6a7cb15a7c
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-7644fd0f-cf10-418e-97f8-1b50b71f4e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7644fd0f-cf10-418e-97f8-1b50b71f4e4c
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7644fd0f-cf10-418e-97f8-1b50b71f4e4c
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-1367906a-6ee6-4e2d-9a52-5c07ed53505b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1367906a-6ee6-4e2d-9a52-5c07ed53505b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1367906a-6ee6-4e2d-9a52-5c07ed53505b
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-41575de5-76fa-428a-9ea1-cc45ccf3a175

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41575de5-76fa-428a-9ea1-cc45ccf3a175
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-41575de5-76fa-428a-9ea1-cc45ccf3a175
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-24134b5a-915d-450e-a4d5-2a1837a930f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24134b5a-915d-450e-a4d5-2a1837a930f0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-24134b5a-915d-450e-a4d5-2a1837a930f0
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-01aa51e7-6565-4f43-8058-2b16861e8b93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01aa51e7-6565-4f43-8058-2b16861e8b93
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-01aa51e7-6565-4f43-8058-2b16861e8b93
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-1029a071-e870-428e-afdb-6bb65ea27531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1029a071-e870-428e-afdb-6bb65ea27531
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1029a071-e870-428e-afdb-6bb65ea27531
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd8550ec-4faf-4d51-b5c6-4d0f0d966217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd8550ec-4faf-4d51-b5c6-4d0f0d966217
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd8550ec-4faf-4d51-b5c6-4d0f0d966217
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-50870f31-a4c8-4e6b-b5c3-e16ce92a342d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50870f31-a4c8-4e6b-b5c3-e16ce92a342d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-50870f31-a4c8-4e6b-b5c3-e16ce92a342d
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-c084c1b5-dde2-46dd-89e0-301a967b90e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c084c1b5-dde2-46dd-89e0-301a967b90e8
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c084c1b5-dde2-46dd-89e0-301a967b90e8
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1702384-dac0-40fd-b09b-81ca744e30ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1702384-dac0-40fd-b09b-81ca744e30ff
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1702384-dac0-40fd-b09b-81ca744e30ff
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-d347632f-3dae-4459-beb4-86c681848f29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d347632f-3dae-4459-beb4-86c681848f29
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d347632f-3dae-4459-beb4-86c681848f29
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6a23302-c00f-4bdc-9082-330c6af2b574

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6a23302-c00f-4bdc-9082-330c6af2b574
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6a23302-c00f-4bdc-9082-330c6af2b574
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-b54b8fed-13c6-441a-9a8d-1f2d396ec627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b54b8fed-13c6-441a-9a8d-1f2d396ec627
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b54b8fed-13c6-441a-9a8d-1f2d396ec627
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-350d41cb-4423-43bc-aa5a-2ded944b74e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-350d41cb-4423-43bc-aa5a-2ded944b74e4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-350d41cb-4423-43bc-aa5a-2ded944b74e4
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-2773aa1a-5359-43af-97df-54436e39da0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2773aa1a-5359-43af-97df-54436e39da0f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2773aa1a-5359-43af-97df-54436e39da0f
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac1d3a77-c5d8-4952-9da5-61a04f851516

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac1d3a77-c5d8-4952-9da5-61a04f851516
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac1d3a77-c5d8-4952-9da5-61a04f851516
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-2466e8f0-4a3b-44f6-987f-31ad4d89b5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2466e8f0-4a3b-44f6-987f-31ad4d89b5cc
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2466e8f0-4a3b-44f6-987f-31ad4d89b5cc
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-b59d8884-1033-4b3b-a282-823aa5414970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b59d8884-1033-4b3b-a282-823aa5414970
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b59d8884-1033-4b3b-a282-823aa5414970
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-db33ceba-9c6b-4fc5-81d0-54e1e98bd5eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db33ceba-9c6b-4fc5-81d0-54e1e98bd5eb
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-db33ceba-9c6b-4fc5-81d0-54e1e98bd5eb
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-03ecd9d1-bfbc-4095-86dd-bb5086c22d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03ecd9d1-bfbc-4095-86dd-bb5086c22d89
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-03ecd9d1-bfbc-4095-86dd-bb5086c22d89
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff31ad8a-eea1-4936-a95a-11d9aced70aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff31ad8a-eea1-4936-a95a-11d9aced70aa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff31ad8a-eea1-4936-a95a-11d9aced70aa
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-726469a7-08e7-4fd1-9cf5-de5db87b57d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-726469a7-08e7-4fd1-9cf5-de5db87b57d4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-726469a7-08e7-4fd1-9cf5-de5db87b57d4
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b76587d-3406-4140-8424-172ea76d0a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b76587d-3406-4140-8424-172ea76d0a99
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b76587d-3406-4140-8424-172ea76d0a99
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d20bfd2-48e0-44a9-a09f-2e82083e66c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d20bfd2-48e0-44a9-a09f-2e82083e66c1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d20bfd2-48e0-44a9-a09f-2e82083e66c1
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-15cdbdd2-2bff-4559-bc4a-4cedafc8f503

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15cdbdd2-2bff-4559-bc4a-4cedafc8f503
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-15cdbdd2-2bff-4559-bc4a-4cedafc8f503
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-32b7af06-1498-48b6-8ade-2884c3049a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b7af06-1498-48b6-8ade-2884c3049a35
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-32b7af06-1498-48b6-8ade-2884c3049a35
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-a73d2d39-09dc-4e00-9cf5-5790810293a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a73d2d39-09dc-4e00-9cf5-5790810293a8
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a73d2d39-09dc-4e00-9cf5-5790810293a8
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7bdc500-cbcd-4fea-83ed-4bbfd7d3dc1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7bdc500-cbcd-4fea-83ed-4bbfd7d3dc1d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7bdc500-cbcd-4fea-83ed-4bbfd7d3dc1d
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-0520dbac-55b5-42ce-90f4-9a9f40676ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0520dbac-55b5-42ce-90f4-9a9f40676ea3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-0520dbac-55b5-42ce-90f4-9a9f40676ea3
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-954528e4-9e58-4dfc-8153-dc20a44d738a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-954528e4-9e58-4dfc-8153-dc20a44d738a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-954528e4-9e58-4dfc-8153-dc20a44d738a
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a0ecc61-5bdc-49bb-90c0-ac6e2c799557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a0ecc61-5bdc-49bb-90c0-ac6e2c799557
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a0ecc61-5bdc-49bb-90c0-ac6e2c799557
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-a00780b4-91b6-4c65-a3e9-2e05ac431270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a00780b4-91b6-4c65-a3e9-2e05ac431270
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a00780b4-91b6-4c65-a3e9-2e05ac431270
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-58a70566-0a31-4fa7-bebf-8f62f9daf65f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a70566-0a31-4fa7-bebf-8f62f9daf65f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-58a70566-0a31-4fa7-bebf-8f62f9daf65f
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-edc2c16b-82e6-4f94-94a2-047586d1542c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edc2c16b-82e6-4f94-94a2-047586d1542c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-edc2c16b-82e6-4f94-94a2-047586d1542c
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ee6f92a-2bae-4e89-9724-be49d7883bfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee6f92a-2bae-4e89-9724-be49d7883bfa
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ee6f92a-2bae-4e89-9724-be49d7883bfa
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-eadb90ee-b7bd-4486-81fb-307af4aa27f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eadb90ee-b7bd-4486-81fb-307af4aa27f7
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eadb90ee-b7bd-4486-81fb-307af4aa27f7
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1263478-d0c5-426f-9c18-ddca32b500db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1263478-d0c5-426f-9c18-ddca32b500db
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1263478-d0c5-426f-9c18-ddca32b500db
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-df0141fa-668e-4d6f-a520-c6929f8ac733

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df0141fa-668e-4d6f-a520-c6929f8ac733
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-df0141fa-668e-4d6f-a520-c6929f8ac733
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0b496d8-1c55-43a2-b32c-060c7298b106

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0b496d8-1c55-43a2-b32c-060c7298b106
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0b496d8-1c55-43a2-b32c-060c7298b106
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd3e7368-6c4b-4433-86ca-e39ff283f396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd3e7368-6c4b-4433-86ca-e39ff283f396
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd3e7368-6c4b-4433-86ca-e39ff283f396
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8413b7f-fa58-4725-9d2e-689df895c921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8413b7f-fa58-4725-9d2e-689df895c921
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8413b7f-fa58-4725-9d2e-689df895c921
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-24a6522f-be04-4324-95d2-8cf9ef298625

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24a6522f-be04-4324-95d2-8cf9ef298625
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-24a6522f-be04-4324-95d2-8cf9ef298625
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-b40abb97-4e84-450c-b0af-5d1d9e86c295

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40abb97-4e84-450c-b0af-5d1d9e86c295
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b40abb97-4e84-450c-b0af-5d1d9e86c295
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-965a3fc3-bfce-44cd-8dbe-94ff8ff27349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-965a3fc3-bfce-44cd-8dbe-94ff8ff27349
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-965a3fc3-bfce-44cd-8dbe-94ff8ff27349
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb8f61ce-d5a9-4791-9059-4f9c080d31d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8f61ce-d5a9-4791-9059-4f9c080d31d3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb8f61ce-d5a9-4791-9059-4f9c080d31d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-f683444b-f469-4202-b760-12871830335b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f683444b-f469-4202-b760-12871830335b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f683444b-f469-4202-b760-12871830335b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-76ee1797-b7a8-4071-a68c-661b3e831598

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76ee1797-b7a8-4071-a68c-661b3e831598
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-76ee1797-b7a8-4071-a68c-661b3e831598
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-454db135-3be5-4c53-983c-aea24398cdff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454db135-3be5-4c53-983c-aea24398cdff
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-454db135-3be5-4c53-983c-aea24398cdff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-148277df-2011-47e2-bf16-d77b2f30faba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-148277df-2011-47e2-bf16-d77b2f30faba
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-148277df-2011-47e2-bf16-d77b2f30faba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-1390118e-ff39-48ab-bff0-6682b69bab9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1390118e-ff39-48ab-bff0-6682b69bab9c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1390118e-ff39-48ab-bff0-6682b69bab9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-34a17fe7-57dc-497f-bc1a-69659c0bcaa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a17fe7-57dc-497f-bc1a-69659c0bcaa9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-34a17fe7-57dc-497f-bc1a-69659c0bcaa9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-f36bcdb5-83f2-4d97-9c27-ef3b2dd8b05d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f36bcdb5-83f2-4d97-9c27-ef3b2dd8b05d
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f36bcdb5-83f2-4d97-9c27-ef3b2dd8b05d
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b218da0-e814-4409-81c0-615edbf48aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b218da0-e814-4409-81c0-615edbf48aec
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b218da0-e814-4409-81c0-615edbf48aec
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-3322f424-93eb-4846-9ed0-d3820917f7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3322f424-93eb-4846-9ed0-d3820917f7ab
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3322f424-93eb-4846-9ed0-d3820917f7ab
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-4dd698ed-eb49-4f4c-99a3-9d10762e51ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dd698ed-eb49-4f4c-99a3-9d10762e51ea
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dd698ed-eb49-4f4c-99a3-9d10762e51ea
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2e94578-60cb-47d1-b7e7-91a783f458ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e94578-60cb-47d1-b7e7-91a783f458ae
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2e94578-60cb-47d1-b7e7-91a783f458ae
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e2e94578-60cb-47d1-b7e7-91a783f458ae"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-13b08315-67e4-49fc-8211-bafb77024948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13b08315-67e4-49fc-8211-bafb77024948
Content-Type: application/json

--- request body ---
{"handle":"qa-cd75009cfe46","password":"****"}

--- response: 429 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13b08315-67e4-49fc-8211-bafb77024948
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-13b08315-67e4-49fc-8211-bafb77024948"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-402739d5-7c8d-4182-9e6d-dce36e738657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-402739d5-7c8d-4182-9e6d-dce36e738657
Content-Type: application/json

--- request body ---
{"handle":"qa-057977f5ddf2","displayName":"QA 057977f5ddf2","password":"****","region":"eu"}

--- response: 429 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-402739d5-7c8d-4182-9e6d-dce36e738657
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-402739d5-7c8d-4182-9e6d-dce36e738657"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2efe322-1aea-4197-a3e7-40dbe912a75c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2efe322-1aea-4197-a3e7-40dbe912a75c
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d2efe322-1aea-4197-a3e7-40dbe912a75c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d2efe322-1aea-4197-a3e7-40dbe912a75c"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-7449e3a3-9286-48af-9422-f5702d39aca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7449e3a3-9286-48af-9422-f5702d39aca7
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7449e3a3-9286-48af-9422-f5702d39aca7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7449e3a3-9286-48af-9422-f5702d39aca7"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c759ae47-20b1-45b2-8e0f-88bfc506a2ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c759ae47-20b1-45b2-8e0f-88bfc506a2ed
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c759ae47-20b1-45b2-8e0f-88bfc506a2ed
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c759ae47-20b1-45b2-8e0f-88bfc506a2ed"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-cd75009cfe46
correlation: qa-b73111e4-4459-4398-9a84-10e6ae00a5cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b73111e4-4459-4398-9a84-10e6ae00a5cf
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b73111e4-4459-4398-9a84-10e6ae00a5cf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-cd75009cfe46","correlationId":"qa-b73111e4-4459-4398-9a84-10e6ae00a5cf"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-a7b07f2c-6e36-42a3-93aa-5b53c34f9f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7b07f2c-6e36-42a3-93aa-5b53c34f9f09
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cd75009cfe46","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7b07f2c-6e36-42a3-93aa-5b53c34f9f09
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-a7b07f2c-6e36-42a3-93aa-5b53c34f9f09"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-0e751390-33fe-418f-92e5-cf7587221554

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e751390-33fe-418f-92e5-cf7587221554
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e751390-33fe-418f-92e5-cf7587221554
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-0e751390-33fe-418f-92e5-cf7587221554"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184
correlation: qa-9be6fb46-276a-4c25-9b94-44fd097fc02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9be6fb46-276a-4c25-9b94-44fd097fc02a
Content-Type: application/json

--- response: 429 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9be6fb46-276a-4c25-9b94-44fd097fc02a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184","correlationId":"qa-9be6fb46-276a-4c25-9b94-44fd097fc02a"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/messages
correlation: qa-276bd3ae-ba13-4e2e-8939-2438cc0a3286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-276bd3ae-ba13-4e2e-8939-2438cc0a3286
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-276bd3ae-ba13-4e2e-8939-2438cc0a3286
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/messages","correlationId":"qa-276bd3ae-ba13-4e2e-8939-2438cc0a3286"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/messages
correlation: qa-964de31a-29a7-4cbc-ad47-37d1fbcd97e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964de31a-29a7-4cbc-ad47-37d1fbcd97e1
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-964de31a-29a7-4cbc-ad47-37d1fbcd97e1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/messages","correlationId":"qa-964de31a-29a7-4cbc-ad47-37d1fbcd97e1"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/read
correlation: qa-e9b9b91a-e61d-4c1f-b9f7-7673b6cc939d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9b9b91a-e61d-4c1f-b9f7-7673b6cc939d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9b9b91a-e61d-4c1f-b9f7-7673b6cc939d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/read","correlationId":"qa-e9b9b91a-e61d-4c1f-b9f7-7673b6cc939d"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/close
correlation: qa-005766b4-1fd6-443f-bd36-37a136deb90e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-005766b4-1fd6-443f-bd36-37a136deb90e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-005766b4-1fd6-443f-bd36-37a136deb90e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_950c21d1-f205-48f1-abf7-ebf54e531184/close","correlationId":"qa-005766b4-1fd6-443f-bd36-37a136deb90e"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-c78aa712-f5f9-4ee7-a9c3-f4683de32bf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c78aa712-f5f9-4ee7-a9c3-f4683de32bf0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c78aa712-f5f9-4ee7-a9c3-f4683de32bf0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-c78aa712-f5f9-4ee7-a9c3-f4683de32bf0"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f2d79f55-8de3-4ca7-b17d-0f3ce623d9fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2d79f55-8de3-4ca7-b17d-0f3ce623d9fe
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2d79f55-8de3-4ca7-b17d-0f3ce623d9fe
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-f2d79f55-8de3-4ca7-b17d-0f3ce623d9fe"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-513f21c1-eeb9-411f-b9a6-03b8c19ca9f4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-51ace57e3161484482081f3c840f9835
X-Correlation-Id: qa-513f21c1-eeb9-411f-b9a6-03b8c19ca9f4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-513f21c1-eeb9-411f-b9a6-03b8c19ca9f4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-513f21c1-eeb9-411f-b9a6-03b8c19ca9f4"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-1abe26dc-c2d6-44d0-a13f-fe63969ab43b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1abe26dc-c2d6-44d0-a13f-fe63969ab43b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1abe26dc-c2d6-44d0-a13f-fe63969ab43b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-1abe26dc-c2d6-44d0-a13f-fe63969ab43b"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-b623a25d-5a26-4e2e-bf8e-705d3c36e50b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b623a25d-5a26-4e2e-bf8e-705d3c36e50b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b623a25d-5a26-4e2e-bf8e-705d3c36e50b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b623a25d-5a26-4e2e-bf8e-705d3c36e50b"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-20ad0762-cf11-49dc-b41e-0d59c8334fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ad0762-cf11-49dc-b41e-0d59c8334fd6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20ad0762-cf11-49dc-b41e-0d59c8334fd6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-20ad0762-cf11-49dc-b41e-0d59c8334fd6"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0a4258b-77ae-4bb1-a4d4-2ad964ef3a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0a4258b-77ae-4bb1-a4d4-2ad964ef3a7a
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0a4258b-77ae-4bb1-a4d4-2ad964ef3a7a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a0a4258b-77ae-4bb1-a4d4-2ad964ef3a7a"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-69c9f57b-a9b7-491c-b3cf-e04223c94b91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c9f57b-a9b7-491c-b3cf-e04223c94b91
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69c9f57b-a9b7-491c-b3cf-e04223c94b91
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-69c9f57b-a9b7-491c-b3cf-e04223c94b91"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-68f6c24a-97d4-44e6-81c2-067afab85fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68f6c24a-97d4-44e6-81c2-067afab85fcc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68f6c24a-97d4-44e6-81c2-067afab85fcc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-68f6c24a-97d4-44e6-81c2-067afab85fcc"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-fba429db-7481-4a82-a115-338ba3a0b851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fba429db-7481-4a82-a115-338ba3a0b851
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fba429db-7481-4a82-a115-338ba3a0b851
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fba429db-7481-4a82-a115-338ba3a0b851"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-c974eebc-3d04-443c-b054-657215b557d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c974eebc-3d04-443c-b054-657215b557d9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c974eebc-3d04-443c-b054-657215b557d9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c974eebc-3d04-443c-b054-657215b557d9"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-f31f8a87-343c-4c1a-b327-0865a6518928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f31f8a87-343c-4c1a-b327-0865a6518928
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f31f8a87-343c-4c1a-b327-0865a6518928
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f31f8a87-343c-4c1a-b327-0865a6518928"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-239a72f8-75bf-4b3e-8c4a-7ece6de23962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-239a72f8-75bf-4b3e-8c4a-7ece6de23962
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-239a72f8-75bf-4b3e-8c4a-7ece6de23962
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-239a72f8-75bf-4b3e-8c4a-7ece6de23962"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0366a57-9a62-4cb1-b8b8-c73745173d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0366a57-9a62-4cb1-b8b8-c73745173d51
Content-Type: application/json

--- response: 429 in 1 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0366a57-9a62-4cb1-b8b8-c73745173d51
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0366a57-9a62-4cb1-b8b8-c73745173d51"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-b164e6ec-f51c-4b05-9de2-c2b3a919a7df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b164e6ec-f51c-4b05-9de2-c2b3a919a7df
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b164e6ec-f51c-4b05-9de2-c2b3a919a7df
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b164e6ec-f51c-4b05-9de2-c2b3a919a7df"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-82e6222d-827a-4d11-9984-24428172e74a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82e6222d-827a-4d11-9984-24428172e74a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82e6222d-827a-4d11-9984-24428172e74a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-82e6222d-827a-4d11-9984-24428172e74a"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-256abcb1-e343-4069-bd1e-9aedf8096bb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-256abcb1-e343-4069-bd1e-9aedf8096bb7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-256abcb1-e343-4069-bd1e-9aedf8096bb7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-256abcb1-e343-4069-bd1e-9aedf8096bb7"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a9c4f17-6975-4377-bb12-17b6fcc04f2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a9c4f17-6975-4377-bb12-17b6fcc04f2a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Wed, 28 Oct 2026 08:43:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a9c4f17-6975-4377-bb12-17b6fcc04f2a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7a9c4f17-6975-4377-bb12-17b6fcc04f2a"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-ade02cee-cd5d-4680-8ef7-05942a42ba29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade02cee-cd5d-4680-8ef7-05942a42ba29
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Wed, 28 Oct 2026 08:43:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ade02cee-cd5d-4680-8ef7-05942a42ba29
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ade02cee-cd5d-4680-8ef7-05942a42ba29"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9bc209d-16f6-446b-b46b-f09cc87e1101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9bc209d-16f6-446b-b46b-f09cc87e1101
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9bc209d-16f6-446b-b46b-f09cc87e1101
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a9bc209d-16f6-446b-b46b-f09cc87e1101"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cd539c2-126f-4acd-a0cd-569592d7bc92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd539c2-126f-4acd-a0cd-569592d7bc92
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cd539c2-126f-4acd-a0cd-569592d7bc92
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

{"id":"acc_50c678a9-62b3-414c-b555-f1101a613e04","handle":"qa-cd75009cfe46","displayName":"QA cd75009cfe46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.516510015Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-d654ca5f-2797-4efd-b080-d6f9e39578a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d654ca5f-2797-4efd-b080-d6f9e39578a3
Content-Type: application/json

--- request body ---
{"handle":"qa-e2f3dc1b3ea6","password":"****"}

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d654ca5f-2797-4efd-b080-d6f9e39578a3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_35869014-2b70-4473-98a0-dc05bcff6e23"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db18dede-4215-447d-9a59-cf8241405e8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db18dede-4215-447d-9a59-cf8241405e8e
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db18dede-4215-447d-9a59-cf8241405e8e
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
correlation: qa-90094639-1758-4c40-87bb-90b8d002903b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90094639-1758-4c40-87bb-90b8d002903b
Content-Type: application/json

--- request body ---
{"handle":"qa-e2f3dc1b3ea6","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90094639-1758-4c40-87bb-90b8d002903b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90094639-1758-4c40-87bb-90b8d002903b"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24ad240b-3f45-499d-ad48-0ef1ecab2f23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ad240b-3f45-499d-ad48-0ef1ecab2f23
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24ad240b-3f45-499d-ad48-0ef1ecab2f23
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
correlation: qa-bf85c866-e1c0-47d9-aeb8-5094610284d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf85c866-e1c0-47d9-aeb8-5094610284d1
Content-Type: application/json

--- request body ---
{"handle":"qa-cd75009cfe46","password":"****"}

--- response: 401 in 2 ms ---
Date: Wed, 28 Oct 2026 08:43:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf85c866-e1c0-47d9-aeb8-5094610284d1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf85c866-e1c0-47d9-aeb8-5094610284d1"}
```
