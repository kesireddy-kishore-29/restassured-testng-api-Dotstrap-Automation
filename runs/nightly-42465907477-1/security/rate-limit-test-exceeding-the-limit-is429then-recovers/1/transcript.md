# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 395 | `qa-155a03e2-346b-4d55-8b79-16de22053c26` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-2eb1ced9-c1ee-4b1b-a2bc-8a4d1e6c6e18` |
| 3 | `GET /v1/accounts/me` | 200 | 37 | `qa-966f5b00-b845-48f9-a7b4-f64ba662a7e0` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-d9958a0d-b240-4fe3-b18b-0ef2b5c2b660` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-b01dc7a0-246d-4156-98d0-018b9d9d7c23` |
| 6 | `GET /v1/accounts/me` | 200 | 16 | `qa-368e29c9-6bec-497d-8657-1ee6d52df6ab` |
| 7 | `GET /v1/accounts/me` | 200 | 12 | `qa-cf6cf9ac-cab0-480c-9090-e5e2ddf2864e` |
| 8 | `GET /v1/accounts/me` | 200 | 7 | `qa-bfe24a2c-26eb-4e15-9e07-c186c7bb77b0` |
| 9 | `GET /v1/accounts/me` | 200 | 13 | `qa-dcfbd704-5dc8-4cb9-b573-69a8bbab8dc3` |
| 10 | `GET /v1/accounts/me` | 200 | 10 | `qa-7657760a-f8a9-404d-ba70-c8ca77194f59` |
| 11 | `GET /v1/accounts/me` | 200 | 16 | `qa-35571223-407e-424f-be9d-820b4c8ce084` |
| 12 | `GET /v1/accounts/me` | 200 | 5 | `qa-5a1853d3-7190-4506-a681-ce9b50051793` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-f7777308-154e-4bc2-acc1-f6bc086d4d82` |
| 14 | `GET /v1/accounts/me` | 200 | 7 | `qa-980a73d3-9c25-4d07-9bea-c8266c58dee1` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-a5941307-576c-4869-9e09-1f9a095b9c48` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-61314451-3627-4921-84fa-ffc87ba8acd3` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-2f380421-92de-4d61-bfc6-47a9cd799eec` |
| 18 | `GET /v1/accounts/me` | 200 | 12 | `qa-14d2ce54-8998-44d4-908f-536ef196fbb9` |
| 19 | `GET /v1/accounts/me` | 200 | 14 | `qa-71621a10-c610-4c4d-804d-fd1e0397dab8` |
| 20 | `GET /v1/accounts/me` | 200 | 13 | `qa-ac854315-88cb-44ad-881b-6fa6fe823bde` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-bba7a3ad-bff9-427c-958e-acedc2c2a907` |
| 22 | `GET /v1/accounts/me` | 200 | 13 | `qa-27671f12-59b8-473f-a459-1b66480808d4` |
| 23 | `GET /v1/accounts/me` | 200 | 10 | `qa-90a93640-50f0-4057-9409-774ff89bbf5d` |
| 24 | `GET /v1/accounts/me` | 200 | 13 | `qa-8e822138-f4a6-496e-8276-2dabe31afafb` |
| 25 | `GET /v1/accounts/me` | 200 | 14 | `qa-7c13afea-1707-40bd-b5d3-add68678327f` |
| 26 | `GET /v1/accounts/me` | 200 | 12 | `qa-92e04f8c-cd5b-42b5-9827-5f00492cd4be` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-cdb987f2-64e1-43e2-8b6c-917708c130c2` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-3becbac9-0464-419b-aec9-7428ae35910e` |
| 29 | `GET /v1/accounts/me` | 200 | 9 | `qa-a8af22ee-6767-474d-aa20-a751ea114c77` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-0d3e0149-7942-495b-b10c-7fae7795a1f8` |
| 31 | `GET /v1/accounts/me` | 200 | 6 | `qa-34355e85-1fba-4b45-bd77-c1459707ba80` |
| 32 | `GET /v1/accounts/me` | 200 | 6 | `qa-bfc99371-c242-49b6-ab2b-42388595ba21` |
| 33 | `GET /v1/accounts/me` | 200 | 9 | `qa-5e7d6187-fee1-486d-b29e-e6dacc762d33` |
| 34 | `GET /v1/accounts/me` | 200 | 5 | `qa-c8b8fb84-40cd-4111-8cb4-06211828c940` |
| 35 | `GET /v1/accounts/me` | 200 | 5 | `qa-02015b15-b91d-419c-a2ee-5d51a26a1592` |
| 36 | `GET /v1/accounts/me` | 200 | 8 | `qa-9a0644ce-9d93-46f4-9b13-0bc1bcc9b8d6` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-3d38c368-08d4-4d5f-9f9a-8301f5380601` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-1dfeb1a5-332b-493b-8f6c-42f9a116db92` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-86064d23-f5f3-4137-b3a6-23f5a3448341` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-06a13881-910e-496d-a132-1257ea5c220a` |
| 41 | `GET /v1/accounts/me` | 200 | 4 | `qa-d19d780d-d813-4f38-b0d0-32469b39fca7` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-f0cbc5ab-9a01-4ade-b088-6d6e20b330e5` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-fee3d796-7617-40d4-9c6c-26a0fe7db04f` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-4c098589-1b77-4baf-89c7-d38c59b2b2a0` |
| 45 | `GET /v1/accounts/me` | 200 | 5 | `qa-c6b0a87d-8bd4-4b62-8ea2-1766c90ae527` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-a784d851-605c-461d-90b3-5fae02372563` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-36909a71-cd5d-4523-a102-546444e6ddca` |
| 48 | `GET /v1/accounts/me` | 200 | 4 | `qa-5157c272-ed02-4e96-9772-afd1f1a48903` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-5538c2d7-f0aa-44af-92e3-ce3a10398566` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-ac9efd4b-7a5d-41ce-aa11-2a3ecaf09536` |
| 51 | `GET /v1/accounts/me` | 200 | 20 | `qa-aef30344-cfe6-42e0-aa6e-f42b4373b1f7` |
| 52 | `GET /v1/accounts/me` | 200 | 11 | `qa-7f1c531c-3392-43b1-9829-ab709de67ec5` |
| 53 | `GET /v1/accounts/me` | 200 | 10 | `qa-fed3f504-50fb-4818-8953-05afa1fbd465` |
| 54 | `GET /v1/accounts/me` | 200 | 15 | `qa-348b68cb-b529-4cc4-8937-6aae692a99c5` |
| 55 | `GET /v1/accounts/me` | 200 | 8 | `qa-5e2dda2b-fbd6-46fe-84d2-3f1c31f4e44b` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-c8ec331d-a9fe-4358-9465-38c78a26f8af` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-770df036-2779-42c9-a986-0d013fb01ebc` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-ec712ece-df42-44c8-af94-04be7ad89e02` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-b5c35412-b9f6-433b-b43c-5b2c3ab37fd5` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-83c586a2-a447-447a-b1e3-0d94a502d5ee` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-c3817f66-6de4-4399-afe0-5a359f7cd566` |
| 62 | `GET /v1/accounts/me` | 200 | 17 | `qa-6eb6a11d-817c-4e77-bb3d-335c132967af` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-3da13358-ef9d-465e-b9c7-c86f521ca364` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-f945520d-3ad5-4a06-8f29-82a47401d2ca` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-1a0455e5-2210-45d4-9484-0bbb1cbf13ba` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-774294eb-c40a-42dc-808e-190e2a3c0dd8` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-797a4624-57ab-4a7d-ab7f-226b162270e5` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-ca71acf9-fa86-4635-8b49-a6279156e9e5` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-4195d869-8504-4fef-8604-60462e7a90b2` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-26d547e0-f4d0-4648-a828-4ea0e0628f88` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-9927ad2e-d72e-4ad8-a044-1ff333216377` |
| 72 | `GET /v1/accounts/me` | 429 | 5 | `qa-832bc3c0-054a-4fb6-81d9-7c0f9cc1a5e5` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-3e34301c-3eea-4af1-b067-581c8ba16b10` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-623a8c98-77b9-43a1-94df-f6a0a6e024c3` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-438d27e0-6f7b-4848-97e7-788f0b3a01e0` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-56ca9d46-327c-4b6d-a5df-5750c15a01ff` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-ac005ff9-c8d1-467a-89c0-08f162c4e82c` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-f658e7e1-1b74-4e0d-91a6-673b8562f079` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-e8567a99-58ca-47be-a90d-be6cbf026eaa` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-23e00043-bf4b-44a9-8063-d9cce50cfc37` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-471ca7a5-8f38-409f-b009-d079f5e67cca` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-79a0f537-6898-4276-b1f4-60db8721a4c6` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-a034e3c8-fcbd-4242-b7b9-c1fb11a01851` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-155a03e2-346b-4d55-8b79-16de22053c26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-155a03e2-346b-4d55-8b79-16de22053c26
Content-Type: application/json

--- request body ---
{"handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","password":"****","region":"eu"}

--- response: 201 in 395 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-155a03e2-346b-4d55-8b79-16de22053c26
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
Location: /v1/accounts/qa-0f05662b83e2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2eb1ced9-c1ee-4b1b-a2bc-8a4d1e6c6e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eb1ced9-c1ee-4b1b-a2bc-8a4d1e6c6e18
Content-Type: application/json

--- request body ---
{"handle":"qa-0f05662b83e2","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb1ced9-c1ee-4b1b-a2bc-8a4d1e6c6e18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-966f5b00-b845-48f9-a7b4-f64ba662a7e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-966f5b00-b845-48f9-a7b4-f64ba662a7e0
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-966f5b00-b845-48f9-a7b4-f64ba662a7e0
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9958a0d-b240-4fe3-b18b-0ef2b5c2b660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9958a0d-b240-4fe3-b18b-0ef2b5c2b660
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9958a0d-b240-4fe3-b18b-0ef2b5c2b660
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b01dc7a0-246d-4156-98d0-018b9d9d7c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b01dc7a0-246d-4156-98d0-018b9d9d7c23
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b01dc7a0-246d-4156-98d0-018b9d9d7c23
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-368e29c9-6bec-497d-8657-1ee6d52df6ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-368e29c9-6bec-497d-8657-1ee6d52df6ab
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-368e29c9-6bec-497d-8657-1ee6d52df6ab
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf6cf9ac-cab0-480c-9090-e5e2ddf2864e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf6cf9ac-cab0-480c-9090-e5e2ddf2864e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf6cf9ac-cab0-480c-9090-e5e2ddf2864e
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfe24a2c-26eb-4e15-9e07-c186c7bb77b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfe24a2c-26eb-4e15-9e07-c186c7bb77b0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfe24a2c-26eb-4e15-9e07-c186c7bb77b0
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcfbd704-5dc8-4cb9-b573-69a8bbab8dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcfbd704-5dc8-4cb9-b573-69a8bbab8dc3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcfbd704-5dc8-4cb9-b573-69a8bbab8dc3
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-7657760a-f8a9-404d-ba70-c8ca77194f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7657760a-f8a9-404d-ba70-c8ca77194f59
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7657760a-f8a9-404d-ba70-c8ca77194f59
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-35571223-407e-424f-be9d-820b4c8ce084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35571223-407e-424f-be9d-820b4c8ce084
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-35571223-407e-424f-be9d-820b4c8ce084
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a1853d3-7190-4506-a681-ce9b50051793

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a1853d3-7190-4506-a681-ce9b50051793
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a1853d3-7190-4506-a681-ce9b50051793
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7777308-154e-4bc2-acc1-f6bc086d4d82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7777308-154e-4bc2-acc1-f6bc086d4d82
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7777308-154e-4bc2-acc1-f6bc086d4d82
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-980a73d3-9c25-4d07-9bea-c8266c58dee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-980a73d3-9c25-4d07-9bea-c8266c58dee1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-980a73d3-9c25-4d07-9bea-c8266c58dee1
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5941307-576c-4869-9e09-1f9a095b9c48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5941307-576c-4869-9e09-1f9a095b9c48
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5941307-576c-4869-9e09-1f9a095b9c48
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-61314451-3627-4921-84fa-ffc87ba8acd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61314451-3627-4921-84fa-ffc87ba8acd3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-61314451-3627-4921-84fa-ffc87ba8acd3
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f380421-92de-4d61-bfc6-47a9cd799eec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f380421-92de-4d61-bfc6-47a9cd799eec
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f380421-92de-4d61-bfc6-47a9cd799eec
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-14d2ce54-8998-44d4-908f-536ef196fbb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d2ce54-8998-44d4-908f-536ef196fbb9
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-14d2ce54-8998-44d4-908f-536ef196fbb9
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-71621a10-c610-4c4d-804d-fd1e0397dab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71621a10-c610-4c4d-804d-fd1e0397dab8
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-71621a10-c610-4c4d-804d-fd1e0397dab8
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac854315-88cb-44ad-881b-6fa6fe823bde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac854315-88cb-44ad-881b-6fa6fe823bde
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac854315-88cb-44ad-881b-6fa6fe823bde
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-bba7a3ad-bff9-427c-958e-acedc2c2a907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bba7a3ad-bff9-427c-958e-acedc2c2a907
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bba7a3ad-bff9-427c-958e-acedc2c2a907
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-27671f12-59b8-473f-a459-1b66480808d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27671f12-59b8-473f-a459-1b66480808d4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-27671f12-59b8-473f-a459-1b66480808d4
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-90a93640-50f0-4057-9409-774ff89bbf5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90a93640-50f0-4057-9409-774ff89bbf5d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-90a93640-50f0-4057-9409-774ff89bbf5d
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e822138-f4a6-496e-8276-2dabe31afafb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e822138-f4a6-496e-8276-2dabe31afafb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e822138-f4a6-496e-8276-2dabe31afafb
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c13afea-1707-40bd-b5d3-add68678327f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c13afea-1707-40bd-b5d3-add68678327f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c13afea-1707-40bd-b5d3-add68678327f
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-92e04f8c-cd5b-42b5-9827-5f00492cd4be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92e04f8c-cd5b-42b5-9827-5f00492cd4be
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-92e04f8c-cd5b-42b5-9827-5f00492cd4be
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdb987f2-64e1-43e2-8b6c-917708c130c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdb987f2-64e1-43e2-8b6c-917708c130c2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdb987f2-64e1-43e2-8b6c-917708c130c2
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-3becbac9-0464-419b-aec9-7428ae35910e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3becbac9-0464-419b-aec9-7428ae35910e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3becbac9-0464-419b-aec9-7428ae35910e
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8af22ee-6767-474d-aa20-a751ea114c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8af22ee-6767-474d-aa20-a751ea114c77
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8af22ee-6767-474d-aa20-a751ea114c77
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d3e0149-7942-495b-b10c-7fae7795a1f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d3e0149-7942-495b-b10c-7fae7795a1f8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d3e0149-7942-495b-b10c-7fae7795a1f8
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-34355e85-1fba-4b45-bd77-c1459707ba80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34355e85-1fba-4b45-bd77-c1459707ba80
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-34355e85-1fba-4b45-bd77-c1459707ba80
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfc99371-c242-49b6-ab2b-42388595ba21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfc99371-c242-49b6-ab2b-42388595ba21
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfc99371-c242-49b6-ab2b-42388595ba21
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e7d6187-fee1-486d-b29e-e6dacc762d33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e7d6187-fee1-486d-b29e-e6dacc762d33
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e7d6187-fee1-486d-b29e-e6dacc762d33
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8b8fb84-40cd-4111-8cb4-06211828c940

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8b8fb84-40cd-4111-8cb4-06211828c940
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8b8fb84-40cd-4111-8cb4-06211828c940
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-02015b15-b91d-419c-a2ee-5d51a26a1592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02015b15-b91d-419c-a2ee-5d51a26a1592
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-02015b15-b91d-419c-a2ee-5d51a26a1592
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a0644ce-9d93-46f4-9b13-0bc1bcc9b8d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a0644ce-9d93-46f4-9b13-0bc1bcc9b8d6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a0644ce-9d93-46f4-9b13-0bc1bcc9b8d6
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d38c368-08d4-4d5f-9f9a-8301f5380601

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d38c368-08d4-4d5f-9f9a-8301f5380601
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d38c368-08d4-4d5f-9f9a-8301f5380601
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dfeb1a5-332b-493b-8f6c-42f9a116db92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dfeb1a5-332b-493b-8f6c-42f9a116db92
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dfeb1a5-332b-493b-8f6c-42f9a116db92
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-86064d23-f5f3-4137-b3a6-23f5a3448341

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86064d23-f5f3-4137-b3a6-23f5a3448341
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-86064d23-f5f3-4137-b3a6-23f5a3448341
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-06a13881-910e-496d-a132-1257ea5c220a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06a13881-910e-496d-a132-1257ea5c220a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-06a13881-910e-496d-a132-1257ea5c220a
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-d19d780d-d813-4f38-b0d0-32469b39fca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d19d780d-d813-4f38-b0d0-32469b39fca7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d19d780d-d813-4f38-b0d0-32469b39fca7
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0cbc5ab-9a01-4ade-b088-6d6e20b330e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0cbc5ab-9a01-4ade-b088-6d6e20b330e5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0cbc5ab-9a01-4ade-b088-6d6e20b330e5
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-fee3d796-7617-40d4-9c6c-26a0fe7db04f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fee3d796-7617-40d4-9c6c-26a0fe7db04f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fee3d796-7617-40d4-9c6c-26a0fe7db04f
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c098589-1b77-4baf-89c7-d38c59b2b2a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c098589-1b77-4baf-89c7-d38c59b2b2a0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c098589-1b77-4baf-89c7-d38c59b2b2a0
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-c6b0a87d-8bd4-4b62-8ea2-1766c90ae527

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6b0a87d-8bd4-4b62-8ea2-1766c90ae527
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6b0a87d-8bd4-4b62-8ea2-1766c90ae527
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-a784d851-605c-461d-90b3-5fae02372563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a784d851-605c-461d-90b3-5fae02372563
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a784d851-605c-461d-90b3-5fae02372563
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-36909a71-cd5d-4523-a102-546444e6ddca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36909a71-cd5d-4523-a102-546444e6ddca
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-36909a71-cd5d-4523-a102-546444e6ddca
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-5157c272-ed02-4e96-9772-afd1f1a48903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5157c272-ed02-4e96-9772-afd1f1a48903
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5157c272-ed02-4e96-9772-afd1f1a48903
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-5538c2d7-f0aa-44af-92e3-ce3a10398566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5538c2d7-f0aa-44af-92e3-ce3a10398566
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5538c2d7-f0aa-44af-92e3-ce3a10398566
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac9efd4b-7a5d-41ce-aa11-2a3ecaf09536

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac9efd4b-7a5d-41ce-aa11-2a3ecaf09536
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac9efd4b-7a5d-41ce-aa11-2a3ecaf09536
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-aef30344-cfe6-42e0-aa6e-f42b4373b1f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aef30344-cfe6-42e0-aa6e-f42b4373b1f7
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-aef30344-cfe6-42e0-aa6e-f42b4373b1f7
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f1c531c-3392-43b1-9829-ab709de67ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1c531c-3392-43b1-9829-ab709de67ec5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f1c531c-3392-43b1-9829-ab709de67ec5
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-fed3f504-50fb-4818-8953-05afa1fbd465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed3f504-50fb-4818-8953-05afa1fbd465
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-fed3f504-50fb-4818-8953-05afa1fbd465
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-348b68cb-b529-4cc4-8937-6aae692a99c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-348b68cb-b529-4cc4-8937-6aae692a99c5
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-348b68cb-b529-4cc4-8937-6aae692a99c5
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e2dda2b-fbd6-46fe-84d2-3f1c31f4e44b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2dda2b-fbd6-46fe-84d2-3f1c31f4e44b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e2dda2b-fbd6-46fe-84d2-3f1c31f4e44b
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8ec331d-a9fe-4358-9465-38c78a26f8af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8ec331d-a9fe-4358-9465-38c78a26f8af
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8ec331d-a9fe-4358-9465-38c78a26f8af
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-770df036-2779-42c9-a986-0d013fb01ebc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-770df036-2779-42c9-a986-0d013fb01ebc
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-770df036-2779-42c9-a986-0d013fb01ebc
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec712ece-df42-44c8-af94-04be7ad89e02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec712ece-df42-44c8-af94-04be7ad89e02
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec712ece-df42-44c8-af94-04be7ad89e02
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5c35412-b9f6-433b-b43c-5b2c3ab37fd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5c35412-b9f6-433b-b43c-5b2c3ab37fd5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5c35412-b9f6-433b-b43c-5b2c3ab37fd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-83c586a2-a447-447a-b1e3-0d94a502d5ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83c586a2-a447-447a-b1e3-0d94a502d5ee
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-83c586a2-a447-447a-b1e3-0d94a502d5ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3817f66-6de4-4399-afe0-5a359f7cd566

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3817f66-6de4-4399-afe0-5a359f7cd566
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3817f66-6de4-4399-afe0-5a359f7cd566
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eb6a11d-817c-4e77-bb3d-335c132967af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb6a11d-817c-4e77-bb3d-335c132967af
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eb6a11d-817c-4e77-bb3d-335c132967af
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-3da13358-ef9d-465e-b9c7-c86f521ca364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da13358-ef9d-465e-b9c7-c86f521ca364
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3da13358-ef9d-465e-b9c7-c86f521ca364
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3da13358-ef9d-465e-b9c7-c86f521ca364"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-f945520d-3ad5-4a06-8f29-82a47401d2ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f945520d-3ad5-4a06-8f29-82a47401d2ca
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f945520d-3ad5-4a06-8f29-82a47401d2ca
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f945520d-3ad5-4a06-8f29-82a47401d2ca"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a0455e5-2210-45d4-9484-0bbb1cbf13ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a0455e5-2210-45d4-9484-0bbb1cbf13ba
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a0455e5-2210-45d4-9484-0bbb1cbf13ba
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1a0455e5-2210-45d4-9484-0bbb1cbf13ba"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-774294eb-c40a-42dc-808e-190e2a3c0dd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-774294eb-c40a-42dc-808e-190e2a3c0dd8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-774294eb-c40a-42dc-808e-190e2a3c0dd8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-774294eb-c40a-42dc-808e-190e2a3c0dd8"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-797a4624-57ab-4a7d-ab7f-226b162270e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-797a4624-57ab-4a7d-ab7f-226b162270e5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-797a4624-57ab-4a7d-ab7f-226b162270e5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-797a4624-57ab-4a7d-ab7f-226b162270e5"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca71acf9-fa86-4635-8b49-a6279156e9e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca71acf9-fa86-4635-8b49-a6279156e9e5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ca71acf9-fa86-4635-8b49-a6279156e9e5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ca71acf9-fa86-4635-8b49-a6279156e9e5"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-4195d869-8504-4fef-8604-60462e7a90b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4195d869-8504-4fef-8604-60462e7a90b2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4195d869-8504-4fef-8604-60462e7a90b2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4195d869-8504-4fef-8604-60462e7a90b2"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-26d547e0-f4d0-4648-a828-4ea0e0628f88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26d547e0-f4d0-4648-a828-4ea0e0628f88
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26d547e0-f4d0-4648-a828-4ea0e0628f88
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-26d547e0-f4d0-4648-a828-4ea0e0628f88"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-9927ad2e-d72e-4ad8-a044-1ff333216377

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9927ad2e-d72e-4ad8-a044-1ff333216377
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9927ad2e-d72e-4ad8-a044-1ff333216377
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9927ad2e-d72e-4ad8-a044-1ff333216377"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-832bc3c0-054a-4fb6-81d9-7c0f9cc1a5e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-832bc3c0-054a-4fb6-81d9-7c0f9cc1a5e5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-832bc3c0-054a-4fb6-81d9-7c0f9cc1a5e5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-832bc3c0-054a-4fb6-81d9-7c0f9cc1a5e5"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e34301c-3eea-4af1-b067-581c8ba16b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e34301c-3eea-4af1-b067-581c8ba16b10
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e34301c-3eea-4af1-b067-581c8ba16b10
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3e34301c-3eea-4af1-b067-581c8ba16b10"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-623a8c98-77b9-43a1-94df-f6a0a6e024c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-623a8c98-77b9-43a1-94df-f6a0a6e024c3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-623a8c98-77b9-43a1-94df-f6a0a6e024c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-623a8c98-77b9-43a1-94df-f6a0a6e024c3"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-438d27e0-6f7b-4848-97e7-788f0b3a01e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438d27e0-6f7b-4848-97e7-788f0b3a01e0
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-438d27e0-6f7b-4848-97e7-788f0b3a01e0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-438d27e0-6f7b-4848-97e7-788f0b3a01e0"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-56ca9d46-327c-4b6d-a5df-5750c15a01ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56ca9d46-327c-4b6d-a5df-5750c15a01ff
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56ca9d46-327c-4b6d-a5df-5750c15a01ff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-56ca9d46-327c-4b6d-a5df-5750c15a01ff"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac005ff9-c8d1-467a-89c0-08f162c4e82c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac005ff9-c8d1-467a-89c0-08f162c4e82c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac005ff9-c8d1-467a-89c0-08f162c4e82c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ac005ff9-c8d1-467a-89c0-08f162c4e82c"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-f658e7e1-1b74-4e0d-91a6-673b8562f079

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f658e7e1-1b74-4e0d-91a6-673b8562f079
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f658e7e1-1b74-4e0d-91a6-673b8562f079
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f658e7e1-1b74-4e0d-91a6-673b8562f079"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8567a99-58ca-47be-a90d-be6cbf026eaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8567a99-58ca-47be-a90d-be6cbf026eaa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8567a99-58ca-47be-a90d-be6cbf026eaa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e8567a99-58ca-47be-a90d-be6cbf026eaa"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-23e00043-bf4b-44a9-8063-d9cce50cfc37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e00043-bf4b-44a9-8063-d9cce50cfc37
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23e00043-bf4b-44a9-8063-d9cce50cfc37
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-23e00043-bf4b-44a9-8063-d9cce50cfc37"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-471ca7a5-8f38-409f-b009-d079f5e67cca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-471ca7a5-8f38-409f-b009-d079f5e67cca
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-471ca7a5-8f38-409f-b009-d079f5e67cca
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

{"id":"acc_065ae77f-9b25-4b93-a2e1-8db1a42465d9","handle":"qa-0f05662b83e2","displayName":"QA 0f05662b83e2","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.866926455Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79a0f537-6898-4276-b1f4-60db8721a4c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79a0f537-6898-4276-b1f4-60db8721a4c6
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79a0f537-6898-4276-b1f4-60db8721a4c6
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-a034e3c8-fcbd-4242-b7b9-c1fb11a01851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a034e3c8-fcbd-4242-b7b9-c1fb11a01851
Content-Type: application/json

--- request body ---
{"handle":"qa-0f05662b83e2","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a034e3c8-fcbd-4242-b7b9-c1fb11a01851
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a034e3c8-fcbd-4242-b7b9-c1fb11a01851"}
```
