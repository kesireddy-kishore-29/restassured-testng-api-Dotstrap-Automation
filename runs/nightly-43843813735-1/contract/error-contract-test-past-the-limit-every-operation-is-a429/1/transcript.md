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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-c780c366-6ebb-4c98-b8a5-51cc24a5dc72` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-eab548c5-6a40-4cf4-b37d-0c9c7266ba77` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-8c995be3-3010-491b-99b6-0eae2f23f3cd` |
| 4 | `POST /v1/conversations` | 201 | 38 | `qa-47eed670-7f15-4798-8c64-c3ad849e6249` |
| 5 | `GET /v1/accounts/me` | 200 | 20 | `qa-8c477db4-296c-480a-957a-0d95c6026b77` |
| 6 | `GET /v1/accounts/me` | 200 | 15 | `qa-4ab1e1c2-99c1-45ee-adc6-16f2f02371f6` |
| 7 | `GET /v1/accounts/me` | 200 | 16 | `qa-1ff39907-e38c-4d74-93c8-b8f09dced19a` |
| 8 | `GET /v1/accounts/me` | 200 | 22 | `qa-8082797a-0904-4933-8278-fe675ed08c02` |
| 9 | `GET /v1/accounts/me` | 200 | 27 | `qa-f0d22176-1b46-408c-8453-84920518f56b` |
| 10 | `GET /v1/accounts/me` | 200 | 13 | `qa-0519dc11-b7c9-4363-9e28-7f4211b507ca` |
| 11 | `GET /v1/accounts/me` | 200 | 9 | `qa-95225e34-d5d4-4b2c-8717-630a33782d53` |
| 12 | `GET /v1/accounts/me` | 200 | 15 | `qa-bea77d32-caa0-4fa0-a0fd-47b8f6131349` |
| 13 | `GET /v1/accounts/me` | 200 | 18 | `qa-65f6473c-76b5-4a9f-b119-c8bb96e0b9af` |
| 14 | `GET /v1/accounts/me` | 200 | 9 | `qa-640f8b3f-54d7-414a-8350-52c9c983cae2` |
| 15 | `GET /v1/accounts/me` | 200 | 10 | `qa-ed65488b-86b6-4335-9b1a-f2d940caeeb0` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-385c5abe-4667-431b-8ee9-097f0a1adf6b` |
| 17 | `GET /v1/accounts/me` | 200 | 15 | `qa-8993bfe4-1dea-4653-985f-c1fbe32c3346` |
| 18 | `GET /v1/accounts/me` | 200 | 16 | `qa-ae548ca6-0ae9-4233-8c13-a91487eeb073` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-1b780667-de4b-43c9-8e40-4571bd433e8a` |
| 20 | `GET /v1/accounts/me` | 200 | 18 | `qa-42dfdfae-a71f-46df-ab2b-ea3646d8259a` |
| 21 | `GET /v1/accounts/me` | 200 | 19 | `qa-7c2c4ebc-8840-4331-a55c-3075eb0df3d6` |
| 22 | `GET /v1/accounts/me` | 200 | 12 | `qa-ddb24d4a-060b-4397-8577-b28bc0ad8f2a` |
| 23 | `GET /v1/accounts/me` | 200 | 32 | `qa-94fbe72a-d604-4d05-b6b1-73d523316265` |
| 24 | `GET /v1/accounts/me` | 200 | 22 | `qa-d4095fc9-3141-4d4a-a988-d4b431d2a12f` |
| 25 | `GET /v1/accounts/me` | 200 | 42 | `qa-3e6e16ff-7e77-4000-9589-fdc40262205e` |
| 26 | `GET /v1/accounts/me` | 200 | 11 | `qa-5f7d5625-db47-4af5-b60b-5cafaf8f38c9` |
| 27 | `GET /v1/accounts/me` | 200 | 18 | `qa-cb27370c-b46f-4c16-aa6d-54f78d42b7a8` |
| 28 | `GET /v1/accounts/me` | 200 | 16 | `qa-80606cc9-ccdd-47c9-ab9a-467f5b124f7d` |
| 29 | `GET /v1/accounts/me` | 200 | 13 | `qa-4843afd4-b427-4c17-a006-22ab0b4928a0` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-18f2f554-6091-42a4-8781-0725b5068ed0` |
| 31 | `GET /v1/accounts/me` | 200 | 17 | `qa-c69323bc-e943-44d9-8e20-56e966d380ba` |
| 32 | `GET /v1/accounts/me` | 200 | 22 | `qa-a6dc32d1-5cf4-4725-b5a8-7e70fef0df07` |
| 33 | `GET /v1/accounts/me` | 200 | 9 | `qa-26254e1e-2823-44e4-b4df-77e562667d19` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-f654c92b-ec18-4966-a720-1551939a9e9a` |
| 35 | `GET /v1/accounts/me` | 200 | 13 | `qa-58acfb62-2331-40d4-b707-2f1f831ccba1` |
| 36 | `GET /v1/accounts/me` | 200 | 19 | `qa-d0e1635a-1d43-4ce5-9dc9-5e85bfc17a32` |
| 37 | `GET /v1/accounts/me` | 200 | 13 | `qa-17d25986-70a9-4b06-bf6b-c1a5d182f1a5` |
| 38 | `GET /v1/accounts/me` | 200 | 12 | `qa-40e1af4a-9310-42bc-96c0-f33ba02a491f` |
| 39 | `GET /v1/accounts/me` | 200 | 9 | `qa-a10d6a16-47d6-4b3c-a1f9-6d25bfb235e5` |
| 40 | `GET /v1/accounts/me` | 200 | 12 | `qa-d63b6f98-e538-4957-bd9f-3cad8c3b89c5` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-2a266fcd-b552-4d86-9e5f-c948be81c8e6` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-cd0716b1-145e-43de-a76e-d470ba2dc92b` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-b4c180a9-3d85-4e22-8d43-4d4fc1b7ecce` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-69fddd51-fa55-4803-b052-078724bf649e` |
| 45 | `GET /v1/accounts/me` | 200 | 9 | `qa-fb0ce61b-d123-4d25-b5e4-f5e31c3d6122` |
| 46 | `GET /v1/accounts/me` | 200 | 8 | `qa-d581f267-3e0d-4aa5-80bd-c294fb183d29` |
| 47 | `GET /v1/accounts/me` | 200 | 7 | `qa-02c6a472-ef92-4336-a099-6c78a265ae4b` |
| 48 | `GET /v1/accounts/me` | 200 | 10 | `qa-83097713-a9a5-4581-bd75-fa9a70353f90` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-44ac700b-d43a-4856-9c77-04caca8b4276` |
| 50 | `GET /v1/accounts/me` | 200 | 17 | `qa-3f0c7971-b91a-47f0-bb44-9ac72a9e960c` |
| 51 | `GET /v1/accounts/me` | 200 | 7 | `qa-f844889d-12ea-4287-8e09-5801b1f927bf` |
| 52 | `GET /v1/accounts/me` | 200 | 9 | `qa-9024e77b-0e11-4c19-88cb-b9914057b2a5` |
| 53 | `GET /v1/accounts/me` | 200 | 12 | `qa-91b941c0-f810-4386-8644-daa993675245` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-58903a55-e1e8-4f9f-b139-50a347167061` |
| 55 | `GET /v1/accounts/me` | 200 | 18 | `qa-3a8117d0-7323-419e-b9f7-549257a20633` |
| 56 | `GET /v1/accounts/me` | 200 | 4 | `qa-c0f0f779-ccec-430b-8e97-a4c729d4dea2` |
| 57 | `GET /v1/accounts/me` | 200 | 8 | `qa-63b0a239-2757-46dd-948c-84c223b86b9b` |
| 58 | `GET /v1/accounts/me` | 200 | 41 | `qa-ec08b729-c147-49fd-9251-7f1b71623d3b` |
| 59 | `GET /v1/accounts/me` | 200 | 7 | `qa-23b561cd-5ea5-4c22-992b-8e294db4cb37` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-76643f9f-f174-4d6f-8956-c792666c0ee9` |
| 61 | `GET /v1/accounts/me` | 200 | 10 | `qa-3a08a78e-f733-49df-9382-c13cb140ca8f` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-7e651a2c-4e6f-4552-9e43-c96df27672eb` |
| 63 | `GET /v1/accounts/me` | 200 | 3 | `qa-88f8c2cf-80e0-44aa-b99a-f26560f7098c` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-9ee7b0bb-62f4-4b59-aead-f55f06799fdd` |
| 65 | `POST /v1/auth/token` | 429 | 7 | `qa-dfc390a4-1ede-430b-a719-fd502c72c44d` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-879279f6-f6e6-413b-a0d6-b8d48404fdef` |
| 67 | `GET /v1/accounts/me` | 429 | 3 | `qa-7ddf155d-fa4d-4d31-a4dd-8fbb698b23f8` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-99315c09-0e82-4bda-9d32-de4120c9ded2` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-291b5cc3-985b-4509-b3ee-31d64b4b5244` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-c9cf528f-9e04-4d38-bb3f-ffe358d2ff7f` |
| 71 | `POST /v1/conversations` | 429 | 3 | `qa-58fc8606-e372-469b-b059-10d6145819b5` |
| 72 | `GET /v1/conversations` | 429 | 3 | `qa-ea89c87f-5ed8-4148-ae3e-e4cb10cd7837` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-e945b31e-db4d-46ce-96aa-7dfc00f1cdab` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-6bbd9945-8390-4509-a5d6-b44150844c18` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 3 | `qa-69686a9f-fbab-4748-831c-4728b3f7eeb2` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-b467920a-6af9-4830-acde-c8096618ba06` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-da9387a5-1b04-4284-baed-9336390650ac` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-f15e2a8d-208d-44f5-a2dc-4a3058142f84` |
| 79 | `GET /v1/credits/ledger` | 429 | 3 | `qa-76014048-e485-4d7a-aee9-e3e5d9c2d1c8` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-7c47976c-7c6f-486b-931b-c39ed1bd14a3` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-1321d3c1-f113-4d77-82c5-db234bafeada` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-283c5511-4497-4239-a6e4-a776b973123c` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-81166b76-377a-400d-9b47-f4132594d62f` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-4476c900-53cd-46b3-8683-91b30c0ebb4f` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-bb88d96a-673a-41dd-ab6c-395731ca5077` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-ceacc84a-ea65-44e8-8300-86fe5e457b8a` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-9cb2a0ca-22c5-4bb6-8d09-6f39502bdb8f` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-b5ad88ff-7cc0-44d5-8f4f-34426daa193e` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-32940381-0925-4f2c-aa1f-c0f88ea8fec6` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-91fe57c4-b9eb-4d0d-9123-0be3db651bb1` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-3851a585-560c-4304-8278-e5841f38233c` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-4cbaa58e-0114-4acd-9540-3950f7b328f3` |
| 93 | `GET /v1/accounts/me` | 429 | 3 | `qa-f6fdd5f8-3ae2-4344-b283-6fa5fca9869e` |
| 94 | `GET /v1/accounts/me` | 429 | 3 | `qa-6abd0f4b-54d3-42c6-8b26-cfcd24113df2` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-2a8d5bf5-4966-440b-ae56-fb1089e2dbe9` |
| 96 | `GET /v1/accounts/me` | 429 | 4 | `qa-d784a294-c90a-4bdf-88fb-73d5218a04f0` |
| 97 | `GET /v1/accounts/me` | 429 | 4 | `qa-b2a62357-ee24-438c-865d-2ddd51d3b9ec` |
| 98 | `GET /v1/accounts/me` | 200 | 4 | `qa-030c0d18-6420-4d5b-9f56-777ae336dda7` |
| 99 | `POST /v1/auth/token` | 200 | 6 | `qa-8251f894-8225-440a-badf-7ec335798d50` |
| 100 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-94eb964b-20f9-438a-bd90-ab1478e1e80d` |
| 101 | `POST /v1/auth/token` | 401 | 5 | `qa-7c0f7174-b51f-468e-a8a1-20eca95b43d7` |
| 102 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-1ba46151-53ca-4e77-ac9e-7304f5fc3c7a` |
| 103 | `POST /v1/auth/token` | 401 | 4 | `qa-88edbb75-ee44-4306-b1b3-189cfe1a0259` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c780c366-6ebb-4c98-b8a5-51cc24a5dc72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c780c366-6ebb-4c98-b8a5-51cc24a5dc72
Content-Type: application/json

--- request body ---
{"handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c780c366-6ebb-4c98-b8a5-51cc24a5dc72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Location: /v1/accounts/qa-9d28af99c848
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eab548c5-6a40-4cf4-b37d-0c9c7266ba77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eab548c5-6a40-4cf4-b37d-0c9c7266ba77
Content-Type: application/json

--- request body ---
{"handle":"qa-404a788f7f70","displayName":"QA 404a788f7f70","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eab548c5-6a40-4cf4-b37d-0c9c7266ba77
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
Location: /v1/accounts/qa-404a788f7f70
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4085478a-ce81-4ebd-8ee1-2b8a67c49f1b","handle":"qa-404a788f7f70","displayName":"QA 404a788f7f70","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.543704213Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c995be3-3010-491b-99b6-0eae2f23f3cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c995be3-3010-491b-99b6-0eae2f23f3cd
Content-Type: application/json

--- request body ---
{"handle":"qa-9d28af99c848","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c995be3-3010-491b-99b6-0eae2f23f3cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-47eed670-7f15-4798-8c64-c3ad849e6249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47eed670-7f15-4798-8c64-c3ad849e6249
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-404a788f7f70","subject":"Error contract","message":"Hi"}

--- response: 201 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-47eed670-7f15-4798-8c64-c3ad849e6249
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
Location: /v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fd185a90-fb07-4282-b608-a83e6743958e","subject":"Error contract","status":"open","region":"eu","participants":["qa-9d28af99c848","qa-404a788f7f70"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.649102682Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c477db4-296c-480a-957a-0d95c6026b77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c477db4-296c-480a-957a-0d95c6026b77
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c477db4-296c-480a-957a-0d95c6026b77
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-4ab1e1c2-99c1-45ee-adc6-16f2f02371f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab1e1c2-99c1-45ee-adc6-16f2f02371f6
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ab1e1c2-99c1-45ee-adc6-16f2f02371f6
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ff39907-e38c-4d74-93c8-b8f09dced19a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ff39907-e38c-4d74-93c8-b8f09dced19a
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ff39907-e38c-4d74-93c8-b8f09dced19a
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-8082797a-0904-4933-8278-fe675ed08c02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8082797a-0904-4933-8278-fe675ed08c02
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8082797a-0904-4933-8278-fe675ed08c02
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0d22176-1b46-408c-8453-84920518f56b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d22176-1b46-408c-8453-84920518f56b
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0d22176-1b46-408c-8453-84920518f56b
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-0519dc11-b7c9-4363-9e28-7f4211b507ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0519dc11-b7c9-4363-9e28-7f4211b507ca
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-0519dc11-b7c9-4363-9e28-7f4211b507ca
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-95225e34-d5d4-4b2c-8717-630a33782d53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95225e34-d5d4-4b2c-8717-630a33782d53
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-95225e34-d5d4-4b2c-8717-630a33782d53
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-bea77d32-caa0-4fa0-a0fd-47b8f6131349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea77d32-caa0-4fa0-a0fd-47b8f6131349
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea77d32-caa0-4fa0-a0fd-47b8f6131349
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-65f6473c-76b5-4a9f-b119-c8bb96e0b9af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f6473c-76b5-4a9f-b119-c8bb96e0b9af
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-65f6473c-76b5-4a9f-b119-c8bb96e0b9af
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-640f8b3f-54d7-414a-8350-52c9c983cae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-640f8b3f-54d7-414a-8350-52c9c983cae2
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-640f8b3f-54d7-414a-8350-52c9c983cae2
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed65488b-86b6-4335-9b1a-f2d940caeeb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed65488b-86b6-4335-9b1a-f2d940caeeb0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed65488b-86b6-4335-9b1a-f2d940caeeb0
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-385c5abe-4667-431b-8ee9-097f0a1adf6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-385c5abe-4667-431b-8ee9-097f0a1adf6b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-385c5abe-4667-431b-8ee9-097f0a1adf6b
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-8993bfe4-1dea-4653-985f-c1fbe32c3346

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8993bfe4-1dea-4653-985f-c1fbe32c3346
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8993bfe4-1dea-4653-985f-c1fbe32c3346
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae548ca6-0ae9-4233-8c13-a91487eeb073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae548ca6-0ae9-4233-8c13-a91487eeb073
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae548ca6-0ae9-4233-8c13-a91487eeb073
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b780667-de4b-43c9-8e40-4571bd433e8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b780667-de4b-43c9-8e40-4571bd433e8a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b780667-de4b-43c9-8e40-4571bd433e8a
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-42dfdfae-a71f-46df-ab2b-ea3646d8259a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42dfdfae-a71f-46df-ab2b-ea3646d8259a
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-42dfdfae-a71f-46df-ab2b-ea3646d8259a
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c2c4ebc-8840-4331-a55c-3075eb0df3d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c2c4ebc-8840-4331-a55c-3075eb0df3d6
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c2c4ebc-8840-4331-a55c-3075eb0df3d6
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddb24d4a-060b-4397-8577-b28bc0ad8f2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddb24d4a-060b-4397-8577-b28bc0ad8f2a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddb24d4a-060b-4397-8577-b28bc0ad8f2a
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-94fbe72a-d604-4d05-b6b1-73d523316265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94fbe72a-d604-4d05-b6b1-73d523316265
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-94fbe72a-d604-4d05-b6b1-73d523316265
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-d4095fc9-3141-4d4a-a988-d4b431d2a12f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4095fc9-3141-4d4a-a988-d4b431d2a12f
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4095fc9-3141-4d4a-a988-d4b431d2a12f
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e6e16ff-7e77-4000-9589-fdc40262205e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e6e16ff-7e77-4000-9589-fdc40262205e
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e6e16ff-7e77-4000-9589-fdc40262205e
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f7d5625-db47-4af5-b60b-5cafaf8f38c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f7d5625-db47-4af5-b60b-5cafaf8f38c9
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f7d5625-db47-4af5-b60b-5cafaf8f38c9
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb27370c-b46f-4c16-aa6d-54f78d42b7a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb27370c-b46f-4c16-aa6d-54f78d42b7a8
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb27370c-b46f-4c16-aa6d-54f78d42b7a8
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-80606cc9-ccdd-47c9-ab9a-467f5b124f7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80606cc9-ccdd-47c9-ab9a-467f5b124f7d
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-80606cc9-ccdd-47c9-ab9a-467f5b124f7d
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-4843afd4-b427-4c17-a006-22ab0b4928a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4843afd4-b427-4c17-a006-22ab0b4928a0
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4843afd4-b427-4c17-a006-22ab0b4928a0
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-18f2f554-6091-42a4-8781-0725b5068ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18f2f554-6091-42a4-8781-0725b5068ed0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-18f2f554-6091-42a4-8781-0725b5068ed0
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-c69323bc-e943-44d9-8e20-56e966d380ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c69323bc-e943-44d9-8e20-56e966d380ba
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c69323bc-e943-44d9-8e20-56e966d380ba
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6dc32d1-5cf4-4725-b5a8-7e70fef0df07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6dc32d1-5cf4-4725-b5a8-7e70fef0df07
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6dc32d1-5cf4-4725-b5a8-7e70fef0df07
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-26254e1e-2823-44e4-b4df-77e562667d19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26254e1e-2823-44e4-b4df-77e562667d19
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-26254e1e-2823-44e4-b4df-77e562667d19
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-f654c92b-ec18-4966-a720-1551939a9e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f654c92b-ec18-4966-a720-1551939a9e9a
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f654c92b-ec18-4966-a720-1551939a9e9a
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-58acfb62-2331-40d4-b707-2f1f831ccba1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58acfb62-2331-40d4-b707-2f1f831ccba1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-58acfb62-2331-40d4-b707-2f1f831ccba1
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0e1635a-1d43-4ce5-9dc9-5e85bfc17a32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0e1635a-1d43-4ce5-9dc9-5e85bfc17a32
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0e1635a-1d43-4ce5-9dc9-5e85bfc17a32
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-17d25986-70a9-4b06-bf6b-c1a5d182f1a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d25986-70a9-4b06-bf6b-c1a5d182f1a5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d25986-70a9-4b06-bf6b-c1a5d182f1a5
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-40e1af4a-9310-42bc-96c0-f33ba02a491f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e1af4a-9310-42bc-96c0-f33ba02a491f
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e1af4a-9310-42bc-96c0-f33ba02a491f
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-a10d6a16-47d6-4b3c-a1f9-6d25bfb235e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a10d6a16-47d6-4b3c-a1f9-6d25bfb235e5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a10d6a16-47d6-4b3c-a1f9-6d25bfb235e5
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-d63b6f98-e538-4957-bd9f-3cad8c3b89c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d63b6f98-e538-4957-bd9f-3cad8c3b89c5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d63b6f98-e538-4957-bd9f-3cad8c3b89c5
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a266fcd-b552-4d86-9e5f-c948be81c8e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a266fcd-b552-4d86-9e5f-c948be81c8e6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a266fcd-b552-4d86-9e5f-c948be81c8e6
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd0716b1-145e-43de-a76e-d470ba2dc92b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd0716b1-145e-43de-a76e-d470ba2dc92b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd0716b1-145e-43de-a76e-d470ba2dc92b
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4c180a9-3d85-4e22-8d43-4d4fc1b7ecce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c180a9-3d85-4e22-8d43-4d4fc1b7ecce
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4c180a9-3d85-4e22-8d43-4d4fc1b7ecce
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-69fddd51-fa55-4803-b052-078724bf649e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69fddd51-fa55-4803-b052-078724bf649e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-69fddd51-fa55-4803-b052-078724bf649e
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb0ce61b-d123-4d25-b5e4-f5e31c3d6122

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb0ce61b-d123-4d25-b5e4-f5e31c3d6122
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb0ce61b-d123-4d25-b5e4-f5e31c3d6122
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-d581f267-3e0d-4aa5-80bd-c294fb183d29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d581f267-3e0d-4aa5-80bd-c294fb183d29
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-d581f267-3e0d-4aa5-80bd-c294fb183d29
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-02c6a472-ef92-4336-a099-6c78a265ae4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02c6a472-ef92-4336-a099-6c78a265ae4b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-02c6a472-ef92-4336-a099-6c78a265ae4b
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-83097713-a9a5-4581-bd75-fa9a70353f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83097713-a9a5-4581-bd75-fa9a70353f90
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-83097713-a9a5-4581-bd75-fa9a70353f90
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-44ac700b-d43a-4856-9c77-04caca8b4276

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ac700b-d43a-4856-9c77-04caca8b4276
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-44ac700b-d43a-4856-9c77-04caca8b4276
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f0c7971-b91a-47f0-bb44-9ac72a9e960c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f0c7971-b91a-47f0-bb44-9ac72a9e960c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f0c7971-b91a-47f0-bb44-9ac72a9e960c
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-f844889d-12ea-4287-8e09-5801b1f927bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f844889d-12ea-4287-8e09-5801b1f927bf
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-f844889d-12ea-4287-8e09-5801b1f927bf
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-9024e77b-0e11-4c19-88cb-b9914057b2a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9024e77b-0e11-4c19-88cb-b9914057b2a5
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9024e77b-0e11-4c19-88cb-b9914057b2a5
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-91b941c0-f810-4386-8644-daa993675245

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91b941c0-f810-4386-8644-daa993675245
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-91b941c0-f810-4386-8644-daa993675245
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-58903a55-e1e8-4f9f-b139-50a347167061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58903a55-e1e8-4f9f-b139-50a347167061
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-58903a55-e1e8-4f9f-b139-50a347167061
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a8117d0-7323-419e-b9f7-549257a20633

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a8117d0-7323-419e-b9f7-549257a20633
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a8117d0-7323-419e-b9f7-549257a20633
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0f0f779-ccec-430b-8e97-a4c729d4dea2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0f0f779-ccec-430b-8e97-a4c729d4dea2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0f0f779-ccec-430b-8e97-a4c729d4dea2
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-63b0a239-2757-46dd-948c-84c223b86b9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b0a239-2757-46dd-948c-84c223b86b9b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-63b0a239-2757-46dd-948c-84c223b86b9b
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec08b729-c147-49fd-9251-7f1b71623d3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec08b729-c147-49fd-9251-7f1b71623d3b
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec08b729-c147-49fd-9251-7f1b71623d3b
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-23b561cd-5ea5-4c22-992b-8e294db4cb37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23b561cd-5ea5-4c22-992b-8e294db4cb37
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-23b561cd-5ea5-4c22-992b-8e294db4cb37
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-76643f9f-f174-4d6f-8956-c792666c0ee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76643f9f-f174-4d6f-8956-c792666c0ee9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-76643f9f-f174-4d6f-8956-c792666c0ee9
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a08a78e-f733-49df-9382-c13cb140ca8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a08a78e-f733-49df-9382-c13cb140ca8f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a08a78e-f733-49df-9382-c13cb140ca8f
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e651a2c-4e6f-4552-9e43-c96df27672eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e651a2c-4e6f-4552-9e43-c96df27672eb
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e651a2c-4e6f-4552-9e43-c96df27672eb
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-88f8c2cf-80e0-44aa-b99a-f26560f7098c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88f8c2cf-80e0-44aa-b99a-f26560f7098c
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-88f8c2cf-80e0-44aa-b99a-f26560f7098c
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ee7b0bb-62f4-4b59-aead-f55f06799fdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ee7b0bb-62f4-4b59-aead-f55f06799fdd
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ee7b0bb-62f4-4b59-aead-f55f06799fdd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9ee7b0bb-62f4-4b59-aead-f55f06799fdd"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-dfc390a4-1ede-430b-a719-fd502c72c44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfc390a4-1ede-430b-a719-fd502c72c44d
Content-Type: application/json

--- request body ---
{"handle":"qa-9d28af99c848","password":"****"}

--- response: 429 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dfc390a4-1ede-430b-a719-fd502c72c44d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-dfc390a4-1ede-430b-a719-fd502c72c44d"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-879279f6-f6e6-413b-a0d6-b8d48404fdef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-879279f6-f6e6-413b-a0d6-b8d48404fdef
Content-Type: application/json

--- request body ---
{"handle":"qa-f23f9e544397","displayName":"QA f23f9e544397","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-879279f6-f6e6-413b-a0d6-b8d48404fdef
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-879279f6-f6e6-413b-a0d6-b8d48404fdef"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ddf155d-fa4d-4d31-a4dd-8fbb698b23f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ddf155d-fa4d-4d31-a4dd-8fbb698b23f8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ddf155d-fa4d-4d31-a4dd-8fbb698b23f8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7ddf155d-fa4d-4d31-a4dd-8fbb698b23f8"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-99315c09-0e82-4bda-9d32-de4120c9ded2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99315c09-0e82-4bda-9d32-de4120c9ded2
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99315c09-0e82-4bda-9d32-de4120c9ded2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-99315c09-0e82-4bda-9d32-de4120c9ded2"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-291b5cc3-985b-4509-b3ee-31d64b4b5244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-291b5cc3-985b-4509-b3ee-31d64b4b5244
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-291b5cc3-985b-4509-b3ee-31d64b4b5244
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-291b5cc3-985b-4509-b3ee-31d64b4b5244"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-9d28af99c848
correlation: qa-c9cf528f-9e04-4d38-bb3f-ffe358d2ff7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9cf528f-9e04-4d38-bb3f-ffe358d2ff7f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9cf528f-9e04-4d38-bb3f-ffe358d2ff7f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-9d28af99c848","correlationId":"qa-c9cf528f-9e04-4d38-bb3f-ffe358d2ff7f"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-58fc8606-e372-469b-b059-10d6145819b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58fc8606-e372-469b-b059-10d6145819b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9d28af99c848","subject":"Probe","message":"Hi"}

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58fc8606-e372-469b-b059-10d6145819b5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-58fc8606-e372-469b-b059-10d6145819b5"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-ea89c87f-5ed8-4148-ae3e-e4cb10cd7837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea89c87f-5ed8-4148-ae3e-e4cb10cd7837
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea89c87f-5ed8-4148-ae3e-e4cb10cd7837
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-ea89c87f-5ed8-4148-ae3e-e4cb10cd7837"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e
correlation: qa-e945b31e-db4d-46ce-96aa-7dfc00f1cdab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e945b31e-db4d-46ce-96aa-7dfc00f1cdab
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e945b31e-db4d-46ce-96aa-7dfc00f1cdab
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e","correlationId":"qa-e945b31e-db4d-46ce-96aa-7dfc00f1cdab"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/messages
correlation: qa-6bbd9945-8390-4509-a5d6-b44150844c18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bbd9945-8390-4509-a5d6-b44150844c18
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6bbd9945-8390-4509-a5d6-b44150844c18
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/messages","correlationId":"qa-6bbd9945-8390-4509-a5d6-b44150844c18"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/messages
correlation: qa-69686a9f-fbab-4748-831c-4728b3f7eeb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69686a9f-fbab-4748-831c-4728b3f7eeb2
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69686a9f-fbab-4748-831c-4728b3f7eeb2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/messages","correlationId":"qa-69686a9f-fbab-4748-831c-4728b3f7eeb2"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/read
correlation: qa-b467920a-6af9-4830-acde-c8096618ba06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b467920a-6af9-4830-acde-c8096618ba06
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b467920a-6af9-4830-acde-c8096618ba06
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/read","correlationId":"qa-b467920a-6af9-4830-acde-c8096618ba06"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/close
correlation: qa-da9387a5-1b04-4284-baed-9336390650ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da9387a5-1b04-4284-baed-9336390650ac
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da9387a5-1b04-4284-baed-9336390650ac
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_fd185a90-fb07-4282-b608-a83e6743958e/close","correlationId":"qa-da9387a5-1b04-4284-baed-9336390650ac"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-f15e2a8d-208d-44f5-a2dc-4a3058142f84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f15e2a8d-208d-44f5-a2dc-4a3058142f84
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f15e2a8d-208d-44f5-a2dc-4a3058142f84
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-f15e2a8d-208d-44f5-a2dc-4a3058142f84"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-76014048-e485-4d7a-aee9-e3e5d9c2d1c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76014048-e485-4d7a-aee9-e3e5d9c2d1c8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76014048-e485-4d7a-aee9-e3e5d9c2d1c8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-76014048-e485-4d7a-aee9-e3e5d9c2d1c8"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7c47976c-7c6f-486b-931b-c39ed1bd14a3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1f36a76b06934c6bbcd60dc05056d9e1
X-Correlation-Id: qa-7c47976c-7c6f-486b-931b-c39ed1bd14a3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c47976c-7c6f-486b-931b-c39ed1bd14a3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-7c47976c-7c6f-486b-931b-c39ed1bd14a3"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-1321d3c1-f113-4d77-82c5-db234bafeada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1321d3c1-f113-4d77-82c5-db234bafeada
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1321d3c1-f113-4d77-82c5-db234bafeada
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-1321d3c1-f113-4d77-82c5-db234bafeada"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-283c5511-4497-4239-a6e4-a776b973123c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-283c5511-4497-4239-a6e4-a776b973123c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-283c5511-4497-4239-a6e4-a776b973123c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-283c5511-4497-4239-a6e4-a776b973123c"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-81166b76-377a-400d-9b47-f4132594d62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81166b76-377a-400d-9b47-f4132594d62f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81166b76-377a-400d-9b47-f4132594d62f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-81166b76-377a-400d-9b47-f4132594d62f"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-4476c900-53cd-46b3-8683-91b30c0ebb4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4476c900-53cd-46b3-8683-91b30c0ebb4f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4476c900-53cd-46b3-8683-91b30c0ebb4f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4476c900-53cd-46b3-8683-91b30c0ebb4f"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-bb88d96a-673a-41dd-ab6c-395731ca5077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb88d96a-673a-41dd-ab6c-395731ca5077
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb88d96a-673a-41dd-ab6c-395731ca5077
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bb88d96a-673a-41dd-ab6c-395731ca5077"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-ceacc84a-ea65-44e8-8300-86fe5e457b8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ceacc84a-ea65-44e8-8300-86fe5e457b8a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ceacc84a-ea65-44e8-8300-86fe5e457b8a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ceacc84a-ea65-44e8-8300-86fe5e457b8a"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-9cb2a0ca-22c5-4bb6-8d09-6f39502bdb8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cb2a0ca-22c5-4bb6-8d09-6f39502bdb8f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cb2a0ca-22c5-4bb6-8d09-6f39502bdb8f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9cb2a0ca-22c5-4bb6-8d09-6f39502bdb8f"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5ad88ff-7cc0-44d5-8f4f-34426daa193e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ad88ff-7cc0-44d5-8f4f-34426daa193e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5ad88ff-7cc0-44d5-8f4f-34426daa193e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b5ad88ff-7cc0-44d5-8f4f-34426daa193e"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-32940381-0925-4f2c-aa1f-c0f88ea8fec6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32940381-0925-4f2c-aa1f-c0f88ea8fec6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32940381-0925-4f2c-aa1f-c0f88ea8fec6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-32940381-0925-4f2c-aa1f-c0f88ea8fec6"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-91fe57c4-b9eb-4d0d-9123-0be3db651bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fe57c4-b9eb-4d0d-9123-0be3db651bb1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91fe57c4-b9eb-4d0d-9123-0be3db651bb1
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-91fe57c4-b9eb-4d0d-9123-0be3db651bb1"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-3851a585-560c-4304-8278-e5841f38233c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3851a585-560c-4304-8278-e5841f38233c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3851a585-560c-4304-8278-e5841f38233c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3851a585-560c-4304-8278-e5841f38233c"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cbaa58e-0114-4acd-9540-3950f7b328f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cbaa58e-0114-4acd-9540-3950f7b328f3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:54:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cbaa58e-0114-4acd-9540-3950f7b328f3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4cbaa58e-0114-4acd-9540-3950f7b328f3"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6fdd5f8-3ae2-4344-b283-6fa5fca9869e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6fdd5f8-3ae2-4344-b283-6fa5fca9869e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6fdd5f8-3ae2-4344-b283-6fa5fca9869e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f6fdd5f8-3ae2-4344-b283-6fa5fca9869e"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-6abd0f4b-54d3-42c6-8b26-cfcd24113df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6abd0f4b-54d3-42c6-8b26-cfcd24113df2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:54:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6abd0f4b-54d3-42c6-8b26-cfcd24113df2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6abd0f4b-54d3-42c6-8b26-cfcd24113df2"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a8d5bf5-4966-440b-ae56-fb1089e2dbe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a8d5bf5-4966-440b-ae56-fb1089e2dbe9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a8d5bf5-4966-440b-ae56-fb1089e2dbe9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2a8d5bf5-4966-440b-ae56-fb1089e2dbe9"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-d784a294-c90a-4bdf-88fb-73d5218a04f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d784a294-c90a-4bdf-88fb-73d5218a04f0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d784a294-c90a-4bdf-88fb-73d5218a04f0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d784a294-c90a-4bdf-88fb-73d5218a04f0"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2a62357-ee24-438c-865d-2ddd51d3b9ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a62357-ee24-438c-865d-2ddd51d3b9ec
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2a62357-ee24-438c-865d-2ddd51d3b9ec
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b2a62357-ee24-438c-865d-2ddd51d3b9ec"}
```

## 98. GET /v1/accounts/me

```text
#98 GET http://localhost:7070/v1/accounts/me
correlation: qa-030c0d18-6420-4d5b-9f56-777ae336dda7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-030c0d18-6420-4d5b-9f56-777ae336dda7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-030c0d18-6420-4d5b-9f56-777ae336dda7
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

{"id":"acc_80c5dd9e-5fc1-49c5-b076-84defeea65f2","handle":"qa-9d28af99c848","displayName":"QA 9d28af99c848","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.498506625Z"}
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-8251f894-8225-440a-badf-7ec335798d50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8251f894-8225-440a-badf-7ec335798d50
Content-Type: application/json

--- request body ---
{"handle":"qa-404a788f7f70","password":"****"}

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-8251f894-8225-440a-badf-7ec335798d50
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4085478a-ce81-4ebd-8ee1-2b8a67c49f1b"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94eb964b-20f9-438a-bd90-ab1478e1e80d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94eb964b-20f9-438a-bd90-ab1478e1e80d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94eb964b-20f9-438a-bd90-ab1478e1e80d
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
correlation: qa-7c0f7174-b51f-468e-a8a1-20eca95b43d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c0f7174-b51f-468e-a8a1-20eca95b43d7
Content-Type: application/json

--- request body ---
{"handle":"qa-404a788f7f70","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c0f7174-b51f-468e-a8a1-20eca95b43d7
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c0f7174-b51f-468e-a8a1-20eca95b43d7"}
```

## 102. DELETE /v1/accounts/me

```text
#102 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1ba46151-53ca-4e77-ac9e-7304f5fc3c7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ba46151-53ca-4e77-ac9e-7304f5fc3c7a
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1ba46151-53ca-4e77-ac9e-7304f5fc3c7a
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
correlation: qa-88edbb75-ee44-4306-b1b3-189cfe1a0259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88edbb75-ee44-4306-b1b3-189cfe1a0259
Content-Type: application/json

--- request body ---
{"handle":"qa-9d28af99c848","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 16 Nov 2026 09:54:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88edbb75-ee44-4306-b1b3-189cfe1a0259
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88edbb75-ee44-4306-b1b3-189cfe1a0259"}
```
