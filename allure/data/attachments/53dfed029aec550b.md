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
| 1 | `POST /v1/accounts` | 201 | 461 | `qa-f5398142-6075-4856-a4c3-573bf8a29985` |
| 2 | `POST /v1/auth/token` | 200 | 99 | `qa-e0906fa2-0927-449c-b6fc-aeeee8500b3d` |
| 3 | `GET /v1/accounts/me` | 200 | 78 | `qa-b1ed0de3-4411-42fa-91b1-eee52162d87a` |
| 4 | `GET /v1/accounts/me` | 200 | 21 | `qa-18755f60-f9f8-4bb0-843f-8c2d1b50e4df` |
| 5 | `GET /v1/accounts/me` | 200 | 16 | `qa-88e968f9-3707-4a75-8b1c-0feb3c661aa5` |
| 6 | `GET /v1/accounts/me` | 200 | 8 | `qa-ec350d4a-dd6a-4891-985e-7e9bd296f8d7` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-6d49d1d0-31fc-43ec-8ea7-ad7f69252a0d` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-13e0b9a0-9695-4a3b-ab32-c4f02cecb073` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-ba9d3cf6-05f6-47ff-8b15-80638bdb6d6f` |
| 10 | `GET /v1/accounts/me` | 200 | 11 | `qa-5a7696cf-a8d5-4a6c-89ea-e5d84f7df68f` |
| 11 | `GET /v1/accounts/me` | 200 | 7 | `qa-e33d4ab6-d538-42bd-b4c7-5862d2e6eb00` |
| 12 | `GET /v1/accounts/me` | 200 | 8 | `qa-b898f72b-18e8-4695-8d21-d8fcd3eec765` |
| 13 | `GET /v1/accounts/me` | 200 | 8 | `qa-84f440f1-2569-42ac-a6fb-27cf328dfca4` |
| 14 | `GET /v1/accounts/me` | 200 | 8 | `qa-e2e4d147-dc1c-4778-b569-e4cbd7d09358` |
| 15 | `GET /v1/accounts/me` | 200 | 10 | `qa-617a1c82-f18d-452a-aea7-dbecf21d6498` |
| 16 | `GET /v1/accounts/me` | 200 | 15 | `qa-7d2e9ea0-6876-4fbc-8be2-2fd1d885b035` |
| 17 | `GET /v1/accounts/me` | 200 | 7 | `qa-f46d4c6d-46c7-47c2-9dc2-992763b6f714` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-7f673ed6-bc57-4bdc-b58a-d8e66e7afb76` |
| 19 | `GET /v1/accounts/me` | 200 | 16 | `qa-ef08992e-0387-47f1-adc4-fc0d804bef9e` |
| 20 | `GET /v1/accounts/me` | 200 | 8 | `qa-9312e483-800f-43a6-b519-651704eaab0a` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-2dafa969-406b-4dd6-a234-de25d9a82bd1` |
| 22 | `GET /v1/accounts/me` | 200 | 7 | `qa-8ec43810-6ba0-4a39-9124-6822104dc8c7` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-56f5c8cd-be40-4a7a-9311-047dd284859f` |
| 24 | `GET /v1/accounts/me` | 200 | 10 | `qa-80a9cbcd-28c5-45e6-9b40-0953f74f52a0` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-34d37f2d-e1ee-4a4a-bd0c-418baa711169` |
| 26 | `GET /v1/accounts/me` | 200 | 19 | `qa-8cacb91c-120d-41ff-b1ff-44fad9b90ff8` |
| 27 | `GET /v1/accounts/me` | 200 | 12 | `qa-00ec3406-e843-4488-84fe-dac3b4b73df4` |
| 28 | `GET /v1/accounts/me` | 200 | 11 | `qa-b49705fe-9841-416c-b3b2-93beef5a7cfd` |
| 29 | `GET /v1/accounts/me` | 200 | 11 | `qa-3f9d05d4-d3f8-4794-a67f-487c7ac8a8de` |
| 30 | `GET /v1/accounts/me` | 200 | 13 | `qa-18961528-9976-43c9-a941-ff886f899e7f` |
| 31 | `GET /v1/accounts/me` | 200 | 16 | `qa-5fe850f2-00f0-4fd9-8619-80290436c415` |
| 32 | `GET /v1/accounts/me` | 200 | 12 | `qa-368f5f83-3ff4-4dec-acd0-a468f63160aa` |
| 33 | `GET /v1/accounts/me` | 200 | 14 | `qa-4955f7d1-3e10-4ab9-9bb3-d4117b0b2cd1` |
| 34 | `GET /v1/accounts/me` | 200 | 15 | `qa-52989e24-3569-4bab-b2b0-7d8587dcde40` |
| 35 | `GET /v1/accounts/me` | 200 | 12 | `qa-2aabdc49-e3dd-43a7-aafa-1d7918542840` |
| 36 | `GET /v1/accounts/me` | 200 | 14 | `qa-0a8576eb-e45e-4df2-b129-a5a8be8c6b02` |
| 37 | `GET /v1/accounts/me` | 200 | 11 | `qa-41c2a324-ff45-4849-b520-7b426d6a2422` |
| 38 | `GET /v1/accounts/me` | 200 | 14 | `qa-b86ce696-93d6-4c3a-96f9-56dbed54fa9a` |
| 39 | `GET /v1/accounts/me` | 200 | 15 | `qa-e3d82688-c193-4288-9c0a-891f31276a50` |
| 40 | `GET /v1/accounts/me` | 200 | 14 | `qa-f9eeef23-a63a-4afe-b633-fc8be4d5732c` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-36b18079-8382-4549-8384-06da39def221` |
| 42 | `GET /v1/accounts/me` | 200 | 5 | `qa-b5730b12-002a-4e6b-a758-6bdc4b6b1e23` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-0be12bc0-a0f0-4aa5-826a-afd55b8aff3f` |
| 44 | `GET /v1/accounts/me` | 200 | 11 | `qa-fe182d22-1ec3-4319-b5c7-24102fe7cafa` |
| 45 | `GET /v1/accounts/me` | 200 | 4 | `qa-bd0610fd-2177-47b8-81c5-4d3831ed3021` |
| 46 | `GET /v1/accounts/me` | 200 | 4 | `qa-3e7a3fc0-eaf4-43ee-a7cb-210fbeecacf8` |
| 47 | `GET /v1/accounts/me` | 200 | 5 | `qa-f6c34e88-25d6-48fb-84e2-eb6815f0cc82` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-1365e858-4a97-45c9-8f9b-9721b34aaf7c` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-e0429803-f3a4-4c8c-a308-17bdf7439428` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-276a61ff-c7d1-497d-8ac1-8a4ede684492` |
| 51 | `GET /v1/accounts/me` | 200 | 5 | `qa-8d43dc5d-20c2-480e-b09c-aaaef2c9e29f` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-17cb2cc0-ea80-4e60-b2de-022d1ab4939c` |
| 53 | `GET /v1/accounts/me` | 200 | 4 | `qa-ea8c675b-c0cd-4b5e-94bb-8900592d1095` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-e0727842-3924-4b24-aacc-eca34b2ae3fc` |
| 55 | `GET /v1/accounts/me` | 200 | 5 | `qa-db0b3bd8-392e-4208-895b-b1f0698876eb` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-ad519da5-05e0-4d42-8443-f84d4a3546ef` |
| 57 | `GET /v1/accounts/me` | 200 | 4 | `qa-80c6c1fd-dcef-4750-ba88-2bd42ec1bcda` |
| 58 | `GET /v1/accounts/me` | 200 | 3 | `qa-9df39b0c-03bd-4aec-93f9-1646c7376ba8` |
| 59 | `GET /v1/accounts/me` | 200 | 3 | `qa-a3be8559-1e8e-4d35-86fa-27d8c7b2d7e8` |
| 60 | `GET /v1/accounts/me` | 200 | 3 | `qa-dea34d24-2d47-4402-acb1-09b644a25c00` |
| 61 | `GET /v1/accounts/me` | 200 | 4 | `qa-21a64caa-b25f-41c5-a54c-92af104af815` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-20b7689e-e233-44e0-b2c9-5a634db90cbd` |
| 63 | `GET /v1/accounts/me` | 429 | 4 | `qa-1314cad4-d143-4fad-a067-ed6760d2ec4b` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-5a69c4a7-8465-43dc-b2e7-77b2f62bce73` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-01ebead8-44bf-4564-a65b-6067a71f4890` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-e9de5ebb-973f-4767-89a3-35259361ee59` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-176be31d-6c3e-4e98-b871-996da50e5446` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-5f163b71-a218-4721-839f-faab3bd2b954` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-6b91bdba-1c86-421e-a012-7dab437385a2` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-44158169-f46c-4800-9bc5-08b3032fb75c` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-cc1e5046-bf27-4076-91b2-f125bbf5e5a7` |
| 72 | `GET /v1/accounts/me` | 429 | 5 | `qa-60e76c0b-e877-4e5c-9180-42be600e4435` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-22e57133-c71c-4fbd-80e6-03232f7ffd63` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-d5652c42-d6fd-4f4d-91a5-985d93276930` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-53031818-ab89-41e8-bbe7-19e885aaf272` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-2502f350-344d-4d38-9604-8008ee400984` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-f02e7b0b-9c55-4ff5-87c3-03fdd0da8f1a` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-3de2605c-7075-445a-8292-5918ab81331c` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-276bdd0b-8212-46a3-8d1d-3de1966ccb29` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-5778738e-555f-4acf-a9f2-db99c93fa8c3` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-01a2d76a-3585-4e3c-8aba-73db1566a66a` |
| 82 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e8706195-77cb-4096-8d7e-c71a0d9a91ca` |
| 83 | `POST /v1/auth/token` | 401 | 7 | `qa-45bd2268-ddd9-4432-86ef-570a8bff50df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f5398142-6075-4856-a4c3-573bf8a29985

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5398142-6075-4856-a4c3-573bf8a29985
Content-Type: application/json

--- request body ---
{"handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","password":"****","region":"eu"}

--- response: 201 in 461 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5398142-6075-4856-a4c3-573bf8a29985
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
Location: /v1/accounts/qa-3b182d4645b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e0906fa2-0927-449c-b6fc-aeeee8500b3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0906fa2-0927-449c-b6fc-aeeee8500b3d
Content-Type: application/json

--- request body ---
{"handle":"qa-3b182d4645b9","password":"****"}

--- response: 200 in 99 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0906fa2-0927-449c-b6fc-aeeee8500b3d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1ed0de3-4411-42fa-91b1-eee52162d87a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1ed0de3-4411-42fa-91b1-eee52162d87a
Content-Type: application/json

--- response: 200 in 78 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1ed0de3-4411-42fa-91b1-eee52162d87a
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-18755f60-f9f8-4bb0-843f-8c2d1b50e4df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18755f60-f9f8-4bb0-843f-8c2d1b50e4df
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-18755f60-f9f8-4bb0-843f-8c2d1b50e4df
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-88e968f9-3707-4a75-8b1c-0feb3c661aa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88e968f9-3707-4a75-8b1c-0feb3c661aa5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-88e968f9-3707-4a75-8b1c-0feb3c661aa5
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec350d4a-dd6a-4891-985e-7e9bd296f8d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec350d4a-dd6a-4891-985e-7e9bd296f8d7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec350d4a-dd6a-4891-985e-7e9bd296f8d7
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d49d1d0-31fc-43ec-8ea7-ad7f69252a0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d49d1d0-31fc-43ec-8ea7-ad7f69252a0d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d49d1d0-31fc-43ec-8ea7-ad7f69252a0d
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-13e0b9a0-9695-4a3b-ab32-c4f02cecb073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13e0b9a0-9695-4a3b-ab32-c4f02cecb073
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-13e0b9a0-9695-4a3b-ab32-c4f02cecb073
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba9d3cf6-05f6-47ff-8b15-80638bdb6d6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba9d3cf6-05f6-47ff-8b15-80638bdb6d6f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba9d3cf6-05f6-47ff-8b15-80638bdb6d6f
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a7696cf-a8d5-4a6c-89ea-e5d84f7df68f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a7696cf-a8d5-4a6c-89ea-e5d84f7df68f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a7696cf-a8d5-4a6c-89ea-e5d84f7df68f
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-e33d4ab6-d538-42bd-b4c7-5862d2e6eb00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e33d4ab6-d538-42bd-b4c7-5862d2e6eb00
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e33d4ab6-d538-42bd-b4c7-5862d2e6eb00
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-b898f72b-18e8-4695-8d21-d8fcd3eec765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b898f72b-18e8-4695-8d21-d8fcd3eec765
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b898f72b-18e8-4695-8d21-d8fcd3eec765
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-84f440f1-2569-42ac-a6fb-27cf328dfca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84f440f1-2569-42ac-a6fb-27cf328dfca4
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-84f440f1-2569-42ac-a6fb-27cf328dfca4
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-e2e4d147-dc1c-4778-b569-e4cbd7d09358

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2e4d147-dc1c-4778-b569-e4cbd7d09358
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2e4d147-dc1c-4778-b569-e4cbd7d09358
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-617a1c82-f18d-452a-aea7-dbecf21d6498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-617a1c82-f18d-452a-aea7-dbecf21d6498
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-617a1c82-f18d-452a-aea7-dbecf21d6498
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d2e9ea0-6876-4fbc-8be2-2fd1d885b035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d2e9ea0-6876-4fbc-8be2-2fd1d885b035
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d2e9ea0-6876-4fbc-8be2-2fd1d885b035
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-f46d4c6d-46c7-47c2-9dc2-992763b6f714

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f46d4c6d-46c7-47c2-9dc2-992763b6f714
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-f46d4c6d-46c7-47c2-9dc2-992763b6f714
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f673ed6-bc57-4bdc-b58a-d8e66e7afb76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f673ed6-bc57-4bdc-b58a-d8e66e7afb76
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f673ed6-bc57-4bdc-b58a-d8e66e7afb76
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef08992e-0387-47f1-adc4-fc0d804bef9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef08992e-0387-47f1-adc4-fc0d804bef9e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef08992e-0387-47f1-adc4-fc0d804bef9e
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-9312e483-800f-43a6-b519-651704eaab0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9312e483-800f-43a6-b519-651704eaab0a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-9312e483-800f-43a6-b519-651704eaab0a
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-2dafa969-406b-4dd6-a234-de25d9a82bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dafa969-406b-4dd6-a234-de25d9a82bd1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dafa969-406b-4dd6-a234-de25d9a82bd1
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ec43810-6ba0-4a39-9124-6822104dc8c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ec43810-6ba0-4a39-9124-6822104dc8c7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ec43810-6ba0-4a39-9124-6822104dc8c7
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-56f5c8cd-be40-4a7a-9311-047dd284859f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56f5c8cd-be40-4a7a-9311-047dd284859f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-56f5c8cd-be40-4a7a-9311-047dd284859f
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-80a9cbcd-28c5-45e6-9b40-0953f74f52a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a9cbcd-28c5-45e6-9b40-0953f74f52a0
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-80a9cbcd-28c5-45e6-9b40-0953f74f52a0
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-34d37f2d-e1ee-4a4a-bd0c-418baa711169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34d37f2d-e1ee-4a4a-bd0c-418baa711169
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-34d37f2d-e1ee-4a4a-bd0c-418baa711169
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cacb91c-120d-41ff-b1ff-44fad9b90ff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cacb91c-120d-41ff-b1ff-44fad9b90ff8
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cacb91c-120d-41ff-b1ff-44fad9b90ff8
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-00ec3406-e843-4488-84fe-dac3b4b73df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00ec3406-e843-4488-84fe-dac3b4b73df4
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-00ec3406-e843-4488-84fe-dac3b4b73df4
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-b49705fe-9841-416c-b3b2-93beef5a7cfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b49705fe-9841-416c-b3b2-93beef5a7cfd
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b49705fe-9841-416c-b3b2-93beef5a7cfd
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f9d05d4-d3f8-4794-a67f-487c7ac8a8de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f9d05d4-d3f8-4794-a67f-487c7ac8a8de
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f9d05d4-d3f8-4794-a67f-487c7ac8a8de
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-18961528-9976-43c9-a941-ff886f899e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18961528-9976-43c9-a941-ff886f899e7f
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-18961528-9976-43c9-a941-ff886f899e7f
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-5fe850f2-00f0-4fd9-8619-80290436c415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fe850f2-00f0-4fd9-8619-80290436c415
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fe850f2-00f0-4fd9-8619-80290436c415
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-368f5f83-3ff4-4dec-acd0-a468f63160aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-368f5f83-3ff4-4dec-acd0-a468f63160aa
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-368f5f83-3ff4-4dec-acd0-a468f63160aa
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-4955f7d1-3e10-4ab9-9bb3-d4117b0b2cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4955f7d1-3e10-4ab9-9bb3-d4117b0b2cd1
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4955f7d1-3e10-4ab9-9bb3-d4117b0b2cd1
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-52989e24-3569-4bab-b2b0-7d8587dcde40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52989e24-3569-4bab-b2b0-7d8587dcde40
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-52989e24-3569-4bab-b2b0-7d8587dcde40
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-2aabdc49-e3dd-43a7-aafa-1d7918542840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aabdc49-e3dd-43a7-aafa-1d7918542840
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aabdc49-e3dd-43a7-aafa-1d7918542840
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a8576eb-e45e-4df2-b129-a5a8be8c6b02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a8576eb-e45e-4df2-b129-a5a8be8c6b02
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a8576eb-e45e-4df2-b129-a5a8be8c6b02
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-41c2a324-ff45-4849-b520-7b426d6a2422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41c2a324-ff45-4849-b520-7b426d6a2422
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-41c2a324-ff45-4849-b520-7b426d6a2422
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-b86ce696-93d6-4c3a-96f9-56dbed54fa9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b86ce696-93d6-4c3a-96f9-56dbed54fa9a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-b86ce696-93d6-4c3a-96f9-56dbed54fa9a
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3d82688-c193-4288-9c0a-891f31276a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d82688-c193-4288-9c0a-891f31276a50
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3d82688-c193-4288-9c0a-891f31276a50
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-f9eeef23-a63a-4afe-b633-fc8be4d5732c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9eeef23-a63a-4afe-b633-fc8be4d5732c
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9eeef23-a63a-4afe-b633-fc8be4d5732c
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-36b18079-8382-4549-8384-06da39def221

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36b18079-8382-4549-8384-06da39def221
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-36b18079-8382-4549-8384-06da39def221
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5730b12-002a-4e6b-a758-6bdc4b6b1e23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5730b12-002a-4e6b-a758-6bdc4b6b1e23
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5730b12-002a-4e6b-a758-6bdc4b6b1e23
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-0be12bc0-a0f0-4aa5-826a-afd55b8aff3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0be12bc0-a0f0-4aa5-826a-afd55b8aff3f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-0be12bc0-a0f0-4aa5-826a-afd55b8aff3f
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-fe182d22-1ec3-4319-b5c7-24102fe7cafa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe182d22-1ec3-4319-b5c7-24102fe7cafa
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe182d22-1ec3-4319-b5c7-24102fe7cafa
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd0610fd-2177-47b8-81c5-4d3831ed3021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0610fd-2177-47b8-81c5-4d3831ed3021
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd0610fd-2177-47b8-81c5-4d3831ed3021
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e7a3fc0-eaf4-43ee-a7cb-210fbeecacf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e7a3fc0-eaf4-43ee-a7cb-210fbeecacf8
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e7a3fc0-eaf4-43ee-a7cb-210fbeecacf8
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6c34e88-25d6-48fb-84e2-eb6815f0cc82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c34e88-25d6-48fb-84e2-eb6815f0cc82
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c34e88-25d6-48fb-84e2-eb6815f0cc82
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-1365e858-4a97-45c9-8f9b-9721b34aaf7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1365e858-4a97-45c9-8f9b-9721b34aaf7c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-1365e858-4a97-45c9-8f9b-9721b34aaf7c
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0429803-f3a4-4c8c-a308-17bdf7439428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0429803-f3a4-4c8c-a308-17bdf7439428
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0429803-f3a4-4c8c-a308-17bdf7439428
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-276a61ff-c7d1-497d-8ac1-8a4ede684492

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-276a61ff-c7d1-497d-8ac1-8a4ede684492
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-276a61ff-c7d1-497d-8ac1-8a4ede684492
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d43dc5d-20c2-480e-b09c-aaaef2c9e29f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d43dc5d-20c2-480e-b09c-aaaef2c9e29f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d43dc5d-20c2-480e-b09c-aaaef2c9e29f
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-17cb2cc0-ea80-4e60-b2de-022d1ab4939c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17cb2cc0-ea80-4e60-b2de-022d1ab4939c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-17cb2cc0-ea80-4e60-b2de-022d1ab4939c
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-ea8c675b-c0cd-4b5e-94bb-8900592d1095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea8c675b-c0cd-4b5e-94bb-8900592d1095
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea8c675b-c0cd-4b5e-94bb-8900592d1095
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0727842-3924-4b24-aacc-eca34b2ae3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0727842-3924-4b24-aacc-eca34b2ae3fc
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0727842-3924-4b24-aacc-eca34b2ae3fc
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-db0b3bd8-392e-4208-895b-b1f0698876eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db0b3bd8-392e-4208-895b-b1f0698876eb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-db0b3bd8-392e-4208-895b-b1f0698876eb
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad519da5-05e0-4d42-8443-f84d4a3546ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad519da5-05e0-4d42-8443-f84d4a3546ef
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad519da5-05e0-4d42-8443-f84d4a3546ef
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-80c6c1fd-dcef-4750-ba88-2bd42ec1bcda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80c6c1fd-dcef-4750-ba88-2bd42ec1bcda
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-80c6c1fd-dcef-4750-ba88-2bd42ec1bcda
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-9df39b0c-03bd-4aec-93f9-1646c7376ba8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9df39b0c-03bd-4aec-93f9-1646c7376ba8
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-9df39b0c-03bd-4aec-93f9-1646c7376ba8
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3be8559-1e8e-4d35-86fa-27d8c7b2d7e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3be8559-1e8e-4d35-86fa-27d8c7b2d7e8
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3be8559-1e8e-4d35-86fa-27d8c7b2d7e8
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-dea34d24-2d47-4402-acb1-09b644a25c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea34d24-2d47-4402-acb1-09b644a25c00
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-dea34d24-2d47-4402-acb1-09b644a25c00
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-21a64caa-b25f-41c5-a54c-92af104af815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21a64caa-b25f-41c5-a54c-92af104af815
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-21a64caa-b25f-41c5-a54c-92af104af815
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-20b7689e-e233-44e0-b2c9-5a634db90cbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b7689e-e233-44e0-b2c9-5a634db90cbd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-20b7689e-e233-44e0-b2c9-5a634db90cbd
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-1314cad4-d143-4fad-a067-ed6760d2ec4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1314cad4-d143-4fad-a067-ed6760d2ec4b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1314cad4-d143-4fad-a067-ed6760d2ec4b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1314cad4-d143-4fad-a067-ed6760d2ec4b"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a69c4a7-8465-43dc-b2e7-77b2f62bce73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a69c4a7-8465-43dc-b2e7-77b2f62bce73
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a69c4a7-8465-43dc-b2e7-77b2f62bce73
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5a69c4a7-8465-43dc-b2e7-77b2f62bce73"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-01ebead8-44bf-4564-a65b-6067a71f4890

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ebead8-44bf-4564-a65b-6067a71f4890
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ebead8-44bf-4564-a65b-6067a71f4890
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-01ebead8-44bf-4564-a65b-6067a71f4890"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9de5ebb-973f-4767-89a3-35259361ee59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9de5ebb-973f-4767-89a3-35259361ee59
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9de5ebb-973f-4767-89a3-35259361ee59
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e9de5ebb-973f-4767-89a3-35259361ee59"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-176be31d-6c3e-4e98-b871-996da50e5446

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176be31d-6c3e-4e98-b871-996da50e5446
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-176be31d-6c3e-4e98-b871-996da50e5446
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-176be31d-6c3e-4e98-b871-996da50e5446"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-5f163b71-a218-4721-839f-faab3bd2b954

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f163b71-a218-4721-839f-faab3bd2b954
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f163b71-a218-4721-839f-faab3bd2b954
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5f163b71-a218-4721-839f-faab3bd2b954"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b91bdba-1c86-421e-a012-7dab437385a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b91bdba-1c86-421e-a012-7dab437385a2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6b91bdba-1c86-421e-a012-7dab437385a2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6b91bdba-1c86-421e-a012-7dab437385a2"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-44158169-f46c-4800-9bc5-08b3032fb75c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44158169-f46c-4800-9bc5-08b3032fb75c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44158169-f46c-4800-9bc5-08b3032fb75c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-44158169-f46c-4800-9bc5-08b3032fb75c"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc1e5046-bf27-4076-91b2-f125bbf5e5a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc1e5046-bf27-4076-91b2-f125bbf5e5a7
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc1e5046-bf27-4076-91b2-f125bbf5e5a7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cc1e5046-bf27-4076-91b2-f125bbf5e5a7"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-60e76c0b-e877-4e5c-9180-42be600e4435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60e76c0b-e877-4e5c-9180-42be600e4435
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60e76c0b-e877-4e5c-9180-42be600e4435
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60e76c0b-e877-4e5c-9180-42be600e4435"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-22e57133-c71c-4fbd-80e6-03232f7ffd63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22e57133-c71c-4fbd-80e6-03232f7ffd63
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22e57133-c71c-4fbd-80e6-03232f7ffd63
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-22e57133-c71c-4fbd-80e6-03232f7ffd63"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5652c42-d6fd-4f4d-91a5-985d93276930

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5652c42-d6fd-4f4d-91a5-985d93276930
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5652c42-d6fd-4f4d-91a5-985d93276930
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d5652c42-d6fd-4f4d-91a5-985d93276930"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-53031818-ab89-41e8-bbe7-19e885aaf272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53031818-ab89-41e8-bbe7-19e885aaf272
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-53031818-ab89-41e8-bbe7-19e885aaf272
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-53031818-ab89-41e8-bbe7-19e885aaf272"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-2502f350-344d-4d38-9604-8008ee400984

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2502f350-344d-4d38-9604-8008ee400984
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2502f350-344d-4d38-9604-8008ee400984
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2502f350-344d-4d38-9604-8008ee400984"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-f02e7b0b-9c55-4ff5-87c3-03fdd0da8f1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02e7b0b-9c55-4ff5-87c3-03fdd0da8f1a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f02e7b0b-9c55-4ff5-87c3-03fdd0da8f1a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f02e7b0b-9c55-4ff5-87c3-03fdd0da8f1a"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-3de2605c-7075-445a-8292-5918ab81331c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de2605c-7075-445a-8292-5918ab81331c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3de2605c-7075-445a-8292-5918ab81331c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3de2605c-7075-445a-8292-5918ab81331c"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-276bdd0b-8212-46a3-8d1d-3de1966ccb29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-276bdd0b-8212-46a3-8d1d-3de1966ccb29
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-276bdd0b-8212-46a3-8d1d-3de1966ccb29
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-276bdd0b-8212-46a3-8d1d-3de1966ccb29"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-5778738e-555f-4acf-a9f2-db99c93fa8c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5778738e-555f-4acf-a9f2-db99c93fa8c3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5778738e-555f-4acf-a9f2-db99c93fa8c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5778738e-555f-4acf-a9f2-db99c93fa8c3"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-01a2d76a-3585-4e3c-8aba-73db1566a66a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01a2d76a-3585-4e3c-8aba-73db1566a66a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-01a2d76a-3585-4e3c-8aba-73db1566a66a
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

{"id":"acc_d1b1d037-a925-493e-8d25-5e75d26bbce8","handle":"qa-3b182d4645b9","displayName":"QA 3b182d4645b9","region":"eu","role":"user","createdAt":"2026-11-28T10:37:16.553949923Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8706195-77cb-4096-8d7e-c71a0d9a91ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8706195-77cb-4096-8d7e-c71a0d9a91ca
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 28 Nov 2026 10:37:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8706195-77cb-4096-8d7e-c71a0d9a91ca
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
correlation: qa-45bd2268-ddd9-4432-86ef-570a8bff50df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45bd2268-ddd9-4432-86ef-570a8bff50df
Content-Type: application/json

--- request body ---
{"handle":"qa-3b182d4645b9","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45bd2268-ddd9-4432-86ef-570a8bff50df
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45bd2268-ddd9-4432-86ef-570a8bff50df"}
```
