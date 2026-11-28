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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-1998ff48-b086-4de6-8eae-dbc6d40d5e3f` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-7afec588-7971-45e3-91df-8955aa73358f` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-fc659597-08d1-4ae9-b59e-815cae11de87` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-7e438dbf-4770-4839-bfdf-da946b01ad04` |
| 5 | `GET /v1/accounts/me` | 200 | 56 | `qa-b2afa141-9694-458c-abc8-efa64f236390` |
| 6 | `GET /v1/accounts/me` | 200 | 13 | `qa-e7df5019-37e4-41ef-adad-a29550444674` |
| 7 | `GET /v1/accounts/me` | 200 | 14 | `qa-65a88c1c-df58-4530-9962-2b3048025be0` |
| 8 | `GET /v1/accounts/me` | 200 | 23 | `qa-bc64aae3-ca60-44a1-ac89-5adfcf9f8ad7` |
| 9 | `GET /v1/accounts/me` | 200 | 26 | `qa-307620b3-c2de-4f92-8319-5c99793a6e06` |
| 10 | `GET /v1/accounts/me` | 200 | 22 | `qa-e8b21765-b3b7-4354-8aa0-4595bf107c97` |
| 11 | `GET /v1/accounts/me` | 200 | 31 | `qa-e9986f36-6f7d-4cfc-abd7-b60d8531a6da` |
| 12 | `GET /v1/accounts/me` | 200 | 9 | `qa-f175588c-60df-487a-839b-d5e2d85f7d13` |
| 13 | `GET /v1/accounts/me` | 200 | 15 | `qa-362d209a-84b3-45f2-9578-eeae74a68a06` |
| 14 | `GET /v1/accounts/me` | 200 | 11 | `qa-f052ceb0-cbb7-4690-a2c0-c6d68b0c289b` |
| 15 | `GET /v1/accounts/me` | 200 | 20 | `qa-a57b9bc7-c189-46d6-9fdb-0b6cce3b24da` |
| 16 | `GET /v1/accounts/me` | 200 | 28 | `qa-8927d954-3287-4a7d-8180-64f14c7f2085` |
| 17 | `GET /v1/accounts/me` | 200 | 21 | `qa-a3009c37-b506-494b-b25a-b055811ea4e6` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-c45a7c72-69ff-4804-8c7e-24523897516e` |
| 19 | `GET /v1/accounts/me` | 200 | 13 | `qa-849ec479-a765-4a86-8dc0-91c6facbdbf7` |
| 20 | `GET /v1/accounts/me` | 200 | 15 | `qa-231074c6-4c99-47d5-bef3-97888b7d193a` |
| 21 | `GET /v1/accounts/me` | 200 | 10 | `qa-a92ebedf-76ce-4308-ab7e-21c09f6e5387` |
| 22 | `GET /v1/accounts/me` | 200 | 13 | `qa-59f86837-7048-4ba6-bb6a-885abaa87ab4` |
| 23 | `GET /v1/accounts/me` | 200 | 31 | `qa-8ace61c9-50da-42f0-bb81-16c1e3e4ee6e` |
| 24 | `GET /v1/accounts/me` | 200 | 32 | `qa-0d2fd9f3-c1c9-48ac-8fe4-90b8fcd9cc43` |
| 25 | `GET /v1/accounts/me` | 200 | 25 | `qa-05d8d649-5216-4c1e-b1a3-9e511a5eb90a` |
| 26 | `GET /v1/accounts/me` | 200 | 23 | `qa-2a0703a0-cb49-4dae-8cfd-e3785414acbc` |
| 27 | `GET /v1/accounts/me` | 200 | 34 | `qa-bc684ccf-920e-4726-b83b-27b2502d9e3a` |
| 28 | `GET /v1/accounts/me` | 200 | 24 | `qa-82c2c993-09c1-49e5-8ff7-2951197af5c5` |
| 29 | `GET /v1/accounts/me` | 200 | 25 | `qa-304b405b-6499-4b3a-96c4-b80c1cd34231` |
| 30 | `GET /v1/accounts/me` | 200 | 43 | `qa-454e0192-652e-45db-9239-bbc1af466ca9` |
| 31 | `GET /v1/accounts/me` | 200 | 29 | `qa-a9fe9cb1-f0b1-45a7-b735-5d5bfde62ba7` |
| 32 | `GET /v1/accounts/me` | 200 | 33 | `qa-02f3111d-f278-4444-abba-751b628f185e` |
| 33 | `GET /v1/accounts/me` | 200 | 42 | `qa-44fb4b1f-d0b2-49da-bbed-ed7ce6bab465` |
| 34 | `GET /v1/accounts/me` | 200 | 44 | `qa-b8eaca09-9a1c-4b41-a604-9c87a0273407` |
| 35 | `GET /v1/accounts/me` | 200 | 19 | `qa-9dd87619-c09a-4b14-92e2-322705cfac85` |
| 36 | `GET /v1/accounts/me` | 200 | 18 | `qa-c84f9ffa-f970-4939-850a-3beffe86ffc0` |
| 37 | `GET /v1/accounts/me` | 200 | 14 | `qa-01217c6a-7016-424e-bc9b-9e417c8e1f00` |
| 38 | `GET /v1/accounts/me` | 200 | 17 | `qa-41a2d143-bb1d-4a7f-b074-20609c5f66f6` |
| 39 | `GET /v1/accounts/me` | 200 | 21 | `qa-61921f56-21f4-49bd-a159-03e6dfb22f2b` |
| 40 | `GET /v1/accounts/me` | 200 | 19 | `qa-4006fe28-6bce-4dcd-8645-20d6a0564818` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-002eaa1a-9eea-4d8d-bb90-8ce9cf3e2d3b` |
| 42 | `GET /v1/accounts/me` | 200 | 3 | `qa-8f491f6c-bde8-4129-8b8a-c7eac47b2f5f` |
| 43 | `GET /v1/accounts/me` | 200 | 3 | `qa-586a2077-952e-4834-a7eb-4e852acc4c9a` |
| 44 | `GET /v1/accounts/me` | 200 | 33 | `qa-ae9e5807-f953-4fff-9b2f-7d68f9f34306` |
| 45 | `GET /v1/accounts/me` | 200 | 10 | `qa-3d7160cd-ef79-478e-8ac1-00884a816066` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-19a0f160-7278-4720-bda8-8ef5bce1d221` |
| 47 | `GET /v1/accounts/me` | 200 | 13 | `qa-2c752ae7-deac-4bf5-b172-e824be2762de` |
| 48 | `GET /v1/accounts/me` | 200 | 11 | `qa-327d988c-dacb-40c1-b34c-76708a75ea30` |
| 49 | `GET /v1/accounts/me` | 200 | 15 | `qa-073d6feb-9c31-4b31-977c-f27b3317947b` |
| 50 | `GET /v1/accounts/me` | 200 | 10 | `qa-75816784-7411-4957-b4d7-1da550ded5be` |
| 51 | `GET /v1/accounts/me` | 200 | 17 | `qa-2c41c5ba-c73f-41bf-b43e-65ef004ecd26` |
| 52 | `GET /v1/accounts/me` | 200 | 15 | `qa-cd8105ae-6bff-437a-90f1-0baa1f6de183` |
| 53 | `GET /v1/accounts/me` | 200 | 15 | `qa-bcab4107-4f65-4d7a-8374-d04faf4394e4` |
| 54 | `GET /v1/accounts/me` | 200 | 13 | `qa-ac8b4846-0b63-4092-baca-8d1dba9391a1` |
| 55 | `GET /v1/accounts/me` | 200 | 14 | `qa-c8c7cc75-1a06-4869-bed6-74ff6413495c` |
| 56 | `GET /v1/accounts/me` | 200 | 14 | `qa-3960eb01-032c-4d31-9187-9d7f061a1060` |
| 57 | `GET /v1/accounts/me` | 200 | 21 | `qa-c8591f83-ff09-48f4-80da-b9b221368f06` |
| 58 | `GET /v1/accounts/me` | 200 | 11 | `qa-5bf41c2b-915e-4179-93d8-085850c06936` |
| 59 | `GET /v1/accounts/me` | 200 | 8 | `qa-9622e43b-f500-46a5-ba8d-ad3a3b40e8ba` |
| 60 | `GET /v1/accounts/me` | 200 | 11 | `qa-f420bcc9-95ce-4b1c-a9d1-f0b778f11d86` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-21212f87-6342-4734-825d-69604379dc2c` |
| 62 | `GET /v1/accounts/me` | 200 | 9 | `qa-3e5d2ebb-1778-4869-ac8f-a90156b7bded` |
| 63 | `GET /v1/accounts/me` | 200 | 8 | `qa-af8d0892-ad53-4c9a-9cbe-90d9800757dd` |
| 64 | `GET /v1/accounts/me` | 429 | 11 | `qa-abb89de5-836b-4177-bc5b-f700d1e68c0d` |
| 65 | `POST /v1/auth/token` | 429 | 8 | `qa-3584e7d2-7606-47a3-a3aa-364c6a8a62c3` |
| 66 | `POST /v1/accounts` | 429 | 6 | `qa-ba165564-01c6-4890-bbfa-a03e071cb774` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-60abb90c-90f6-48e8-b5d7-0f4958d7e364` |
| 68 | `PATCH /v1/accounts/me` | 429 | 5 | `qa-d7102fda-9e50-4f44-af61-d1d42ee57b9b` |
| 69 | `DELETE /v1/accounts/me` | 429 | 3 | `qa-178174cc-0c87-4744-9c0b-6b3aa9eff6b9` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 4 | `qa-6bc765d3-50c1-40dd-aa44-a1718c3038d1` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-ba133518-fc49-4347-91ec-27d706a99405` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-bca9f5c5-9779-4021-90f2-7f23384452a0` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-1646df93-af78-402d-a1d1-712ff40a786d` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 5 | `qa-197a9367-2625-4b61-8cb3-5a45856ac0ee` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-43112474-f34c-473e-b220-842b5eaffd15` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-fe4d94e2-2fb8-4b7f-965b-907ff2c55d8b` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-8da478c8-45f5-4f5f-ad04-35acef6b2cbd` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-224793c7-e23a-4f69-9201-9fada10a21e9` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-658f853c-3c12-4212-9ee8-8af7e67e0514` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-d599639f-9e14-47cc-b64a-2500482477cb` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-a20941fa-6920-4390-a9ae-d3025c1b241c` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-c9ba1136-ac80-477c-8ac9-805fb1207b6c` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-7430da12-5f0a-4e55-8672-ff1188303108` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-a1788949-e6b2-4d68-88c5-612eb26d7f27` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-d879eea5-08f7-4e41-8466-a5f8ae2dd73c` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-dae977c8-24f1-4b0a-babd-1cdbc5dac115` |
| 87 | `GET /v1/accounts/me` | 429 | 4 | `qa-c340610a-6949-47f4-805a-2d8d1d458859` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-8dce16f0-3caa-486e-b93f-76fe5e2fa008` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-68c18f27-8268-4740-a256-05524301a929` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-5ec94495-766a-4734-96df-33188e725035` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-7bea52bd-d74a-4c71-80b7-a3200efbecb7` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-8ca5c4cd-e366-4b3c-9b80-fc3d567a75af` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-b0898ca6-13c8-4ce9-9a05-de95418d8791` |
| 94 | `GET /v1/accounts/me` | 429 | 6 | `qa-614999d2-77c2-4e14-8b8a-29cd40f2e121` |
| 95 | `GET /v1/accounts/me` | 429 | 4 | `qa-65732957-5041-44ad-9fae-97afc40e7178` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-2bec696f-a610-4a56-9155-b1d93da1d4f0` |
| 97 | `GET /v1/accounts/me` | 200 | 4 | `qa-5b5cd3f8-e13a-4781-94a2-e249630192af` |
| 98 | `POST /v1/auth/token` | 200 | 9 | `qa-8c62fb8b-468a-4abf-ab23-e943bc389d82` |
| 99 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-0b03ce1d-bab6-4a09-bd43-accd0ce2c6c2` |
| 100 | `POST /v1/auth/token` | 401 | 6 | `qa-91cf1b4a-a828-4ac4-9fe4-c3b7da415fba` |
| 101 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9d4fca6d-4189-4c08-b3ac-816dd235b34d` |
| 102 | `POST /v1/auth/token` | 401 | 3 | `qa-4fe6d0b1-37b6-4868-baaa-36af5ab3101d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1998ff48-b086-4de6-8eae-dbc6d40d5e3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1998ff48-b086-4de6-8eae-dbc6d40d5e3f
Content-Type: application/json

--- request body ---
{"handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1998ff48-b086-4de6-8eae-dbc6d40d5e3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Location: /v1/accounts/qa-5ab64405c075
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7afec588-7971-45e3-91df-8955aa73358f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7afec588-7971-45e3-91df-8955aa73358f
Content-Type: application/json

--- request body ---
{"handle":"qa-c28353b37f08","displayName":"QA c28353b37f08","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7afec588-7971-45e3-91df-8955aa73358f
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
Location: /v1/accounts/qa-c28353b37f08
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb36c6af-98ce-428e-afc1-46946dc9b391","handle":"qa-c28353b37f08","displayName":"QA c28353b37f08","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.557755850Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fc659597-08d1-4ae9-b59e-815cae11de87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc659597-08d1-4ae9-b59e-815cae11de87
Content-Type: application/json

--- request body ---
{"handle":"qa-5ab64405c075","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc659597-08d1-4ae9-b59e-815cae11de87
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7e438dbf-4770-4839-bfdf-da946b01ad04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e438dbf-4770-4839-bfdf-da946b01ad04
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c28353b37f08","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e438dbf-4770-4839-bfdf-da946b01ad04
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
Location: /v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ab64405c075","qa-c28353b37f08"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.627562134Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2afa141-9694-458c-abc8-efa64f236390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2afa141-9694-458c-abc8-efa64f236390
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2afa141-9694-458c-abc8-efa64f236390
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7df5019-37e4-41ef-adad-a29550444674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7df5019-37e4-41ef-adad-a29550444674
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7df5019-37e4-41ef-adad-a29550444674
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-65a88c1c-df58-4530-9962-2b3048025be0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65a88c1c-df58-4530-9962-2b3048025be0
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-65a88c1c-df58-4530-9962-2b3048025be0
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc64aae3-ca60-44a1-ac89-5adfcf9f8ad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc64aae3-ca60-44a1-ac89-5adfcf9f8ad7
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc64aae3-ca60-44a1-ac89-5adfcf9f8ad7
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-307620b3-c2de-4f92-8319-5c99793a6e06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-307620b3-c2de-4f92-8319-5c99793a6e06
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-307620b3-c2de-4f92-8319-5c99793a6e06
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8b21765-b3b7-4354-8aa0-4595bf107c97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b21765-b3b7-4354-8aa0-4595bf107c97
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8b21765-b3b7-4354-8aa0-4595bf107c97
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9986f36-6f7d-4cfc-abd7-b60d8531a6da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9986f36-6f7d-4cfc-abd7-b60d8531a6da
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9986f36-6f7d-4cfc-abd7-b60d8531a6da
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-f175588c-60df-487a-839b-d5e2d85f7d13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f175588c-60df-487a-839b-d5e2d85f7d13
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f175588c-60df-487a-839b-d5e2d85f7d13
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-362d209a-84b3-45f2-9578-eeae74a68a06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-362d209a-84b3-45f2-9578-eeae74a68a06
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-362d209a-84b3-45f2-9578-eeae74a68a06
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-f052ceb0-cbb7-4690-a2c0-c6d68b0c289b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f052ceb0-cbb7-4690-a2c0-c6d68b0c289b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f052ceb0-cbb7-4690-a2c0-c6d68b0c289b
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-a57b9bc7-c189-46d6-9fdb-0b6cce3b24da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a57b9bc7-c189-46d6-9fdb-0b6cce3b24da
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a57b9bc7-c189-46d6-9fdb-0b6cce3b24da
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-8927d954-3287-4a7d-8180-64f14c7f2085

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8927d954-3287-4a7d-8180-64f14c7f2085
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8927d954-3287-4a7d-8180-64f14c7f2085
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3009c37-b506-494b-b25a-b055811ea4e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3009c37-b506-494b-b25a-b055811ea4e6
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3009c37-b506-494b-b25a-b055811ea4e6
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-c45a7c72-69ff-4804-8c7e-24523897516e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c45a7c72-69ff-4804-8c7e-24523897516e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c45a7c72-69ff-4804-8c7e-24523897516e
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-849ec479-a765-4a86-8dc0-91c6facbdbf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-849ec479-a765-4a86-8dc0-91c6facbdbf7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-849ec479-a765-4a86-8dc0-91c6facbdbf7
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-231074c6-4c99-47d5-bef3-97888b7d193a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231074c6-4c99-47d5-bef3-97888b7d193a
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-231074c6-4c99-47d5-bef3-97888b7d193a
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-a92ebedf-76ce-4308-ab7e-21c09f6e5387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a92ebedf-76ce-4308-ab7e-21c09f6e5387
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a92ebedf-76ce-4308-ab7e-21c09f6e5387
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-59f86837-7048-4ba6-bb6a-885abaa87ab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59f86837-7048-4ba6-bb6a-885abaa87ab4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-59f86837-7048-4ba6-bb6a-885abaa87ab4
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ace61c9-50da-42f0-bb81-16c1e3e4ee6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ace61c9-50da-42f0-bb81-16c1e3e4ee6e
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ace61c9-50da-42f0-bb81-16c1e3e4ee6e
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d2fd9f3-c1c9-48ac-8fe4-90b8fcd9cc43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d2fd9f3-c1c9-48ac-8fe4-90b8fcd9cc43
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d2fd9f3-c1c9-48ac-8fe4-90b8fcd9cc43
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-05d8d649-5216-4c1e-b1a3-9e511a5eb90a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05d8d649-5216-4c1e-b1a3-9e511a5eb90a
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-05d8d649-5216-4c1e-b1a3-9e511a5eb90a
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a0703a0-cb49-4dae-8cfd-e3785414acbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a0703a0-cb49-4dae-8cfd-e3785414acbc
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a0703a0-cb49-4dae-8cfd-e3785414acbc
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc684ccf-920e-4726-b83b-27b2502d9e3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc684ccf-920e-4726-b83b-27b2502d9e3a
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc684ccf-920e-4726-b83b-27b2502d9e3a
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-82c2c993-09c1-49e5-8ff7-2951197af5c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82c2c993-09c1-49e5-8ff7-2951197af5c5
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-82c2c993-09c1-49e5-8ff7-2951197af5c5
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-304b405b-6499-4b3a-96c4-b80c1cd34231

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-304b405b-6499-4b3a-96c4-b80c1cd34231
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-304b405b-6499-4b3a-96c4-b80c1cd34231
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-454e0192-652e-45db-9239-bbc1af466ca9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-454e0192-652e-45db-9239-bbc1af466ca9
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-454e0192-652e-45db-9239-bbc1af466ca9
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9fe9cb1-f0b1-45a7-b735-5d5bfde62ba7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9fe9cb1-f0b1-45a7-b735-5d5bfde62ba7
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9fe9cb1-f0b1-45a7-b735-5d5bfde62ba7
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-02f3111d-f278-4444-abba-751b628f185e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02f3111d-f278-4444-abba-751b628f185e
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-02f3111d-f278-4444-abba-751b628f185e
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-44fb4b1f-d0b2-49da-bbed-ed7ce6bab465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44fb4b1f-d0b2-49da-bbed-ed7ce6bab465
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-44fb4b1f-d0b2-49da-bbed-ed7ce6bab465
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8eaca09-9a1c-4b41-a604-9c87a0273407

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8eaca09-9a1c-4b41-a604-9c87a0273407
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8eaca09-9a1c-4b41-a604-9c87a0273407
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-9dd87619-c09a-4b14-92e2-322705cfac85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dd87619-c09a-4b14-92e2-322705cfac85
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dd87619-c09a-4b14-92e2-322705cfac85
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-c84f9ffa-f970-4939-850a-3beffe86ffc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c84f9ffa-f970-4939-850a-3beffe86ffc0
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-c84f9ffa-f970-4939-850a-3beffe86ffc0
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-01217c6a-7016-424e-bc9b-9e417c8e1f00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01217c6a-7016-424e-bc9b-9e417c8e1f00
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-01217c6a-7016-424e-bc9b-9e417c8e1f00
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-41a2d143-bb1d-4a7f-b074-20609c5f66f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41a2d143-bb1d-4a7f-b074-20609c5f66f6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-41a2d143-bb1d-4a7f-b074-20609c5f66f6
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-61921f56-21f4-49bd-a159-03e6dfb22f2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61921f56-21f4-49bd-a159-03e6dfb22f2b
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-61921f56-21f4-49bd-a159-03e6dfb22f2b
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-4006fe28-6bce-4dcd-8645-20d6a0564818

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4006fe28-6bce-4dcd-8645-20d6a0564818
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-4006fe28-6bce-4dcd-8645-20d6a0564818
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-002eaa1a-9eea-4d8d-bb90-8ce9cf3e2d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002eaa1a-9eea-4d8d-bb90-8ce9cf3e2d3b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-002eaa1a-9eea-4d8d-bb90-8ce9cf3e2d3b
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f491f6c-bde8-4129-8b8a-c7eac47b2f5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f491f6c-bde8-4129-8b8a-c7eac47b2f5f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f491f6c-bde8-4129-8b8a-c7eac47b2f5f
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-586a2077-952e-4834-a7eb-4e852acc4c9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586a2077-952e-4834-a7eb-4e852acc4c9a
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-586a2077-952e-4834-a7eb-4e852acc4c9a
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae9e5807-f953-4fff-9b2f-7d68f9f34306

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9e5807-f953-4fff-9b2f-7d68f9f34306
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae9e5807-f953-4fff-9b2f-7d68f9f34306
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d7160cd-ef79-478e-8ac1-00884a816066

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d7160cd-ef79-478e-8ac1-00884a816066
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d7160cd-ef79-478e-8ac1-00884a816066
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-19a0f160-7278-4720-bda8-8ef5bce1d221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a0f160-7278-4720-bda8-8ef5bce1d221
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a0f160-7278-4720-bda8-8ef5bce1d221
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c752ae7-deac-4bf5-b172-e824be2762de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c752ae7-deac-4bf5-b172-e824be2762de
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c752ae7-deac-4bf5-b172-e824be2762de
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-327d988c-dacb-40c1-b34c-76708a75ea30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327d988c-dacb-40c1-b34c-76708a75ea30
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-327d988c-dacb-40c1-b34c-76708a75ea30
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-073d6feb-9c31-4b31-977c-f27b3317947b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-073d6feb-9c31-4b31-977c-f27b3317947b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-073d6feb-9c31-4b31-977c-f27b3317947b
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-75816784-7411-4957-b4d7-1da550ded5be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75816784-7411-4957-b4d7-1da550ded5be
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-75816784-7411-4957-b4d7-1da550ded5be
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c41c5ba-c73f-41bf-b43e-65ef004ecd26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c41c5ba-c73f-41bf-b43e-65ef004ecd26
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c41c5ba-c73f-41bf-b43e-65ef004ecd26
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd8105ae-6bff-437a-90f1-0baa1f6de183

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd8105ae-6bff-437a-90f1-0baa1f6de183
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd8105ae-6bff-437a-90f1-0baa1f6de183
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcab4107-4f65-4d7a-8374-d04faf4394e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcab4107-4f65-4d7a-8374-d04faf4394e4
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcab4107-4f65-4d7a-8374-d04faf4394e4
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac8b4846-0b63-4092-baca-8d1dba9391a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac8b4846-0b63-4092-baca-8d1dba9391a1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac8b4846-0b63-4092-baca-8d1dba9391a1
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8c7cc75-1a06-4869-bed6-74ff6413495c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c7cc75-1a06-4869-bed6-74ff6413495c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8c7cc75-1a06-4869-bed6-74ff6413495c
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-3960eb01-032c-4d31-9187-9d7f061a1060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3960eb01-032c-4d31-9187-9d7f061a1060
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3960eb01-032c-4d31-9187-9d7f061a1060
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8591f83-ff09-48f4-80da-b9b221368f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8591f83-ff09-48f4-80da-b9b221368f06
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8591f83-ff09-48f4-80da-b9b221368f06
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-5bf41c2b-915e-4179-93d8-085850c06936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bf41c2b-915e-4179-93d8-085850c06936
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5bf41c2b-915e-4179-93d8-085850c06936
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-9622e43b-f500-46a5-ba8d-ad3a3b40e8ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9622e43b-f500-46a5-ba8d-ad3a3b40e8ba
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9622e43b-f500-46a5-ba8d-ad3a3b40e8ba
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-f420bcc9-95ce-4b1c-a9d1-f0b778f11d86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f420bcc9-95ce-4b1c-a9d1-f0b778f11d86
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-f420bcc9-95ce-4b1c-a9d1-f0b778f11d86
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-21212f87-6342-4734-825d-69604379dc2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21212f87-6342-4734-825d-69604379dc2c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-21212f87-6342-4734-825d-69604379dc2c
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e5d2ebb-1778-4869-ac8f-a90156b7bded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e5d2ebb-1778-4869-ac8f-a90156b7bded
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e5d2ebb-1778-4869-ac8f-a90156b7bded
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-af8d0892-ad53-4c9a-9cbe-90d9800757dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af8d0892-ad53-4c9a-9cbe-90d9800757dd
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-af8d0892-ad53-4c9a-9cbe-90d9800757dd
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-abb89de5-836b-4177-bc5b-f700d1e68c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abb89de5-836b-4177-bc5b-f700d1e68c0d
Content-Type: application/json

--- response: 429 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abb89de5-836b-4177-bc5b-f700d1e68c0d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-abb89de5-836b-4177-bc5b-f700d1e68c0d"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-3584e7d2-7606-47a3-a3aa-364c6a8a62c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3584e7d2-7606-47a3-a3aa-364c6a8a62c3
Content-Type: application/json

--- request body ---
{"handle":"qa-5ab64405c075","password":"****"}

--- response: 429 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3584e7d2-7606-47a3-a3aa-364c6a8a62c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-3584e7d2-7606-47a3-a3aa-364c6a8a62c3"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-ba165564-01c6-4890-bbfa-a03e071cb774

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba165564-01c6-4890-bbfa-a03e071cb774
Content-Type: application/json

--- request body ---
{"handle":"qa-be9c309d3bb1","displayName":"QA be9c309d3bb1","password":"****","region":"eu"}

--- response: 429 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba165564-01c6-4890-bbfa-a03e071cb774
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-ba165564-01c6-4890-bbfa-a03e071cb774"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-60abb90c-90f6-48e8-b5d7-0f4958d7e364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60abb90c-90f6-48e8-b5d7-0f4958d7e364
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60abb90c-90f6-48e8-b5d7-0f4958d7e364
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60abb90c-90f6-48e8-b5d7-0f4958d7e364"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d7102fda-9e50-4f44-af61-d1d42ee57b9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7102fda-9e50-4f44-af61-d1d42ee57b9b
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7102fda-9e50-4f44-af61-d1d42ee57b9b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7102fda-9e50-4f44-af61-d1d42ee57b9b"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-178174cc-0c87-4744-9c0b-6b3aa9eff6b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-178174cc-0c87-4744-9c0b-6b3aa9eff6b9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-178174cc-0c87-4744-9c0b-6b3aa9eff6b9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-178174cc-0c87-4744-9c0b-6b3aa9eff6b9"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-5ab64405c075
correlation: qa-6bc765d3-50c1-40dd-aa44-a1718c3038d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc765d3-50c1-40dd-aa44-a1718c3038d1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bc765d3-50c1-40dd-aa44-a1718c3038d1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-5ab64405c075","correlationId":"qa-6bc765d3-50c1-40dd-aa44-a1718c3038d1"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-ba133518-fc49-4347-91ec-27d706a99405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba133518-fc49-4347-91ec-27d706a99405
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5ab64405c075","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ba133518-fc49-4347-91ec-27d706a99405
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-ba133518-fc49-4347-91ec-27d706a99405"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-bca9f5c5-9779-4021-90f2-7f23384452a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca9f5c5-9779-4021-90f2-7f23384452a0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bca9f5c5-9779-4021-90f2-7f23384452a0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-bca9f5c5-9779-4021-90f2-7f23384452a0"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039
correlation: qa-1646df93-af78-402d-a1d1-712ff40a786d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1646df93-af78-402d-a1d1-712ff40a786d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1646df93-af78-402d-a1d1-712ff40a786d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039","correlationId":"qa-1646df93-af78-402d-a1d1-712ff40a786d"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/messages
correlation: qa-197a9367-2625-4b61-8cb3-5a45856ac0ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-197a9367-2625-4b61-8cb3-5a45856ac0ee
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-197a9367-2625-4b61-8cb3-5a45856ac0ee
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/messages","correlationId":"qa-197a9367-2625-4b61-8cb3-5a45856ac0ee"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/messages
correlation: qa-43112474-f34c-473e-b220-842b5eaffd15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43112474-f34c-473e-b220-842b5eaffd15
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43112474-f34c-473e-b220-842b5eaffd15
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/messages","correlationId":"qa-43112474-f34c-473e-b220-842b5eaffd15"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/read
correlation: qa-fe4d94e2-2fb8-4b7f-965b-907ff2c55d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe4d94e2-2fb8-4b7f-965b-907ff2c55d8b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe4d94e2-2fb8-4b7f-965b-907ff2c55d8b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/read","correlationId":"qa-fe4d94e2-2fb8-4b7f-965b-907ff2c55d8b"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/close
correlation: qa-8da478c8-45f5-4f5f-ad04-35acef6b2cbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8da478c8-45f5-4f5f-ad04-35acef6b2cbd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8da478c8-45f5-4f5f-ad04-35acef6b2cbd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_151c87a8-6096-4d4f-ac7c-c39b055e2039/close","correlationId":"qa-8da478c8-45f5-4f5f-ad04-35acef6b2cbd"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-224793c7-e23a-4f69-9201-9fada10a21e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-224793c7-e23a-4f69-9201-9fada10a21e9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-224793c7-e23a-4f69-9201-9fada10a21e9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-224793c7-e23a-4f69-9201-9fada10a21e9"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-658f853c-3c12-4212-9ee8-8af7e67e0514

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-658f853c-3c12-4212-9ee8-8af7e67e0514
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-658f853c-3c12-4212-9ee8-8af7e67e0514
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-658f853c-3c12-4212-9ee8-8af7e67e0514"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d599639f-9e14-47cc-b64a-2500482477cb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-4fbbcce20e404f2eadeea80ae82b1d15
X-Correlation-Id: qa-d599639f-9e14-47cc-b64a-2500482477cb
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d599639f-9e14-47cc-b64a-2500482477cb
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-d599639f-9e14-47cc-b64a-2500482477cb"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-a20941fa-6920-4390-a9ae-d3025c1b241c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a20941fa-6920-4390-a9ae-d3025c1b241c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a20941fa-6920-4390-a9ae-d3025c1b241c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-a20941fa-6920-4390-a9ae-d3025c1b241c"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9ba1136-ac80-477c-8ac9-805fb1207b6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9ba1136-ac80-477c-8ac9-805fb1207b6c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9ba1136-ac80-477c-8ac9-805fb1207b6c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c9ba1136-ac80-477c-8ac9-805fb1207b6c"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-7430da12-5f0a-4e55-8672-ff1188303108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7430da12-5f0a-4e55-8672-ff1188303108
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7430da12-5f0a-4e55-8672-ff1188303108
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7430da12-5f0a-4e55-8672-ff1188303108"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1788949-e6b2-4d68-88c5-612eb26d7f27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1788949-e6b2-4d68-88c5-612eb26d7f27
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1788949-e6b2-4d68-88c5-612eb26d7f27
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a1788949-e6b2-4d68-88c5-612eb26d7f27"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-d879eea5-08f7-4e41-8466-a5f8ae2dd73c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d879eea5-08f7-4e41-8466-a5f8ae2dd73c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d879eea5-08f7-4e41-8466-a5f8ae2dd73c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d879eea5-08f7-4e41-8466-a5f8ae2dd73c"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-dae977c8-24f1-4b0a-babd-1cdbc5dac115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dae977c8-24f1-4b0a-babd-1cdbc5dac115
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dae977c8-24f1-4b0a-babd-1cdbc5dac115
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dae977c8-24f1-4b0a-babd-1cdbc5dac115"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-c340610a-6949-47f4-805a-2d8d1d458859

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c340610a-6949-47f4-805a-2d8d1d458859
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c340610a-6949-47f4-805a-2d8d1d458859
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c340610a-6949-47f4-805a-2d8d1d458859"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dce16f0-3caa-486e-b93f-76fe5e2fa008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dce16f0-3caa-486e-b93f-76fe5e2fa008
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dce16f0-3caa-486e-b93f-76fe5e2fa008
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8dce16f0-3caa-486e-b93f-76fe5e2fa008"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-68c18f27-8268-4740-a256-05524301a929

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68c18f27-8268-4740-a256-05524301a929
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68c18f27-8268-4740-a256-05524301a929
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-68c18f27-8268-4740-a256-05524301a929"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ec94495-766a-4734-96df-33188e725035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ec94495-766a-4734-96df-33188e725035
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ec94495-766a-4734-96df-33188e725035
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5ec94495-766a-4734-96df-33188e725035"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bea52bd-d74a-4c71-80b7-a3200efbecb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bea52bd-d74a-4c71-80b7-a3200efbecb7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bea52bd-d74a-4c71-80b7-a3200efbecb7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7bea52bd-d74a-4c71-80b7-a3200efbecb7"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ca5c4cd-e366-4b3c-9b80-fc3d567a75af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ca5c4cd-e366-4b3c-9b80-fc3d567a75af
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ca5c4cd-e366-4b3c-9b80-fc3d567a75af
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8ca5c4cd-e366-4b3c-9b80-fc3d567a75af"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0898ca6-13c8-4ce9-9a05-de95418d8791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0898ca6-13c8-4ce9-9a05-de95418d8791
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0898ca6-13c8-4ce9-9a05-de95418d8791
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b0898ca6-13c8-4ce9-9a05-de95418d8791"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-614999d2-77c2-4e14-8b8a-29cd40f2e121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-614999d2-77c2-4e14-8b8a-29cd40f2e121
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-614999d2-77c2-4e14-8b8a-29cd40f2e121
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-614999d2-77c2-4e14-8b8a-29cd40f2e121"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-65732957-5041-44ad-9fae-97afc40e7178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65732957-5041-44ad-9fae-97afc40e7178
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65732957-5041-44ad-9fae-97afc40e7178
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-65732957-5041-44ad-9fae-97afc40e7178"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bec696f-a610-4a56-9155-b1d93da1d4f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bec696f-a610-4a56-9155-b1d93da1d4f0
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bec696f-a610-4a56-9155-b1d93da1d4f0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2bec696f-a610-4a56-9155-b1d93da1d4f0"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b5cd3f8-e13a-4781-94a2-e249630192af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b5cd3f8-e13a-4781-94a2-e249630192af
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b5cd3f8-e13a-4781-94a2-e249630192af
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

{"id":"acc_2fdfca89-58db-4899-b8eb-4ed752a7d781","handle":"qa-5ab64405c075","displayName":"QA 5ab64405c075","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.504052146Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-8c62fb8b-468a-4abf-ab23-e943bc389d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c62fb8b-468a-4abf-ab23-e943bc389d82
Content-Type: application/json

--- request body ---
{"handle":"qa-c28353b37f08","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c62fb8b-468a-4abf-ab23-e943bc389d82
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb36c6af-98ce-428e-afc1-46946dc9b391"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b03ce1d-bab6-4a09-bd43-accd0ce2c6c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b03ce1d-bab6-4a09-bd43-accd0ce2c6c2
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b03ce1d-bab6-4a09-bd43-accd0ce2c6c2
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
correlation: qa-91cf1b4a-a828-4ac4-9fe4-c3b7da415fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91cf1b4a-a828-4ac4-9fe4-c3b7da415fba
Content-Type: application/json

--- request body ---
{"handle":"qa-c28353b37f08","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91cf1b4a-a828-4ac4-9fe4-c3b7da415fba
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-91cf1b4a-a828-4ac4-9fe4-c3b7da415fba"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d4fca6d-4189-4c08-b3ac-816dd235b34d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d4fca6d-4189-4c08-b3ac-816dd235b34d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d4fca6d-4189-4c08-b3ac-816dd235b34d
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
correlation: qa-4fe6d0b1-37b6-4868-baaa-36af5ab3101d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fe6d0b1-37b6-4868-baaa-36af5ab3101d
Content-Type: application/json

--- request body ---
{"handle":"qa-5ab64405c075","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 20 Nov 2026 10:10:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fe6d0b1-37b6-4868-baaa-36af5ab3101d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4fe6d0b1-37b6-4868-baaa-36af5ab3101d"}
```
