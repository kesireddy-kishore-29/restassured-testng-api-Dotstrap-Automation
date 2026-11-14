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
| 1 | `POST /v1/accounts` | 201 | 313 | `qa-febc4972-20ac-408d-933a-4bcdfbc976b6` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-9b4004be-a44d-4554-a61a-d87c7c6cb17a` |
| 3 | `GET /v1/accounts/me` | 200 | 40 | `qa-ca4e1270-ea56-4b09-9259-979608a893d1` |
| 4 | `GET /v1/accounts/me` | 200 | 11 | `qa-26e815e0-bc35-45bb-93e7-3f5213f373d0` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-60cdac20-eb7e-4ee0-8a08-43f49ede0721` |
| 6 | `GET /v1/accounts/me` | 200 | 13 | `qa-c12babfd-5225-461d-8d11-cfb946c2497d` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-68ee3fe0-df01-4dc8-9f47-0ef15e89bee6` |
| 8 | `GET /v1/accounts/me` | 200 | 13 | `qa-9e52835b-02b0-4cce-ae40-8f3e9c42b4cf` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-e94ee3fa-6336-459c-adda-8e70e4c2350b` |
| 10 | `GET /v1/accounts/me` | 200 | 7 | `qa-4651d529-8a7b-4d5f-9149-8884f9ef2ff7` |
| 11 | `GET /v1/accounts/me` | 200 | 8 | `qa-3efc133f-7289-4704-b904-49506d41f371` |
| 12 | `GET /v1/accounts/me` | 200 | 12 | `qa-a150df85-e8f6-4eaf-baba-beece3895c0d` |
| 13 | `GET /v1/accounts/me` | 200 | 24 | `qa-15790544-aa50-45b4-814d-c6a0b945d8ca` |
| 14 | `GET /v1/accounts/me` | 200 | 7 | `qa-2514449e-db6f-40e4-9b24-4b6be7e42cbe` |
| 15 | `GET /v1/accounts/me` | 200 | 9 | `qa-a0e4578c-665b-4b49-80d7-21d08a3ac4a1` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-996f5a79-355d-426e-aace-f1a6ed57568f` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-748e41c2-6617-4bd5-8403-61c71bbae296` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-19cf35d0-076b-40a3-a680-c7122638760b` |
| 19 | `GET /v1/accounts/me` | 200 | 9 | `qa-c779e98c-80ea-419b-a09e-a710570f862f` |
| 20 | `GET /v1/accounts/me` | 200 | 4 | `qa-9105dfa7-972b-476c-92b8-5ca1eec17e91` |
| 21 | `GET /v1/accounts/me` | 200 | 5 | `qa-bbfc15d6-4e9e-46a5-a045-3c3e97afd47a` |
| 22 | `GET /v1/accounts/me` | 200 | 5 | `qa-a1082c2b-6b37-43ce-8a15-0b2f614ebd28` |
| 23 | `GET /v1/accounts/me` | 200 | 4 | `qa-24b8bd2a-f4ea-4887-a077-972cb5577d88` |
| 24 | `GET /v1/accounts/me` | 200 | 4 | `qa-1e60cab4-78be-4fe4-b1f3-445c94e1d0e6` |
| 25 | `GET /v1/accounts/me` | 200 | 4 | `qa-6e0fbfb6-7f7b-4827-af6b-d06c56ec5eea` |
| 26 | `GET /v1/accounts/me` | 200 | 4 | `qa-4fdb797c-0afc-4ec3-8a0d-d4ced608931b` |
| 27 | `GET /v1/accounts/me` | 200 | 4 | `qa-fa204f1f-0b4a-46a6-a3ff-a6e0153eb8ff` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-37d3d8fd-c1b4-44d2-a4f4-0ecece3acd0b` |
| 29 | `GET /v1/accounts/me` | 200 | 5 | `qa-bf9df1ba-5418-4af9-95c3-c2fd5405418b` |
| 30 | `GET /v1/accounts/me` | 200 | 7 | `qa-83d197fe-14f9-4018-9989-c68f02ca7710` |
| 31 | `GET /v1/accounts/me` | 200 | 6 | `qa-a5b4a489-48c4-48f0-8bd5-67c7cf68b474` |
| 32 | `GET /v1/accounts/me` | 200 | 7 | `qa-11aa5404-73bd-4aca-b29b-0c663f83e69e` |
| 33 | `GET /v1/accounts/me` | 200 | 4 | `qa-48173fe7-ed01-4fb7-be2a-d4cde31aa7c2` |
| 34 | `GET /v1/accounts/me` | 200 | 4 | `qa-5d198cdf-3b5a-4b7f-8842-2efc4268dde9` |
| 35 | `GET /v1/accounts/me` | 200 | 8 | `qa-43500fb0-45b7-49e0-9692-5a90101e7dad` |
| 36 | `GET /v1/accounts/me` | 200 | 11 | `qa-06cdd846-dc8a-400c-b3f8-a9c3265e6a48` |
| 37 | `GET /v1/accounts/me` | 200 | 8 | `qa-5a07d10c-869e-475c-a899-84eaf9992207` |
| 38 | `GET /v1/accounts/me` | 200 | 22 | `qa-1d9c7105-84b9-4512-81aa-e0e510df9d45` |
| 39 | `GET /v1/accounts/me` | 200 | 11 | `qa-874a658b-2c29-4cfe-81a1-50e7f297e261` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-85623bfa-6c58-416d-9d47-39f7b73c030b` |
| 41 | `GET /v1/accounts/me` | 200 | 6 | `qa-1c273eff-43ef-4c7e-8836-3038623ab14c` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-2df1dbb8-d612-420b-a8e9-30c424955f6d` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-55674039-0df2-49e8-9848-4a1541a19d6c` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-380ae2d3-7556-4088-bebb-a24f2c229c06` |
| 45 | `GET /v1/accounts/me` | 200 | 5 | `qa-3d1ef533-57c5-4f21-af3a-5a1a0c46ef85` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-4f12f047-88b3-4c71-bf18-0a264dc48a3d` |
| 47 | `GET /v1/accounts/me` | 200 | 4 | `qa-ce311862-c468-4ed9-b6d4-9b7b2bc43d8d` |
| 48 | `GET /v1/accounts/me` | 200 | 5 | `qa-3d610b3e-90e4-4777-bcdd-8ae5cdd85631` |
| 49 | `GET /v1/accounts/me` | 200 | 5 | `qa-cddb0809-63db-41d4-ba98-29b580331ba0` |
| 50 | `GET /v1/accounts/me` | 200 | 5 | `qa-dddd0239-5ec1-4916-98c1-094a644df048` |
| 51 | `GET /v1/accounts/me` | 200 | 5 | `qa-0ce4a50d-131a-4238-8085-eabb7a778d72` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-1953f444-bc4c-4ffe-9ace-f72e01dcf223` |
| 53 | `GET /v1/accounts/me` | 200 | 3 | `qa-f5d45df5-070d-47b2-885e-016ea7a693d2` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-35c9f6c8-61b9-4547-bdd7-df39000096fe` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-886a610d-0837-48bc-aa48-2e8b2e6a0262` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-b5253bc1-e5e5-4e3c-b983-7765f03da438` |
| 57 | `GET /v1/accounts/me` | 200 | 3 | `qa-928aa39f-59e3-4eab-aebc-fa85500448e0` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-2f80aed6-9d5c-4c88-bce8-43ad0abba3cd` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-e7ab06c0-74fd-463f-a5c9-ebc9bb5224fb` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-99439bfd-2e0c-4c57-a908-b6aa0498e20f` |
| 61 | `GET /v1/accounts/me` | 200 | 8 | `qa-0cb909fe-d143-4ab1-b94e-644b21440add` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-c799ad0b-e45d-49c1-ab92-b73547d2d156` |
| 63 | `GET /v1/accounts/me` | 429 | 3 | `qa-29000d6a-f992-4a0a-af5e-b9f55310bd70` |
| 64 | `GET /v1/accounts/me` | 429 | 9 | `qa-586b554e-7e2c-46ba-907d-b1e2d79ccdbc` |
| 65 | `GET /v1/accounts/me` | 429 | 3 | `qa-befc2d10-8aef-42e4-b8c5-ea1b38eb0ce4` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-9775f68c-646a-4051-9562-ccf026686878` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-09b7992b-f343-4577-a31c-735574e31e73` |
| 68 | `GET /v1/accounts/me` | 429 | 3 | `qa-2bd069ed-f59d-4926-a627-538a17c8cc8b` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-83d0900f-7366-47d5-99e9-83b21d69e520` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-f66daa42-5c18-4fdd-b4c5-a562faa222a9` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-3bee4967-1f28-4446-b9a0-a6d9dc865eff` |
| 72 | `GET /v1/accounts/me` | 429 | 3 | `qa-155447f9-9cc8-4630-986d-99c21d74ead8` |
| 73 | `GET /v1/accounts/me` | 429 | 3 | `qa-fc37ece9-347a-4f81-ba4d-0ef5552f4010` |
| 74 | `GET /v1/accounts/me` | 429 | 3 | `qa-4c60fa1a-e03f-409f-be78-570f32c1ff4d` |
| 75 | `GET /v1/accounts/me` | 429 | 3 | `qa-73b5c241-c924-4cf3-8a93-1f9926a3ae24` |
| 76 | `GET /v1/accounts/me` | 429 | 3 | `qa-39b23c4c-2c8f-47e4-bf04-f20de055f4dc` |
| 77 | `GET /v1/accounts/me` | 429 | 3 | `qa-3c327cbb-a72b-479d-9900-3ea33ff57a57` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-b46278f8-5cee-48b9-97e5-f24ee1ac197f` |
| 79 | `GET /v1/accounts/me` | 429 | 3 | `qa-bf7c878d-1a10-456a-9fa4-118186255705` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-27b96efc-a4a5-44b7-910d-577bbbf13bf4` |
| 81 | `GET /v1/accounts/me` | 200 | 3 | `qa-17e7789b-9c69-4b80-bcf7-20ee60d66d9f` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2d4d55af-9aac-4ce2-b578-a0dd3e4ee715` |
| 83 | `POST /v1/auth/token` | 401 | 2 | `qa-7a34259f-709d-4b6f-b603-c7aa115ed291` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-febc4972-20ac-408d-933a-4bcdfbc976b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-febc4972-20ac-408d-933a-4bcdfbc976b6
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","password":"****","region":"eu"}

--- response: 201 in 313 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-febc4972-20ac-408d-933a-4bcdfbc976b6
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
Location: /v1/accounts/qa-d1c03dd76998
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9b4004be-a44d-4554-a61a-d87c7c6cb17a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b4004be-a44d-4554-a61a-d87c7c6cb17a
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c03dd76998","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b4004be-a44d-4554-a61a-d87c7c6cb17a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ca4e1270-ea56-4b09-9259-979608a893d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca4e1270-ea56-4b09-9259-979608a893d1
Content-Type: application/json

--- response: 200 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca4e1270-ea56-4b09-9259-979608a893d1
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-26e815e0-bc35-45bb-93e7-3f5213f373d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26e815e0-bc35-45bb-93e7-3f5213f373d0
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-26e815e0-bc35-45bb-93e7-3f5213f373d0
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-60cdac20-eb7e-4ee0-8a08-43f49ede0721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60cdac20-eb7e-4ee0-8a08-43f49ede0721
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-60cdac20-eb7e-4ee0-8a08-43f49ede0721
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-c12babfd-5225-461d-8d11-cfb946c2497d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c12babfd-5225-461d-8d11-cfb946c2497d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-c12babfd-5225-461d-8d11-cfb946c2497d
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-68ee3fe0-df01-4dc8-9f47-0ef15e89bee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ee3fe0-df01-4dc8-9f47-0ef15e89bee6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-68ee3fe0-df01-4dc8-9f47-0ef15e89bee6
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e52835b-02b0-4cce-ae40-8f3e9c42b4cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e52835b-02b0-4cce-ae40-8f3e9c42b4cf
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e52835b-02b0-4cce-ae40-8f3e9c42b4cf
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-e94ee3fa-6336-459c-adda-8e70e4c2350b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e94ee3fa-6336-459c-adda-8e70e4c2350b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e94ee3fa-6336-459c-adda-8e70e4c2350b
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-4651d529-8a7b-4d5f-9149-8884f9ef2ff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4651d529-8a7b-4d5f-9149-8884f9ef2ff7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4651d529-8a7b-4d5f-9149-8884f9ef2ff7
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-3efc133f-7289-4704-b904-49506d41f371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3efc133f-7289-4704-b904-49506d41f371
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3efc133f-7289-4704-b904-49506d41f371
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-a150df85-e8f6-4eaf-baba-beece3895c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a150df85-e8f6-4eaf-baba-beece3895c0d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a150df85-e8f6-4eaf-baba-beece3895c0d
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-15790544-aa50-45b4-814d-c6a0b945d8ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15790544-aa50-45b4-814d-c6a0b945d8ca
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-15790544-aa50-45b4-814d-c6a0b945d8ca
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-2514449e-db6f-40e4-9b24-4b6be7e42cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2514449e-db6f-40e4-9b24-4b6be7e42cbe
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2514449e-db6f-40e4-9b24-4b6be7e42cbe
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0e4578c-665b-4b49-80d7-21d08a3ac4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0e4578c-665b-4b49-80d7-21d08a3ac4a1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0e4578c-665b-4b49-80d7-21d08a3ac4a1
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-996f5a79-355d-426e-aace-f1a6ed57568f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-996f5a79-355d-426e-aace-f1a6ed57568f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-996f5a79-355d-426e-aace-f1a6ed57568f
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-748e41c2-6617-4bd5-8403-61c71bbae296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-748e41c2-6617-4bd5-8403-61c71bbae296
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-748e41c2-6617-4bd5-8403-61c71bbae296
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-19cf35d0-076b-40a3-a680-c7122638760b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19cf35d0-076b-40a3-a680-c7122638760b
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-19cf35d0-076b-40a3-a680-c7122638760b
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-c779e98c-80ea-419b-a09e-a710570f862f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c779e98c-80ea-419b-a09e-a710570f862f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c779e98c-80ea-419b-a09e-a710570f862f
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-9105dfa7-972b-476c-92b8-5ca1eec17e91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9105dfa7-972b-476c-92b8-5ca1eec17e91
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-9105dfa7-972b-476c-92b8-5ca1eec17e91
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-bbfc15d6-4e9e-46a5-a045-3c3e97afd47a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbfc15d6-4e9e-46a5-a045-3c3e97afd47a
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbfc15d6-4e9e-46a5-a045-3c3e97afd47a
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1082c2b-6b37-43ce-8a15-0b2f614ebd28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1082c2b-6b37-43ce-8a15-0b2f614ebd28
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1082c2b-6b37-43ce-8a15-0b2f614ebd28
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-24b8bd2a-f4ea-4887-a077-972cb5577d88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24b8bd2a-f4ea-4887-a077-972cb5577d88
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-24b8bd2a-f4ea-4887-a077-972cb5577d88
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e60cab4-78be-4fe4-b1f3-445c94e1d0e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e60cab4-78be-4fe4-b1f3-445c94e1d0e6
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e60cab4-78be-4fe4-b1f3-445c94e1d0e6
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e0fbfb6-7f7b-4827-af6b-d06c56ec5eea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e0fbfb6-7f7b-4827-af6b-d06c56ec5eea
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e0fbfb6-7f7b-4827-af6b-d06c56ec5eea
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-4fdb797c-0afc-4ec3-8a0d-d4ced608931b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fdb797c-0afc-4ec3-8a0d-d4ced608931b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fdb797c-0afc-4ec3-8a0d-d4ced608931b
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-fa204f1f-0b4a-46a6-a3ff-a6e0153eb8ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa204f1f-0b4a-46a6-a3ff-a6e0153eb8ff
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa204f1f-0b4a-46a6-a3ff-a6e0153eb8ff
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-37d3d8fd-c1b4-44d2-a4f4-0ecece3acd0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d3d8fd-c1b4-44d2-a4f4-0ecece3acd0b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-37d3d8fd-c1b4-44d2-a4f4-0ecece3acd0b
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf9df1ba-5418-4af9-95c3-c2fd5405418b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf9df1ba-5418-4af9-95c3-c2fd5405418b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf9df1ba-5418-4af9-95c3-c2fd5405418b
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-83d197fe-14f9-4018-9989-c68f02ca7710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83d197fe-14f9-4018-9989-c68f02ca7710
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-83d197fe-14f9-4018-9989-c68f02ca7710
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5b4a489-48c4-48f0-8bd5-67c7cf68b474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b4a489-48c4-48f0-8bd5-67c7cf68b474
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5b4a489-48c4-48f0-8bd5-67c7cf68b474
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-11aa5404-73bd-4aca-b29b-0c663f83e69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11aa5404-73bd-4aca-b29b-0c663f83e69e
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-11aa5404-73bd-4aca-b29b-0c663f83e69e
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-48173fe7-ed01-4fb7-be2a-d4cde31aa7c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48173fe7-ed01-4fb7-be2a-d4cde31aa7c2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-48173fe7-ed01-4fb7-be2a-d4cde31aa7c2
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d198cdf-3b5a-4b7f-8842-2efc4268dde9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d198cdf-3b5a-4b7f-8842-2efc4268dde9
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d198cdf-3b5a-4b7f-8842-2efc4268dde9
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-43500fb0-45b7-49e0-9692-5a90101e7dad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43500fb0-45b7-49e0-9692-5a90101e7dad
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-43500fb0-45b7-49e0-9692-5a90101e7dad
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-06cdd846-dc8a-400c-b3f8-a9c3265e6a48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06cdd846-dc8a-400c-b3f8-a9c3265e6a48
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-06cdd846-dc8a-400c-b3f8-a9c3265e6a48
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a07d10c-869e-475c-a899-84eaf9992207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a07d10c-869e-475c-a899-84eaf9992207
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a07d10c-869e-475c-a899-84eaf9992207
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-1d9c7105-84b9-4512-81aa-e0e510df9d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d9c7105-84b9-4512-81aa-e0e510df9d45
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d9c7105-84b9-4512-81aa-e0e510df9d45
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-874a658b-2c29-4cfe-81a1-50e7f297e261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-874a658b-2c29-4cfe-81a1-50e7f297e261
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-874a658b-2c29-4cfe-81a1-50e7f297e261
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-85623bfa-6c58-416d-9d47-39f7b73c030b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85623bfa-6c58-416d-9d47-39f7b73c030b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-85623bfa-6c58-416d-9d47-39f7b73c030b
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-1c273eff-43ef-4c7e-8836-3038623ab14c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c273eff-43ef-4c7e-8836-3038623ab14c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c273eff-43ef-4c7e-8836-3038623ab14c
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-2df1dbb8-d612-420b-a8e9-30c424955f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2df1dbb8-d612-420b-a8e9-30c424955f6d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2df1dbb8-d612-420b-a8e9-30c424955f6d
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-55674039-0df2-49e8-9848-4a1541a19d6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55674039-0df2-49e8-9848-4a1541a19d6c
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-55674039-0df2-49e8-9848-4a1541a19d6c
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-380ae2d3-7556-4088-bebb-a24f2c229c06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-380ae2d3-7556-4088-bebb-a24f2c229c06
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-380ae2d3-7556-4088-bebb-a24f2c229c06
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d1ef533-57c5-4f21-af3a-5a1a0c46ef85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1ef533-57c5-4f21-af3a-5a1a0c46ef85
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d1ef533-57c5-4f21-af3a-5a1a0c46ef85
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f12f047-88b3-4c71-bf18-0a264dc48a3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f12f047-88b3-4c71-bf18-0a264dc48a3d
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f12f047-88b3-4c71-bf18-0a264dc48a3d
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce311862-c468-4ed9-b6d4-9b7b2bc43d8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce311862-c468-4ed9-b6d4-9b7b2bc43d8d
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce311862-c468-4ed9-b6d4-9b7b2bc43d8d
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d610b3e-90e4-4777-bcdd-8ae5cdd85631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d610b3e-90e4-4777-bcdd-8ae5cdd85631
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d610b3e-90e4-4777-bcdd-8ae5cdd85631
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-cddb0809-63db-41d4-ba98-29b580331ba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cddb0809-63db-41d4-ba98-29b580331ba0
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cddb0809-63db-41d4-ba98-29b580331ba0
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-dddd0239-5ec1-4916-98c1-094a644df048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dddd0239-5ec1-4916-98c1-094a644df048
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-dddd0239-5ec1-4916-98c1-094a644df048
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ce4a50d-131a-4238-8085-eabb7a778d72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ce4a50d-131a-4238-8085-eabb7a778d72
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ce4a50d-131a-4238-8085-eabb7a778d72
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-1953f444-bc4c-4ffe-9ace-f72e01dcf223

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1953f444-bc4c-4ffe-9ace-f72e01dcf223
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1953f444-bc4c-4ffe-9ace-f72e01dcf223
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5d45df5-070d-47b2-885e-016ea7a693d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5d45df5-070d-47b2-885e-016ea7a693d2
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5d45df5-070d-47b2-885e-016ea7a693d2
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-35c9f6c8-61b9-4547-bdd7-df39000096fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c9f6c8-61b9-4547-bdd7-df39000096fe
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-35c9f6c8-61b9-4547-bdd7-df39000096fe
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-886a610d-0837-48bc-aa48-2e8b2e6a0262

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-886a610d-0837-48bc-aa48-2e8b2e6a0262
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-886a610d-0837-48bc-aa48-2e8b2e6a0262
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5253bc1-e5e5-4e3c-b983-7765f03da438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5253bc1-e5e5-4e3c-b983-7765f03da438
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5253bc1-e5e5-4e3c-b983-7765f03da438
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-928aa39f-59e3-4eab-aebc-fa85500448e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-928aa39f-59e3-4eab-aebc-fa85500448e0
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-928aa39f-59e3-4eab-aebc-fa85500448e0
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f80aed6-9d5c-4c88-bce8-43ad0abba3cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f80aed6-9d5c-4c88-bce8-43ad0abba3cd
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f80aed6-9d5c-4c88-bce8-43ad0abba3cd
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7ab06c0-74fd-463f-a5c9-ebc9bb5224fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7ab06c0-74fd-463f-a5c9-ebc9bb5224fb
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7ab06c0-74fd-463f-a5c9-ebc9bb5224fb
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-99439bfd-2e0c-4c57-a908-b6aa0498e20f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99439bfd-2e0c-4c57-a908-b6aa0498e20f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-99439bfd-2e0c-4c57-a908-b6aa0498e20f
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-0cb909fe-d143-4ab1-b94e-644b21440add

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cb909fe-d143-4ab1-b94e-644b21440add
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cb909fe-d143-4ab1-b94e-644b21440add
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-c799ad0b-e45d-49c1-ab92-b73547d2d156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c799ad0b-e45d-49c1-ab92-b73547d2d156
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-c799ad0b-e45d-49c1-ab92-b73547d2d156
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-29000d6a-f992-4a0a-af5e-b9f55310bd70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29000d6a-f992-4a0a-af5e-b9f55310bd70
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29000d6a-f992-4a0a-af5e-b9f55310bd70
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-29000d6a-f992-4a0a-af5e-b9f55310bd70"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-586b554e-7e2c-46ba-907d-b1e2d79ccdbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-586b554e-7e2c-46ba-907d-b1e2d79ccdbc
Content-Type: application/json

--- response: 429 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-586b554e-7e2c-46ba-907d-b1e2d79ccdbc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-586b554e-7e2c-46ba-907d-b1e2d79ccdbc"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-befc2d10-8aef-42e4-b8c5-ea1b38eb0ce4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-befc2d10-8aef-42e4-b8c5-ea1b38eb0ce4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-befc2d10-8aef-42e4-b8c5-ea1b38eb0ce4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-befc2d10-8aef-42e4-b8c5-ea1b38eb0ce4"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-9775f68c-646a-4051-9562-ccf026686878

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9775f68c-646a-4051-9562-ccf026686878
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9775f68c-646a-4051-9562-ccf026686878
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9775f68c-646a-4051-9562-ccf026686878"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-09b7992b-f343-4577-a31c-735574e31e73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09b7992b-f343-4577-a31c-735574e31e73
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09b7992b-f343-4577-a31c-735574e31e73
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-09b7992b-f343-4577-a31c-735574e31e73"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bd069ed-f59d-4926-a627-538a17c8cc8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bd069ed-f59d-4926-a627-538a17c8cc8b
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bd069ed-f59d-4926-a627-538a17c8cc8b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2bd069ed-f59d-4926-a627-538a17c8cc8b"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-83d0900f-7366-47d5-99e9-83b21d69e520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83d0900f-7366-47d5-99e9-83b21d69e520
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83d0900f-7366-47d5-99e9-83b21d69e520
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-83d0900f-7366-47d5-99e9-83b21d69e520"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-f66daa42-5c18-4fdd-b4c5-a562faa222a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f66daa42-5c18-4fdd-b4c5-a562faa222a9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f66daa42-5c18-4fdd-b4c5-a562faa222a9
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f66daa42-5c18-4fdd-b4c5-a562faa222a9"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-3bee4967-1f28-4446-b9a0-a6d9dc865eff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bee4967-1f28-4446-b9a0-a6d9dc865eff
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bee4967-1f28-4446-b9a0-a6d9dc865eff
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3bee4967-1f28-4446-b9a0-a6d9dc865eff"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-155447f9-9cc8-4630-986d-99c21d74ead8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-155447f9-9cc8-4630-986d-99c21d74ead8
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-155447f9-9cc8-4630-986d-99c21d74ead8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-155447f9-9cc8-4630-986d-99c21d74ead8"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc37ece9-347a-4f81-ba4d-0ef5552f4010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc37ece9-347a-4f81-ba4d-0ef5552f4010
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc37ece9-347a-4f81-ba4d-0ef5552f4010
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-fc37ece9-347a-4f81-ba4d-0ef5552f4010"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c60fa1a-e03f-409f-be78-570f32c1ff4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c60fa1a-e03f-409f-be78-570f32c1ff4d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c60fa1a-e03f-409f-be78-570f32c1ff4d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4c60fa1a-e03f-409f-be78-570f32c1ff4d"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-73b5c241-c924-4cf3-8a93-1f9926a3ae24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b5c241-c924-4cf3-8a93-1f9926a3ae24
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73b5c241-c924-4cf3-8a93-1f9926a3ae24
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-73b5c241-c924-4cf3-8a93-1f9926a3ae24"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-39b23c4c-2c8f-47e4-bf04-f20de055f4dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b23c4c-2c8f-47e4-bf04-f20de055f4dc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39b23c4c-2c8f-47e4-bf04-f20de055f4dc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-39b23c4c-2c8f-47e4-bf04-f20de055f4dc"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c327cbb-a72b-479d-9900-3ea33ff57a57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c327cbb-a72b-479d-9900-3ea33ff57a57
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c327cbb-a72b-479d-9900-3ea33ff57a57
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3c327cbb-a72b-479d-9900-3ea33ff57a57"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-b46278f8-5cee-48b9-97e5-f24ee1ac197f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b46278f8-5cee-48b9-97e5-f24ee1ac197f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b46278f8-5cee-48b9-97e5-f24ee1ac197f
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b46278f8-5cee-48b9-97e5-f24ee1ac197f"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf7c878d-1a10-456a-9fa4-118186255705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf7c878d-1a10-456a-9fa4-118186255705
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf7c878d-1a10-456a-9fa4-118186255705
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bf7c878d-1a10-456a-9fa4-118186255705"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-27b96efc-a4a5-44b7-910d-577bbbf13bf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27b96efc-a4a5-44b7-910d-577bbbf13bf4
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27b96efc-a4a5-44b7-910d-577bbbf13bf4
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-27b96efc-a4a5-44b7-910d-577bbbf13bf4"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-17e7789b-9c69-4b80-bcf7-20ee60d66d9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17e7789b-9c69-4b80-bcf7-20ee60d66d9f
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-17e7789b-9c69-4b80-bcf7-20ee60d66d9f
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

{"id":"acc_e23b9d1e-3840-4f00-9a09-5928a469f8ae","handle":"qa-d1c03dd76998","displayName":"QA d1c03dd76998","region":"eu","role":"user","createdAt":"2026-11-10T09:59:32.584361733Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d4d55af-9aac-4ce2-b578-a0dd3e4ee715

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d4d55af-9aac-4ce2-b578-a0dd3e4ee715
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d4d55af-9aac-4ce2-b578-a0dd3e4ee715
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
correlation: qa-7a34259f-709d-4b6f-b603-c7aa115ed291

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a34259f-709d-4b6f-b603-c7aa115ed291
Content-Type: application/json

--- request body ---
{"handle":"qa-d1c03dd76998","password":"****"}

--- response: 401 in 2 ms ---
Date: Tue, 10 Nov 2026 09:59:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a34259f-709d-4b6f-b603-c7aa115ed291
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a34259f-709d-4b6f-b603-c7aa115ed291"}
```
