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
| 1 | `POST /v1/accounts` | 201 | 311 | `qa-4f8e68a9-21e6-4770-bb8a-b5d78411eaba` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-5b7d2235-29c1-4513-8a5f-9d4777240eee` |
| 3 | `GET /v1/accounts/me` | 200 | 55 | `qa-ed871b1f-2890-49c3-ba16-5d2631c94f8c` |
| 4 | `GET /v1/accounts/me` | 200 | 21 | `qa-b830450b-072e-4e8e-964d-f55ef8ac4fb4` |
| 5 | `GET /v1/accounts/me` | 200 | 10 | `qa-137dfe9f-00b9-43e5-a4f1-11c629a232e1` |
| 6 | `GET /v1/accounts/me` | 200 | 9 | `qa-d553ea28-c5dd-4bec-b832-873a915ccd7d` |
| 7 | `GET /v1/accounts/me` | 200 | 9 | `qa-7432caab-555b-43fb-b6a1-6230aba98606` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-e0433b69-9c4d-4600-8579-abcce489d6db` |
| 9 | `GET /v1/accounts/me` | 200 | 10 | `qa-9f5fa1bc-bb92-4dea-beca-4c351e48480c` |
| 10 | `GET /v1/accounts/me` | 200 | 7 | `qa-64228e8d-5d9b-46ce-b7b8-50e67081959d` |
| 11 | `GET /v1/accounts/me` | 200 | 6 | `qa-1914d4cf-0dbe-4648-b407-6ed94d7eadd3` |
| 12 | `GET /v1/accounts/me` | 200 | 5 | `qa-33d8ad66-fdb0-4079-a5c7-06f2a3d8f661` |
| 13 | `GET /v1/accounts/me` | 200 | 5 | `qa-16d61e7a-6b5f-4306-a010-f55added90ff` |
| 14 | `GET /v1/accounts/me` | 200 | 5 | `qa-0f57ab0d-a72a-4a95-8230-4c6ce9d3c46a` |
| 15 | `GET /v1/accounts/me` | 200 | 5 | `qa-be9d9e83-6b07-4ce0-a9d2-f7742dbd6465` |
| 16 | `GET /v1/accounts/me` | 200 | 6 | `qa-dd6df298-f7c8-40e3-b5ce-4294da1ebf03` |
| 17 | `GET /v1/accounts/me` | 200 | 13 | `qa-15001084-ff8f-459e-b96e-2804099f90ee` |
| 18 | `GET /v1/accounts/me` | 200 | 5 | `qa-30103243-1201-446a-9be3-c519c6f5825f` |
| 19 | `GET /v1/accounts/me` | 200 | 8 | `qa-fdc44076-ce94-4fd5-818c-bd9cbdf1b07c` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-b86bf891-4666-441f-850f-060f31d99f08` |
| 21 | `GET /v1/accounts/me` | 200 | 5 | `qa-1277de4f-44c2-42bf-a6b4-8ca6da4a44e4` |
| 22 | `GET /v1/accounts/me` | 200 | 6 | `qa-b96de7a1-91d4-4c04-a22c-4e84208f3f6c` |
| 23 | `GET /v1/accounts/me` | 200 | 5 | `qa-0b06cdc3-fb7a-4e98-9acd-ab24c0308f79` |
| 24 | `GET /v1/accounts/me` | 200 | 4 | `qa-58f8081b-a570-4cd5-9230-16d9bd211a56` |
| 25 | `GET /v1/accounts/me` | 200 | 4 | `qa-b25edbd9-b5ef-454a-94f1-4e41cdbc4a5a` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-1538b419-acfb-4d4e-82ef-ad9059739000` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-b1a57ffe-2ac6-43f7-81d9-774afa140ad4` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-b8a02ecb-7e06-4fef-a7ab-9590ca439701` |
| 29 | `GET /v1/accounts/me` | 200 | 8 | `qa-3c23653e-9b66-4770-b9f8-ffdc3322411d` |
| 30 | `GET /v1/accounts/me` | 200 | 5 | `qa-8ad4cb33-9505-4e0c-8a3e-0e8163ee72b3` |
| 31 | `GET /v1/accounts/me` | 200 | 8 | `qa-c702749f-3590-4d96-9eda-9951e8f6ebda` |
| 32 | `GET /v1/accounts/me` | 200 | 6 | `qa-bc8ec8fb-0f90-45db-b5ea-e673fc73d114` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-943baab1-e335-410d-b216-fa00c4c4b791` |
| 34 | `GET /v1/accounts/me` | 200 | 13 | `qa-eb22ec24-6f0c-4893-9d3e-be944aa45881` |
| 35 | `GET /v1/accounts/me` | 200 | 5 | `qa-a871f0cf-e77a-4a7c-b44a-d204360ce0b0` |
| 36 | `GET /v1/accounts/me` | 200 | 7 | `qa-ec6470b2-2e4a-46bb-8dc2-32bd8ac17ce8` |
| 37 | `GET /v1/accounts/me` | 200 | 8 | `qa-71c29b3c-e33b-4132-8b12-b4528c8a7406` |
| 38 | `GET /v1/accounts/me` | 200 | 4 | `qa-81b74e33-5fab-4fcb-87a7-26338e3af58e` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-60393658-db55-468a-b861-bb86ecec9553` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-d6dd97e1-7d5d-4765-adfe-4b2811c42904` |
| 41 | `GET /v1/accounts/me` | 200 | 4 | `qa-cef0cfcb-a1e1-4604-a89a-d4dff4d8e7f3` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-60908550-2bc6-4605-9411-0c911fc16f19` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-b58d1644-fd9d-4671-9154-18af207a885e` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-53fa0f02-f1e0-47bb-93da-69c2aec6bde5` |
| 45 | `GET /v1/accounts/me` | 200 | 4 | `qa-5c4dea0c-aae5-4b4d-9f15-5559552fbf19` |
| 46 | `GET /v1/accounts/me` | 200 | 3 | `qa-9fddaa75-0f40-4f57-b2ca-8b68e5f341b3` |
| 47 | `GET /v1/accounts/me` | 200 | 19 | `qa-908756b9-2441-4349-b691-dd0928318d0d` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-ffb6f022-436d-43d0-a595-7ee7b241dd2b` |
| 49 | `GET /v1/accounts/me` | 200 | 7 | `qa-1cbfde4e-05ff-4d55-b9c1-eb784393fba3` |
| 50 | `GET /v1/accounts/me` | 200 | 4 | `qa-2b4acd86-be90-43e1-b817-91718ff671cd` |
| 51 | `GET /v1/accounts/me` | 200 | 3 | `qa-c353cdca-e53b-4c70-af6c-b0f41f9ba0fb` |
| 52 | `GET /v1/accounts/me` | 200 | 4 | `qa-c9f86cb7-2a7d-4adb-b970-3d43e4bde6a0` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-c552c421-8253-41b6-8459-10e54b4cea30` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-0e4f80f3-488a-493f-b577-ccdee21fd7f1` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-2b9014a9-d578-48d1-bdba-55bff1e3e36c` |
| 56 | `GET /v1/accounts/me` | 200 | 7 | `qa-b5e2fc7c-dd2f-4bb7-a847-5c0081138a3d` |
| 57 | `GET /v1/accounts/me` | 200 | 4 | `qa-32739807-e69c-4725-9929-bb006820b811` |
| 58 | `GET /v1/accounts/me` | 200 | 7 | `qa-48ef6d6a-eae9-4f8f-9401-c67156a4072f` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-9b35ed47-62f4-4a4c-a6a6-01ad0745db25` |
| 60 | `GET /v1/accounts/me` | 200 | 4 | `qa-1267fcc8-c1a1-4904-9bf1-9aaf6df67265` |
| 61 | `GET /v1/accounts/me` | 200 | 3 | `qa-82c0c9cd-ebd9-49d7-b432-b53a6787776e` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-50c395aa-4b42-449f-9332-2022d2c62a1f` |
| 63 | `GET /v1/accounts/me` | 429 | 3 | `qa-7ef95ae1-a1cb-4328-b25d-c8843a84f549` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-bc02eaed-17c2-418a-a8ea-f9a6a9b214f2` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-51b62319-12fc-4849-9e37-123a8a8d87ff` |
| 66 | `GET /v1/accounts/me` | 429 | 3 | `qa-b4b034cf-cb54-45da-9557-818d5e04a449` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-45421aa3-8812-4683-996e-9ce7815669cf` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-21bf21f1-44f0-4604-b38f-815a3c456f4e` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-3f6e72d3-6e08-4a49-bcdc-fb41c8956baa` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-f0752bec-a9ed-4eaf-aea8-244f1c710579` |
| 71 | `GET /v1/accounts/me` | 429 | 3 | `qa-e988c96f-dd95-4827-9f87-adbab3b1b53c` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-ae2cdad7-067c-44a6-88a0-62be0a3ca197` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-e625c5a1-9ea8-4696-8390-81c820851e2b` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-2f8db60a-7465-4fac-956a-1de1e34e6fa7` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-02bc37ae-f214-46ea-a281-d1c212c82552` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-f269af88-ecee-4268-b12a-9fb6ff8583b2` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-c2698d58-392e-43fa-af3a-07fb4957b6e2` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-e8cc74be-8634-4c75-bd3d-ee8cabf8d3b3` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-9fa4aafc-e033-43c6-bb6e-453875da3bc5` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-193bc6d4-f288-450b-b36a-052076d655b6` |
| 81 | `GET /v1/accounts/me` | 200 | 3 | `qa-9462dfb9-cefe-4d48-bb6e-1a2f584068cb` |
| 82 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-54820a70-d051-4c96-8d42-380089b7223a` |
| 83 | `POST /v1/auth/token` | 401 | 2 | `qa-56538e54-baeb-4af2-b87a-508eefda12ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4f8e68a9-21e6-4770-bb8a-b5d78411eaba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f8e68a9-21e6-4770-bb8a-b5d78411eaba
Content-Type: application/json

--- request body ---
{"handle":"qa-483b77371e06","displayName":"QA 483b77371e06","password":"****","region":"eu"}

--- response: 201 in 311 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f8e68a9-21e6-4770-bb8a-b5d78411eaba
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
Location: /v1/accounts/qa-483b77371e06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5b7d2235-29c1-4513-8a5f-9d4777240eee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b7d2235-29c1-4513-8a5f-9d4777240eee
Content-Type: application/json

--- request body ---
{"handle":"qa-483b77371e06","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b7d2235-29c1-4513-8a5f-9d4777240eee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed871b1f-2890-49c3-ba16-5d2631c94f8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed871b1f-2890-49c3-ba16-5d2631c94f8c
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed871b1f-2890-49c3-ba16-5d2631c94f8c
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b830450b-072e-4e8e-964d-f55ef8ac4fb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b830450b-072e-4e8e-964d-f55ef8ac4fb4
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b830450b-072e-4e8e-964d-f55ef8ac4fb4
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-137dfe9f-00b9-43e5-a4f1-11c629a232e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-137dfe9f-00b9-43e5-a4f1-11c629a232e1
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-137dfe9f-00b9-43e5-a4f1-11c629a232e1
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-d553ea28-c5dd-4bec-b832-873a915ccd7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d553ea28-c5dd-4bec-b832-873a915ccd7d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d553ea28-c5dd-4bec-b832-873a915ccd7d
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-7432caab-555b-43fb-b6a1-6230aba98606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7432caab-555b-43fb-b6a1-6230aba98606
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-7432caab-555b-43fb-b6a1-6230aba98606
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0433b69-9c4d-4600-8579-abcce489d6db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0433b69-9c4d-4600-8579-abcce489d6db
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0433b69-9c4d-4600-8579-abcce489d6db
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f5fa1bc-bb92-4dea-beca-4c351e48480c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f5fa1bc-bb92-4dea-beca-4c351e48480c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f5fa1bc-bb92-4dea-beca-4c351e48480c
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-64228e8d-5d9b-46ce-b7b8-50e67081959d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64228e8d-5d9b-46ce-b7b8-50e67081959d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-64228e8d-5d9b-46ce-b7b8-50e67081959d
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-1914d4cf-0dbe-4648-b407-6ed94d7eadd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1914d4cf-0dbe-4648-b407-6ed94d7eadd3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1914d4cf-0dbe-4648-b407-6ed94d7eadd3
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-33d8ad66-fdb0-4079-a5c7-06f2a3d8f661

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33d8ad66-fdb0-4079-a5c7-06f2a3d8f661
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-33d8ad66-fdb0-4079-a5c7-06f2a3d8f661
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-16d61e7a-6b5f-4306-a010-f55added90ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d61e7a-6b5f-4306-a010-f55added90ff
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d61e7a-6b5f-4306-a010-f55added90ff
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f57ab0d-a72a-4a95-8230-4c6ce9d3c46a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f57ab0d-a72a-4a95-8230-4c6ce9d3c46a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f57ab0d-a72a-4a95-8230-4c6ce9d3c46a
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-be9d9e83-6b07-4ce0-a9d2-f7742dbd6465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be9d9e83-6b07-4ce0-a9d2-f7742dbd6465
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-be9d9e83-6b07-4ce0-a9d2-f7742dbd6465
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd6df298-f7c8-40e3-b5ce-4294da1ebf03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd6df298-f7c8-40e3-b5ce-4294da1ebf03
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd6df298-f7c8-40e3-b5ce-4294da1ebf03
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-15001084-ff8f-459e-b96e-2804099f90ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15001084-ff8f-459e-b96e-2804099f90ee
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-15001084-ff8f-459e-b96e-2804099f90ee
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-30103243-1201-446a-9be3-c519c6f5825f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30103243-1201-446a-9be3-c519c6f5825f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-30103243-1201-446a-9be3-c519c6f5825f
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-fdc44076-ce94-4fd5-818c-bd9cbdf1b07c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdc44076-ce94-4fd5-818c-bd9cbdf1b07c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdc44076-ce94-4fd5-818c-bd9cbdf1b07c
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b86bf891-4666-441f-850f-060f31d99f08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b86bf891-4666-441f-850f-060f31d99f08
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b86bf891-4666-441f-850f-060f31d99f08
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-1277de4f-44c2-42bf-a6b4-8ca6da4a44e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1277de4f-44c2-42bf-a6b4-8ca6da4a44e4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1277de4f-44c2-42bf-a6b4-8ca6da4a44e4
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-b96de7a1-91d4-4c04-a22c-4e84208f3f6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b96de7a1-91d4-4c04-a22c-4e84208f3f6c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b96de7a1-91d4-4c04-a22c-4e84208f3f6c
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b06cdc3-fb7a-4e98-9acd-ab24c0308f79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b06cdc3-fb7a-4e98-9acd-ab24c0308f79
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b06cdc3-fb7a-4e98-9acd-ab24c0308f79
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-58f8081b-a570-4cd5-9230-16d9bd211a56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58f8081b-a570-4cd5-9230-16d9bd211a56
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-58f8081b-a570-4cd5-9230-16d9bd211a56
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-b25edbd9-b5ef-454a-94f1-4e41cdbc4a5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b25edbd9-b5ef-454a-94f1-4e41cdbc4a5a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b25edbd9-b5ef-454a-94f1-4e41cdbc4a5a
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-1538b419-acfb-4d4e-82ef-ad9059739000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1538b419-acfb-4d4e-82ef-ad9059739000
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1538b419-acfb-4d4e-82ef-ad9059739000
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1a57ffe-2ac6-43f7-81d9-774afa140ad4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a57ffe-2ac6-43f7-81d9-774afa140ad4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1a57ffe-2ac6-43f7-81d9-774afa140ad4
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-b8a02ecb-7e06-4fef-a7ab-9590ca439701

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8a02ecb-7e06-4fef-a7ab-9590ca439701
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8a02ecb-7e06-4fef-a7ab-9590ca439701
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c23653e-9b66-4770-b9f8-ffdc3322411d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c23653e-9b66-4770-b9f8-ffdc3322411d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c23653e-9b66-4770-b9f8-ffdc3322411d
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ad4cb33-9505-4e0c-8a3e-0e8163ee72b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad4cb33-9505-4e0c-8a3e-0e8163ee72b3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad4cb33-9505-4e0c-8a3e-0e8163ee72b3
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-c702749f-3590-4d96-9eda-9951e8f6ebda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c702749f-3590-4d96-9eda-9951e8f6ebda
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c702749f-3590-4d96-9eda-9951e8f6ebda
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc8ec8fb-0f90-45db-b5ea-e673fc73d114

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc8ec8fb-0f90-45db-b5ea-e673fc73d114
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc8ec8fb-0f90-45db-b5ea-e673fc73d114
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-943baab1-e335-410d-b216-fa00c4c4b791

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943baab1-e335-410d-b216-fa00c4c4b791
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-943baab1-e335-410d-b216-fa00c4c4b791
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb22ec24-6f0c-4893-9d3e-be944aa45881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb22ec24-6f0c-4893-9d3e-be944aa45881
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb22ec24-6f0c-4893-9d3e-be944aa45881
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-a871f0cf-e77a-4a7c-b44a-d204360ce0b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a871f0cf-e77a-4a7c-b44a-d204360ce0b0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-a871f0cf-e77a-4a7c-b44a-d204360ce0b0
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec6470b2-2e4a-46bb-8dc2-32bd8ac17ce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec6470b2-2e4a-46bb-8dc2-32bd8ac17ce8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec6470b2-2e4a-46bb-8dc2-32bd8ac17ce8
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-71c29b3c-e33b-4132-8b12-b4528c8a7406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71c29b3c-e33b-4132-8b12-b4528c8a7406
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-71c29b3c-e33b-4132-8b12-b4528c8a7406
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-81b74e33-5fab-4fcb-87a7-26338e3af58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b74e33-5fab-4fcb-87a7-26338e3af58e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-81b74e33-5fab-4fcb-87a7-26338e3af58e
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-60393658-db55-468a-b861-bb86ecec9553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60393658-db55-468a-b861-bb86ecec9553
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-60393658-db55-468a-b861-bb86ecec9553
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6dd97e1-7d5d-4765-adfe-4b2811c42904

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6dd97e1-7d5d-4765-adfe-4b2811c42904
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6dd97e1-7d5d-4765-adfe-4b2811c42904
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-cef0cfcb-a1e1-4604-a89a-d4dff4d8e7f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cef0cfcb-a1e1-4604-a89a-d4dff4d8e7f3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-cef0cfcb-a1e1-4604-a89a-d4dff4d8e7f3
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-60908550-2bc6-4605-9411-0c911fc16f19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60908550-2bc6-4605-9411-0c911fc16f19
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-60908550-2bc6-4605-9411-0c911fc16f19
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-b58d1644-fd9d-4671-9154-18af207a885e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b58d1644-fd9d-4671-9154-18af207a885e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b58d1644-fd9d-4671-9154-18af207a885e
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-53fa0f02-f1e0-47bb-93da-69c2aec6bde5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53fa0f02-f1e0-47bb-93da-69c2aec6bde5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-53fa0f02-f1e0-47bb-93da-69c2aec6bde5
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c4dea0c-aae5-4b4d-9f15-5559552fbf19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c4dea0c-aae5-4b4d-9f15-5559552fbf19
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c4dea0c-aae5-4b4d-9f15-5559552fbf19
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fddaa75-0f40-4f57-b2ca-8b68e5f341b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fddaa75-0f40-4f57-b2ca-8b68e5f341b3
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fddaa75-0f40-4f57-b2ca-8b68e5f341b3
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-908756b9-2441-4349-b691-dd0928318d0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-908756b9-2441-4349-b691-dd0928318d0d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-908756b9-2441-4349-b691-dd0928318d0d
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-ffb6f022-436d-43d0-a595-7ee7b241dd2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffb6f022-436d-43d0-a595-7ee7b241dd2b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffb6f022-436d-43d0-a595-7ee7b241dd2b
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cbfde4e-05ff-4d55-b9c1-eb784393fba3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cbfde4e-05ff-4d55-b9c1-eb784393fba3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cbfde4e-05ff-4d55-b9c1-eb784393fba3
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b4acd86-be90-43e1-b817-91718ff671cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b4acd86-be90-43e1-b817-91718ff671cd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b4acd86-be90-43e1-b817-91718ff671cd
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-c353cdca-e53b-4c70-af6c-b0f41f9ba0fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c353cdca-e53b-4c70-af6c-b0f41f9ba0fb
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c353cdca-e53b-4c70-af6c-b0f41f9ba0fb
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9f86cb7-2a7d-4adb-b970-3d43e4bde6a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9f86cb7-2a7d-4adb-b970-3d43e4bde6a0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c9f86cb7-2a7d-4adb-b970-3d43e4bde6a0
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-c552c421-8253-41b6-8459-10e54b4cea30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c552c421-8253-41b6-8459-10e54b4cea30
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c552c421-8253-41b6-8459-10e54b4cea30
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e4f80f3-488a-493f-b577-ccdee21fd7f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e4f80f3-488a-493f-b577-ccdee21fd7f1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e4f80f3-488a-493f-b577-ccdee21fd7f1
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-2b9014a9-d578-48d1-bdba-55bff1e3e36c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b9014a9-d578-48d1-bdba-55bff1e3e36c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b9014a9-d578-48d1-bdba-55bff1e3e36c
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5e2fc7c-dd2f-4bb7-a847-5c0081138a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5e2fc7c-dd2f-4bb7-a847-5c0081138a3d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5e2fc7c-dd2f-4bb7-a847-5c0081138a3d
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-32739807-e69c-4725-9929-bb006820b811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32739807-e69c-4725-9929-bb006820b811
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-32739807-e69c-4725-9929-bb006820b811
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-48ef6d6a-eae9-4f8f-9401-c67156a4072f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ef6d6a-eae9-4f8f-9401-c67156a4072f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-48ef6d6a-eae9-4f8f-9401-c67156a4072f
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b35ed47-62f4-4a4c-a6a6-01ad0745db25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b35ed47-62f4-4a4c-a6a6-01ad0745db25
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b35ed47-62f4-4a4c-a6a6-01ad0745db25
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-1267fcc8-c1a1-4904-9bf1-9aaf6df67265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1267fcc8-c1a1-4904-9bf1-9aaf6df67265
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1267fcc8-c1a1-4904-9bf1-9aaf6df67265
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-82c0c9cd-ebd9-49d7-b432-b53a6787776e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82c0c9cd-ebd9-49d7-b432-b53a6787776e
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-82c0c9cd-ebd9-49d7-b432-b53a6787776e
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-50c395aa-4b42-449f-9332-2022d2c62a1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50c395aa-4b42-449f-9332-2022d2c62a1f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-50c395aa-4b42-449f-9332-2022d2c62a1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ef95ae1-a1cb-4328-b25d-c8843a84f549

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef95ae1-a1cb-4328-b25d-c8843a84f549
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ef95ae1-a1cb-4328-b25d-c8843a84f549
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7ef95ae1-a1cb-4328-b25d-c8843a84f549"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc02eaed-17c2-418a-a8ea-f9a6a9b214f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc02eaed-17c2-418a-a8ea-f9a6a9b214f2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc02eaed-17c2-418a-a8ea-f9a6a9b214f2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bc02eaed-17c2-418a-a8ea-f9a6a9b214f2"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-51b62319-12fc-4849-9e37-123a8a8d87ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51b62319-12fc-4849-9e37-123a8a8d87ff
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51b62319-12fc-4849-9e37-123a8a8d87ff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-51b62319-12fc-4849-9e37-123a8a8d87ff"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4b034cf-cb54-45da-9557-818d5e04a449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4b034cf-cb54-45da-9557-818d5e04a449
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4b034cf-cb54-45da-9557-818d5e04a449
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b4b034cf-cb54-45da-9557-818d5e04a449"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-45421aa3-8812-4683-996e-9ce7815669cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45421aa3-8812-4683-996e-9ce7815669cf
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45421aa3-8812-4683-996e-9ce7815669cf
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-45421aa3-8812-4683-996e-9ce7815669cf"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-21bf21f1-44f0-4604-b38f-815a3c456f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21bf21f1-44f0-4604-b38f-815a3c456f4e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21bf21f1-44f0-4604-b38f-815a3c456f4e
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-21bf21f1-44f0-4604-b38f-815a3c456f4e"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f6e72d3-6e08-4a49-bcdc-fb41c8956baa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f6e72d3-6e08-4a49-bcdc-fb41c8956baa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f6e72d3-6e08-4a49-bcdc-fb41c8956baa
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3f6e72d3-6e08-4a49-bcdc-fb41c8956baa"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-f0752bec-a9ed-4eaf-aea8-244f1c710579

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0752bec-a9ed-4eaf-aea8-244f1c710579
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0752bec-a9ed-4eaf-aea8-244f1c710579
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f0752bec-a9ed-4eaf-aea8-244f1c710579"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-e988c96f-dd95-4827-9f87-adbab3b1b53c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e988c96f-dd95-4827-9f87-adbab3b1b53c
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e988c96f-dd95-4827-9f87-adbab3b1b53c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e988c96f-dd95-4827-9f87-adbab3b1b53c"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae2cdad7-067c-44a6-88a0-62be0a3ca197

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae2cdad7-067c-44a6-88a0-62be0a3ca197
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ae2cdad7-067c-44a6-88a0-62be0a3ca197
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ae2cdad7-067c-44a6-88a0-62be0a3ca197"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-e625c5a1-9ea8-4696-8390-81c820851e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e625c5a1-9ea8-4696-8390-81c820851e2b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e625c5a1-9ea8-4696-8390-81c820851e2b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e625c5a1-9ea8-4696-8390-81c820851e2b"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f8db60a-7465-4fac-956a-1de1e34e6fa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f8db60a-7465-4fac-956a-1de1e34e6fa7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f8db60a-7465-4fac-956a-1de1e34e6fa7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2f8db60a-7465-4fac-956a-1de1e34e6fa7"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-02bc37ae-f214-46ea-a281-d1c212c82552

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02bc37ae-f214-46ea-a281-d1c212c82552
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02bc37ae-f214-46ea-a281-d1c212c82552
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-02bc37ae-f214-46ea-a281-d1c212c82552"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-f269af88-ecee-4268-b12a-9fb6ff8583b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f269af88-ecee-4268-b12a-9fb6ff8583b2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f269af88-ecee-4268-b12a-9fb6ff8583b2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f269af88-ecee-4268-b12a-9fb6ff8583b2"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2698d58-392e-43fa-af3a-07fb4957b6e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2698d58-392e-43fa-af3a-07fb4957b6e2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2698d58-392e-43fa-af3a-07fb4957b6e2
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c2698d58-392e-43fa-af3a-07fb4957b6e2"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8cc74be-8634-4c75-bd3d-ee8cabf8d3b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8cc74be-8634-4c75-bd3d-ee8cabf8d3b3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8cc74be-8634-4c75-bd3d-ee8cabf8d3b3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e8cc74be-8634-4c75-bd3d-ee8cabf8d3b3"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fa4aafc-e033-43c6-bb6e-453875da3bc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fa4aafc-e033-43c6-bb6e-453875da3bc5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fa4aafc-e033-43c6-bb6e-453875da3bc5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9fa4aafc-e033-43c6-bb6e-453875da3bc5"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-193bc6d4-f288-450b-b36a-052076d655b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-193bc6d4-f288-450b-b36a-052076d655b6
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-193bc6d4-f288-450b-b36a-052076d655b6
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-193bc6d4-f288-450b-b36a-052076d655b6"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-9462dfb9-cefe-4d48-bb6e-1a2f584068cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9462dfb9-cefe-4d48-bb6e-1a2f584068cb
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-9462dfb9-cefe-4d48-bb6e-1a2f584068cb
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

{"id":"acc_4696c49c-dcf0-4b55-a0cf-238eab21e5cd","handle":"qa-483b77371e06","displayName":"QA 483b77371e06","region":"eu","role":"user","createdAt":"2026-11-21T09:57:04.452532295Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54820a70-d051-4c96-8d42-380089b7223a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54820a70-d051-4c96-8d42-380089b7223a
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sat, 21 Nov 2026 09:57:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54820a70-d051-4c96-8d42-380089b7223a
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
correlation: qa-56538e54-baeb-4af2-b87a-508eefda12ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56538e54-baeb-4af2-b87a-508eefda12ce
Content-Type: application/json

--- request body ---
{"handle":"qa-483b77371e06","password":"****"}

--- response: 401 in 2 ms ---
Date: Sat, 21 Nov 2026 09:57:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56538e54-baeb-4af2-b87a-508eefda12ce
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-56538e54-baeb-4af2-b87a-508eefda12ce"}
```
