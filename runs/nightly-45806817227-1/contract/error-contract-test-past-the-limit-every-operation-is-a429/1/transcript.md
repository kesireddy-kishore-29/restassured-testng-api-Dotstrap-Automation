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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-34370a0a-f653-4b55-a3f0-cc0396120045` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-aed82a29-77e9-4a30-9960-dd7ab432876c` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-ecdf50d8-8511-4514-b141-9f968fef579f` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-6cb8ece0-4290-4a45-b581-0c9571bf38d7` |
| 5 | `GET /v1/accounts/me` | 200 | 21 | `qa-046c45e1-ef5e-4e4e-ad0b-36202578a347` |
| 6 | `GET /v1/accounts/me` | 200 | 28 | `qa-048990b7-925e-4f31-b7de-2198fbbb1b1a` |
| 7 | `GET /v1/accounts/me` | 200 | 19 | `qa-d2075704-e410-4979-ac0f-c07fc288d44e` |
| 8 | `GET /v1/accounts/me` | 200 | 28 | `qa-8941838d-fbcc-4dfb-9f35-dacac9f0fd10` |
| 9 | `GET /v1/accounts/me` | 200 | 23 | `qa-33411122-b76f-4076-8d5b-adc11ed79724` |
| 10 | `GET /v1/accounts/me` | 200 | 30 | `qa-7c7ecdb6-da76-4483-a37d-3b484853977e` |
| 11 | `GET /v1/accounts/me` | 200 | 20 | `qa-679f6429-135c-4ded-be19-6ba8366f2fcc` |
| 12 | `GET /v1/accounts/me` | 200 | 15 | `qa-0961c2d0-40d2-422e-b395-fdade2bd1f4e` |
| 13 | `GET /v1/accounts/me` | 200 | 9 | `qa-e29a6356-0502-4312-b3d9-2688d2d06200` |
| 14 | `GET /v1/accounts/me` | 200 | 10 | `qa-2cf05067-e16e-49d6-aa7c-4a7162e86d04` |
| 15 | `GET /v1/accounts/me` | 200 | 30 | `qa-3633a1b4-f937-4baa-978e-93cf81d22f6d` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-fa10d647-ea28-4343-962e-475b865ea23e` |
| 17 | `GET /v1/accounts/me` | 200 | 10 | `qa-c0160cc1-8074-4292-b01f-3e229d25c909` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-901476d5-015f-438d-8549-4184657f6c64` |
| 19 | `GET /v1/accounts/me` | 200 | 22 | `qa-d96f2f59-f1d9-49e5-99ea-71bb5d2a2d38` |
| 20 | `GET /v1/accounts/me` | 200 | 6 | `qa-35b6a11d-cc69-4905-b37f-5c80ba1dda66` |
| 21 | `GET /v1/accounts/me` | 200 | 23 | `qa-8229a30e-2446-44e5-a980-3a41d8431fca` |
| 22 | `GET /v1/accounts/me` | 200 | 19 | `qa-2a837976-dc75-46a1-b9ba-2281704c298e` |
| 23 | `GET /v1/accounts/me` | 200 | 10 | `qa-5dc20961-bc34-4175-9743-a41694211226` |
| 24 | `GET /v1/accounts/me` | 200 | 19 | `qa-003e90e7-e1f5-406a-9fce-155fc1a45604` |
| 25 | `GET /v1/accounts/me` | 200 | 32 | `qa-dc56ea36-00ea-425b-b7bb-fe9e7695e172` |
| 26 | `GET /v1/accounts/me` | 200 | 29 | `qa-89656ae3-7a22-4944-a24e-db216a465c95` |
| 27 | `GET /v1/accounts/me` | 200 | 11 | `qa-e1908969-4752-4f50-bfe5-e002a08d5c14` |
| 28 | `GET /v1/accounts/me` | 200 | 14 | `qa-0355a781-9db6-4333-864e-b770299c2058` |
| 29 | `GET /v1/accounts/me` | 200 | 18 | `qa-bf8877a4-32c1-404c-8901-2594652097b1` |
| 30 | `GET /v1/accounts/me` | 200 | 18 | `qa-14cbbb58-3865-4e94-bb5c-5792545dd201` |
| 31 | `GET /v1/accounts/me` | 200 | 21 | `qa-2c7da7c7-7f4c-4c1f-99f9-422113661d66` |
| 32 | `GET /v1/accounts/me` | 200 | 16 | `qa-9474923e-68bf-4747-8133-fbf21414ad22` |
| 33 | `GET /v1/accounts/me` | 200 | 14 | `qa-f4bb01cc-e1bb-4c54-b124-b28ac9133315` |
| 34 | `GET /v1/accounts/me` | 200 | 38 | `qa-642463fa-7172-4ede-ab19-c1d4a8d77601` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-95d0ead9-cfd5-49f0-8e17-5c801bff99a6` |
| 36 | `GET /v1/accounts/me` | 200 | 25 | `qa-bc75c431-3512-4d37-8c7f-997d84c1d098` |
| 37 | `GET /v1/accounts/me` | 200 | 26 | `qa-8305b354-8063-4a5b-a0b4-4ef0630e21e0` |
| 38 | `GET /v1/accounts/me` | 200 | 78 | `qa-dff1f870-435e-42b2-98d4-646e9748a90b` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-b0ed5a67-36ba-4549-b607-ff9b3df0f884` |
| 40 | `GET /v1/accounts/me` | 200 | 8 | `qa-2641b91e-651a-4397-8ec5-5ae2ca7e0d7c` |
| 41 | `GET /v1/accounts/me` | 200 | 13 | `qa-597f3386-9eb7-4c4a-b21a-53c1431f813d` |
| 42 | `GET /v1/accounts/me` | 200 | 11 | `qa-afcccae6-c9a0-4727-959b-1f677a3153ec` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-6a692c52-95a3-47b7-aff9-0043bc525791` |
| 44 | `GET /v1/accounts/me` | 200 | 21 | `qa-dd09d27d-c941-4a8d-9848-8d510899097a` |
| 45 | `GET /v1/accounts/me` | 200 | 10 | `qa-cafcc5bb-7fbd-4888-8d2e-60753b63ef8c` |
| 46 | `GET /v1/accounts/me` | 200 | 16 | `qa-63e1acf8-27ee-412a-80b3-67b2508d4a15` |
| 47 | `GET /v1/accounts/me` | 200 | 19 | `qa-48847eb0-d8fc-493a-aa85-e19d15d329ea` |
| 48 | `GET /v1/accounts/me` | 200 | 12 | `qa-bbe542e3-3dbe-4eb3-8ad7-dec6e3be016d` |
| 49 | `GET /v1/accounts/me` | 200 | 11 | `qa-64eb537c-6ea7-47b8-af2f-6d800ca59327` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-204cb5e0-9e74-4c87-9c2c-8c2ec470a49d` |
| 51 | `GET /v1/accounts/me` | 200 | 11 | `qa-ef90450d-c643-42c5-aa89-2fa8429d1bb3` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-29183703-c1f4-48ea-a3a9-18c513d234dd` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-1bb9fc36-5ef3-4682-826b-547a1c8960e5` |
| 54 | `GET /v1/accounts/me` | 200 | 9 | `qa-6a6c7975-dc78-499e-8208-4cf6668e897f` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-876fb828-8a0c-499d-8540-485bffcc42da` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-4a08ccff-4809-44dd-88c2-b4f654387137` |
| 57 | `GET /v1/accounts/me` | 200 | 12 | `qa-a93f068c-90b6-4d66-95d8-428ec0157226` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-9eabfd7d-fa6b-40f9-bbe9-f5d9ce07a4d0` |
| 59 | `GET /v1/accounts/me` | 200 | 9 | `qa-8c2d64c7-3aaa-4eb4-8044-e3c3d6dd3b23` |
| 60 | `GET /v1/accounts/me` | 200 | 9 | `qa-1f5a2a41-c70c-4870-a094-267ea1e138ed` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-14d664eb-c2e9-4993-9b0c-c1765be9f9cf` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-16c4a30b-b481-4c79-a17a-e832a1fa35e7` |
| 63 | `GET /v1/accounts/me` | 200 | 4 | `qa-945bee7f-446f-468e-a140-ef0966f6868a` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-d7a04742-65a3-4dfd-b10f-5d7b7003d110` |
| 65 | `POST /v1/auth/token` | 429 | 10 | `qa-870c5616-1f45-4cb6-8575-7527a01459ca` |
| 66 | `POST /v1/accounts` | 429 | 11 | `qa-ad7f8beb-0bd2-4596-853d-3d4afd0a95e9` |
| 67 | `GET /v1/accounts/me` | 429 | 7 | `qa-a29e31c8-4be5-4718-a50c-71d89c87396b` |
| 68 | `PATCH /v1/accounts/me` | 429 | 9 | `qa-b0e2fe07-c625-43c1-8781-785e7d72adcb` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-5f975710-4dfc-4cc5-8e00-ef61aadf52c7` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-f24c77a8-d818-4a66-8395-c30d8f1a888b` |
| 71 | `POST /v1/conversations` | 429 | 11 | `qa-8029f2de-15a4-43a3-801c-05811c0a98f1` |
| 72 | `GET /v1/conversations` | 429 | 5 | `qa-6744c7b2-8967-4562-a2ea-e6ffa68b7319` |
| 73 | `GET /v1/conversations/{id}` | 429 | 5 | `qa-77dc433f-8216-48ee-84f5-64ff7593249a` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 6 | `qa-57131a4b-e8bf-43c0-851c-0e1247c56eb7` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-84c75a1f-3c45-4826-9f7e-828e667f124e` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 5 | `qa-9f8dfd32-c431-41e0-86da-df9fbdc58d42` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 5 | `qa-3adee315-6b73-4773-a0f3-1a95f91c0be3` |
| 78 | `GET /v1/credits/balance` | 429 | 3 | `qa-6a698ad1-0b30-4bc3-836c-c291c7afa7e7` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-37816506-fb9d-42fa-8cfa-90fa212aa397` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-293a7ebc-1bba-43df-9f61-f5edf7209c7b` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-acf6a691-ebdf-4b10-a8b9-95aaa27fee73` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-739e2b1b-c869-4339-97f3-0c99ba287777` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-c47e9669-fe24-477b-99da-2338858f8478` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-4ff1eeb7-7b08-4d86-a965-d4ab8db9d52c` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-d21c2ab5-d1e4-4389-9078-03c1b45ce0c8` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-bc077b59-5ef0-4593-b3ed-79ef15a27e51` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-e81f5c70-6b36-4593-a303-6ec5b54df19c` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-03bfd9a6-6559-473c-aaf8-bd8fc296fe8d` |
| 89 | `GET /v1/accounts/me` | 429 | 4 | `qa-33b6647c-cbea-49a0-969b-f39003985361` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-65561851-0ee8-424a-b8e2-e5eb7fd8c201` |
| 91 | `GET /v1/accounts/me` | 429 | 4 | `qa-7654b91b-a4a9-422b-90c3-5077669a5124` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-b60f0e66-a739-4565-b74f-333bfd9eb90a` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-daf6edd2-880e-4f7d-a280-8be0c6f1fa50` |
| 94 | `GET /v1/accounts/me` | 429 | 5 | `qa-8650edae-24c9-434a-bd00-2827d8d623a1` |
| 95 | `GET /v1/accounts/me` | 429 | 5 | `qa-1a80f44e-b3bb-483c-ac26-eb1cf01c266f` |
| 96 | `GET /v1/accounts/me` | 200 | 4 | `qa-3d18a9be-5f50-4ce7-9117-aec6a4082acf` |
| 97 | `POST /v1/auth/token` | 200 | 11 | `qa-2ca25bb3-5172-4fa9-af8d-12869d9005e9` |
| 98 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f486f156-f68a-42b5-8a75-c53095119584` |
| 99 | `POST /v1/auth/token` | 401 | 5 | `qa-e691ac78-d050-4211-a9ac-ec772b36da4d` |
| 100 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b45f3f85-6dc5-47d6-a605-2fd9c21c7fe3` |
| 101 | `POST /v1/auth/token` | 401 | 8 | `qa-a1aded7d-f9c9-4651-a4f4-abfac04e2365` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34370a0a-f653-4b55-a3f0-cc0396120045

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34370a0a-f653-4b55-a3f0-cc0396120045
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-34370a0a-f653-4b55-a3f0-cc0396120045
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
Location: /v1/accounts/qa-b5d68c8fc3b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-aed82a29-77e9-4a30-9960-dd7ab432876c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aed82a29-77e9-4a30-9960-dd7ab432876c
Content-Type: application/json

--- request body ---
{"handle":"qa-335ae68e8027","displayName":"QA 335ae68e8027","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-aed82a29-77e9-4a30-9960-dd7ab432876c
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
Location: /v1/accounts/qa-335ae68e8027
X-Served-Region: eu
Content-Length: 181

{"id":"acc_adfc1b67-c530-4593-8061-42dc7360f4d5","handle":"qa-335ae68e8027","displayName":"QA 335ae68e8027","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.608563004Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ecdf50d8-8511-4514-b141-9f968fef579f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecdf50d8-8511-4514-b141-9f968fef579f
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d68c8fc3b2","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecdf50d8-8511-4514-b141-9f968fef579f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49b76ecc-2970-496b-8660-f1ff8d097939"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6cb8ece0-4290-4a45-b581-0c9571bf38d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cb8ece0-4290-4a45-b581-0c9571bf38d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-335ae68e8027","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cb8ece0-4290-4a45-b581-0c9571bf38d7
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
Location: /v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4","subject":"Error contract","status":"open","region":"eu","participants":["qa-b5d68c8fc3b2","qa-335ae68e8027"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.717529011Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-046c45e1-ef5e-4e4e-ad0b-36202578a347

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-046c45e1-ef5e-4e4e-ad0b-36202578a347
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-046c45e1-ef5e-4e4e-ad0b-36202578a347
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-048990b7-925e-4f31-b7de-2198fbbb1b1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-048990b7-925e-4f31-b7de-2198fbbb1b1a
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-048990b7-925e-4f31-b7de-2198fbbb1b1a
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-d2075704-e410-4979-ac0f-c07fc288d44e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2075704-e410-4979-ac0f-c07fc288d44e
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2075704-e410-4979-ac0f-c07fc288d44e
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-8941838d-fbcc-4dfb-9f35-dacac9f0fd10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8941838d-fbcc-4dfb-9f35-dacac9f0fd10
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8941838d-fbcc-4dfb-9f35-dacac9f0fd10
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-33411122-b76f-4076-8d5b-adc11ed79724

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33411122-b76f-4076-8d5b-adc11ed79724
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-33411122-b76f-4076-8d5b-adc11ed79724
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c7ecdb6-da76-4483-a37d-3b484853977e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c7ecdb6-da76-4483-a37d-3b484853977e
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c7ecdb6-da76-4483-a37d-3b484853977e
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-679f6429-135c-4ded-be19-6ba8366f2fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-679f6429-135c-4ded-be19-6ba8366f2fcc
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-679f6429-135c-4ded-be19-6ba8366f2fcc
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-0961c2d0-40d2-422e-b395-fdade2bd1f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0961c2d0-40d2-422e-b395-fdade2bd1f4e
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0961c2d0-40d2-422e-b395-fdade2bd1f4e
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-e29a6356-0502-4312-b3d9-2688d2d06200

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e29a6356-0502-4312-b3d9-2688d2d06200
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e29a6356-0502-4312-b3d9-2688d2d06200
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cf05067-e16e-49d6-aa7c-4a7162e86d04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cf05067-e16e-49d6-aa7c-4a7162e86d04
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cf05067-e16e-49d6-aa7c-4a7162e86d04
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-3633a1b4-f937-4baa-978e-93cf81d22f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3633a1b4-f937-4baa-978e-93cf81d22f6d
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3633a1b4-f937-4baa-978e-93cf81d22f6d
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa10d647-ea28-4343-962e-475b865ea23e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa10d647-ea28-4343-962e-475b865ea23e
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa10d647-ea28-4343-962e-475b865ea23e
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0160cc1-8074-4292-b01f-3e229d25c909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0160cc1-8074-4292-b01f-3e229d25c909
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0160cc1-8074-4292-b01f-3e229d25c909
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-901476d5-015f-438d-8549-4184657f6c64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-901476d5-015f-438d-8549-4184657f6c64
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-901476d5-015f-438d-8549-4184657f6c64
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-d96f2f59-f1d9-49e5-99ea-71bb5d2a2d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d96f2f59-f1d9-49e5-99ea-71bb5d2a2d38
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d96f2f59-f1d9-49e5-99ea-71bb5d2a2d38
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-35b6a11d-cc69-4905-b37f-5c80ba1dda66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35b6a11d-cc69-4905-b37f-5c80ba1dda66
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-35b6a11d-cc69-4905-b37f-5c80ba1dda66
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-8229a30e-2446-44e5-a980-3a41d8431fca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8229a30e-2446-44e5-a980-3a41d8431fca
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8229a30e-2446-44e5-a980-3a41d8431fca
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a837976-dc75-46a1-b9ba-2281704c298e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a837976-dc75-46a1-b9ba-2281704c298e
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a837976-dc75-46a1-b9ba-2281704c298e
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dc20961-bc34-4175-9743-a41694211226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc20961-bc34-4175-9743-a41694211226
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dc20961-bc34-4175-9743-a41694211226
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-003e90e7-e1f5-406a-9fce-155fc1a45604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-003e90e7-e1f5-406a-9fce-155fc1a45604
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-003e90e7-e1f5-406a-9fce-155fc1a45604
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc56ea36-00ea-425b-b7bb-fe9e7695e172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc56ea36-00ea-425b-b7bb-fe9e7695e172
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc56ea36-00ea-425b-b7bb-fe9e7695e172
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-89656ae3-7a22-4944-a24e-db216a465c95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89656ae3-7a22-4944-a24e-db216a465c95
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-89656ae3-7a22-4944-a24e-db216a465c95
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1908969-4752-4f50-bfe5-e002a08d5c14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1908969-4752-4f50-bfe5-e002a08d5c14
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1908969-4752-4f50-bfe5-e002a08d5c14
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-0355a781-9db6-4333-864e-b770299c2058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0355a781-9db6-4333-864e-b770299c2058
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0355a781-9db6-4333-864e-b770299c2058
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf8877a4-32c1-404c-8901-2594652097b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf8877a4-32c1-404c-8901-2594652097b1
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf8877a4-32c1-404c-8901-2594652097b1
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-14cbbb58-3865-4e94-bb5c-5792545dd201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14cbbb58-3865-4e94-bb5c-5792545dd201
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-14cbbb58-3865-4e94-bb5c-5792545dd201
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c7da7c7-7f4c-4c1f-99f9-422113661d66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c7da7c7-7f4c-4c1f-99f9-422113661d66
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c7da7c7-7f4c-4c1f-99f9-422113661d66
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-9474923e-68bf-4747-8133-fbf21414ad22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9474923e-68bf-4747-8133-fbf21414ad22
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9474923e-68bf-4747-8133-fbf21414ad22
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4bb01cc-e1bb-4c54-b124-b28ac9133315

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4bb01cc-e1bb-4c54-b124-b28ac9133315
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4bb01cc-e1bb-4c54-b124-b28ac9133315
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-642463fa-7172-4ede-ab19-c1d4a8d77601

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-642463fa-7172-4ede-ab19-c1d4a8d77601
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-642463fa-7172-4ede-ab19-c1d4a8d77601
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-95d0ead9-cfd5-49f0-8e17-5c801bff99a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d0ead9-cfd5-49f0-8e17-5c801bff99a6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-95d0ead9-cfd5-49f0-8e17-5c801bff99a6
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc75c431-3512-4d37-8c7f-997d84c1d098

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc75c431-3512-4d37-8c7f-997d84c1d098
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc75c431-3512-4d37-8c7f-997d84c1d098
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-8305b354-8063-4a5b-a0b4-4ef0630e21e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8305b354-8063-4a5b-a0b4-4ef0630e21e0
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8305b354-8063-4a5b-a0b4-4ef0630e21e0
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-dff1f870-435e-42b2-98d4-646e9748a90b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dff1f870-435e-42b2-98d4-646e9748a90b
Content-Type: application/json

--- response: 200 in 78 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-dff1f870-435e-42b2-98d4-646e9748a90b
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0ed5a67-36ba-4549-b607-ff9b3df0f884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0ed5a67-36ba-4549-b607-ff9b3df0f884
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0ed5a67-36ba-4549-b607-ff9b3df0f884
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-2641b91e-651a-4397-8ec5-5ae2ca7e0d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2641b91e-651a-4397-8ec5-5ae2ca7e0d7c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2641b91e-651a-4397-8ec5-5ae2ca7e0d7c
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-597f3386-9eb7-4c4a-b21a-53c1431f813d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-597f3386-9eb7-4c4a-b21a-53c1431f813d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-597f3386-9eb7-4c4a-b21a-53c1431f813d
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-afcccae6-c9a0-4727-959b-1f677a3153ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afcccae6-c9a0-4727-959b-1f677a3153ec
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-afcccae6-c9a0-4727-959b-1f677a3153ec
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a692c52-95a3-47b7-aff9-0043bc525791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a692c52-95a3-47b7-aff9-0043bc525791
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a692c52-95a3-47b7-aff9-0043bc525791
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd09d27d-c941-4a8d-9848-8d510899097a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd09d27d-c941-4a8d-9848-8d510899097a
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd09d27d-c941-4a8d-9848-8d510899097a
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-cafcc5bb-7fbd-4888-8d2e-60753b63ef8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cafcc5bb-7fbd-4888-8d2e-60753b63ef8c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-cafcc5bb-7fbd-4888-8d2e-60753b63ef8c
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-63e1acf8-27ee-412a-80b3-67b2508d4a15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e1acf8-27ee-412a-80b3-67b2508d4a15
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-63e1acf8-27ee-412a-80b3-67b2508d4a15
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-48847eb0-d8fc-493a-aa85-e19d15d329ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48847eb0-d8fc-493a-aa85-e19d15d329ea
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-48847eb0-d8fc-493a-aa85-e19d15d329ea
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbe542e3-3dbe-4eb3-8ad7-dec6e3be016d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbe542e3-3dbe-4eb3-8ad7-dec6e3be016d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbe542e3-3dbe-4eb3-8ad7-dec6e3be016d
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-64eb537c-6ea7-47b8-af2f-6d800ca59327

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64eb537c-6ea7-47b8-af2f-6d800ca59327
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-64eb537c-6ea7-47b8-af2f-6d800ca59327
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-204cb5e0-9e74-4c87-9c2c-8c2ec470a49d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-204cb5e0-9e74-4c87-9c2c-8c2ec470a49d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-204cb5e0-9e74-4c87-9c2c-8c2ec470a49d
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef90450d-c643-42c5-aa89-2fa8429d1bb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef90450d-c643-42c5-aa89-2fa8429d1bb3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef90450d-c643-42c5-aa89-2fa8429d1bb3
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-29183703-c1f4-48ea-a3a9-18c513d234dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29183703-c1f4-48ea-a3a9-18c513d234dd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-29183703-c1f4-48ea-a3a9-18c513d234dd
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-1bb9fc36-5ef3-4682-826b-547a1c8960e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bb9fc36-5ef3-4682-826b-547a1c8960e5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bb9fc36-5ef3-4682-826b-547a1c8960e5
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a6c7975-dc78-499e-8208-4cf6668e897f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a6c7975-dc78-499e-8208-4cf6668e897f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a6c7975-dc78-499e-8208-4cf6668e897f
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-876fb828-8a0c-499d-8540-485bffcc42da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-876fb828-8a0c-499d-8540-485bffcc42da
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-876fb828-8a0c-499d-8540-485bffcc42da
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-4a08ccff-4809-44dd-88c2-b4f654387137

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a08ccff-4809-44dd-88c2-b4f654387137
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a08ccff-4809-44dd-88c2-b4f654387137
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-a93f068c-90b6-4d66-95d8-428ec0157226

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a93f068c-90b6-4d66-95d8-428ec0157226
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-a93f068c-90b6-4d66-95d8-428ec0157226
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-9eabfd7d-fa6b-40f9-bbe9-f5d9ce07a4d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9eabfd7d-fa6b-40f9-bbe9-f5d9ce07a4d0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-9eabfd7d-fa6b-40f9-bbe9-f5d9ce07a4d0
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c2d64c7-3aaa-4eb4-8044-e3c3d6dd3b23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2d64c7-3aaa-4eb4-8044-e3c3d6dd3b23
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2d64c7-3aaa-4eb4-8044-e3c3d6dd3b23
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f5a2a41-c70c-4870-a094-267ea1e138ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f5a2a41-c70c-4870-a094-267ea1e138ed
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f5a2a41-c70c-4870-a094-267ea1e138ed
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-14d664eb-c2e9-4993-9b0c-c1765be9f9cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d664eb-c2e9-4993-9b0c-c1765be9f9cf
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-14d664eb-c2e9-4993-9b0c-c1765be9f9cf
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-16c4a30b-b481-4c79-a17a-e832a1fa35e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16c4a30b-b481-4c79-a17a-e832a1fa35e7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-16c4a30b-b481-4c79-a17a-e832a1fa35e7
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-945bee7f-446f-468e-a140-ef0966f6868a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-945bee7f-446f-468e-a140-ef0966f6868a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-945bee7f-446f-468e-a140-ef0966f6868a
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7a04742-65a3-4dfd-b10f-5d7b7003d110

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7a04742-65a3-4dfd-b10f-5d7b7003d110
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7a04742-65a3-4dfd-b10f-5d7b7003d110
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7a04742-65a3-4dfd-b10f-5d7b7003d110"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-870c5616-1f45-4cb6-8575-7527a01459ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-870c5616-1f45-4cb6-8575-7527a01459ca
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d68c8fc3b2","password":"****"}

--- response: 429 in 10 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-870c5616-1f45-4cb6-8575-7527a01459ca
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-870c5616-1f45-4cb6-8575-7527a01459ca"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-ad7f8beb-0bd2-4596-853d-3d4afd0a95e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad7f8beb-0bd2-4596-853d-3d4afd0a95e9
Content-Type: application/json

--- request body ---
{"handle":"qa-44d3bd1cae5a","displayName":"QA 44d3bd1cae5a","password":"****","region":"eu"}

--- response: 429 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad7f8beb-0bd2-4596-853d-3d4afd0a95e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-ad7f8beb-0bd2-4596-853d-3d4afd0a95e9"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-a29e31c8-4be5-4718-a50c-71d89c87396b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a29e31c8-4be5-4718-a50c-71d89c87396b
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a29e31c8-4be5-4718-a50c-71d89c87396b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a29e31c8-4be5-4718-a50c-71d89c87396b"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-b0e2fe07-c625-43c1-8781-785e7d72adcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0e2fe07-c625-43c1-8781-785e7d72adcb
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0e2fe07-c625-43c1-8781-785e7d72adcb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0e2fe07-c625-43c1-8781-785e7d72adcb"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f975710-4dfc-4cc5-8e00-ef61aadf52c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f975710-4dfc-4cc5-8e00-ef61aadf52c7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f975710-4dfc-4cc5-8e00-ef61aadf52c7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5f975710-4dfc-4cc5-8e00-ef61aadf52c7"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-b5d68c8fc3b2
correlation: qa-f24c77a8-d818-4a66-8395-c30d8f1a888b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f24c77a8-d818-4a66-8395-c30d8f1a888b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f24c77a8-d818-4a66-8395-c30d8f1a888b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-b5d68c8fc3b2","correlationId":"qa-f24c77a8-d818-4a66-8395-c30d8f1a888b"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-8029f2de-15a4-43a3-801c-05811c0a98f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8029f2de-15a4-43a3-801c-05811c0a98f1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b5d68c8fc3b2","subject":"Probe","message":"Hi"}

--- response: 429 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8029f2de-15a4-43a3-801c-05811c0a98f1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-8029f2de-15a4-43a3-801c-05811c0a98f1"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-6744c7b2-8967-4562-a2ea-e6ffa68b7319

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6744c7b2-8967-4562-a2ea-e6ffa68b7319
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6744c7b2-8967-4562-a2ea-e6ffa68b7319
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-6744c7b2-8967-4562-a2ea-e6ffa68b7319"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4
correlation: qa-77dc433f-8216-48ee-84f5-64ff7593249a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77dc433f-8216-48ee-84f5-64ff7593249a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77dc433f-8216-48ee-84f5-64ff7593249a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4","correlationId":"qa-77dc433f-8216-48ee-84f5-64ff7593249a"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/messages
correlation: qa-57131a4b-e8bf-43c0-851c-0e1247c56eb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57131a4b-e8bf-43c0-851c-0e1247c56eb7
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57131a4b-e8bf-43c0-851c-0e1247c56eb7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/messages","correlationId":"qa-57131a4b-e8bf-43c0-851c-0e1247c56eb7"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/messages
correlation: qa-84c75a1f-3c45-4826-9f7e-828e667f124e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84c75a1f-3c45-4826-9f7e-828e667f124e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84c75a1f-3c45-4826-9f7e-828e667f124e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/messages","correlationId":"qa-84c75a1f-3c45-4826-9f7e-828e667f124e"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/read
correlation: qa-9f8dfd32-c431-41e0-86da-df9fbdc58d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f8dfd32-c431-41e0-86da-df9fbdc58d42
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f8dfd32-c431-41e0-86da-df9fbdc58d42
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/read","correlationId":"qa-9f8dfd32-c431-41e0-86da-df9fbdc58d42"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/close
correlation: qa-3adee315-6b73-4773-a0f3-1a95f91c0be3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3adee315-6b73-4773-a0f3-1a95f91c0be3
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3adee315-6b73-4773-a0f3-1a95f91c0be3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_4462a27a-55a8-4760-bbf4-52d7a0a5d7e4/close","correlationId":"qa-3adee315-6b73-4773-a0f3-1a95f91c0be3"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-6a698ad1-0b30-4bc3-836c-c291c7afa7e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a698ad1-0b30-4bc3-836c-c291c7afa7e7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a698ad1-0b30-4bc3-836c-c291c7afa7e7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-6a698ad1-0b30-4bc3-836c-c291c7afa7e7"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-37816506-fb9d-42fa-8cfa-90fa212aa397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37816506-fb9d-42fa-8cfa-90fa212aa397
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37816506-fb9d-42fa-8cfa-90fa212aa397
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-37816506-fb9d-42fa-8cfa-90fa212aa397"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-293a7ebc-1bba-43df-9f61-f5edf7209c7b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a5ccc249efae43798ff4e7a5a01bdd8a
X-Correlation-Id: qa-293a7ebc-1bba-43df-9f61-f5edf7209c7b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-293a7ebc-1bba-43df-9f61-f5edf7209c7b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-293a7ebc-1bba-43df-9f61-f5edf7209c7b"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-acf6a691-ebdf-4b10-a8b9-95aaa27fee73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acf6a691-ebdf-4b10-a8b9-95aaa27fee73
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acf6a691-ebdf-4b10-a8b9-95aaa27fee73
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-acf6a691-ebdf-4b10-a8b9-95aaa27fee73"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-739e2b1b-c869-4339-97f3-0c99ba287777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-739e2b1b-c869-4339-97f3-0c99ba287777
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-739e2b1b-c869-4339-97f3-0c99ba287777
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-739e2b1b-c869-4339-97f3-0c99ba287777"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-c47e9669-fe24-477b-99da-2338858f8478

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c47e9669-fe24-477b-99da-2338858f8478
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c47e9669-fe24-477b-99da-2338858f8478
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c47e9669-fe24-477b-99da-2338858f8478"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ff1eeb7-7b08-4d86-a965-d4ab8db9d52c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ff1eeb7-7b08-4d86-a965-d4ab8db9d52c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ff1eeb7-7b08-4d86-a965-d4ab8db9d52c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4ff1eeb7-7b08-4d86-a965-d4ab8db9d52c"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-d21c2ab5-d1e4-4389-9078-03c1b45ce0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d21c2ab5-d1e4-4389-9078-03c1b45ce0c8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d21c2ab5-d1e4-4389-9078-03c1b45ce0c8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d21c2ab5-d1e4-4389-9078-03c1b45ce0c8"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc077b59-5ef0-4593-b3ed-79ef15a27e51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc077b59-5ef0-4593-b3ed-79ef15a27e51
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc077b59-5ef0-4593-b3ed-79ef15a27e51
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bc077b59-5ef0-4593-b3ed-79ef15a27e51"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-e81f5c70-6b36-4593-a303-6ec5b54df19c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e81f5c70-6b36-4593-a303-6ec5b54df19c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e81f5c70-6b36-4593-a303-6ec5b54df19c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e81f5c70-6b36-4593-a303-6ec5b54df19c"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-03bfd9a6-6559-473c-aaf8-bd8fc296fe8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03bfd9a6-6559-473c-aaf8-bd8fc296fe8d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03bfd9a6-6559-473c-aaf8-bd8fc296fe8d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-03bfd9a6-6559-473c-aaf8-bd8fc296fe8d"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-33b6647c-cbea-49a0-969b-f39003985361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33b6647c-cbea-49a0-969b-f39003985361
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33b6647c-cbea-49a0-969b-f39003985361
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-33b6647c-cbea-49a0-969b-f39003985361"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-65561851-0ee8-424a-b8e2-e5eb7fd8c201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65561851-0ee8-424a-b8e2-e5eb7fd8c201
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65561851-0ee8-424a-b8e2-e5eb7fd8c201
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-65561851-0ee8-424a-b8e2-e5eb7fd8c201"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-7654b91b-a4a9-422b-90c3-5077669a5124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7654b91b-a4a9-422b-90c3-5077669a5124
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7654b91b-a4a9-422b-90c3-5077669a5124
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7654b91b-a4a9-422b-90c3-5077669a5124"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-b60f0e66-a739-4565-b74f-333bfd9eb90a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b60f0e66-a739-4565-b74f-333bfd9eb90a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b60f0e66-a739-4565-b74f-333bfd9eb90a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b60f0e66-a739-4565-b74f-333bfd9eb90a"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-daf6edd2-880e-4f7d-a280-8be0c6f1fa50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daf6edd2-880e-4f7d-a280-8be0c6f1fa50
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 26 Nov 2026 11:02:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daf6edd2-880e-4f7d-a280-8be0c6f1fa50
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-daf6edd2-880e-4f7d-a280-8be0c6f1fa50"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-8650edae-24c9-434a-bd00-2827d8d623a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8650edae-24c9-434a-bd00-2827d8d623a1
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8650edae-24c9-434a-bd00-2827d8d623a1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8650edae-24c9-434a-bd00-2827d8d623a1"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a80f44e-b3bb-483c-ac26-eb1cf01c266f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a80f44e-b3bb-483c-ac26-eb1cf01c266f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a80f44e-b3bb-483c-ac26-eb1cf01c266f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1a80f44e-b3bb-483c-ac26-eb1cf01c266f"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d18a9be-5f50-4ce7-9117-aec6a4082acf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d18a9be-5f50-4ce7-9117-aec6a4082acf
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d18a9be-5f50-4ce7-9117-aec6a4082acf
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

{"id":"acc_49b76ecc-2970-496b-8660-f1ff8d097939","handle":"qa-b5d68c8fc3b2","displayName":"QA b5d68c8fc3b2","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.550938122Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-2ca25bb3-5172-4fa9-af8d-12869d9005e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ca25bb3-5172-4fa9-af8d-12869d9005e9
Content-Type: application/json

--- request body ---
{"handle":"qa-335ae68e8027","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ca25bb3-5172-4fa9-af8d-12869d9005e9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_adfc1b67-c530-4593-8061-42dc7360f4d5"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f486f156-f68a-42b5-8a75-c53095119584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f486f156-f68a-42b5-8a75-c53095119584
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f486f156-f68a-42b5-8a75-c53095119584
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
correlation: qa-e691ac78-d050-4211-a9ac-ec772b36da4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e691ac78-d050-4211-a9ac-ec772b36da4d
Content-Type: application/json

--- request body ---
{"handle":"qa-335ae68e8027","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e691ac78-d050-4211-a9ac-ec772b36da4d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e691ac78-d050-4211-a9ac-ec772b36da4d"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b45f3f85-6dc5-47d6-a605-2fd9c21c7fe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b45f3f85-6dc5-47d6-a605-2fd9c21c7fe3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b45f3f85-6dc5-47d6-a605-2fd9c21c7fe3
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
correlation: qa-a1aded7d-f9c9-4651-a4f4-abfac04e2365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1aded7d-f9c9-4651-a4f4-abfac04e2365
Content-Type: application/json

--- request body ---
{"handle":"qa-b5d68c8fc3b2","password":"****"}

--- response: 401 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1aded7d-f9c9-4651-a4f4-abfac04e2365
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1aded7d-f9c9-4651-a4f4-abfac04e2365"}
```
